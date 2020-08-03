package com.alieducation.dto;

import lombok.Data;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/7/9 8:59
 */

public class Page {

    /**
     * 第几页
     */
    private int page;

    /**
     * 每页的大小  默认10
     */
    private int offset;

    /**
     * 有功多少条数据
     */
    private int count;

    public Integer getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        if (page <= 0) {
            this.page = 1;
        }else{
            this.page = page;
        }
    }

    public Integer getSize() {
        return offset;
    }

    public void setSize(int offset) {
        if (offset <= 0) {
            this.offset = offset;
        }else {
            this.offset = offset;
        }
    }
}

