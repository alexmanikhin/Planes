/**
 * Created by alexandrmanikhin on 18.01.17.
 */
package edu.cursor.u21;

import java.util.ArrayList;

public interface MilitaryPlaneOptions {
    public void prepareMilitaryPlane(ArrayList<MilitaryPlane> militaryPlane, int planePosition);

    public void startMilitaryMission(ArrayList<MilitaryPlane> militaryPlane, int planePosition);

    public void loadWeapon(ArrayList<MilitaryPlane> militarylane, int planePosition);
}
