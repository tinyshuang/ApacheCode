package hxk.test;


import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.net.URLCodec;

/**
 * @author Administrator
 * @description URL编码..主要用途是url在浏览器时
 *2015-5-27  下午3:05:34
 */
public class URLCodeUtil {
    
    public static void decode(){
	String str = "水货";
	try {
	    /* 结果 :
	      encode : %E6%B0%B4%E8%B4%A7
	      decode :	水货
	    */
	    URLCodec code = new URLCodec();
	    String decode = code.encode(str);
	    System.out.println(decode);
	    System.out.println(code.decode(decode));
	} catch (DecoderException e) {
	    e.printStackTrace();
	} catch (EncoderException e) {
	    e.printStackTrace();
	}
    }
    
    
    public static void main(String[] args) {
	decode();
    }
}
