public class Main {
    public static void main(String[] args)
    {
    //Создать класс автомобиль, у которого должны быть следующие поля - модель, год выпуска, цвет.
    //Создать метод печати.
    //Создать в методе main несколько объектов класса, положить их в массив и распечатать
 Auto date1=new Auto("Citroen Grand Picasso", 1992, "schwarz");
 Auto date2=new Auto("Mercedes Benz", 1997, "rot");
 Auto date3=new Auto("Opel", 2001, "rot");
 Auto date4=new Auto("Audi", 2021, "blau");
 Auto []dateArray={date1,date2,date3,date4};
 for (int i = 0; i < dateArray.length; i++) {
     dateArray[i].print();
 }
    }
}
