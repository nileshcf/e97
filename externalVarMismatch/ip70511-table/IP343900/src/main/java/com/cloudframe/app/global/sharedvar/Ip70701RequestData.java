package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70701RequestData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip70701RequestData extends Ip70701RequestDataSerialized { 
   

						@Getter @Setter private char[] ip70701MqRespCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip70701StrtJobNam = Field.fillLowValue(8);

						@Getter @Setter private char[] ip70701StrtTs = Field.fillLowValue(26);

								@Getter @Setter private short ip70701RqstDataTxtLen;

						@Getter @Setter private char[] ip70701RqstDataTxt = Field.fillLowValue(2000);
	
	/**
	* Constructor for Ip70701RequestData
	**/
    public Ip70701RequestData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip70701RequestData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70701RequestData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip70701RequestData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp70701MqRespCd(CONSTANTS.SPACE);
         setIp70701StrtJobNam(CONSTANTS.SPACE_8);
         setIp70701StrtTs(CONSTANTS.SPACE_26);
         	setIp70701RqstDataTxtLen((short)0);
         setIp70701RqstDataTxt(CONSTANTS.SPACE_2000);
   }


}
  
