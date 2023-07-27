
    class Accountant extends Employee {
        private double salary;
        private double bonus;
        public Accountant(int id, String name, String email, String contact,double salary, double bonus) {
            super(id, name, email, contact, "accountant");
            this.salary=salary;
            this.bonus=bonus;

        }

        @Override
        public double employeeSalary() {

            return salary + bonus;
        }
    }

