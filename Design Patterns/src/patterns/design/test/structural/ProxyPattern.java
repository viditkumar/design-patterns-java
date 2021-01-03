package patterns.design.test.structural;

/**
 * 1. Used to control access
 * 2. Used to provide wrapper implementation for better performance
 */

interface CommandExecutor{
	void runCommand(String cmd);
}

class CommandExecutorImpl implements CommandExecutor{

	@Override
	public void runCommand(String cmd) {
		System.out.println("Executing Command!");
	}
}

class CommandExecutorProxy implements CommandExecutor{

	boolean isAdmin;
	CommandExecutor commandExecutor;
	
	public CommandExecutorProxy(String user, String pwd) throws Exception{
		if(user.equals("user1") && pwd.equals("pwd123"))
			commandExecutor = new CommandExecutorImpl();
		else
			throw new Exception("Only Admin allowed!");
	}
	
	@Override
	public void runCommand(String cmd) {
		commandExecutor.runCommand(cmd);
	}
}
public class ProxyPattern {
	public static void testProxyPattern(){
		try {
			CommandExecutorProxy commandExecutorProxy = new CommandExecutorProxy("user1", "pwd123");
			commandExecutorProxy.runCommand("Command1");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
