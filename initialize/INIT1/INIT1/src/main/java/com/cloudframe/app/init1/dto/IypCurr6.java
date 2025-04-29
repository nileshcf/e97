package com.cloudframe.app.init1.dto;

/**
*  The class IypCurr6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class IypCurr6 extends IypCurr6Serialized { 
   

						@Getter @Setter private char[] ws6iypDatesCurr = new char[20];

								@Getter @Setter private int ws6iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr6
	**/
    public IypCurr6() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypCurr6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs6iypDatesCurr(fillSpace(20));
								setWs6iypDiscntIdCurr(0);
    } 

	/**
	 * 	initializes IypCurr6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs6iypDatesCurr(CONSTANTS.SPACE_20);
                     setWs6iypDiscntIdCurr(0);
   }


}
  
