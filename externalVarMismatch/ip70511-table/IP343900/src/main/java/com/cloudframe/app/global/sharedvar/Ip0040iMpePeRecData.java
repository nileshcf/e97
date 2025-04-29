package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iMpePeRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040iMpePeRecData extends Ip0040iMpePeRecDataSerialized { 
   

								@Getter @Setter private long ip0040iAccountRangeId;

						@Getter @Setter private char[] ip0040iAb = Field.fillLowValue(3);

								@Getter @Setter private int ip0040iPriorityCode;

								@Getter @Setter private long ip0040iPrfxIca;

						@Getter @Setter private char[] ip0040iProdId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip0040iMpePeRecData
	**/
    public Ip0040iMpePeRecData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040iMpePeRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iMpePeRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040iMpePeRecData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iAccountRangeId(0);
         setIp0040iAb(CONSTANTS.SPACE_3);
                     setIp0040iPriorityCode(0);
                     setIp0040iPrfxIca(0);
         setIp0040iProdId(CONSTANTS.SPACE_3);
   }


}
  
