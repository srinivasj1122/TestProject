package com.drools.xmlconvertion;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "execution-results")
public class ExecutionResults {

	private Results results;

	@XmlElement(name = "results")
	public Results getResults() {
		return results;
	}

	public void setResults(Results results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "ExecutionResults [results=" + results + "]";
	}
	
	

}
