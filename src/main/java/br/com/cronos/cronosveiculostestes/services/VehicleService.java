package br.com.cronos.cronosveiculostestes.services;

import br.com.cronos.cronosveiculostestes.domain.dto.request.CreateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.request.UpdateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.response.VehicleResponseDTO;

import java.util.List;

public interface VehicleService {
    List<VehicleResponseDTO> getVehicles();
    VehicleResponseDTO findVehicle(Long id);
    void create(CreateVehicleRequestDTO createVehicleRequestDTO);
    void update(Long id, UpdateVehicleRequestDTO updateVehicleRequestDTO);
    void delete(Long id);
}
