/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author terra
 */
public class WorkshopList {
    
    @JsonProperty("Results")
    private List<Workshop> workshops;

    @JsonProperty("IsSuccess")
    private boolean available;
    
    @JsonProperty("DisplayMessage")
    private String error;
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

    /**
     * @return the available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(String error) {
        this.error = error;
    }
    
}
