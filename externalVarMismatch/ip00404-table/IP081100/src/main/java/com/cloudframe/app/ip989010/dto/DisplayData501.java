package com.cloudframe.app.ip989010.dto;

/**
*  The class DisplayData501 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DisplayData501 extends DisplayData501Serialized { 
   

						@Getter @Setter private char[] panAlias501 = Field.fillLowValue(36);

								@Getter @Setter private long donationLimit501;

								@Getter @Setter private long calcDonationAmt501;

								@Getter @Setter private long builtDonationAmt501;
	
	/**
	* Constructor for DisplayData501
	**/
    public DisplayData501() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DisplayData501. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DisplayData501(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
