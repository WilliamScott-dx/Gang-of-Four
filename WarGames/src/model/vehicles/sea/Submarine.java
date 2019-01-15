package model.vehicles.sea;

import app.Registrar;
import model.weaponry.TorpedoTube;
import model.weaponry.WeaponSystem;

public class Submarine extends NavalVessel {

	public Submarine(Registrar registrar) {
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
		return new TorpedoTube();
	}
}
