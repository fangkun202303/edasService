EDAS+Springcloud���demo���ֵ����⼰����취:
        /**
         *  ��ʱ���õ�ʱ����feigin�ķ�ʽ���ֲ����ı�������
         *
         *  1. ǰ�˷������ʱ����Ҫ���������б���EncodeUriConpoment��������һ��
         *  2. feigin�ͻ����ڽ��յ������ǻ���Ҫ����������URLDecoder.decode(str, "UTF-8")����,Ҫ��Ȼfeigin�ᱨ��
         *          ����:Invalid character found in the request target. The valid characters are defined in RFC 3986
         *              ����ķ���ԭ������Tomcat��������,�������н���취;�������ǵڶ��ְ취;�����ְ취��������tomcat��û����
         *          ˼��: ֮ǰ�Spring cloud�ֲ�ʽ��ʱ���õ�Feiginʱû�д�����,�������ð�������Щ��,
         *              ���EDAS��Feigin���ð�:
         *                          <!-- EDAS�ķ����� -->
         *                          <dependency>
         *                              <groupId>org.springframework.cloud</groupId>
         *                              <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
         *                              <version>0.9.0.RELEASE</version>
         *                          </dependency>
         *
         *                          <!-- ������ü��� -->
         *                          <dependency>
         *                              <groupId>org.springframework.cloud</groupId>
         *                              <artifactId>spring-cloud-starter-openfeign</artifactId>
         *                          </dependency>
         *               ʹ��Spring cloud ��euaka�������� �ṩ����:
         *                       <dependency>
         *                          <groupId>org.springframework.cloud</groupId>
         *                          <artifactId>spring-cloud-starter-feign</artifactId>
         *                          <version>1.4.6.RELEASE</version>
         *                        </dependency>
         **/