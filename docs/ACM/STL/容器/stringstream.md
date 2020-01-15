# stringstream

头文件sstream

- Stringstream ss;

操作类似于cout,cin流

- ss<<input;       输入缓冲区

- ss>>output;       将数据第一组输入到缓冲区的数据输出

  如果在输入一组数据的时候未在结尾加入endl,

  则该组数据会一直存在，即使输出也不会被弹出流

- 可以使用部分cin,cout的操作命令

不能直接将流作为流的输入，否者会输出地址。

- 如：cout<<ss<<endl; 为ss的地址

 

函数：ss.str() 返回值为和ss流空间等价的字符串，并不会弹出数据

- ss.clear() 清空流空间