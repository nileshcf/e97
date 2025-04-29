package com.cloudframe.app.init1.dto;

/**
*  The class AiypCurr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AiypCurr extends AiypCurrSerialized { 
   

						@Getter @Setter private char[] wsaiypDatesCurr = new char[20];

								@Getter @Setter private int wsaiypDiscntIdCurr;
	
	/**
	* Constructor for AiypCurr
	**/
    public AiypCurr() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AiypCurr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypCurr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsaiypDatesCurr(fillSpace(20));
								setWsaiypDiscntIdCurr(0);
    } 

	/**
	 * 	initializes AiypCurr
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWsaiypDatesCurr(CONSTANTS.SPACE_20);
                     setWsaiypDiscntIdCurr(0);
   }


}
  
