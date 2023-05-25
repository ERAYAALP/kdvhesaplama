import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.Scanner;
public class odev2
{
    public static void  main(String[] args)
    {
        double ucret,kdvOran=0.18,kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        ucret=input.nextDouble();

        kdvOran=(ucret>1000)?0.8:0.18;
        kdvTutar=ucret*kdvOran;
        kdvliTutar=ucret+kdvTutar;

        System.out.println("KDV'siz Tutar: "+ ucret);
        System.out.println("KDV'li Tutar: "+ kdvliTutar);
        System.out.println("KDV oranı: "+ kdvOran);
        System.out.println("KDV tutarı: "+ kdvTutar);




    }
}
