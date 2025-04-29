package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404ArRangeGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00404ArRangeGrp extends Ip00404ArRangeGrpSerialized { 
   

						@Getter @Setter private char[] ip00404Tbl40ArH = Field.fillLowValue(19);

						@Getter @Setter private char[] ip00404Tbl40ArL = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip00404ArRangeGrp
	**/
    public Ip00404ArRangeGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404ArRangeGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404ArRangeGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404ArRangeGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00404Tbl40ArH(CONSTANTS.SPACE_19);
         setIp00404Tbl40ArL(CONSTANTS.SPACE_19);
   }


}
  
