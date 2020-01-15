# set&map

### 构造函数 

set<T> s      

- set<T>s(s1)       复制构造

map<T>m

- map< T1, T2 >m(m1)

- 相当于 set<pair<T1,T2> >
- 用起来和python的集合一样
- 一切排序与查找以T1为主

multiset <T> ms

- 用法和set一样，但是允许存入多个同样元素
- 就是map<T,int>，但是操作方式更为简单
- 使用 count(键值）查询

 

### 引用

- begin()      返回容器第一个元素的位置
- end() 返回容器最后一个元素的下一个位置

- 无法使用下标引用
- map可以通过m[键值]来引用或修改T2

### 遍历：

可以使用      set<T>::iterator it = s.begin();

for(;it!=s.end();it++)       进行遍历

- 对没有插入过的键值元素进行运算，初始元素值为0；如 m[str]++; 后 m[str]值为1

### 搜索

find (key-value) 返回值为指定键值的元素地址

- 没有该元素则返回       end()
  

lower_bound      (键值）返回第一个（最小）大于等于目标键值的元素地址

upper_bound      (键值）返回最后一个（最大）大于目标键值的元素地址

count (键值) 返回某一个值在集合中出现的次数

- 因为集合元素不能重复，所以相当于判断元素是否存在于集合中

### 容器状态

- empty()      判断是否为空
- size()      返回容器大小
- max_size()      返回容器最大可以允许的大小

### 插入

insert      (key-value) 将键值插入集合中，如果值已经存在则直接返回

- 返回值是 pair<set<int>::iterator,bool>类型的 (插入地址或原元素地址，是否成功）  

insert      (地址1，地址2）将 [地址1,地址2) 的元素全部插入集合

- map插入键值的方式必须是insert      (pair<T1,T2>)
- map可以使用 m[键值] = 值 直接插入（如python一般）

### 删除

- erase (iterator)      删除目标地址的元素
- erase (地址1，地址2）删除 [地址1,地址2) 的元素
- erase      (key-value) 删除指定键值的元素
- clear()      清空容器

### 说明

- 容器实现方法是红黑树(RB),容器有序，操作复杂度$Olgn$，自定义数据需重载 $<$