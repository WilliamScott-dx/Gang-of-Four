package model.vehicles.unit;

import app.CommandCentre;

import java.util.ArrayList;
import java.util.List;

/**
 * @author William Scott wrs35
 *
 * VehicleUnit class is used to represent a composite of vehicles. Methods to manipulate children
 * should be included within this class.
 *
 * #task5
 */
public class VehicleUnit extends VehicleComponent {

    private List<VehicleComponent> childVehicles = new ArrayList<VehicleComponent>();
    private String vehicleUnitName;

    public VehicleUnit(String newArmourGroupName) {
        vehicleUnitName = newArmourGroupName;
    }

    public void add(VehicleComponent vehicle) {
        childVehicles.add(vehicle);
    }

    public void remove(VehicleComponent vehicle) {
        childVehicles.remove(vehicle);
    }

    public VehicleComponent getComponent(int componentIndex) {
        return childVehicles.get(componentIndex);
    }

    public void defend() {
        for (VehicleComponent vehicle : childVehicles) {
            vehicle.defend();
        }
    }

    public void attack(CommandCentre commandCentre)  {
        for (VehicleComponent vehicle : childVehicles) {
            vehicle.attack(commandCentre);
        }
    }

    public void moveToLocation(String location) {
        for (VehicleComponent vehicle : childVehicles) {
            vehicle.moveToLocation(location);
        }
    }

    protected void fight(String location)  {
        for (VehicleComponent vehicle : childVehicles) {
            vehicle.fight(location);
        }
    }

    protected void completeAttack() {
        for (VehicleComponent vehicle : childVehicles) {
            vehicle.completeAttack();
        }
    }

    protected void setWeapon()  {
        for (VehicleComponent vehicle : childVehicles) {
            vehicle.setWeapon();
        }
    }

    public String toString()    {
        String stringRepresentation = vehicleUnitName + "\n";
        for (VehicleComponent vehicle : childVehicles) {
            stringRepresentation += (vehicle.toString() + "\n");
        }
        return stringRepresentation;
    }
}
