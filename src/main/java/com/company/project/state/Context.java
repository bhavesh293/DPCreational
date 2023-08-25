package com.company.project.state;

public class Context {
	private State state; // context has info about state

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}