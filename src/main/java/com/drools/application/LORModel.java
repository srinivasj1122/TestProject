package com.drools.application;

import java.io.Serializable;
import java.util.List;

public class LORModel implements Serializable {

	private static final long serialVersionUID = 4418199383122827862L;
	
	private List<Candidate> candidate;

	public List<Candidate> getCandidate() {
		return candidate;
	}

	public void setCandidate(List<Candidate> candidate) {
		this.candidate = candidate;
	}
	

}
