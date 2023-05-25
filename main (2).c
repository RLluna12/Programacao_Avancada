/******************************************************************************
 Aula 11/05       manipulaçao de arquivos
*******************************************************************************/
#include <stdio.h>
#include <conio.h>

FILE *arq;
int quantiLinhas=10;
char nomeArq[20]="Exemplo.txt";


void lerAquivo(){
    //abra o arquivo para leitura (r)
    arq = fopen(nomeArq, "r");
    
    //Le os dados e imprime na tela
    char linha[100], *result;
    int i =1;
    while(!feof(arq)){
        result = fgets(linha, 100, arq);
        if(result) printf("linha %d > %s",i,linha);
        i++;
    }
    fclose(arq);
}
void gravarAquivo(){
   int result;
   //Abre arquivo para gravaçao (w)
   arq = fopen(nomeArq, "w");
   //Grava linha no arquivo
   for(int i =1;i<=quantiLinhas; i++){
      fprintf(arq,"Conteudo %d\n",i);
   }
   fclose(arq);
    
}

void main()
{
    printf("\n Gerando o arquivo...");
    gravarAquivo();
    printf("\n Lendo o arquivo...\n");
    lerAquivo();
    
}
