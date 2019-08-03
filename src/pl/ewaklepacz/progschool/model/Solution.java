package pl.ewaklepacz.progschool.model;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Objects;

public class Solution {
    private int id;
    private Date created;
    private Date updated;
    private String description;
     public Solution (){

     }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", created=" + created +
                ", updated=" + updated +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return id == solution.id &&
                Objects.equals(created, solution.created) &&
                Objects.equals(updated, solution.updated) &&
                Objects.equals(description, solution.description);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
