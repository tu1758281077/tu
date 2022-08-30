package cn.ofpp;

import cn.ofpp.core.*;

/**
 * 启动类
 *
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        // new 一个 女友
        GirlFriend girlFriend = new GirlFriend("橙橙橙",
                "福建省", "福清市", "2003-05-30", "2020-01-28", "o3UFg5xzoDCwUQL5m0KIJl9sU0Ps","lRj3EnmS50w_OKSMvlS33soAT3ioQL2J4YzUMMEl3Y0");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend));

        // new 一个 男友 也可单独针对一个friend设置模板ID 以达到不同人不同消息
        BoyFriend boyFriend = new BoyFriend("图图图",
                "福建省", "福州市", "2003-10-22", "2020-01-28", "o3UFg52My3PxIEL3xVm6-ddcz7Lw", "_oeQz19DxQZd8a6-OA4H5r2aLfmkoxMa1b0nPrz9gcE");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));

        LYQFriend LYQFriend = new LYQFriend("清少年",
                "福建省", "福州市", "2003-03-16", "2080-03-16", "o3UFg54Svjb_xuyHkZ79iYNyEY3M", "V3q9QFSx7Aj5T3QAuNi_1RrcrooFyG3Y2eC5LKMvOns");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(LYQFriend));

        bbSister bbSister = new bbSister("冰冰冰",
                "福建省", "莆田市", "2002-04-14", "2080-4-14", "o3UFg59wKY2yqROxQokmZqZQjdns", "ixPBBlmqtS0bPHNso-E86Bz8iW8uZNV7atPL22DoTDs");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(bbSister));

        WLHMom WLHMom = new WLHMom("丽华",
                "福建省", "莆田市", "2003-07-08", "2080-07-08", "o3UFg52i3wALQa0dAKWpFua18544", "0q9JIwop-1mPsvyT36vVIBvDM-DXYoDzboVhh4IA2eA");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(LYQFriend));
    }

}
