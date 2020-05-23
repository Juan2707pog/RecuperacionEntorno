
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

	public static String Funcion2(String palabra, String palabra2) {

		int vocal1 = 0;
		int vocal2 = 0;
		int conso1 = 0;
		int conso2 = 0;
		int palabrafinal = palabra.length();
		int palabrafinal2 = palabra2.length();
		String result = null;

		for (int x = 0; x < palabrafinal; x++) {
			if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'o')
					|| (palabra.charAt(x) == 'i') || (palabra.charAt(x) == 'u')) 
					 {
				vocal1++;
			}
			conso1 = palabrafinal - vocal1;
		}
		for (int y = 0; y < palabrafinal2; y++) {
			if ((palabra2.charAt(y) == 'a') || (palabra2.charAt(y) == 'e') || (palabra2.charAt(y) == 'o')
					|| (palabra2.charAt(y) == 'i') || (palabra2.charAt(y) == 'u') 
					) {
				vocal2++;
			}
			conso2 = palabrafinal2 - vocal2;
		}

		if (conso1 > conso2) {

			result = palabra;

		} else if (conso1 < conso2) {

			result = palabra2;

		} else if (conso1 == conso2) {

			result = null;
		}
		return result;

	}
}

