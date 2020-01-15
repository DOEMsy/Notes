# next_permutation 

\#inlude <algorithm\>

bool     next_permutation$(地址1，地址2)$

- 将$[地址1，地址2)$内的数组排列成按字典序排列的下一种全排列方式

- 并返回重排列后是否还有下一种

bool      pre_permutation$(地址1，地址2)$

- 功能同上，不过是上一种

```c++
string str = "abc";
do
{
	cout<<str<<endl;	
}while( next_permutation(str.begin(),str.end()) )

输出结果为:
abc
acb
bac
bca
cab
cba
```

