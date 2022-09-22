/*4. Create an interface called calculate which has methods int add(int x, int y) and int diff(int x,
int y) to perform addition and subtraction of numbers passed as an arguments. Then define a
class that implements interface calculate. */

/*
 * author: @pray3m
 */

interface calculate{
    void add(int x,int y);
    void difference(int x,int y);
}

class calculator implements calculate {
    public void add(int y, int x) {
        System.out.println("The sum is : " + (x + y));
    }

    public void difference(int x, int y) {
        System.out.println("The difference is : " + (x - y));
    }
}

public class InterfaceCalculate {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(5,7);
        c.difference(7,4);
    }
}
