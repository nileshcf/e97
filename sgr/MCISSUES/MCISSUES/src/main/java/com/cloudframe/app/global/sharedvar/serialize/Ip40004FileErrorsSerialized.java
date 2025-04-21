package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip40004FileErrorsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40004FileErrorsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40004FileErrorsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40004_FILE_ERRORS_LENGTH = 171;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40004FileErrorType;
           protected int beginIp40004FileReplText;
           protected static final int IP_40004_FILE_REPL_TEXT_SIZE = 3;
	
	/**
	* Constructor for Ip40004FileErrorsSerialized
	**/
    public Ip40004FileErrorsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip40004FileErrorsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileErrorsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip40004FileErrorsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,108); // serialize this field at offset 108 by default 
    }
    
	/**
	* sets parent for this Ip40004FileErrorsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 108 by default
    }    
	/**
	* initializes the field in Ip40004FileErrorsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40004_FILE_ERRORS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40004FileErrorType = getStartOffset() + 0;	// set offset for serialization
  
  
	        beginIp40004FileReplText = getStartOffset() + 21; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40004FileErrorTypeCounter = -1;
     public boolean isIp40004FileErrorTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40004FileErrorTypeCounter != sharedCounter;
         localIp40004FileErrorTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40004FileErrorType
	 *	@return ip40004FileErrorType
	 */
	public char[]  getIp40004FileErrorTypeString() {
	     return getCharArray(beginIp40004FileErrorType,IP_40004_FILE_ERROR_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40004FileErrorTypeIsNumeric() {
	    return isNumeric(beginIp40004FileErrorType
	                    ,beginIp40004FileErrorType + IP_40004_FILE_ERROR_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40004_FILE_ERROR_TYPE_LEN = 2;
  	/**
	 * serializeIp40004FileErrorType
	 */
	protected void serializeIp40004FileErrorType(int ip40004FileErrorType) {
		 putNumber(beginIp40004FileErrorType,ip40004FileErrorType,IP_40004_FILE_ERROR_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40004FileErrorTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40004FileErrorType
	 */
   	protected  int serializeIp40004FileErrorType(char[] value) {
	    int  ip40004FileErrorType;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40004FileErrorType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp40004FileErrorType
		       ,2
		      );
		 localIp40004FileErrorTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40004FileErrorType;
    }

   protected int checkIp40004FileErrorTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40004FileErrorType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40004FileErrorType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40004FileErrorType
			                 ,IP_40004_FILE_ERROR_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40004FileErrorType", beginIp40004FileErrorType,IP_40004_FILE_ERROR_TYPE_LEN);
    }
   	}
 
   
  protected  static final int IP_40004_FILE_REPL_TEXT_LEN = 50;
   /**
	 *	serializeIp40004FileReplText as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp40004FileReplText(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp40004FileReplText + index*IP_40004_FILE_REPL_TEXT_LEN)
   	          , IP_40004_FILE_REPL_TEXT_LEN 
   	          );
   }

		public int ip40004FileReplTextSize() {
			return IP_40004_FILE_REPL_TEXT_SIZE;
		}



}
  
