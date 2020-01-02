package cn.com.wjz.wei.weixing.mo;

import cn.com.wjz.wei.weixing.vo.UrlData;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by weijiuzhu on 2019/8/7.
 */
public class TestGET {


    public String getToken(String corpId, String corpSecret) throws IOException {

        TestGET sw = new TestGET();

        UrlData uData = new UrlData();

        String s = uData.setGetTokenUrl(corpId, corpSecret);
        System.out.println("获取"+s);

        String resp = sw.toAuth(uData.getGetTokenUrl());//就是按照GET方式拼接了字符串得到url



        System.out.println(resp);

        return resp;

    }



    protected String toAuth(String Get_Token_Url) throws IOException {


        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(Get_Token_Url);

        CloseableHttpResponse response = httpClient.execute(httpGet);

        System.out.println(response.toString());

        String resp;

        try {

            HttpEntity entity = response.getEntity();

            System.out.println(response.getAllHeaders());

            resp = EntityUtils.toString(entity, "utf-8");

            EntityUtils.consume(entity);

        } finally {

            response.close();

        }



        return resp;

    }

}
