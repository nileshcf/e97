package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08151ReturnParms is used to handle fields declared in it
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

            @Component("global_ip08151ReturnParms")

@Data
public class Ip08151ReturnParms extends Ip08151ReturnParmsSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip08151ReturnPrtnNbr = Field.fillLowValue(3);

								@Getter @Setter private short ip08151ReturnAcctNbrL;
	
	/**
	* Constructor for Ip08151ReturnParms
	**/
    public Ip08151ReturnParms() {
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
	 * 	initializes Ip08151ReturnParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08151ReturnPrtnNbr(CONSTANTS.SPACE_3);
         	setIp08151ReturnAcctNbrL((short)0);
   }


}
  
