package com.example.InView.model.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ATRYBUTY")
public class Atrybuty {

    @XmlElement(name = "Atrybut")
    public List<Atrybut> Atrybut;
}
