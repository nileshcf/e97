package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextWGroup300Group8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicTextWGroup300Group8 extends EbcdicTextWGroup300Group8Serialized { 
   


	
	/**
	* Constructor for EbcdicTextWGroup300Group8
	**/
    public EbcdicTextWGroup300Group8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EbcdicTextWGroup300Group8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicTextWGroup300Group8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x81,(byte)0x82,(byte)0x83,(byte)0x84,(byte)0x85,(byte)0x86,(byte)0x87,(byte)0x88,(byte)0x89,(byte)0x91,(byte)0x92,(byte)0x93,(byte)0x94}).toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x95,(byte)0x96,(byte)0x97,(byte)0x98,(byte)0x99,(byte)0xA2,(byte)0xA3,(byte)0xA4,(byte)0xA5,(byte)0xA6,(byte)0xA7,(byte)0xA8,(byte)0xA9}).toCharArray()
             , getStartOffset() + 13
             ,13
             );
    } 


	
	
	

		public static int getEbcdicTextWGroup300Group8FieldLength() {
			return EBCDIC_TEXT_WGROUP_300_GROUP_8_LENGTH;
		}

}
  
