package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip5000ParameterMasterRec is used to handle fields declared in it
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

            @Component("global_ip5000ParameterMasterRec")

@Data
public class Ip5000ParameterMasterRec extends Ip5000ParameterMasterRecSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip5000EffectiveDate = Field.fillLowValue(10);

						@Getter @Setter private char[] ip5000ActionCode = Field.fillLowValue(1);
				@Getter @Setter private Ip5000ParameterMasterData ip5000ParameterMasterData = new Ip5000ParameterMasterData();
	
	/**
	* Constructor for Ip5000ParameterMasterRec
	**/
    public Ip5000ParameterMasterRec() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp5000ParameterMasterData().setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip5000ParameterMasterRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp5000EffectiveDate(CONSTANTS.SPACE_10);
         setIp5000ActionCode(CONSTANTS.SPACE);
          getIp5000ParameterMasterData().initialize();
     
   }


}
  
