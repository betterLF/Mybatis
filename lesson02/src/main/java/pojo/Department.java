package pojo;

/**
 * @author lifei
 * @date 2020/7/23 15:24
 */
public class Department {
    private Integer did;
    private String dname;

    public Department() {
    }

    public Department(Integer did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
