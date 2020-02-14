package edu.htc.blitstein.caih313.tddstack.resource.room;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class ComputerLab implements IStackable {
    public String type;
    public ComputerLab(String type){
        this.type = type;
    }
    public ComputerLab(){
        type = "it";
    }
}
