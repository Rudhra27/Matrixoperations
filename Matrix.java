public class Matrix
{
static int GetUserInputInt(String x)
{
	String a=" ";
	int b;
    System.out.println(x);
    String n = System.console().readLine(a);
    if (n.chars().allMatch(Character::isDigit))
    	{
          b = Integer.parseInt(n);
    	}
    else
        {

    	   System.out.println("Invalid input.  Please enter a valid number");
    	   return 0;
 	    }

    return b;
}
static void DiplayResultASM(int[][] a,int[][] b,int[][] c)
{
	System.out.println("First matrix:\n");
	for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(a[i][j]+"\t");
				}

				System.out.println();
			}
	System.out.println("Second matrix:\n");
	for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(b[i][j]+"\t");
				}

				System.out.println();
			}
	System.out.println("Resultant matrix:\n");
	for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(c[i][j]+"\t");
				}

				System.out.println();
			}

}

public static void main(String[] args)
{
int [][] a=new int [3][3];
int [][] b=new int [3][3];
int [][] c=new int [3][3];
int [][] atranspose=new int [3][3];
int [][] btranspose=new int [3][3];
int f=8;
System.out.println("Enter the elements of first 3*3 matrix : ");
for (int i=0;i<3;i++)
{
	for (int j=0;j<3;j++)
		a[i][j]= GetUserInputInt("Enter value for  a["+i+"]["+j+"]");
	}
System.out.println("Enter the elements of second 3*3 matrix : ");
for (int i=0;i<3;i++)
{
	for (int j=0;j<3;j++)
		b[i][j]= GetUserInputInt("Enter value for  b["+i+"]["+j+"]");
}
System.out.println("the first matrix is  a= ");
for (int i = 0; i < 3; i++)
{
	for (int j = 0; j < 3; j++)
    {
        System.out.print(a[i][j]+"\t");
    }

    System.out.println();
}
System.out.println(" the Second Matrix is b = ");

for (int i = 0; i < 3; i++)
{
    for (int j = 0; j < 3; j++)
    {
        System.out.print(b[i][j]+"\t");
    }

    System.out.println();
}
while (f!=0)
{
	System.out.println("enter\n '1'-to perform addition\n '2'-to perform subtraction\n '3'-to perform multipication\n '4'-to perform transpose\n '5'-to exit\n");
	String x = System.console().readLine();

	switch(x)
	{
		case "1":
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<3;j++)
					c[i][j]=a[i][j]+b[i][j];
			}
			DiplayResultASM(a,b,c);
			break;
		case "2":
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<3;j++)
					c[i][j]=a[i][j]-b[i][j];
			}
			DiplayResultASM(a,b,c);
			break;
		case "3":
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					for (int k = 0; k < 3; k++)
					{
						c[i][j] +=  a[i][k] * b[k][j];
					}
				}
			}
			DiplayResultASM(a,b,c);
			break;
		case "4":
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					atranspose[j][i] = a[i][j];
				}
			}
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					btranspose[j][i] = b[i][j];
				}
			}
			System.out.println(" the transprose of a is: ");
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(atranspose[i][j]+"\t");
				}

				System.out.println();
			}
			System.out.println(" the transprose of b is: ");
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(btranspose[i][j]+"\t");
				}

				System.out.println();
			}
			break;
		case "5":
			f=0;
			break;
    }
}
}
}