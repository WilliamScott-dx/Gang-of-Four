package model.vehicles.ground;

import app.Registrar;
import model.weaponry.MachineGun;
import model.weaponry.WeaponSystem;

public class InfantryMobilityVehicle extends ArmouredPersonnelCarrier {

	public InfantryMobilityVehicle(Registrar registrar) {
		super(registrar);
	}

	@Override
	public void moveToLocation(String location) {
		System.out.println(this.getClass().getSimpleName() + " " + getId() + " is en route to " + location);
	}

	@Override
	protected void fight(String location) {
		System.out.println(this.getClass().getSimpleName() + " " + getId() + " is stopping in sight of " + location
				+ " and getting ready to fight");
		super.fight(location);
	}

	/**
	 * FactoryMethod() from the FactoryMethod() design pattern used in ConcreteCreator.
	 *
	 * @return WeaponSystem to be attached to the vehicle.
	 * #task1
	 */
	@Override
	protected WeaponSystem makeVehicleWeapon() {
		return new MachineGun();
	}
}
