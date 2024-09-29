package pe.edu.cibertec.SW2_Async_Hilos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.SW2_Async_Hilos.remote.services.AsyncTaskService;

import java.util.concurrent.CompletableFuture;


@RequiredArgsConstructor
@Service
public class AtencionService {

    private final AsyncTaskService asyncTaskService; //una vez que se ejecute esta operacion, las 3 tareas de abajo se ejecutaran a la vez//

    public CompletableFuture<String> EjecutarTareasAsyncronas(){
        CompletableFuture<String> tarea1 = asyncTaskService.operacionPagoOnline();
        CompletableFuture<String> tarea2 = asyncTaskService.operacionActualizacionProducto();
        CompletableFuture<String> tarea3 = asyncTaskService.operacionRegistroVenta();
      return   CompletableFuture.allOf(tarea1, tarea2, tarea3).thenApply(result -> {
            try{
                String valorTarea1 = tarea1.join();
                String valorTarea2 = tarea2.join();
                String valorTarea3 = tarea3.join();

                return "Resultado Final = " +valorTarea1+ " - " +valorTarea2+ " - " +valorTarea3;
            }catch (Exception ex){
                return "Error al combinar los datos";
            }
        }).exceptionally(ex -> "Error al ejecutar las tareas");
    }
}
