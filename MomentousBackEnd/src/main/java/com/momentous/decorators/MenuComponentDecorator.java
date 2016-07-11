package com.momentous.decorators;

import com.momentous.component.IMenuComponent;

/**
 * Created by hitok on 9/7/2016.
 */
public abstract class MenuComponentDecorator implements IMenuComponent {


    private IMenuComponent menuComponent;

    protected MenuComponentDecorator(IMenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }

    protected IMenuComponent getMenu() {
        return menuComponent;
    }

    public void setMenu(IMenuComponent menu) {
        this.menuComponent = menu;
    }
}
