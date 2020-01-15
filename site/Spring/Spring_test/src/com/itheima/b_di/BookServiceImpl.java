package com.itheima.b_di;

public class BookServiceImpl implements BookService {
    //1 原方法 接口 = 实现类
    private BookDao bookDao1 = new BookDaoImpl();

    //2 Spring方法  接口+setter方法
    private BookDao bookDao2;
    public void setBookDao2(BookDao bookDao2) { //setter 方法
        this.bookDao2 = bookDao2;
    }

    @Override
    public void addBook() {
        //this.bookDao1.addBook();
        this.bookDao2.addBook();
    }
}
