package com.cloudframe.app.init1.dto;

/**
*  The class AiypPrior is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class AiypPrior extends AiypPriorSerialized { 
   

						@Getter @Setter private char[] wsaiypDatesPrior = new char[20];

								@Getter @Setter private int wsaiypDiscntIdPrior;
	
	/**
	* Constructor for AiypPrior
	**/
    public AiypPrior() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for AiypPrior. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypPrior(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWsaiypDatesPrior(fillSpace(20));
								setWsaiypDiscntIdPrior(0);
    } 

	/**
	 * 	initializes AiypPrior
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWsaiypDatesPrior(CONSTANTS.SPACE_20);
                     setWsaiypDiscntIdPrior(0);
   }


}
  
