package hxk.test;

import hxk.util.Syso;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/**
 * @author Administrator
 * @description hex编码  十六进制
 *2015-5-27  上午11:31:12
 */
public class HexUtil {
    public static void hex(){
	Hex hex = new Hex();
	String str = "水货";
	String encodeStr = new String(hex.encode(str.getBytes()));
	try {
	    String decodeStr = new String(hex.decode(encodeStr.getBytes()));
	    Syso.out(str, encodeStr, decodeStr);
	} catch (DecoderException e) {
	    e.printStackTrace();
	}
	String staticEncodeStr = new String(Hex.encodeHex(str.getBytes()));
	System.out.println("---staticHex编码后--- : " + staticEncodeStr);
	System.out.println("事实证明对象的encode方法和类的静态encodeHex效果是一样的...");
    }
    
    public static void main(String[] args) {
	hex();
    }
}
