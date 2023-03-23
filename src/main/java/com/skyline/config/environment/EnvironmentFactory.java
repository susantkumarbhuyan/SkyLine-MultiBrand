package com.skyline.config.environment;

public class EnvironmentFactory {
	public static final String DEV_ENVIRONMENT = "DEV";
	public static final String QA_ENVIRONMENT = "QA";
	private static final String ENVIRONMENT = DEV_ENVIRONMENT;

	public static String environmentName = ENVIRONMENT;
	private static Environment environment;

	private EnvironmentFactory() {

	}

	public static synchronized Environment getInstance() {
		if (environment == null) {
			if (environmentName.equals(QA_ENVIRONMENT)) {
				environment = new QAEnvironment();
			} else {
				environment = new DevelopmentEnvironment();
			}
		}
		return environment;
	}
}
