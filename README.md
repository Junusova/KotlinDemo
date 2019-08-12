How to start project:
Clone dental repository:  git clone https://github.com/Junusova/KotlinDemo.git
Checkout from origin/dev branch

On the Next step in application.properties file set

spring.profiles.active=dev

Using this command Spring application will use dev profile. Configurations for this profile could be found in application.properties

Install postgres using command docker 

1. sudo service docker start

2. sudo docker pull postgres

3. sudo docker run -d --name postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 postgres

4. sudo docker restart postgres
