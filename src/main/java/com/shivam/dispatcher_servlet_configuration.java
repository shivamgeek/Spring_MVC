package com.shivam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// This file is used as a replacement for <dispatcherServlet-name>-servlet.xml file which tells for what package compnent-scan has to be done.
@Configuration
@ComponentScan({"com.shivam"})
public class dispatcher_servlet_configuration {

}
