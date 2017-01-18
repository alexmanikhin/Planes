package edu.cursor.u21; /**
 * Created by alexandrmanikhin on 18.01.17.
 */

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MilitaryPlane extends Plane {
    private int weaponCapacity;
    private int weapon;


    public MilitaryPlane(String name, String type, int weight, double fuelCapacity, int weapon) {
        super(name, type, weight, fuelCapacity);
        this.weaponCapacity = weaponCapacity;
    }
}
