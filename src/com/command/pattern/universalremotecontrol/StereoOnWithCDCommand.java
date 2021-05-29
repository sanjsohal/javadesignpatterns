package com.command.pattern.universalremotecontrol;

public class StereoOnWithCDCommand implements Command {
	
	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}
}
