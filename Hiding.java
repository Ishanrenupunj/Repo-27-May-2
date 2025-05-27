public class Hiding {
    private double length;
    private double breadth;
    public void setlength(double length){
        this.length=length;
    }
    public void setbreadth(double breadth){
        this.breadth=breadth;
    }
    public double getlength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
    public double area(){
        return getlength()*getbreadth();
    }
    public static void main(String[] args) {
        Hiding h=new Hiding();
        h.setlength(20);
        h.setbreadth(50);
        System.out.println("area:"+h.area());
        System.out.println("length="+h.getlength());
        System.out.println("breadth"+h.getbreadth());
    }
}