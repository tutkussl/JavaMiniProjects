//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 4583;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        if(number==1){
            System.out.println("Sayı asal değildir");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz Sayı");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }


        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }

}