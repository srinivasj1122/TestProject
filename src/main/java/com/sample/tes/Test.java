/*package com.sample.tes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.kie.api.KieServices;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.RuleServicesClient;

public class Test {
	
	public static void main(String[] args) {
        try {
        
        String x = "http://127.0.0.1:8080/kie-server-7.14.0.Final-ee7/services/rest/server";
        

        
        KieServicesConfiguration config = KieServicesFactory.newRestConfiguration(x, "unisys", "unisys");
        
        Set<Class<?>> allClasses = new HashSet<Class<?>>();
        allClasses.add(QualityScore.class);
        config.addJaxbClasses(allClasses);

        KieServicesClient client = KieServicesFactory
                     .newKieServicesClient(config);
        RuleServicesClient ruleClient = client
                     .getServicesClient(RuleServicesClient.class);
        List<Command<?>> commands = new ArrayList<Command<?>>();

        FireAllRulesCommand fireAllRulesCommand = new FireAllRulesCommand();
        
        
        QualityScore qualityScore = new QualityScore();
        qualityScore.setMbssScore(101d);
        qualityScore.setSharpness(80d);
        qualityScore.setPoseAnglePitch(10d);
        qualityScore.setPoseAngleRoll(10d);
        qualityScore.setPoseAngleYaw(10d); 
        

        
        commands.add((Command<?>) KieServices.Factory.get().getCommands()
                     .newInsert(qualityScore, "QualityScore"));
        commands.add((Command<?>) KieServices.Factory
                     .get()
                     .getCommands()
                     .newAgendaGroupSetFocus("qualityScore")); 

        commands.add((Command<?>) KieServices.Factory.get().getCommands()
                     .newFireAllRules("fire-identifier"));

        BatchExecutionCommand batchCommand = KieServices.Factory.get()
                     .getCommands().newBatchExecution(commands);
        ServiceResponse<String> response = null;
        response = ruleClient.executeCommands(
                     "QualityScore_1.0.0", batchCommand);
        
        
        
        System.out.println(response.getResult());
        //LOGGER.debug("Exit configureServer Method DroolsPlugin");
        } catch (Exception e) {
               e.printStackTrace();
        }
 }

	

}
*/