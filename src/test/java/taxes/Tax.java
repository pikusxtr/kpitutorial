package taxes;

public class Tax {
    double grossIncome;
    String state;
    int dependents;


    public Tax() {
        grossIncome = 1000;
        System.out.println("Tax class def constr");

    }

    public Tax(double _grossIncome, String _state, int _dependants) {
        grossIncome = _grossIncome;
        state = _state;
        dependents = _dependants;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public double calcTax() {
        double taxCalculated;
        switch (state) {
            case "AA":
                System.out.println("Tax Exempt");
                taxCalculated = grossIncome * 0.05;
                break;
            case "BB":
                System.out.println("Low Tax Bracket");
                taxCalculated = grossIncome * 0.33;
                break;
            case "CC":
                System.out.println("High Tax Bracket");
                taxCalculated = grossIncome * 0.25;
                break;
            default:
                System.out.println("Wrong Tax Bracket");
                taxCalculated = grossIncome * 0.55;
        }
        return taxCalculated;
    }
}
