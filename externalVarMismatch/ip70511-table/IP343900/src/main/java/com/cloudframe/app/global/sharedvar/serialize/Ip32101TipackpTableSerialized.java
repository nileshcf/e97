package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101TipackpTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101TipackpTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101TipackpTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_TIPACKP_TABLE_LENGTH = 273;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101ChkPointKeyText;
	
	/**
	* Constructor for Ip32101TipackpTableSerialized
	**/
    public Ip32101TipackpTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip32101TipackpTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_TIPACKP_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101ChkPointKeyText = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localIp32101ChkPointKeyTextCounter = -1;
     public boolean isIp32101ChkPointKeyTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101ChkPointKeyTextCounter != sharedCounter;
         localIp32101ChkPointKeyTextCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CHK_POINT_KEY_TEXT_LEN = 17;
	/**
	 * 	serialize this Ip32101ChkPointKeyText
	 */
   protected void serializeIp32101ChkPointKeyText(char[] ip32101ChkPointKeyText) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101ChkPointKeyText,0,getStringValue(),beginIp32101ChkPointKeyText,IP_32101_CHK_POINT_KEY_TEXT_LEN);
       localIp32101ChkPointKeyTextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101ChkPointKeyTextConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshIp32101ChkPointKeyText is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101ChkPointKeyText() {	 
   		return (substring(getStringValue(),beginIp32101ChkPointKeyText,beginIp32101ChkPointKeyText + IP_32101_CHK_POINT_KEY_TEXT_LEN));
   	}




}
  
