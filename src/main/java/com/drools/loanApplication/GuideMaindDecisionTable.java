package com.drools.loanApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.drools.command.BatchExecutionCommand;
import org.drools.command.Command;
import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.kie.api.KieServices;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.kie.server.client.RuleServicesClient;

import com.drools.application.Candidate;
import com.unisys.drools.Person;

public class GuideMaindDecisionTable {

	public static void main(String[] args) {

		String deploymentId = "PersonApplication_1.0.0";
		String user = "admin";
		String password = "admin";

		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(
				"http://localhost:19008/kie-server-7.5.0.Final-ee7/services/rest/server", "admin", "admin");

		System.out.println(user + "----------" + password);

		Person p = new Person();
		p.setAge(25);
		p.setName("unisys");
		p.setSalary(6000);
		p.setQuality("mbss");

		/*
		 * List<>
		 * 
		 * LORModel lormodel = new LORModel(); lormodel.setCandidate(candidate);
		 */

		Set<Class<?>> extraClassList = new HashSet<Class<?>>();
		extraClassList.add(Person.class);
		config.addExtraClasses(extraClassList);
		config.addJaxbClasses(extraClassList);

		KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
		ProcessServicesClient processServicesClient = client.getServicesClient(ProcessServicesClient.class);
		QueryServicesClient queryServicesClient = client.getServicesClient(QueryServicesClient.class);

		RuleServicesClient ruleClient = client
                .getServicesClient(RuleServicesClient.class);

		
		
		List<Command<?>> commands = new ArrayList<Command<?>>();

        FireAllRulesCommand fireAllRulesCommand = new FireAllRulesCommand();
        
               

        
        commands.add((Command<?>) KieServices.Factory.get().getCommands()
                     .newInsert(p, "person"));
        commands.add((Command<?>) KieServices.Factory
                     .get()
                     .getCommands()
                     .newAgendaGroupSetFocus("test")); 

        commands.add((Command<?>) KieServices.Factory.get().getCommands()
                     .newFireAllRules("fire-identifier"));

        BatchExecutionCommand batchCommand = KieServices.Factory.get()
                     .getCommands().newBatchExecution(commands);
        ServiceResponse<String> response = null;
        response = ruleClient.executeCommands(
                     "PersonApplication_1.0.0", batchCommand);

		
		
	/*	Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("person", p);
		variables.put("response", new Person());*/

	/*	long i = processServicesClient.;
		Object obj = queryServicesClient.findProcessInstanceById(i, true).getVariables();
		Map<String, Object> varibles2 = (Map<String, Object>) obj;

		System.out.println(i);
		// System.out.println(obj);
		System.out.println(varibles2);*/

	}

}
