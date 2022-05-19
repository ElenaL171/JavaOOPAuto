public class Auto {
    String model;
    int year;
    String color;
    public Auto(String m, int y, String c)
    {
        model=m;
        year=y;
        color=c;
    }
    public void print()
    {
        System.out.println(model+" "+year+" "+color);
    }
}
