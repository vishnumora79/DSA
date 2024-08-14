// Finding the minimum and maximum values of array

#include<stdio.h>

void minmax(int a[],int n,int *max, int *min)
{
    *max = *min = a[0];
    for(int i=1;i<n;i++)
    {
        if(a[i] > *max)
          *max = a[i];
        if(a[i] < *min)
          *min = a[i];
    }
}

int main()
{
    int a[] = {45,33,6,78,25};
    int n = sizeof(a) / sizeof(a[0]);
    int max,min;
    minmax(a,n,&max,&min);
    printf("The maximum and minimum values of array are %d and %d",max,min);
    return 0;
}


// Finding mid value ofv an array using pointers

#include<stdio.h>

int *findMid(int a[],int n)
{
    return &a[n/2];
}

int main()
{
    int a[] = {1,2,3,4,5};
    int n = sizeof(a) / sizeof(a[0]);
    int *mid = findMid(a, n);
    printf("The mid value of array is :%d",*mid);
    return 0;
}


Note: never ever try to return the address of local variable

#include<stdio.h>

int *func()
{
    int i = 10;
    return &i;
}
int main()
{
    int *ptr = func();
    printf("%d",*ptr);
}

output:function returns the address of local variable

#include<stdio.h>

checking the output for the below code : 
int main()
{
    int i = 10,*ptr = &i;
     ptr = &i;
    printf("%d",*ptr);
}

output: 10

con't change the constant value using pointers
int fun(const int *i)
{
    *i = 2;
    return *i;
}

int main()
{
    const int i = 10;
    int a = fun(&i);
    printf("%d",a);
}
output: error: assignment of read-only location ‘*i’

prints the address of a variable
int main()
{
    int i = 10;
    int *ptr = &i;
    printf("the address of variable %d is %p",i,ptr);
    return 0;
}
output: the address of variable 10 is 0x7ffcf90164dc

