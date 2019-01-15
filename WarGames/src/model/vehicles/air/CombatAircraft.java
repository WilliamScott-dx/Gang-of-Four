package model.vehicles.air;

import app.Registrar;
import model.vehicles.Vehicle;

public abstract class CombatAircraft extends Vehicle {

    public CombatAircraft(Registrar registrar) {
        super(registrar);
    }

    @Override
    public void moveToLocation(String location) {
        System.out.println(this.getClass().getSimpleName() + " " + getId() + " is flying to " + location);
    }

    @Override
    protected void fight(String location) {
    	System.out.println(this.getClass().getSimpleName() + " " + getId() + " is flying over " + location + " and preparing to fight");
        super.fight(location);
    }

    @Override
    protected void completeAttack() {
    	System.out.println(this.getClass().getSimpleName() + " " + getId() + " is flying back to base");
    }
}
