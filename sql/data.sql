CREATE TABLE IF NOT EXISTS `demo` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` text CHARACTER SET utf8,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `demo` (`id`, `name`, `created_at`, `updated_at`)
VALUES
	(1,'a','2019-02-20 15:48:25','2019-02-20 15:48:25');