package co.com.carp.model.distribution.test;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.Test;

import co.com.carp.model.distribution.region.City;
import co.com.carp.model.distribution.validation.DistributionModelValidator;

public class JUDistributionValidator {

	@Test
	public void test() {
		City city = new City();
		city.setCode("9999");
		city.setIdentifier(1111);
		city.setInsertedDate(new Date());
		city.setName("juan");
		city.setUpdatedDate(new Date());
	
		
		DistributionModelValidator mValidator = new DistributionModelValidator(city);
		try {
			if (!mValidator.validator()) {
				fail("Object was not initialized correctly");
			}
		} catch (Exception ex) {
			fail("Not yet implemented");
		}
		
	}

}
