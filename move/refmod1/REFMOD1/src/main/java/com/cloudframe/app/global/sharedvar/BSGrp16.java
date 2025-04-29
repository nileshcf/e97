package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp16 is used to handle fields declared in it
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

            @Component("global_bSGrp16")

@Data
public class BSGrp16 extends BSGrp16Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] fillerWs031 = Field.fillLowValue(3);

						@Getter @Setter private char[] bS16 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp16
	**/
    public BSGrp16() {
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
	 * 	initializes BSGrp16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs031(CONSTANTS.SPACE_3);
         setBS16(CONSTANTS.SPACE_70);
   }


}
  
