-- DROP TABLE IF EXISTS `table_name`;

	CREATE TABLE `table_name` IF NOT EXIST `table_name``(
	  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	  `c_name` VARCHAR(64) NOT NULL COMMENT '用户名',
	  `c_ip` VARCHAR(20) DEFAULT '192.168.0.1' COMMENT '最后访问IP',
	  `c_time1` TIMESTAMP NOT NULL DEFAULT NOW() COMMENT '最初访问时间',
	  `c_time2` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '最后访问时间'
	  `c_decimal` DECIMAL(5,2) DEFAULT 0 COMMENT '价格',
		  -- (MySQL版本3.23+取值范围：-999.99~9999.99;5+2个字节，精确2位小数)
		  -- DECIMAL(M,N)：包含M+2个字节，其中2指的是'.'和'-'(小数点和负号)，一个符号或数字占一个字节。

	  PRIMARY KEY (`id`),
	  FOREIGN KEE
	) ENGINE=INNODB DEFAULT CHARSET=utf8;
	COMMIT;

-- 修改数据库属性
	ALTER DATABASE db_name CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;--修改数据库字符集

	ALTER TABLE mytrea_thing CHANGE tName tName VARCHAR(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 修改表属性
	--修改表字符集
	ALTER TABLE table_name CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

	--为表增加外键约束
	ALTER TABLE table_name
	ADD CONSTRAINT fk_tableName1_tableName2 FOREIGN KEY (prop) REFERENCES tableName2(prop);

	--为表新增字段
	ALTER TABLE table_name
	ADD COLUMN c_add VARCHAR(128) DEFAULT NULL COMMENT '新增字段';

COMMIT;


-- 修改表数据
	--字符串拼接
	UPDATE table_name SET item = concat(str1,item);