public class Triangulo{
    int ladoa;
    int ladob;
    int ladoc;
    
    public Triangulo(int a, int b, int c){
        ladoa = a;
        ladob = b;
        ladoc = c;
    }
    public int formaTriangulo(){
        int aux = 0; // nao é um triangulo
    //maior q o valor absoluto
        if(ladoa > diferenca(ladob,ladoc) && 
           ladob > diferenca(ladoa,ladoc) &&
           ladoc > diferenca(ladoa,ladob) &&
    //menor q a soma dos outros dois lados
           ladoa < ladob + ladoc &&
           ladob < ladoa + ladoc &&
           ladoc < ladoa + ladob
        )
        aux = 1;
        return aux;
    }
    private int diferenca(int a, int b){
        int aux;
        if(a > b){
            aux= a-b;
        }
        else{
            aux= b-a;
        }
        return aux;
    }
    public void mostraTipo(){
        //equilatero (3 lados sao iguais)
        //Isosceles (2 lados sao iguais e um diferente)
        //Escaleno ( 3 lados sao diferentes)
        
        if  (ladoa==ladob && ladoa == ladoc){
            System.out.println("Equilatero");
        }
        else if(ladoa != ladob && ladoa!= ladoc && ladob != ladoc){
              System.out.println("Escaleno");
        }
        else{
            System.out.println("Isosceles");
        }
    }
    public int perimetro(){
      return ladoa+ladob+ladoc;
    }
    public double area(){
       
    }
    
    
}
