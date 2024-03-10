//Exercise: 1.   Write a java equation class and...
//....print the value of b-a and c-b in separate method where a=10, b = 15 and c = 20;

package extra;

public class Method {
    private int a;
    private int b;
    private int c;

    public Method(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int calculateBA() {
        return b - a;
    }

    public int calculateCB() {
        return c - b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        Method equation = new Method(a, b, c);

        System.out.println("b-a = " + equation.calculateBA());
        System.out.println("c-b = " + equation.calculateCB());
    }
}
