1. springboot3以上maven使用,因为mybatis-plus-boot-starter中的mybatis-spring是2.12版本太低需要换成3.0.3

```xml
<dependency>
   <groupId>com.baomidou</groupId>
   <artifactId>mybatis-plus-spring-boot3-starter</artifactId>
   <version>最新版本</version>
</dependency>
```
2. 注解
    1. @TableId中的雪花算法
    2. @TableLogic逻辑删除
    3. @Version 乐观锁实现
3. Wrapper下的支持Lambda的通过 方法引用获取字段名  
   LambdaQueryWrapper中SFunction参数获取字段名必须用方法引用,lambda和匿名内部类不行
4. 代码生成器直接用模版,mybatisX插件实用性
5. 文档中没有讲的   
   数据权限插件,  
   数据变动记录插件,  
   多数据源插件,  
   自动填充,  
   使用p6spy执行sql分析打印.

