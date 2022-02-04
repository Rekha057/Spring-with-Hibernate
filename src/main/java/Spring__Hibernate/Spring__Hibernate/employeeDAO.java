package Spring__Hibernate.Spring__Hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class employeeDAO implements employeeCRUD{
   
	HibernateTemplate temp;
  
	public HibernateTemplate getTemp() {
	return temp;
}

public void setTemp(HibernateTemplate temp) {
	this.temp = temp;
}

	public int save(employeeBean e) {
	
		return (Integer) temp.save(e);
	}

	public List<employeeBean> getalltheemployee() {
		String sql="from hibernatetemplate";
		return (List<employeeBean>) temp.find(sql);
	}

}
