package com.cts.designPatterns;

public class FactoryPattern {
public static void main(String[] args) {
	FactoryPattern factoryPattern=new FactoryPattern();
	Shape sh=factoryPattern.factrymethod(new Circle());
	sh.draw();
}

public Shape factrymethod(Shape sh) {
	if(sh.equals(new Circle())) {
		sh= new Circle();
	}
	else if(sh.equals(new Tringle())) {
		sh= new Tringle();
		
	}
	return sh;
	
	
}
}
