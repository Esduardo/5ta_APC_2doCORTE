import models.LecturaDatos;
import models.Procesos;
import models.SalidaInformacion;

import javax.sound.sampled.Port;

public class Principal{
    public static void main(String [] srgs){
        //--------------------------------------------------------------------------------------------------------------
        //                                              LECTURA
        LecturaDatos.lecturaDatos();
        //--------------------------------------------------------------------------------------------------------------
        //                                          PROCESOS
        Procesos procesos = new Procesos();
        procesos.proceso1(LecturaDatos.getH(), LecturaDatos.getM(), LecturaDatos.getS());
        procesos.proceso2();
        //--------------------------------------------------------------------------------------------------------------
        //                                          LECTURA
        SalidaInformacion.salidaInformacion(Procesos.getBandefaFinal(),LecturaDatos.getH(), LecturaDatos.getM(), LecturaDatos.getS());
    }
}
