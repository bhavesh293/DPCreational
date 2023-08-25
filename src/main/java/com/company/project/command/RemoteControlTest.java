package com.company.project.command;

//Driver class
class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); 
		Light light = new Light(); 
		// we can change command dynamically
		remote.setCommand(new LightOnCommand(light)); 
		remote.buttonWasPressed(); 

		remote.setCommand(new LightOffCommand(light));
		remote.buttonWasPressed();
	}
} 