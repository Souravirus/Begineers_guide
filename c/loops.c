#include<stdio.h>

int main(){
    int a[10];
    
    printf("Enter 5 numbers:");
    for(int i=0; i < 5; i++)
        scanf("%d", &a[i]);

    int i = 0; 

    while(i < 5)
    {
        printf("%d ", a[i]);
        i++;
    }
    printf("\n");  

    i = 0;
    
    do{
        printf("%d ", a[i]);
        i++;
    }while( i < 5);
    printf("\n");

    return 0;
}
