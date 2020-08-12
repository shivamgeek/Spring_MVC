package com.shivam;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// This file is a replacement for web.xml where we mention servlet name and servlet-mapping
// In case of spring MVC we have only one servlet 'DispatcherServlet' provided by spring.

public class deployment_descriptor extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	// Config java file that will tell for what packages it should do component-scan 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {dispatcher_servlet_configuration.class};
	}

	
	//Mention the mappings that will use the above config classes
	@Override
	protected String[] getServletMappings() {
		String myMappings = "/";
		return new String[] {myMappings};
	}
 
}
