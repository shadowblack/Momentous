package com.momentous.specificComponent;

import com.momentous.beans.CustomerBean;
import com.momentous.beans.ItemBean;
import com.momentous.beans.MenuBean;
import com.momentous.component.IMenuComponent;
import com.momentous.decorators.MenuComponentDecorator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hitok on 9/7/2016.
 */
public class MenuSpecificStandardTest implements IMenuComponent{
    static final String CONTEXT = "com.momentous.xml/beans.xml";
    ApplicationContext applicationContext =  new ClassPathXmlApplicationContext(CONTEXT);

    public List<MenuBean> getDataMenu(){
        CustomerBean customerBean = (CustomerBean) applicationContext.getBean("customerBean");
        List<MenuBean> menuBeans = (List<MenuBean>)(List)customerBean.getLists();
        return  menuBeans;
    }

    public List<MenuBean> filterItemMenuByPrice(List<MenuBean> menuBeans,Double price){
        List<MenuBean> menuBeanList = new ArrayList<MenuBean>();
        for(MenuBean menuBean : menuBeans){
            for(ItemBean itemBean : menuBean.getItemBean()){
                if(itemBean.getPrice().equals(price)){
                    menuBeanList.add(menuBean);
                }
            }
        }
        return menuBeanList;
    }

    public List<MenuBean> filterItemMenuByRanking(List<MenuBean> menuBeans,int raking){
        List<MenuBean> menuBeanList = new ArrayList<MenuBean>();
        for(MenuBean menuBean : menuBeans){
            for(ItemBean itemBean : menuBean.getItemBean()){
                if(itemBean.getRaking() == raking){
                    menuBeanList.add(menuBean);
                }
            }
        }
        return menuBeanList;
    }

    public int countSubMenu(List<MenuBean> menuBeans){

        int sum = 0;
        for(MenuBean menuBean : menuBeans){
            if (menuBean.getActive() == true)
                sum += this.countSubMenu(menuBean);
        }
        return sum;
    }

    private int countSubMenu(MenuBean menuBean){
        int sum = 0;
        for(ItemBean itemBean : menuBean.getItemBean()){
            if (itemBean.getSubmenu() != null){
                sum ++;
                sum += countSubMenu(itemBean.getSubmenu());
            }
        }
        return sum;
    }

    public double sumMenuPrice(List<MenuBean> menuBeans){

        double sum = 0;
        for(MenuBean menuBean : menuBeans){
            sum += this.sumPrice(menuBean);
        }
        return sum;
    }

    private double sumPrice(MenuBean menuBean){
        double sum = 0;
        for(ItemBean itemBean : menuBean.getItemBean()){
            sum += itemBean.getPrice();
            if (itemBean.getSubmenu() != null){
                sum += sumPrice(itemBean.getSubmenu());
            }
        }
        return sum;
    }
}
