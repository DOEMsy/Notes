# list

## 构造对象

- list\<T\>c 创建空链表
- 开辟空间
  - list\<T\>c ( n );        开辟n个元素
- 赋值构造
  - list\<T\>c ( n , const &a ); 开辟n个元素 并赋值为a

## 复制构造

- list\<T\>c (c1); 复制c1
- list\<T\>c (地址1,地址2);      复制区域内元素构造

## 添加元素

- push_back(T &a) 尾部添加一个元素
- push_front(T &a) 首部添加一个元素
- insert(地址，T &a) 在位置前插入元素
- insert(地址,n,T &a）在位置前插入n个元素
- insert(地址，地址1，地址2）在地址位置插入[地址1，地址2）的元素

## 移除元素

- pop_back() 推出尾部元素
- pop_front() 推出首部元素
- erase( 地址 i ) 删除目标地址元素
- erase( 地址i , 地址 j ) 删除[ 地址 i ,地址 j ) 之间的元素
- remove(T &a) 删除与a匹配的元素
- clear() 清除全部数据

## 引用元素

- front() 返回首元素值
- back() 返回尾元素值
- begin() 返回首地址
- end() 返回尾元素地址的下一位

- 无法使用下标引用

## 容器状态

- empty() 返回值为bool 如果是空为1 否者为0
- size() 返回值为元素个数

## 链表操作

重新定义长度

- resize(n) 重新定义长度n，超出原始长度的部分用0代替
- resize(n,T &a) 重新定义长度n，超出部分用a代替
- 如果重新定义长度小于原长度则删除多余的

$\\$

- reverse() 反转链表
- sort() 将链表排序，默认升序
- sort(cmp) 自定义排序规则

## 双链表合成

- c1.merge(c2)   合并2个有序的链表并使之有序,从新放到c1里,释放c2。
- c1.merge(c2,comp)         合并2个有序的链表并使之按照自定义规则排序之后从新放到c1中,释放c2。
- c1.splice(c1.beg,c2,c2.beg)         将c2的beg位置的元素连接到c1的beg位置，并且在c2中施放掉beg位置的元素
- c1.splice(c1.beg,c2,c2.beg,c2.end)         将c2的[beg,end)位置的元素连接到c1的beg位置并且释放c2的[beg,end)位置的元素