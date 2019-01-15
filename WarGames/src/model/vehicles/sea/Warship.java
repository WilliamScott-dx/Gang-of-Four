package model.vehicles.sea;

import app.Registrar;
import model.weaponry.RocketLauncher;
import model.weaponry.WeaponSystem;

public class Warship extends NavalVessel {

	public Warship(Registrar registrar) {
		super(registrar);
	}

	@Override
	/**
	 * FactoryMethod() from the FactoryMethod() design pattern used in ConcreteCreator.
	 *
	 * @return WeaponSystem to be attached to the vehicle.
	 * #task1
	 */
	protected WeaponSystem makeVehicleWeapon() {
		return new RocketLauncher();
	}
}
