/******************************************************************************
30/03 - Testar pilha para converter em Binario

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	
	TADPilha p = new TADPilha(100);
	int n=10,resto;
	while(n!=0){
	    resto= n%2;
	    p.empilha(resto);
	    n=n/2;
	}
	System.out.println("Mostra ao Contrario");
	p.mostraAoContrario();
	System.out.println("Mostra normal");
	p.mostra();
	System.out.println("a pilha p tem " + p.conta() + " elementos");
	}

}
