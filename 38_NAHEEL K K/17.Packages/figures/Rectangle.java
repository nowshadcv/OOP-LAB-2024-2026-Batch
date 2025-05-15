package figures;

interface FigureRect{
    int area();
    int perimeter();
}

public class Rectangle implements FigureRect{
    private int l,b;
    public Rectangle(int a,int b){
        l = a;
        this.b = b;
    }
    public int area(){
        return (l*b);
    }
    public int perimeter(){
        return (4*(l+b));
    }
}