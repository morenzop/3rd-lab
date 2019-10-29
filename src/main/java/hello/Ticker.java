package hello;

public class Ticker {
    private String base;
    private String BTC;
    private String target;
    private String USD;
    private String price;
    private String volume;
    private String change;

    public Ticker(){

    }

    public Ticker(String base, String BTC, String target, String USD, String price, String volume, String change) {
        this.base = base;
        this.BTC = BTC;
        this.target = target;
        this.USD = USD;
        this.price = price;
        this.volume = volume;
        this.change = change;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBTC() {
        return BTC;
    }

    public void setBTC(String BTC) {
        this.BTC = BTC;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUSD() {
        return USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", BTC='" + BTC + '\'' +
                ", target='" + target + '\'' +
                ", USD='" + USD + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", change='" + change + '\'' +
                '}';
    }
}
