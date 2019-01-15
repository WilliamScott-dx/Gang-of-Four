package model.vehicles.Armour;

import java.util.ArrayList;
import java.util.List;

/**
 * @author William Scott wrs35
 *
 * ArmourGroup class is used to represent a composite of pieces of armour. Methods to manipulate children
 * should be included within this class.
 *
 * #task6
 */
public class ArmourGroup extends ArmourComponent {

    // Collection of child armour
    private List<ArmourComponent> childArmour = new ArrayList<ArmourComponent>();
    // Name of the armour composition
    private String armourGroupName;

    public ArmourGroup(String newArmourGroupName) {
        armourGroupName = newArmourGroupName;
    }

    /**
     * Defend against incoming damage.
     */
    public void defend() {
        // Identify the composite which is defending
        System.out.println(armourGroupName + " Is now defending");

        for (ArmourComponent armor : childArmour) {
            armor.defend();
        }
    }

    /**
     * Adds armour to the composition.
     *
     * @param armour A piece of armour to be added to the composition.
     */
    public void add(ArmourComponent armour) {
        childArmour.add(armour);
    }

    /**
     * Removes armour from the composition.
     *
     * @param armour The piece of armour to be removed from the composition.
     */
    public void remove(ArmourComponent armour) {
        childArmour.remove(armour);
    }
}
