SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_dest_user
-- ----------------------------
DROP TABLE IF EXISTS `t_dest_user`;
CREATE TABLE `t_dest_user` (
  `ID` int(11) NOT NULL,
  `USER_ID` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USERNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PASSWORD` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `UPDATE_USER` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `ID` int(11) NOT NULL,
  `USER_ID` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `USERNAME` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PASSWORD` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `CREATE_USER` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  `UPDATE_USER` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '1001', '程宸瑞', '123456', '2017-03-08 14:35:40', 'ADMIN', '2017-03-08 14:43:31', 'ADMIN');
INSERT INTO `t_user` VALUES ('2', '1002', '张三', '2323232', '2017-03-08 14:39:45', 'ADMIN', '2017-03-08 14:43:37', 'ADMIN');
INSERT INTO `t_user` VALUES ('3', '1003', '李四', '1212121', '2017-03-08 14:40:08', 'ADMIN', '2017-03-08 14:43:48', 'ADMIN');
