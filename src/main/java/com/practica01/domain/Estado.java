
package com.practica01.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")

public class Estado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pais;
    //en la base de datos va id_cliente -->IdCliente asi seria en java
    // id_cliente_externo  --> idClienteExterno
    
    private String lugar;
    private String nombre_estado;
    private String capital;
    private int poblacion;
    private int cant_costas;
    private int cant_monumentos;

    public Estado(String lugar, String nombre_estado, String capital, int poblacion, int cant_costas, int cant_monumentos) {       
        this.lugar = lugar;
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.cant_costas = cant_costas;
        this.cant_monumentos = cant_monumentos;
    }

    public Estado() {

    }

}

