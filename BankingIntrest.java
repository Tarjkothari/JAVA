class Bank {
    float getRateOfInterest() {
        return 0;
    }
}


class SBI extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.0f;
    }
}


class ICICI extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.5f;
    }
}


class AXIS extends Bank {
    @Override
    float getRateOfInterest() {
        return 7.75f;
    }
}


public class BankingIntrest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("Rate of Interest in SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of Interest in AXIS: " + axis.getRateOfInterest() + "%");
    }
}
