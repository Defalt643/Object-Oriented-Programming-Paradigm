
public class Person implements Man,Warrior,Theif{
	@Override
	public void steal() {
		System.out.println("Steal");
	}
	@Override
	public void escape() {
		System.out.println("Escape");
	}
	@Override
	public void fight() {
		System.out.println("fight");
	}

	@Override
	public void protect() {
		System.out.println("Protect");
	}

	@Override
	public void doGood() {
		System.out.println("doGood");
	}

	@Override
	public void doBad() {
		System.out.println("doBad");
	}
}
