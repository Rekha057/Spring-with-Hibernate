package Spring__Hibernate.Spring__Hibernate;

import java.util.List;

public interface employeeCRUD {
  public int save(employeeBean e);
  public List<employeeBean> getalltheemployee();
}
