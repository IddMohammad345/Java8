import java.util.Comparator;

public class Lmbr_Expn {



    public static void main(String[] args) {
        stram stram;
        stram = Integer::sum;
        System.out.println(stram.add(10,23));
    }
}

interface  stram{
    int add(int a,int b);

    

    //convert the following anonymous class to a lambda Expression
    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    };
}

class  obj{
    int no;
    String name;
    int ph ;

    public obj(int no, String name, int ph) {
        this.no = no;
        this.name = name;
        this.ph = ph;
    }
}
