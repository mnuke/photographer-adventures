package com.google.sample.cloudvision;

/**
 * Created by Jeric Pauig on 6/11/2016.
 */
public class Object {
    public enum State {CORRECT, SKIPPED, NOT_TESTED};

    private String name;
    private State state;
    private int attempts;
    private String associatedWords;

    public Object(String name, State state, int attempts) {
        this(name, state, attempts, "");
    }

    public Object(String name, State state, int attempts, String associatedWords) {
        this.name = name;
        this.state = state;
        this.attempts = attempts;
        this.associatedWords = associatedWords;
        //TODO: validate attempts if state is correct or skipped or whatever
    }

    public State getState(){
        return this.state;
    }

    public int getAttempts(){
        return this.attempts;
    }

    public String getName(){
        return this.name;
    }

    public String getAssociatedWords() { return this.associatedWords; }

    public void setState(Object.State newState) {
        this.state = newState;
    }

    public void setAttempts(int attempts) { this.attempts = attempts; }

    public void reset() {
        this.state = State.NOT_TESTED;
        this.attempts = 0;
    }
}
