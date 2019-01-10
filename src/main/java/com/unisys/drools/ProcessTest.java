package com.unisys.drools;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;
import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;

public class ProcessTest {

	public static void main(String[] args) {
		String deploymentId="SampleTestRule_1.0.0";
    	String user="admin";
    	String password="admin";
		
		
		KieServicesConfiguration config = KieServicesFactory.newRestConfiguration("http://localhost:19008/kie-server-7.5.0.Final-ee7/services/rest/server", "admin", "admin");
		Message message = new Message();
        message.setMessage("Rule is fired \n Lights Out BR Execution Initiated");
        message.setStatus(Message.HELLO);
		Set<Class<?>> extraClassList = new HashSet<Class<?>>();
		  extraClassList.add(Message.class);
		  config.addExtraClasses(extraClassList);
		  config.addJaxbClasses(extraClassList);

		  // ProcessServicesClient setup
		 KieServicesClient client = KieServicesFactory.newKieServicesClient(config);		 
		  ProcessServicesClient processServicesClient = client.getServicesClient(ProcessServicesClient.class);
		  QueryServicesClient   queryServicesClient = client.getServicesClient(QueryServicesClient.class);
				  
		 // processServicesClient.ge
		  // Create an instance of the custom class
		//  Obj obj = new Obj();
		 // obj.setOk("ok");

		  Map<String, Object> variables = new HashMap<String, Object>();
		  variables.put("message", message);


		  // Start the process with custom class
		  long i = processServicesClient.startProcess("SampleTestRule_1.0.0", "SampleTestRule.TestBPMN",variables);
		  Object obj = queryServicesClient.findProcessInstanceById(i,true).getVariables();
		  Map<String, Object> varibles2 = (Map<String, Object>) obj;
	//	  System.out.println(varibles2.get(message));
		  
		  System.out.println(i);
		  System.out.println(obj);
		  System.out.println(varibles2);

			  
		  
		  
	}
	

}
