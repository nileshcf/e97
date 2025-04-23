package com.cloudframe.app.sf305120.dto;

/**
*  The class AsciiTextWGroup300Group5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsciiTextWGroup300Group5 extends AsciiTextWGroup300Group5Serialized { 
   


	
	/**
	* Constructor for AsciiTextWGroup300Group5
	**/
    public AsciiTextWGroup300Group5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AsciiTextWGroup300Group5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextWGroup300Group5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x41,(byte)0x42,(byte)0x43,(byte)0x44,(byte)0x45,(byte)0x46,(byte)0x47,(byte)0x48,(byte)0x49,(byte)0x4A,(byte)0x4B,(byte)0x4C,(byte)0x4D}).toCharArray()
             , getStartOffset() + 0
             ,13
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x4E,(byte)0x4F,(byte)0x50,(byte)0x51,(byte)0x52,(byte)0x53,(byte)0x54,(byte)0x55,(byte)0x56,(byte)0x57,(byte)0x58,(byte)0x59,(byte)0x5A}).toCharArray()
             , getStartOffset() + 13
             ,13
             );
    } 


	
	
	

		public static int getAsciiTextWGroup300Group5FieldLength() {
			return ASCII_TEXT_WGROUP_300_GROUP_5_LENGTH;
		}

}
  
