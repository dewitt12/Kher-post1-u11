package com.tienda.pedidos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

/** DTO de entrada: datos que el cliente envia a la API. */
public class PedidoRequestDTO {

    @NotBlank(message = "El email del cliente es obligatorio")
    private String clienteEmail;

    @NotBlank(message = "El tipo de cliente es obligatorio")
    private String tipoCliente;

    @Positive(message = "El subtotal debe ser mayor a cero")
    private Double subtotal;

    public String getClienteEmail() { return clienteEmail; }
    public void setClienteEmail(String clienteEmail) { this.clienteEmail = clienteEmail; }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

    public Double getSubtotal() { return subtotal; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
}
