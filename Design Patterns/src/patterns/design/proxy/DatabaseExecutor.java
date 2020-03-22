package patterns.design.proxy;

public interface DatabaseExecutor {

	public void executeQuery(String query) throws Exception;
}
