package com.drools.application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;

import com.unisys.drools.Message;

public class EbisDroolsMain {

	public static void main(String[] args) {
		String deploymentId = "LightsOfCheck_1.0.0";
		String user = "admin";
		String password = "admin";

		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(
				"http://localhost:19008/kie-server-7.5.0.Final-ee7/services/rest/server", "admin", "admin");
		Candidate candidate = new Candidate();
		candidate.setCandidateId("50005");
		candidate.setFingerScore(50);

		/*
		 * List<>
		 * 
		 * LORModel lormodel = new LORModel(); lormodel.setCandidate(candidate);
		 */

		Set<Class<?>> extraClassList = new HashSet<Class<?>>();
		extraClassList.add(Candidate.class);
		config.addExtraClasses(extraClassList);
		config.addJaxbClasses(extraClassList);

		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		ProcessServicesClient processServicesClient = client.getServicesClient(ProcessServicesClient.class);
		QueryServicesClient queryServicesClient = client.getServicesClient(QueryServicesClient.class);

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("candidate", candidate);
		variables.put("response", new Candidate());

		long i = processServicesClient.startProcess("LightsOfCheck_1.0.0", "LightsOfCheck.LightsCheck", variables);
		Object obj = queryServicesClient.findProcessInstanceById(i, true).getVariables();
		Map<String, Object> varibles2 = (Map<String, Object>) obj;

		System.out.println(i);
		// System.out.println(obj);
		System.out.println(varibles2);

	}
}
