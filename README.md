<p align="center">
	<a href="https://whaleal.com/"><img src="https://docs.whaleal.com/images/logo1.png" width="45%"></a>
</p>
<p align="center">
	<a href="https://whaleal.com/"><img src="https://docs.whaleal.com/images/logo1.png" width="45%"></a>
</p>
<p align="center">
	<strong>🍬A set of tools that keep Java sweet.</strong>
</p>
<p align="center">
	👉 <a href="https://whaleal.com">https://whaleal.com/</a> 👈
</p>

<p align="center">
	<a target="_blank" href="https://search.maven.org/artifact/com.whaleal/event">
		<img src="https://img.shields.io/maven-central/v/com.whaleal/event.svg?label=Maven%20Central" />
	</a>
	<a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/JDK-8+-green.svg" />
	</a>
	<a target="_blank" href='https://github.com/whaleal/event'>
		<img src="https://img.shields.io/github/stars/whaleal/evnet.svg?style=social" alt="github star"/>
	</a>
</p>



-------------------------------------------------------------------------------

[**🌎English Documentation**](README-EN.md)

-------------------------------------------------------------------------------

## 📚简介
这是一个 Java 基础类库，用于促进事件驱动编程。

该框架的目的是提供一种简单的方法来生成和处理事件。

鼓励仅使用事件作为应用程序进程和第三方系统之间的通信方式。

这些，通过它们的格式，可以被记录、采取行动、分析、分发等等。

事件应该用于从应用程序的重要部分实时传输信息。

然后，任何相关方都可以注册一个或多个通用或专用侦听器以进一步处理这些事件。

### 🍺event如何改变我们的coding方式

event的目标是使用一个工具方法代替一段复杂代码，从而最大限度的避免“复制粘贴”代码的问题，彻底改变我们写代码的方式。

以一个通用的数据传输为例

- 👴【以前】打开搜索引擎 -> 搜“event 传输设计” -> 打开某篇博客-> 复制粘贴 -> 改改好用
- 👦【现在】引入event  -> EventBuilder.withBody(body,header);

event的存在就是为了减少代码搜索成本，避免网络上参差不齐的代码出现导致的bug,同时避免重复造轮子，。

-------------------------------------------------------------------------------


## 📝文档 


-------------------------------------------------------------------------------

## 📦背景介绍
* 我们生活在大数据时代，当我们想要收集有关所有事物的事件时，以更好地了解某些方面
系统，甚至系统本身的运行方式：

* 技术驱动的东西（监控、性能分析、调试等）
*业务驱动的东西（分析）

* 事件是结构化的、可操作的、可存储的、可分发的，通常比日志更*

* 如果您花一些时间在应用程序的相关点捕获信息，请确保您以最通用和最有用的方式进行操作

* 您可以比其他方式更轻松地从事件生成日志

* 使用事件驱动方法时，系统变得更加解耦

* 在不改变现有代码的情况下提供更多的灵活性和控制（只需在您的事件上添加更多侦听器，或调整配置文件）

* 为扩展做好准备（事件驱动的架构更容易扩展）

* 在许多情况下，它使测试变得更加容易 - 确保在正确的位置触发正确的事件，然后只需侦听预期的事件，然后如果您愿意，只需触发 TEST:PASSED 事件 :)

* 回顾一下：随着活动的到位，您可以：
    *  test
	*  log
	*  extend
	*  distribute
	*  scale
	*  control
	*  analyze
	*  be happier

* 它更优雅

### 🍊Maven
在项目的pom.xml的dependencies中加入以下内容:

```xml
<dependency>
    <groupId>com.whaleal</groupId>
    <artifactId>event</artifactId>
    <version>0.1.0</version>
</dependency>
```

### 🍐Gradle
```
implementation 'com.whaleal:event:0.1.0'
```

### 📥下载jar

点击以下链接，下载`event-X.X.X.jar`即可：

- [Maven中央库](https://repo1.maven.org/maven2/com/whaleal/event/)

> 🔔️注意
> event 1.x支持JDK8+，对Android平台没有测试，不能保证所有工具类或工具方法可用。
> 所有版本编译起始均为JDK8+

### 🚽编译安装

访问event的github主页：[https://github.com/whaleal/event](https://github.com/whaleal/event) 下载整个项目源码（v1-main或v1-dev分支都可）然后进入event项目目录执行：

进行基础的编译安装就可以了

然后就可以使用Maven引入了。

-------------------------------------------------------------------------------

## 🏗️添砖加瓦

### 🎋分支说明

event的源码分为两个分支，功能如下：

| 分支       | 作用                                                          |
|-----------|---------------------------------------------------------------|
| main  | 主分支，release版本使用的分支，与中央库提交的jar一致，不接收任何pr或修改 |
| v1-main | 大版本主分支，不同大版本具有不同vxx-main, 用于合并v1-dev,观察特性,不接收任何pr或修改 |
| v1-dev    | 开发分支，默认为下个版本的SNAPSHOT版本，接受修改或pr                 |

### 🐞提供bug反馈或建议

提交问题反馈请说明正在使用的JDK版本呢、event版本和相关依赖库版本。

- [github issue](https://github.com/whaleal/event/issues)


### 🧬贡献代码的步骤
1.在github issues 上找到需要修复的问题，或提出要贡献的特性内容  
2. 在github或者Github上fork项目到自己的repo  
3. 把fork过去的项目也就是你的项目clone到你的本地  
4. 修改代码（记得一定要修改v1-dev分支）并进行相关测试  
5. commit后push到自己的库（v1-dev分支）  
6. 登录github或Github在你首页可以看到一个 pull request 按钮，点击它，选择自己的dev 分支及本项目的dev 分支，填写一些说明信息，然后提交即可。  
7. 等待维护者合并  

### 📐PR遵照的原则

event欢迎任何人为event添砖加瓦，贡献代码，不过维护者是一个强迫症患者，为了照顾病人，需要提交的pr（pull request）符合一些规范，规范如下：

1. 注释完备，尤其每个新增的方法应按照Java文档规范标明方法说明、参数说明、返回值说明等信息，必要时请添加单元测试，如果愿意，也可以加上你的大名。
2. event的缩进按照IDEA,IDEA真香，默认（tab）缩进，所以请遵守（不要和我争执空格与tab的问题，这是一个病人的习惯）。
3. 新加的方法不要使用第三方库的方法，event遵循无依赖原则（除非在extra模块中加方法工具）。
4. 请pull request到`v1-dev`分支，event在1.x版本后使用了新的分支：`v1-main`是大版本主分支，表示已经发布中央库的版本，这个分支不允许pr，也不允许修改。
5. mian  分支 主要用于 release  相关版本等 

-------------------------------------------------------------------------------


## ⭐欢迎关注

如果你觉得本项目还不错，欢迎持续关注，在此表示感谢^_^。


## 其他相关项目  
[Project](https://docs.whaleal.com/project)  




![whaleal](https://github.com/whaleal/whaleal.github.io/blob/main/images/logo1.png)
