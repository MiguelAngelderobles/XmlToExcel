package com.example.demo.modelDto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "Empresa")
public class Empresa {

    @JacksonXmlProperty(localName = "NroContrato")
    @NotNull(message = "El numero de contrato es obligatorio.")
    private Long nroContrato;

    @JacksonXmlProperty(localName = "CUIT")
    @NotEmpty(message = "El numero de Cuit es obligatorio.")
    private String cuit;

    @JacksonXmlProperty(localName = "Denominacion")
    @NotEmpty(message = "La denominacion es obligatorio.")
    private String denominacion;

    @JacksonXmlProperty(localName = "Domicilio")
    @NotEmpty(message = "El domicilio es obligatorio.")
    private String domicilio;

    @JacksonXmlProperty(localName = "CodigoPostal")
    @NotEmpty(message = "El codigo postal es obligatorio.")
    private int codigoPostal;

    @JacksonXmlProperty(localName = "Productor")
    @NotEmpty(message = "El Productor es obligatorio.")
    private String productor;

    @JacksonXmlProperty(localName = "Movimientos")
    private Movimientos movimientos;

    @Override
    public String toString() {
        return "EmpresaDto{" +
                "nroContrato=" + nroContrato +
                ", cuit='" + cuit + '\'' +
                ", denominacion='" + denominacion + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", productor='" + productor + '\'' +
                ", movimientos=" + movimientos +
                '}';
    }
}