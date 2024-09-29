package pe.edu.cibertec.SW2_Async_Hilos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.SW2_Async_Hilos.service.AtencionService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
public class AtencionController {

    private final AtencionService atencionService;

    @GetMapping("/finalizar-Venta")
    public String atencionVenta() throws ExecutionException, InterruptedException{
        CompletableFuture<String> resultado = atencionService.EjecutarTareasAsyncronas();
        return resultado.get();
    }
}
