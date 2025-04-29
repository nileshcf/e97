package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70711ResponseData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip70711ResponseData extends Ip70711ResponseDataSerialized { 
   

						@Getter @Setter private char[] ip70711MqRespCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip70711StrtJobNum = Field.fillLowValue(8);

						@Getter @Setter private char[] ip70711StrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] ip70711StatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip70711JobGrpId = Field.fillLowValue(6);

								@Getter @Setter private int ip70711JobGrpNum;

								@Getter @Setter private short ip70711RespDataTxtLen;

						@Getter @Setter private char[] ip70711RespDataTxt = Field.fillLowValue(2000);

						@Getter @Setter private char[] ip70711RejStatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip70711ResponseData
	**/
    public Ip70711ResponseData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip70711ResponseData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70711ResponseData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip70711ResponseData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70711MqRespCd(CONSTANTS.SPACE);
         setIp70711StrtJobNum(CONSTANTS.SPACE_8);
         setIp70711StrtTs(CONSTANTS.SPACE_26);
         setIp70711StatCd(CONSTANTS.SPACE);
         setIp70711JobGrpId(CONSTANTS.SPACE_6);
                     setIp70711JobGrpNum(0);
         	setIp70711RespDataTxtLen((short)0);
         setIp70711RespDataTxt(CONSTANTS.SPACE_2000);
         setIp70711RejStatCd(CONSTANTS.SPACE);
   }


}
  
