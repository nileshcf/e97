package com.cloudframe.app.db2varch.dto;

/**
*  The class TitleGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class TitleGrp extends TitleGrpSerialized { 
   

								@Getter @Setter private short titleLen;

						@Getter @Setter private char[] titleText = Field.fillLowValue(255);
	
	/**
	* Constructor for TitleGrp
	**/
    public TitleGrp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TitleGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TitleGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes TitleGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTitleLen((short)0);
         setTitleText(CONSTANTS.SPACE_255);
   }


}
  
