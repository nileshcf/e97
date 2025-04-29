package com.cloudframe.app.global.sharedvar;

/**
*  The class Db85102dWorkFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_db85102dWorkFields")

@Data
public class Db85102dWorkFields extends Db85102dWorkFieldsSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] db85102dConnectStatusMap = Field.fillLowValue(5);

						@Getter @Setter private char[] db85102dCurrCollId = Field.fillLowValue(18);

						@Getter @Setter private char[] db85102dTempCollId = Field.fillLowValue(18);

						@Getter @Setter private char[] db85102dPrevCollId = Field.fillLowValue(18);

						@Getter @Setter private char[] db85102dDb2CurrServer = Field.fillLowValue(16);

						@Getter @Setter private char[] db85102dDb2User = Field.fillLowValue(8);

						@Getter @Setter private char[] db85102dDb2CurrSqlid = Field.fillLowValue(8);

						@Getter @Setter private char[] db85102dDb2cloneStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Db85102dWorkFields
	**/
    public Db85102dWorkFields() {
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
	 * 	initializes Db85102dWorkFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDb85102dConnectStatusMap(CONSTANTS.SPACE_5);
         setDb85102dCurrCollId(CONSTANTS.SPACE_18);
         setDb85102dTempCollId(CONSTANTS.SPACE_18);
         setDb85102dPrevCollId(CONSTANTS.SPACE_18);
         setDb85102dDb2CurrServer(CONSTANTS.SPACE_16);
         setDb85102dDb2User(CONSTANTS.SPACE_8);
         setDb85102dDb2CurrSqlid(CONSTANTS.SPACE_8);
         setDb85102dDb2cloneStatus(CONSTANTS.SPACE_2);
   }


}
  
