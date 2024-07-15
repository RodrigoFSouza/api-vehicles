package br.com.cronos.cronosveiculostestes.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.processing.SQL;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "vehicles")
@SQLRestriction("active = true")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicles_id_seq")
	@SequenceGenerator(name = "vehicles_id_seq", sequenceName = "vehicles_id_seq", allocationSize = 1, initialValue = 100)
	private Long id;

	@Column(name = "renavam")
	private String renavam;

	@Column(name = "make")
	private String make;

	@Column(name = "model")
	private String model;

	@Column(name = "plate")
	private String plate;

	@Column(name = "color")
	private String color;

	@Column(name = "`YEAR`")
	private Integer year;

	@Column(name = "is_older")
	private Boolean isOlder;

	@Column(name = "active")
	private Boolean active;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@Column(name = "deleted_at")
	private LocalDateTime deletedAt;
}