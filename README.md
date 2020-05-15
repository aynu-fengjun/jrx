#集合的体系：
集合分为单列集合和多列集合，只能存储引用数据类型数据，当存储基本数据类型时会自动装箱
##单列集合介绍：
* Collection是单列集合的根接口该接口继承Iterable接口，因此单列集合可迭代遍历；
* List、Set、Queue是Collection接口的子接口；
###List集合介绍
* list集合元素有序、可重复；
* 该接口下有两个常用的实现类ArrayList和LinkedList，这两个实现类都是继承自AbstractList抽象类，且都是线程不安全集合；
    * ArrayList底层基于数组实现，有下标查询较快，由于执行增删改需要复制原有的数据到新数组中因此不适用于CUD操作，当集合多数用于查询时可创建ArrayList实例；
    * LinkedList底层基于链表实现，由于双向链表的数据结构可记录上一个元素和下一个元素的地址因此增删改较快；
###Set集合介绍
* Set集合无序、不可重复；
* 该接口下有HashSet和TreeSet两个常用实现类，继承自AbstractSet抽象类；
    * HashSet根据hashCode值和equals方法来存储元素，向集合中存储元素时，先调用该元素的hashCode方法计算hashCode值判断存储位置，值不同，直接存储元素，相同调用equals方法判断该位置是否有该元素存在，返回false存储元素，返回true舍弃该元素；
        * LinkedHashSet是HashSet的子类，但使用链表保证了元素存入顺序和取出顺序相同；
    * TreeSet实现了Sorted接口底层类似二叉树，往Set集合存储元素时会将元素转换为Comparable类型，往集合里存储元素时会调用compareTo方法进行比较，根据方法的返回结果进行存储（也可以自定义比较器进行存储）；
    
###Queue集合介绍
* Queue集合基于队列数据结构实现；
* Queue还有一个Deque接口，代表一个双端队列，可以同时两头添加删除元素，因此既可以当成队列使用，又可以当成栈使用。实现类为ArrayDeque和LinkedList；
ArrayDeque是双端队列，所以对First，Last元素都有add get peek pool remove方法。
    * PriorityQueue继承了AbstractQueue抽象类实现了Queue接口，该实现类保存元素的顺序并不是按加入顺序，而是按元素的大小，PriorityQueue不允许存储nul值；
    * LinkedList实现类实现了Queue接口，代表一个双向队列，可以使用该类创建实例对象；
* 方法详解：
    * add()将指定元素加入队列尾部；
    * offer()加入尾部，但当容量有限队列时，方法比add好
    * peek() 获取头部元素不删除
    * element() 获取头部元素不删除
    * pool() 获取头部元素并删除
    * remove() 获取头部元素并删除
    ```java
        public class Test {
            public static void main(String[] args) {
                PriorityQueue<Character> queue1 = new PriorityQueue<>();
                queue1.offer('k');
                queue1.offer('f');
                queue1.offer('d');
                //打印结果为[d, k, f]
                System.out.println(queue1);
                //打印结果为d 获取头部元素不删除
                System.out.println(queue1.peek());
                //打印结果为d，获取头部元素删除
                System.out.println(queue1.poll());
                //打印结果为f
                System.out.println(queue1.peek());
        
                PriorityQueue<Object> queue2 = new PriorityQueue<>();
               /* //获取空列表不删除数据   出现NoSuchElementException运行时异常
                Object element = queue2.element();
                System.out.println(element);*/
                //不会出现异常打印出null值
                Object peek = queue2.peek();
                System.out.println(peek);
            }
        }
    ```
##多列集合介绍
* Map是多列集合的根接口，该接口下的实现类存储的数据都是以键值对的形式进行存储，存储的数据当键相同时原来的值会被覆盖掉；
* Map接口下有两个常用的实现类HashMap和TreeMap;都是继承了AbstractMap抽象类；
    * HashMap存储数据和HashSet相同，都是基于hashCode值和equals方法进行判断；
    * TreeMap原理同TreeSet;
    
#异常介绍
* Throwable是异常的顶级父接口，Error和Exception是子接口，Error错误一般是由jvm从底层抛出的问题，Exception异常一般是由于代码错误引起
* Exception异常分为受查异常（会导致编译失败）和非受查异常

#Maven介绍
##Maven的生命周期：
* mvn clean:清理编译的项目
* mvn compile:编译项目
* mvn test:运行测试类
* mvn package:将项目打包
* mvn install：安装项目到本地仓库
* mvn deploy:将项目部署到远程仓库
