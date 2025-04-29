package com.cloudframe.app.d5427dt1.dto;

/**
*  The class SysJobname is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class SysJobname extends SysJobnameSerialized { 
   

						@Getter @Setter private char[] sysJobname14 = Field.fillLowValue(4);

						@Getter @Setter private char[] sysJobname5 = Field.fillLowValue(1);

						@Getter @Setter private char[] sysJobnameCicsJobname68 = Field.fillLowValue(3);
	
	/**
	* Constructor for SysJobname
	**/
    public SysJobname() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SysJobname. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysJobname(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes SysJobname
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSysJobname14(CONSTANTS.SPACE_4);
         setSysJobname5(CONSTANTS.SPACE);
         setSysJobnameCicsJobname68(CONSTANTS.SPACE_3);
   }


}
  
