package com.skyline.config.environment;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class QAEnvironment implements Environment {
	private static final String MONGODB_HOST = "172.31.10.8";
	private static final int MONGODB_PORT = 27017;
	private static final String MONGO_SERVER_USERNAME = "mongoAdmin";
	private static final String MONGO_SERVER_PASSWORD = "i84LLk4hJ44bnnz";
	private static final String MONGODB_DATABASE = "SkyLineDB";
	private static final String EMAIL_USERNAME = "noreply@my3c.co";
	private static final String EMAIL_PASSWORD = "hsmy3cnoreply#1";

	public List<ServerAddress> getMongoServerAddresses() {
		List<ServerAddress> serverAddressList = new ArrayList<>();
		serverAddressList.add(new ServerAddress(MONGODB_HOST, MONGODB_PORT));
		return serverAddressList;
	}

	public List<MongoCredential> getMongoCredentials() {
		List<MongoCredential> credentials = new ArrayList<>();
		String userName = MONGO_SERVER_USERNAME;
		String password = MONGO_SERVER_PASSWORD;
		if (userName != null && password != null) {
			credentials.add(MongoCredential.createCredential(userName, "admin", password.toCharArray()));
		}
		return credentials;
	}

	public String getDBName() {
		return MONGODB_DATABASE;
	}

	@Override
	public String getEmailUsername() {
		return EMAIL_USERNAME;
	}

	@Override
	public String getEmailPassword() {
		return EMAIL_PASSWORD;
	}
}
