package Spring__Hibernate.Spring__Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class employeeBean {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      int empNo;
       @Column
String empName;

public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "employeeBean [empNo=" + empNo + ", empName=" + empName + "]";
}

}
