package com.command.pattern.universalremotecontrolwithundo;

public interface Command {
	public void execute();
	public void undo();
}
