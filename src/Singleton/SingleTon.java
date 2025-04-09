package Singleton;
 class SingleTon {
    public static SingleTon instance;
    private SingleTon(){
        System.out.println("Singleton is Instantiated.");
    }
    public static SingleTon getInstance(){
        if (instance == null)
            instance =new SingleTon();
        return instance;
    }
    public static void doSomething(){
        System.out.println("Something is Done.");
    }
}
class GFG{
    public static void main(String[] args) {
        SingleTon.getInstance();
        SingleTon.doSomething();
    }
}
