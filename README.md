# dmsweb-springboot

Tomcat 8.5  config

in eclipse server in context.xml  place following 

    <Resource name="jdbc/H2DB" 
      global="jdbc/H2DB" 
      auth="Container" 
      type="javax.sql.DataSource" 
      driverClassName="org.h2.Driver" 
      url="jdbc:h2:~/test" 
      username="sa" 
      password="sa" 
      
      maxActive="100" 
      maxIdle="20" 
      minIdle="5" 
      maxWait="10000"/>
