/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String mensa = "Ola Mundo sdfsf fdsfsld fdslfds fdsfs" + (10+20);
	  	System.out.println(mensa);
		System.out.println("Tamanho da mensagem: "+ mensa.length());
		System.out.println("Em maiusculo: "+ mensa.toUpperCase());
		System.out.println("Em minusculo: "+ mensa.toLowerCase());
		System.out.println("Substituir s por x : " + mensa.replace('s', 'x'));
		System.out.println("Substituir Mundo por Word : " + mensa.replace("Mundo", "Word"));
		System.out.println("Posicao da letra a é : " + mensa.indexOf('a'));
		System.out.println("Na posiçao 2 temos : " + mensa.charAt(2));
		System.out.println("Extraindo uma parte : " + mensa.substring(0,  3));
		System.out.println("--------------------------------------");
		//Classe Math do Java
		
		System.out.println("18 elevado ao cubo = "+ Math.pow(18,3));
	    System.out.println("Raiz quadrada de 1024 = "+ Math.sqrt(1024));
	}
}
