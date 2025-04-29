package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClmFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1ClmFixedArea extends Dt1ClmFixedAreaSerialized { 
   

								@Getter @Setter private long dt1ClmClmContainerItemCnt;

								@Getter @Setter private long dt1ClmClmContainerItemLen;
	
	/**
	* Constructor for Dt1ClmFixedArea
	**/
    public Dt1ClmFixedArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClmFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Dt1ClmFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1ClmClmContainerItemCnt(0);
                     setDt1ClmClmContainerItemLen(0);
   }


}
  
