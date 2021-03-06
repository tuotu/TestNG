package core.process;

/**
 * Created by zhyang on 2015/3/3 0003.
 */
public enum StatusEnum {
	/**
	 * 成功
	 */
	SUCCESS ("success", "成功"),
	/**
	 * 失败
	 */
	FAIL ("fail", "失败"),
	/**
	 * 处理中
	 */
	PROCESSING ("processing", "处理中"),
	/**
	 * 未知
	 */
	UNKNOWN ("unknown", "未知"),

	/**
	 *快捷一步成功
	 */
	QUICK_ONE_SUCCESS ("success", "成功");
	/**
	 * 枚举值
	 */
	private final String code;
	
	/**
	 * 枚举描述
	 */
	private final String message;
	
	/**
	 * @param code    枚举值
	 * @param message 枚举描述
	 */
	private StatusEnum (String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode () {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage () {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code () {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message () {
		return message;
	}
	
	/**
	 * 通过枚举&lt;code&gt;code&lt;/code&gt;获得枚举
	 *
	 * @param code
	 * @return StatusEnum
	 */
	public static StatusEnum getByCode (String code) {
		for (StatusEnum _enum : values ()) {
			if (_enum.getCode ().equalsIgnoreCase (code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 *
	 * @return List<StatusEnum>
	 */
	public static java.util.List<StatusEnum> getAllEnum () {
		java.util.List<StatusEnum> list = new java.util.ArrayList<StatusEnum> (values ().length);
		for (StatusEnum _enum : values ()) {
			list.add (_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 *
	 * @return List&lt;String&gt;
	 */
	public static java.util.List<String> getAllEnumCode () {
		java.util.List<String> list = new java.util.ArrayList<String> (values ().length);
		for (StatusEnum _enum : values ()) {
			list.add (_enum.code ());
		}
		return list;
	}
	
	/**
	 * 通过code获取msg
	 *
	 * @param code 枚举值
	 * @return
	 */
	public static String getMsgByCode (String code) {
		if (code == null) {
			return null;
		}
		StatusEnum _enum = getByCode (code);
		if (_enum == null) {
			return null;
		}
		return _enum.getMessage ();
	}
	
	/**
	 * 获取枚举code
	 *
	 * @param _enum
	 * @return
	 */
	public static String getCode (StatusEnum _enum) {
		if (_enum == null) {
			return null;
		}
		return _enum.getCode ();
	}

	public boolean isInList(StatusEnum... enums){
		for (StatusEnum _enum : enums) {
			if (this ==_enum){
				return true;
			}
		}
		return false;
	}
}
