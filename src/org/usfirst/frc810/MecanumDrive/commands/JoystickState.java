package org.usfirst.frc810.MecanumDrive.commands;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class JoystickState implements Serializable{
	public double x;
	public double y;
	public double r;
	
	private void writeObject(ObjectOutputStream o)throws IOException{
		o.writeDouble(x);
		o.writeDouble(y);
		o.writeDouble(r);
	}
	
	private void readObject(ObjectInputStream i) throws ClassNotFoundException, IOException{
		x = i.readDouble();
		y = i.readDouble();
		r = i.readDouble();
	}
	
}