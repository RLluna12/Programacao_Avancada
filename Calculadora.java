public class Calculadora{
    int x;
    int y;
    int result;
    public Calculadora(int a, int b){
        x=a;
        y=b;
    }
    public void potencia(){
   //     result = Math.pow(x,y);
        
    }
    public void soma(){
        result = x+y;
       
    }
    public void mostraResultado(){
        System.out.println("resultado= "+result);
         
    }
     public void produto(){
        result = x*y;
       
    }
}