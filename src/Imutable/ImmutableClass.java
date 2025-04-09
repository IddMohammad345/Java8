package Imutable;
public final class ImmutableClass {
    private final String name;
    private final int age;
    //Constructor to initialize fields
    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Getter methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Main{
    public static void main(String[] args) {
        ImmutableClass im=new ImmutableClass("Idd mohammad",20);
        System.out.println("name : "+im.getName()+"\n age : "+im.getAge());
    }
}
