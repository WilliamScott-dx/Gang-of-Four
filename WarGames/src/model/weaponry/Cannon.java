package model.weaponry;

public class Cannon extends WeaponSystem {

	@Override
	public void load() {
		System.out.println("\t" + this.getClass().getSimpleName() + ": loading projectile");
		super.load();
	}

	@Override
	public void fire(String location) {
		System.out.println("\t" + this.getClass().getSimpleName() + ": firing projectile at " + location + "!");
	}
}
