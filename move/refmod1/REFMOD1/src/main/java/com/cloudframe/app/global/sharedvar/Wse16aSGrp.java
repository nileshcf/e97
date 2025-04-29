package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16aSGrp is used to handle fields declared in it
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

            @Component("global_wse16aSGrp")

@Data
public class Wse16aSGrp extends Wse16aSGrpSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] wseFiller030 = Field.fillLowValue(3);

						@Getter @Setter private char[] wse16aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse16aSGrp
	**/
    public Wse16aSGrp() {
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
	 * 	initializes Wse16aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller030(CONSTANTS.SPACE_3);
         setWse16aS(CONSTANTS.SPACE_60);
   }


}
  
