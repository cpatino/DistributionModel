package co.com.carp.model.distribution.region;

import java.util.HashSet;
import java.util.Set;

public class City extends DistributionModel {
    
    private Set<DistributionGroup> groups;

    /**
     * @return the groups
     */
    public Set<DistributionGroup> getGroups() {
        return groups;
    }

    /**
     * @param groups the groups to set
     */
    public void setGroups(Set<DistributionGroup> groups) {
        this.groups = groups;
    }
    
    /**
     * Adds new distribution group to distribution group set.
     * 
     * @param distributionGroup New distribution group to be added.
     */
    public void addGroup(DistributionGroup group) {
        if (groups == null) {
            groups = new HashSet<>();
        }
        groups.add(group);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((groups == null) ? 0 : groups.hashCode());
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
        if (!(obj instanceof City))
            return false;
        City other = (City) obj;
        if (groups == null) {
            if (other.groups != null)
                return false;
        } else if (!groups.equals(other.groups))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "City [groups=" + groups + ", toString()=" + super.toString() + "]";
    }    
}