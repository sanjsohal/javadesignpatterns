package com.command.pattern.remotecontrolusinglambdasandmethodreference;

public class RemoteLoader {
	public static void main(String...args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage Door");
		Stereo stereo = new Stereo("Living Room");
		
		Command stereoOnWithCD = ()->{stereo.on();stereo.setCd();stereo.setVolume(11);};
		
		remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
		remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
		remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonIsPressed(0);
		remoteControl.offButtonIsPressed(0);
		remoteControl.onButtonIsPressed(1);
		remoteControl.offButtonIsPressed(1);
		remoteControl.onButtonIsPressed(2);
		remoteControl.offButtonIsPressed(2);
		remoteControl.onButtonIsPressed(3);
		remoteControl.offButtonIsPressed(3);
	}
}
