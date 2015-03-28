package com.jmxExample;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

import com.sun.jdmk.comm.AuthInfo;
import com.sun.jdmk.comm.HtmlAdaptorServer;

public class StackAgent {
	public static void main(String[] args) throws Exception {
		ObjectName name = new ObjectName("Pqr:abc=xyz");
		ObjectName name2 = new ObjectName("Pqr:abc=ijk");
		MBeanServer server = MBeanServerFactory.createMBeanServer();
		server.createMBean("com.jmxExample.Stack", name);
		server.createMBean("com.jmxExample.Dog", name2);
		HtmlAdaptorServer htmlServer = new HtmlAdaptorServer(9000);
		htmlServer.addUserAuthenticationInfo(new AuthInfo("tamajit", "admin"));
		server.registerMBean(htmlServer, new ObjectName("Adaptor:name=html"));
		htmlServer.start();
		System.out.println("now hit localhost:9000 and authenticate yourself");
		Thread.sleep(30000);
		// stops server after 30 sec.If you dont stop it will run for ever
		htmlServer.stop();
	}
}
