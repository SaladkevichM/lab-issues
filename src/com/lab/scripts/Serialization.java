package com.lab.scripts;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Serialization {

    public static void main(String[] args) throws JAXBException {
        
        Singleton singleton = new Singleton();
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Singleton.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(singleton, System.out);
    }

}
