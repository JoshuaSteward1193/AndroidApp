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
                "adentures start here. There is a small storage room here. There is an exit leading out " +
                "into a hallway."));
        encounters.add(new Encounter("Small Storage Room", "You are standing in a small room, that " +
                "is mostly used for storage."));
        encounters.add(new Encounter("Old Hallway", "A long, dark, stone hallway that leads towards a " +
                "dark wood door."));

        //ADD ACTIONS TO ENCOUNTERS
        encounters.get(0).AddAction(new Action("Enter the Storage Room", "You open the door into a small," +
                "unused storage room.", encounters.get(1)));
        encounters.get(0).AddAction(new Action("Go out into the hallway", "You leave the Hall of Beginnings " +
                "and enter an old hallway.", encounters.get(2)));
        encounters.get(1).AddAction(new Action("Leave the Storage Room", "You leave the dark and musty room " +
                "behind you and re-enter the Hall of Beginnings.", encounters.get(0)));

        //FINALIZE VARIABLES
        currentLocation = encounters.get(0);
    }
}
