package cn.com.crtvu.weixing.vo;

import org.springframework.stereotype.Component;

/**
 * Created by weijiuzhu on 2019/8/7.
 */
@Component
public class WeChatData {
    String touser;
    String msgtype;
    int agentid;
    Object text;
    public Object getText() {
        return text;
    }
    public void setText(Object text) {
        this.text = text;
    }
    public String getMsgtype() {
        return msgtype;
    }
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
    public int getAgentid() {
        return agentid;
    }
    public void setAgentid(int agentid) {
        this.agentid = agentid;
    }
    public String getTouser() {
        return touser;
    }
    public void setTouser(String touser) {
        this.touser = touser;
    }
}

