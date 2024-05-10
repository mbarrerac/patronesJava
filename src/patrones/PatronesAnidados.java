package patrones;
import java.util.Scanner;
public class PatronesAnidados {

	public static void main(String[] args) {
		int numero;
		String numerocadena;
		boolean estado = false;
		Scanner scanner = new Scanner(System.in);
		do {
			estado = false;
			System.out.println("Ingrese numero de iteraciones");
	        numerocadena = scanner.nextLine(); 
	        estado = revisaString(numerocadena);
	    }while (estado);
		numero = Integer.parseInt(numerocadena);
		
		
		//patron 1 
		System.out.println("Patron 1");
		patron1(numero,"*"," ");

		//patron 2
		System.out.println("Patron 2");
		patron2(numero,"*"," ");

		//patron 3
		System.out.println("Patron 3");
		patron3(numero,"*"," ");

	   	//patron 4
	    System.out.println("Patron 4");	
	    patron4(numero,"*"," ");

		
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
	
	static void patron1(int itera, String tipo1, String tipo2) {
		for (int i= 1;i<=itera;i++) {
			String patron="";
			if (i==1 || i== itera) {
	            patron= devuelvePatron(itera,tipo1);
				System.out.println(patron);
			}else {
				patron += tipo1+devuelvePatron(itera-2,tipo2)+tipo1;
			    System.out.println(patron);
		    }    
		}//for i
		
	}
	
	static void patron2(int itera, String tipo1, String tipo2) {
		for (int i= 1;i<=itera;i++) {
			String patron="";
			if (i==1 || i== itera) {
	            patron= devuelvePatron(itera,tipo1);
				System.out.println(patron);
			}else {
				patron += devuelvePatron(itera-i,tipo2)+tipo1;
			    System.out.println(patron);
		    }    
		}//for i
		
	}
	
	
	static void patron3(int itera, String tipo1, String tipo2) {
		String patron="";
		int n=2;
        if (itera==1) {
        	patron =tipo1;
        	System.out.println(patron);
        }else {
        	//parte de arriba de la X
    		for (int i= 1;i<=itera/2;i++) {
    			patron ="";
    			if(i==1) {
    				patron += tipo1;
    			}else {
    				patron += devuelvePatron(i-1,tipo2)+tipo1;
      			}
    			patron += devuelvePatron(itera-n,tipo2)+tipo1;		
	    		n+=2;
    			System.out.println(patron);
    		}       
    		//si el resto no es cero coloco el * en el centro
     		  patron = "";
    		  if (itera%2!=0) {
    			  patron += devuelvePatron(itera/2,tipo2)+tipo1;	
       			  System.out.println(patron);   			  
    		  }
    		// hago la parte de abajo de la X
    		  patron="";
    		   n=1;
    		   int m=1;
    	   		for (int o= 1;o<=itera/2;o++) {
    	   			patron += devuelvePatron(itera/2-n,tipo2)+tipo1;		
          			n+=1;
           	  		if (o==1 && itera%2!=0) {
           	  		   patron += devuelvePatron(m,tipo2)+tipo1;	
               		   m+=2;
          	  		} else { 
          	  			if(o==1) {
          	  			  patron += tipo1;
          	  			  m+=1;
          	  			}else {
          	  			    patron += devuelvePatron(m,tipo2)+tipo1;	
             	  			m+=2;	
          	  			}
 
          	  		}
           	  	
              		
              		System.out.println(patron);
                    patron = "";
    	   		}  
 
        }
	}
	
	static void patron4(int itera, String tipo1, String tipo2) {
		for (int i= 1;i<=itera;i++) {
			String patron="";
	   		if (i==1) {
	   			if (i==itera) {
	   				patron += "*";
	   			}else {
	   	   			patron= devuelvePatron(itera-1,tipo1);
	   			}
	   		} else {
	   			patron= tipo2+devuelvePatron(itera-2,tipo1);
	   			if (i==itera) {
	   				patron += tipo1;
	   			}
	   		}
	  		System.out.println(patron);
		}//for i
	}

	
	static String devuelvePatron(int itera, String tipo) {
		String patron="";
		for (int j=1;j<= itera;j++) {
			patron += tipo;
			
		}// for j
		return patron;
	}
	
}




