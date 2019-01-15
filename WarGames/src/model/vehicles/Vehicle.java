package model.vehicles;

import app.CommandCentre;
import app.Registrar;
import model.vehicles.unit.VehicleComponent;
import model.weaponry.*;

public abstract class Vehicle extends VehicleComponent {
	private Integer id;
	private WeaponSystem weapon;

	public Vehicle(Registrar registrar) {
		this.id = registrar.issueId(this);
		setWeapon();
	}

	protected Integer getId() {
		return id;
	}

	public void attack(CommandCentre commandCentre) {
		String location = commandCentre.getLocation();
		if (!location.equals(null)) {
			moveToLocation(location);
			fight(location);
			completeAttack();
		}
	}

	public abstract void moveToLocation(String location);

	/**
	 * FactoryMethod() for children class (ConcreteCreator) to implement for use within the
	 * 'Factory Method' design pattern. Returned WeaponSystem is used in setWeapon() to attach the
	 * vehicle.
	 *
	 * @return WeaponSystem to be attached to the vehicle.
	 * #task1
     */
	protected abstract WeaponSystem makeVehicleWeapon();

	protected void fight(String location) {
		weapon.load();
		if (weapon.isLoaded())
			weapon.fire(location);
	}

	protected abstract void completeAttack();

	/**
	 * "doSomething()" method from the Factor Method design pattern. Assigns the product, in this case a weapon
	 * system by calling the factoryMethod() (makeVehicleWeapon() above) which must be implemented by concrete child
	 * classes; which will return their desired concrete product.
	 *
	 * Sets the vehicles weapon type.
	 *
	 * #task1
	 */
	protected void setWeapon() {
		this.weapon = makeVehicleWeapon();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + id.toString();
	}
}
