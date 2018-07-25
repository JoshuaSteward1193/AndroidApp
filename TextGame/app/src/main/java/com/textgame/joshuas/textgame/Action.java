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

    public Action(String des, String act, Encounter loc){
        description = des;
        actionText = act;
        destination = loc;
        attempts = -1;
    }
    public Action(String des, String act, Encounter loc, int amt){
        description = des;
        actionText = act;
        destination = loc;
        attempts = amt;
    }
    public void carryOut() {
        if(attempts > 0 ){
            attempts--;
            GameData.currentLocation = destination;
        }
    }
}
