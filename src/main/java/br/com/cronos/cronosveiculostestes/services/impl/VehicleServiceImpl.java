package br.com.cronos.cronosveiculostestes.services.impl;

import br.com.cronos.cronosveiculostestes.domain.dto.request.CreateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.request.UpdateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.response.VehicleResponseDTO;
import br.com.cronos.cronosveiculostestes.domain.mapper.VehicleMapper;
import br.com.cronos.cronosveiculostestes.repository.VehicleRepository;
import br.com.cronos.cronosveiculostestes.services.VehicleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;
    private final VehicleMapper vehicleMapper;

    @Override
    public List<VehicleResponseDTO> getVehicles() {
        log.info("Getting all vehicles");
        var vehicles = vehicleRepository.findAll();
        return vehicles.stream().map(vehicleMapper::toResponse).toList();
    }

    @Override
    public VehicleResponseDTO findVehicle(final Long id) {
        log.info("Finding vehicle by id: {}", id);
        var vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        return vehicleMapper.toResponse(vehicle);
    }

    @Override
    public void create(CreateVehicleRequestDTO createVehicleRequestDTO) {
        log.info("Creating vehicle with renavem: {}", createVehicleRequestDTO.renavam());
        var vehicle = vehicleMapper.toEntity(createVehicleRequestDTO);
        vehicle.setActive(true);
        vehicle.setCreatedAt(LocalDateTime.now());
        vehicleRepository.save(vehicle);
    }

    @Override
    public void update(Long id, UpdateVehicleRequestDTO updateVehicleRequestDTO) {
        log.info("Updating vehicle with id: {}", id);
        var vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));

        vehicle.setRenavam(updateVehicleRequestDTO.vin());
        vehicle.setMake(updateVehicleRequestDTO.make());
        vehicle.setModel(updateVehicleRequestDTO.model());
        vehicle.setYear(updateVehicleRequestDTO.year());
        vehicle.setPlate(updateVehicleRequestDTO.plate());
        vehicle.setColor(updateVehicleRequestDTO.color());
        vehicle.setIsOlder(updateVehicleRequestDTO.isOlder());
        vehicle.setUpdatedAt(LocalDateTime.now());

        vehicleRepository.save(vehicle);
    }

    @Override
    public void delete(Long id) {
        log.info("Deleting vehicle with id: {}", id);
        var vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
        vehicle.setActive(false);
        vehicle.setDeletedAt(LocalDateTime.now());

        vehicleRepository.save(vehicle);
    }
}
