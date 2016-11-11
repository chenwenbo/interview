# interview
此项目主要用于Java面试题的总结，会将我的刷题中有疑问的部分都总结下来，巩固自己的知识。

### Spring事务传播属性(事务传播属性|隔离界别|只读|事务超时）
**事务传播属性**
* propagation-required -- 支持当前事务，如果当前没有事务，就新建一个事务。
* propagation-supports -- 支持当前事务，如果没有事务，就以非事务的形式执行。
* propagation-mandatory -- 支持当前事务，如果当前没有事务，就抛出异常。
* propagation-requires-new -- 新建事务，如果当前存在事务，把当前的事务挂起。
* propagation-not-supported -- 以非事务的形式执行操作，如果存在当前事务，就把当前事务挂起。
* propagation-never -- 以非事务的方式执行，如果当前存在事务，则抛出异常。

note : 可利用英文对应的翻译进行记忆，never不能存在事务，否则排除异常，mandatory当前必须存在事务否则抛出异常，required当前不存在事务则创建一个事务。

### Servlet
GenericServlet是抽象类，提供的是骨架的功能，定义了servlet的生命周期，其设计与应用层无关。service就是在此类中进行实现。
HttpServlet是GenericServlet的子类，实现了与Http协议的相关内容，doGet,doPost就是在此类中进行实现。

### forward 和 redirect
forward : 地址不变
redirect : 地址会发生变化

### 加载驱动程序的三种方式
1. Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
2. DriverManager.registerDriver(new com.mysql.jdbc.Driver());
3. System.setProperty("jdbc.drivers", "com.mysql.jdbc.Driver");

### sleep和wait
* sleep是Thread的方法，wait是Object的方法
* sleep不释放对象锁，wait放弃对象锁
* sleep暂停线程，但监控状态依然保持，结束后会自动恢复
* wait后进入等待锁定池，只有针对发出notify或者notify all方法才能重新进入等待状态。

### 基本数据类型
JVM中一个字节一下的整形数据会在JVM启动的时候加载进入内存缓存起来，除非使用new显式创建.否则对象的引用都是同一个。
基本数据类型和包装类型进行比较的时候会自动拆箱，比较数值
```
Integer a = 23;
int b =23 ;
assertEqual(ture,a==b);
```

### JVM内存参数配置
虚拟机中堆区共划分三个代，年轻代、年老点、持久代。其中持久代主要存放的是Java的类信息，与GC要收集的Java对象关系不大。年轻代和年老代的划分是对垃圾收集影响比较大。
**年轻代**
所有新生成的对象首先都放在年轻代，年轻代的目标就是尽可能快速收集掉那些生命周期短的对象。年轻代分为三个区：一个Eden区和两个Survivor区，大部分对象都是Eden区中生成。当Eden区满时，还存活的对象讲被复制到Survivor区（两个中的一个），当这个Survivor区满时，此区的存活对象将被复制到另一个survivor区，当这个survivor也满的时候，从第一个survivor区复制过来的并且此时还存活的对象，将被复制到“年老区”。
**年老代**
在年轻代中经历了N次GC之后仍然存活的对象，就会被放到年老代中。因此，可以认为年老代中存放的就是一些生命周期较长的对象。
**持久代**
用于存放静态文件，如今的Java类、方法等。持久代对垃圾回收没有显著的影响，但是有些应用可能动态生成或者调用一些class,例如hibernate等，在这种时候需要设置一个比较大的持久代空间来存放新增的类。持久代通过-XX:MaxPermSize=（N）进行设置。

什么情况下触发垃圾回收？
由于对象进行了分代处理，因此垃圾回收区域、时间也不一样。GC有两种类型:Scavenge GC和Full GC
-Xmx10240m -Xms10240m -Xmn5120m -XXSurvivorRatio=3
-Xmx : 最大堆大小
-Xms : 初始堆大小
-Mmn : 年轻代大小
-XXSurvivoRatio : 年轻代中Eden和Survivor区的大小比值

### StringBuilder vs StringBuffer
StringBuilder 非线程安全
StringBuffer 线程安全

### Volatile修饰符
Volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
一个volatile对象引用可能是null。
Volatile不能作为计数器，因为其值是实时刷新的，所以可能造成计数器不能跳出循环。

### Transient修饰符
序列化的对象包含被transient修饰的实例变量时，java虚拟机(JVM)跳过该特定的变量。
该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。

### Hibernate get/load
get : 非延迟加载
load : 延迟加载

### Java daemon线程
JVM中存在两种线程：用户线程和守护线程。

