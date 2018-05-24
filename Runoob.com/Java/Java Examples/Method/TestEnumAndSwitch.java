/**Java创建枚举类型要使用enum关键字，隐含了所创建的类型都是java.lang.Enum类的子类 */

public class TestEnumAndSwitch {
    enum Car{
        lamborghini,tata,audi,fiat,honda
    }
    public static void main(String[] args){
        Car c;
        c=Car.tata;
        switch(c) {
            case lamborghini:
                System.out.println("你选择了 lamborghini!");
                break;
            case tata:
                System.out.println("你选择了 tata!");
                break;
            case audi:
                System.out.println("你选择了 audi!");
                break;
            case fiat:
                System.out.println("你选择了 fiat!");
                break;
            case honda:
                System.out.println("你选择了 honda!");
                break;
                default:
                    System.out.println("我不知道你的车型！");
                    break;
        }
    }
}
-------------
Output:
你选择了 tata!
