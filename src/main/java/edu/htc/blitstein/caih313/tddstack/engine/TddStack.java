package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;

public class TddStack {
    static long DEFAULT_DEPTH = 100;
    long stackDepth;

    TddStack(long stackDepth){

;
    }
    public TddStack(){

    }
    public boolean isEmpty(){
        return true;

    }
    public boolean isFull(){
        return true;

    }
    public void push(IStackable iStackable){


    }
    public IStackable pop(){
        IStackable obj = new Faculty();
        return obj;

    }
}
