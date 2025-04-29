package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse17bS")

@Data
public class Wse17bS extends Wse17bSSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wse17bSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse17bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse17bS
	**/
    public Wse17bS() {
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
	 * 	initializes Wse17bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse17bSFld1(CONSTANTS.SPACE_30);
         setWse17bSFld2(CONSTANTS.SPACE_30);
   }


}
  
