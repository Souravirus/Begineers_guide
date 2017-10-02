#include<stdio.h>

int main(){
    int a=10;
    int *ptr=&a;
    printf("%d\n", a);
    printf("%p\n", &a);
    printf("%d\n", *ptr);
    printf("%p\n", ptr);
    printf("%p\n", &ptr);

    int arr[5];
    printf("Enter 5 numbers to put in an array\n");
    
    for(int i=0; i < 5; i++)
        scanf("%d", &arr[i]);

    for(int i=0; i < 5; i++)
        printf("%d ", *(arr+i));
    return 0;
}
