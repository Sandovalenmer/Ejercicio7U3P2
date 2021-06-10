import java.util.*;

public class Ejercicio7 {

	public static void main(String args[]) {
		double div, i, impares, nulos, pares, porcentimpares, porcentnulos, porcentpares;
		int n;
		
		pares = 0;
		impares = 0;
		nulos = 0;
		System.out.println(" Los número al azar del 1 al 36, 15 serán dados al azar ");
		for (i=1;i<=15;i++) {
			n = (int)(Math.random()*36)+1;
			div = n%2;
			System.out.println(n);
			if (n==0) {
				nulos = nulos+1;
		} else {
				if (div==0) {
					pares = pares+1;
				} else {
					impares = impares+1;
				}
			}
		}
		porcentpares = (pares*100)/15;
		porcentimpares = (impares*100)/15;
		porcentnulos = (nulos*100)/15;
		System.out.println("El porcentaje de la probabilidad de pares es : "+porcentpares+"%.");
		System.out.println("El porcentaje de la probabilidad de impares es: "+porcentimpares+"%.");
		System.out.println("El porcentaje de la probabilidad de  ceros es : "+porcentnulos+"%.");
	}


}

