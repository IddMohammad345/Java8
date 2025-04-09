import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator /*implements Runnable*/ {
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        //Calculate the period between the birthDate and Current date
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
        LocalDate b = LocalDate.of(2002, 01, 15);
        LocalDate n = LocalDate.now();
        int age = calculateAge(b, n);
        System.out.println(age);
        /*
        AgeCalculator cal=new AgeCalculator();
        Thread thread=new Thread(cal);
        MyAnotherThread anotherThread=new MyAnotherThread();
        Thread thread1=new Thread(anotherThread);
        thread1.start();
        thread.start(); */
    }
}

   /* @Override
    public void run() {
        //Example birthDate (year,month,day)
        LocalDate birthDate=LocalDate.of(1990,5,15);
        //Get current Date
        LocalDate currentDate=LocalDate.now();

        int age =calculateAge(birthDate,currentDate);
        System.out.println(age);

        //Just for testing threads
        for (int i=0;i<=5;i++){
            for (int j=0;j<=10;j++) {
                if (i>j ) {
                    System.out.print("**");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println("*");
        }
    }
}
class MyAnotherThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=10; i++){
            System.out.println(i*2);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
*/