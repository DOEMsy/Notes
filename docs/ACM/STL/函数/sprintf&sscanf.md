# sprinf,sscanf

$sprintf(char*,输出)$, $sscanf(char*,输入)$ 函数,用法和$printf$，$scanf$一样。区别在于对应输入输出端口是字符串。 

```C++
sprintf(char_a,"%d",int_x) 将x输出到a中 （int -> char)

sscanf(char_a,"%d",&int_x) 从a中输入x (int <- int )
```

