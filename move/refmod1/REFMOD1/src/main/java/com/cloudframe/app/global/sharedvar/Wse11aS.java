package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11aS is used to handle fields declared in it
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

            @Component("global_wse11aS")

@Data
public class Wse11aS extends Wse11aSSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wse11aSFld1 = Field.fillLowValue(30);

						@Getter @Setter private char[] wse11aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse11aS
	**/
    public Wse11aS() {
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
	 * 	initializes Wse11aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse11aSFld1(CONSTANTS.SPACE_30);
         setWse11aSFld2(CONSTANTS.SPACE_30);
   }


}
  
