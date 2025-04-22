package com.cloudframe.app.sf305120.dto;

/**
*  The class AsciiTextWGroup300Group1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsciiTextWGroup300Group1 extends AsciiTextWGroup300Group1Serialized { 
   


	
	/**
	* Constructor for AsciiTextWGroup300Group1
	**/
    public AsciiTextWGroup300Group1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AsciiTextWGroup300Group1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextWGroup300Group1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x20,(byte)0x21,(byte)0x22,(byte)0x23,(byte)0x24,(byte)0x25,(byte)0x26,(byte)0x27,(byte)0x28,(byte)0x29,(byte)0x2A,(byte)0x2B,(byte)0x2C,(byte)0x2D,(byte)0x2E,(byte)0x2F}).toCharArray()
             , getStartOffset() + 0
             ,16
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x3A,(byte)0x3B,(byte)0x3C,(byte)0x3D,(byte)0x3E,(byte)0x3F,(byte)0x40,(byte)0x5F}).toCharArray()
             , getStartOffset() + 16
             ,8
             );
    } 


	
	
	

		public static int getAsciiTextWGroup300Group1FieldLength() {
			return ASCII_TEXT_WGROUP_300_GROUP_1_LENGTH;
		}

}
  
