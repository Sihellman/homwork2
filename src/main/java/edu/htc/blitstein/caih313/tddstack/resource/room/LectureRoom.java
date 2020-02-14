package edu.htc.blitstein.caih313.tddstack.resource.room;

import edu.htc.blitstein.caih313.tddstack.IStackable;

public class LectureRoom implements IStackable {
    public int number;
    public LectureRoom(int number){
        this.number = number;
    }
    public LectureRoom(){
        number = 0;
    }
}
