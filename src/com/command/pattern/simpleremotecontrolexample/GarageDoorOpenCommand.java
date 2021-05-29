package com.command.pattern.simpleremotecontrolexample;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.up();
	}

}
