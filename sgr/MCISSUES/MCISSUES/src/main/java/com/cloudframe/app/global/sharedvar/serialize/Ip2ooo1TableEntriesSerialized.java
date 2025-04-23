package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip2ooo1TableEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip2ooo1TableEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip2ooo1TableEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_2OOO_1_TABLE_ENTRIES_LENGTH = 171;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp2ooo1ErrorType;
           protected int beginIp2ooo1ReplText;
           protected static final int IP_2OOO_1_REPL_TEXT_SIZE = 3;
	
	/**
	* Constructor for Ip2ooo1TableEntriesSerialized
	**/
    public Ip2ooo1TableEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip2ooo1TableEntriesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1TableEntriesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip2ooo1TableEntriesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip2ooo1TableEntriesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip2ooo1TableEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_2OOO_1_TABLE_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp2ooo1ErrorType = getStartOffset() + 0;	// set offset for serialization
  
  
	        beginIp2ooo1ReplText = getStartOffset() + 21; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp2ooo1ErrorTypeCounter = -1;
     public boolean isIp2ooo1ErrorTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp2ooo1ErrorTypeCounter != sharedCounter;
         localIp2ooo1ErrorTypeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip2ooo1ErrorType
	 *	@return ip2ooo1ErrorType
	 */
	public char[]  getIp2ooo1ErrorTypeString() {
	     return getCharArray(beginIp2ooo1ErrorType,IP_2OOO_1_ERROR_TYPE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorTypeIsNumeric() {
	    return isNumeric(beginIp2ooo1ErrorType
	                    ,beginIp2ooo1ErrorType + IP_2OOO_1_ERROR_TYPE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_2OOO_1_ERROR_TYPE_LEN = 2;
  	/**
	 * serializeIp2ooo1ErrorType
	 */
	protected void serializeIp2ooo1ErrorType(int ip2ooo1ErrorType) {
		 putNumber(beginIp2ooo1ErrorType,ip2ooo1ErrorType,IP_2OOO_1_ERROR_TYPE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp2ooo1ErrorTypeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp2ooo1ErrorType
	 */
   	protected  int serializeIp2ooo1ErrorType(char[] value) {
	    int  ip2ooo1ErrorType;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip2ooo1ErrorType = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp2ooo1ErrorType
		       ,2
		      );
		 localIp2ooo1ErrorTypeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip2ooo1ErrorType;
    }

   protected int checkIp2ooo1ErrorTypeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp2ooo1ErrorType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp2ooo1ErrorType() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp2ooo1ErrorType
			                 ,IP_2OOO_1_ERROR_TYPE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip2ooo1ErrorType", beginIp2ooo1ErrorType,IP_2OOO_1_ERROR_TYPE_LEN);
    }
   	}
 
   
  protected  static final int IP_2OOO_1_REPL_TEXT_LEN = 50;
   /**
	 *	serializeIp2ooo1ReplText as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp2ooo1ReplText(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp2ooo1ReplText + index*IP_2OOO_1_REPL_TEXT_LEN)
   	          , IP_2OOO_1_REPL_TEXT_LEN 
   	          );
   }

		public int ip2ooo1ReplTextSize() {
			return IP_2OOO_1_REPL_TEXT_SIZE;
		}



}
  
