package com.sbs.java.am;

public class Config {
	public static final String getDBUrl() {
		return "jdbc:mysql://localhost:3306/am?serverTimezone=Asia/Seoul&useOldAliasMetadataBehavior=true&zeroDateTimeBehavior=convertToNull";
	}
	public static final String getDBId() { 
		return "sbsst";
	}
	public static final String getDBPw() {
		return "sbs123414";
	}
	
	public static String getDBDriverClassName() {
		return "com.mysql.cj.jdbc.Driver";
	}
}