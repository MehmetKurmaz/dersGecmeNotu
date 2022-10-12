import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,kim,fiz,turk,muz;
        double ortalama,sonuc;
        String hata="Lutfen Gecerli Bir Not Giriniz";
        System.out.print("Matematik Notunu Giriniz :");
        mat=input.nextInt();
        if (!(mat>0 && mat<100)){
            System.out.println(hata);
            return;
        }
        System.out.print("Kimya Notunu Giriniz :");
        kim=input.nextInt();
        if (!(kim>0 && kim<100)){
            System.out.println(hata);
            return;
        }
        System.out.print("Fizik Notunu Giriniz :");
        fiz=input.nextInt();
        if (!(fiz>0 && fiz<100)){
            System.out.println(hata);
            return;
        }
        System.out.print("Turkce Notunu Giriniz :");
        turk=input.nextInt();
        if (!(turk>0 && turk<100)){
            System.out.println(hata);
            return;
        }
        System.out.print("Muzik Notunu Giriniz :");
        muz=input.nextInt();
        if (!(muz>0 && muz<100)){
            System.out.println(hata);
            return;
        }
        ortalama= (mat+kim+fiz+turk+muz)/5;
        System.out.print("Ortalamaniz :"+ortalama);

        if (ortalama<55){
            System.out.println("\nUzgunuz Sinifta Kaldiniz..");

        }else System.out.println("\nTebrikler Sinifi Gectiniz");


    }
}