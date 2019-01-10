package com.unisys.drools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.kie.api.KieServices;
import org.kie.api.command.BatchExecutionCommand;
import org.kie.api.command.Command;
import org.kie.api.runtime.ExecutionResults;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;

public class TestRule {

	public static void main(String[] args) {
		try {
			/*
			 * Message message = new Message();
			 * message.setMessage("Rule is fired \n Lights Out BR Execution Initiated");
			 * message.setStatus(Message.HELLO);
			 */

			// String x =
			// "http://129.221.14.240:19090/kie-server-7.5.0.Final-ee7/services/rest/server";

			String url = "http://localhost:19008/kie-server-7.5.0.Final-ee7/services/rest/server";

			// KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(x,
			// "unisys", "unisys");

			KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(url, "admin", "admin");

			Set<Class<?>> allClasses = new HashSet<Class<?>>();
			allClasses.add(Person.class);
			config.addJaxbClasses(allClasses);
			config.setMarshallingFormat(MarshallingFormat.JAXB);

			KieServicesClient client = KieServicesFactory.newKieServicesClient(config);
			RuleServicesClient ruleClient = client.getServicesClient(RuleServicesClient.class);
			List<Command<?>> commands = new ArrayList<Command<?>>();

			FireAllRulesCommand fireAllRulesCommand = new FireAllRulesCommand();

			Person p = new Person();
			p.setAge(25);
			p.setName("unisys");
			p.setSalary(4000);
			p.setQuality("mbs");

			commands.add((Command<?>) KieServices.Factory.get().getCommands().newInsert(p, "person"));
			/*
			 * commands.add((Command<?>)
			 * KieServices.Factory.get().getCommands().newAgendaGroupSetFocus("test"));
			 */
			commands.add((Command<?>) KieServices.Factory.get().getCommands().newFireAllRules("fire-identifier"));

			BatchExecutionCommand batchCommand = KieServices.Factory.get().getCommands().newBatchExecution(commands);
			ServiceResponse<ExecutionResults> response = null;
			response = ruleClient.executeCommandsWithResults("PersonApplication_1.0.1", batchCommand);
			Object responseObject = response.getResult().getValue("person");

			/*
			 * response = ruleClient.executeCommands("PersonApplication_1.0.1",
			 * batchCommand);
			 */
			Person p2 = (Person) responseObject;

			System.out.println(p2.getResult());

			// LOGGER.debug("Exit configureServer Method DroolsPlugin");
			/*
			 * Message message = new Message();
			 * message.setMessage("Rule is fired \n Lights Out BR Execution Initiated");
			 * message.setStatus(Message.HELLO); excuteProcess(message);
			 */

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/*
	 * public static void excuteProcess(Message message) { URL instanceUrl; try {
	 * instanceUrl = new URL(
	 * "http://localhost:19008/kie-server-7.5.0.Final-ee7/services/rest/server/containers/TestRule_1.0.0/processes"
	 * );
	 * 
	 * RuntimeEngine engine = RemoteRuntimeEngineFactory.newRestBuilder()
	 * .addUrl(instanceUrl) .addTimeout(5) .addDeploymentId("SampleTestRule_1.0.0")
	 * .addUserName("admin") .addPassword("admin") // if you're sending custom class
	 * parameters, make sure that // the remote client instance knows about them!
	 * .addExtraJaxbClasses(Message.class) .build();
	 */
	/*
	 * String deploymentId="SampleTestRule_1.0.0"; String user="admin"; String
	 * password="admin";
	 */
	/*
	 * RemoteRuntimeEngineFactory restSessionFactory
	 * 
	 * = new RemoteRestRuntimeFactory(deploymentId, instanceUrl, user, password);
	 */

	/*
	 * KieSession ksession = engine.getKieSession();
	 * 
	 * TaskService taskService = engine.getTaskService();
	 * 
	 * ProcessInstance processInstance
	 * 
	 * = ksession.startProcess("SampleTestRule.Sample2");
	 * 
	 * long procId = processInstance.getId();
	 * 
	 * System.out.println(procId);
	 * 
	 * System.out.println(engine.getKieSession().getFactCount());
	 * //engine.getTaskService().st\ } catch (MalformedURLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */

}
