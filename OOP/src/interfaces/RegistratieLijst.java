package interfaces;

public class RegistratieLijst {
    private Registreerbaar[] lijst = new Registreerbaar[0];
    
    public void sorteer(){
        for ( int i = 0; i < lijst.length; i++) {
            int minIndex =  i;
            
            for ( int j = i + 1; ( j < lijst.length); j++) {
                if (  lijst[j].komtVoor(lijst[minIndex])  ) {
                    minIndex = j;
                }
            }
            
            if ( minIndex != i) {
                Registreerbaar temp = lijst[i];
                lijst[i] = lijst[minIndex];
                lijst[minIndex] = temp;
            }
        }
    }
    
    public void voegToe(Registreerbaar registratie){
        Registreerbaar[] temp = new Registreerbaar[lijst.length+1];
        System.arraycopy(lijst, 0, temp, 0, lijst.length);
        lijst = temp;
        lijst[lijst.length - 1] = registratie;
    }
    
    public LijstIterator getIterator(){
        sorteer();
        return new LijstIterator();
    }
    
    // definitie van een inner class:
    public class LijstIterator implements java.util.Iterator<Registreerbaar> {
        // een inner class kan aan alle velden en methods van de "outer class"
        int element = 0;
        
        public LijstIterator(){
        }

	@Override
        public boolean hasNext(){
            return element < lijst.length;
        }
        
	@Override
        public Registreerbaar next(){
            // in java.util.Iterator is het returntype van next Object
            // sinds java 5.0 mag men bij het overschrijven van een method
            // het returntype van de method wijzigen in een 'subtype' van
            // het returntype van de method in de basisklasse
            if (hasNext())
                return lijst[element++];
            else
                return null ; // eigenlijk zouden we hier een fout moeten "opwerpen"
        }
        
	@Override
        public void remove(){
            
        }
    }
    
}
