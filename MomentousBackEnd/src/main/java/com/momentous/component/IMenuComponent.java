package com.momentous.component;

import com.momentous.beans.MenuBean;

import java.util.List;

/**
 * Created by lmarin on 9/7/2016.
 */
public interface IMenuComponent {
    /**
     * @author: lmarin
     * @name getDataMenu
     * permite obtener todo los menus
     * @return List<MenuBean></>
     * */
    List<MenuBean> getDataMenu();
    /**
     * @author: lmarin
     * @name filterItemMenuByPrice
     * permite agrupar los item de los menus agrupados por precio
     * @return List<MenuBean>
     * */
    List<MenuBean> filterItemMenuByPrice(List<MenuBean> menuBeans,Double price);
    /**
     * @author: lmarin
     * @name filterItemMenuByRanking
     * permite agrupar los item de los menus agrupados por ranking
     * @return List<MenuBean>
     * */
    List<MenuBean> filterItemMenuByRanking(List<MenuBean> menuBeans,int Ranking);
    /**
     * @author: lmarin
     * @name sumMenuPrice
     * permite realiza una suma de todos los precios de todos los item, incluyendo submenu
     * @return List<MenuBean>
     * */
    double sumMenuPrice(List<MenuBean> menuBeans);
    /**
     * @author: lmarin
     * @name sumMenuPrice
     * permite realizar un conteo de todos los submenus que estan activos
     * @return List<MenuBean>
     * */
    int countSubMenu(List<MenuBean> menuBeans);
}
