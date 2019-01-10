/*package com.unisys.leida.ebis.sharedobjects.server.fact;

import java.io.Serializable;


@javax.persistence.Entity
public class QualityScore implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "QUALITYSCORE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "QUALITYSCORE_ID_GENERATOR", sequenceName = "QUALITYSCORE_ID_SEQ")
	private java.lang.Long id;

	private double poseAngleYaw;

	private double poseAnglePitch;

	private double poseAngleRoll;

	private java.lang.Double sharpness;

	private double mbssScore;

	private double nfiqScore;

	public QualityScore() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public double getPoseAngleYaw() {
		return this.poseAngleYaw;
	}

	public void setPoseAngleYaw(double poseAngleYaw) {
		this.poseAngleYaw = poseAngleYaw;
	}

	public double getPoseAnglePitch() {
		return this.poseAnglePitch;
	}

	public void setPoseAnglePitch(double poseAnglePitch) {
		this.poseAnglePitch = poseAnglePitch;
	}

	public double getPoseAngleRoll() {
		return this.poseAngleRoll;
	}

	public void setPoseAngleRoll(double poseAngleRoll) {
		this.poseAngleRoll = poseAngleRoll;
	}

	public java.lang.Double getSharpness() {
		return this.sharpness;
	}

	public void setSharpness(java.lang.Double sharpness) {
		this.sharpness = sharpness;
	}

	public double getMbssScore() {
		return this.mbssScore;
	}

	public void setMbssScore(double mbssScore) {
		this.mbssScore = mbssScore;
	}

	public double getNfiqScore() {
		return this.nfiqScore;
	}

	public void setNfiqScore(double nfiqScore) {
		this.nfiqScore = nfiqScore;
	}

	public QualityScore(java.lang.Long id, double poseAngleYaw,
			double poseAnglePitch, double poseAngleRoll,
			java.lang.Double sharpness, double mbssScore, double nfiqScore) {
		this.id = id;
		this.poseAngleYaw = poseAngleYaw;
		this.poseAnglePitch = poseAnglePitch;
		this.poseAngleRoll = poseAngleRoll;
		this.sharpness = sharpness;
		this.mbssScore = mbssScore;
		this.nfiqScore = nfiqScore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QualityScore [poseAngleYaw=");
		builder.append(poseAngleYaw);
		builder.append(", poseAnglePitch=");
		builder.append(poseAnglePitch);
		builder.append(", angleRoll=");
		builder.append(poseAngleRoll);
		builder.append(", sharpness=");
		builder.append(sharpness);
		builder.append(", mbssScore=");
		builder.append(mbssScore);
		builder.append(", nfiqScore=");
		builder.append(nfiqScore);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}	*/