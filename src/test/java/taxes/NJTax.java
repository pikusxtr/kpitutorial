package taxes;

public class NJTax extends Tax {
    public NJTax(double _grossIncome, String _state, int _dependants) {
        super(_grossIncome, _state, _dependants);
    }

    double adjustForStudents(double stateTax) {
        return stateTax - 500;
    }

    @Override
    public double calcTax() {
        return super.calcTax() - 500;
    }
}
