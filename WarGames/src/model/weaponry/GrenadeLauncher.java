package model.weaponry;

public class GrenadeLauncher extends WeaponSystem {

	@Override
	public void load() {
		System.out.println("\t" + this.getClass().getSimpleName() + ": loading grenades");
		super.load();
	}

	@Override
	public void fire(String location) {
		System.out.println("\t" + this.getClass().getSimpleName() + ": firing grenades at " + location + "!");
	}

}
