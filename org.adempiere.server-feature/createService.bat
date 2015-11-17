; https://commons.apache.org/proper/commons-daemon/procrun.html
;
http://www.eclipse.org/jetty/documentation/current/startup-windows-service.html
; http://dentrassi.de/2014/02/28/eclipse-equinox-as-a-windows-service/

set PR_INSTALL=C:\jenkins\idempiere-server\prunsrv.exe
set SERVICE_NAME=idempiere-hsv
set DISPLAY_NAME=%SERVICE_NAME%
set PR_STARTUP=auto

set PR_START_MODE=java
set PR_STOPMODE=java
set PR_JAVA_HOME=C:\Program Files\Java\jdk1.8.0_31
set PR_JVM=%PR_JAVA_HOME%\jre\bin\server\jvm.dll

SET
PR_CLASSPATH=C:\jenkins\idempiere-server\plugins\org.adempiere.server.*.jar
set PR_JVMMS=128
set PR_JVMMX=512
set PR_JVMSS=4000
set PR_JVMOPTIONS=-Dosgi.console=localhost:12612
-Djetty.home=C:\jenkins\idempiere-server\jettyhome
-Djetty.etc.config.urls=etc/jetty.xml,etc/jetty-selector.xml,etc/jetty-ssl.xml,etc/jetty-https.xml,etc/jetty-deployer.xml
-XX:MaxPermSize=192m -Dmail.mime.encodefilename=true
-Dmail.mime.decodefilename=true -Dmail.mime.encodeparameters=true
-Dmail.mime.decodeparameters=true

set START_CLASS=org.adempiere.server.EclipseDaemon
set START_METHOD=start
set STOP_CLASS=org.adempiere.server.EclipseDaemon
set STOP_METHOD=stop

set PR_LOGPREFIX=%SERVICE_NAME%
set PR_LOGPATH=C:\jenkins\idempiere-server\logs
set PR_STDOUTPUT=auto
set PR_STDERROR=auto
set PR_LOGLEVEL=Debug

SET START_PARAMETERS=-application org.adempiere.server.application

%PR_INSTALL% //DS/%SERVICE_NAME% ^

%PR_INSTALL% //IS/%SERVICE_NAME% ^
  --Install="%PR_INSTALL%" ^
  --DisplayName="%DISPLAY_NAME%" ^
  --Startup="%PR_STARTUP%" ^
  --StartMode=%PR_START_MODE% ^
  --StopMode=%PR_STOP_MODE% ^
  --Classpath="%JAVA_CLASSPATH%" ^
  --JavaHome="%JAVA_HOME%" ^
  --StartClass=%START_CLASS% ^
  --StartMethod=%START_METHOD% ^
  --StopClass %STOP_CLASS% ^
  --StopMethod %STOP_METHOD% ^
  ++StartParams=START_PARAMETERS ^
  --LogPath="%PR_LOGPATH%" ^
  --LogPrefix="%PR_LOGPREFIX%" ^
  --LogLevel="%PR_LOGLEVEL%" ^
  --StdOutput="%PR_STDOUTPUT%" ^
  --StdError="%PR_STDERROR%"