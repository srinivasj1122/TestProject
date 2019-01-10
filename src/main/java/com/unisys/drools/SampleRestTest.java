/*package com.unisys.drools;

public class SampleRestTest {

		private static final String BASE_URL = "http://localhost:8080/business-central/rest/";
		private static final String AUTH_URL = "http://localhost:8080/business-central/org.kie.workbench.KIEWebapp/j_security_check";
		private static final String DEPLOYMENT_ID = "SampleTestRule_1.0.0";
		private static final String PROCESS_DEF_ID = "SampleTestRule.Sample2";

		private static String username = "erics";
		private static String password = "bpmsuite";
		private static AuthenticationType type = AuthenticationType.FORM_BASED;
		public static void main(String[] args) {
			System.out.println("Starting process instance: " + DEPLOYMENT_ID);
	        System.out.println();
	        
	     // start a process instance with no variables.
	        startProcess();

	        System.out.println();
	     System.out.println("Completed process instance: " + DEPLOYMENT_ID);
	    }

	    *//**
	     * Start a process using the rest api start call, no map variables passed.
	     * 
	     * @throws Exception
	     *//*
	   public static void startProcess() throws Exception {
	        String newInstanceUrl = BASE_URL + "runtime/" + DEPLOYMENT_ID + "/process/" + PROCESS_DEF_ID + "/start";
	        String dataFromService = getDataFromService(newInstanceUrl, "POST");
	        System.out.println("newInstanceUrl:["+newInstanceUrl+"]");
	        System.out.println("--------");
	        System.out.println(dataFromService);
	        System.out.println("--------");
	    }

	}

}
*/