package br.com.cronos.cronosveiculostestes.domain.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import lombok.NonNull;

public record UpdateVehicleRequestDTO(
        @NotEmpty String vin,
        @NotEmpty String make,
        @NotEmpty String model,
        @NotEmpty String plate,
        @NotEmpty String color,
        @NonNull @DecimalMin("1954") Integer year,
        Boolean isOlder
) {
}
