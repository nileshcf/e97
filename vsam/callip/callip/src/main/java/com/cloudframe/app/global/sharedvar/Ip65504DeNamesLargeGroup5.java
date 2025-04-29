package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNamesLargeGroup5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip65504DeNamesLargeGroup5 extends Ip65504DeNamesLargeGroup5Serialized { 
   

								@Getter @Setter private short ip65504D125ReservdS;

								@Getter @Setter private short ip65504D125ReservdL;


								@Getter @Setter private short ip65504D126ConvdatS;

								@Getter @Setter private short ip65504D126ConvdatL;


								@Getter @Setter private short ip65504D127NetworkS;

								@Getter @Setter private short ip65504D127NetworkL;


								@Getter @Setter private short ip65504D128MacCodS;

								@Getter @Setter private short ip65504D128MacCodL;

	
	/**
	* Constructor for Ip65504DeNamesLargeGroup5
	**/
    public Ip65504DeNamesLargeGroup5() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip65504DeNamesLargeGroup5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip65504DeNamesLargeGroup5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504D125ReservdS((short)0);
         	setIp65504D125ReservdL((short)0);
         	setIp65504D126ConvdatS((short)0);
         	setIp65504D126ConvdatL((short)0);
         	setIp65504D127NetworkS((short)0);
         	setIp65504D127NetworkL((short)0);
         	setIp65504D128MacCodS((short)0);
         	setIp65504D128MacCodL((short)0);
   }


}
  
