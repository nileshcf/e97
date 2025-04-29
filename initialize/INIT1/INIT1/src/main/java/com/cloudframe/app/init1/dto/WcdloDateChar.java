package com.cloudframe.app.init1.dto;

/**
*  The class WcdloDateChar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloDateChar extends WcdloDateCharSerialized { 
   

								@Getter @Setter private long wcdloDateNumeric;
	
	/**
	* Constructor for WcdloDateChar
	**/
    public WcdloDateChar() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloDateChar. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateChar(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WcdloDateChar
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloDateNumeric(0);
   }


}
  
