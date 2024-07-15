package br.com.cronos.cronosveiculostestes.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public record VehicleResponseDTO(
        Long id,
        String renavam,
        String make,
        String model,
        String plate,
        String color,
        Integer year,
        Boolean isOlder,
        Boolean active,
        String createdAt,
        String updatedAt
) {
}
