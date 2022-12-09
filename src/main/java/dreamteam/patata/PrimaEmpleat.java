package dreamteam.patata;
public class PrimaEmpleat {

    public static void main(String[] args) {
        PrimaEmpleat programa = new PrimaEmpleat();
        programa.calcularPrima("Elvira", "S", 11);
    }
    
    public void calcularPrima(String nom, String dire, int ante) {
        int p = 0;
	if (ante >= 0 && ante < 1000) {
            if (dire == "S") {
                if (ante > 12)
                    p = 600;
                
		else {
                    p = 400;
                    
		}
                
            } else if (dire == "N") {
		if (ante > 12) {
                    p = 150;
                    
                } else {
                    p = 100;
                    
                }
            } else {
                System.out.println("El codi del càrrec ha de ser 'S' o 'N'");
                
            }   
            
            if (p!=0) {
                System.out.println("La prima que li correspon a " + nom + " és de " + p + " Euros");
                
            } else {
                System.out.println("La antiguitat ha de ser un nombre entre 0 i 999");
                
            }
	}
    }
}


