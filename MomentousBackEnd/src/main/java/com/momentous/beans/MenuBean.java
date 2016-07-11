package com.momentous.beans;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created by hitok on 9/7/2016.
 */
public class MenuBean {
    @Value("Naranja")
    private String description;
    private Boolean active;
    private List<ItemBean> itemBean;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<ItemBean> getItemBean() {
        return itemBean;
    }

    public void setItemBean(List<ItemBean> itemBean) {
        this.itemBean = itemBean;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
