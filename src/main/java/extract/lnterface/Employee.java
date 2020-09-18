package extract.lnterface;

class Employee {
    int rate;
    boolean hasSpecialSkill;

    Employee(int rate, boolean hasSpecialSkill) {
        this.rate = rate;
        this.hasSpecialSkill = hasSpecialSkill;
    }

    public int getRate() {
        return rate;
    }

    public boolean hasSpecialSkill() {
        return hasSpecialSkill;
    }
}