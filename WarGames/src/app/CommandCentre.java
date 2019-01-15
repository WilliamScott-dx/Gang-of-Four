package app;

import model.vehicles.Vehicle;
import java.util.Set;
import java.util.HashSet;

public class CommandCentre {

	private Set<Vehicle> squadron;
	private String location;
	// Contains the single instance of the CommandCentre for the application #task4
	private static CommandCentre uniqueInstance = null;

	/**
	 * Constructor for CommandCentre
	 * Made private for use in the Singleton design pattern to only allow for one instance.
	 *
	 * #task4
	 */
	private CommandCentre() {
		squadron = new HashSet<Vehicle>();
		location = "Blackpool";
	}

	/**
	 * Static getter for acquiring the single instance of the CommandCentre.
	 *
	 * @return The unique instance of the CommandCentre for the application
	 * #task4
     */
	public static CommandCentre getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new CommandCentre();
		}
		return uniqueInstance;
	}


	public Boolean attachToSquadron(Vehicle vehicle) {
		return squadron.add(vehicle);
	}

	public Boolean detachFromSquadron(Vehicle vehicle) {
		if (squadron.contains(vehicle)) {
			return squadron.remove(vehicle);
		}
		return false;
	}

	private void deploySquadron() {
		for (Vehicle vehicle : squadron) {
			vehicle.attack(this);
		}
	}

	public Boolean goToWar() {
		if (!location.equals(null)) {
			deploySquadron();
			return true;
		}
		return false;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
