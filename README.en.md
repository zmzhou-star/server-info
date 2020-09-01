# server-info

#### Description
Java获取服务器系统信息

#### Software Architecture
Software architecture description

#上传到GitHub
<code>
mvn deploy -Dregistry=https://maven.pkg.github.com/zmzhou-star -Dtoken=PAT_TOKEN -X
</code>

软件架构说明
依赖：
https://mvnrepository.com/artifact/com.github.oshi/oshi-core
https://mvnrepository.com/artifact/com.alibaba/fastjson
https://mvnrepository.com/artifact/org.apache.commons/commons-lang3

#### Installation

1. Add this to pom.xml:
<code>
    <dependency>
      <groupId>com.github.zmzhou</groupId>
      <artifactId>server-info</artifactId>
      <version>1.0</version>
    </dependency>
</code>
2. Run via command line
$ <code>mvn install</code>

#### Instructions

1.  https://github.com/zmzhou-star/server-info/packages/380676?version=1.0

<code>
ServerInfo serverInfo = new ServerInfo();
</code>

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
