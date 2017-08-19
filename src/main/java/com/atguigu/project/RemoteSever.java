package com.atguigu.project;

public class RemoteSever {

	public static String severIP = "127.0.0.1";
	
	public static String severPort = "8081";
	
	public static String severPath = "mgt-restapi";
	
	public static String getRemoteSever() {
		
		String remoteSeverContextPath = "http://" + severIP + ":" + severPort + "/" + severPath;
		return remoteSeverContextPath;
	}
	
}
