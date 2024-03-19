package them.UlsanJava.MidTerm;

interface Cooler {
    final int MAX_TEMPERATURE = 20;
    final int MIN_TEMPERATURE = -20;

    abstract int temperatureChange(int temperature);

    int temperatureUp();

    int temperatureDown();
}


class Appliance {
    public int temperature = 0;
    String company;
    public int year;

    public Appliance(String company, int age) {
        this.company = company;
        this.year = year;
    }
}


class Refrigerator extends Appliance implements Cooler {
    public int temperatureChange(int temperature) {
        if (MAX_TEMPERATURE < temperature || MAX_TEMPERATURE == temperature) {
            this.temperature = MAX_TEMPERATURE;
        } else if (MAX_TEMPERATURE > temperature && MIN_TEMPERATURE < temperature) {
            this.temperature = MIN_TEMPERATURE;
        } else if (MIN_TEMPERATURE > temperature) {
            this.temperature = temperature;
        }
        return temperature;
    }

    public int temperatureUp() {
        if (this.temperature > MAX_TEMPERATURE) {
            this.temperature = MAX_TEMPERATURE;
        } else {
            this.temperature++;
        }
        return temperature;
    }

    public int temperatureDown() {
        if (this.temperature < MIN_TEMPERATURE) {
            this.temperature = MIN_TEMPERATURE;
        } else {
            this.temperature--;
        }
        return temperature;
    }

    public Refrigerator(String company, int year) {
        super(company, year);
        temperatureChange(301);
    }
}


public class Exam18 {
    public static void main(String[] args) {
        new Refrigerator("SamSung", 1);
    }
}
