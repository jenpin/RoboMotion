package controller;


import model.Robot;

public interface Command {

    void processCommand(Robot robot);
}
