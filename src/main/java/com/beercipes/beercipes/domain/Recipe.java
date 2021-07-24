package com.beercipes.beercipes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {

    private Integer id; //Unique ID
    private String name;
    private Float originalGravity;
    private Boolean isAle; //Used to determine if it's an ale or lager.
    private String type; //Type of beer
    private Byte primaryFermentTime; //Time in primary ferment.
    private Byte secondaryFermentTime; //Time in secondary ferment.
    private Byte totalFermentTime; //Primary + secondary, not including bottle conditioning time. May do this differently.
    private String malt1; //Tracking malt additions. Currently have 5.
    private String malt2;
    private String malt3;
    private String malt4;
    private String malt5;
    private String hop1; //Tracking hop additions, boil or dry. Currently have 5.
    private String hop2;
    private String hop3;
    private String hop4;
    private String hop5;
    private String otherAddition1; //Used to track other boil for ferment ingredients.
    private String otherAddition2;
    private String otherAddition3;
    private String dryYeast1;
    private String dryYeast2;
    private String wetYeast1;
    private String wetYeast2;
    private String description;
    private String notes; //Brewing notes and tips.
    private String comments; //Maybe for other users to leave feedback?
    private Float rating; //Rated out of 10, will try to average.

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getOriginalGravity() {
        return originalGravity;
    }

    public void setOriginalGravity(Float originalGravity) {
        this.originalGravity = originalGravity;
    }

    public Boolean getAle() {
        return isAle;
    }

    public void setAle(Boolean ale) {
        isAle = ale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getPrimaryFermentTime() {
        return primaryFermentTime;
    }

    public void setPrimaryFermentTime(Byte primaryFermentTime) {
        this.primaryFermentTime = primaryFermentTime;
    }

    public Byte getSecondaryFermentTime() {
        return secondaryFermentTime;
    }

    public void setSecondaryFermentTime(Byte secondaryFermentTime) {
        this.secondaryFermentTime = secondaryFermentTime;
    }

    public Byte getTotalFermentTime() {
        return totalFermentTime;
    }

    public void setTotalFermentTime(Byte totalFermentTime) {
        this.totalFermentTime = totalFermentTime;
    }

    public String getMalt1() {
        return malt1;
    }

    public void setMalt1(String malt1) {
        this.malt1 = malt1;
    }

    public String getMalt2() {
        return malt2;
    }

    public void setMalt2(String malt2) {
        this.malt2 = malt2;
    }

    public String getMalt3() {
        return malt3;
    }

    public void setMalt3(String malt3) {
        this.malt3 = malt3;
    }

    public String getMalt4() {
        return malt4;
    }

    public void setMalt4(String malt4) {
        this.malt4 = malt4;
    }

    public String getMalt5() {
        return malt5;
    }

    public void setMalt5(String malt5) {
        this.malt5 = malt5;
    }

    public String getHop1() {
        return hop1;
    }

    public void setHop1(String hop1) {
        this.hop1 = hop1;
    }

    public String getHop2() {
        return hop2;
    }

    public void setHop2(String hop2) {
        this.hop2 = hop2;
    }

    public String getHop3() {
        return hop3;
    }

    public void setHop3(String hop3) {
        this.hop3 = hop3;
    }

    public String getHop4() {
        return hop4;
    }

    public void setHop4(String hop4) {
        this.hop4 = hop4;
    }

    public String getHop5() {
        return hop5;
    }

    public void setHop5(String hop5) {
        this.hop5 = hop5;
    }

    public String getOtherAddition1() {
        return otherAddition1;
    }

    public void setOtherAddition1(String otherAddition1) {
        this.otherAddition1 = otherAddition1;
    }

    public String getOtherAddition2() {
        return otherAddition2;
    }

    public void setOtherAddition2(String otherAddition2) {
        this.otherAddition2 = otherAddition2;
    }

    public String getOtherAddition3() {
        return otherAddition3;
    }

    public void setOtherAddition3(String otherAddition3) {
        this.otherAddition3 = otherAddition3;
    }

    public String getDryYeast1() {
        return dryYeast1;
    }

    public void setDryYeast1(String dryYeast1) {
        this.dryYeast1 = dryYeast1;
    }

    public String getDryYeast2() {
        return dryYeast2;
    }

    public void setDryYeast2(String dryYeast2) {
        this.dryYeast2 = dryYeast2;
    }

    public String getWetYeast1() {
        return wetYeast1;
    }

    public void setWetYeast1(String wetYeast1) {
        this.wetYeast1 = wetYeast1;
    }

    public String getWetYeast2() {
        return wetYeast2;
    }

    public void setWetYeast2(String wetYeast2) {
        this.wetYeast2 = wetYeast2;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
}
