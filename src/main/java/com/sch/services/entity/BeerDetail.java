package com.sch.services.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="beer_details")
public class BeerDetail implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
    private int id;
	@NotNull
	@Column(name="BEERNAME")
    private String beerName;
    @Column(name="DESCRIPTION")
    private String description;
	@Column(name="ALCOHOLPERCENTAGE")
	private String alcoholPercentage;
	@Column(name="BREWERYLOCATION")
	private String breweryLocation;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(final String beerName) {
        this.beerName = beerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(final String alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getBreweryLocation() {
        return breweryLocation;
    }

    public void setBreweryLocation(final String breweryLocation) {
        this.breweryLocation = breweryLocation;
    }

    @Override
    public String toString() {
        return "BeerDetail{" +
               "id=" + id +
               ", beerName='" + beerName + '\'' +
               ", description='" + description + '\'' +
               ", alcoholPercentage='" + alcoholPercentage + '\'' +
               ", breweryLocation='" + breweryLocation + '\'' +
               '}';
    }
}