package DXC;

public class Tester {

	public static void main(String[] args)
	{
		Teacher object[]=new Teacher[4];
		object[0]=new Teacher("Alex","Java Fundamental",1200.0);
		object[1]=new Teacher("John","RDBMS",800.0);
		object[2]=new Teacher("Sam","Networking",900.0);
		object[3]=new Teacher("Maria","Python",900.0);
		for(int i=0;i<4;i++)
		{
			object[i].display();
		}
	}

}
