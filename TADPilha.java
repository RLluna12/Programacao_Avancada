/***********************************************
Classe Pilha 30/03 
************************************************/
public class TADPilha{
    int dados[];
    int topo;
    int capacidade;
    
    public TADPilha(int c){
    capacidade = c;
    topo = -1;
    dados = new int [capacidade];
    }
    
    public boolean empilha(int x){
        if(!cheia()){
        topo++;
        dados[topo] = x;
        return true;
        }
        System.out.println("cheia !");
        return false;
    }
    
    public void mostraAoContrario(){
        for(int i=topo;i>=0;i--){
            System.out.println(dados[i]);
        }
    }
     public void mostra(){
        for(int i=0;i<=topo;i++){
            System.out.println(dados[i]);
        }
    }
    
    public boolean cheia(){
        return (topo==capacidade-1);
        
    }
    public boolean vazia(){
        return (topo==-1);
    }
    public int conta(){
        return topo+1;
    }
    
    
}