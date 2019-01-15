package model.weaponry;

public class MachineGun extends WeaponSystem {

	@Override
	public void load() {
		System.out.println("\t" + this.getClass().getSimpleName() + ": loading a long ammunition belt");
		super.load();
	}

	@Override
	public void fire(String location) {
		System.out.println("\t" + this.getClass().getSimpleName() + ": firing bullets at " + location + "!");
	}
}
