package hxk.test;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;

/**
 * @author Administrator
 * @description 一个拥有多种加密方法的工具类
 * http://commons.apache.org/proper/commons-codec/apidocs/org/apache/commons/codec/digest/DigestUtils.html
 *2015-5-27  上午11:40:02
 */
public class DigestUtil {
    static String str = "123456";
    //正常的MD5加密
    public static void MD5(){
	String md5 = new String(DigestUtils.md5Hex(str));
	System.out.println(md5);
    }
    
    //各种数字简单感觉是生成的码的长度不同
    public static void sha(){
	String sha1 = new String(DigestUtils.sha1Hex(str));
	String sha256 = new String(DigestUtils.sha256Hex(str));
	String sha512 = new String(DigestUtils.sha512Hex(str));
	System.out.println(sha1);
	System.out.println(sha256);
	System.out.println(sha512);
    }
    
    //一个比MD5还复杂的加密
    public static void MD5Crypt(){
	System.out.println(Md5Crypt.md5Crypt(str.getBytes()));
    }
    
    public static void main(String[] args) {
	MD5Crypt();
    }
}
