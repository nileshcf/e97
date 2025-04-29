package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprControlBlock is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_seprControlBlock")

@Data
public class SeprControlBlock extends SeprControlBlockSerialized  implements InitializingBean {
   

								@Getter @Setter private int seprReturnCode;

						@Getter @Setter private char[] seprReturnDesc = Field.fillLowValue(20);

						@Getter @Setter private char[] seprDe48Sw = Field.fillLowValue(1);

								@Getter @Setter private int seprDataLength;

						@Getter @Setter private char[] seprBadId = Field.fillLowValue(3);

						@Getter @Setter private char[] seprBadLength = Field.fillLowValue(3);

						@Getter @Setter private char[] seprTccCd = Field.fillLowValue(1);

								@Getter @Setter private int seprDataAddr;

								@Getter @Setter private int seprDataPtr;
	
	/**
	* Constructor for SeprControlBlock
	**/
    public SeprControlBlock() {
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
	 * 	initializes SeprControlBlock
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSeprReturnCode(0);
         setSeprReturnDesc(CONSTANTS.SPACE_20);
         setSeprDe48Sw(CONSTANTS.SPACE);
                     setSeprDataLength(0);
         setSeprBadId(CONSTANTS.SPACE_3);
         setSeprBadLength(CONSTANTS.SPACE_3);
         setSeprTccCd(CONSTANTS.SPACE);
                     setSeprDataAddr(0);
   }


}
  
