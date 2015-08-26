package com.parallel.util;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;

public class spike {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		 DefaultExecutor executor = new DefaultExecutor();
		CommandLine command = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");

		command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js", false);
		command.addArgument("–address", false);
		command.addArgument("127.0.0.1");
		command.addArgument("–port", false);
		command.addArgument("6723");
		command.addArgument("–bootstrap-port", false);
		command.addArgument("6724");
		// command.addArgument(“–no-reset”, false);

		executor.execute(command, resultHandler);

		Thread.sleep(20000);


        }
	

}
