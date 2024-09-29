package pe.edu.cibertec.SW2_Async_Hilos.remote.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class TaskService {

    public String tareas1(){
        try {
            log.info("Tarea 1 termianada");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return "Pago Exitoso";
    }


}
