package models;

import java.util.Scanner;

public class LecturaDatos {
    static private int H = 0;
    static private int M = 0;
    static private int S = 0;
    static Scanner entrada = new Scanner(System.in);
    public static void lecturaDatos(){
        System.out.println("#            5TA ACTIVDAD            #" +
                         "\n#   Hora, Minutos y Segundos...      #");
         System.out.printf("#          Dame la hora: ");
         H = entrada.nextInt();
        System.out.printf("#           Dame los minutos: ");
        M = entrada.nextInt();
        System.out.printf("#           Dame los segundos: ");
        S = entrada.nextInt();
    }

    public static int getH() {
        return H;
    }

    public static int getM() {
        return M;
    }

    public static int getS() {
        return S;
    }
}
