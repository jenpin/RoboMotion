package controller;


import model.Robot;

public interface Command {

    public void processCommand(Robot robot);
}
