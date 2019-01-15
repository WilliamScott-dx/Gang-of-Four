package model.vehicles.air;

import app.Registrar;
import model.weaponry.GuidedMissileSystem;
import model.weaponry.WeaponSystem;


public class FighterJet extends CombatAircraft {

    public FighterJet(Registrar registrar) {
        super(registrar);
    }

    @Override
    /**
     * FactoryMethod() from the FactoryMethod() design pattern used in ConcreteCreator.
     *Produces the Fighter Jet's weapon system.
     *
     * @return WeaponSystem to be attached to the vehicle.
     * #task1
     */
    protected WeaponSystem makeVehicleWeapon() {
        return new GuidedMissileSystem();
    }

}
