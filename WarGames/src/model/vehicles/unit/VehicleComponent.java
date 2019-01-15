package model.vehicles.unit;


import app.CommandCentre;

/**
 * @author William Scott wrs35
 *
 * VehicleComponent for use in all vehicle components, including the Vehicle Unit.
 * Implemented as taught in class for use within the composite pattern.
 *
 *
 * #task5
 */
public abstract class VehicleComponent {

    public void add(VehicleComponent vehicle) {
        throw new UnsupportedOperationException();
    }

    public void remove(VehicleComponent vehicle) {
        throw new UnsupportedOperationException();
    }

    public VehicleComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public void defend() {
        throw new UnsupportedOperationException();
    }

    protected Integer getId() {
        throw new UnsupportedOperationException();
    }

    public void attack(CommandCentre commandCentre)  {
        throw new UnsupportedOperationException();
    }

    public abstract void moveToLocation(String location);

    protected void fight(String location)  {
        throw new UnsupportedOperationException();
    }

    protected abstract void completeAttack();

    protected void setWeapon()  {
        throw new UnsupportedOperationException();
    }

    public String toString()   {
        throw new UnsupportedOperationException();
    }
}
