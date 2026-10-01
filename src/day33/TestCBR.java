package day33;

public class TestCBR
{
    static void main() {
        CBR cbr = new CBR(1, 5);
        System.out.println("=====Assigning Value through Constructor==========");
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

        System.out.println("=======Updating the Values through Setter Method====");
        cbr.setA(10);
        cbr.setB(50);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

        System.out.println("=======Updating the Values through CallByReference====");
        cbr.updateValue(cbr, 25, 67);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

    }
}
