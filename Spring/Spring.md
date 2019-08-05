# Spring 框架

> 给各位表演四小时速成Spring
>
> (上面催项目了，然而目前还啥也不会)

# Spring 概述

* Spring核心：**控制反转(IOC)**和**面向切面(AOP)**

### 优点

* 方便对象之间的耦合，简化开发
  * 自动创建和维护所有对象（Bean）

# Spring 体系结构

![1564991962591](Spring.assets/1564991962591.png)

### **核心容器**：

* Beans 对象
* core 核心
* centext 配置文件
* expression SpEl表达式



# 入门案例 IOC

### 1.导入4+1 jar包

* 4个**核心容器** +1个依赖（commons-logging…jar)

  spring-**beans**-`vision`.RELEASE.jar

  spring-**context**-`vision`.RELEASE.jar

  spring-**core**-`vision`.RELEASE.jar

  spring-**expression**-`vision`.RELEASE.jar

  commons-logging-`vision`.jar

  *在IDEA中创建Spring项目后自动导入*

### 2.目标类

* 提供UserService接口实现类

* 获得UserService实例

  > 之前直接new一个对象
  >
  > Spring中将由Spring创建对象实例 即**IOC控制反转**
  >
  > 创建对象实例的工作交给Spring
  >
  > 需要实例对象时直接从Spring拿

  ```java
  public interface UserService {//虚类
      public void addUser();
  }
  ```

  ```java
  public class UserServiceImpl implements UserService {//写出实现类
      @Override
      public void addUser(){
          System.out.println("a_ioc add user");
      }
  }
  ```

  

### 3.配置文件

* 位置：*任意*，一般于src下

* 名称：*任意*，常用`application`Context.xml

* 内容：schema 约束

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://www.springframework.org/schema/beans
                             http://www.springframework.org/schema/beans/spring-beans.xsd">
          <!--这个就是传说中的schema约束-->
          <!--配置service
              <bean> 配置需要创建的对象
                  id: 用于从Spring容器获得实例用的
                  class: 需要创建实例的全限定类名 ？？？？
          -->
          <!--将实现类放到容器中,一般起名为UserServiceID-->
          <bean id="UserServiceID" class="com.itheima.a_ioc.UserServiceImpl"></bean>
  
  </beans>
  ```

  

### 4.测试

```java
public class TestIOC {
    @Test       //声明测试，则不需要写main
    public void demo01(){
        //之前获取实例
        UserService test1 = new UserServiceImpl();
        test1.addUser();

        //Spring方法
            //1获得容器
        String beansxmlPath = "com/itheima/a_ioc/beans.xml";
        ApplicationContext testContext = new ClassPathXmlApplicationContext(beansxmlPath);
            //2创建实例
        UserService test2 = (UserService) testContext.getBean("UserServiceID"); //从容器中获取实例，需要强转
        test2.addUser();

    }
}

```





# IOC理解

将类扔到Spring容器里面，创建新对象再拿出来

* Spring容器 ： `application`Context 配置文件

  * 配置 <bean>
    * id ： 引用的时候用的名称
    * class : 装载的类名称

* 从容器取出类：

  * 首先得到目标容器

    ```java
    ApplicationContext testContext = new ClassPathXmlApplicationContext(beansxmlPath);
    ```

  * 再从容器中取出类赋予对象（需要强转）

    ```java
    UserService test2 = (UserService) testContext.getBean("UserServiceID"); 
    ```

和将类扔到字典(dict)里差不多