#include<stdio.h>
int main(){
    int a, b;
    printf("Enter the value of a:");
    scanf("%d", &a);
    printf("Enter the value of b:");
    scanf("%d", &b);
    if(a > b)
        printf("a is greater than b\n");
    else if(a < b)
        printf("a is lesser than b\n");
    else
        printf("a is equal to b\n");
}
