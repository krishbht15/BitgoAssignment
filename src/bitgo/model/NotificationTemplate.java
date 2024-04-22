package bitgo.model;

public class NotificationTemplate {

    private int id;
    private int currentPrice;
    private int marketDayVolume;
    private int intraDayHighPrice;
    private int marketCap;
    private boolean isDeleted;

    public NotificationTemplate(int id, int currentPrice, int marketDayVolume, int intraDayHighPrice, int marketCap) {
        this.id = id;
        this.currentPrice = currentPrice;
        this.marketDayVolume = marketDayVolume;
        this.intraDayHighPrice = intraDayHighPrice;
        this.marketCap = marketCap;
        this.isDeleted = false;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getMarketDayVolume() {
        return marketDayVolume;
    }

    public void setMarketDayVolume(int marketDayVolume) {
        this.marketDayVolume = marketDayVolume;
    }

    public int getIntraDayHighPrice() {
        return intraDayHighPrice;
    }

    public void setIntraDayHighPrice(int intraDayHighPrice) {
        this.intraDayHighPrice = intraDayHighPrice;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "NotificationTemplate{" +
                "id=" + id +
                ", currentPrice=" + currentPrice +
                ", marketDayVolume=" + marketDayVolume +
                ", intraDayHighPrice=" + intraDayHighPrice +
                ", marketCap=" + marketCap +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
