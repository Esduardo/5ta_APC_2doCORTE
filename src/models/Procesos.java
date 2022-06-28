package models;

public class Procesos {

    static private int bandefaFinal = 0;
    static private int bandera1 = 0;
    static private int bandera2 = 0;
    static private int bandera3 = 0;

    public  void proceso1(int H, int M, int S) {
        if (H > 0 && H < 24) {
            bandera1 = bandera1 + 1;
        } else {
            bandera1 = 0;
        }
        if (M > 0 && M < 59) {
            bandera2 = bandera2 + 1;
        } else {
            bandera2 = 0;
        }
        if (S > 0 && S < 59) {
            bandera3 = bandera3 + 1;
        } else {
            bandera3 = 0;
        }
    }
    public int proceso2(){
        int i = 1;
        int j = 0;
        if(bandera1 == i && bandera2 == i && bandera3 == i){
            bandefaFinal = bandefaFinal + 1;
        }
        else{
            bandefaFinal = 0;
        }
        return bandefaFinal;
    }
    public static int getBandefaFinal() {
        return bandefaFinal;
    }

    public static int getBandera1() {
        return bandera1;
    }

    public static int getBandera2() {
        return bandera2;
    }

    public static int getBandera3() {
        return bandera3;
    }
}
