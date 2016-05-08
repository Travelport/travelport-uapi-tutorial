/**
 * 
 */
package com.travelport.tutorial.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.zip.GZIPInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import com.travelport.schema.system_v32_0.PingReq;
import com.travelport.schema.system_v32_0.PingRsp;

import static javax.xml.bind.JAXBContext.newInstance;

/**
 * Manages the transformation between a JAXB object and a SOAP message.
 *
 * @see com.travelport.uapi.sample.client.SaajSoapConnector for sending SOAP message
 */
public class JaxbHandler {

    /**
     * Transform a JAXB ping request object into a SOAP Message
     *
     * @param request the JAXB ping request
     * @return the SOAP message
     * @throws JAXBException
     * @throws SOAPException
     */
    public SOAPMessage encodeSOAPMessage(PingReq request) throws JAXBException, SOAPException {
        JAXBContext context = newInstance(PingReq.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Next, create the actual message
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage message = messageFactory.createMessage();

        marshaller.marshal(request, message.getSOAPBody());

        message.saveChanges();

        return message;
    }

    /**
     * Transform a SOAP message into a JAXB ping response object
     *
     * @param reply a SOAP message
     * @return a JAXB ping response object
     * @throws JAXBException
     * @throws SOAPException
     * @throws IOException 
     */
    public PingRsp decodeSOAPMessage(SOAPMessage reply) throws JAXBException, SOAPException, IOException {
        JAXBContext context = newInstance(PingRsp.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
			reply.writeTo(out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        byte[] barr = out.toByteArray();
        InputStream gzipStream = new GZIPInputStream(new ByteArrayInputStream(barr));
        Reader decoder = new InputStreamReader(gzipStream, "UTF-8");
        BufferedReader buffered = new BufferedReader(decoder);
        int n = 0;
        char[] cbuf = new char[1024];
        Writer w = new StringWriter();
        while ((n = buffered.read(cbuf)) != -1) {
            w.write(cbuf,0,n);
        }
        
        System.out.println(w.toString());
        
        InputStream is = new ByteArrayInputStream(w.toString().getBytes());
        SOAPMessage request = MessageFactory.newInstance().createMessage(null, is);
        
        PingRsp response = (PingRsp) unmarshaller.unmarshal(request.getSOAPBody().getFirstChild());
        return response;
    }
}

