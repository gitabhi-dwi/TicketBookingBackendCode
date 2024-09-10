package com.jsp.jst_ticket_booking_spring_boot.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train {

    @Id
    
    @Column(name = "trainnumber")
    private long trainNumber;

    public long getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(long trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getRunningdays() {
		return runningdays;
	}

	public void setRunningdays(String runningdays) {
		this.runningdays = runningdays;
	}

	@Column(name = "trainname")
    private String trainName;


    @Column(name = "departuretime")
    private LocalTime departureTime;

    @Column(name = "arrivaltime")
    private LocalTime arrivalTime;

    private int duration;

    private String runningdays;
    
    private String departuredays;
    public String getDeparturedays() {
		return departuredays;
	}

	public void setDeparturedays(String departuredays) {
		this.departuredays = departuredays;
	}

	public String getArrivaldays() {
		return arrivaldays;
	}

	public void setArrivaldays(String arrivaldays) {
		this.arrivaldays = arrivaldays;
	}

	private String arrivaldays;
    

}
