package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102NormalIpmMsgRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip66102NormalIpmMsgRedefined extends Ip66102NormalIpmMsgRedefinedSerialized { 
   

						@Getter @Setter private char[] ip66102IsTagTablePresent = Field.fillLowValue(1);

								@Getter @Setter private long ip66102TagStart;

						@Getter @Setter private char[] ip66102TaggedIpmMsg = Field.fillLowValue(32762);
	
	/**
	* Constructor for Ip66102NormalIpmMsgRedefined
	**/
    public Ip66102NormalIpmMsgRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66102NormalIpmMsgRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102NormalIpmMsgRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip66102NormalIpmMsgRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66102IsTagTablePresent(CONSTANTS.SPACE);
                     setIp66102TagStart(0);
         setIp66102TaggedIpmMsg(CONSTANTS.SPACE_32762);
   }


}
  
