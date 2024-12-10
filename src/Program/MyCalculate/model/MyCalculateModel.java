package Program.MyCalculate.model;

public class MyCalculateModel {
    private double value_1;
    private double value_2;
    private double result;

    public MyCalculateModel() {
    }

    public MyCalculateModel(double value_1, double value_2, double result) {
        this.value_1 = value_1;
        this.value_2 = value_2;
        this.result = result;
    }

    public double getValue_1() {
        return value_1;
    }

    public void setValue_1(double value_1) {
        this.value_1 = value_1;
    }

    public double getValue_2() {
        return value_2;
    }

    public void setValue_2(double value_2) {
        this.value_2 = value_2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void phep_cong(){
        this.result = this.value_1 + this.value_2;
    }

    public void phep_tru(){
        this.result = this.value_1 - this.value_2;
    }

    public void phep_nhan(){
        this.result = this.value_1 * this.value_2;
    }

    public void phep_chia(){
        this.result = this.value_1 / this.value_2;
    }
}
