package day33;

public class CBR {
    private int a;
    private int b;

    public CBR(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

//    public void updateValue(CBR cbr) {
//        cbr.a = 100;
//        cbr.b = 500;
//    }

    public void updateValue(CBR cbr, int a, int b) {
        setA(a);
        setB(b);
    }


}
