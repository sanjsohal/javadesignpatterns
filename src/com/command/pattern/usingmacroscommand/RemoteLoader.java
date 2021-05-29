package com.command.pattern.usingmacroscommand;

public class RemoteLoader {
	public static void main(String...args) {
		
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		LightOnCommand lightOn = new LightOnCommand(light);
		TVOnCommand tvOn = new TVOnCommand(tv);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		
		LightOffCommand lightOff = new LightOffCommand(light);
		TVOffCommand tvOff = new TVOffCommand(tv);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
		Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		
		System.out.println("----Pushing Macros On------");
		remoteControl.onButtonIsPressed(0);
		
		System.out.println("---Pushing Macros Off------");
		remoteControl.offButtonIsPressed(0);
		System.out.println("---Undoing------");
		remoteControl.undoButtonWasPushed();

	}
}
