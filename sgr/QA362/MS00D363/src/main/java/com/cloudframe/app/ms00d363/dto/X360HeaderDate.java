package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360HeaderDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360HeaderDate extends X360HeaderDateSerialized { 
   

								@Getter @Setter private int x360HeaderDateYy;

								@Getter @Setter private int x360HeaderDateMm;

								@Getter @Setter private int x360HeaderDateDd;
	
	/**
	* Constructor for X360HeaderDate
	**/
    public X360HeaderDate() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360HeaderDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes X360HeaderDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setX360HeaderDateYy(0);
                     setX360HeaderDateMm(0);
                     setX360HeaderDateDd(0);
   }


}
  
