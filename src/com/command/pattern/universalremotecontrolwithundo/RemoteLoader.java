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
		System.out.println("\n");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		remoteControl.onButtonIsPressed(0);
		remoteControl.offButtonIsPressed(0);
		System.out.println(remoteControl);
		
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonIsPressed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
