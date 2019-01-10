package com.drools.application;

import java.io.Serializable;
import java.util.Date;

public class Candidate implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private int minThreshold;
	
	private int maxThreshold;
	
	private int threshold;
	
	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	private Date DOB;
	
	private String candidateId;
	
	private int fusionScore;
	
	private int fingerScore;
	
	private int faceScore;
	
	private int rank;
	
	private boolean isMatch = false;
	
	//private String 

	public int getMinThreshold() {
		return minThreshold;
	}

	public void setMinThreshold(int minThreshold) {
		this.minThreshold = minThreshold;
	}

	public int getMaxThreshold() {
		return maxThreshold;
	}

	public void setMaxThreshold(int maxThreshold) {
		this.maxThreshold = maxThreshold;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public int getThreshold() {
		return threshold;
	}

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public int getFusionScore() {
		return fusionScore;
	}

	public void setFusionScore(int fusionScore) {
		this.fusionScore = fusionScore;
	}

	public int getFingerScore() {
		return fingerScore;
	}

	public void setFingerScore(int fingerScore) {
		this.fingerScore = fingerScore;
	}

	public int getFaceScore() {
		return faceScore;
	}

	public void setFaceScore(int faceScore) {
		this.faceScore = faceScore;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean isMatch() {
		return isMatch;
	}

	public void setMatch(boolean isMatch) {
		this.isMatch = isMatch;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidate [minThreshold=");
		builder.append(minThreshold);
		builder.append(", maxThreshold=");
		builder.append(maxThreshold);
		builder.append(", threshold=");
		builder.append(threshold);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", DOB=");
		builder.append(DOB);
		builder.append(", candidateId=");
		builder.append(candidateId);
		builder.append(", fusionScore=");
		builder.append(fusionScore);
		builder.append(", fingerScore=");
		builder.append(fingerScore);
		builder.append(", faceScore=");
		builder.append(faceScore);
		builder.append(", rank=");
		builder.append(rank);
		builder.append(", isMatch=");
		builder.append(isMatch);
		builder.append("]");
		return builder.toString();
	}


}
