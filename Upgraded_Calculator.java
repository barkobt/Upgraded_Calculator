import java.util.Scanner;

/*
Gelişmiş Hesap Makinesi
Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
 */
public class Upgraded_Calculator {

    static void sum() {
        int number, result = 0, i = 1;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(i + ". Sayı:");
            number = scan.nextInt();
            result += number;
            System.out.println("Sonuç: " + result);
            i++;
            if (number == 1) {
                break;
            }
        }
    }

    static void minus() {
        int number, result = 0, i = 1;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print(i + ". Sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
            } else {
                result -= number;
            }
            System.out.println("Sonuç : " + result);
            i++;
            if (number == 0) {

            }
        }
    }

    static void product() {
        int number, result = 1, i = 1;
        while (true) {
            System.out.print(i + ". Sayıyı giriniz: ");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            result *= number;
            System.out.println("Sonuç: " + result);

            i++;
            if (number == 1) {
                break;
            }
        }
    }

    static void divided() {
        int number, i = 1;
        double result = 0.0;
        while (true) {
            System.out.print(i + ". Sayıyı giriniz:");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            if (i == 1) {
                result += number;
            } else {
                if (i != 1 && number == 0) {
                    System.out.println("Bölen sayısı 0'dan farklı olmalıdır.");
                } else {
                    result /= number;
                }
            }
            System.out.println("Sonuç: " + result);
            i++;
        }
    }


    static void power() {
        int base, times, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        base = scan.nextInt();
        System.out.print("Üssü giriniz: ");
        times = scan.nextInt();
        for (int i = 1; i <= times; i++) {
            result *= base;
        }
        System.out.print("Sonuç: " + result);
        System.out.println(" ");
    }

    static void faktoriel() {
        int result = 1, number, i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyel hesabını istediğiniz sayıyı giriniz: ");
        number = scan.nextInt();
        for (i = number; i >= 1; i--) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        int result = 0, number, i;
        Scanner scan = new Scanner(System.in);
        for (i = 1; i <= 2; i++) {
            System.out.print(i + ". Sayıyı giriniz:");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
            } else {
                result %= number;
            }
        }
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        int first, second, area = 1, perimeter = 0;
        System.out.print("Kısa kenarı giriniz: ");
        Scanner scan = new Scanner(System.in);
        first = scan.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        second = scan.nextInt();
        area *= first * second;
        perimeter += (2 * (first + second));
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
    }


    public static void main(String[] args) {
        System.out.println("Hesap Makinesi Programına Hoşgeldiniz!");
        String menu = ("1-Toplama İşlemi\n")
                + ("2-Çıkarma İşlemi\n")
                + ("3-Çarpma İşlemi\n")
                + ("4-Bölme İşlemi\n")
                + ("5-Üs Alma\n")
                + ("6-Faktoriyel Hesaplama\n")
                + ("7-Mod Alma\n")
                + ("8-Dikdörtgen Alan ve Çevre Hesabı\n")
                + ("9-Çıkış Yap");
        boolean run = true;
        while (run) {
            System.out.println(menu);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            if (selection == 9) {
                System.out.println("Hoşçakalın...");
                run = false;
            }
            switch (selection) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    product();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    faktoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");



            }
        }

    }
}

