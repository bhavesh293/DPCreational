package com.company.project.chainofresponsibility;

public abstract class AbstractLogger {
	public static int INFO = 1; // will be logged into standard console
	public static int DEBUG = 2;// will be logged into standard console and File logger
	public static int ERROR = 3;// will be logged into Standard console, File logger and Error Console

	protected int level;

	// next element in chain or responsibility
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) { // for last logger - there is no next logger so its null.
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);

}
