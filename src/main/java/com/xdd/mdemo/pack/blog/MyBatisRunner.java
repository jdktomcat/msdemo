package com.xdd.mdemo.pack.blog;

import com.xdd.mdemo.pack.blog.entry.StatisticsInfo;
import com.xdd.mdemo.pack.blog.mappers.StatisticsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by angelo.tang on 2017-3-24.
 */
public class MyBatisRunner {

    public static void main(String[] args) throws IOException {
        String resource = "com/xdd/example/conf/mybaits-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SqlSession session = sqlSessionFactory.openSession();
        try {
            StatisticsMapper mapper = session.getMapper(StatisticsMapper.class);
            Date maxDate = mapper.getStatisticsMaxDate();
            System.out.println(simpleDateFormat.format(maxDate));
            Long id = 17611L;
            StatisticsInfo statisticsInfo = mapper.fetchInfoById(id);
            System.out.println(statisticsInfo.getStoreName());
            StatisticsInfo sta = mapper.fetchInfoById(null);
            if(sta!=null){
                System.out.println(sta.getStoreName());
            }
            System.out.println("1111111111111111111111");
            System.out.println("1111111111111111111111");
            System.out.println("1111111111111111111111");
            System.out.println("1111111111111111111111");
            System.out.println("1111111111111111111111");
        } finally {
            session.close();
        }
    }
}
