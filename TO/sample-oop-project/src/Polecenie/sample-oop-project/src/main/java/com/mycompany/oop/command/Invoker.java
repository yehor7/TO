package com.mycompany.oop.command;

public class Invoker {

  private final Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void execute() {
    command.execute();
  }
}
