# queue

### 构造对象：

- queue      < T > q; 创建一个空的队列
- queue      < T > q (q1); 复制构造函数 构造一个与q1一样的队列

### 入与出：

- pop() 推出首部元素
- push(const      T &a) 尾部推入元素a

### 引用元素

- front()      返回首部元素的值
- back()      返回尾部元素的值
- 内部是隐藏的 不可以使用下标引用元素

### 容器状态

- empty()      返回值为bool 如果是空为1 否者为0
- size()      返回值为元素个数

$\\$

## deque

双端队列，支持前后出前后进

$\\$

## priority_queue

### 构造对象

priority_queue<类型>q;      默认构造最大堆

可以使用'<' 与  '>'重载定义排序规则

```C++
bool operator < (node &a,node &b){
    return a.v < b.v;
}
priority_queue<node>q;
```

priority_queue<类型,vector<类型>,排序规则 >q;

- less<T> 规则      越来越小--最大堆，顶部最大，相当于默认
- greater<T>规则      越来越大---最小堆，顶部最小

cmp函数 自定义规则

- priority_queue<T,vector<T>,cmp>q;

```C++
struct cmp{
    bool operator () (int a,int b)const{
        return a%10>b%10;
    }
}

priority_queue<T,vector<T>,cmp>q;
```



### 入与出

- pop() 推出顶部元素
- push(constT      &a) 插入a并保证有序

### 引用元素

- top()      返回顶部元素的值
- 无法使用下标引用

### 容器状态

- empty()      返回值为bool 如果是空为1 否者为0
- size()      返回值为元素个数

### 说明

- 优先队列的实现方式为堆，只能引用顶部元素，并且在每一次插入或者推出都遵循堆的方式，以保证时刻有序。