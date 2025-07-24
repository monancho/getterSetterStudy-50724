package com.monancho.ch07.pt01;

public class Animal {
String name;
String value;
String sound;




public Animal(String name, String value, String sound) {
	super();
	this.name = name;
	this.value = value;
	this.sound = sound;
}




public void bark() {
	System.out.print("\n\n이름: " + name + " 종: " + value + " 울음소리: " + sound);
}


}
