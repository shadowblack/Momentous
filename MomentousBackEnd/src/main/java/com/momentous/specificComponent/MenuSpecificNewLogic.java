package com.momentous.specificComponent;

import com.momentous.beans.ItemBean;
import com.momentous.beans.MenuBean;
import com.momentous.component.IMenuComponent;
import com.momentous.decorators.MenuComponentDecorator;

import java.util.List;

/**
 * Created by hitok on 10/7/2016.
 */
public class MenuSpecificNewLogic extends MenuComponentDecorator {

    public MenuSpecificNewLogic(IMenuComponent menu){
       super(menu);
    }
    /**
     * @author: lmarin
     * @name getDataMenu
     * permite obtener todo los menus
     * @return List<MenuBean></>
    * */
    public List<MenuBean> getDataMenu() {
        // calculando tiempo de duracion del cada metodo
        long startTime = System.nanoTime();

        List<MenuBean> dataMenus = getMenu().getDataMenu();
        this.showConsoleSubMenu(dataMenus);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time Method getDataMenu: " + duration);
        return dataMenus;
    }

    /**
     * @author: lmarin
     * @name showConsoleSubMenu
     * permite muestra una consola de los submenus
     * @return void
     * */
    private void showConsoleSubMenu(List<MenuBean> menuBeans){
        for(MenuBean menuBean : menuBeans){
                this.showConsole(menuBean);
        }
    }

    /**
     * @author: lmarin
     * @name showConsole
     * permite construye la consola de menus
     * @return void
     * */
    private void showConsole(MenuBean menuBean){
        for(ItemBean itemBean : menuBean.getItemBean()){
            System.out.println(itemBean.getName());
            if (itemBean.getSubmenu() != null){
                showConsole(itemBean.getSubmenu());
            }
        }
    }

    /**
     * @author: lmarin
     * @name filterItemMenuByPrice
     * permite agrupar los item de los menus agrupados por precio
     * @return List<MenuBean>
     * */
    public List<MenuBean> filterItemMenuByPrice(List<MenuBean> menuBeans, Double price) {
        // calculando tiempo de duracion del cada metodo
        long startTime = System.nanoTime();

        List<MenuBean> menus = getMenu().filterItemMenuByPrice(menuBeans,price);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time Method filterItemMenuByPrice: " + duration);
        return menus;
    }

    /**
     * @author: lmarin
     * @name filterItemMenuByRanking
     * permite agrupar los item de los menus agrupados por ranking
     * @return List<MenuBean>
     * */
    public List<MenuBean> filterItemMenuByRanking(List<MenuBean> menuBeans, int ranking) {
        // calculando tiempo de duracion del cada metodo
        long startTime = System.nanoTime();

        List<MenuBean> menus = getMenu().filterItemMenuByRanking(menuBeans, ranking);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time Method filterItemMenuByRanking: " + duration);
        return menus;
    }

    /**
     * @author: lmarin
     * @name sumMenuPrice
     * permite realiza una suma de todos los precios de todos los item, incluyendo submenu
     * @return List<MenuBean>
     * */
    public double sumMenuPrice(List<MenuBean> menuBeans) {
        // calculando tiempo de duracion del cada metodo
        long startTime = System.nanoTime();
        double sum = getMenu().sumMenuPrice(menuBeans);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time Method sumMenuPrice: " + duration);
        return sum;
    }

    /**
     * @author: lmarin
     * @name sumMenuPrice
     * permite realizar un conteo de todos los submenus que estan activos
     * @return List<MenuBean>
     * */
    public int countSubMenu(List<MenuBean> menuBeans) {
        // calculando tiempo de duracion del cada metodo
        long startTime = System.nanoTime();
        int count = getMenu().countSubMenu(menuBeans);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time Method countSubMenu: " + duration);
        return count;
    }
}
