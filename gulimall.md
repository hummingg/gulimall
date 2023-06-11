### vm

[Download_Old_Builds_6_0 – Oracle VM VirtualBox](https://www.virtualbox.org/wiki/Download_Old_Builds_6_0)

[Install | Vagrant | HashiCorp Developer](https://developer.hashicorp.com/vagrant/downloads?product_intent=vagrant)

[Discover Vagrant Boxes - Vagrant Cloud (vagrantup.com)](https://app.vagrantup.com/boxes/search)

```
vagrant init centos/7
vagrant up
vagrant ssh
vagrant reload
```

bcdedit /set hypervisorlaunchtype off

组策略——虚拟化



[解决Vagrant 使用中发生的 vagrant@127.0.0.1: Permission denied (publickey,gssapi-keyex,gssapi-with-mic). 错误 | 码农家园 (codenong.com)](https://www.codenong.com/cs106366521/)

[(4条消息) vagrant up报错：io.rb:32:in `encode‘: “\xAA\xE5“ from GBK to UTF-8 (Encoding::UndefinedConversionError)_"\\xab\\xe9\" from gbk to utf-8 (encoding::undefin_STUPID MAN的博客-CSDN博客](https://blog.csdn.net/qq_42261895/article/details/121687073)



Vagrantfile

config.vm.network "private_network", ip: "192.168.56.10"

ping 192.168.56.10

ping 222.201.191.136



### git

> 初始化仓库

初始化文件夹
 `git init` 

添加整个文件夹
 `git add .` 

提交commit信息，xxx代表着所要提交的信息
 `git commit -m "init"` 

添加远程仓库链接

git remote add origin git@github.com:hummingg/gulimall.git

上传
git pull origin main --allow-unrelated-histories



> stash before pull

git stash

git pull

git stash pop



> 放弃本地文件修改（未add）

- 放弃单个文件的修改

```undefined
git checkout -- filename
```

- 放弃所有文件修改

```undefined
git checkout .
```



### docker

[Install Docker Engine on CentOS | Docker Documentation](https://docs.docker.com/engine/install/centos/)

[容器镜像服务 (aliyun.com)](https://cr.console.aliyun.com/cn-hangzhou/instances/mirrors)

```shell
sudo mkdir -p /etc/docker
sudo tee /etc/docker/daemon.json <<-'EOF'
{
  "registry-mirrors": ["https://yfb2sf2j.mirror.aliyuncs.com"]
}
EOF
sudo systemctl daemon-reload
sudo systemctl restart docker
```



### mysql

```
sudo docker pull mysql:5.7
sudo docker run -p 3306:3306 --name mysql \
-v /mydata/mysql/log:/var/log/mysql \
-v /mydata/mysql/data:/var/lib/mysql \
-v /mydata/mysql/conf:/etc/mysql \
-e MYSQL_ROOT_PASSWORD=root \
-d mysql:5.7

sudo docker exec -it mysql /bin/bash
sudo docker restart mysql
sudo docker update mysql --restart=always
```

```
# /mydata/mysql/conf/my.cnf
[client]
default-character-set=utf8

[mysql]
default-character-set=utf8

[mysqld]
init_connect='SET collation_connection = utf8_unicode_ci'
init_connect='SET NAMES utf8'
character-set-server=utf8
collation-server=utf8_unicode_ci
skip-character-set-client-handshake
skip-name-resolve
```

### redis

```
sudo docker pull redis

sudo mkdir -p /mydata/redis/conf
sudo touch /mydata/redis/conf/redis.conf

sudo docker run -p 6379:6379 --name redis \
-v /mydata/redis/data:/data \
-v /mydata/redis/conf/redis.conf:/etc/redis/redis.conf \
-d redis redis-server /etc/redis/redis.conf \
--requirepass "mypassword"

sudo docker exec -it redis redis-cli
sudo docker update redis --restart=always
```

```
# redis.conf
appendonly yes
```

[Releases · RedisInsight/RedisDesktopManager (github.com)](https://github.com/RedisInsight/RedisDesktopManager/releases)

[RedisInsight - Microsoft Store 应用程序](https://apps.microsoft.com/store/detail/redisinsight/XP8K1GHCB0F1R2)

[太厉害了！目前 Redis 可视化工具最全的横向评测 - 知乎 (zhihu.com)](https://zhuanlan.zhihu.com/p/210483494)



### maven

```
# maven/conf/settings.xml
<mirror>
    <id>nexus-aliyun</id>
    <mirrorOf>central</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>
```



```
<profile>
	<id>jdk-1.8</id>
	<activation>
		<activeByDefault>true</activeByDefault>
		<jdk>1.8</jdk>
	</activation>
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target><maven.compiler.compilerVersion>1.8</maven.compiler.compilerVersion>
	</properties>
</profile>
```



### nodejs

[Index of /dist/v10.16.3/ (nodejs.org)](https://nodejs.org/dist/v10.16.3/)

```
npm config set registry http://registry.npm.taobao.org/

npm install
npm run dev

# something maybe wrong
npm install --global --production windows-build-tools
npm config set msvs_version 2017
```



### 快速开发

[人人开源 (gitee.com)](https://gitee.com/renrenio/)

开源项目：renren-fast、 renren-fast-vue、renren-generator

#### TODO

- 有些库的表前缀不一致，后期可能有问题。
- 

#### admin: 后台管理系统

数据库：gulimall_admin

前端：6001，后端：6002.

6000被Chrome列为不安全端口，无法调用，ERR_UNSAFE_PORT。



#### gulimall-common

Maven Module。

以下几个微服务的共同依赖，代码来自renren-fast.common。

pom含数据库依赖，所以微服务无需再次依赖数据库。



#### gulimall-coupon

优惠**s**ale

http://localhost:8080/coupon/coupon/list

sms, 7000



#### gulimall-member

user = member

http://localhost:8080/member/member/list

ums, 8000



#### gulimall-order

http://localhost:8080/order/order/list

oms, 9000



#### gulimall-product

http://localhost:8080/product/brand/list

pms, 10000

yundetectservice.exe占用端口号10000

netstat -ano|findstr 10000

tasklist|findstr  进程号

taskkill /f /t /im yundetectservice.exe

http://localhost:10000/product/brand/list



#### gulimall-ware

http://localhost:8080/ware/wareinfo/list

wms, 11000

longblob 对应 byte[]类型？




### windows dos type 中文乱码
https://www.cnblogs.com/lexus/archive/2012/03/15/2398652.html

通过 chcp命令改变代码页，UTF-8的代码页为65001 

```chcp 65001```



### openfeign spring-cloud-alibaba

https://spring.io/projects/spring-cloud-alibaba#overview

https://github.com/alibaba/spring-cloud-alibaba

gulimall-common

```
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>2.1.0.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

```
 <dependency>
     <groupId>com.alibaba.cloud</groupId>
     <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
 </dependency>
```

实现功能：gulimall-member 远程调用 gulimall-coupon 获取会员的优惠券列表

gulimall-coupon

```
@EnableDiscoveryClient

spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
  application:
    name: gulimall-coupon
```

http://127.0.0.1:8848/nacos/

[No Feign Client for loadBalancing defined. Did you forget to include spring-cloud-starter-loadbalanc_一碗谦谦粉的博客-CSDN博客](https://blog.csdn.net/weixin_45764765/article/details/128825554)

[feign 【已解决】报错 org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient.choose_HotRabbit.的博客-CSDN博客](https://blog.csdn.net/qq_52476654/article/details/125692501)

[添加openfeign出现Error creating bean with name_梁山教父的博客-CSDN博客](https://blog.csdn.net/weixin_55127182/article/details/127261363)

http://localhost:7000/coupon/coupon/member/list

http://localhost:8000/member/member/coupons



### nacos config

bootstrap.properties 未生效，可能是springboot版本问题（2.7），调整为课程版本。

[程序包org.junit.jupiter.api不存在_慕白Lee的博客-CSDN博客](https://blog.csdn.net/libusi001/article/details/107718432)

