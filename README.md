# SOFAArk 工程用例 


```
.
│
├── sample-ark-plugin 
│ 
└── sample-springboot-ark 

```

## sample-ark-plugin
该工程演示如何使用官方提供的 `Maven` 插件 `sofa-ark-plugin-maven-plugin` 来构建一个标准的 `Ark Plugin`，详细可参考 [README](./sample-ark-plugin/README.md)。

## sample-springboot-ark
该工程演示如何使用官方提供的 `Maven` 插件 `sofa-ark-maven-plugin` 将一个普通的 Spring Boot 应用打包成一个 `Ark 包`；需要注意的是，因为该工程依赖另一个用例工程 [`sample-ark-plugin`](./sample-ark-plugin/README.md) 打包出来的 `Ark Plugin`, 由于Ark Plugin必须以jar包的方式导入工程无法使用classPath方式启动，请务必提前安装该 `Ark Plugin` 至本地 maven 仓库；详细请参考 [README](./sample-springboot-ark/README.md)。

IDE 里启动是请带上如下参数：

当你在启动Java应用程序时添加 -Dsofa.ark.embed.enable=true，你实际上是在告诉SOFAArk框架以嵌入模式运行。这意味着你的应用程序将能够利用SOFAArk提供的类隔离、模块加载和卸载等特性，从而更灵活地管理和更新应用程序的组件。
```properties
-Dsofa.ark.embed.enable=true
```

jdk使用21
maven使用3.9

https://www.sofastack.tech/projects/sofa-boot/sofa-ark-spring-boot-demo/