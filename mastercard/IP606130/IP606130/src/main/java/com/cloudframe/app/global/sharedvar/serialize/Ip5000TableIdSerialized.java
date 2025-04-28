package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip5000TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip5000TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip5000TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_5000_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp5000TableNo;
            protected  int beginIp5000TableNo9;
	
	/**
	* Constructor for Ip5000TableIdSerialized
	**/
    public Ip5000TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip5000TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip5000TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip5000TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Ip5000TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Ip5000TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_5000_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp5000TableNo = getStartOffset() + 2;	// set offset for serialization
  
             beginIp5000TableNo9 = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp5000TableNoCounter = -1;
     public boolean isIp5000TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp5000TableNoCounter != sharedCounter;
         localIp5000TableNoCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_5000_TABLE_NO_LEN = 4;
	/**
	 * 	serialize this Ip5000TableNo
	 */
   protected void serializeIp5000TableNo(char[] ip5000TableNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip5000TableNo,0,getStringValue(),beginIp5000TableNo,IP_5000_TABLE_NO_LEN);
       localIp5000TableNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp5000TableNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp5000TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp5000TableNo() {	 
   		return (substring(getStringValue(),beginIp5000TableNo,beginIp5000TableNo + IP_5000_TABLE_NO_LEN));
   	}
     int localIp5000TableNo9Counter = -1;
     public boolean isIp5000TableNo9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp5000TableNo9Counter != sharedCounter;
         localIp5000TableNo9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip5000TableNo9
	 *	@return ip5000TableNo9
	 */
	public char[]  getIp5000TableNo9String() {
	     return getCharArray(beginIp5000TableNo9,IP_5000_TABLE_NO_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip5000TableNo9IsNumeric() {
	    return isNumeric(beginIp5000TableNo9
	                    ,beginIp5000TableNo9 + IP_5000_TABLE_NO_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_5000_TABLE_NO_9_LEN = 4;
  	/**
	 * serializeIp5000TableNo9
	 */
	protected void serializeIp5000TableNo9(int ip5000TableNo9) {
		 putNumber(beginIp5000TableNo9,ip5000TableNo9,IP_5000_TABLE_NO_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp5000TableNo9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp5000TableNo9
	 */
   	protected  int serializeIp5000TableNo9(char[] value) {
	    int  ip5000TableNo9;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip5000TableNo9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp5000TableNo9
		       ,4
		      );
		 localIp5000TableNo9Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip5000TableNo9;
    }

   protected int checkIp5000TableNo9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp5000TableNo9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp5000TableNo9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp5000TableNo9
			                 ,IP_5000_TABLE_NO_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip5000TableNo9", beginIp5000TableNo9,IP_5000_TABLE_NO_9_LEN);
    }
   	}




}
  
