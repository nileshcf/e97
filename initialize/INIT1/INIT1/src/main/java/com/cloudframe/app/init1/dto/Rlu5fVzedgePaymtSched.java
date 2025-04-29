package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fVzedgePaymtSched is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Rlu5fVzedgePaymtSched extends Rlu5fVzedgePaymtSchedSerialized { 
   

						@Getter @Setter private char[] rlu5fVzedgePymtDueDt = Field.fillLowValue(8);
	
	/**
	* Constructor for Rlu5fVzedgePaymtSched
	**/
    public Rlu5fVzedgePaymtSched() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rlu5fVzedgePaymtSched. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fVzedgePaymtSched(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Rlu5fVzedgePaymtSched
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRlu5fVzedgePymtDueDt(CONSTANTS.SPACE_8);
   }


}
  
