package patterns.design.facade;

import java.sql.Driver;

public class WebExplorerHelperFacade {

	public static void generateReports(String browser, String report, String test) {

		Driver driver = null;
		if (browser.equals("chrome")) {
			driver = Chrome.getChromeDriver();
			if (report.equals("html"))
				Chrome.getHTMLReport(report, driver);
			if (report.equals("junit"))
				Chrome.getJUnitReport(report, driver);
		} else {
			driver = Firefox.getFirefoxDriver();
			if (report.equals("html"))
				Firefox.getHTMLReport(report, driver);
			if (report.equals("junit"))
				Firefox.getJUnitReport(report, driver);
		}
	}
}
