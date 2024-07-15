package br.com.cronos.cronosveiculostestes.controller;

import br.com.cronos.cronosveiculostestes.domain.dto.request.CreateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.request.UpdateVehicleRequestDTO;
import br.com.cronos.cronosveiculostestes.domain.dto.response.VehicleResponseDTO;
import br.com.cronos.cronosveiculostestes.services.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    @Operation(summary = "API para buscar uma categorias com paginação e filtros")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Retorna OK com o veículo com o id informado"),
            @ApiResponse(responseCode = "401", description = "Erro de autenticação desta api"),
            @ApiResponse(responseCode = "403", description = "Erro de autorização desta api"),
            @ApiResponse(responseCode = "404", description = "Recurso não foi encontrado")
    })
    @Parameters(value = {
            @Parameter(name = "query", in = ParameterIn.QUERY),
            @Parameter(name = "enterpriseId", in = ParameterIn.QUERY),
            @Parameter(name = "page", in = ParameterIn.QUERY),
            @Parameter(name = "size", in = ParameterIn.QUERY)
    })
    @GetMapping
    public ResponseEntity<List<VehicleResponseDTO>> findCategories() {
        List<VehicleResponseDTO> response = vehicleService.getVehicles();

        return ResponseEntity.ok(response);
    }

    @Operation(summary = "API para buscar uma veículo pelo id")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Retorna OK com o veículo com o id informado"),
            @ApiResponse(responseCode = "401", description = "Erro de autenticação desta api"),
            @ApiResponse(responseCode = "403", description = "Erro de autorização desta api"),
            @ApiResponse(responseCode = "404", description = "Recurso não foi encontrado")
    })
    @Parameters(value = { @Parameter(name = "id", in = ParameterIn.PATH)})
    @GetMapping("/{vehicleId}")
    public ResponseEntity<VehicleResponseDTO> findVehicleById(@PathVariable(value = "vehicleId") Long vehicleId) {
        VehicleResponseDTO response = vehicleService.findVehicle(vehicleId);

        return ResponseEntity.ok(response);
    }

    @Operation(summary = "API para criar uma veículo")
    @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Sucesso ao criar uma veículo"),
            @ApiResponse(responseCode = "401", description = "Erro de autenticação desta api"),
            @ApiResponse(responseCode = "403", description = "Erro de autorização desta api"),
            @ApiResponse(responseCode = "404", description = "Recurso não foi encontrado")
    })
    @PostMapping
    public ResponseEntity<Void> create(@Validated @RequestBody CreateVehicleRequestDTO request) {
        vehicleService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Operation(summary = "API para atualizar uma veículo pelo id")
    @ApiResponses(value = {@ApiResponse(responseCode = "204", description = "Sucesso ao atualizar a veículo"),
            @ApiResponse(responseCode = "401", description = "Erro de autenticação desta api"),
            @ApiResponse(responseCode = "403", description = "Erro de autorização desta api"),
            @ApiResponse(responseCode = "404", description = "Recurso não foi encontrado")
    })
    @Parameters(value = { @Parameter(name = "id", in = ParameterIn.PATH)})
    @PutMapping("/{vehicleId}")
    public ResponseEntity<Void> update(@PathVariable(value = "vehicleId") Long vehicleId, @Validated @RequestBody UpdateVehicleRequestDTO request) {
        vehicleService.update(vehicleId, request);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @Operation(summary = "API para deletar uma veículo pelo id")
    @ApiResponses(value = {@ApiResponse(responseCode = "204", description = "Sucesso ao deletar a veículo"),
            @ApiResponse(responseCode = "401", description = "Erro de autenticação desta api"),
            @ApiResponse(responseCode = "403", description = "Erro de autorização desta api"),
            @ApiResponse(responseCode = "404", description = "Recurso não foi encontrado")
    })
    @Parameters(value = { @Parameter(name = "id", in = ParameterIn.PATH)})
    @DeleteMapping("/{vehicleId}")
    public ResponseEntity<Void> delete(@PathVariable(value = "vehicleId") Long vehicleId) {
        vehicleService.delete(vehicleId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
