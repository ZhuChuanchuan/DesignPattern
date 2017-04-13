package com.tom.dp19Memento;

public class Storage {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	public Storage(Memento memento){
		this.memento=memento;
	}
}
