# SpringBoot中使用通用Mapper

## 通用Mapper
### 一、代码改造

1. 引入依赖
在build.gradle中，添加依赖：
```
    compile group: 'tk.mybatis', name: 'mapper', version: '4.0.1'
```

2. 调整MapperScan注解

MyBatis默认使用的MapperScan：
```
@MapperScan("com.msyy.weixin.mp.mpapi.mapper")
```

使用通用Mapper后，需调整为：
```
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.msyy.weixin.mp.mpapi.mapper")
```

### 二、使用通用Mapper

在Mapper接口继承通用Mapper并指定泛型，如下：
```
public interface UserMapper extends Mapper<User> {
}
```

## 通用Service
### 一、代码改造

1. 加入BaseService类

在项目中加入如下两个class

- BaseService 
- BaseServiceImpl 

代码参见"com.example.springboot.mybatis.commonmapper.service.util"

### 二、使用通用Service

1. 业务Service、ServiceImpl继承BaseService、BaseServiceImpl，之后可直接调用父类方法完成CRUD操作；

可参见CompanyService、CompanyServiceImpl

2. 


## 测试

- http://127.0.0.1:8080/company
- http://127.0.0.1:8080/employer/Cindy
