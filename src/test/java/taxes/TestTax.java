package taxes;

public class TestTax {
    public static void main(String[] args) {
        // assigning the values to class members
        double grossIncome = 50000;
        int dependents = 2;
        String state = "AA";
        Tax t = new Tax(grossIncome, state, dependents); // creating an instance
        NJTax njTax = new NJTax(grossIncome, state, dependents);
        Tax t2 = t;
        double yourTax = t.calcTax(); //calculating tax
        // Printing the result
        System.out.println("Your tax is " + yourTax);
        t2.setGrossIncome(240000);
        System.out.println("Your tax is " + t.calcTax());
        System.out.println("Your tax222 is " + t2.calcTax());
        System.out.println("Your NJtax is " + njTax.calcTax());
        // double yourTaxNj = njTax.calcTax();
        //double totalTax = njTax.adjustForStudents(yourTaxNj);
        String fr1 = "Mary";
        String fr2 = "Mary";
        System.out.println("compare fr1==fr2" + (fr1 == fr2));
        System.out.println("compare fr1 equalss fr2" + fr1.equals(fr2));
        StringBuffer strBuff1 = new StringBuffer();
        strBuff1.append("#Liczba1").append("#Liczba2").append("#Liczba3");
        System.out.println("String buffer content=" + strBuff1.toString());
        System.out.println("index of=" + strBuff1.indexOf("Licz"));
        System.out.println("index of 2=" + strBuff1.indexOf("Liczb"));
        System.out.println("index of 3=" + strBuff1.indexOf("Liczba2"));
        strBuff1.insert(7, "--wstawione--");
        System.out.println("String buffer content=" + strBuff1.toString());
        System.out.println("String buffer capacity=" + strBuff1.capacity());
        System.out.println("length=" + strBuff1.length());

        strBuff1.trimToSize();
        System.out.println("String buffer capacity=" + strBuff1.capacity());
        System.out.println("String buffer content=" + strBuff1.toString());
        System.out.println("String buffer capacity=" + strBuff1.capacity());
        System.out.println("length=" + strBuff1.length());
    }
}
