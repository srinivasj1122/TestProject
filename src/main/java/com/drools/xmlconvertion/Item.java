package com.drools.xmlconvertion;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Item {

	
	private Value value;

	public Item() {

	}

	public Item(Value value) {
		super();
		this.value = value;
	}

	@XmlElement(name = "value")
	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Item [value=" + value + "]";
	}
	
	

}
