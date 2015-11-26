package hxk.test;

import hxk.util.Syso;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Encoder;

/**
 * @author Administrator
 * @description Base64 编解码 : Base64内容传送编码被设计用来把任意序列的8位字节描述为一种不易被人直接识别的形式。
 * 用处是 : 这种加密方式主要就是“防君子不防小人”。即达到一眼望去完全看不出内容即可。 
 * 还可以转码图片,用来展示图片..减少http请求   --> 转图片使用 百度查找"图片转base64"工具
 *2015-5-27  上午11:22:33
 */
public class Base64Util {
    public static void base64(){
	Base64 base64 = new Base64();
	String str = "水货";
	String encodeStr = new String(base64.encode(str.getBytes()));
	String decodeStr = new String(base64.decode(encodeStr.getBytes()));
	Syso.out(str, encodeStr, decodeStr);
    }
    
    
    /**
     * @description 将一个图片转码为字符串,直接在浏览器可以访问	
     *2015-5-27  下午4:28:16
     *返回类型:String
     */
    public static String getImageStr(String imgFilePath) {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理  
	byte[] data = null;  
	  
	// 读取图片字节数组  
	try {  
    	   InputStream in = new FileInputStream(imgFilePath);  
    	   data = new byte[in.available()];  
    	   in.read(data);  
    	   in.close();  
	} catch (IOException e) {  
	   e.printStackTrace();  
	}  
	
	// 对字节数组Base64编码  
	BASE64Encoder encoder = new BASE64Encoder();  
	return "data:image/gif;base64,"+encoder.encode(data);// 返回Base64编码过的字节数组字符串  
	}  
    
    public static void main(String[] args) throws IOException {
	System.out.println(getImageStr("f://1.png"));;
    }
}
