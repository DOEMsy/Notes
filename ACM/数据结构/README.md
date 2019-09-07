# 线段树

将一条线段用二叉树分成一些段值存储

用于**快速查询(Inquire)**或**更新段值(update)**

### 建树

**父亲的区间是[a,b],(c=(a+b)/2)左儿子的区间是[a,c]，右儿子的区间是[c+1,b]，线段树需要的空间为数组大小的四倍**

```cpp
struct node{
    int l,r;
    int w;//权值
}nodes[10005];

void Build(int l,int r,int k = 0){
    nodes[k].l = l;
    nodes[k].r = r;
 	
    if(l==r){
        nodes[k].w = 0;
        return;
    }
	Build(l,(l+r)/2,k*2);	//[l,mid]
    Build((l+r)/2+1,r,k*2+1);//[mid+1,r]
    nodes[k].w = nodes[k*2].w+nodes[k*2+1].w; //区间段值 = 子区间段值之和
}
```



### 区间修改

```c++
void update(int l,int r,int w,int k = 0){
    if(nodes[k].l==nodes[k].r)//遍历到叶子
        nodes[k].w = w;
    else{
        int mid = (nodes[k].l+nodes[k].r)/2;
        if(l<=mid)
            insert(l,mid,w,k*2);
        if(mid+1<=r)
            update(mid+1,r,w,k*2+1);
        nodes[k].w = nodes[k*2].w+nodes[k*2+1].w;
    }
}
```



### 查询

```c++
int Inquire(int l,int r,int k = 0){
    if(nodes[k].l==l&&nodes[k].r==r)
        return nodes[k].w;
    else{
        int mid = (nodes[k].l+nodes[k].r)/2;
        int lw = 0,rw = 0;
        if(l<=mid)
            lw = Inquire(l,mid,k*2);
        if(mid+1<=r)
            rw = Inquire(mid+1,r,k*2+1);
        return lw+rw;
    }
}
```

