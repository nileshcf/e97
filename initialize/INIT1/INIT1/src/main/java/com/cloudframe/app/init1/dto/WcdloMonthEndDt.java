package com.cloudframe.app.init1.dto;

/**
*  The class WcdloMonthEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloMonthEndDt extends WcdloMonthEndDtSerialized { 
   


								@Getter @Setter private int wcdloMonthEndDtDd;

	
	/**
	* Constructor for WcdloMonthEndDt
	**/
    public WcdloMonthEndDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloMonthEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloMonthEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WcdloMonthEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloMonthEndDtDd(0);
   }


}
  
