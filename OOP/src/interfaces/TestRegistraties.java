package interfaces;

/* TO DO:
 * elk van jullie programmeert een van
 * de klassen (Werknemer, PC, Plant, ...)
 * die in onderstaand programma gebruikt worden.
 * Om ervoor te zorgen dat het programma daarna zal werken,
 * moeten jullie klassen ?????
 */

public class TestRegistraties {
    final static int AANTAL = 15;
    public static void main(String[] args){
        Registreerbaar[] registratieLijst = new Registreerbaar[AANTAL];
        
        registratieLijst[0] = new Leerling(); // Ann
        registratieLijst[1] = new Werknemer(); // Iris
        registratieLijst[2] = new PC(); // Andre
        registratieLijst[3] = new Factuur(); // Jorik
        registratieLijst[4] = new Artikel(); // Thomas
        registratieLijst[5] = new Plant(); // Robin
        registratieLijst[6] = new Geboorte(); // Hannes
        registratieLijst[7] = new Wagen(); // Yannick
        registratieLijst[8] = new Boek(); // Aliye
        registratieLijst[9] = new CD(); // Brent
//         registratieLijst[10] = new ArbeidsOngeschiktheid(); // Stef
        registratieLijst[11] = new Uitvinding(); // Koen
        registratieLijst[12] = new BouwAanvraag(); // Jonas
//        registratieLijst[13] = new BelastingAangifte(); // 
//        registratieLijst[14] = new Domiciliering(); // 
        
        for(Registreerbaar reg: registratieLijst) {
            if (reg != null)
                reg.registreer();
        }
        
        for(Registreerbaar reg: registratieLijst) {
            if (reg != null) {
                System.out.println(reg.getIdentificatie() + "\t");
                System.out.println(reg.getStringVoorConsole());
            }
        }
    }
}
