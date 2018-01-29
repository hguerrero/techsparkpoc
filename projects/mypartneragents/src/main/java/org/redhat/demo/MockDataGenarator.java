package org.redhat.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.redhat.demo.data.Accident;

import com.github.javafaker.Faker;

public class MockDataGenarator {

	DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	//Generate single accident data for police department
	private Accident generateData() {
		
		Faker faker = new Faker();

		Accident accident = new Accident(); 
		
		accident.setContactName(faker.name().fullName());
		accident.setPhone(faker.phoneNumber().cellPhone());
		accident.setEmail(faker.name().firstName()+"@"+faker.name().lastName()+".com");
		accident.setDate(df.format(faker.date().birthday()));
		accident.setType(faker.number().numberBetween(1, 3));
		accident.setDescription(faker.pokemon().name() +" at "+faker.pokemon().location());
		
		return accident;
	}
	
	public List<Accident> generateAllData() {
		
		List<Accident> alldata = new ArrayList<Accident>();
		
		Faker faker = new Faker(); 
		int noOfList = faker.number().numberBetween(100, 400);
		
		for(int i=0; i<noOfList; i++) {
			alldata.add(generateData());
		}
		
		return alldata;
	}
	
}
