/** 查找数组中的重复元素*/

public class RepetiteArrayElem {
    public static void main(String[] args){
        int[] my_array = {1,2,3,3,5,6,6,7,10,2};
        for(int i=0;i<my_array.length-1;i++){
            for(int j=i+1;j<my_array.length;j++){
                if(my_array[i]==my_array[j] && (i!=j)){
                    System.out.println("重复单词："+my_array[j]+"，其在数组中的位置是:"+i+"和"+j);
                }
            }
        }
    }
}
------------------
Output:
重复单词：2，其在数组中的位置是:1和9
重复单词：3，其在数组中的位置是:2和3
重复单词：6，其在数组中的位置是:5和6
