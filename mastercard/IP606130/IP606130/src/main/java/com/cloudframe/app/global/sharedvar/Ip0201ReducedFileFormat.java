package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0201ReducedFileFormat is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip0201ReducedFileFormat")

@Data
public class Ip0201ReducedFileFormat extends Ip0201ReducedFileFormatSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip0201EffectiveDate = Field.fillLowValue(5);

						@Getter @Setter private char[] ip0201EffectiveHour = Field.fillLowValue(2);

						@Getter @Setter private char[] ip0201ActionCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0201TblSubId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip0201TableData = Field.fillLowValue(32745);
	
	/**
	* Constructor for Ip0201ReducedFileFormat
	**/
    public Ip0201ReducedFileFormat() {
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
	 * 	initializes Ip0201ReducedFileFormat
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0201EffectiveDate(CONSTANTS.SPACE_5);
         setIp0201EffectiveHour(CONSTANTS.SPACE_2);
         setIp0201ActionCode(CONSTANTS.SPACE);
         setIp0201TblSubId(CONSTANTS.SPACE_3);
         setIp0201TableData(CONSTANTS.SPACE_32745);
   }


}
  
