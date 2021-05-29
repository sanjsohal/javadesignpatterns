package com.command.pattern.universalremotecontrol;

public class GarageDoorOffCommand implements Command{
	
	private GarageDoor garageDoor;
	
	public GarageDoorOffCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}
}
