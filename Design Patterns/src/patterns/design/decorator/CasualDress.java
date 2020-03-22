package patterns.design.decorator;

public class CasualDress  extends DressDecorator {
	public CasualDress(Dress dress) {
		super(dress);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Adding Casual Dress");
	}
}
