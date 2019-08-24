package cn.com.crtvu.weixing;

import cn.com.crtvu.weixing.mo.TestPOST;

import java.io.IOException;

/**
 * Created by weijiuzhu on 2019/8/7.
 */
public class test {

    public static void main(String[] args) throws IOException {

        TestPOST testPOST = new TestPOST();
        testPOST.sendTextMesg("oiRtgwWaW5cIHSfPVR7ZdIvfFV_U", "22222");

    }
}
