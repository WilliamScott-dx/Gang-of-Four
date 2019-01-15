package model.vehicles.Armour;

/**
 * @author William Scott wrs35
 *
 * ArmourComponent abstract class for use in all armour components, including the composite armour.
 * Declares public interface for armour to be used in an armour composition.
 *
 * #task6
 */
public abstract class ArmourComponent {

    /**
     * Adds armour to the composition.
     *
     * @param armour A piece of armour to be added to the composition.
     */
    public void add(ArmourComponent armour) {
        throw new UnsupportedOperationException();
    }

    /**
     * Removes armour from the composition.
     *
     * @param armour The piece of armour to be removed from the composition.
     */
    public void remove(ArmourComponent armour) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns an ArmourComponent at a given index.
     *
     * @param componentIndex Index of the desired ArmourComponent to return.
     * @return The ArmourComponent at the desired index.
     */
    public ArmourComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    /**
     * Defend against incoming damage.
     */
    public void defend() {
        throw new UnsupportedOperationException();
    }
}
