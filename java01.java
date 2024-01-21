package JAVA01;
import java.util.Scanner;
public class java01 {

	public static void main(String[] args) {
		
		System.out.println("1、B\n2、B\n3、D\n4、B\n5、D\n");
		
		Scanner reader = new Scanner(System.in);
		//打印杨辉三角
//		System.out.println("请输入想要打印的等腰三角形的行数:");
//		int n = reader.nextInt();
//		showTriangle(n);
		//逆序输出
//		System.out.println("请输入一个正整数：");
//		String s = reader.nextLine();
//		reverseSUM(s);
		//回文数
//		int num = reader.nextInt();
//		isPalindrome(num);
		//水仙花数
//		ShuixianHua();
		//最大数最小数之和
//		int a[] = {0,1,2,3,4,5,6,7,8,9};
//		arrayDemo(a);
	}
	
public static void showTriangle(int n)
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<2*i+1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}

public static void reverseSUM(String s)
{
	char[] chars = s.toCharArray();
	int count=chars.length;
	System.out.println("您输入的正整数的位数为："+count);
	for(int i=0;i<count/2;i++)
	{
		int j = count-1-i;
		char tmp = chars[i];
		chars[i] = chars[j];
		System.out.println(chars[i]);
		chars[j] = tmp;

	}
	String s1 = String.valueOf(chars);
	System.out.print("您输入的正整数的逆序是：");
	System.out.println(s1);
}

public static void isPalindrome(int num)
{
	boolean flag = true;
	
	char[] a = String.valueOf(num).toCharArray();
	for(int i=0;i<a.length/2;i++)
	{
		int j=a.length-1-i;
		if(a[i]!=a[j])
		{
			flag=false;
		}
	}
	if(flag)
	{
		System.out.println("是的");
	}else
	{
		System.out.println("不是");
	}
}
public static void ShuixianHua()
{
	
	for(int n=100;n<=999;n++)
	{
		int result = 0;
		char[] a = String.valueOf(n).toCharArray();
		for(int i=0;i<3;i++)
		{
			int tmp = Integer.parseInt(String.valueOf(a[i]));
			result += tmp*tmp*tmp;
		}
		if(result==n)
		{
			System.out.print(n+" ");
		}
	}
}

public static void arrayDemo(int[] numarray)
{
	int min = Integer.parseInt(String.valueOf(numarray[0]));
	int max = Integer.parseInt(String.valueOf(numarray[0]));
	for(int i=1;i<numarray.length;i++)
	{
		int tmp=Integer.parseInt(String.valueOf(numarray[i]));
		if(min>tmp)
		{
			min = tmp;
		}
		if(max<tmp)
		{
			max = tmp;
		}
	}
	int sum = min+max;
	System.out.println("最小值为："+min+"\n"+"最大值为："+max+"\n"+"和为："+sum);
	
}

}
