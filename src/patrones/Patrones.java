package patrones;
import java.util.Scanner;
public class Patrones {

	public static void main(String[] args) {
		int numero;
		String numerocadena, cadena = "";
		boolean estado = false;
		Scanner scanner = new Scanner(System.in);
		do {
			estado = false;
			System.out.println("Ingrese numero de iteraciones");
	        numerocadena = scanner.nextLine(); 
	        estado = revisaString(numerocadena);	        
	    }while (estado);
		numero = Integer.parseInt(numerocadena);	
		
		//patron1 (*.*.*.)
        cadena  = patron1(numero,"*",".");
		System.out.println("Patron 1");
		System.out.println(cadena);
		
		//patron2 (12341234)
		cadena = "";
		cadena = patron2(numero,"1","2","3","4");
		System.out.println("Patron 2");
		System.out.println(cadena);
		
		//patron3 (||*||*||*)
		cadena = "";
		cadena = patron3(numero,"*","|");
		System.out.println("Patron 3");
		System.out.println(cadena);
		
		scanner.close();
	}
	//metodos
	
	static boolean revisaString(String cadena) {
	    boolean estadoDevuelto = false; 
	    for (int j = 0; j < cadena.length(); j++) {
	         if (cadena.charAt(j) < '0' || cadena.charAt(j) > '9') {
	        	estadoDevuelto = true; 
	            break; 
	        }
	    }
	    return estadoDevuelto;
	}
	
	static String patron1(int itera, String tipo1, String tipo2) {
		String patron="";
		for (int i=1; i<=itera;i++) {
			//patron1
			if (i%2==0) {
				patron += tipo2;
			}else {
				patron += tipo1;
			}
		}
		return patron;
	}
	
	static String patron2(int itera, String tipo1, String tipo2, String tipo3, String tipo4) {
		int cuenta =1;
		String patron="";
		for (int i=1; i<=itera;i++) {
			//patron1
			if (cuenta==1) {
				patron += tipo1;
			}else { 
				if(cuenta == 2) {
					patron += tipo2;
				}else {
					if(cuenta == 3) {
						patron += tipo3;
					}else {
						patron += tipo4;
					}
				}
					
			}
			cuenta++;
			if (cuenta ==5) {
				cuenta = 1;
			}
		}//for	
		return patron;
	}
	
	static String patron3(int itera, String tipo1, String tipo2) {
		String patron="";
		for (int i=1; i<=itera;i++) {
			if (i%3==0) {
				patron+="*";
			}else {
				patron+="|";
			}
		} //for
		return patron;
	}
}



