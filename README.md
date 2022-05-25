## 简介
~~~
* 基于Spring Boot  Spring Cloud & Alibaba,
* 注册中心、配置中心Nacos 2.1.0,
* 认证使用Jwt，Redis,
* 流量控制框架Sentinel,
* 分布式事务Seata,
* 封装了常用的工具类,
* 全局异常处理,
* 多数据源,
* Swagger文档,
* FastDFS,Minio文件上传,
**搭建的一套分布式微服务架构，代码干净整洁，注释清晰，适合新项目开发
~~~
## 目录结构
~~~
ai-cloud-app
├── ai-cloud-gateway    --网关服务 [8088]
├── ai-cloud-auth       --认证服务 [8800]
├── ai-cloud-api        --内网接口
│       └── ai-cloud-api-auth        --授权对内接口
│       └── ai-cloud-api-file        --文件对内接口
├── ai-cloud-framework  --核心模块
│       └── ai-cloud-common          --通用模块
│       └── ai-cloud-datasource      --多数据源
│       └── ai-cloud-security        --安全模块
│       └── ai-cloud-swagger         --接口模块
├── ai-cloud-modules    --业务模块
│       └── ai-cloud-file            --文件服务 [8801]
│       └── ai-cloud-pay             --支付服务 [8803]
│       └── ai-cloud-user            --用户服务 [8802]
├──ai-cloud-web         --前端模块
│       └── ai-cloud-h5              --h5
│       └── ai-cloud-wx              --微信小程序
├──pom.xml              --公共依赖
~~~
## 架构图
## 内置功能
## 在线体验
## 演示图

<table>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/pi1r07pytiqgjvycqfby.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/ivs81fr4lo04yctn599u.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/q4020mr731qmtrrd75mp.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/2en1wlvixibttrqr6gja.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/xq3kf4ngk5b44gubfjqi.png"/></td>
    </tr>
</table>

## 微服务交流群
QQ群： ![加入QQ群](https://img.shields.io/badge/679033812-blue.svg)
