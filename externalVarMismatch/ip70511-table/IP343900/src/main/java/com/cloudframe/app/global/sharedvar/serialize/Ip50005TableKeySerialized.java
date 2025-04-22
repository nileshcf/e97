package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005TableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005TableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005TableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005_TABLE_KEY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005ReadTableId;
            protected  int beginIp50005EffDate;
	
	/**
	* Constructor for Ip50005TableKeySerialized
	**/
    public Ip50005TableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50005TableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50005TableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50005TableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50005TableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005ReadTableId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50005EffDate = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005ReadTableIdCounter = -1;
     public boolean isIp50005ReadTableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005ReadTableIdCounter != sharedCounter;
         localIp50005ReadTableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005_READ_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip50005ReadTableId
	 */
   protected void serializeIp50005ReadTableId(char[] ip50005ReadTableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005ReadTableId,0,getStringValue(),beginIp50005ReadTableId,IP_50005_READ_TABLE_ID_LEN);
       localIp50005ReadTableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005ReadTableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp50005ReadTableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005ReadTableId() {	 
   		return (substring(getStringValue(),beginIp50005ReadTableId,beginIp50005ReadTableId + IP_50005_READ_TABLE_ID_LEN));
   	}
     int localIp50005EffDateCounter = -1;
     public boolean isIp50005EffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005EffDateCounter != sharedCounter;
         localIp50005EffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50005EffDate
	 *	@return ip50005EffDate
	 */
	public char[]  getIp50005EffDateString() {
	     return getCharArray(beginIp50005EffDate,IP_50005_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50005EffDateIsNumeric() {
	    return isNumeric(beginIp50005EffDate
	                    ,beginIp50005EffDate + IP_50005_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50005_EFF_DATE_LEN = 10;
  	/**
	 * serializeIp50005EffDate
	 */
	protected void serializeIp50005EffDate(long ip50005EffDate) {
		 putNumber(beginIp50005EffDate,ip50005EffDate,IP_50005_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50005EffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50005EffDate
	 */
   	protected  long serializeIp50005EffDate(char[] value) {
	    long  ip50005EffDate;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50005EffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp50005EffDate
		       ,10
		      );
		 localIp50005EffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50005EffDate;
    }

   protected long checkIp50005EffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50005EffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005EffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp50005EffDate
			                 ,IP_50005_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50005EffDate", beginIp50005EffDate,IP_50005_EFF_DATE_LEN);
    }
   	}




}
  
