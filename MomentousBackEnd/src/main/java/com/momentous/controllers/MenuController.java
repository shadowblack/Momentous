package com.momentous.controllers;

import com.momentous.beans.MenuBean;
import com.momentous.component.IMenuComponent;
import com.momentous.specificComponent.MenuSpecificNewLogic;
import com.momentous.specificComponent.MenuSpecificStandardTest;

import java.util.List;

/**
 * Created by lmarin on 10/7/2016.
 * Se define la logica del controlador
 */
public class MenuController {
    private IMenuComponent menuComponent;

    public List<MenuBean> getMenu(){
        menuComponent = new MenuSpecificStandardTest();
        menuComponent = new MenuSpecificNewLogic(menuComponent);
        return menuComponent.getDataMenu();
    }
    public List<MenuBean> filterByPrice(List<MenuBean> menuBeans,Double price){
        return menuComponent.filterItemMenuByPrice(menuBeans, price);
    }
    public List<MenuBean> filterByRanking(List<MenuBean> menuBeans,int ranking){
        return menuComponent.filterItemMenuByRanking(menuBeans, ranking);
    }
    public double sumMenu(List<MenuBean> menuBeans){
        return menuComponent.sumMenuPrice(menuBeans);
    }
    public int countSubMenu(List<MenuBean> menuBeans){
        return menuComponent.countSubMenu(menuBeans);
    }
}
