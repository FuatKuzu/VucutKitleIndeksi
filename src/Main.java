import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo, boy,vucutIndex;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        vucutIndex = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vucutIndex);
    }
}