package Examples.Method;

enum Car {
    lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
    private int price;
    Car(int p){
        price =p;
    }
    int getPrice(){
        return price;
    }
}
public class TestEnum {
    public static void main(String[] args){
        System.out.println("所有汽车的价格：");
        for(Car c:Car.values())
            System.out.println(c+" 需要"+c.getPrice()+" 千美元。");
    }
}

-------------
Output:
所有汽车的价格：
lamborghini 需要900 千美元。
tata 需要2 千美元。
audi 需要50 千美元。
fiat 需要15 千美元。
honda 需要12 千美元。
