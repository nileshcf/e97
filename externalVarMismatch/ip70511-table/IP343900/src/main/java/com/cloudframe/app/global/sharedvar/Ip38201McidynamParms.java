package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201McidynamParms is used to handle fields declared in it
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

            @Component("global_ip38201McidynamParms")

@Data
public class Ip38201McidynamParms extends Ip38201McidynamParmsSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip38201Function = Field.fillLowValue(1);

						@Getter @Setter private char[] ip38201Dd = Field.fillLowValue(8);

						@Getter @Setter private char[] ip38201Dsn = Field.fillLowValue(44);
				@Getter @Setter private Ip38201Disposition ip38201Disposition = new Ip38201Disposition();
				@Getter @Setter private Ip38201AllocateParms ip38201AllocateParms = new Ip38201AllocateParms();

						@Getter @Setter private char[] ip38201ReturnCode = Field.fillLowValue(4);

						@Getter @Setter private char[] ip38201Filler = Field.fillLowValue(25);
	
	/**
	* Constructor for Ip38201McidynamParms
	**/
    public Ip38201McidynamParms() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp38201Disposition().setParent(this,getStartOffset() + 53);
					getIp38201AllocateParms().setParent(this,getStartOffset() + 56);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip38201McidynamParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201Function(CONSTANTS.SPACE);
         setIp38201Dd(CONSTANTS.SPACE_8);
         setIp38201Dsn(CONSTANTS.SPACE_44);
          getIp38201Disposition().initialize();
     
          getIp38201AllocateParms().initialize();
     
         setIp38201ReturnCode(CONSTANTS.SPACE_4);
         setIp38201Filler(CONSTANTS.SPACE_25);
   }


}
  
