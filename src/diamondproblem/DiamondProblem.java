package diamondproblem;
public class DiamondProblem {
    public static void main(String[] args) {
        impl impl=new impl();
        impl.show();
    }
}
class impl implements k,L{
    @Override
    public void show() {
        k.super.show();
    }
}
interface k extends M{
    public default void show(){
        System.out.println("this is show from K");
    }
}

interface L extends M{
    public default void show(){
        System.out.println("this is show from L");
    }
}
interface M{
    public default void show(){
        System.out.println("this is show from M");
    }
}