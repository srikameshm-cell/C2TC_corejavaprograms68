package day5_.multilevelinheritance.vehicle;
package com.tnsif.Day5.multilevelinheritance.vehicle;

import day5_.multilevelinheritance.vehicle.Car;

public class Maruti extends Car {
	public Maruti() {
		System.out.println("Class Maruti");
	}

	public void brand() {
		System.out.println("Brand: Maruti");
	}
	public void speed() {
		System.out.println("Max: 90Kmph");
	}
}