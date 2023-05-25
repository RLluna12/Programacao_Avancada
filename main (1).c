/******************************************************************************

Cilene - 16/02/23 - Calculadora em C

*******************************************************************************/
#include <stdio.h>

int soma (int a, int b)
{
    return a+b;
}
int subtracao (int a, int b)
{
    return a-b;
}
int prod (int a, int b)
{
    return a*b;
}
int resto (int a, int b)
{
    return b%a;
}
int divisao (int a, int b)
{
    return a/b;
}


int main()
{
    int a=22, b=223;
    
    // Saída
    printf ("Soma = %d", soma(a,b));
    printf ("\nSubtracao = %d", subtracao(a,b));
    printf ("\nProduto = %d", prod(a,b));
    printf ("\nDivisao = %d", divisao(a,b));
    printf ("\nResto = %d", resto(a,b));

    return 0;
}

