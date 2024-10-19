package bai1;

public class bai1_HCN {
    private float dai;
    private float rong;

    public bai1_HCN(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public bai1_HCN() {
    }

    public float getRong() {
        return rong;
    }

    public float getDai() {
        return dai;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    @Override
    public String toString() {
        return
                "dai=" + dai +
                ", rong=" + rong +
                '}';
    }

    public void setDai(float dai) {
        this.dai = dai;
    }
    public float tinhChuVi(){
        return (this.dai+this.rong)*2;
    }
    public float tinhDienTich(){
        return this.dai*this.rong;
    }
}
