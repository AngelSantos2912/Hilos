package pe.edu.cibertec.SW2_Async_Hilos.remote.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j

public class AsyncTaskService {

    @Async
    public CompletableFuture<String> operacionPagoOnline(){

        try {
            log.info("Iniciando proceso de pago");
            TimeUnit.SECONDS.sleep(4);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Pago Exitoso");
    }
//------------------------------------------------------------------------//
    @Async
    public CompletableFuture<String> operacionRegistroVenta(){

        try {
            log.info("Iniciando proceso de venta");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("Venta Exitosa");
    }
//---------------------------------------------------------------------------//
    @Async
    public CompletableFuture<String> operacionActualizacionProducto(){

        try {
            log.info("Actualizando stock de productos");
            TimeUnit.SECONDS.sleep(7);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return CompletableFuture.completedFuture("El producto fue actualizado");
    }
//-----------------------------------------------------------------------------//

}
