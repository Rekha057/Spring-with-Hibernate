package Spring__Hibernate.Spring__Hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext Ac=new ClassPathXmlApplicationContext("spring.xml");
        employeeBean eb=Ac.getBean(employeeBean.class);
        employeeCRUD crud=Ac.getBean(employeeDAO.class);
        
        int row = crud.save(eb);
        if(row>0) {
        	System.out.println("Insertion is successfull");
        }
        else {
        	System.out.println("Check the code");
        }
        
        //List<employeeBean> list = crud.getalltheemployee();
        //System.out.println(list);
    }
}
