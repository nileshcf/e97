package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08101MsgTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip08101MsgTbl extends Ip08101MsgTblSerialized { 
   

						@Getter @Setter private char[] ip081011stPresThresh = Field.fillLowValue(3);

						@Getter @Setter private char[] ip081012ndPresChbkThresh = Field.fillLowValue(3);

						@Getter @Setter private char[] ip08101FeeCollectThresh = Field.fillLowValue(3);

						@Getter @Setter private char[] ip08101RetrievalThresh = Field.fillLowValue(3);

						@Getter @Setter private char[] ip08101AllMsgsThresh = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip08101MsgTbl
	**/
    public Ip08101MsgTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip08101MsgTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip08101MsgTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip08101MsgTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp081011stPresThresh(CONSTANTS.SPACE_3);
         setIp081012ndPresChbkThresh(CONSTANTS.SPACE_3);
         setIp08101FeeCollectThresh(CONSTANTS.SPACE_3);
         setIp08101RetrievalThresh(CONSTANTS.SPACE_3);
         setIp08101AllMsgsThresh(CONSTANTS.SPACE_3);
   }


}
  
