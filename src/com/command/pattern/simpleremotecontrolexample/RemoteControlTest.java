package com.command.pattern.simpleremotecontrolexample;

public class RemoteControlTest {
	public static void main(String...args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonWasPressed();
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonWasPressed();
	}
}
