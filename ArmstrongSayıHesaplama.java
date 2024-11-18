import java.util.Scanner;

public class ArmstrongSayıHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan sayıyı al
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        
        // Armstrong sayısı kontrolü
        if (isArmstrong(number)) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }
        
        scanner.close();
    }
    
    // Armstrong sayısı olup olmadığını kontrol eden fonksiyon
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        
        // Basamakları üzerinden geçip her birinin üs hesabını yap
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        
        // Toplam, orijinal sayıya eşitse Armstrong sayısıdır
        return sum == originalNumber;
    }
}
