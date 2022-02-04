package com.cts.serdeser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Student implements Serializable {
	transient int id;  
	static String name;
	 public Student(){}
	 public Student(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }
/*
 * @Override public void readExternal(ObjectInput in) throws IOException,
 * ClassNotFoundException { // TODO Auto-generated method stub name =
 * (String)in.readObject(); id = in.readInt(); }
 * 
 * @Override public void writeExternal(ObjectOutput out) throws IOException { //
 * TODO Auto-generated method stub out.writeObject(name); out.writeInt(id); } 
 */
}