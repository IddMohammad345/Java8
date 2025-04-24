package Java8_PracticeFrom_drive;

public class ReverseStringWithOwnMethod {
    public static void main(String[] args) {
        String str="java Developer";
        char[] arr=str.toCharArray();
        int a=0;
        int b=arr.length-1;
        while (b>a){
            char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        System.out.println(arr);
    }
}
