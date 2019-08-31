# 微信登录分享不回调WXEntryActivity

先讲讲我的经历吧，公司要在老的项目的基础上新开一个项目，新的项目也要接入微信分享登录。我就很开心的创建了项目，
随便命名了包名，后面公司修改了包名，我就通过配置applicationId来实现修改包名，接入微信分享之后，测试能够调起微信分享，可是拿不到回调
一遍遍对了官方demo，该有的wxapi目录都有，可是回调就是没有。之后就我就把官方的demo复制到这个项目里面来了。

可以看到我的包名`package="com.wxz.share"`，而在`build.gradle`配置的`applicationId "net.sourceforge.simcpux"`(这个是微信官方demo的包名)，签名也是用的微信demo的签名
最开始我`WXEntryActivity`的路径是`com.wxz.share.wxapi.WXEntryActivity`，测试无能如何是收不到微信回调的，后面我就想是不是路径搞错了，我尝试把`WXEntryActivity`放到`net.sourceforge.simcpux.wxapi.WXEntryActivity`.
测试一波，MD，竟然收到回调了，卧槽，内心又喜又气呀！！！折腾了好久呀

--------

解决方案总结

**WXEntryActivity.java必须放在配置的applicationId的路径下，即`<applicationId>.wxapi.WXEntryActivity`下，特别是那些packageName和applicationId不相同的应用**

-----

致敬前辈，砥砺前行！愿永无bug！

------