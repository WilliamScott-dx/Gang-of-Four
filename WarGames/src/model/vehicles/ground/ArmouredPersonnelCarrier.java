package model.vehicles.ground;

import app.Registrar;
import model.vehicles.Armour.ArmourComponent;
import model.vehicles.Armour.ArmourGroup;
import model.vehicles.Vehicle;

public abstract class ArmouredPersonnelCarrier extends Vehicle {

	public ArmouredPersonnelCarrier(Registrar registrar) {
		super(registrar);
	}
	// Contains armour objects allowing for "Super" APCs fitted with armour for extra protection #task6
	private ArmourGroup attachedArmour = new ArmourGroup("All attached armour");

	@Override
	public void moveToLocation(String location) {
		System.out.println(this.getClass().getSimpleName() + " " + getId() + " is advancing to " + location);
	}

	@Override
	protected void fight(String location) {
		System.out.println(this.getClass().getSimpleName() + " " + getId() + " is drawing near to " + location
				+ " and preparing to fight");
		super.fight(location);
	}

	@Override
	protected void completeAttack() {
		System.out.println(this.getClass().getSimpleName() + " " + getId() + " is heading back to base");
	}

	/**
	 * Attaches armour to the APC.
	 *
	 * @param armour An armour component to be added to the Armoured Personnel Carrier.
	 * #task6
     */
	public void attachArmour(ArmourComponent armour) {
		attachedArmour.add(armour);
	}

	/**
	 * Calls defend on all armour attached to the vehicle
	 *
	 * #task6
	 */
	public void defend() {
		attachedArmour.defend();
	}

}