import java.util.Scanner;  
public class Main   
{  
public static void main(String args[])   
{  
int n = 100;
System.out.println("");  
//for loop executes until the condition i<=n becomes false  
for (int i = 1; i <= n; i++)   
{  
//returns true if both the conditions return true  
if (i%3==0 && i%5==0)   
{   
//prints if the number is multiple of 3 and 5  
System.out.println("FizzBuzz");  
}   
//executes if the condition returns true  
else if (i%3==0)   
{  
//prints if the number is multiple of 3  
System.out.println("Fizz");  
}   
//executes if the condition returns true  
else if (i%5==0)   
{   
//prints if the number is multiple of 5  
System.out.println("Buzz");  
}   
else   
{  
//prints the number itself if the number is not divisible by both 3 and 5     
System.out.println(i);  
}  
//prints space  
System.out.println(" ");  
}  
}  
}  