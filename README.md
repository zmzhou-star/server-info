# server-info

#### 介绍
Java获取服务器系统信息
可以实时监控服务器资源使用情况

#maven打包命令
`mvn clean install -X`

#上传到GitHub
`mvn deploy -Dregistry=https://maven.pkg.github.com/zmzhou-star -Dtoken=PAT_TOKEN -X`

#### 软件架构
软件架构说明
依赖：
* https://mvnrepository.com/artifact/com.github.oshi/oshi-core
* https://mvnrepository.com/artifact/com.alibaba/fastjson
* https://mvnrepository.com/artifact/org.apache.commons/commons-lang3

#### 安装教程

1. Add this to pom.xml:

```
<!-- https://mvnrepository.com/artifact/com.github.zmzhou-star/server-info -->
<dependency>
    <groupId>com.github.zmzhou-star</groupId>
    <artifactId>server-info</artifactId>
    <version>[1.0,)</version>
</dependency>
```

2. Run via command line
$ `mvn install`
#### 使用说明

1.  [https://github.com/zmzhou-star/server-info/packages/380676?version=1.0](https://github.com/zmzhou-star/server-info/packages/380676?version=1.0)

```
ServerInfo serverInfo = new ServerInfo();
```

#### 上传本地jar包到maven中央仓库
* Sonatype OSSRH官方介绍地址：[https://central.sonatype.org/pages/ossrh-guide.html](https://central.sonatype.org/pages/ossrh-guide.html)
* 中央组件要求：[https://central.sonatype.org/pages/requirements.html](https://central.sonatype.org/pages/requirements.html)
* Maven部署到OSSRH参考配置文档： [https://central.sonatype.org/pages/apache-maven.html](https://central.sonatype.org/pages/apache-maven.html)

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 码云特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5.  码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
