public class Developer  extends Employee{
        private double salary;
        private double overTime;
        public Developer(int id, String name, String email, String contact, double salary, double overTime) {
            super(id, name, email, contact,"developer");
            this.salary=salary;
            this.overTime=overTime;
        }

        @Override
        public double employeeSalary() {
            return salary + overTime;
        }





}
