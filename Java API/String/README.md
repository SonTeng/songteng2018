1. Java将字符串实现String类型的对象。而非其他语言中作为字符数组实现字符串。  
2. String、StringBuffer、StringBuilder类均在java.lang中定义，即所有程序均可以使用它们，由于所有这些类被声明为final，所有这些类不能有子类。这三个类实现了CharSequence接口。  
3. 当创建String对象时，创建的字符串不能修改，即一旦创建了一个String对象，就不能改变这个字符串中包含的字符。但在任何时候都可以修改String引用变量，使其指向其他String对象。对于需要修改字符串的情况，Java提供两个类作为选择：StringBuilder,StringBuffer.  
4.
