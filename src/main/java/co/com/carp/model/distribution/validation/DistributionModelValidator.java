package co.com.carp.model.distribution.validation;

import co.com.carp.model.distribution.region.DistributionModel;

public class DistributionModelValidator  {
    private DistributionModel dModel;
    
	public DistributionModelValidator(DistributionModel dModel){
		
		this.dModel = dModel;
	}
	
	public boolean validator(){
		
		
		if ((dModel.getIdentifier()!= null && dModel.getIdentifier() != 0)
				&&  (!dModel.getName().isEmpty() && dModel.getName() != null)
				&&  (dModel.getInsertedDate()!=null && !dModel.getInsertedDate().equals("")) 
				&& (!dModel.getCode().isEmpty() && dModel.getCode()!= null) 
				&&  (!dModel.getUpdatedDate().equals("") && dModel.getUpdatedDate() != null)){
			
			return  true;
		}
		
		return false;
	}
	
}
