package model.weaponry;

public abstract class WeaponSystem {

	private Boolean loaded;

	public WeaponSystem() {
		loaded = false;
	}

	public void load() {
		loaded = true;
	}

	public void fire(String location) {
		loaded = false;
	}

	public Boolean isLoaded() {
		return new Boolean(loaded);
	}
}
