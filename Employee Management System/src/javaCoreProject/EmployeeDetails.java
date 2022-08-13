package javaCoreProject;

class EmployeeDetails 
{
    int empId;
    String empName;
    long empMobileNumber;
    String empAddress;
    int empSalary;
    String empJobType;
    
   
    EmployeeDetails(int empId, String empName, long empMobileNumber, String empAddress,int empSalary, String empJobType)
    {
        this.empId = empId;
        this.empName = empName;
        this.empMobileNumber = empMobileNumber;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.empJobType = empJobType;
    }

    

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public long getEmpMobileNumber() {
        return  empMobileNumber;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpJobType() {
        return empJobType;
    }

    public String toString()
    {
    
        System.out.println("Employee id\t\t Employee name\t\t Employee Mobile Number\t\t Employee Address\t\t Employee Salary\t\t Employee JobType");
        return "\s\s\s" +empId+ "\t\t\t\s\s" +empName+"\t\t\t" +empMobileNumber+"\t\t\t"+empAddress+ "\t\t\t\s\s\s" +empSalary+"\t\t\t\t\s\s"+empJobType+"\n\t\t\t\t\t-------------------------------------------------";
    }
    
    
}




