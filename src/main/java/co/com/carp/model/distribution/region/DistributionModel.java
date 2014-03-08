package co.com.carp.model.distribution.region;

import java.util.Calendar;
import java.util.Date;

public abstract class DistributionModel {
    
    private Integer identifier;
    
    private String code;
    
    private String name;
    
    private Date insertedDate;
    
    private Date updatedDate;
    
    private boolean enabled;
    
    public DistributionModel() {
        super();
    }
    
    public DistributionModel(Integer identifier, String code, String name) {
        super();
        this.identifier = identifier;
        this.code = code;
        this.name = name;
        Date initialDate = Calendar.getInstance().getTime();
        this.insertedDate = initialDate;
        this.updatedDate = initialDate;
        this.enabled = true;
    }
    
    public DistributionModel(Integer identifier, String code, String name,
            Date insertedDate, Date updatedDate, boolean enabled) {
        super();
        this.identifier = identifier;
        this.code = code;
        this.name = name;
        this.insertedDate = insertedDate;
        this.updatedDate = updatedDate;
        this.enabled = enabled;
    }
    
    /**
     * @return the identifier
     */
    public Integer getIdentifier() {
        return identifier;
    }    

    /**
     * @param identifier the identifier to set
     */
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the insertedDate
     */
    public Date getInsertedDate() {
        return insertedDate;
    }

    /**
     * @param insertedDate the insertedDate to set
     */
    public void setInsertedDate(Date insertedDate) {
        this.insertedDate = insertedDate;
    }

    /**
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * @return the enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + (enabled ? 1231 : 1237);
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        result = prime * result + ((insertedDate == null) ? 0 : insertedDate.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((updatedDate == null) ? 0 : updatedDate.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof DistributionModel))
            return false;
        DistributionModel other = (DistributionModel) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (enabled != other.enabled)
            return false;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        if (insertedDate == null) {
            if (other.insertedDate != null)
                return false;
        } else if (!insertedDate.equals(other.insertedDate))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (updatedDate == null) {
            if (other.updatedDate != null)
                return false;
        } else if (!updatedDate.equals(other.updatedDate))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DistributionModel [identifier=" + identifier + ", code=" + code + ", name=" + name + ", insertedDate=" + insertedDate + ", updatedDate="
                + updatedDate + ", enabled=" + enabled + "]";
    }
}
