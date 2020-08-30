package com.practice;

class Box {
	double width;
	double height;
	double depth;
	
//	parameterized constructor for class box
	Box(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
//Compute and return volume
	double volume() {
		return this.width * this.height * this.depth;
	}
	

}
