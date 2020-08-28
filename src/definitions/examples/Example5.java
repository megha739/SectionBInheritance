/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 12:28 PM
 *  File Name : Example5.java
 * */
package definitions.examples;

public class Example5 {
    public static void main(String[] args) {
        A2 objectA2 = new A2();
        B2 objectB2 = new B2();
    }
}
class A2 {
    private int j;
    private int k;

    public void setValues(int x, int y) {
        j = x;
        k = y;
    }

    public int m;
    void displayA() {
        System.out.println("j = " + j + ", k = " + k);
        System.out.println("(m * j * k) = " + (m * j * k));
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
}
class B2 extends A2 {
    int p;

    void displayB() {
        System.out.println("p = " + p);
        System.out.println("(p * m) = " + (p * m));
    }
}











