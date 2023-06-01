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



admin: 后台管理系统



generator:

#### TODO

- 有些库的表前缀不一致，后期可能有问题。
- 

> oms: order

http://localhost:8080/order/order/list

>  pms: product

http://localhost:8080/product/brand/list

> sms: coupon, 优惠sale

http://localhost:8080/coupon/coupon/list



> ums: user = member

http://localhost:8080/member/member/list

> wms: ware



