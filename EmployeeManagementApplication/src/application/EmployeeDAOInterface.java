package application;

public abstract interface EmployeeDAOInterface
{
  public abstract void create(int n);
  
  public abstract void update(int employeeNo);
  
  public abstract void delete(int employeeNo);
  
  public abstract void read();
  
  public abstract void search(int employeeNo);
  
  public abstract void sort();
}
