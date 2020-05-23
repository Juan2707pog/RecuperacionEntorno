
public class Funciones {
	public static Boolean Funcion1(String palabra){
		
		int edad = 18;
		int cont = 0;
		Boolean result = null;
		
		for(int x = 0; x < palabra.length(); x++) {
			
			if((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'o') || (palabra.charAt(x) == 'i') || (palabra.charAt(x) == 'u') || (palabra.charAt(x) == 'á') || (palabra.charAt(x) == 'é') || (palabra.charAt(x) == 'ó') || (palabra.charAt(x) == 'í') || (palabra.charAt(x) == 'ú') || (palabra.charAt(x) == 'ä') || (palabra.charAt(x) == 'ë') || (palabra.charAt(x) == 'ö') || (palabra.charAt(x) == 'ï') || (palabra.charAt(x) == 'ü')|| (palabra.charAt(x) == 'A') || (palabra.charAt(x) == 'E') || (palabra.charAt(x) == 'O') || (palabra.charAt(x) == 'I') || (palabra.charAt(x) == 'U') || (palabra.charAt(x) == 'Á') || (palabra.charAt(x) == 'É') || (palabra.charAt(x) == 'Ó') || (palabra.charAt(x) == 'Í') || (palabra.charAt(x) == 'Ú') || (palabra.charAt(x) == 'Ä') || (palabra.charAt(x) == 'Ë') || (palabra.charAt(x) == 'Ö') || (palabra.charAt(x) == 'Ï') || (palabra.charAt(x) == 'Ü')) {
				
				cont++;
				
				if(cont >= edad ) {
					
					result = true;
					
				}else {
					result = false;
				}	
			}
		}
		return result;
	}
}
