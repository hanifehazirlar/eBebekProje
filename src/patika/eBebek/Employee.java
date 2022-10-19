package patika.eBebek;

public class Employee {
   String name;
   double salary;
   int workHours;
   int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Fatma Mavi",2000,45,1985);
        System.out.println(employee);
        System.out.println("Tax : "+tax(employee.salary)+ " $");
        System.out.println("Bonus : "+bonus(employee.workHours)+" $");
        System.out.println("Raise salary : "+raiseSalary(employee.hireYear,employee.salary, employee.workHours)+" $");
        System.out.println("Salary with bonuses : "+(employee.salary+bonus(employee.workHours)-tax(employee.salary))+" $");
        System.out.println("Total Salary : "+(employee.salary+bonus(employee.workHours)+
                raiseSalary(employee.hireYear,employee.salary, employee.workHours)-tax(employee.salary))+" $");
    }


    private static double raiseSalary(int hireYear,double salary,int workHours) {
        double raiseSalary=0;
        if ((2021-hireYear)<10){
            raiseSalary=salary*0.05;
        }else if((2021-hireYear>9 && (2021-hireYear)<20)){
            raiseSalary=salary*0.10;
        }else{
           raiseSalary=salary*0.15;
        }
        return raiseSalary;
    }

    private static double bonus(int workHours) {
        double bonus=0;
        if (workHours>40){
            bonus=(workHours-40)*30;
        }
        return bonus;
    }
    private static double tax(double salary) {
        double tax=0;
        if (salary>1000){
            tax=salary*0.03;
        }return tax;
    }






}
