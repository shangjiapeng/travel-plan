package com.qsm.travelplan;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: shangjp
 * @Email: shangjp@163.com
 * @Date: 2020/6/2 17:31
 * @Description: mybatis逆向工程--工具类
 */
public class MBGUtil {

    public static void main(String[] args) throws Exception {

        List<String> warnings = new ArrayList();
        boolean overwrite = true;
        File configFile =new File("/Users/shangjiapeng/idea-projects/travel-plan/travel-plan-basic/mapper/src/main/resources/generatorConfig.xml");
        ConfigurationParser parser =new ConfigurationParser(warnings);
        Configuration config = parser.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator generator =new MyBatisGenerator(config,callback,warnings);
        generator.generate(null);



    }
}
