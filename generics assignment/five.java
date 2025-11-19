import java.util.ArrayList;

class five {}
class Apple extends five {}
class Mango extends five {}
class FruitBox<T extends five> {
    ArrayList<T> list=new ArrayList<>();
    void add(T f){ list.add(f); }
    void display(){ for(T f:list) System.out.println(f); }
    public static void main(String[] args) {
        FruitBox<Apple> box=new FruitBox<>();
        box.add(new Apple());
        box.display();
    }
}
