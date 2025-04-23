package com.cloudframe.app.ip662010.dto;

/**
*  The class CarrierTooShortValues600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CarrierTooShortValues600 extends CarrierTooShortValues600Serialized { 
   










	
	/**
	* Constructor for CarrierTooShortValues600
	**/
    public CarrierTooShortValues600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CarrierTooShortValues600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CarrierTooShortValues600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getBinaryString((short)48,2)
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)115,2)
             , getStartOffset() + 2
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)62,2)
             , getStartOffset() + 4
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)166,2)
             , getStartOffset() + 6
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)123,2)
             , getStartOffset() + 8
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)171,2)
             , getStartOffset() + 10
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)124,2)
             , getStartOffset() + 12
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)2152,2)
             , getStartOffset() + 14
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)125,2)
             , getStartOffset() + 16
             ,2
             );
       replaceValue( // serialize and save the value
             getBinaryString((short)176,2)
             , getStartOffset() + 18
             ,2
             );
    } 


	
	
	

		public static int getCarrierTooShortValues600FieldLength() {
			return CARRIER_TOO_SHORT_VALUES_600_LENGTH;
		}

}
  
