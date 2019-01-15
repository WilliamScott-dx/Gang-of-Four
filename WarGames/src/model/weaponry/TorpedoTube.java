package model.weaponry;

public class TorpedoTube extends WeaponSystem {

	@Override
	public void load() {
		System.out.println("\t" + this.getClass().getSimpleName() + ": loading a torpedo");
		super.load();
	}

	@Override
	public void fire(String location) {
		System.out.println("\t" + this.getClass().getSimpleName() + ": firing torpedoes at " + location + "!");
	}

}
