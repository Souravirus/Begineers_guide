#include<stdio.h>

int main(){
    printf("Enter any integer:\n");
    int a;
    scanf("%d", &a);
    printf("%d\n", a);
    
    //I have included getchar, otherwise when I am scanning a character it is taking the newline as a character
    getchar();
    printf("Enter any character:\n");
    char c;
    
    scanf("%c", &c);
    printf("%c\n", c);

    printf("Enter any float:\n");
    float f;
    scanf("%f", &f);
    printf("%f\n", f);

    printf("Enter any long integer:\n");
    long li;
    scanf("%ld", &li);
    printf("%ld\n", li);

    printf("Enter any long long integer:\n");
    long long lli;
    scanf("%lld", &lli);
    printf("%lld\n", lli);

    printf("Enter any unsigned long long integer:\n");
    unsigned long long ulli;
    scanf("%llu", &ulli);
    printf("%llu\n", ulli);
}
