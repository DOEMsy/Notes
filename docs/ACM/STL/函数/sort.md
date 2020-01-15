# sort

```C++
sort(begin,end,[](T a,T b){
   //return cmp(a,b); 
    return a.f>b.f;
});

sort(begin,end,[i](T a,T b){
    return a.f[i]>b.f[i];
})
```

