package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TaggedRecordInfo is used to handle fields declared in it
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

            @Component("global_ip65504TaggedRecordInfo")

@Data
public class Ip65504TaggedRecordInfo extends Ip65504TaggedRecordInfoSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip65504IsFileTagged = Field.fillLowValue(1);

								@Getter @Setter private int ip65504TagTableOffset;
	
	/**
	* Constructor for Ip65504TaggedRecordInfo
	**/
    public Ip65504TaggedRecordInfo() {
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
	 * 	initializes Ip65504TaggedRecordInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp65504IsFileTagged(CONSTANTS.SPACE);
                     setIp65504TagTableOffset(0);
   }


}
  
