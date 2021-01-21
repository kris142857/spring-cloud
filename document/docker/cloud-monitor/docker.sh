#!/usr/bin/env bash
app_name='cloud-monitor'
group_name='cloud'
app_version='1.0-SNAPSHOT'

docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi `docker images | grep none | awk '{print $3}'`
echo '----rm none images----'

docker build -t ${group_name}/${app_name}:${app_version} .
echo '----build image----'

docker run -p 8101:8101 --name ${app_name} \
--link nacos-registry:nacos-registry \
--network docker_default \
-e TZ="Asia/Shanghai" \
-v /etc/localtime:/etc/localtime \
-v /home/app/${app_name}/logs:/var/logs \
-d ${group_name}/${app_name}:${app_version}
echo '----start container----'