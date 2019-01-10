package com.drools.xmlconvertion;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "value")
public class Value {

	private float mbssScore;

	private float nfiqScore;

	private float poseAnglePitch;

	private float poseAngleRoll;

	private float poseAngleYaw;

	private String result;

	private float sharpness;

	public Value() {

	}

	public Value(float mbssScore, float nfiqScore, float poseAnglePitch, float poseAngleRoll, float poseAngleYaw,
			String result, float sharpness) {
		super();
		this.mbssScore = mbssScore;
		this.nfiqScore = nfiqScore;
		this.poseAnglePitch = poseAnglePitch;
		this.poseAngleRoll = poseAngleRoll;
		this.poseAngleYaw = poseAngleYaw;
		this.result = result;
		this.sharpness = sharpness;
	}

	@XmlElement(name = "mbssScore")
	public float getMbssScore() {
		return mbssScore;
	}

	public void setMbssScore(float mbssScore) {
		this.mbssScore = mbssScore;
	}

	@XmlElement(name = "nfiqScore")
	public float getNfiqScore() {
		return nfiqScore;
	}

	public void setNfiqScore(float nfiqScore) {
		this.nfiqScore = nfiqScore;
	}

	@XmlElement(name = "poseAnglePitch")
	public float getPoseAnglePitch() {
		return poseAnglePitch;
	}

	public void setPoseAnglePitch(float poseAnglePitch) {
		this.poseAnglePitch = poseAnglePitch;
	}

	@XmlElement(name = "poseAngleRoll")
	public float getPoseAngleRoll() {
		return poseAngleRoll;
	}

	public void setPoseAngleRoll(float poseAngleRoll) {
		this.poseAngleRoll = poseAngleRoll;
	}

	@XmlElement(name = "poseAngleYaw")
	public float getPoseAngleYaw() {
		return poseAngleYaw;
	}

	public void setPoseAngleYaw(float poseAngleYaw) {
		this.poseAngleYaw = poseAngleYaw;
	}

	@XmlElement(name = "result")
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@XmlElement(name = "sharpness")
	public float getSharpness() {
		return sharpness;
	}

	public void setSharpness(float sharpness) {
		this.sharpness = sharpness;
	}

	@Override
	public String toString() {
		return "Value [mbssScore=" + mbssScore + ", nfiqScore=" + nfiqScore + ", poseAnglePitch=" + poseAnglePitch
				+ ", poseAngleRoll=" + poseAngleRoll + ", poseAngleYaw=" + poseAngleYaw + ", result=" + result
				+ ", sharpness=" + sharpness + "]";
	}

}
