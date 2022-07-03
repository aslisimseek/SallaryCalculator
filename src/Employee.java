public class Employee {
    String name;
    int sallary;
    int workHours;
    int hireYear;

    Employee(String name, int sallary, int workHours, int hireYear) {
        this.name = name;
        this.sallary = sallary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int calculatedTax() {
        if (sallary < 1000) {
            return 0;
        } else {
            return (int) (sallary * 0.03);
        }
    }

    public int calculatedBonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public int raiseSallary() {
        int totalWorkYear = 2022 - hireYear;
        if (totalWorkYear < 10) {
            return (int) (sallary * 0.05);
        } else if (totalWorkYear > 10 && totalWorkYear < 20) {
            return (int) (sallary * 0.10);
        } else {
            return (int) (sallary * 0.15);
        }
    }

    @Override
    public String toString() {
        return
                "Name : " + name + '\n' +
                        "Sallary : " + sallary + '\n' +
                        "Working Hour :" + workHours + '\n' +
                        "Hire Year :" + hireYear + '\n' +
                        "Tax : " + calculatedTax() + '\n' +
                        "Bonus : " + calculatedBonus() + '\n' +
                        "Sallary Increase : " + raiseSallary() +'\n' +
                        "Tax + Bonus : " + (sallary + calculatedBonus() - calculatedTax()) + '\n' +
                        "Total Sallary : " + (sallary + calculatedBonus() + raiseSallary());
    }
}