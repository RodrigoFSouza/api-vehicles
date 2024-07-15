package br.com.cronos.cronosveiculostestes.domain.mapper;

import br.com.cronos.cronosveiculostestes.domain.Vehicle;
import br.com.cronos.cronosveiculostestes.domain.dto.request.CreateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.response.VehicleResponseDTO;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

@Component
public class VehicleMapper {

    public Vehicle toEntity(CreateVehicleRequestDTO createVehicleRequestDTO) {
        if (isNull(createVehicleRequestDTO)) {
            return null;
        }

        return Vehicle.builder()
                .renavam(createVehicleRequestDTO.renavam())
                .make(createVehicleRequestDTO.make())
                .model(createVehicleRequestDTO.model())
                .plate(createVehicleRequestDTO.plate())
                .color(createVehicleRequestDTO.color())
                .year(createVehicleRequestDTO.year())
                .isOlder(createVehicleRequestDTO.isOlder())
                .build();
    }

    public VehicleResponseDTO toResponse(Vehicle vehicle) {
        if (isNull(vehicle)) {
            return null;
        }

        return VehicleResponseDTO.builder()
                .id(vehicle.getId())
                .renavam(vehicle.getRenavam())
                .make(vehicle.getMake())
                .model(vehicle.getModel())
                .plate(vehicle.getPlate())
                .renavam(vehicle.getRenavam())
                .year(vehicle.getYear())
                .isOlder(vehicle.getIsOlder())
                .active(vehicle.getActive())
                .createdAt(vehicle.getCreatedAt().toString())
                .updatedAt(isNull(vehicle.getUpdatedAt()) ? null : vehicle.getUpdatedAt().toString())
                .build();
    }
}
