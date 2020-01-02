package cn.com.wjz.wei.weixing.mo;

import cn.com.wjz.wei.weixing.vo.UrlData;
import cn.com.wjz.wei.weixing.vo.WeChatData;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by weijiuzhu on 2019/8/7.
 */
public class TestPOST {



    private CloseableHttpClient httpClient;

    private HttpPost httpPost = new HttpPost();//用于提交登陆数据

    private HttpGet httpGet = new HttpGet();//用于获得登录后的页面

    private TestGET testGET = new TestGET();



    public static final String CONTENT_TYPE = "Content-Type";

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//

    private static Gson gson = new Gson();



    public void sendTextMesg(String toUser, String contentValue) throws IOException {

        String token = testGET.getToken("wxe3e7bd2d26baa555", "b82af3bee0446197ea0574bf5ae2579b");

        String token1 = "24_iqkVyMLvigLCedq3ob7yjF_JTxMtAUioIEeArMfHz36Ff6lieeQiWMpYJI_wdixbYV2ljVeY2CstNxvsw7ysKIh3KnifBwvzp_jmKOEnEDK6LEHn1bTp97XT7qnj_uiQ0RI8smu6So16hAHqWLScADAAPW";
        String postData = createPostData(toUser, "text", 1000002, "content", contentValue);

        String response = post("utf-8", TestPOST.CONTENT_TYPE, (new UrlData()).getSendMessageUrl(), postData, token1);

        System.out.println("获取到的token======>" + token);

        System.out.println("请求数据======>" + postData);

        System.out.println("发送微信的响应数据======>" + response);

    }


    /**

     * 创建POST BODY

     */

    private String createPostData(String touser, String msgtype, int agent_id, String contentKey, String contentValue) {

        WeChatData weChatData = new WeChatData();

        weChatData.setTouser(touser);

        weChatData.setAgentid(agent_id);

        weChatData.setMsgtype(msgtype);

        Map<Object, Object> content = new HashMap<Object, Object>();

        content.put(contentKey, contentValue + "\n--------\n" + df.format(new Date()));

        weChatData.setText(content);

        System.out.println(gson.toJson(weChatData));

        return gson.toJson(weChatData);

    }



    /**

     * POST请求

     */

    private String post(String charset, String contentType, String url, String data, String token) throws IOException {

        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url + token);

        httpPost.setHeader(TestPOST.CONTENT_TYPE, contentType);

        httpPost.setEntity(new StringEntity(data, charset));

        System.out.println(httpPost);
        CloseableHttpResponse response = httpclient.execute(httpPost);

        String resp;

        try {

            HttpEntity entity = response.getEntity();

            resp = EntityUtils.toString(entity, charset);

            EntityUtils.consume(entity);

        } finally {

            response.close();

        }

        return resp;

    }


}
