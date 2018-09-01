/**
 * 
 */
package com.java8.hasmaptest;

/**
 * @author Ajay
 *
 */
public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer empid;
	
	private String empname;
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		if(empid==300) {
			empid=100;
		}
		result = prime * result + ((empid == null) ? 0 : empid.hashCode());
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		System.out.println("hashcode=="+empid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid == null) {
			if (other.empid != null)
				return false;
		} else if (!empid.equals(other.empid))
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		return true;
	}

}
