package cn.besbing.Service.Impl;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

@Service
public class DownLoadServiceImple {

    public void downLoadFile(HttpServletResponse response, FileInputStream is,final String filename) throws Exception{

        response.setContentType("application/octet-stream;charset=UTF-8");
        response.setHeader("Content-Disposition","attachment;filename="+new String(filename.getBytes("utf-8"),"iso-8859-1"));





    }


}
