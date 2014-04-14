package allen.main;

import allen.encoding.Encoding;

/**
 * Config.
 * */
public class Config {

	/**
	 * ����֧�ֵ�������չ���롣
	 * */
	public static String[] extEncodings = Encoding.getExtEncodings();

	/**
	 * Ĭ�ϱ���.
	 * 
	 * <pre>
	 * ��Ҷ���GBK,��ȫû��������ʻ�.��Ȼ,��д����ע��Ҳ��һ����.
	 * </pre>
	 * */
	public static String Default_Encoding = extEncodings[0];
}
