package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Employee Daffodil1 = new Employee("Sobur",5896,84521); */
       Employee Daffodil = new Employee("Sobur",5896,84521);
        Daffodil.setName("Sobur");
        Daffodil.setId(10123654);
        Daffodil.setSalary(98756);
        Daffodil.setAge(29);
       System.out.println("Name :"+Daffodil.getName()+"\n"+"Id :"+Daffodil.getId()+"\n"+"Salary :"+Daffodil.getSalary()+"\n"+"Age :"+Daffodil.getAge());
        /*&System.out.println("Name :"+Daffodil1.name()+"\n"+"Id :"+Daffodil1.id()+"\n"+"Salary :"+Daffodil1.salary());
  */




    }
}
