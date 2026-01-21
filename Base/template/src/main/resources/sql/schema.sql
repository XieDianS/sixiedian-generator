DROP TABLE IF EXISTS `template`;

CREATE TABLE `template` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
    `create_at` datetime DEFAULT NULL COMMENT 'Create Time',
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 101 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci;

SET SESSION cte_max_recursion_depth = 1000;

WITH RECURSIVE
    seq AS (
        SELECT 1 AS n
        UNION ALL
        SELECT n + 1
        FROM seq
        WHERE
            n < 500
    )
INSERT INTO
    `template` (`create_at`, `name`)
SELECT DATE_ADD(
        '2026-01-01 00:00:00', INTERVAL n MINUTE
    ), CONCAT('测试模板_', LPAD(n, 3, '0'))
FROM seq;