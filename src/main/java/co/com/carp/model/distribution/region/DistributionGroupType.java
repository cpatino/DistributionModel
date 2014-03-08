package co.com.carp.model.distribution.region;

public class DistributionGroupType extends DistributionModel {
    
    private Boolean allowClients;

    /**
     * @return the allowClients
     */
    public Boolean getAllowClients() {
        return allowClients;
    }

    /**
     * @param allowClients the allowClients to set
     */
    public void setAllowClients(Boolean allowClients) {
        this.allowClients = allowClients;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((allowClients == null) ? 0 : allowClients.hashCode());
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
        if (!(obj instanceof DistributionGroupType))
            return false;
        DistributionGroupType other = (DistributionGroupType) obj;
        if (allowClients == null) {
            if (other.allowClients != null)
                return false;
        } else if (!allowClients.equals(other.allowClients))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "DistributionGroupType [allowClients=" + allowClients + ", toString()=" + super.toString() + "]";
    }

}
