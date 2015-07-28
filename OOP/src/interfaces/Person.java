package interfaces;

import java.util.Calendar;

public class Person implements Age {
	// klasse Person implementeert interface Age of
	// klasse Person is een implementatie van interface Age
	// => alle methodes uit interface Age moeten uitgewerkt zijn 
	// in deze klasse
    private String firstName;
    private String lastName;
    private int yearBorn;
    
    // constructor
    public Person( String firstNameValue, String lastNameValue,
            int yearBornValue ) {
        firstName = firstNameValue;
        lastName = lastNameValue;
        
        if ( yearBornValue > 0 && yearBornValue <= getCurrentYear() )
            yearBorn = yearBornValue;
        else
            yearBorn = getCurrentYear();
    }
    
    // getAge() implementation of interface Age
	@Override
    public int getAge() {
        return getCurrentYear() - yearBorn;
    }
    
    // getName() implementation of interface Age
	@Override
    public String getName() {
        return firstName + " " + lastName;
    }
    
    private int getCurrentYear(){
        Calendar kalender = Calendar.getInstance();
        return kalender.get(Calendar.YEAR);
    }
} // end class Person