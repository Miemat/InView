package com.example.InView.service;

import com.example.InView.model.xml.Atrybuty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@RestController
public class Service {

    @Value("${xml.conffile}")
    String confXml;

    @RequestMapping("/switchConfiguration")
    public String switchConfiguration(){

        File xmlFile = new File(confXml);
        xmlFile.exists();
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Atrybuty.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Atrybuty employee = (Atrybuty) jaxbUnmarshaller.unmarshal(xmlFile);

            System.out.println(employee);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }


        return "test1";
    }

    @RequestMapping("/sortText")
    public String sortText(){

        return "test2";
    }

}
