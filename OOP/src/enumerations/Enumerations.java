/*
 * Enumerations
 *
 * (bestaat sinds Java 5.0)
 * Een enumeratie is een object type dat beperkt is tot een expliciet opgesomde 
 * set van waarden.  Deze waarden hebben een volgorde (bepaald door de volgorde
 * waarin de waarden opgesomd worden) en een bijhorende String naam.
 */

package enumerations;

enum Seizoenen {
    LENTE, ZOMER, HERFST, WINTER;
}

enum UsersKlas1 {
    ANNEMIE(101) , RUDI(102), MARC(103), KRISTOF(104), MIEKE(105), THIERRY(113),
    JONATHAN(107), JAN(108), ILSE(109), TOM(110),
    MAX(111), MARTIN(112), CARLOS(114);
    
    private int usernr;
    
    UsersKlas1(int nr){
        // constructor van een enum mag NIET public zijn
        // (enum types kunnen niet geïnstantieerd worden)
        usernr = nr;
    }
    
    public int getValue(){
        return usernr;
    }
}


public class Enumerations{
    public static void main(String[] args){
        Seizoenen seizoen1 = Seizoenen.HERFST, seizoen2 = Seizoenen.WINTER;
        System.out.println(seizoen1);   
        System.out.println("overzicht van seizoenen:");
        for(Seizoenen seizoen: Seizoenen.values()){
            System.out.println(seizoen);
        }
        Seizoenen seizoen = Seizoenen.valueOf("LENTE");
        System.out.println(seizoen);
        if (seizoen1.compareTo(seizoen2) < 0)  
        // enumeration types kunnen NIET vergeleken worden met de standaard
        // vergelijkingsoperatoren    
            System.out.println("In hetzelfde kalenderjaar komt " +
                    seizoen1 + " voor " + seizoen2);
        else if (seizoen1.compareTo(seizoen2) > 0)
            System.out.println("In hetzelfde kalenderjaar komt " +
                    seizoen1 + " na " + seizoen2);
        else
            System.out.println("2 x " + seizoen1);

        int waardeLente = Seizoenen.LENTE.ordinal();
        System.out.printf("volgnr van %s in Seizoenen: %d%n", Seizoenen.LENTE, waardeLente);
        
        System.out.println();
        UsersKlas1 eenStudent = UsersKlas1.MIEKE;
        UsersKlas1 eenAndereStudent = UsersKlas1.MIEKE;
        System.out.println(eenStudent + " heeft als login user" +
                eenStudent.getValue());  
        if(UsersKlas1.THIERRY.compareTo(UsersKlas1.JONATHAN) < 0)
            System.out.println(UsersKlas1.THIERRY + " komt voor " + 
                    UsersKlas1.JONATHAN); 
        if (eenStudent == eenAndereStudent)
            System.out.println("2 dezelfde studenten");
    }
}

/* output:
HERFST
overzicht van seizoenen:
LENTE
ZOMER
HERFST
WINTER
LENTE
In hetzelfde kalenderjaar komt HERFST voor WINTER
volgnr van LENTE in Seizoenen: 0

MIEKE heeft als login user105
THIERRY komt voor JONATHAN
2 dezelfde studenten
 */