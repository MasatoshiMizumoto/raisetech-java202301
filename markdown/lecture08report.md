# Docker　MySQLハンズオン

- 一部コマンドをエイリアスにしています

```shell
❯ dcu -d
[+] Running 2/2
⠿ Network docker-mysql-hands-on_default  Created                                                                                0.1s
⠿ Container docker-mysql-hands-on        Started                                                                                1.2s

docker-mysql-hands-on on  main on ☁️  (ap-northeast-1)
❯ sz
Agent pid 93241
No identity found in the keychain.

docker-mysql-hands-on on  main on ☁️  (ap-northeast-1)
❯ dce db mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| movie_list         |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.12 sec)

mysql> use movie_list;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+----------------------+
| Tables_in_movie_list |
+----------------------+
| movies               |
+----------------------+
1 row in set (0.04 sec)

mysql> select * from movies;
+----+--------------------------------+-----------------------------+
| id | name                           | director                    |
+----+--------------------------------+-----------------------------+
|  1 | ショーシャンクの空に           | フランク・ダラボン          |
|  2 | この世界の片隅に               | 片渕須直                    |
+----+--------------------------------+-----------------------------+
2 rows in set (0.04 sec)

mysql> insert into movies (name, director) values ("ゴッドファーザー", "フランシス・フォード・コッポラ");
Query OK, 1 row affected (0.06 sec)

mysql> select * from movies;
+----+--------------------------------+-----------------------------------------------+
| id | name                           | director                                      |
+----+--------------------------------+-----------------------------------------------+
|  1 | ショーシャンクの空に           | フランク・ダラボン                            |
|  2 | この世界の片隅に               | 片渕須直                                      |
|  3 | ゴッドファーザー               | フランシス・フォード・コッポラ                |
+----+--------------------------------+-----------------------------------------------+
3 rows in set (0.01 sec)

mysql> exit
Bye

docker-mysql-hands-on on  main on ☁️  (ap-northeast-1) took 1m21s
❯ docker-compose down
[+] Running 2/2
⠿ Container docker-mysql-hands-on        Removed                                                                                2.1s
⠿ Network docker-mysql-hands-on_default  Removed                                                                                0.1s
```
