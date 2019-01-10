package com.unisys.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.unisys.leida.framework.sharedobjects.client.vo.Application;
import com.unisys.leida.framework.sharedobjects.client.vo.Person;

/**
 * This is a sample file to launch a process.
 */
public class DroolsRuleFlow {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-process");
			/*
			 * Message message = new Message();
			 * message.setMessage("Rule is fired \n Lights Out BR Execution Initiated");
			 * message.setStatus(Message.HELLO); kSession.insert(message);
			 */
			Application application = new Application();
			
			/*
			 * application.
			 * setApplication("Rule is fired \n Lights Out BR Execution Initiated");
			 * application.setStatus(application.HELLO);
			 */
			Person personOne = new Person();
			personOne.setFirstName("ABC");
			personOne.setGender(0);
			application.setPerson(personOne);
			System.out.println(application.getPerson().getLastName());
			boolean flag = false;
			kSession.insert(application);
			kSession.insert(flag);
			// start a new process instance
			kSession.startProcess("com.unisys.drools", null);
			kSession.fireAllRules();
			System.out.println(application.getPerson().getLastName());
			System.out.println(flag);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
