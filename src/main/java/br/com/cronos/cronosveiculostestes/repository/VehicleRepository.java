package br.com.cronos.cronosveiculostestes.repository;

import br.com.cronos.cronosveiculostestes.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
