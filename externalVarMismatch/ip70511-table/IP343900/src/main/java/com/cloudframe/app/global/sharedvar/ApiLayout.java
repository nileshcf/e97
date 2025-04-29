package com.cloudframe.app.global.sharedvar;

/**
*  The class ApiLayout is used to handle fields declared in it
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

            @Component("global_apiLayout")

@Data
public class ApiLayout extends ApiLayoutSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] actnCd100 = Field.fillLowValue(1);

								@Getter @Setter private short queryNo;

								@Getter @Setter private long noOfRows;

						@Getter @Setter private char[] apiStatus100 = Field.fillLowValue(1);

						@Getter @Setter private char[] apiSwitch100 = Field.fillLowValue(1);

						@Getter @Setter private char[] abendSwitch100 = Field.fillLowValue(1);

						@Getter @Setter private char[] isItConnectedToDb2100 = Field.fillLowValue(1);

						@Getter @Setter private char[] isItNull100 = Field.fillLowValue(1);
	
	/**
	* Constructor for ApiLayout
	**/
    public ApiLayout() {
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
	 * 	initializes ApiLayout
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setActnCd100(CONSTANTS.SPACE);
         	setQueryNo((short)0);
                     setNoOfRows(0);
         setApiStatus100(CONSTANTS.SPACE);
         setApiSwitch100(CONSTANTS.SPACE);
         setAbendSwitch100(CONSTANTS.SPACE);
         setIsItConnectedToDb2100(CONSTANTS.SPACE);
         setIsItNull100(CONSTANTS.SPACE);
   }


}
  
