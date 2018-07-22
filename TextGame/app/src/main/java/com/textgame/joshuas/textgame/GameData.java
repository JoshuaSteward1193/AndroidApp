package com.textgame.joshuas.textgame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua S on 7/21/2018.
 */

public class GameData {
    public static Encounter currentLocation;
    public static List<Encounter> encounters = new ArrayList<>();

    public static void BuildData(){
        //BUILD ENCOUNTERS
        encounters.add(new Encounter("Hall of Beginnings", "This is a large open hall. Most " +
                "adentures start here."));
        encounters.add(new Encounter("Small Storage Room", "You are standing in a small room, that " +
                "is mostly used for storage."));

        //ADD ACTIONS TO ENCOUNTERS
        encounters.get(0).AddAction(new Action("Enter the Storage Room", encounters.get(1)));

        //FINALIZE VARIABLES
        currentLocation = encounters.get(0);
    }
}
