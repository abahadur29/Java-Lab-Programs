interface motor
{
int capacity=5;
void run();
void consume(); 
}


class Washing_Machine implements motor 
{

public void run()
{
System.out.println("Capacity of the Washing Machine is Capacity:"+capacity);
}

public void consume()
{
System.out.println("Consumed");
}

}


class x
{
public static void main(String[] args)
{
motor a = new Washing_Machine();
a.run();
a.consume();
}
}
