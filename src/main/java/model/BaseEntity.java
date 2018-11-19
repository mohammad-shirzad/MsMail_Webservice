package model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Column(name = "Create_Time")
    private Timestamp createTime;

    @Column(name = "Update_Time")
    private Timestamp lastChangeDate;

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Timestamp lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}
