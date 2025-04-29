package com.cloudframe.app.init1.dto;

/**
*  The class IypCurr8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class IypCurr8 extends IypCurr8Serialized { 
   

						@Getter @Setter private char[] ws8iypDatesCurr = new char[20];

								@Getter @Setter private int ws8iypDiscntIdCurr;
	
	/**
	* Constructor for IypCurr8
	**/
    public IypCurr8() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypCurr8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypCurr8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs8iypDatesCurr(fillSpace(20));
								setWs8iypDiscntIdCurr(0);
    } 

	/**
	 * 	initializes IypCurr8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs8iypDatesCurr(CONSTANTS.SPACE_20);
                     setWs8iypDiscntIdCurr(0);
   }


}
  
