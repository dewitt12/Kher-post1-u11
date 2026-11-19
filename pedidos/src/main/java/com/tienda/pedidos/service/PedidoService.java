package com.tienda.pedidos.service;

import com.tienda.pedidos.dto.PedidoRequestDTO;
import com.tienda.pedidos.dto.PedidoResponseDTO;

/** Abstraccion de la que depende el controller (DIP). */
public interface PedidoService {

    PedidoResponseDTO crear(PedidoRequestDTO dto);

    PedidoResponseDTO buscarPorId(Long id);
}
