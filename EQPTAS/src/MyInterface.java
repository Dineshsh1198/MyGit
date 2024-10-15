
interface Test {
    void draw();
}
class Example implements Test {
    @Override
    public void draw() {
        System.out.println("Deer");
    }
}


public class MyInterface implements  Test  {
    @Override
    public void draw() {
        System.out.println("lion");
    }
    public static void main (String args[]){
        MyInterface obj = new MyInterface();
        Example obj2 = new Example();
        obj.draw();
        obj2.draw();
    }
}
