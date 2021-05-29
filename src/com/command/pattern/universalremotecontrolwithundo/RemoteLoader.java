package com.command.pattern.universalremotecontrolwithundo;

public class RemoteLoader {
	public static void main(String...args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room Light");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		remoteControl.onButtonIsPressed(0);
		remoteControl.offButtonIsPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonIsPressed(0);
		remoteControl.onButtonIsPressed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
