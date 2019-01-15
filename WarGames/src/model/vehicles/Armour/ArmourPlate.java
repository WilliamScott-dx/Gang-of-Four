package model.vehicles.Armour;

/**
 * @author William Scott wrs35
 *
 * ArmourPlate is a type of armour which can be equipped in layers by Armoured Personnel Carriers
 * Used within the composite design pattern as a child object within ArmourGroup.
 *
 * #task6
 */
public class ArmourPlate extends ArmourComponent {

    private String armourName;

    public ArmourPlate(String newArmourName) {
        armourName = newArmourName;
    }

    /**
     * Defend against incoming damage.
     */
    @Override
    public void defend() {
        System.out.println(armourName + " is defending against any incoming damage.");
    }

}
