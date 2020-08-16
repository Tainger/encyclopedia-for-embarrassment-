package com.alieducation.choushiEnum;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/16 14:21
 */
public enum  LikeEnum {

    /**
     * 喜欢
     */
    like(1),
    /**
     * 冷漠
     */
    indiffent(0),
    /**
     * 不喜欢
     */
    unLike(2),

    /**
     * 影响函数
     */
    workCount(1);

    private Integer type;

    LikeEnum(int i) {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
