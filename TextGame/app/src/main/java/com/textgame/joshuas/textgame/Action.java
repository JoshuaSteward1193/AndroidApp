package com.textgame.joshuas.textgame;

/**
 * Created by Joshua S on 7/21/2018.
 */

public class Action {
    //actionText is the text the user sees when they select an action
    public String actionText;
    public String description;
    //The term 'Destination' is used even in cases where an action does not take the player to another
    //physical location. For example, a conversation could have another conversation as its destination.
    public Encounter destination;
    public int attempts;
    public boolean active;         //determines if the action should be loaded or not
    public boolean extinguishable; //determines if an action has limited uses or not

    public Action(String des, String act, Encounter loc){
        description = des;
        actionText = act;
        destination = loc;
        attempts = -1;
        active = true;
        extinguishable = false;
    }
    public Action(String des, String act, Encounter loc, int amt){
        description = des;
        actionText = act;
        destination = loc;
        attempts = amt;
        if (attempts > 0){
            extinguishable = true;
        } else {
            extinguishable = false;
        }

    }
    public void carryOut() {
        if(active){
            if(extinguishable){
                attempts--;
            }
            GameData.currentLocation = destination;
        }
        if(attempts == 0){
            active = false;
        }
    }
}
