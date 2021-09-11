package com.zking.test;

import com.zking.model.Customer;
import com.zking.model.Order;
import com.zking.model.Role;
import com.zking.model.User;
import com.zking.service.ICustomerService;
import com.zking.service.IOrderService;
import com.zking.service.IRoleService;
import com.zking.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest extends BaseTest{



    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IOrderService orderService;


    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Test
    public void Load(){
        Customer c = customerService.selectByPrimaryKey(1);
        List<Order> orders = orderService.selectByCid(c.getCustomerId());
        c.setOrders(orders);
        System.out.println(c);

    }


    @Test
    public void LoadOrder(){
        Order o = orderService.selectByPrimaryKey(1);
        Customer c = customerService.selectByPrimaryKey(o.getCid());
        o.setCustomer(c);
        System.out.println(o);

    }


    @Test
    public void Add(){
        Customer c=new Customer();
        c.setCustomerId(10);
        c.setCustomerName("车前子");
        Order o1=new Order();
        o1.setCid(c.getCustomerId());
        o1.setCustomer(c);
        o1.setOrderId(66);
        o1.setOrderNo("S300");
        Order o2=new Order();
        o2.setCid(c.getCustomerId());
        o2.setCustomer(c);
        o2.setOrderId(77);
        o2.setOrderNo("S400");
        List<Order> orders=new ArrayList<Order>();
        orders.add(o1);
        orders.add(o2);
        int n = customerService.insert(c);
        if (n>0){
            for (Order o : orders) {
                orderService.insert(o);

            }
        }

    }



    @Test
    public void delete(){
        int i = orderService.delcId(10);
        if (i>0) {
            customerService.deleteByPrimaryKey(10);
        }
    }




    @Test
    public void list(){//2. 查询所有用户对应角色
        List<User> users = userService.list(null);
        for (User user : users) {
            System.out.println(user.getUsername());
            List<Role> roles = user.getRoles();
            for (Role role : roles) {
                System.out.println("\t"+role.getRoleName());
            }
        }
    }



    @Test
    public void load(){//4. 查询某个用户对应的角色
        List<User> users = userService.load("admin");
        for (User user : users) {
            System.out.println(user.getUsername());
            List<Role> roles = user.getRoles();
            for (Role role : roles) {
                System.out.println("\t"+role.getRoleName());
            }
        }
    }


    @Test
    public void listById(){//4. 查询某个用户对应的角色
        List<User> users = userService.listById(1);
        for (User user : users) {
            System.out.println(user.getUsername());
            List<Role> roles = user.getRoles();
            for (Role role : roles) {
                System.out.println("\t"+role.getRoleName());


            }
        }
    }

}
