public class TestPrintArray {
    public static void main(String[] args){
        Integer[] integerArray = {1,2,3,4,5,6,7};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] charArray = {'H','E','L','L','O'};
        System.out.println("输出整型数组：");
        printArray(integerArray);
        System.out.println("\n输出双进度型数组：");
        printArray(doubleArray);
        System.out.println("\n输出整型数组：");
        printArray(charArray);
    }
    public static void printArray(Integer[] inputArray){
        for(Integer element:inputArray){
            System.out.printf("%s",element+" ");
        }
        System.out.println();
    }
    public static void printArray(Double[] intputArray){
        for(Double element:intputArray){
            System.out.printf("%s",element+" ");
        }
        System.out.println();
    }
    public static void printArray(Character[] intputArray){
        for(Character element:intputArray){
            System.out.printf("%s",element+" ");
        }
        System.out.println();
    }
}
-----------------------
Output:
输出整型数组：
1 2 3 4 5 6 7 

输出双进度型数组：
1.1 2.2 3.3 4.4 5.5 6.6 7.7 

输出整型数组：
H E L L O 

