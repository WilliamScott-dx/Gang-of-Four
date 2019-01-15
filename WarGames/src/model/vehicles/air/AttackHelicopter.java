package model.vehicles.air;

import app.Registrar;
import model.weaponry.GrenadeLauncher;
import model.weaponry.WeaponSystem;

public class AttackHelicopter extends CombatAircraft {

	public AttackHelicopter(Registrar registrar) {
		super(registrar);
	}

	@Override
	/**
	 * FactoryMethod() from the FactoryMethod() design pattern used in ConcreteCreator.
	 * Produces the Attack Helicopter's weapon system.
	 *
	 * @return WeaponSystem to be attached to the vehicle.
	 * #task1
	 */
	protected WeaponSystem makeVehicleWeapon() {
		return new GrenadeLauncher();
	}
}
