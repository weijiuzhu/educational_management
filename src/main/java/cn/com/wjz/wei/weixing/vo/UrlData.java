package cn.com.wjz.wei.weixing.vo;

import org.springframework.stereotype.Component;

/**
 * Created by weijiuzhu on 2019/8/7.
 */
@Component
public class UrlData {

    String corpId;
    String corpSecret;
    String getTokenUrl;
    String sendMessageUrl;
    public String getCorpId() {
        return corpId;
    }
    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }
    public String getCorpSecret() {
        return corpSecret;
    }
    public void setCorpSecret(String corpSecret) {
        this.corpSecret = corpSecret;
    }
    public String setGetTokenUrl(String corpid, String corpsecret) {
        return this.getTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + corpid + "&secret=" + corpsecret;
    }
    public String getGetTokenUrl() {
        return getTokenUrl;    }
    public String getSendMessageUrl() {
        sendMessageUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
        return sendMessageUrl;
    }

}
