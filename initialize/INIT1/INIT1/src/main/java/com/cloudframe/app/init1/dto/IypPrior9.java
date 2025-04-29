package com.cloudframe.app.init1.dto;

/**
*  The class IypPrior9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class IypPrior9 extends IypPrior9Serialized { 
   

						@Getter @Setter private char[] ws9iypDatesPrior = new char[20];

								@Getter @Setter private int ws9iypDiscntIdPrior;
	
	/**
	* Constructor for IypPrior9
	**/
    public IypPrior9() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IypPrior9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypPrior9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWs9iypDatesPrior(fillSpace(20));
								setWs9iypDiscntIdPrior(0);
    } 

	/**
	 * 	initializes IypPrior9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWs9iypDatesPrior(CONSTANTS.SPACE_20);
                     setWs9iypDiscntIdPrior(0);
   }


}
  
