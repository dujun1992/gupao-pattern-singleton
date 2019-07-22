【单例模式】是指确保一个类在任何情况下都绝对只有一个实例，并提供一个全局访问点，隐藏其所有的构造方法。单例模式是创建型模式。
【饿汉式】在类加载的时候就立即初始化，并且创建单例对象。优点：没有加任何的锁、执行效率比较高，线程安全。缺点：类加载的时候就初始化，不管用与不用都占着空间，浪费了内存。
【懒汉式】被外部类调用的时，才创建实例。在写法上应注意线程安全性、分配实例内存时指令重排序及双重空检查，所以性能较饿汉式差些。
【静态内部类式】兼顾饿汉式的内存浪费，也兼顾synchronized性能问题。内部类一定是要在方法调用之前初始化，巧妙地避免了线程安全问题。
【注册式】将每一个实例都登记到某一个地方，使用唯一的标识获取实例。注册式单例有两种写法：一种为枚举登记（饿汉式），一种为容器缓存。
              枚举式：在JDK枚举的语法特殊性，优雅的避免了序列化和反射对单例的破坏。
              容器缓存：使用 ConcurrentHashMap来存储实例，注意使用synchronize保证线程安全。
【反射破坏单例】为避免通过反射调用其构造方法破坏单例，可以在构造方法上加以空检查，抛个异常。
【序列化破坏单例】为避免将对象序列化写入磁盘、反序列化读到内存时单例被破坏，可重写readResolve()方法返回实例解决。
【深克隆破坏单例】所以单例类不实现Cloneable接口；要么我们重写clone()方法，在clone方法中返回单例对象即可。
【ThreadLocal】ThreadLocal 不能保证其创建的对象是全局唯一，但是能保证在单个线程中是唯一的，天生的线程安全。
