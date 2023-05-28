[Download_Old_Builds_6_0 – Oracle VM VirtualBox](https://www.virtualbox.org/wiki/Download_Old_Builds_6_0)

[Install | Vagrant | HashiCorp Developer](https://developer.hashicorp.com/vagrant/downloads?product_intent=vagrant)

[Discover Vagrant Boxes - Vagrant Cloud (vagrantup.com)](https://app.vagrantup.com/boxes/search)

```
vagrant init centos/7
vagrant up
vagrant ssh
```

bcdedit /set hypervisorlaunchtype off

组策略——虚拟化



### git

初始化文件夹
 `git init` 

添加整个文件夹
 `git add .` 

提交commit信息，xxx代表着所要提交的信息
 `git commit -m "init"` 

添加远程仓库链接,yyy为git地址

git remote add origin git@github.com:hummingg/gulimall.git

上传
git pull origin main --allow-unrelated-histories

