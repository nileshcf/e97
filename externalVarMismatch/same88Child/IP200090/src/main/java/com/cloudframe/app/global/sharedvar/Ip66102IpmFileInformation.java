package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102IpmFileInformation is used to handle fields declared in it
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

            @Component("global_ip66102IpmFileInformation")

@Data
public class Ip66102IpmFileInformation extends Ip66102IpmFileInformationSerialized  implements InitializingBean {
   

								@Getter @Setter private long ip66102IpmMsgLngth;

								@Getter @Setter private int ip66102IpmMsgsRead;

								@Getter @Setter private int ip66102IpmMsgsWritten;

						@Getter @Setter private char[] ip66102IpmFileStatus = Field.fillLowValue(2);

						@Getter @Setter private char[] ip66102IsIpmFileFinished = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66102IpmFileInformation
	**/
    public Ip66102IpmFileInformation() {
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
	 * 	initializes Ip66102IpmFileInformation
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp66102IpmMsgLngth(0);
                     setIp66102IpmMsgsRead(0);
                     setIp66102IpmMsgsWritten(0);
         setIp66102IpmFileStatus(CONSTANTS.SPACE_2);
         setIp66102IsIpmFileFinished(CONSTANTS.SPACE);
   }


}
  
