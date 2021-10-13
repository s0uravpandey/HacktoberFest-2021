#include<omp.h>
#include<stdio.h>
void main()
{
printf("\n\nThe Static assigned Pattern is : \n");
#pragma parallel
{
int x,y;
#pragma omp parallel for schedule(static,5)
for ( x = 0; x < 5; x++) {
for(y=0; y<6; y++) {
printf("*");
}
printf("\n");
}
}
printf("\n\n Code by Yash Ray, 19BCE0235\n\n");
}