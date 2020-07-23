package pojo;

/**
 * @author lifei
 * @date 2020/7/23 15:23
 */
public class Employee {
    private Integer eid;
    private String  ename;
    private Integer age;
    private String sex;

    public Employee() {
    }

    public Employee(Integer eid, String ename, Integer age, String sex) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
        this.sex = sex;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
