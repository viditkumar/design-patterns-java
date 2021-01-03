package patterns.design.hf.factory;

public class Pizza{
	String name;
	String dough;
	String sauce;

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Added sauce " + sauce);
    }

    public void cut(){
        System.out.println("Cutting Pizza");
    }

    public void box(){
        System.out.println("Packing into box");
    }
    
	public String getName() {
		return name;
	}
}