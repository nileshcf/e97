package com.cloudframe.app.global.sharedvar;

/**
*  The class CurrentTableKey800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_currentTableKey800")

@Data
public class CurrentTableKey800 extends CurrentTableKey800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] currentTableId800 = Field.fillLowValue(8);

						@Getter @Setter private char[] currentEffectiveDate800 = Field.fillLowValue(10);
	
	/**
	* Constructor for CurrentTableKey800
	**/
    public CurrentTableKey800() {
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
	 * 	initializes CurrentTableKey800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCurrentTableId800(CONSTANTS.SPACE_8);
         setCurrentEffectiveDate800(CONSTANTS.SPACE_10);
   }


}
  
