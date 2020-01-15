# for( : )

for( 元素 : 容器）对容器用元素进行遍历 支持 auto

如果要修改容器中的元素，将变量声明为 引用& 即可

 

可以遍历的对象包括：

- 数组。（不包括指针）
- 定义了begin()和end()方法，且返回该方法返回迭代器的类对象。（STL     中所有容器都可以）

可以进行删除操作，不影响遍历

```C++
for(auto &it : map_m)
	cout<<it.first<<' ';

for(int &x : vector_v)

for(char &c : string_s)
```

$\\$

## 自定义可遍历容器：

参考：http://www.cnblogs.com/h46incon/archive/2013/06/02/3113737.html

![语 旬 for (for(  ：).assets/clip_image001.png) loop_statement  与 以 下 旬 作 用 等 介  auto & & range = range_expression  for (auto _begin ． begin “ pr 》  end ． end expr;  begin end; “ begin) {  range_declaration  *_begin;  loop_statement  对 于 可 遍 历 的 类 对 象 ， 一 b “ in 和 一 end 分 别 由 类 的 b “ 1n0 和 end() 方 法 产 生 。 且 由 于 一 range 变 量 是 右 值 引 用 ， 如  Rrange_expression 的 结果 是 右 值， 其 将 会 在 循 坏 结 東 后 析 构 。  这 样 ， C “ 11 终 于 支 持 了 这 种 现 代 编 程 沿 訁 都 支 持 的 遍 历 方 式 了 。 但 是 ， 无 论 是 沿 法 还 是 标 准 库 都 不 支 持 对 具 体 数  字 的 遍 历 ， 比 如 ” th 。 n 中 的 for 1 xrange （ 1 ， 5 ） 语 句 中 ， x 将 连 续 取 [ 1 ， 4 ] 中 的 值 ： （ 。 t 库 有 1 “ n “ 类 可 以  满 是 这 个 需 求 ， 但 是 下 曲 会 讨 论 下 我 的 实 现 ）  最 直 接 的 方 法 ， 就 是 与 一 个 数 ， 返 回 一一 个 vector 〈 int> 对 象 ， 其 元 素 为 从 begin 到 end 的 值． 但 这 样 每 次 循 环 时 都  得 构 造 一 个 这 样 的 对 象 ， 略 慢 。  从 标 准 来 看 ， 如 果 一 个 类 要 支 持 这 样 遍 历 ， 至 少 得 有 begin() 和 end 0 方 法 。 在 f 。 r 循 环 的 初 始 化 部 分 ， 调 用 了 这  两 个 方 法 之 后 ， 就 没 这 个 类 啥 事 了 一 一 都 是 迭 代 器 的 事 。 所 以 很 自 然 ， 从 迭 代 器 上 卜 手 。 这 个 迭 代 器 必 须 支 持 三  种 操 作 ： ！ = ， 前 缀 艹 ， 解 引 用 ． 有 没 发 现 ， 如 果 这 个 “ 迭 代 器 ” 是 个 int 数 值 的 话 ， 上 而 循 环 中 的  end;++ b “ in 语 句 就 是 一 个 非 常 自 然 的 实 现 。 现 在 的 目 标 很 简 单 了 ： 这 个 “ 迭 代 器 ” 不 遍 历 容 器 中  begin ，  的 每 个 元 素 ， 面 就 是 一 个 简 单 的 int 数 值 的 封 装 。 对 其 解 引 用 将 返 回 这 个 数 ， 比 较 和 自 加 操 作 均 对 这 个 数 进 行  操 作 。  有 想 法 之 后 ， 实 现 起 来 就 很 容 易 了 · 首 先 定 义 一 个 仿 迭 代 器 Fakelter ， 其 对 一 个 数 值 进 行 釗 装 ， 并 重 我 必 须 的  操 作 符 ， ](file:///C:/Users/15363/AppData/Local/Temp/msohtmlclip1/01/clip_image001.png)