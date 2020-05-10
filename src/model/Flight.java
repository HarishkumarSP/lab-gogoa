package model;

import java.time.LocalDate;

public class Flight {
	private int noOfPersons;
	private String FlightType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	
	public Flight(int noOfPersons, int rates, String flightType, LocalDate from, LocalDate to, String triptype) {
		super();
		this.noOfPersons = noOfPersons;
		this.FlightType = flightType;
		this.rates = rates;
		this.from = from;
		this.to = to;
		this.triptype = triptype;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getFlightType() {
		return FlightType;
	}
	public void setFlightType(String flightType) {
		FlightType = flightType;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public String getTriptype() {
		return triptype;
	}
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
}


