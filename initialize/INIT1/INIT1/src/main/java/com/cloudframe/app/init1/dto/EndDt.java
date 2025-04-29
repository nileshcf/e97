package com.cloudframe.app.init1.dto;

/**
*  The class EndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EndDt extends EndDtSerialized { 
   

								@Getter @Setter private int endDtMm;


								@Getter @Setter private int endDtYyyy;
	
	/**
	* Constructor for EndDt
	**/
    public EndDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes EndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setEndDtMm(0);
                     setEndDtYyyy(0);
   }


}
  
