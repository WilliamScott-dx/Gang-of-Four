package model.vehicles.sea;

import app.Registrar;
import model.vehicles.Vehicle;

public abstract class NavalVessel extends Vehicle {

	private Boolean movedToLocation;

	public NavalVessel(Registrar registrar) {
		super(registrar);
		movedToLocation = false;
	}

	@Override
	public void moveToLocation(String location) {
		if (location.toLowerCase().contains("coast")) {
			movedToLocation = true;
			System.out.println(this.getClass().getSimpleName() + " " + getId() + " is sailing to " + location);
		}

	}

	@Override
	protected void fight(String location) {
		if (movedToLocation) {
			System.out.println(this.getClass().getSimpleName() + " " + getId() + " is anchoring near " + location
					+ " and getting ready to fight.");
			super.fight(location);
		}
	}

	@Override
	protected void completeAttack() {
		if (movedToLocation) {
			System.out.println(this.getClass().getSimpleName() + " " + getId() + " is sailing back to base");
			movedToLocation = false;
		}
	}

}
