package org.cinema.page;

/**
 * Created by LIANG on 2017/4/5.
 */
public class PageBean {

    private int allRows; //总记录数

    private int totalPage; //总页数

    private int currentPage=0 ; //当前页

    private int pageSize = 2; //每页的条数


    public int getAllRows() {
        return allRows;
    }

    public void setAllRows(int allRows) {
        this.allRows = allRows;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 得到总页数
     *
     * @param 每页记录数
     * @param  总记录数
     * @return 总页数
     */
    public int getTotalPages() {
        totalPage = (allRows % pageSize == 0) ? (allRows / pageSize) : (allRows / pageSize) + 1;

        return totalPage;
    }

    /**
     * 得到当前开始记录号
     *
     * @param pageSize    每页记录数
     * @param currentPage 当前页
     * @return
     */
    public int getCurrentPageOffset(int pageSize, int currentPage) {
        int offset = pageSize * (currentPage - 1);

        return offset;

    }

    /**
     * 得到当前页， 如果为0 则开始第一页，否则为当前页
     *
     * @param page
     * @return
     */
    public int getCurPage(int page) {
        int currentPage = (page == 0) ? 1 : page;

        return currentPage;
    }
}
