一. 构造函数：  
1.String str = new String(); 
2.String(char char[]);  
3.String(char chars[],int startIndex,int numChars);  
注：Java的char类型使用16位表示基本的Unicode字符集，但在Internet上，字符串的典型格式是使用从ASCII字符集构造的8位字节数组，因为8位的ASCII字符串很常见，故String提供了使用字节数组初始化字符串的构造函数。
4.String(String strObj);
