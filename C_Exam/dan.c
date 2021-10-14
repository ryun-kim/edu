#include <stdio.h>
 
 
int main()
{
    for (int i = 1; i <= 9; i++)
    {
        for (int z = 2; z <= 9; z++)
        {
            printf("%3d x %d = %2d", z, i, (i*z));
        }
        printf("\n");
    }
    return 0;
}