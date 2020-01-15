# cin&cout

## -------------cout控制符：

- Setbase(int)    设置输出数字的进制，不支持2进制；

- - 进制输出控制符：hex 16 ,oct 8 ；

 

- << Setiosflags(ios::fixed)     << Setprecision(int) 设置小数点后长度；
- Setw(int)设置最低域宽，setfill(char)设置填充字符

- ios::sync_with_stdio(false);以及cin.tie(NULL) ///与c输入输出函数兼容关闭

- - 可以加速cin cout的速度 直接写就行 开启之后无法使用getline(cin,str)，这种c输入输出与流输入输出结合的函数 

 

## --------------cin

char c[20];

Char a；

- cin.get(a) 或者 a=cin.get()     类似于getchar 接收一个字符,可以接收空格

- - Cin.get(char)

- - Cin.get(char* ,      接受字符数目) 接收字符串
  - 不能对string进行操作

 

- Cin.getline(char*,字符个数,结束字符)

- - 字符个数中’\0’占一位 可以接收空格

- - 不支持string

 

- getline(cin,str) 函数用来处理string读入一整行数据，

- - 其应用方式与cin>>str;类似，可以返回EOF
  - 可以通过函数重载 getline(cin,str,’’)      让函数输入到指定字符后停止输入。其默认为‘\n’。