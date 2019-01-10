package com.drools.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ObjectMapUtility {

	public LORModel converttoObject(Map<String, Map<String, String>> duplicateMap) {
		LORModel model = new LORModel();
		if (duplicateMap != null && !duplicateMap.isEmpty()) {
			Set<String> keySet = duplicateMap.keySet();
			Candidate candidate = new Candidate();
			ArrayList<Candidate> candidates = new ArrayList<Candidate>();
			for (String string : keySet) {
				candidate.setCandidateId(string);
				Map<String, String> map = duplicateMap.get(string);
				// ALL VALUES TO BE SET FROM MAP
				if (map.get("fingerScore") != null) {
					candidate.setFingerScore(Integer.valueOf(map.get("fingerScore")));
				}
				if (map.get("fusionScore") != null) {
					candidate.setFusionScore(Integer.valueOf(map.get("fusionScore")));
				}
				if (map.get("faceScore") != null) {
					candidate.setFaceScore(Integer.valueOf(map.get("faceScore")));
				}
				if (map.get("Rank") != null) {
					candidate.setRank(Integer.valueOf(map.get("Rank")));
				}
				if (map.get("minthresold") != null) {
					candidate.setMinThreshold(Integer.valueOf(map.get("minthresold")));
				}
				if (map.get("maxthresold") != null) {
					candidate.setMaxThreshold(Integer.valueOf(map.get("maxthresold")));
				}
				if (map.get("thresold") != null) {
					candidate.setThreshold(Integer.valueOf(map.get("thresold")));
				}
				// last line
				candidates.add(candidate);
			}
			model.setCandidate(candidates);	
			System.out.println(model.getCandidate().get(0));
			
		}

		return model;

	}

/*	public static void main(String[] args) {
		Map map = new HashMap<String, Map<String, String>>();
		Map map1 = new HashMap<String, String>();
		map1.put("fusionScore", "83705");
		map1.put("fingerScore", "83855");
		map1.put("faceScore", "7559");
		map1.put("Rank", "4");
		map1.put("minthresold", "65000");
		map1.put("maxthresold", "85000");
		map1.put("thresold", "75000");

		map.put("4006", map1);
		ObjectMapUtility objectMapUtility = new ObjectMapUtility();
		objectMapUtility.converttoObject(map);
	}*/
}
