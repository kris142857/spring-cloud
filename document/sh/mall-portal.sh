#!/usr/bin/env bash
app_name='mall-portal'
group_name='mall'
app_version='1.0-SNAPSHOT'

docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi `docker images | grep none | awk '{print $3}'`
echo '----rm none images----'
docker run -p 8085:8085 --name ${app_name} \
--link mysql:db \
--link redis:redis \
--link mongo:mongo \
--link rabbitmq:rabbit \
--link nacos-registry:nacos-registry \
-e TZ="Asia/Shanghai" \
-v /etc/localtime:/etc/localtime \
-v /home/app/${app_name}/logs:/var/logs \
-d ${group_name}/${app_name}:${app_version}
echo '----start container----'