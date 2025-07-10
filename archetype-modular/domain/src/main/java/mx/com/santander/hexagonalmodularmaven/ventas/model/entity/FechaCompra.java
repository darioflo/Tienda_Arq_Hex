package mx.com.santander.hexagonalmodularmaven.ventas.model.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class FechaCompra {
    private LocalDateTime fechaCompra;
}
