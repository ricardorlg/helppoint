package com.endava.help.dp;

import com.endava.help.dp.factory.example.LargeDogClinic;
import com.endava.help.dp.factory.example.MediumDogClinic;
import com.endava.help.dp.factory.example.SmallDogClinic;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName(LargeDogClinic.class.getName());
		Class.forName(MediumDogClinic.class.getName());
		Class.forName(SmallDogClinic.class.getName());

		VetClinicSimulation simulation = new VetClinicSimulation();
		simulation.simulate();

	}
}