所谓的守护线程，是指用户程序在运行的时候后台提供的一种通用服务的线程，比如用于垃圾回收的
垃圾回收线程。这类线程并不是用户线程不可或缺的部分，只是用于提供服务的"服务线程"。
基于这个特点，当虚拟机中的用户线程全部退出运行时，守护线程没有服务的对象后，JVM也就退出了。

### call by value VS call by reference 
* call by value不会改变实际参数的数值
* call by reference不能改变实际参数的参考地址
* call by reference能改变实际参数的内容

### 基本数据类型之间的比较
* 基本数据类型的包装类之间比较不会进行拆箱操作
* 基本数据类型的equals函数不会进行转型。
```
Integer i = 42;
Long l = 42l;
Double d = 42.0;
System.out.println(i==l); //compile error
System.out.println(i==d);//compile error
System.out.println(l==d);//compile error
System.out.println(l.equals(i));//false
System.out.println(l.equals(d));//false
System.out.println(d.equals(i));//false
```

1) boolean不可以转换为其他的数据类型

2) 整数型，浮点类型，字符型是可以相互转换的，转换时遵守下面的原则：
    a. 容量小的类型自动转换为大的类型，数据类型按容量大小排序为：
    　　　　　byte, short, char < int < long <float < double
    b. byte, short, char 三种类型间不会相互转换，他们三者在计算时，首先会转换为int类型
    c. 容量大的类型在转换为小的类型的时候，必须加上强制转换符，此时可能造成精度降低或者溢出问题
    d. 有多种数据类型混合计算的时候，系统首先自动转换为容量最大的那个类型再来继续计算
    e. 实数类型默认为double类型，如， 1.2； 整数类型默认为int类型，如 1


### Java编译相关
** 环境变量可在编译source code时指定
** javac一次可同时编译数个Java源文件
** javac.exe能指定编译结果要置于哪个目录（directory）

### 构造函数调用顺序
子类的构造方法总是先调用父类的构造方法，如果子类的构造方法没有明显地指明使用父类的哪个构造方法，子类就调用父类不带参数的构造方法。
而父类没有无参的构造函数，所以子类需要在自己的构造函数中显示的调用父类的构造函数。

### final
* 如果是针对基本数据类型，那么该变量是线程安全的，
* 如果是引用类型，只能保证是引用是线程安全的，但是其具体指代的值可能发生改变。
* final 修饰的方法不能被重写，但是可以被重载。重载是同一个类方法之间的关系，重写是父子类之间的关系。

### 重载和重写
* 重载发生在同一个类的方法之间，重载的方法名必须相同，参数的类型和个数必须不同,返回类型可以相同也可以不同。
* 重写发生在父子类之间，final修饰的方法不能被重写。
* 重载与权限修饰符无关。

### Java锁
* 截止到JDK8,Java中并发框架支持锁包括：读写锁，自旋锁，乐观锁

### JDBC Statement VS PrepareStatement
Statement执行一条sql就得编译一次，PrepareStatement只编译一次；常用后者原因在于参数设置非常方便；执行一条sql就得编译一次，后者只编译一次；还有就是sql放置的位置不同; 常用后者原因在于参数设置非常方便；

**使用PrepareStatement的好处**

* 代码的可读性和可维护性.
* PreparedStatement尽最大可能提高性能.
* 最重要的一点是极大地提高了安全性.

### Java用监视器机制实现了多个进程之间的异步执行。

### String
* 长度判断使用length()
* 后面可以跟字符或者字符串或者数字 str+'a' or str+"name" or str+100 
* 后面跟字符时不能出现空格 str+' a' -> error

### Java继承
* 子类不能父类的构造方法，只能调用父类的构造方法
* 子类可以给父类赋值，但是不能调用子类独有的方法
* 父类不能给子类赋值。

### Java修饰符
* private 类内部 
* default 类内部 同一包中 
* protected 类内部 同一包中 子类 
* public 类内部 同一包中 子类 任何地方

### Java赋值
JAVA的赋值运算是有返回值的，赋了什么值，就返回什么值。
if(flag =true) is ok

### Java native
Java中定义的native方法不需要实现，即不存在方法体

### Java Class
getClass().getName() - 子类包名+类名
getClass().getSuperClass().getSuperName()

### i++ VS ++i
* ++i 会先对自身进行赋值
* i++ 不会对自身进行赋值

### Spring IOC
优点：通过依赖注入的方式构建对象，管理对象的生命周期，减少代码的耦合，通过配置的方式生命对象的依赖关系，方便测试，支持加载服务时的饿汗式和懒加载。
依赖注入的方式：
* 构造器注入
* setter方法注入
推荐使用构造器方式实现强制依赖，setter方式提供可选依赖.

### session cookie  

