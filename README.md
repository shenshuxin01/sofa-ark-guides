# SOFAArk 工程用例 


```
.
│
├── mina-v1-demo(业务环境1)
│ 
└── mina-v2-demo(业务环境2)
│ 
└── start-demo(基础环境)

```

## 快速开始
执行`mvn clean package`生成jar

## start-demo
启动项目先启动这个start-demo，会看到启动日志
```shell
16:16:37.093 [SOFA-ARK-telnet-server-worker-0-T1] INFO io.netty.handler.logging.LoggingHandler -- [id: 0x6f1ce4f0] BIND: 0.0.0.0/0.0.0.0:1234
Ark container started in 956 ms.
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.0)
````
监听1234端口

## mina-v1-demo
这个是业务环境1，引用了mina1版本的依赖包，包含类`org.apache.mina.common.IoFilter` 注意这个类是1版本的jar包才有的，
找到对应的jar包[mina-v1-demo-1.0-SNAPSHOT-ark-biz.jar](mina-v1-demo/target/mina-v1-demo-1.0-SNAPSHOT-ark-biz.jar)
打开telnet 连接1234端口，执行`biz -i file:///D:\sofa-ark-fork\mina-v1-demo\target\mina-v1-demo-1.0-SNAPSHOT-ark-biz.jar`
看控制台会输出

## mina-v2-demo
这个是业务环境2，引用了mina2版本的依赖包，包含类`org.apache.mina.core.filterchain.IoFilter` 注意这个类是2版本的jar包才有的，
找到对应的jar包[mina-v2-demo-1.0-SNAPSHOT-ark-biz.jar](mina-v2-demo/target/mina-v2-demo-1.0-SNAPSHOT-ark-biz.jar)
打开telnet 连接1234端口，执行`biz -i file:///D:\sofa-ark-fork\mina-v2-demo\target\mina-v2-demo-1.0-SNAPSHOT-ark-biz.jar`
看控制台会输出

这样就会同时运行2个版本的jar包了，但是这个对版本依赖有要求，使用jdk8和springboot2.6.6版本的是官网的示例，我自己使用的是
jdk使用21
maven使用3.9
Spring Boot v3.3.0

## 官网地址
[https://www.sofastack.tech/projects/sofa-boot/sofa-ark-spring-boot-demo/](https://www.sofastack.tech/projects/sofa-boot/sofa-ark-spring-boot-demo/)

## 备注
这种方式比较于其他框架来说，是比较轻量的，但是改了项目结构，还有未知bug。不是很推荐。还是建议手动处理一下冲突的jar包，升级jar包版本，或者使用其他方式。
