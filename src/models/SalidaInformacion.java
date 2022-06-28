package models;

public class SalidaInformacion{
    public static void salidaInformacion(int banderaFinal, int H, int M, int S ){
        int banderaComparar = 1;
        if(banderaFinal == banderaComparar){
            System.out.println("Todos los datos son correctos");
            System.out.println(" Hora " + LecturaDatos.getH() + ":" + LecturaDatos.getM() + ":" + LecturaDatos.getS());
        }
        else{
            System.out.println("Algun dato es incorrectto");
            System.out.println("   >>  Hora " + LecturaDatos.getH() + ":" + LecturaDatos.getM() + ":" + LecturaDatos.getS());
        }
    }
}
