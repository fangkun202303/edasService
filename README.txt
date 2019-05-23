EDAS+Springcloud搭建的demo出现的问题及解决办法:
        /**
         *  此时调用的时候发现feigin的方式出现参数的编码问题
         *
         *  1. 前端发请求的时候需要将参数进行编码EncodeUriConpoment方法处理一下
         *  2. feigin客户端在接收到参数是还需要将参数进行URLDecoder.decode(str, "UTF-8")操作,要不然feigin会报错
         *          错误:Invalid character found in the request target. The valid characters are defined in RFC 3986
         *              错误的发生原因是在Tomcat配置问题,网上搜有解决办法;代码中是第二种办法;第三种办法是用外置tomcat就没事了
         *          思考: 之前搭建Spring cloud分布式的时候用到Feigin时没有此问题,但是引得包不是这些包,
         *              结合EDAS与Feigin引得包:
         *                          <!-- EDAS的服务发现 -->
         *                          <dependency>
         *                              <groupId>org.springframework.cloud</groupId>
         *                              <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
         *                              <version>0.9.0.RELEASE</version>
         *                          </dependency>
         *
         *                          <!-- 服务调用技术 -->
         *                          <dependency>
         *                              <groupId>org.springframework.cloud</groupId>
         *                              <artifactId>spring-cloud-starter-openfeign</artifactId>
         *                          </dependency>
         *               使用Spring cloud 是euaka做服务发现 提供的是:
         *                       <dependency>
         *                          <groupId>org.springframework.cloud</groupId>
         *                          <artifactId>spring-cloud-starter-feign</artifactId>
         *                          <version>1.4.6.RELEASE</version>
         *                        </dependency>
         **/