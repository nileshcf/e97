package com.cloudframe.app.init1.dto;

/**
*  The class WcdloStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloStartDt extends WcdloStartDtSerialized { 
   

								@Getter @Setter private int wcdloStartDtMm;


								@Getter @Setter private int wcdloStartDtDd;


								@Getter @Setter private int wcdloStartDtYyyy;
	
	/**
	* Constructor for WcdloStartDt
	**/
    public WcdloStartDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WcdloStartDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloStartDtMm(0);
                     setWcdloStartDtDd(0);
                     setWcdloStartDtYyyy(0);
   }


}
  
