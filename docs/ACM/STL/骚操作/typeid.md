# typeid

**typeid**是C++的关键字之一，等同于sizeof这类的操作符。typeid操作符的返回结果是名为**type_info**的标准库类型的对象的引用。

有两种用法：

* typeid(类型关键字） 
*  typeid(变量)  

支持方法：

 == != 		比较类型

.name() 	返回类型的字符串

```C++
char a;

cout<<typeid(a).name()<<endl;

cout<< typeid(a)==typeid(char) <<endl;
```

