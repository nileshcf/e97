package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextWGroup300Group5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicTextWGroup300Group5 extends EbcdicTextWGroup300Group5Serialized { 
   


	
	/**
	* Constructor for EbcdicTextWGroup300Group5
	**/
    public EbcdicTextWGroup300Group5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EbcdicTextWGroup300Group5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicTextWGroup300Group5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("ABCDEFGHIJKLM").toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             ("NOPQRSTUVWXYZ").toCharArray()
             , getStartOffset() + 13
             ,13
             );
    } 


	
	
	

		public static int getEbcdicTextWGroup300Group5FieldLength() {
			return EBCDIC_TEXT_WGROUP_300_GROUP_5_LENGTH;
		}

}
  
