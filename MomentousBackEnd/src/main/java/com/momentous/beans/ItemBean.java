package com.momentous.beans;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.core.io.Resource;
import java.util.Date;



/**
 * Created by lmarin on 10/7/2016.
 */
public class ItemBean {

    @Value("Bebida")
    private String name;
    private String description;
    private Double price;
    private String coin;
    //private Resource photo; // se comentó ya que no es necesario por ahora crear este tipo de datos para las imagenes
    private String photo;
    private int raking;
    private String[] dayWeeks;
    private Date timeStart;
    private Date timeEnd;
    private Date dateStart;
    private Date dateEnd;
    private MenuBean submenu;

    public MenuBean getSubmenu() {
        return submenu;
    }

    public void setSubmenu(MenuBean submenu) {
        this.submenu = submenu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String[] getDayWeeks() {
        return dayWeeks;
    }

    public void setDayWeeks(String[] dayWeeks) {
        this.dayWeeks = dayWeeks;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getRaking() {
        return raking;
    }

    public void setRaking(int raking) {
        this.raking = raking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
