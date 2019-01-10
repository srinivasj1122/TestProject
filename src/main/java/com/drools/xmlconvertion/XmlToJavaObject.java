package com.drools.xmlconvertion;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaObject {

	public static void main(String[] args) throws JAXBException {

		ExecutionResults executionResults;
		final String xmlFilePath = "C:\\Users\\JSriniva\\Desktop\\Results.xml";
		File file = new File(xmlFilePath);
		JAXBContext jaxbContext = JAXBContext.newInstance(ExecutionResults.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		executionResults = (ExecutionResults) unmarshaller.unmarshal(file);
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getMbssScore());
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getNfiqScore());
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getPoseAnglePitch());
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getPoseAngleRoll());
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getPoseAngleYaw());
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getResult());
		System.out.println(executionResults.getResults().getItems().get(0).getValue().getSharpness());

		Map<Object,Object>  xmlMap=new HashMap<Object, Object>();

	}

}
