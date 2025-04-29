package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66605MessageInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip66605MessageInfo")

@Data
public class Ip66605MessageInfo extends Ip66605MessageInfoSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip66605WriteRecs = Field.fillLowValue(1);

						@Getter @Setter private char[] ip66605DoesTagTableExist = Field.fillLowValue(1);
				@Getter @Setter private Ip66605IpmFileInformation ip66605IpmFileInformation = new Ip66605IpmFileInformation();
	
	/**
	* Constructor for Ip66605MessageInfo
	**/
    public Ip66605MessageInfo() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp66605IpmFileInformation().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip66605MessageInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66605WriteRecs(CONSTANTS.SPACE);
         setIp66605DoesTagTableExist(CONSTANTS.SPACE);
          getIp66605IpmFileInformation().initialize();
     
   }


}
  
