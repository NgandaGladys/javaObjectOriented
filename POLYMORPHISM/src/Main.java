// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Employee emp= new Employee(1,"Amanda Pearl","pearla@gmail.com","+256788509214","Employee");
        Developer dev = new Developer(1,"Arabella","arag@gmail.com","+256 702445974", 200000,120000);
        Accountant accnt=new Accountant(1,"Johnson","jshon@gmail.com","0788903071",600000,200000);

        System.out.println(dev.getName()+"\t "+ dev.getRole()+"\t" + dev.employeeSalary());
        System.out.println(accnt.getName()+ "\t" + accnt.getRole() +"\t"+ accnt.employeeSalary() );


        }
    }
