# demo-jpa
Demo ví dụ 1 số đoạn hay dùng ở JPA. Dùng DB MariaDB để test

## Chạy MariaDB trên Docker
```
docker run --name mariadbtest -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mypass -e MYSQL_DATABASE=demo -d mariadb/server:10.3;
```

Hoặc cài MariaDB, tài khoản `root/mypass`, sau đó tạo database `demo`
```
CREATE DATABASE `demo` DEFAULT CHARACTER SET utf8;
```
