package patterns.design.test.structural;

/**
 * 1. Used so that 2 unrelated interfaces can work together
 * 2. Example is mobile-adapter. Wall Volt 120V, mobile requires 3V
 * So, adapter acts as a mediator 
 */

class Volt {
	private int volts;

	public Volt(int volts) {
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
}

class Socket {
	public Volt socketVolt() {
		return new Volt(120);
	}
}

interface SocketAdapter {
	Volt fetch3Volts();

	Volt fetch12Volts();

	Volt fetch120Volts();
}

// Class Adapter
class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt fetch3Volts() {
		return new Volt(socketVolt().getVolts() / 40);
	}

	@Override
	public Volt fetch12Volts() {
		return new Volt(socketVolt().getVolts() / 10);
	}

	@Override
	public Volt fetch120Volts() {
		return new Volt(socketVolt().getVolts() / 1);
	}
}

// Object Adapter
class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket socket = new Socket();

	@Override
	public Volt fetch3Volts() {
		return new Volt(socket.socketVolt().getVolts() / 40);
	}

	@Override
	public Volt fetch12Volts() {
		return new Volt(socket.socketVolt().getVolts() / 10);
	}

	@Override
	public Volt fetch120Volts() {
		return new Volt(socket.socketVolt().getVolts() / 1);
	}
}

public class AdapterPattern {
	public static void testClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v3 = calculateVolt(socketAdapter, 3);
		Volt v12 = calculateVolt(socketAdapter, 12);
		Volt v120 = calculateVolt(socketAdapter, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
	}

	public static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = calculateVolt(socketAdapter, 3);
		Volt v12 = calculateVolt(socketAdapter, 12);
		Volt v120 = calculateVolt(socketAdapter, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
	}

	private static Volt calculateVolt(SocketAdapter socketAdapter, int i) {
		switch (i) {
		case 3:
			return socketAdapter.fetch3Volts();
		case 12:
			return socketAdapter.fetch12Volts();
		case 120:
			return socketAdapter.fetch120Volts();
		default:
			return socketAdapter.fetch120Volts();
		}
	}
}
