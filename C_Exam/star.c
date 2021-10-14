#include <stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    srand(time(0));
    int star = (rand() % 3)+3; 
    printf("Star의 값 : %d \n", star); 
    int i = 0, z = 0;
 
        for ( i = 0; i < star; i++ )
        {
            for ( z = 0; z <= i; z++ )
                printf("*");
            printf("\n");
        }
return 0;
}
