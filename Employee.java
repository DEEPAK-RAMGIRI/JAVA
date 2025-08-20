import java.util.*;

class Employee{  
    
    int id;
    int salary;
    String name;
    
    public Employee(int id, int sal,String name) {
        this.id = id;
        this.salary = sal;
        this.name = name;
    }

    public void show() {
        System.out.println("id " + this.id + " salary " + this.salary + " name: " + this.name);
    }

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(1010, 1234,"abcd"));
        al.add(new Employee(1011, 123456,"abde"));
        al.add(new Employee(1012, 50000,"bcd"));
        al.add(new Employee(1013, 30000,"abefd"));

        // Collections.sort(al);
        // To sort names  in  Ascending order
        System.out.println("sort names  in  Ascending order");
        Collections.sort(al,(e1,e2) -> e1.name.compareTo(e2.name));
        for (Employee e : al)  e.show();
        
        // To sort names  in  Descending order
        System.out.println("\nsort names  in  Descending order");
        Collections.sort(al,(e1,e2) -> e2.name.compareTo(e1.name));
        for (Employee e : al)  e.show();
        
        //To sort ID in  Descending order
        System.out.println("\n Sortnig id in Ascending Order");
        Collections.sort(al,(e1,e2) -> e1.id - e2.id);
        for (Employee e : al)  e.show();
        
        // To sort id in Ascending Order
        System.out.println("\nsort names  in  Descending order");
        Collections.sort(al,(e1,e2) -> e2.id - e1.id);
        for (Employee e : al)  e.show();
        
        // TO sort salary in Ascending Order
        System.out.println("\nsort salary in Ascending Order");
        Collections.sort(al,(e1,e2) -> e1.salary - e2.salary);
        for(Employee e: al) e.show();
        
        //To sort salary in descending  Order
        System.out.println("\nsort salary in descending  Order");
        Collections.sort(al,(e1,e2) -> e2.salary - e1.salary);
        for(Employee e: al) e.show();
    }
}
