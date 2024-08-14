#include <stdio.h>
int main()
{
    // The main difference between gets() and fgets() is that gets() since it doesn't perform any array bound checking
    // and keep reading the characters until the new line (enter) is encountered. 
    // It suffers from buffer overflow, which can be avoided by using fgets()
    
    char a[20];
    printf("Enter the name:\n");
    fgets(a,20,stdin);   // used to get input based on given length from stdin
    printf("%s",a);
    puts(a);  // used to print the strings - similar to printf()
    return 0;
    
    char s[20];
    int a[20] = {1,2,3,4,5,6,7};
    printf("Enter the name:");
    fgets(s,20,stdin);
    int x = puts(s);
    printf("%d",x);
    printf("%d",a[9]);
    
    int a[5] = {1,2,3,4,7,6};
    printf("%d",a[5]);
}
