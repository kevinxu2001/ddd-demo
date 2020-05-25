package com.kevin.demo.domain.credit;

import java.io.Serializable;

import com.kevin.demo.domain.Entity;
import lombok.Data;

/**
 * credit
 * @author 
 */
@Data
public class Credit implements Entity<Credit> {
    private Integer id;

    /**
     * 销售id
     */
    private Integer userid;

    /**
     * 行为id
     */
    private Integer actionid;

    /**
     * 获取的积分
     */
    private Integer creditnum;

    private static final long serialVersionUID = 1L;



    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Credit other = (Credit) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getActionid() == null ? other.getActionid() == null : this.getActionid().equals(other.getActionid()))
            && (this.getCreditnum() == null ? other.getCreditnum() == null : this.getCreditnum().equals(other.getCreditnum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getActionid() == null) ? 0 : getActionid().hashCode());
        result = prime * result + ((getCreditnum() == null) ? 0 : getCreditnum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", actionid=").append(actionid);
        sb.append(", creditnum=").append(creditnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean sameInentifyAs(Credit other) {
        return false;
    }
}