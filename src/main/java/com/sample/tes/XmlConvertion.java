package com.sample.tes;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class XmlConvertion {

	public static void main(String[] args) {

		final String xmlFilePath = "C:\\Users\\JSriniva\\Desktop\\Results.xml";

		try {

			File xmlFile = new File(xmlFilePath);
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document doc = documentBuilder.parse(xmlFile);
			NodeList nodeList = doc.getElementsByTagName("value");
			Map<Object, Object> xmlValues = new HashMap();
			for (int i = 0; i < nodeList.getLength(); i++) {
				NodeList childList = nodeList.item(i).getChildNodes();
				for (int j = 0; j < childList.getLength(); j++) {
					Node node = childList.item(j);
					if (node.getNodeType() == Node.ELEMENT_NODE) {    
						Element element = (Element) node;
						String text = element.getTextContent();
						xmlValues.put(element.getNodeName(), element.getTextContent());
					}
				}
			}

			for (Map.Entry<Object, Object> entry : xmlValues.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
