package rs.ac.uns.ftn.svtvezbe06.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import rs.ac.uns.ftn.svtvezbe06.model.enums.DayOfWeek;

@Entity
@Table(name = "work_day")
public class WorkDay {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "valid_form")
	LocalDate validForm;
	
	@Column(name = "valid_form")
	DayOfWeek day;
	
	@Column(name = "from")
	LocalTime from;
	
	@Column(name = "until")
	LocalTime Until;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "facility_id")
	private Facility facility;
	
	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getValidForm() {
		return validForm;
	}

	public void setValidForm(LocalDate validForm) {
		this.validForm = validForm;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	public LocalTime getFrom() {
		return from;
	}

	public void setFrom(LocalTime from) {
		this.from = from;
	}

	public LocalTime getUntil() {
		return Until;
	}

	public void setUntil(LocalTime until) {
		Until = until;
	}

	

}
