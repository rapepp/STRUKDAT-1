package Prak;
import java.util.Scanner;

public class Segitiga<T> {
    private T alas;
    private T tinggi;


    public void setAlas(T alas) {
        this.alas = alas;
    }

    public void setTinggi(T tinggi) {
        this.tinggi = tinggi;
    }

    public T getAlas() {
        return alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public <T> int getResultAsInt() {
        return (int) alas * (int) tinggi / 2;
    }

    public <T> double getResultAsDouble() {
        return (double) alas * (double) tinggi / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Segitiga<Integer> hasilInt = new Segitiga<Integer>();
        Segitiga<Double> hasilDouble = new Segitiga<Double>();

        int pilih;

        System.out.println(" === HITUNG LUAS SEGITIGA ===");
        System.out.println(" 1. Integer ");
        System.out.println(" 2. Double ");
        System.out.print(" Masukkan pilihan : ");
        pilih = sc.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.print(" Masukkan alas: ");
                hasilInt.setAlas(sc.nextInt());

                System.out.print(" Masukkan tinggi: ");
                hasilInt.setTinggi(sc.nextInt());

                System.out.println(" Luas Segitiga dalam Integer : " + hasilInt.getResultAsInt());
                break;

                case 2:
                System.out.print(" Masukkan alas: ");
                hasilDouble.setAlas(sc.nextDouble());

                System.out.print(" Masukkan tinggi: ");
                hasilDouble.setTinggi(sc.nextDouble());

                System.out.println(" Luas Segitiga dalam Double : " + hasilDouble.getResultAsDouble());
                break;

                default:
                break;
        }

        sc.close();
    }
}