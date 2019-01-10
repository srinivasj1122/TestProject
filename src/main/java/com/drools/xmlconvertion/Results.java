package com.drools.xmlconvertion;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "results")
public class Results {

//	@XmlElement(name = "item")
	private List<Item> items;
	
	

	@XmlElement(name = "item")
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Results [items=" + items + "]";
	}
	
	

}
