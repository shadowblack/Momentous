package com.momentous.services;

import com.google.gson.Gson;
import com.momentous.beans.MenuBean;
import com.momentous.controllers.MenuController;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonValue;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * Created by hitok on 9/7/2016.
 */
@Path("/menu")
public class MenuRest {
    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAll(@PathParam("filterPrice") Double filterPrice){
        JsonArrayBuilder builder = Json.createArrayBuilder();

        MenuController menu = new MenuController();
        List<MenuBean> menuBeans = menu.getMenu();
        if(filterPrice != null){
            menuBeans = menu.filterByPrice(menuBeans,10.1);
        }

        double sumMenus =  menu.sumMenu(menuBeans);
        int countSubMenus =  menu.countSubMenu(menuBeans);

        String json = new Gson().toJson(menuBeans);

        builder.add(Json.createObjectBuilder().add("dataSource", json).add("sum_menus",sumMenus).add("count_menus",countSubMenus));
        return builder.build();
    }


}
