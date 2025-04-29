package com.cloudframe.app.init1.dto;

/**
*  The class WcdloEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloEndDt extends WcdloEndDtSerialized { 
   

								@Getter @Setter private int wcdloEndDtMm;


								@Getter @Setter private int wcdloEndDtDd;


								@Getter @Setter private int wcdloEndDtYyyy;
	
	/**
	* Constructor for WcdloEndDt
	**/
    public WcdloEndDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WcdloEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloEndDtMm(0);
                     setWcdloEndDtDd(0);
                     setWcdloEndDtYyyy(0);
   }


}
  
