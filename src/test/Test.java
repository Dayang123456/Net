package test;

import main.NetStateUtil;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                NetStateUtil netStateUtil=new NetStateUtil();

                String url1="https://www.feawin.com/";//测试https
                String url2="https://p.feawin.com/";//测试https
                String url3="https://z.feawin.com/";//测试https
                String url4="https://sbdsjfweb.zwyun.bjtzh.gov.cn/";//测试https
//                String url6="https://www.baidu123.com";//测试https
//                String url7="http://www.feawin.com";//测试http

//                String url5="202.108.22.5";//测试普通ip
                System.out.println(url1+":"+netStateUtil.connectingAddress(url1));
                System.out.println(url2+":"+netStateUtil.connectingAddress(url2));
                System.out.println(url3+":"+netStateUtil.connectingAddress(url3));
                System.out.println(url4+":"+netStateUtil.connectingAddress(url4));
//                System.out.println(url6+":"+netStateUtil.connectingAddress(url6));
//                System.out.println(url7+":"+netStateUtil.connectingAddress(url7));
//                System.out.println(url5+":"+netStateUtil.connectingAddress(url5));

            }
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(runnable,1,5, TimeUnit.SECONDS);//定时器，第一个参数代表几秒后运行，第二个参数代表间隔多长时间再次运行

    }

}
