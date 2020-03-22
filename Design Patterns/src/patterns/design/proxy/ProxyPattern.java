package patterns.design.proxy;

public class ProxyPattern {

	public static void main(String[] args) {

		// Non-Admin
		DatabaseExecutorProxy databaseExecutorProxy1 = new DatabaseExecutorProxy("Non-Admin", "abc@123");
		try {
			databaseExecutorProxy1.executeQuery("DELETE");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Admin
		DatabaseExecutorProxy databaseExecutorProxy2 = new DatabaseExecutorProxy("Admin", "abc@123");
		try {
			databaseExecutorProxy2.executeQuery("DELETE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
