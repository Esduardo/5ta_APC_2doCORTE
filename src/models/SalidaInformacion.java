package models;

public class SalidaInformacion{
    public static void salidaInformacion(int banderaFinal, int H, int M, int S, int bandera1, int bandera2, int bander3){
        int banderaComparar = 1;
        if(banderaFinal == banderaComparar){
            System.out.println("Todos los datos son correctos");
            System.out.println(" Hora " + LecturaDatos.getH() + ":" + LecturaDatos.getM() + ":" + LecturaDatos.getS());
        }
        else{
            System.out.println("!!!   Datos ingresados incorrectamente   !!!");
            if(bandera1 == 0)
                System.out.println("este dato esta ingresado incorrectamente >>  " + LecturaDatos.getH());
            if(bandera2 == 0)
                System.out.println("este dato esta ingresado incorrectamente" + LecturaDatos.getM());
            if(bander3 == 0)
                System.out.println("este dato es ingresado incorrectamente: " + LecturaDatos.getS());
            System.out.println("\n\n   >>  Hora " + LecturaDatos.getH() + ":" + LecturaDatos.getM() + ":" + LecturaDatos.getS());
        }
    }
}
