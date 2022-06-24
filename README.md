<p align="center">

[//]: # (	<img alt="logo" src="https://cdn.ayuanlmo.cn/lmo_loso_r.png">)
</p>
<p align="center">

[//]: # (	Hi, there👋)
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;color:#409fee;">ai-cloud</h1>
<p align="center">
    <img src="https://img.shields.io/badge/SpringBoot-2.6.8 -blue.svg" alt="SpringBoot">
    <img src="https://img.shields.io/badge/SpringCloud-2021.0.1 -blue.svg" alt="SpringCloud">
    <img src="https://img.shields.io/badge/Alibaba-2021.0.1.0 -blue.svg" alt="Alibaba">
    <img src="https://img.shields.io/badge/Nacos-2.1.0 -blue.svg" alt="Nacos">
    <img src="https://img.shields.io/badge/Sentinel-1.8.4 -blue.svg" alt="Sentinel">
    <img src="https://img.shields.io/badge/Seata-1.5.1 -blue.svg" alt="Seata">
    <img src="https://img.shields.io/badge/ELK-8.2.0 -blue.svg" alt="ELK">
    <img src="https://img.shields.io/badge/FastJson-2.0.4 -blue.svg" alt="FastJson">
    <img src="https://img.shields.io/badge/MybatisPlus-3.5.1 -blue.svg" alt="Mybatis-Plus">
    <img src="https://img.shields.io/badge/Swagger-3.0.0 -blue.svg" alt="Swagger">
</p>

## 简介

~~~
* 基于SpringBoot SpringCloud & Alibaba
* 注册中心,配置中心Nacos,统一认证授权使用Security,Jwt,Redis
* 流量控制框架Sentinel,分布式事务Seata,日志管理Elasticsearch,Kibana,Logstash
* 封装了常用的工具类,全局异常处理,多数据源,Swagger2文档,FastDFS,Minio文件上传
* 搭建的一套分布式微服务架构,代码干净整洁,注释清晰,适合新项目开发
* 后续会持续封装,用户账户服务,支付服务,短信服务,邮箱服务,oos对象存储,等等,以及产品原型,ui原型,前端代码更新
~~~

## 目录结构

~~~
ai-cloud-app
├── ai-cloud-gateway    --网关服务 [8088]
├── ai-cloud-auth       --认证服务 [8800]
├── ai-cloud-api        --内网接口
│       └── ai-cloud-auth-api        --授权对内接口
│       └── ai-cloud-elk-api         --日志对内接口
│       └── ai-cloud-file-api        --文件对内接口
├── ai-cloud-elk        --elk日志管理模块
│       └── ai-cloud-elasticsearch   --存储日志数据[8004]
│       └── ai-cloud-kibana          --收集日志   [8005]
│       └── ai-cloud-logstash        --显示日志数据[8006]
├── ai-cloud-framework  --核心模块
│       └── ai-cloud-common          --通用模块
│       └── ai-cloud-datasource      --多数据源
│       └── ai-cloud-log             --日志记录
│       └── ai-cloud-security        --安全模块
│       └── ai-cloud-swagger         --接口模块
├── ai-cloud-modules    --业务模块
│       └── ai-cloud-file            --文件服务 [8801]
│       └── ai-cloud-pay             --支付服务 [8803]
│       └── ai-cloud-user            --用户服务 [8802]
├──ai-cloud-web         --前端模块
│       └── ai-cloud-h5              --h5[]
│       └── ai-cloud-wx              --微信小程序[]
├──pom.xml              --公共依赖
~~~

## 架构图

<img src=""/>

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
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/1ggte01jst4vww0aucu1.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/28i1j6awgo6gznqnryih.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/0477g98abeybyjr5hwes.png"/></td>
    </tr>
    <tr>
        <td><img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/g58ymqtwylsvurvhuhyc.png"/></td>
    </tr>
</table>

## sql表结构

<img src="https://lawcontract.oss-cn-beijing.aliyuncs.com/3d6qj57lwc1zwdn6rlzt.png"/>

## 接口文档地址

http://127.0.0.1:8088/swagger-ui/index.html

## 微服务交流群

QQ群: [![加入QQ群](https://img.shields.io/badge/679033812-blue.svg)](https://jq.qq.com/?_wv=1027&k=eW62TFzU) 点击按钮入群。

