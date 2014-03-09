package co.com.carp.model.distribution.region;

import java.util.Set;

public class DistributionGroup extends DistributionModel {
    
    private Integer parentIdentifier; 
    
    private String externalCode;
    
    private DistributionGroupType groupType;
    
    private Set<Client> client;
    
    private User user;

    /**
     * @return the parentIdentifier
     */
    public Integer getParentIdentifier() {
        return parentIdentifier;
    }

    /**
     * @param parentIdentifier the parentIdentifier to set
     */
    public void setParentIdentifier(Integer parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
    }

    /**
     * @return the externalCode
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * @param externalCode the externalCode to set
     */
    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    /**
     * @return the groupType
     */
    public DistributionGroupType getGroupType() {
        return groupType;
    }

    /**
     * @param groupType the groupType to set
     */
    public void setGroupType(DistributionGroupType groupType) {
        this.groupType = groupType;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((externalCode == null) ? 0 : externalCode.hashCode());
        result = prime * result + ((groupType == null) ? 0 : groupType.hashCode());
        result = prime * result + ((parentIdentifier == null) ? 0 : parentIdentifier.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof DistributionGroup))
            return false;
        DistributionGroup other = (DistributionGroup) obj;
        if (externalCode == null) {
            if (other.externalCode != null)
                return false;
        } else if (!externalCode.equals(other.externalCode))
            return false;
        if (groupType == null) {
            if (other.groupType != null)
                return false;
        } else if (!groupType.equals(other.groupType))
            return false;
        if (parentIdentifier == null) {
            if (other.parentIdentifier != null)
                return false;
        } else if (!parentIdentifier.equals(other.parentIdentifier))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DistributionGroup [parentIdentifier=" + parentIdentifier + ", externalCode=" + externalCode + ", groupType=" + groupType + ", toString()="
                + super.toString() + "]";
    }

	public Set<Client> getClient() {
		return client;
	}

	public void setClient(Set<Client> client) {
		this.client = client;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}