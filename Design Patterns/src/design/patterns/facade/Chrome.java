package design.patterns.facade;

import java.sql.Driver;

public class Chrome {

	public static Driver getChromeDriver() {
		return null;
	}

	public static void getHTMLReport(String report, Driver driver) {
		System.out.println(report + " for Chrome");
	}

	public static void getJUnitReport(String report, Driver driver) {
		System.out.println(report + " for Chrome");
	}
}
