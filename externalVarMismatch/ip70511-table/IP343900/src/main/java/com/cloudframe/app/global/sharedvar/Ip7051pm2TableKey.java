package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip7051pm2TableKey extends Ip7051pm2TableKeySerialized { 
   

						@Getter @Setter private char[] ip7051pm2EnvCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip7051pm2CloneOwnerId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip7051pm2Cpu = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7051pm2HostPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip7051pm2ServCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip7051pm2FuncCd = Field.fillLowValue(4);

								@Getter @Setter private int ip7051pm2QueueNum;
	
	/**
	* Constructor for Ip7051pm2TableKey
	**/
    public Ip7051pm2TableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip7051pm2TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip7051pm2TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip7051pm2TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp7051pm2EnvCd(CONSTANTS.SPACE_3);
         setIp7051pm2CloneOwnerId(CONSTANTS.SPACE_3);
         setIp7051pm2Cpu(CONSTANTS.SPACE_4);
         setIp7051pm2HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp7051pm2ServCd(CONSTANTS.SPACE_4);
         setIp7051pm2FuncCd(CONSTANTS.SPACE_4);
                     setIp7051pm2QueueNum(0);
   }


}
  
