class pyare
{
public static void main(String []args)
{
 int i=0;
while(i<=3){
int j=3;
while(j>=i){
System.out.print(" ");
j--;
}
int k=0;
while(k<=i)
{
System.out.print("* ");
k++;
}
System.out.println();
i++;
}
}
}
