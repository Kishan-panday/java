



class A

{

int x=10,y=20;

A(int p,int q)

{

x=p;

y=q;

}

}

class B extends A
{

int z=30;

B(int r)

{
    z=r;
}



void display()

{

System.out.println("The data values are:"+ x+y+z);

}

}

class test{

public static void main(String args[])

{

B b=new B(5);

b.display();

}
}
