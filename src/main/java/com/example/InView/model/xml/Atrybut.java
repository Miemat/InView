package com.example.InView.model.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Atrybut")
public class Atrybut {
    @XmlAttribute(name = "Klucz")
    public String Klucz;
    @XmlAttribute(name = "Wartosc")
    public String Wartosc;
//    @XmlElement(name = "description")
    public String text;
}
