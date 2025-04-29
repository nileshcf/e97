package com.cloudframe.app.init1.dto;

/**
*  The class CpduPrvMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class CpduPrvMtn extends CpduPrvMtnSerialized { 
   

						@Getter @Setter private char[] cpduPrvNpa = new char[3];

						@Getter @Setter private char[] cpduPrvNxx = new char[3];

						@Getter @Setter private char[] cpduPrvTln = new char[4];
	
	/**
	* Constructor for CpduPrvMtn
	**/
    public CpduPrvMtn() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CpduPrvMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CpduPrvMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCpduPrvNpa(fillSpace(3));
								setCpduPrvNxx(fillSpace(3));
								setCpduPrvTln(fillSpace(4));
    } 

	/**
	 * 	initializes CpduPrvMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpduPrvNpa(CONSTANTS.SPACE_3);
         setCpduPrvNxx(CONSTANTS.SPACE_3);
         setCpduPrvTln(CONSTANTS.SPACE_4);
   }


}
  
