/*
 Navicat Premium Data Transfer

 Source Server         : ai-cloud
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : rm-bp15521us1y063fs28o.mysql.rds.aliyuncs.com:3306
 Source Schema         : ai-cloud-dev

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 24/06/2022 17:35:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户id',
  `user_name` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户账号',
  `password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户密码',
  `device_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '设备唯一标识',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户绑定手机号',
  `head_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '头像',
  `nick_name` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '昵称',
  `sex` int(11) NULL DEFAULT NULL COMMENT '性别 1.男 2.女',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `birthday` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '出生年月',
  `sign` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '签名',
  `state` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '国家',
  `capital` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '省份',
  `city` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '城市',
  `counties` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '县区',
  `bind_qq_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'QQ绑定的id',
  `bind_wechat_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '绑定微信id',
  `bind_sina_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '绑定微博id',
  `bind_alipay_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '绑定支付宝id',
  `activate` int(11) NULL DEFAULT 1 COMMENT '是否激活; 用户注册后未登录过，即为此用户未激活 1：未激活 2：已激活',
  `activate_time` datetime NULL DEFAULT NULL COMMENT '激活时间',
  `fans` int(11) NULL DEFAULT 0 COMMENT '粉丝数',
  `attention` int(11) NULL DEFAULT 0 COMMENT '用户关注数',
  `opus` int(11) NULL DEFAULT 0 COMMENT '用户作品数量',
  `likes` int(11) NULL DEFAULT 0 COMMENT '点赞数',
  `kbs` decimal(13, 4) NULL DEFAULT 0.0000 COMMENT '获取的总KB值',
  `invitation_code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户邀请码',
  `invitation_qrcode` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邀请者二维码',
  `invitation_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邀请者id',
  `invitation_url_and` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '推广安卓URL',
  `invitation_url_ios` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '推广IOSURL',
  `invitation_url_weixin` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '推广微信小程序URL',
  `invitation_ids` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '推广链',
  `vip_type` int(11) NOT NULL DEFAULT 1 COMMENT '会员类型; 1：普通会员 2：VIP会员 3：SVIP会员',
  `vip_start_time` datetime NULL DEFAULT NULL COMMENT '会员开始时间',
  `vip_end_time` datetime NULL DEFAULT NULL COMMENT '会员结束时间',
  `realname_auth` int(11) NOT NULL DEFAULT 1 COMMENT '是否实名认证；1：未验证，2：已验证',
  `user_type` int(11) NOT NULL DEFAULT 1 COMMENT '用户类型；1：普通用户 2：VIP用户 3：SVIP用户',
  `weixin_avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '微信用户头像',
  `weixin_openid` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '微信登录openid',
  `session_key` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '微信登录会话KEY',
  `login_ip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最后登录IP',
  `login_date` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
  `status_flag` int(11) NOT NULL DEFAULT 0 COMMENT '状态：0：启用，2：停用',
  `delete_flag` int(11) NOT NULL DEFAULT 0 COMMENT '删除：0：未删除，2：已删除',
  `create_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_name`(`user_name` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('b893f5cde0b54223b2b4546660fb38ac', '13888888888', '$2a$10$2VdZHmdfHAkGPVJ1SurB5.V1rJ4GG8R2UjQIAeNUcX7uKuZnQBIy2', '04eb6607deb84f1085d344c49db2679f', '13888888888', 'http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg', '小可爱', 1, 18, NULL, '这个世界本就是平衡的，想要得到什么就要付出什么', '中国', '云南', '昆明', NULL, NULL, NULL, NULL, NULL, 1, '2021-08-08 08:08:08', 0, 0, 0, 0, 0.0000, NULL, NULL, NULL, 'http://ai.vip.com', 'http://ai.vip.com', NULL, NULL, 1, NULL, NULL, 1, 3, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, '2019-12-01 09:31:27', NULL, '2021-07-22 16:16:54');

-- ----------------------------
-- Table structure for user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '账户id',
  `user_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户id',
  `device_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '设备唯一标识',
  `number` int(11) NOT NULL AUTO_INCREMENT COMMENT '账户号',
  `password` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户支付密码',
  `salt` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '支付密码加密盐',
  `type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户类型；1：余额账户 2：kb账户',
  `user_type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户类型；1：个人  2：商家',
  `grade` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户等级；1：普通账户 2：金卡账户 3：铂金账户',
  `deal_commission_ratio` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '交易手续费比例(账户等级不同，交易手续费比例不同)',
  `withdrawal_commission_ratio` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '提现手续费比例(账户等级不同，交易手续费比例不同)',
  `daily_trading_limit` decimal(32, 4) NULL DEFAULT NULL COMMENT '日交易限额',
  `month_trading_limit` decimal(32, 4) NULL DEFAULT NULL COMMENT '月交易限额',
  `daily_withdrawal_limit` decimal(32, 4) NULL DEFAULT NULL COMMENT '日提现限额',
  `month_withdrawal_limit` decimal(32, 4) NULL DEFAULT NULL COMMENT '月提现限额',
  `available_balance` decimal(32, 4) NOT NULL DEFAULT 0.0000 COMMENT '账户可用余额',
  `frozen_amount` decimal(32, 4) NOT NULL DEFAULT 0.0000 COMMENT '账户冻结金额',
  `status_flag` int(11) NOT NULL DEFAULT 0 COMMENT '状态：0：启用，2：停用',
  `delete_flag` int(11) NOT NULL DEFAULT 0 COMMENT '删除：0：未删除，2：已删除',
  `create_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `number`(`number` ASC) USING BTREE,
  INDEX `user_id`(`number` ASC, `user_id` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 111327 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户账户信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_account
-- ----------------------------
INSERT INTO `user_account` VALUES ('0dd883697e2c4dd7b598a4168748fd22', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', 111297, '852db52f48991f42b4944b63a57ece18', 'OBZAZOQH', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 400.0000, 0.0000, 0, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-09 01:07:15', NULL, NULL);
INSERT INTO `user_account` VALUES ('f94fea4010c04833bbffeb433e4269d0', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', 111298, '852db52f48991f42b4944b63a57ece18', 'OBZAZOQH', '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1000.0000, 0.0000, 0, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-09 01:07:15', NULL, NULL);

-- ----------------------------
-- Table structure for user_account_detail
-- ----------------------------
DROP TABLE IF EXISTS `user_account_detail`;
CREATE TABLE `user_account_detail`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '交易记录id',
  `account_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户id',
  `account_number` int(11) NULL DEFAULT NULL COMMENT '账户号',
  `account_type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '账户类型；1：余额账户  2：kb账户',
  `type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '记录类型；1：收入 2：支出',
  `debit_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收款方类型',
  `debit_number` int(11) NULL DEFAULT NULL COMMENT '收款方账户号',
  `debit_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收款方手机号',
  `credit_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '付款方类型',
  `credit_number` int(11) NULL DEFAULT NULL COMMENT '付款方账户号',
  `credit_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '付款方手机号',
  `order_price` decimal(32, 4) NULL DEFAULT NULL COMMENT '交易金额',
  `before_available_balance` decimal(32, 4) NULL DEFAULT NULL COMMENT '交易前账户可用余额',
  `after_available_balance` decimal(32, 4) NULL DEFAULT NULL COMMENT '交易后账户可用余额',
  `deal_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '交易名称',
  `order_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '订单号',
  `deal_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '交易流水号',
  `merchant_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '第三方交易流水号',
  `remarks` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `img` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '图像',
  `service_charge` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手续费',
  `deal_type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '交易类型；1：充值 2：提现 3：消费 4：转账 5：红包 6： 退款 7：其他',
  `delete_flag` int(11) NOT NULL DEFAULT 0 COMMENT '删除：0：未删除，2：已删除',
  `create_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户账户明细记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_account_detail
-- ----------------------------
INSERT INTO `user_account_detail` VALUES ('07c51002951a4f2f999779123000ecf2', '0dd883697e2c4dd7b598a4168748fd22', 111297, '1', '2', NULL, NULL, NULL, '余额账户', 111297, '13888888888', 100.0000, 600.0000, 500.0000, '余额提现', NULL, 'b20220620704129', NULL, NULL, 'http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png', NULL, '2', 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 00:12:51', NULL, NULL);
INSERT INTO `user_account_detail` VALUES ('4655bc43a60048f882b660c6a4081e34', '0dd883697e2c4dd7b598a4168748fd22', 111297, '1', '2', NULL, NULL, NULL, '余额账户', 111297, '13888888888', 100.0000, 700.0000, 600.0000, '余额提现', NULL, 'b20220620531454', NULL, NULL, 'http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png', NULL, '2', 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 00:10:23', NULL, NULL);
INSERT INTO `user_account_detail` VALUES ('7503c77a60cd4f7fb3184946671ad9bc', '0dd883697e2c4dd7b598a4168748fd22', 111297, '1', '2', NULL, NULL, NULL, '余额账户', 111297, '13888888888', 100.0000, 1000.0000, 900.0000, '余额提现', NULL, 'b20220616436804', NULL, NULL, 'http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg', NULL, '2', 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-16 00:22:03', NULL, NULL);
INSERT INTO `user_account_detail` VALUES ('8c89ffbcd7f34adea8a57cfedb838300', '0dd883697e2c4dd7b598a4168748fd22', 111297, '1', '2', NULL, NULL, NULL, '余额账户', 111297, '13888888888', 100.0000, 800.0000, 700.0000, '余额提现', NULL, 'b20220620510185', NULL, NULL, 'http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png', NULL, '2', 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 00:08:54', NULL, NULL);
INSERT INTO `user_account_detail` VALUES ('a615bfa9e9cf482584fb8529451dee41', '0dd883697e2c4dd7b598a4168748fd22', 111297, '1', '2', NULL, NULL, NULL, '余额账户', 111297, '13888888888', 100.0000, 900.0000, 800.0000, '余额提现', NULL, 'b20220616373285', NULL, NULL, 'http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg', NULL, '2', 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-16 00:22:05', NULL, NULL);
INSERT INTO `user_account_detail` VALUES ('a9358fddc4ea4451a43c52a6cae5a614', '0dd883697e2c4dd7b598a4168748fd22', 111297, '1', '2', NULL, NULL, NULL, '余额账户', 111297, '13888888888', 100.0000, 500.0000, 400.0000, '余额提现', NULL, 'b20220620620171', NULL, NULL, 'http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg', NULL, '2', 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 23:16:32', NULL, NULL);

-- ----------------------------
-- Table structure for user_bind
-- ----------------------------
DROP TABLE IF EXISTS `user_bind`;
CREATE TABLE `user_bind`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT 'id',
  `user_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户id',
  `device_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '设备唯一标识',
  `belong_bank` int(11) NULL DEFAULT NULL COMMENT '所属银行；1：支付宝 2：银行卡',
  `bank_card` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '银行卡卡号',
  `bank_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '银行卡开户行名称 如:工商银行',
  `bank_account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '银行卡开户账户',
  `alipay_account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '支付宝账号',
  `alipay_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '支付宝认证姓名',
  `bind_time` datetime NULL DEFAULT NULL COMMENT '绑定时间',
  `status_flag` int(11) NOT NULL DEFAULT 0 COMMENT '状态：0：启用，2：停用',
  `delete_flag` int(11) NOT NULL DEFAULT 0 COMMENT '删除：0：未删除，2：已删除',
  `create_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户绑定银行卡或支付宝' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_bind
-- ----------------------------
INSERT INTO `user_bind` VALUES ('45184c73cfd14a9dadaa2c472919d976', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', 1, NULL, NULL, NULL, '13888888888', '小公举', '2021-09-05 18:50:43', 0, 0, NULL, '2021-09-05 18:50:43', NULL, '2021-09-09 16:26:20');
INSERT INTO `user_bind` VALUES ('50e43ac22b4741f8974f84d7a0bb391b', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', 2, '6888888888888889000', '中国银行', '小宝贝', NULL, NULL, '2021-09-05 18:50:14', 0, 0, NULL, '2021-09-09 16:06:59', NULL, NULL);

-- ----------------------------
-- Table structure for user_config
-- ----------------------------
DROP TABLE IF EXISTS `user_config`;
CREATE TABLE `user_config`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '参数id',
  `config_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '参数名称',
  `config_key` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '参数键名',
  `config_value` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '参数键值',
  `config_type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT 'N' COMMENT '系统内置（Y是 N否）',
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户参数配置表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_config
-- ----------------------------
INSERT INTO `user_config` VALUES ('00986a7829af4d16a7d1cb543f8790f0', '是否开启用户注册功能', 'user.account.registerUser', 'true', 'Y', 'admin', '2022-04-07 22:34:54', '', NULL);

-- ----------------------------
-- Table structure for user_login_log
-- ----------------------------
DROP TABLE IF EXISTS `user_login_log`;
CREATE TABLE `user_login_log`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '登录记录id',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '用户账号',
  `device_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '登录设备唯一标识',
  `type` int(11) NULL DEFAULT NULL COMMENT '登录方式；1：手机快捷登录 2：账号密码登录',
  `status` int(11) NULL DEFAULT NULL COMMENT '登录状态：0：成功 1：失败',
  `ipaddr` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '登录IP地址',
  `msg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '提示消息',
  `login_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '登录地点',
  `login_time` datetime NULL DEFAULT NULL COMMENT '访问时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `device_id`(`device_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户登录记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_login_log
-- ----------------------------
INSERT INTO `user_login_log` VALUES ('066e3128edf749b19af135216aa7c5d0', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 1, '127.0.0.1', '用户密码不在指定范围', '', '2022-06-19 22:54:01');
INSERT INTO `user_login_log` VALUES ('0bff82f93c4f4c9b919202a7f31beda0', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 0, '127.0.0.1', '登录成功', '', '2022-06-20 23:15:56');
INSERT INTO `user_login_log` VALUES ('2bad72c3c905434aba28318430426f7d', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 0, '127.0.0.1', '登录成功', '', '2022-06-17 17:14:59');
INSERT INTO `user_login_log` VALUES ('cb2bbf63d9ea4339858b651b1dd27fcb', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 0, '127.0.0.1', '登录成功', '', '2022-06-19 22:56:17');
INSERT INTO `user_login_log` VALUES ('e39c8753684c41f281d62e6847342f98', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 0, '127.0.0.1', '登录成功', '', '2022-06-24 00:55:51');
INSERT INTO `user_login_log` VALUES ('f34462660274492b86997928843499d2', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 0, '127.0.0.1', '登录成功', '', '2022-06-20 23:16:09');
INSERT INTO `user_login_log` VALUES ('f6674e94c0b142f280836c9c02fe8469', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, 0, '127.0.0.1', '登录成功', '', '2022-06-17 17:06:44');

-- ----------------------------
-- Table structure for user_mock_data
-- ----------------------------
DROP TABLE IF EXISTS `user_mock_data`;
CREATE TABLE `user_mock_data`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'id',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型：1：昵称 2：头像',
  `value` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '昵称或者头像值',
  `status_flag` int(11) NOT NULL DEFAULT 0 COMMENT '状态：0：启用，2：停用',
  `delete_flag` int(11) NOT NULL DEFAULT 0 COMMENT '删除：0：未删除，2：已删除',
  `create_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户随机信息' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_mock_data
-- ----------------------------
INSERT INTO `user_mock_data` VALUES ('1', 1, '小可爱', 0, 0, NULL, NULL, NULL, NULL);
INSERT INTO `user_mock_data` VALUES ('10', 1, '小宝贝', 0, 0, NULL, NULL, NULL, NULL);
INSERT INTO `user_mock_data` VALUES ('11', 1, '小公举', 0, 0, NULL, NULL, NULL, NULL);
INSERT INTO `user_mock_data` VALUES ('14', 2, 'http://cdn.ynckzg.com/a10a015e7083453a9fb3ec418b51e569.png', 0, 0, NULL, NULL, NULL, NULL);
INSERT INTO `user_mock_data` VALUES ('15', 2, 'http://cdn.ynckzg.com/a10a015e7083453a9fb3ec418b51e570.png', 0, 0, NULL, NULL, NULL, NULL);
INSERT INTO `user_mock_data` VALUES ('16', 2, 'http://cdn.ynckzg.com/a10a015e7083453a9fb3ec418b51e571.png', 0, 0, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user_oper_log
-- ----------------------------
DROP TABLE IF EXISTS `user_oper_log`;
CREATE TABLE `user_oper_log`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '日志主键',
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '模块标题',
  `business_type` int(2) NULL DEFAULT 0 COMMENT '业务类型（0其它 1查询 2新增 3修改 4删除）',
  `method` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '方法名称',
  `request_method` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '请求方式',
  `operator_type` int(1) NULL DEFAULT 0 COMMENT '操作类别（0其它 1小程序用户 2手机端用户）',
  `oper_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '操作人员',
  `oper_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '请求URL',
  `oper_ip` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '主机地址',
  `oper_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '操作地点',
  `oper_param` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '请求参数',
  `json_result` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '返回参数',
  `status` int(1) NULL DEFAULT 0 COMMENT '操作状态（0正常 1异常）',
  `error_msg` varchar(2000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '错误消息',
  `oper_time` datetime NULL DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户操作日志记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_oper_log
-- ----------------------------
INSERT INTO `user_oper_log` VALUES ('043f2dab02c94b359bb8533c94e9e074', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:34');
INSERT INTO `user_oper_log` VALUES ('088c1b78562b4182b623935a5e591776', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:32');
INSERT INTO `user_oper_log` VALUES ('0c82c274cb2c4842a96137ff37fc38ed', '查询用户信息', 1, 'com.cloud.user.controller.UserCenterApi.userInfo()', 'POST', 2, '20220610', '/user/userInfo', '127.0.0.1', '', '', '{\"code\":200,\"data\":{\"age\":\"18\",\"attention\":0,\"fans\":0,\"headImg\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"likes\":0,\"nickName\":\"小可爱\",\"phone\":\"13888888888\",\"sex\":\"1\",\"sign\":\"这个世界本就是平衡的，想要得到什么就要付出什么\",\"userName\":\"20220610\",\"userType\":3,\"vipType\":1},\"msg\":\"查询成功!\"}', 0, '', '2022-06-17 17:07:10');
INSERT INTO `user_oper_log` VALUES ('0ce4925549584c669cf2526bcf07df98', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:10:12');
INSERT INTO `user_oper_log` VALUES ('184a9f8b518144d2974f1ecfc12ba148', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:10:14');
INSERT INTO `user_oper_log` VALUES ('18f0080bfdf04f33b75d246fb91c1f62', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"654321\",\"password\":\"123456\"}', '', 1, '原密码错误', '2022-06-20 00:09:27');
INSERT INTO `user_oper_log` VALUES ('19020b8dd8074c2b96b82278cb61ed02', '查询钱包账单', 1, 'com.cloud.user.controller.UserCenterApi.walletBill()', 'POST', 2, '20220610', '/user/wallet/bill', '127.0.0.1', '', '{\"isAsc\":\"asc\",\"orderBy\":\"\",\"pageNum\":1,\"pageSize\":10,\"reasonable\":true}', '{\"code\":200,\"data\":{\"endRow\":2,\"hasNextPage\":false,\"hasPreviousPage\":false,\"isFirstPage\":true,\"isLastPage\":true,\"list\":[{\"amount\":100.0000,\"createTime\":\"2022-06-16 00:22:05\",\"dealName\":\"余额提现\",\"dealType\":\"2\",\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"type\":\"2\"},{\"amount\":100.0000,\"createTime\":\"2022-06-16 00:22:03\",\"dealName\":\"余额提现\",\"dealType\":\"2\",\"detailId\":\"7503c77a60cd4f7fb3184946671ad9bc\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"type\":\"2\"}],\"navigateFirstPage\":1,\"navigateLastPage\":1,\"navigatePages\":8,\"navigatepageNums\":[1],\"nextPage\":0,\"pageNum\":1,\"pageSize\":10,\"pages\":1,\"prePage\":0,\"size\":2,\"startRow\":1,\"total\":2},\"msg\":\"查询成功!\"}', 0, '', '2022-06-16 00:30:30');
INSERT INTO `user_oper_log` VALUES ('1a0e21d348dc4043a241008aa90272a9', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:33');
INSERT INTO `user_oper_log` VALUES ('1a85064dbebb4d7bb8753e1e54bb1d87', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"string\",\"password\":\"123456\"}', '', 1, '原密码错误', '2022-06-20 00:07:20');
INSERT INTO `user_oper_log` VALUES ('29c8cc65b50f48a08059f097b4a5c539', '查询用户信息', 1, 'com.cloud.user.controller.UserCenterApi.userInfo()', 'POST', 2, '20220610', '/user/userInfo', '127.0.0.1', '', '', '{\"code\":200,\"data\":{\"age\":\"19\",\"attention\":0,\"fans\":0,\"headImg\":\"http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png\",\"likes\":0,\"nickName\":\"小可爱\",\"phone\":\"13888888888\",\"sex\":\"1\",\"sign\":\"这个世界本就是平衡的，想要得到什么就要付出什么\",\"userName\":\"20220610\",\"userType\":3,\"vipType\":1},\"msg\":\"查询成功!\"}', 0, '', '2022-06-17 17:12:07');
INSERT INTO `user_oper_log` VALUES ('33f6f5398b8f4a4d82167433416f1acd', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"2\",\"password\":\"2\"}', '{\"code\":200,\"data\":{\"oldPassword\":\"2\",\"password\":\"2\"}}', 0, '', '2022-06-20 00:01:51');
INSERT INTO `user_oper_log` VALUES ('357f5ff914934f2d81233f3bd33c61f4', '查询钱包余额', 1, 'com.cloud.user.controller.UserCenterApi.wallet()', 'POST', 2, '20220610', '/user/wallet', '127.0.0.1', '', '', '{\"code\":200,\"data\":\"800.0000\",\"msg\":\"查询成功!\"}', 0, '', '2022-06-17 17:07:34');
INSERT INTO `user_oper_log` VALUES ('36a01913724d4ed7ad47dd27c19a28b0', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"654321\",\"password\":\"123456\"}', '{\"code\":200}', 0, '', '2022-06-20 00:09:24');
INSERT INTO `user_oper_log` VALUES ('39c0c1720cd8459e97a1dde204f35221', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:29');
INSERT INTO `user_oper_log` VALUES ('3a02b6536e1644f2a647b26559b1660c', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"654321\",\"type\":1}', '{\"code\":200,\"data\":true,\"msg\":\"申请成功!\"}', 0, '', '2022-06-20 23:16:32');
INSERT INTO `user_oper_log` VALUES ('40029867afa841b89b59da522b334bb9', '保存我的信息', 3, 'com.cloud.user.controller.UserCenterApi.userSave()', 'POST', 2, '20220610', '/user/userSave', '127.0.0.1', '', '{\"age\":18,\"headImg\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"invitationUrlAnd\":\"http://ai.vip.com\",\"invitationUrlIos\":\"http://ai.vip.com\",\"nickName\":\"小可爱\",\"sex\":1,\"sign\":\"这个世界本就是平衡的，想要得到什么就要付出什么\"}', '{\"code\":200,\"data\":true,\"msg\":\"保存成功!\"}', 0, '', '2022-06-20 23:16:19');
INSERT INTO `user_oper_log` VALUES ('44c5614438ef4b40904b81a84b044c88', '查询钱包账单', 1, 'com.cloud.user.controller.UserCenterApi.walletBill()', 'POST', 2, '20220610', '/user/wallet/bill', '127.0.0.1', '', '{\"dealType\":\"1\",\"end\":\"2030-12-31\",\"isAsc\":\"string\",\"orderBy\":\"string string\",\"orderByColumn\":\"string\",\"pageNum\":0,\"pageSize\":0,\"reasonable\":true,\"start\":\"2020-01-01\"}', '{\"code\":200,\"data\":{\"endRow\":0,\"hasNextPage\":false,\"hasPreviousPage\":false,\"isFirstPage\":false,\"isLastPage\":true,\"list\":[],\"navigateFirstPage\":0,\"navigateLastPage\":0,\"navigatePages\":8,\"navigatepageNums\":[],\"nextPage\":0,\"pageNum\":0,\"pageSize\":0,\"pages\":0,\"prePage\":0,\"size\":0,\"startRow\":0,\"total\":0},\"msg\":\"查询成功!\"}', 0, '', '2022-06-17 17:07:47');
INSERT INTO `user_oper_log` VALUES ('4d3c6f1098c84698be6d6c6aa3ed10e3', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"2\",\"password\":\"2\"}', '{\"code\":200,\"data\":{\"oldPassword\":\"2\",\"password\":\"2\"}}', 0, '', '2022-06-20 00:01:55');
INSERT INTO `user_oper_log` VALUES ('51c574a5204147b6b1672c4f2ea32eee', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '{\"code\":200,\"data\":true,\"msg\":\"申请成功!\"}', 0, '', '2022-06-16 00:22:03');
INSERT INTO `user_oper_log` VALUES ('541a15c9770f4566b08b266128f99f29', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:12:56');
INSERT INTO `user_oper_log` VALUES ('545bcff492a641da98d9aa3a5a8231ae', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '{\"code\":200,\"data\":true,\"msg\":\"申请成功!\"}', 0, '', '2022-06-16 00:22:05');
INSERT INTO `user_oper_log` VALUES ('558905096b934688a65322286cd3af48', '查询钱包余额', 1, 'com.cloud.user.controller.UserCenterApi.wallet()', 'POST', 2, '20220610', '/user/wallet', '127.0.0.1', '', '', '{\"code\":200,\"data\":\"500.0000\",\"msg\":\"查询成功!\"}', 0, '', '2022-06-20 23:16:22');
INSERT INTO `user_oper_log` VALUES ('58ef92b15bd94f2b80d82b8897836c20', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"2\",\"password\":\"2\"}', '{\"code\":200,\"data\":{\"oldPassword\":\"2\",\"password\":\"2\"}}', 0, '', '2022-06-20 00:01:35');
INSERT INTO `user_oper_log` VALUES ('59e0f1d1c514480c9c8022039aec7932', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '{\"code\":200,\"data\":true,\"msg\":\"申请成功!\"}', 0, '', '2022-06-20 00:08:54');
INSERT INTO `user_oper_log` VALUES ('648b7390d6874471968ee29dd8c88223', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"\",\"password\":\"123456\"}', '{\"code\":200}', 0, '', '2022-06-20 00:16:18');
INSERT INTO `user_oper_log` VALUES ('68a0e1865546488fa5b493279618b7c2', '查询用户信息', 1, 'com.cloud.user.controller.UserCenterApi.userInfo()', 'POST', 2, '20220610', '/user/userInfo', '127.0.0.1', '', '', '{\"code\":200,\"data\":{\"age\":\"18\",\"attention\":0,\"fans\":0,\"headImg\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"likes\":0,\"nickName\":\"小可爱\",\"phone\":\"13888888888\",\"sex\":\"1\",\"sign\":\"这个世界本就是平衡的，想要得到什么就要付出什么\",\"userName\":\"20220610\",\"userType\":3,\"vipType\":1},\"msg\":\"查询成功!\"}', 0, '', '2022-06-17 17:07:07');
INSERT INTO `user_oper_log` VALUES ('7042b046ac3b42968b5a65e9b755b9c9', '查询账单明细', 1, 'com.cloud.user.controller.UserCenterApi.walletBillDetail()', 'POST', 2, '20220610', '/user/wallet/bill/detail', '127.0.0.1', '', '{\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\"}', '{\"code\":200,\"data\":[{\"alipayAccount\":\"13888888888\",\"alipayName\":\"小公举\",\"amount\":100.0000,\"belongBank\":1,\"dealName\":\"余额提现\",\"dealType\":\"2\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"remitStatus\":1,\"status\":1,\"type\":\"2\"}],\"msg\":\"查询成功!\"}', 0, '', '2022-06-20 23:16:55');
INSERT INTO `user_oper_log` VALUES ('7630ca6f6823437e812c40b7bde643e3', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":1000,\"password\":\"654321\",\"type\":1}', '', 1, '余额不足！', '2022-06-20 23:16:36');
INSERT INTO `user_oper_log` VALUES ('86ab80681c1f4a5abc6dd41b185da161', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"123456\",\"password\":\"654321\"}', '', 1, '原密码错误', '2022-06-20 00:08:02');
INSERT INTO `user_oper_log` VALUES ('889db388f2744f1e8c4cfeeef98a504d', '查询用户信息', 1, 'com.cloud.user.controller.UserCenterApi.userInfo()', 'POST', 2, '20220610', '/user/userInfo', '127.0.0.1', '', '', '{\"code\":200,\"data\":{\"age\":\"19\",\"attention\":0,\"fans\":0,\"headImg\":\"http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png\",\"likes\":0,\"nickName\":\"小可爱\",\"phone\":\"13888888888\",\"sex\":\"1\",\"sign\":\"这个世界本就是平衡的，想要得到什么就要付出什么\",\"userName\":\"13888888888\",\"userType\":3,\"vipType\":1},\"msg\":\"查询成功!\"}', 0, '', '2022-06-20 23:16:14');
INSERT INTO `user_oper_log` VALUES ('8e0140c3f3e24796b86c809039fbf7cd', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码未设置!', '2022-06-20 00:15:41');
INSERT INTO `user_oper_log` VALUES ('97e39bb2a3d84510ba69f4ef642c7a26', '查询账单明细', 1, 'com.cloud.user.controller.UserCenterApi.walletBillDetail()', 'POST', 2, '20220610', '/user/wallet/bill/detail', '127.0.0.1', '', '{\r\n\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\"\r\n}', '{\"code\":200,\"data\":[],\"msg\":\"查询成功!\"}', 0, '', '2022-06-16 00:22:28');
INSERT INTO `user_oper_log` VALUES ('9bc9fbe8145644f48e1fd67b0e510a53', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:33');
INSERT INTO `user_oper_log` VALUES ('a372912a32f34e788165c9bb7b116fe4', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 23:16:24');
INSERT INTO `user_oper_log` VALUES ('a93092756eeb4ef1bd9802d5b753f444', '查询钱包账单', 1, 'com.cloud.user.controller.UserCenterApi.walletBill()', 'POST', 2, '20220610', '/user/wallet/bill', '127.0.0.1', '', '{\"isAsc\":\"asc\",\"orderBy\":\"\",\"pageNum\":1,\"pageSize\":10,\"reasonable\":true}', '{\"code\":200,\"data\":{\"endRow\":2,\"hasNextPage\":false,\"hasPreviousPage\":false,\"isFirstPage\":true,\"isLastPage\":true,\"list\":[{\"amount\":100.0000,\"createTime\":\"2022-06-16 00:22:05\",\"dealName\":\"余额提现\",\"dealType\":\"2\",\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"type\":\"2\"},{\"amount\":100.0000,\"createTime\":\"2022-06-16 00:22:03\",\"dealName\":\"余额提现\",\"dealType\":\"2\",\"detailId\":\"7503c77a60cd4f7fb3184946671ad9bc\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"type\":\"2\"}],\"navigateFirstPage\":1,\"navigateLastPage\":1,\"navigatePages\":8,\"navigatepageNums\":[1],\"nextPage\":0,\"pageNum\":1,\"pageSize\":10,\"pages\":1,\"prePage\":0,\"size\":2,\"startRow\":1,\"total\":2},\"msg\":\"查询成功!\"}', 0, '', '2022-06-16 00:22:07');
INSERT INTO `user_oper_log` VALUES ('a980300a31d74348bc5ce9cfd33f8b02', '保存我的信息', 3, 'com.cloud.user.controller.UserCenterApi.userSave()', 'POST', 2, '20220610', '/user/userSave', '127.0.0.1', '', '{\"age\":19,\"headImg\":\"http://192.168.2.11/group1/M00/00/00/wKgCC2KSXreAaYveAANzTDXoVDw494.png\",\"invitationUrlAnd\":\"UrlAnd\",\"invitationUrlIos\":\"UrlIos\",\"nickName\":\"小可爱\",\"sex\":1,\"sign\":\"这个世界本就是平衡的，想要得到什么就要付出什么\"}', '{\"code\":200,\"data\":true,\"msg\":\"保存成功!\"}', 0, '', '2022-06-17 17:07:28');
INSERT INTO `user_oper_log` VALUES ('ad878a7fd2fe4b8599434f972a6a7132', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"654321\",\"type\":1}', '{\"code\":200,\"data\":true,\"msg\":\"申请成功!\"}', 0, '', '2022-06-20 00:12:51');
INSERT INTO `user_oper_log` VALUES ('b2783d11213c49fb80f5b72b9ae132b7', '是否设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletIsSetPassword()', 'POST', 2, '13888888888', '/user/wallet/isSetPassword', '127.0.0.1', '', '', '{\"code\":200,\"data\":true}', 0, '', '2022-06-20 00:01:11');
INSERT INTO `user_oper_log` VALUES ('b28dc4a6d3cc41ea808fcbcd7721467b', '查询账单明细', 1, 'com.cloud.user.controller.UserCenterApi.walletBillDetail()', 'POST', 2, '20220610', '/user/wallet/bill/detail', '127.0.0.1', '', '{\r\n\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\"\r\n}', '{\"code\":200,\"data\":[],\"msg\":\"查询成功!\"}', 0, '', '2022-06-16 00:26:24');
INSERT INTO `user_oper_log` VALUES ('c21af60470cf4638b7d316f842ce1695', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:10:13');
INSERT INTO `user_oper_log` VALUES ('c6100eeea0cb41a88397aa2b2a5b29b0', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"2\",\"password\":\"123456\"}', '', 1, '原密码错误', '2022-06-20 00:07:28');
INSERT INTO `user_oper_log` VALUES ('c8446b7ee3804aa3b63b296c5676e6ca', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:30');
INSERT INTO `user_oper_log` VALUES ('d502c1dea6c1438ab43cb045228fb0bc', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"\",\"password\":\"654321\"}', '{\"code\":200}', 0, '', '2022-06-20 00:08:41');
INSERT INTO `user_oper_log` VALUES ('df0ef89cac094150bb86007b6b9ee5af', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"654321\",\"type\":1}', '{\"code\":200,\"data\":true,\"msg\":\"申请成功!\"}', 0, '', '2022-06-20 00:10:23');
INSERT INTO `user_oper_log` VALUES ('ef9c0a1ad6834427a68e79c87e30a7ae', '查询账单明细', 1, 'com.cloud.user.controller.UserCenterApi.walletBillDetail()', 'POST', 2, '20220610', '/user/wallet/bill/detail', '127.0.0.1', '', '{\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\"}', '{\"code\":200,\"data\":[{\"alipayAccount\":\"13888888888\",\"alipayName\":\"小公举\",\"amount\":100.0000,\"belongBank\":1,\"dealName\":\"余额提现\",\"dealType\":\"2\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"remitStatus\":1,\"status\":1,\"type\":\"2\"}],\"msg\":\"查询成功!\"}', 0, '', '2022-06-20 23:16:53');
INSERT INTO `user_oper_log` VALUES ('f046aece818045ed9be3935543c02023', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:31');
INSERT INTO `user_oper_log` VALUES ('f0ed2024df834439864c84ef7d6165e5', '查询账单明细', 1, 'com.cloud.user.controller.UserCenterApi.walletBillDetail()', 'POST', 2, '20220610', '/user/wallet/bill/detail', '127.0.0.1', '', '{\"detailId\":\"a615bfa9e9cf482584fb8529451dee41\"}', '{\"code\":200,\"data\":[{\"alipayAccount\":\"13888888888\",\"alipayName\":\"小公举\",\"amount\":100.0000,\"belongBank\":1,\"dealName\":\"余额提现\",\"dealType\":\"2\",\"img\":\"http://cdn.ynckzg.com/75d11b275dd64b3892592958e1fce5f7.jpeg\",\"remitStatus\":1,\"status\":1,\"type\":\"2\"}],\"msg\":\"查询成功!\"}', 0, '', '2022-06-16 00:30:42');
INSERT INTO `user_oper_log` VALUES ('f4932456e03f4e44ad3437ad9e788e7f', '设置支付密码', 1, 'com.cloud.user.controller.UserCenterApi.walletSetPassword()', 'POST', 2, '13888888888', '/user/wallet/setPassword', '127.0.0.1', '', '{\"oldPassword\":\"654321\",\"password\":\"123456\"}', '', 1, '原密码错误', '2022-06-20 00:12:41');
INSERT INTO `user_oper_log` VALUES ('f5ffc7cb9ea44104af564a5e7ccaa711', '用户申请提现', 1, 'com.cloud.user.controller.UserCenterApi.walletWithdraw()', 'POST', 2, '20220610', '/user/wallet/withdraw', '127.0.0.1', '', '{\"amount\":100,\"password\":\"123456\",\"type\":1}', '', 1, '支付密码错误!', '2022-06-20 00:16:30');

-- ----------------------------
-- Table structure for user_registry_log
-- ----------------------------
DROP TABLE IF EXISTS `user_registry_log`;
CREATE TABLE `user_registry_log`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '注册记录ID',
  `user_name` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '注册账号',
  `device_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '注册设备唯一标识',
  `type` int(11) NULL DEFAULT NULL COMMENT '注册方式；1：手机快捷注册 2：手机短信注册 3：微信注册 4：支付宝注册 5：新浪微博注册',
  `source` int(11) NULL DEFAULT NULL COMMENT '注册来源；1：app； 2：h5； 3：微信公众号 4：小程序',
  `bind_phone` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '绑定手机号',
  `invitation_code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '注册邀请码',
  `msg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '提示消息',
  `ipaddr` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '注册IP地址',
  `status` int(11) NULL DEFAULT NULL COMMENT '注册状态：0：成功 1：失败',
  `registry_time` datetime NULL DEFAULT NULL COMMENT '注册时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `device_id`(`device_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户注册记录表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_registry_log
-- ----------------------------
INSERT INTO `user_registry_log` VALUES ('14f762526e5c48baa9ae788025971c2f', '13888888888', '04eb6607deb84f1085d344c49db2679f', NULL, NULL, NULL, NULL, '注册成功', '127.0.0.1', 0, '2022-06-19 22:52:46');

-- ----------------------------
-- Table structure for user_withdraw_apply
-- ----------------------------
DROP TABLE IF EXISTS `user_withdraw_apply`;
CREATE TABLE `user_withdraw_apply`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '提现记录id',
  `user_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户id',
  `device_id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '设备唯一标示',
  `belong_bank` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '提现方式；1：支付宝 2：银行卡',
  `bank_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '开户行姓名',
  `bank_account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '开户行账号',
  `bank_card` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '卡号',
  `alipay_account` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '支付宝账户',
  `alipay_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '支付宝姓名',
  `amount` decimal(10, 3) NULL DEFAULT NULL COMMENT '提现金额',
  `deal_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '交易流水号',
  `merchant_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商户流水号',
  `service_charge` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '提现手续费',
  `settlement_amount` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '结算账金额',
  `status` int(11) NULL DEFAULT 1 COMMENT '提现状态；1：待审核 2：审核通过 3：审核拒绝',
  `remit_status` int(11) NULL DEFAULT 1 COMMENT '打款状态 1：待确认 2：已打款 3：拒绝打款',
  `apply_time` datetime NULL DEFAULT NULL COMMENT '申请时间',
  `accept_apply_time` datetime NULL DEFAULT NULL COMMENT '审核通过时间',
  `accept_apply_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '审核通过扣款流水号（冗余）',
  `remit_time` datetime NULL DEFAULT NULL COMMENT '确认打款时间',
  `remit_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '确认打款交易流水号(冗余)',
  `other_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '外部汇款凭证号',
  `refuse_apply_time` datetime NULL DEFAULT NULL COMMENT '审核/打款 拒绝时间',
  `refuse_serial_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '打款拒绝退款流水号',
  `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL COMMENT '备注',
  `delete_flag` int(11) NOT NULL DEFAULT 0 COMMENT '删除：0：未删除，2：已删除',
  `create_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_id`(`user_id` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户提现申请记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_withdraw_apply
-- ----------------------------
INSERT INTO `user_withdraw_apply` VALUES ('1537108179331526658', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', '1', NULL, NULL, NULL, '13888888888', '小公举', 100.000, 'b20220616436804', NULL, NULL, NULL, 1, 1, '2022-06-16 00:22:03', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-16 00:22:03', NULL, NULL);
INSERT INTO `user_withdraw_apply` VALUES ('1537108187816603649', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', '1', NULL, NULL, NULL, '13888888888', '小公举', 100.000, 'b20220616373285', NULL, NULL, NULL, 1, 1, '2022-06-16 00:22:05', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-16 00:22:05', NULL, NULL);
INSERT INTO `user_withdraw_apply` VALUES ('345d7fb84c8f4d80a77411ab7fb77795', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', '1', NULL, NULL, NULL, '13888888888', '小公举', 100.000, 'b20220620620171', NULL, NULL, NULL, 1, 1, '2022-06-20 23:16:32', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 23:16:32', NULL, NULL);
INSERT INTO `user_withdraw_apply` VALUES ('61a3ec4f46684882900c70b8ab565e86', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', '1', NULL, NULL, NULL, '13888888888', '小公举', 100.000, 'b20220620531454', NULL, NULL, NULL, 1, 1, '2022-06-20 00:10:23', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 00:10:23', NULL, NULL);
INSERT INTO `user_withdraw_apply` VALUES ('8485d0f17c034e80b330a4c412f315f1', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', '1', NULL, NULL, NULL, '13888888888', '小公举', 100.000, 'b20220620704129', NULL, NULL, NULL, 1, 1, '2022-06-20 00:12:51', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 00:12:51', NULL, NULL);
INSERT INTO `user_withdraw_apply` VALUES ('fc234a41ce2f4c89922be82e4641d3b4', 'b893f5cde0b54223b2b4546660fb38ac', '04eb6607deb84f1085d344c49db2679f', '1', NULL, NULL, NULL, '13888888888', '小公举', 100.000, 'b20220620510185', NULL, NULL, NULL, 1, 1, '2022-06-20 00:08:54', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 'b893f5cde0b54223b2b4546660fb38ac', '2022-06-20 00:08:54', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
