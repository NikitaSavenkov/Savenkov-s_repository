import java.util.Scanner;
public class Lab1_1
{
	/**Проверка всех чисел от 2 до n */
	public static void run()
	{
		int n = insert();
		for (int i=2; i<= n; i++)
		{
			if(check(i))
				output(i);
		}
		return;	
	}
	
	/**Чтение числа из консоли */
	public static int insert()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}

	/**Вывод числа в консоль */
	public static void output (int i)
	{
		System.out.println(i);
	}
	
	/**Проверка, является ли число простым или нет */
	public static boolean check (int k)
	{
		for (int i=2; i<k; i++)
		{
			if (k%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}