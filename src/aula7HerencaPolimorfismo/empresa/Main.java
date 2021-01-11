package aula7HerencaPolimorfismo.empresa;

public class Main {

    public static void main(String[] args) {
        Business business = new Business("XPTO");
        business.setProfit(30000);
        Employee director = new Director("Daniel", business);
        Employee employee = new Employee("José");
        Employee employee1 = new Employee("José Maria");
        Employee employee2 = new Employee("Maria José");
        Manager employee3 = new Manager("Joao");
        Manager employee4 = new Manager("Joana");
        System.out.println(employee);
        System.out.println(business);
        business.addEmployee(employee);
        business.addEmployee(employee1);
        business.addEmployee(employee2);
        business.addEmployee(employee3);
        employee4.setObjectives(true);
        business.addEmployee(employee4);
        employee4.setObjectives(true);
        System.out.println(business.getSalariesTotal());
        System.out.println(director);



    }
}
