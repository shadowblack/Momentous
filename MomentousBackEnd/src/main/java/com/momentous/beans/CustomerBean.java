package com.momentous.beans;

import java.util.List;

/**
 * Created by llmarin on 10/7/2016.
 */
public class CustomerBean {
    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    private List<Object> lists;
}
