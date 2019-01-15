package model.weaponry;

public class RocketLauncher extends WeaponSystem {

	@Override
	public void load() {
		System.out.println("\t" + this.getClass().getSimpleName() + ": loading rockets");
		super.load();
	}

	@Override
	public void fire(String location) {
		System.out.println("\t" + this.getClass().getSimpleName() + ": firing unguided rockets at " + location + "!");
	}

}
