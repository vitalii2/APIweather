public class Temperature {
    private Double temp;
    private Double feels;
    private Double tMin;
    private Double tMax;

    public Temperature(String[] s) {
        this.temp = (Double.parseDouble(s[1]) - 273.15);
        this.feels = (Double.parseDouble(s[3]) - 273.15);
        this.tMin = (Double.parseDouble(s[5]) - 273.15);
        this.tMax = (Double.parseDouble(s[7]) - 273.15);
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getTemp() {
        return String.format("%.2f", temp);
    }

    public void setFeels(Double feels) {
        this.feels = feels;
    }

    public String getFeels() {
        return String.format("%.2f", feels);
    }

    public void settMax(Double tMax) {
        this.tMax = tMax;
    }

    public String gettMax() {
        return String.format("%.2f", tMax);
    }

    public void settMin(Double tMin) {
        this.tMin = tMin;
    }

    public String gettMin() {
        return String.format("%.2f", tMin);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Temperature { current temp - " + getTemp() + " feels like - "
                + getFeels() +
                " temp max value - " + gettMax() + " temp min value - "
                + gettMin() + "}";
    }
}
