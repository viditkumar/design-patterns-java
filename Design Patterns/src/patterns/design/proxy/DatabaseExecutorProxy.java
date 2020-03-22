package patterns.design.proxy;

public class DatabaseExecutorProxy implements DatabaseExecutor {

	boolean isAdmin;
	DatabaseExecutorImpl dbexecutor;

	public DatabaseExecutorProxy(String username, String password) {
		if (username.equals("Admin") && password.equals("abc@123")) {
			isAdmin = true;
			dbexecutor = new DatabaseExecutorImpl();
		}
	}

	@Override
	public void executeQuery(String query) throws Exception {
		if (isAdmin) {
			dbexecutor.executeQuery(query);
		} else {
			if (query.equals("DELETE")) {
				throw new Exception("You are not Admin.");
			} else {
				dbexecutor.executeQuery(query);
			}
		}
	}
}
