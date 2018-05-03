package com.bufoon.demo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


public class Generator
{
    private static String dbUrls = "jdbc:mysql://127.0.0.1:3306/";
    public static void main( String[] args )
    {
        //MybatisGeneratorApp.genBasis();
        Generator.gen();
    }

    public static void gen(){
        String db = "bufoon_framework_demo_master";
        String packageName = "com.bufoon.demo";
        String[] tables = new String[]{"t_demo_user"};
        Generator.generateByTables(db,true, packageName,tables);
    }

    public static void genBasis(){
        String db = "basis";
        String packageName = "com.rttx.risk.basis.app";
        String[] tables = new String[]{"t_tenant", "t_black_list", "t_tenant_app", "t_token_auth"};
        Generator.generateByTables(db,true, packageName,tables);
    }

    public static void genDocking(){
        String db = "docking";
        String packageName = "com.rttx.risk.docking.in";
        String[] tables = new String[]{"t_limit_apply", "t_risk_user_picture", "t_risk_users","t_risk_user_limit",
                "t_risk_users_address", "t_risk_users_contacts","t_risk_access_rule_record","t_risk_user_access_rule"
                ,"t_risk_user_address_book", "t_risk_user_auth","t_risk_user_face_auth", "t_risk_forbid_city","t_risk_rc_basicInfo",
                "t_risk_loan_disbursed","t_risk_repay_plan","t_risk_repay_record","t_risk_order_log"};
        Generator.generateByTables(db, true, packageName,tables);
    }

    private static void generateByTables(String db, boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = dbUrls + db;
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("root")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setTablePrefix("t_", "t_demo_")
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("bufoon")
                .setOutputDir("E:\\codeGen")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        AutoGenerator gen = new AutoGenerator();
        gen.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity").setMapper("mapper")
                ).execute();
    }
}

