/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/**
 *
 * @author terra
 */
public class WorkshopSet {
    @JsonProperty("id")
    private int id;
    private String name;
    private String topic;
    private String description;
    
    @JsonIgnore
    private List<Workshop> workshops;
    
    private Date archived;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the archived
     */
    public Date getArchived() {
        return archived;
    }

    /**
     * @param archived the archived to set
     */
    public void setArchived(Date archived) {
        this.archived = archived;
    }

    /**
     * @return the workshops
     */
    public List<Workshop> getWorkshops() {
        return workshops;
    }

    /**
     * @param workshops the workshops to set
     */
    public void setWorkshops(List<Workshop> workshops) {
        this.workshops = workshops;
    }
    
}
