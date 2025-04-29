package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pmrTableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7051pmrTableKey extends Ip7051pmrTableKeySerialized { 
   

						@Getter @Setter private char[] ip7051pmrEnvCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip7051pmrCloneOwnerId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip7051pmrCpu = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7051pmrHostPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip7051pmrServCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7051pmrFuncCd = Field.fillLowValue(4);

								@Getter @Setter private int ip7051pmrQueueNum;
	
	/**
	* Constructor for Ip7051pmrTableKey
	**/
    public Ip7051pmrTableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7051pmrTableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pmrTableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7051pmrTableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pmrEnvCd(CONSTANTS.SPACE_3);
         setIp7051pmrCloneOwnerId(CONSTANTS.SPACE_3);
         setIp7051pmrCpu(CONSTANTS.SPACE_4);
         setIp7051pmrHostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp7051pmrServCd(CONSTANTS.SPACE_4);
         setIp7051pmrFuncCd(CONSTANTS.SPACE_4);
                     setIp7051pmrQueueNum(0);
   }


}
  
