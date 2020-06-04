package JavaBasics;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		
		String names= "Tarun";
		System.out.print(names);
		System.out.println(" is my name");
		System.out.println(" is my name");
		
		int p=1;
		int q =p++;
		System.out.println(p);
		System.out.println(q);
		
		int a=1;
		int b =++a;
		System.out.println(a);
		System.out.println(b);
		
		int c=1;
		int d=c++ + ++c;
		System.out.println(d);
		System.out.println(c);
		
		int e=1, f=1;
		System.out.println(e++);
		System.out.println(++f);
		
		
		Object ob[]=new Object[5];
		ob[0]="test";
		ob[1]=1;
		ob[2]=1.2;
		ob[3]='c';
		ob[4]=true;
		
		for(i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
			
		}
		
		int ab[]=new int[5];
		System.out.println(ab.length);
		
		String name1="Tarun";
		System.out.println(name1.length());
		
		
		String strarr[][][]= new String[2][3][100];
		
		System.out.println(strarr[0][0].length);
	}

}
