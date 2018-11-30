package com.yj.demo1128.util;
public class
PageBean {
    // 两页两数
    private Integer pageNo;
    private Integer totalPage;
    private Integer pageSize;
    private Integer totalCount;
    private Integer startRow;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public PageBean() {
    }

    public PageBean(Integer pageNo, Integer pageSize, Integer totalCount) {
        this.pageNo = pageNo;
        this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize
                : totalCount / pageSize + 1;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.startRow = (pageNo - 1) * pageSize;
    }

}
