#include<stdio.h>
#include<string.h>

// Example - 1 
struct student {

 int roll;
 char name[30];
 int age;
 struct student *next;
};

int main() {

struct student n1,n2,n3;
struct student *p;

//   printf("Enter details for student 1 (roll,name,age):");
//   scanf("%d %s %d",&n1.roll,n1.name,&n1.age);
//   printf("Enter details for student 2 (roll,name,age):");
//   scanf("%d %s %d",&n2.roll,n2.name,&n2.age);
//   printf("Enter details for student 3 (roll,name,age):");
//   scanf("%d %s %d",&n3.roll,n3.name,&n3.age);
n1.roll = 1;
strcpy(n1.name,"vishnu");
n1.age = 23;
n2.roll = 2;
strcpy(n2.name,"vishnu");
n2.age = 21;
n3.roll = 3;
strcpy(n3.name,"vishnu");
n3.age = 24;
n1.next = &n2;
n2.next = &n3;
n3.next = NULL;

p = &n1;
while(p != NULL) {
printf("\n%d %s %d",p->roll,p->name,p->age);
p = p->next;
}
return 0;
}


// Example - 2

#include<stdio.h>
#include<string.h>

struct emp {
    int empId;
    char empName[30];
    int salary;
    int mgrId;
    struct emp *next;
};

int main() {
    struct emp e1,e2;
    struct emp *p;
    
    e1.empId = 123;
    strcpy(e1.empName,"vishnu");
    e1.salary = 10000;
    e1.mgrId = 234;
    
    e2.empId = 456;
    strcpy(e2.empName,"narasimha");
    e2.salary = 15000;
    e2.mgrId = 567;
    
    e1.next = &e2;
    e2.next = NULL;
    p = &e1;
    
    while(p != NULL){
      printf("\n%d %s %d %d",p -> empId,p -> empName, p -> salary, p-> mgrId);   
      p = p -> next;
    }
    return 0;
}


// Example - 3
#include<stdio.h>
#include "stdlib.h"

struct node {
    int data;
    struct node *next;
};

void createList(int n) {
    struct node *newNode, *temp;
    int data,i;
    
    newNode = (struct node *)malloc(sizeof(struct node));
    
    if(newNode == NULL)
    {
        printf("Unable to allocate memeory.");
    }
    else {
        printf("Enter the data of node 1:");
        scanf("%d",&data);
    }
    
    newNode->data = data;
    newNode->next = NULL;
    temp = newNode;
    
    for(i = 2;i<=n;i++) {
        newNode = (struct node *) malloc(sizeof(struct node));
        if(newNode == NULL) {
            printf("Unable to allocate memeory.");
            break;
        }
        else {
            printf("Enter the data of node %d",i);
            scanf("%d",&data);
            newNode->data = data;
            newNode->next = NULL;
            temp->next = newNode;
            temp = temp->next;
        }
        }
    }
int main() {
    int n;
    printf("Enter the number of nodes:");
    scanf("%d",&n);
    createList(n);
    return 0;
}    