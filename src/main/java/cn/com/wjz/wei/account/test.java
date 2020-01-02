package cn.com.wjz.wei.account;

/**
 * Created by weijiuzhu on 2019/6/10.
 */
public class test {
    public static void main(String[] args) throws CloneNotSupportedException {

        AccountVO accountVO = new AccountVO();
        AccountVO accountVO1 = (AccountVO) accountVO.clone();
        System.out.println(accountVO == accountVO1);
    }
}
