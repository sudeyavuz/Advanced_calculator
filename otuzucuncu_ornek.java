package JAVA101;
import java.util.Scanner;
public class otuzucuncu_ornek {
    static int sum(int a ,int b ){
        int result = a+b;
        System.out.println("toplam= "+result);
        return result;
    }
    static int sub(int a,int b ){
        int result = a-b;
        System.out.println("çıkarma: "+result);
        return result;
    }
    static int times(int a,int b ){
        int result = a*b;
        System.out.println("çarpma: "+result);
        return result;
    }
    static int divided(int a, int b ){
        if (b==0){
            System.out.println("girilen değer 0dan farklı olmalıdır!");
            return 0;
        }
        int result = a/b;
        System.out.println("bölme: "+result);
        return result;
    }
    static int power(int a,int b ){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("üs alma: "+result);
        return result;
    }
    static void factorial(int a,int b){
        int result=1,result1=1;
        for (int i=1;i<=a;i++){
            result*=i;
        }for (int j=1;j<=b;j++) {
            result1 *= j;
        }
        System.out.println("iki sayının faktöriyeli: "+result+" "+result1);
    }
    static int mod(int a,int b){
        int result= a%b;
        System.out.println("mod: "+result);
        return result;
    }
    static int calc(int a,int b){
        int alan = a*b;
        int cevre = 2*(a+b);
        System.out.println("alan: "+alan+"çevre: "+cevre);
        return alan+cevre;
    }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int select;
            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";
            while (true) {
                System.out.println(menu);
                System.out.print("bir işlem seçiniz");
                select = scan.nextInt();

                if (select==0){
                    break;
                }

                System.out.println("işlem yapılacak ilk sayı: ");
                int a = scan.nextInt();
                System.out.println("işleme girecek ikinci sayı: ");
                int b = scan.nextInt();


                switch (select) {
                    case 1:
                        sum(a,b);
                        break;
                    case 2:
                        sub(a,b);
                        break;
                    case 3:
                        times(a,b);
                        break;
                    case 4:
                        divided(a,b);
                        break;
                    case 5:
                        power(a,b);
                        break;
                    case 6:
                        factorial(a,b);
                        break;
                    case 7:
                        mod(a,b);
                        break;
                    case 8:
                        calc(a,b);
                        break;
                    default:
                        System.out.println("geçersiz sayı girdiniz!");



                }
            }
        System.out.println("güle güle!");
    }
}
