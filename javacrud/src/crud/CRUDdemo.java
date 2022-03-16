package crud;

import java.util.*;

public class CRUDdemo {

        public static void main(String[] args) {
            Collection<Employee> c = new ArrayList<Employee>();
            Scanner s = new Scanner(System.in);
            Scanner s1 = new Scanner(System.in);
            int cha;
            do{
                System.out.println("1. INSERT");
                System.out.println("2. DISPLAY");
                System.out.println("3. SEARCH");
                System.out.println("4. DELETE");
                System.out.println("5. UPDATE");
                System.out.println("Enter Your Choice: ");
                cha=s.nextInt();
                switch(cha){
                    case 1:
                        System.out.println("Enter Empno: ");
                        int empno = s.nextInt();
                        System.out.println("Enter EmpName: ");
                        String ename = s1.nextLine();
                        System.out.println("Enter Salary: ");
                        int salary = s.nextInt();

                        c.add(new Employee(empno, ename, salary));
                        break;

                    case 2:
                        System.out.println("-------------------");
                        Iterator<Employee> i = c.iterator();
                        while(i.hasNext()){
                            Employee e = i.next();
                            System.out.println(e);
                        }
                        System.out.println("-------------------");

                        break;

                    case 3:
                        boolean found = false;
                        System.out.println("Enter Empno to Search: ");
                        empno = s.nextInt();
                        System.out.println("-------------------");
                        i = c.iterator();
                        while(i.hasNext()){
                            Employee e = i.next();
                            if(e.getEmpno() == empno){
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if(!found){
                            System.out.println("Record Not Found");
                        }
                        System.out.println("-------------------");

                        break;
                }
            }
            while(cha!=0);

        }


}
