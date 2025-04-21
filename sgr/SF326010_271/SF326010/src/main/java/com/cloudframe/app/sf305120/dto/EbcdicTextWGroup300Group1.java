package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextWGroup300Group1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicTextWGroup300Group1 extends EbcdicTextWGroup300Group1Serialized { 
   


	
	/**
	* Constructor for EbcdicTextWGroup300Group1
	**/
    public EbcdicTextWGroup300Group1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EbcdicTextWGroup300Group1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicTextWGroup300Group1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x40,(byte)0x5A,(byte)0x7F,(byte)0x7B,(byte)0x5B,(byte)0x6C,(byte)0x7C,(byte)0x7D,(byte)0x4D,(byte)0x5D,(byte)0x5C,(byte)0x4E,(byte)0x6B,(byte)0x60,(byte)0x4B,(byte)0x61}).toCharArray()
             , getStartOffset() + 0
             ,16
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7A,(byte)0x5E,(byte)0x4C,(byte)0x7E,(byte)0x6E,(byte)0x6F,(byte)0x7C,(byte)0x6D}).toCharArray()
             , getStartOffset() + 16
             ,8
             );
    } 


	
	
	

		public static int getEbcdicTextWGroup300Group1FieldLength() {
			return EBCDIC_TEXT_WGROUP_300_GROUP_1_LENGTH;
		}

}
  
