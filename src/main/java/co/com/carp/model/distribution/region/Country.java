package co.com.carp.model.distribution.region;

import java.util.HashSet;
import java.util.Set;

public class Country extends DistributionModel {
    
    private Set<State> states;

    /**
     * @return the states
     */
    public Set<State> getStates() {
        return states;
    }

    /**
     * @param states the states to set
     */
    public void setStates(Set<State> states) {
        this.states = states;
    }
    
    /**
     * Adds new state to state set.
     * 
     * @param state New state to be added.
     */
    public void addState(State state) {
        if (states == null) {
            states = new HashSet<>();
        }
        states.add(state);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((states == null) ? 0 : states.hashCode());
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
        if (!(obj instanceof Country))
            return false;
        Country other = (Country) obj;
        if (states == null) {
            if (other.states != null)
                return false;
        } else if (!states.equals(other.states))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Country [states=" + states + ", toString()=" + super.toString() + "]";
    }
}
