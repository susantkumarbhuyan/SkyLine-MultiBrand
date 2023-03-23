package com.skyline.config.environment;

import java.util.List;

import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public interface Environment {
	public List<ServerAddress> getMongoServerAddresses();

	public List<MongoCredential> getMongoCredentials();

	public String getDBName();

	public String getEmailUsername();

	public String getEmailPassword();
}
