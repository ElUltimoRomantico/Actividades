/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.scanner;
public class Main

{
	public static void main(String[] args) {
		System.out.println("Edwin Santiago Reyes Ospina");
		System.out.println(" Tipo de conversion ");
		System.out.println("1. Rectangulares a polares");
		System.out.println("2.Polares a Rectangulares ");
		int opcion = scanner.nextInt();
		
		switch (opcion){
		    case 1:
		        convertirPolaresRectangulares(scanner);
		        break;
		  case 2:
		      convertirPolaresRectangulares(scanner);
		      break;
		      default:
		      System.out.println("error")
		      
		}
	}
}
