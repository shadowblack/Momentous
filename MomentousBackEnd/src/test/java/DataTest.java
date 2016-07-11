import com.momentous.beans.CustomerBean;
import com.momentous.beans.MenuBean;
import com.momentous.controllers.MenuController;
import com.momentous.specificComponent.MenuSpecificStandardTest;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;


/**
 * Created by lmarin on 10/7/2016.
 */
public class DataTest extends TestCase {
    public void testData(){
        MenuController menu = new MenuController();
        List<MenuBean> menuBeans = menu.getMenu();
        menuBeans = menu.filterByPrice(menuBeans, 10.1);
        //menuBeans = menu.filterByRanking(menuBeans,9);
        double sumMenus =  menu.sumMenu(menuBeans);
        int countSubMenus =  menu.countSubMenu(menuBeans);
    }
    public void testDataMock(){

        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("com.momentous.xml/beans.xml");
        CustomerBean customerBean = (CustomerBean) applicationContext.getBean("customerBean");

        CustomerBean instance = mock(CustomerBean.class);
        instance.setLists(customerBean.getLists());
        verify(instance).setLists(customerBean.getLists());

        MenuController menuMock = mock(MenuController.class);
        menuMock.getMenu();
        verify(menuMock).getMenu();

    }
}
