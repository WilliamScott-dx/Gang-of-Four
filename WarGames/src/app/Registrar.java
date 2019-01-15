package app;

import model.vehicles.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Registrar {
	private Map<Integer, Vehicle> vehicles;
	private Integer lastIssuedId = 0;

	public Registrar() {
		vehicles = new HashMap<>();
	}

	public Integer issueId(Vehicle vehicle) {
		lastIssuedId += 1;
		vehicles.put(lastIssuedId, vehicle);
		return lastIssuedId;
	}

	public Collection<Vehicle> getAllVehicles() {
		return vehicles.values();
	}

	public Vehicle getVehicle(Integer id) {
		return vehicles.getOrDefault(id, null);
	}
}