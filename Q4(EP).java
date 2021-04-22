4.	To learn use of two dimensional array by defining the array is dynamically.


class prog4{
public static void main(String args[]){

int a[][]=new int [5][];
a[0]=new int [1];
a[1]=new int [2];
a[2]=new int[3];
a[3]=new int[4];
a[4]=new int[5];
int k=0;
for(inti=0;i<5;i++)
{
for(int j=0;j<i+1;j++){
a[i][j]=k;
k++;
}}
for(inti=0;i<5;i++)
{
   for(int j=0;j<i+1;j++){
System.out.print(a[i][j]+" ");}
System.out.println();}}}


Output - 
  
0
1 2
3 4 5
6 7 8 9
10 11 12 13 14
