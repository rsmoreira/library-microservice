package com.rsmoreira.microservices;

import com.rsmoreira.microservices.library.LibraryServer;
import com.rsmoreira.microservices.registration.RegistrationServer;

public class Main {
	public static void main(String[] args) {

		String serverName = "NO-VALUE";

		switch (args.length) {
		case 2:
			System.setProperty("server.port", args[1]);
		case 1:
			serverName = args[0].toLowerCase();
			break;

		default:
			usage();
			return;
		}

		if (serverName.equals("registration") || serverName.equals("reg")) {
			RegistrationServer.main(args);
		} else if (serverName.equals("library") || serverName.equals("lib")) {
			LibraryServer.main(args);
		} else {
			System.out.println("Unknown server type: " + serverName);
			usage();
		}
	}

	protected static void usage() {
		System.out.println("Usage: java -jar ... <server-name> [server-port]");
		System.out.println(
				// " where server-name is 'reg', 'registration', " + "'accounts'
				// or 'web' and server-port > 1024");
				"     where server-name is ('reg', 'registration') or ('lib', 'library') and server-port > 1024");
	}

}
