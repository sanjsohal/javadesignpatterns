package com.command.pattern.universalremotecontrol;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonIsPressed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonIsPressed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n---------RemoteControl-----------\n");
		for(int i=0;i<onCommands.length;i++) {
			buffer.append("[slot "+i +"]" + onCommands[i].getClass().getName()+"   "+offCommands[i].getClass().getName()+"\n");
		}
		return buffer.toString();
	}
}
