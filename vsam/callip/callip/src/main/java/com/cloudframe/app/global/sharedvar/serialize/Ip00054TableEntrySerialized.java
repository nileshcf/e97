package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00054TableEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00054TableEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00054TableEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00054_TABLE_ENTRY_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00054ReloadDtTm;
	
	/**
	* Constructor for Ip00054TableEntrySerialized
	**/
    public Ip00054TableEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip00054TableEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00054_TABLE_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp00054ReloadDtTm = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00054ReloadDtTmCounter = -1;
     public boolean isIp00054ReloadDtTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00054ReloadDtTmCounter != sharedCounter;
         localIp00054ReloadDtTmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00054_RELOAD_DT_TM_LEN = 10;
	/**
	 * 	serialize this Ip00054ReloadDtTm
	 */
   protected void serializeIp00054ReloadDtTm(char[] ip00054ReloadDtTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00054ReloadDtTm,0,getStringValue(),beginIp00054ReloadDtTm,IP_00054_RELOAD_DT_TM_LEN);
       localIp00054ReloadDtTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00054ReloadDtTmConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp00054ReloadDtTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00054ReloadDtTm() {	 
   		return (substring(getStringValue(),beginIp00054ReloadDtTm,beginIp00054ReloadDtTm + IP_00054_RELOAD_DT_TM_LEN));
   	}




}
  
