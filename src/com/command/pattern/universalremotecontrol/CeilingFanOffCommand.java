package com.command.pattern.universalremotecontrol;

public class CeilingFanOffCommand implements Command {
	
	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}
}
