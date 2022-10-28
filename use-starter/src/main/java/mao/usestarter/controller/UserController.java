package mao.usestarter.controller;

import mao.toolsdozer.utils.DozerUtils;
import mao.usestarter.entity.UserDTO;
import mao.usestarter.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.Date;

/**
 * Project name(项目名称)：dozer_starter_demo
 * Package(包名): mao.usestarter.controller
 * Class(类名): UserController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/28
 * Time(创建时间)： 22:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */


@RestController
public class UserController
{

    @Autowired
    private DozerUtils dozerUtils;

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/test1")
    public UserDTO test1()
    {
        log.info("test1");
        UserEntity userEntity = new UserEntity("1234", "张三", 13, "中国", new Date());
        log.info(userEntity.toString());
        UserDTO userDTO = dozerUtils.map(userEntity, UserDTO.class);
        log.info(userDTO.toString());
        return userDTO;
    }
}
