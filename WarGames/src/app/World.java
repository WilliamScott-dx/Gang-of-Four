package app;

import model.vehicles.*;
import model.vehicles.Armour.ArmourBulletproofGlass;
import model.vehicles.Armour.ArmourComponent;
import model.vehicles.Armour.ArmourGroup;
import model.vehicles.Armour.ArmourPlate;
import model.vehicles.air.*;
import model.vehicles.ground.*;
import model.vehicles.sea.*;
import model.vehicles.unit.VehicleUnit;

public class World {

	private CommandCentre commandCentre;
	private Registrar registrar;
	private String location;

	public World() {
		// Changed to getInstance() for use of Singleton design pattern implemented in #task4
		this.commandCentre = CommandCentre.getInstance();
		registrar = new Registrar();
	}

	private void createSquadron() {
		Vehicle chopperAlpha = new AttackHelicopter(registrar);
		this.commandCentre.attachToSquadron(chopperAlpha);
		Vehicle jetAlpha = new FighterJet(registrar);
		commandCentre.attachToSquadron(jetAlpha);
		Vehicle jetBravo = new FighterJet(registrar);
		commandCentre.attachToSquadron(jetBravo);
		Vehicle tankAlpha = new Tank(registrar);
		commandCentre.attachToSquadron(tankAlpha);
		Vehicle tankBravo = new Tank(registrar);
		commandCentre.attachToSquadron(tankBravo);
		Vehicle warshipAlpha = new Warship(registrar);
		commandCentre.attachToSquadron(warshipAlpha);
	}

	public static void main(String[] args) {
		World world = new World();
		world.createSquadron();
		world.location = "IngleWhite";
		world.commandCentre.setLocation(world.location);
		world.commandCentre.goToWar();

		// Functions to check for correct operation of the program
		world.taskOne(); // #task1
		world.taskFour(); // #task4
		world.taskFive(); // #task5
		world.taskSix(); // #task6
	}

	/**
	 * Statements to play with changes from Task 1.
	 *
	 * #task1
	 */
	private void taskOne() {
		Vehicle taskOneTank = new Tank(registrar);
		System.out.println("Task One Tank Attacking: Check Weapon is Equipped and Working Below");
		taskOneTank.attack(commandCentre);
	}

	/**
	 * Statements to play with changes from Task 4.
	 *
	 * #task4
	 */
	private void taskFour() {
		// Below line should not compile when uncommented due to use of singleton design pattern
		// CommandCentre testCentre = new CommandCentre();
	}

	/**
	 * Statements to play with changes from Task 5.
	 *
	 * #task5
	 */
	private void taskFive() {
		Vehicle taskFiveTankA = new Tank(registrar);
		Vehicle taskFiveTankB = new Tank(registrar);
		Vehicle taskFiveIMV= new InfantryMobilityVehicle(registrar);
		Vehicle taskFiveWarship = new Warship(registrar);
		Vehicle taskFiveFighterJet = new FighterJet(registrar);

		VehicleUnit allVehiclesUnit = new VehicleUnit("All Vehicles");
		VehicleUnit landVehiclesUnit = new VehicleUnit("Land Vehicles");
		VehicleUnit seaVehiclesUnit = new VehicleUnit("Sea Vehicles");
		VehicleUnit airVehiclesUnit = new VehicleUnit("Air Vehicles");
		VehicleUnit tankUnit = new VehicleUnit("Air Vehicles");

		allVehiclesUnit.add(landVehiclesUnit);
		allVehiclesUnit.add(seaVehiclesUnit);
		allVehiclesUnit.add(airVehiclesUnit);

		landVehiclesUnit.add(tankUnit);

		tankUnit.add(taskFiveTankA);
		tankUnit.add(taskFiveTankB);

		landVehiclesUnit.add(taskFiveIMV);
		seaVehiclesUnit.add(taskFiveWarship);
		airVehiclesUnit.add(taskFiveFighterJet);

		allVehiclesUnit.attack(this.commandCentre);
		allVehiclesUnit.moveToLocation("A cool place!");
		landVehiclesUnit.moveToLocation("This place");
		seaVehiclesUnit.moveToLocation("Coast of coasts");

	}

	/**
	 * Statements to play with changes from Task 6.
	 *
	 * #task6
	 */
	private void taskSix() { // Function for playing with task 6 in world. #task6
		// Create a tank which we can attach armour to
		ArmouredPersonnelCarrier taskSixTank = new Tank(registrar);

		ArmourComponent sideArmourAll = new ArmourGroup("All Side Armour");
		ArmourComponent sideArmourA = new ArmourGroup("Side Armour A");
		ArmourComponent sideArmourB = new ArmourGroup("Side Armour B");
		ArmourComponent windowArmourGroup = new ArmourGroup("Window Armour");

		sideArmourAll.add(sideArmourA);
		sideArmourAll.add(sideArmourB);

		sideArmourA.add(new ArmourPlate("Side Armour A Piece 1"));
		sideArmourA.add(new ArmourPlate("Side Armour A Piece 2"));
		sideArmourA.add(new ArmourPlate("Side Armour A Piece 3"));

		sideArmourB.add(new ArmourPlate("Side Armour B Piece 1"));
		sideArmourB.add(new ArmourPlate("Side Armour B Piece 2"));


		ArmourComponent rearArmour = new ArmourGroup("Rear Armour");
		rearArmour.add(new ArmourPlate("Rear Armour Piece 1"));

		windowArmourGroup.add(new ArmourBulletproofGlass());
		windowArmourGroup.add(new ArmourBulletproofGlass());
		windowArmourGroup.add(new ArmourBulletproofGlass());


		taskSixTank.attachArmour(sideArmourAll);
		taskSixTank.attachArmour(rearArmour);
		taskSixTank.attachArmour(windowArmourGroup);
		taskSixTank.defend();
	}
}
