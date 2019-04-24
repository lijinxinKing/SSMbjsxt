package ssm.pojo;

import java.util.List;

public class PageInfo {

    private String sname;

    @Override
    public String toString() {
        return "PageInfo{" +
                "sname='" + sname + '\'' +
                ", tname='" + tname + '\'' +
                ", pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

    public PageInfo() {
    }

    public PageInfo(String sname, String tname, int pageSize, int pageNumber, long total, List<?> list) {
        this.sname = sname;
        this.tname = tname;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.total = total;
        this.list = list;
    }

    private String tname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
    //起始行
    private int pageStart;

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pegeStart) {
        this.pageStart = pageStart;
    }

    // 每页显示个数
    private int pageSize;

    // 当前第几页
    private int pageNumber;
    //
    private long total;

    private List<?> list;// 当前显示的数据结合

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
