package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf50005ClearingGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_cf50005ClearingGrp")

@Data
public class Cf50005ClearingGrp extends Cf50005ClearingGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] cf50005ClearingDtX = Field.fillLowValue(8);

								@Getter @Setter private long cf50005ClearingDtN;

						@Getter @Setter private char[] cf50005ClearingTmX = Field.fillLowValue(2);
	
	/**
	* Constructor for Cf50005ClearingGrp
	**/
    public Cf50005ClearingGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


	/**
	 * 	initializes Cf50005ClearingGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCf50005ClearingDtX(CONSTANTS.SPACE_8);
         setCf50005ClearingTmX(CONSTANTS.SPACE_2);
   }


}
  
