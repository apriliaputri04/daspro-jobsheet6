import java.util.Scanner;

public class Pemilihan2Percobaan204 {
    public static void main(String [] args) {
        Scanner input04 = new Scanner(System.in);
        
    int totalsudut;

    int sudut1, sudut2, sudut3;
    System.out.println("Masukkan sudut1 : ");
    sudut1 = input04.nextInt();
    System.out.println("Masukkan sudut2 : ");
    sudut2 = input04.nextInt();
    System.out.println("Masukkan sudut3 : ");
    sudut3 = input04.nextInt();

    totalsudut = sudut1 + sudut2 + sudut3;

    if (totalsudut == 180 ){
        if(sudut1 == 90 || sudut2 == 90 || sudut3 == 90){
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        }else if (sudut1==sudut2 && sudut1==sudut3 && sudut2==sudut3 && sudut3==sudut1){
            System.out.println("Segitiga tersebut adalah sama sisi");
        }else if (sudut1==sudut2 || sudut1==sudut3 || sudut2==sudut3 || sudut3==sudut1){
            System.out.println("Segitiga tersebut adalah sama kaki");
        }else {
            System.out.println("Segitiga sembarang");
        }
    }else {
        System.out.println("Bukan segitiga");
    }
}
}