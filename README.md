# demo-jpa
Demo ví dụ 1 số đoạn hay dùng ở JPA. Dùng DB MariaDB để test

## Cài Database MariaDB
Cài MariaDB trên máy hoặc dùng Docker.
Tài khoản `root/mypass`

### Chạy MariaDB trên Docker
Cài và chạy Docker, pull images MariaDB 10.3, chạy container và mapping port.

```
docker pull mariadb/server:10.3
docker run --name mariadbtest -p 3306:3306 -e MYSQL_ROOT_PASSWORD=mypass -d mariadb/server:10.3
```

## Tạo database demo
CREATE DATABASE `demo` DEFAULT CHARACTER SET utf8;
