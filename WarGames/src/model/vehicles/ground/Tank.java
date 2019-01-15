package model.vehicles.ground;

import app.Registrar;
import model.weaponry.Cannon;
import model.weaponry.WeaponSystem;

public class Tank extends ArmouredPersonnelCarrier {

	public Tank(Registrar registrar) {
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
		return new Cannon();
	}
}
