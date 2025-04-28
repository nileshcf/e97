package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class SysidSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SysidSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SysidSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYSID_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSysidNnn;
	
	/**
	* Constructor for SysidSerialized
	**/
    public SysidSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SysidSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYSID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSysidNnn = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSysidNnnCounter = -1;
     public boolean isSysidNnnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysidNnnCounter != sharedCounter;
         localSysidNnnCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sysidNnn
	 *	@return sysidNnn
	 */
	public char[]  getSysidNnnString() {
	     return getCharArray(beginSysidNnn,SYSID_NNN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sysidNnnIsNumeric() {
	    return isNumeric(beginSysidNnn
	                    ,beginSysidNnn + SYSID_NNN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYSID_NNN_LEN = 3;
  	/**
	 * serializeSysidNnn
	 */
	protected void serializeSysidNnn(int sysidNnn) {
		 putNumber(beginSysidNnn,sysidNnn,SYSID_NNN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSysidNnnCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSysidNnn
	 */
   	protected  int serializeSysidNnn(char[] value) {
	    int  sysidNnn;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sysidNnn = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSysidNnn
		       ,3
		      );
		 localSysidNnnCounter = shareString.getSerializedField().getModifiedCounter();
		return  sysidNnn;
    }

   protected int checkSysidNnnMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSysidNnn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSysidNnn() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSysidNnn
			                 ,SYSID_NNN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sysidNnn", beginSysidNnn,SYSID_NNN_LEN);
    }
   	}




}
  
