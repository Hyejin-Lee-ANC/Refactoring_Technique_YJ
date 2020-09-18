package extract.lnterface;

class TimeSheet {
    public double charge(Employee employee, int days) {
        double base = employee.getRate() * days;
        if (employee.hasSpecialSkill()) {
            return base * 1.05;
        }
        else {
            return base;
        }
    }
}
