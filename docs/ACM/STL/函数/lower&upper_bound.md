# lower/upper_bound

$lower\_bound     (begin,end,值)$

- 返回 第一个（最小）大于等于目标键值的元素地址

$upper\_bound     (begin,end,值)$

- 返回 最后一个（最大）大于目标键值的元素地址

查到到的地址 $p$满足$p - begin = p位置元素的下标 = (begin->p的元素个数)-1$