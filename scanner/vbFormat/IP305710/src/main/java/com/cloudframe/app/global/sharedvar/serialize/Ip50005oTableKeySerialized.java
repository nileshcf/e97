package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50005oTableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50005oTableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50005oTableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50005O_TABLE_KEY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50005oReadTableId;
            protected  int beginIp50005oEffDate;
	
	/**
	* Constructor for Ip50005oTableKeySerialized
	**/
    public Ip50005oTableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50005oTableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50005oTableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50005oTableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50005oTableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50005O_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50005oReadTableId = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50005oEffDate = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50005oReadTableIdCounter = -1;
     public boolean isIp50005oReadTableIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oReadTableIdCounter != sharedCounter;
         localIp50005oReadTableIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50005O_READ_TABLE_ID_LEN = 8;
	/**
	 * 	serialize this Ip50005oReadTableId
	 */
   protected void serializeIp50005oReadTableId(char[] ip50005oReadTableId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50005oReadTableId,0,getStringValue(),beginIp50005oReadTableId,IP_50005O_READ_TABLE_ID_LEN);
       localIp50005oReadTableIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50005oReadTableIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp50005oReadTableId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50005oReadTableId() {	 
   		return (substring(getStringValue(),beginIp50005oReadTableId,beginIp50005oReadTableId + IP_50005O_READ_TABLE_ID_LEN));
   	}
     int localIp50005oEffDateCounter = -1;
     public boolean isIp50005oEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50005oEffDateCounter != sharedCounter;
         localIp50005oEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50005oEffDate
	 *	@return ip50005oEffDate
	 */
	public char[]  getIp50005oEffDateString() {
	     return getCharArray(beginIp50005oEffDate,IP_50005O_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50005oEffDateIsNumeric() {
	    return isNumeric(beginIp50005oEffDate
	                    ,beginIp50005oEffDate + IP_50005O_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50005O_EFF_DATE_LEN = 10;
  	/**
	 * serializeIp50005oEffDate
	 */
	protected void serializeIp50005oEffDate(long ip50005oEffDate) {
		 putNumber(beginIp50005oEffDate,ip50005oEffDate,IP_50005O_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50005oEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50005oEffDate
	 */
   	protected  long serializeIp50005oEffDate(char[] value) {
	    long  ip50005oEffDate;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50005oEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginIp50005oEffDate
		       ,10
		      );
		 localIp50005oEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50005oEffDate;
    }

   protected long checkIp50005oEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50005oEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp50005oEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp50005oEffDate
			                 ,IP_50005O_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50005oEffDate", beginIp50005oEffDate,IP_50005O_EFF_DATE_LEN);
    }
   	}




}
  
