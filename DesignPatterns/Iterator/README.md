Iterator 模式  
  
1.Iterator模式用于在数据集合中按照顺序遍历集合，单词Iterate有反复做某件事情的意思，汉语又称迭代器。  
2.类和接口的一览表：

   Aggregate:表示集合的接口  
   Iterator：遍历集合的接口  
   Book:表示书的类  
   BookShelf:表示书架的类  
   BookShelfIterator:遍历书架的类  
   Main：测试程序行为的类  
3.不要只使用具体类来编程，要优先使用抽象类和接口来编程。  
4.关于next方法的名字：returnCurrentElementAdvanceToNextPosition  即next方法是“返回当前的元素，并指向下一个元素”  
5.关于hasNext()方法，理解为“确认接下来是否可以调用next方法”的方法。  
6.不需要deleteIterator:在Java中，没有被使用的对象实例，将会被自动删除（垃圾回收，GC），因此，在iterator中不需要与其对应的deleteIerator方法。  



相关的设计模式：  
1.Vistor模式  
2.Composite模式  
2.Factory Method模式  


