package com.zhou.service;

import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhous
 * @create 2019-08-27 11:32
 */
public class FtpClient {

    @Test
    public void test() throws IOException {
        FTPClient ftp = new FTPClient();
        //设置ip和端口,写在用户名和密码上面
        ftp.connect("192.168.216.135", 21);
        //设置用户名和密码
        ftp.login("ftpuser", "tiger");
        //设置文件类型
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
        InputStream is = new FileInputStream("D:/myStudy/bigMan.jpg");
        //第一个参数存储时名称
        ftp.storeFile("bigMan.jpg", is);
        //退出
        ftp.logout();

    }
}
