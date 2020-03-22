package patterns.design.facade;

import java.sql.Driver;

public class Firefox {

	public static Driver getFirefoxDriver() {
		return null;
	}

	public static void getHTMLReport(String report, Driver driver) {
		System.out.println(report + " for Firefox");
	}

	public static void getJUnitReport(String report, Driver driver) {
		System.out.println(report + " for Firefox");
	}
}
