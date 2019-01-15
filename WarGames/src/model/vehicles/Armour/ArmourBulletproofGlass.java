package model.vehicles.Armour;

/**
 * @author William Scott wrs35
 *
 * ArmourBulletproofGlass is a type of armour which can be equipped in layers by Armoured Personnel Carriers
 * Used within the composite design pattern as a child object within ArmourGroup.
 *
 * #task6
 */
public class ArmourBulletproofGlass extends ArmourComponent {

    private Integer productionNumber = -1;
    static Integer currProductionNumber = 0;


    public ArmourBulletproofGlass() {
        productionNumber = currProductionNumber;
        currProductionNumber++;
    }

    /**
     * Defend against incoming damage.
     */
    @Override
    public void defend() {
        System.out.println("Bulletproof Glass #" + productionNumber + " is defending against any incoming damage.");
    }

}
