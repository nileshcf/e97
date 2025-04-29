package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10aSGrp is used to handle fields declared in it
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

            @Component("global_wse10aSGrp")

@Data
public class Wse10aSGrp extends Wse10aSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller012 = Field.fillLowValue(3);

						@Getter @Setter private char[] wse10aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse10aSGrp
	**/
    public Wse10aSGrp() {
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
	 * 	initializes Wse10aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller012(CONSTANTS.SPACE_3);
         setWse10aS(CONSTANTS.SPACE_60);
   }


}
  
