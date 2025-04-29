package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7051f4TableKey extends Ip7051f4TableKeySerialized { 
   

						@Getter @Setter private char[] ip7051f4EnvCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip7051f4CloneOwnerId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip7051f4Cpu = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7051f4HostPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip7051f4ServCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7051f4FuncCd = Field.fillLowValue(4);

								@Getter @Setter private int ip7051f4QueueNum;
	
	/**
	* Constructor for Ip7051f4TableKey
	**/
    public Ip7051f4TableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7051f4TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051f4TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7051f4TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051f4EnvCd(CONSTANTS.SPACE_3);
         setIp7051f4CloneOwnerId(CONSTANTS.SPACE_3);
         setIp7051f4Cpu(CONSTANTS.SPACE_4);
         setIp7051f4HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp7051f4ServCd(CONSTANTS.SPACE_4);
         setIp7051f4FuncCd(CONSTANTS.SPACE_4);
                     setIp7051f4QueueNum(0);
   }


}
  
