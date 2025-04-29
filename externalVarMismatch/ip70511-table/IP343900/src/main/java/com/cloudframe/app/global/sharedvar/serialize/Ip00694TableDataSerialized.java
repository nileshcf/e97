package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00694TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00694TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00694TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00694_TABLE_DATA_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00694GlobalCurrCode;
            protected  int beginIp00694GlobalCurrExp;
	
	/**
	* Constructor for Ip00694TableDataSerialized
	**/
    public Ip00694TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00694TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00694TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00694TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00694TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00694TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00694_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00694GlobalCurrCode = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00694GlobalCurrExp = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00694GlobalCurrCodeCounter = -1;
     public boolean isIp00694GlobalCurrCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00694GlobalCurrCodeCounter != sharedCounter;
         localIp00694GlobalCurrCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00694GlobalCurrCode
	 *	@return ip00694GlobalCurrCode
	 */
	public char[]  getIp00694GlobalCurrCodeString() {
	     return getCharArray(beginIp00694GlobalCurrCode,IP_00694_GLOBAL_CURR_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00694GlobalCurrCodeIsNumeric() {
	    return isNumeric(beginIp00694GlobalCurrCode
	                    ,beginIp00694GlobalCurrCode + IP_00694_GLOBAL_CURR_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00694_GLOBAL_CURR_CODE_LEN = 3;
  	/**
	 * serializeIp00694GlobalCurrCode
	 */
	protected void serializeIp00694GlobalCurrCode(int ip00694GlobalCurrCode) {
		 putNumber(beginIp00694GlobalCurrCode,ip00694GlobalCurrCode,IP_00694_GLOBAL_CURR_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00694GlobalCurrCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00694GlobalCurrCode
	 */
   	protected  int serializeIp00694GlobalCurrCode(char[] value) {
	    int  ip00694GlobalCurrCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00694GlobalCurrCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00694GlobalCurrCode
		       ,3
		      );
		 localIp00694GlobalCurrCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00694GlobalCurrCode;
    }

   protected int checkIp00694GlobalCurrCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00694GlobalCurrCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00694GlobalCurrCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00694GlobalCurrCode
			                 ,IP_00694_GLOBAL_CURR_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00694GlobalCurrCode", beginIp00694GlobalCurrCode,IP_00694_GLOBAL_CURR_CODE_LEN);
    }
   	}
     int localIp00694GlobalCurrExpCounter = -1;
     public boolean isIp00694GlobalCurrExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00694GlobalCurrExpCounter != sharedCounter;
         localIp00694GlobalCurrExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00694GlobalCurrExp
	 *	@return ip00694GlobalCurrExp
	 */
	public char[]  getIp00694GlobalCurrExpString() {
	     return getCharArray(beginIp00694GlobalCurrExp,IP_00694_GLOBAL_CURR_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00694GlobalCurrExpIsNumeric() {
	    return isNumeric(beginIp00694GlobalCurrExp
	                    ,beginIp00694GlobalCurrExp + IP_00694_GLOBAL_CURR_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00694_GLOBAL_CURR_EXP_LEN = 1;
  	/**
	 * serializeIp00694GlobalCurrExp
	 */
	protected void serializeIp00694GlobalCurrExp(int ip00694GlobalCurrExp) {
		 putNumber(beginIp00694GlobalCurrExp,ip00694GlobalCurrExp,IP_00694_GLOBAL_CURR_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00694GlobalCurrExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00694GlobalCurrExp
	 */
   	protected  int serializeIp00694GlobalCurrExp(char[] value) {
	    int  ip00694GlobalCurrExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00694GlobalCurrExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00694GlobalCurrExp
		       ,1
		      );
		 localIp00694GlobalCurrExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00694GlobalCurrExp;
    }

   protected int checkIp00694GlobalCurrExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00694GlobalCurrExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00694GlobalCurrExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00694GlobalCurrExp
			                 ,IP_00694_GLOBAL_CURR_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00694GlobalCurrExp", beginIp00694GlobalCurrExp,IP_00694_GLOBAL_CURR_EXP_LEN);
    }
   	}




}
  
