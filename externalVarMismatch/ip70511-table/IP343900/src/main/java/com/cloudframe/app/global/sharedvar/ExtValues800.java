package com.cloudframe.app.global.sharedvar;

/**
*  The class ExtValues800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_extValues800")

@Data
public class ExtValues800 extends ExtValues800Serialized  implements InitializingBean {
   

						@Getter @Setter private char[] operationCode800 = Field.fillLowValue(2);

								@Getter @Setter private int clrCyclId800;

						@Getter @Setter private char[] updateModFileInd800 = Field.fillLowValue(3);
	
	/**
	* Constructor for ExtValues800
	**/
    public ExtValues800() {
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
	 * 	initializes ExtValues800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setOperationCode800(CONSTANTS.SPACE_2);
                     setClrCyclId800(0);
         setUpdateModFileInd800(CONSTANTS.SPACE_3);
   }


}
  
