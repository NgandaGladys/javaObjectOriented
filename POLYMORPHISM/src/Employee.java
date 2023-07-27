
//Parent class
public class Employee {
        protected int id;
        protected String name;
        protected String email;
        protected String contact;
        protected String role;
//constructor to initialise attributes of the class
        public Employee(int id, String name, String email, String contact, String role) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.contact = contact;
            this.role = role;
        }

        //method to find the employee salary
        public double employeeSalary(){

            return 0.00;
        }
//getters and setters to get the initial values and update the values respectively
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }


}
