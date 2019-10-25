package com.confirmation.exception;



public enum ResultCode {
	/**
	 * rules:
	 * E000000：代表成功
	 * E999998：保留
	 * E999999：保留
	 * 1.响应码以E开头
	 * 2.E01代表的是用户模块
	 * 3.E02代表的是代表的是艺术品仓库模块
	 * 4.E03代表的是艺术品分类模块
	 * 5.E04代表的是艺术品的附件模块
	 * 6.E05代表专家的鉴评
	 */

    SUCCESS("E000000"),
    USER_NAME_ALREADY_EXIST("E010001"),//用户名已经存在
    USER_NOT_FOUND("E010002"),//用户不存在
    USER_PASSWORD_ERROR("E010003"),//用户密码错误
    USER_NEW_OWNERID_IS_NOT_EMPTY("E010004"),//在艺术品变时,新持有者的ID不能为空
    
    
    
    
    ART_NAME_IS_NOT_EMPTY("E020001"),//艺术品名称不能为空
    ART_CLASS_ID_IS_NOT_EMPTY("E020002"),//艺术品分类不能为空
    REGISTER_USER_IS_NOT_EMPTY("E020003"),//艺术登记用户不能为空
    ART_IMG_IS_NOT_EMPTY("E020004"),//艺术品照片不能为空
    ART_CERT_IMG_IS_NOT_EMPTY("E020005"),//鉴定书图片不能为空
    ART_ID_IS_NOT_EMPTY("E020006"),//艺术品的Id不能为空
    ART_BANK_IS_NOT_FOUND("E020007"),//艺术品没有找到
    ART_BANK_IS_NOT_REGISTER("E020008"),//艺术品没有注册过
    
    
    ART_COMMENT_IS_NOT_EMPTY("E020009"),//专家评鉴不能为空
    ART_APPRAISAL_DATA_IS_NOT_EMPTY("E020010"),//鉴定数据不能为空
    ART_SAVE_CHANGERECORD_IS_FAIL("E020011"),//保存变更记录失败
    ART_SAVE_FINGER_PRINT_DATA_IS_FAIL("E020012"),//保存鉴真数据失败
    ART_REGISTER_IS_FAIL("E020013"),//艺术品注册失败
    
    
    
    
    EXPERT_COMMENT_IS_FAIL("E050001"),
    
    
    
    
    NUMBER_FORMAT_ERROR("E999998"),
    UNKOWN_ERROR("E999999");  
    
    private String code;
    
    private ResultCode(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    

}
