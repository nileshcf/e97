package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1SrtFixedArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1SrtFixedArea extends Dt1SrtFixedAreaSerialized { 
   

								@Getter @Setter private int dt1SrtItemCnt;
	
	/**
	* Constructor for Dt1SrtFixedArea
	**/
    public Dt1SrtFixedArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1SrtFixedArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtFixedArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Dt1SrtFixedArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1SrtItemCnt(0);
   }


}
  
