package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70511TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip70511TableKey extends Ip70511TableKeySerialized { 
   

						@Getter @Setter private char[] ip70511EnvCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip70511CloneOwnerId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip70511Cpu = Field.fillLowValue(4);

						@Getter @Setter private char[] ip70511HostPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip70511ServCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip70511FuncCd = Field.fillLowValue(4);

								@Getter @Setter private int ip70511QueueNum;
	
	/**
	* Constructor for Ip70511TableKey
	**/
    public Ip70511TableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip70511TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70511TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip70511TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70511EnvCd(CONSTANTS.SPACE_3);
         setIp70511CloneOwnerId(CONSTANTS.SPACE_3);
         setIp70511Cpu(CONSTANTS.SPACE_4);
         setIp70511HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp70511ServCd(CONSTANTS.SPACE_4);
         setIp70511FuncCd(CONSTANTS.SPACE_4);
                     setIp70511QueueNum(0);
   }


}
  
