public class KV1 extends Tank{
    public KV1(int weight, int horsePower, int widthArmor) {
        super(weight, horsePower);
        this.widthArmor = widthArmor;

    }
    private int widthArmor;

    public int getWidthArmor() {
        return widthArmor;
    }
    public  void print(){
        System.out.println(getInfo() + "\nWidth armor: " + widthArmor);
    }
}

