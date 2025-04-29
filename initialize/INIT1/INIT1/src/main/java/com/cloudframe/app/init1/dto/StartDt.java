package com.cloudframe.app.init1.dto;

/**
*  The class StartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class StartDt extends StartDtSerialized { 
   

								@Getter @Setter private int startDtMm;


								@Getter @Setter private int startDtYyyy;
	
	/**
	* Constructor for StartDt
	**/
    public StartDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes StartDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setStartDtMm(0);
                     setStartDtYyyy(0);
   }


}
  
