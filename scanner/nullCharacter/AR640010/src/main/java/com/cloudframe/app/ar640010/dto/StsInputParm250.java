package com.cloudframe.app.ar640010.dto;

/**
*  The class StsInputParm250 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsInputParm250 extends StsInputParm250Serialized { 
   

						@Getter @Setter private char[] stsRefId250 = new char[4];
	
	/**
	* Constructor for StsInputParm250
	**/
    public StsInputParm250() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsInputParm250. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsInputParm250(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setStsRefId250(fillSpace(4));
    } 

	/**
	 * 	initializes StsInputParm250
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsRefId250(CONSTANTS.SPACE_4);
   }


}
  
