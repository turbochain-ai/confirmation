package com.confirmation.util;



import java.security.MessageDigest;


public class CommonUtil
{

	public static String MD5encode(String s)
	{
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try
		{
			byte[] btInput = s.getBytes();
			MessageDigest mdInst = MessageDigest.getInstance("MD5");

			mdInst.update(btInput);

			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for(int i = 0; i < j; i++)
			{
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str).toString();
		} catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public static final String bytesToHexString(byte[] bArray)
	{
		StringBuffer sb = new StringBuffer(bArray.length);
		String sTemp;
		for(int i = 0; i < bArray.length; i++)
		{
			sTemp = Integer.toHexString(0xFF & bArray[i]);
			if(sTemp.length() < 2)
			{
				sb.append(0);
			}
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * 把16进制字符串转换成字节数组
	 * 
	 * @param hexString
	 * @return byte[]
	 */
	public static byte[] hexStringToByte(String hex)
	{
		int len = (hex.length() / 2);
		byte[] result = new byte[len];
		char[] achar = hex.toCharArray();
		for(int i = 0; i < len; i++)
		{
			int pos = i * 2;
			result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
		}
		return result;
	}

	private static int toByte(char c)
	{
		byte b = (byte) "0123456789ABCDEF".indexOf(c);
		return b;
	}

	public static void main(String[] args)
	{
		System.out.println(CommonUtil.MD5encode("caishiqiao01"));
	}


	/**
	 * byte数组转换为二进制字符串
	 * 	 
	 * **/
	public static String byteArrToBinStr(byte[] b) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			result.append(Long.toString(b[i] & 0xff, 2));
		}
		return result.toString().substring(0, result.length() - 1);
	}

	//把字节数组中的值转化成字符串
	public static String ByteTransformString(byte[]  byteArry) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<byteArry.length;i++){
			sb.append(byteArry[i]);
		}
		return sb.toString();


	}






}
