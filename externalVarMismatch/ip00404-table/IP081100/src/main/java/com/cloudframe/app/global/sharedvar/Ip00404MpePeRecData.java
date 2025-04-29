package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404MpePeRecData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00404MpePeRecData extends Ip00404MpePeRecDataSerialized { 
   

								@Getter @Setter private long ip00404AccountRangeId;

						@Getter @Setter private char[] ip00404Ab = Field.fillLowValue(3);

								@Getter @Setter private int ip00404PriorityCode;

								@Getter @Setter private long ip00404PrfxIca;

						@Getter @Setter private char[] ip00404ProdId = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip00404MpePeRecData
	**/
    public Ip00404MpePeRecData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404MpePeRecData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404MpePeRecData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404MpePeRecData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404AccountRangeId(0);
         setIp00404Ab(CONSTANTS.SPACE_3);
                     setIp00404PriorityCode(0);
                     setIp00404PrfxIca(0);
         setIp00404ProdId(CONSTANTS.SPACE_3);
   }


}
  
