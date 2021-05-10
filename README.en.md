# server-info

#### Description
Java获取服务器系统信息

#### Software Architecture
Software architecture description

#上传到GitHub
`mvn deploy -Dregistry=https://maven.pkg.github.com/zmzhou-star -Dtoken=PAT_TOKEN -X`

软件架构说明
依赖：
* https://mvnrepository.com/artifact/com.github.oshi/oshi-core
* https://mvnrepository.com/artifact/com.alibaba/fastjson
* https://mvnrepository.com/artifact/org.apache.commons/commons-lang3

#### Installation

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

#### Instructions

1.  [https://github.com/zmzhou-star/server-info/packages/380676?version=1.0](https://github.com/zmzhou-star/server-info/packages/380676?version=1.0)

```
ServerInfo serverInfo = new ServerInfo();
```

#### Upload local jar package to maven central warehouse
* Sonatype OSSRH Official introduction address：[https://central.sonatype.org/pages/ossrh-guide.html](https://central.sonatype.org/pages/ossrh-guide.html)
* Central component requirements：[https://central.sonatype.org/pages/requirements.html](https://central.sonatype.org/pages/requirements.html)
* Maven deployment to OSSRH reference configuration document： [https://central.sonatype.org/pages/apache-maven.html](https://central.sonatype.org/pages/apache-maven.html)

#### Contribution

1.  Fork the repository
2.  Create Feat_xxx branch
3.  Commit your code
4.  Create Pull Request


#### Gitee Feature

1.  You can use Readme\_XXX.md to support different languages, such as Readme\_en.md, Readme\_zh.md
2.  Gitee blog [blog.gitee.com](https://blog.gitee.com)
3.  Explore open source project [https://gitee.com/explore](https://gitee.com/explore)
4.  The most valuable open source project [GVP](https://gitee.com/gvp)
5.  The manual of Gitee [https://gitee.com/help](https://gitee.com/help)
6.  The most popular members  [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
