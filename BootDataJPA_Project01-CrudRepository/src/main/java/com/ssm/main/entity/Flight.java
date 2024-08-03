package com.ssm.main.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Flight_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Flight {
	@Id
	@Column(name="FLIGHT_NUMBER")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightNumber;

	@Nonnull
	@Column(name="FLIGHT_NAME", length = 30)
	private String flightName;

	@Nonnull
	@Column(name="FLIGHT_DEPARTURE")
	private boolean flightDeparture;

	@Nonnull
	@Column(name="FLIGHT_DESTINATION", length = 30)
	private String flightDestination;

	@Nonnull
	@Column(name="FLIGHT_COMPANY", length = 30)
	private String flightCompany;

	@Nonnull
	@Column(name="NUMBEROF_PASSENGER")
	private Integer numberOfPassenger;
}
