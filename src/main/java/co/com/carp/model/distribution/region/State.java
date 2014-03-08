package co.com.carp.model.distribution.region;

import java.util.HashSet;
import java.util.Set;

public class State extends DistributionModel {
    
    private Set<City> cities;

    /**
     * @return the cities
     */
    public Set<City> getCities() {
        return cities;
    }

    /**
     * @param cities the cities to set
     */
    public void setCities(Set<City> cities) {
        this.cities = cities;
    }
    
    /**
     * Adds new city to city set.
     * 
     * @param city New city to be added.
     */
    public void addCity(City city) {
        if (cities == null) {
            cities = new HashSet<>();
        }
        cities.add(city);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cities == null) ? 0 : cities.hashCode());
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
        if (!(obj instanceof State))
            return false;
        State other = (State) obj;
        if (cities == null) {
            if (other.cities != null)
                return false;
        } else if (!cities.equals(other.cities))
            return false;
        return true;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "State [cities=" + cities + ", toString()=" + super.toString() + "]";
    }
}
