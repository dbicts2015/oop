package interfaces;

import java.util.Calendar;
public class Tree implements Age {
    private int rings; // number of rings in tree trunk
    
    public Tree( int yearPlanted ) {
        // count number of rings in Tree
        rings = getCurrentYear() - yearPlanted;
    }
    
    // increment ring
    public void addRing() {
        rings++;
    }
    
    // getAge() implementation of interface Age
	@Override
    public int getAge() {
        return rings;
    }
    
    // getName() implementation of interface Age
	@Override
    public String getName() {
        return "Tree";
    }
    
    private int getCurrentYear(){
        Calendar kalender = Calendar.getInstance();
        return kalender.get(Calendar.YEAR);
    }
    
} // end class Tree