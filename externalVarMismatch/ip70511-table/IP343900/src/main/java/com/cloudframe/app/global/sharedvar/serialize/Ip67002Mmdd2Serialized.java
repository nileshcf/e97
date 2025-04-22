package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002Mmdd2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002Mmdd2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002Mmdd2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_MMDD_2_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Mm2;
            protected  int beginIp67002Dd2;
	
	/**
	* Constructor for Ip67002Mmdd2Serialized
	**/
    public Ip67002Mmdd2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002Mmdd2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Mmdd2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002Mmdd2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip67002Mmdd2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip67002Mmdd2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_MMDD_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002Mm2 = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002Dd2 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002Mm2Counter = -1;
     public boolean isIp67002Mm2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002Mm2Counter != sharedCounter;
         localIp67002Mm2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Mm2
	 *	@return ip67002Mm2
	 */
	public char[]  getIp67002Mm2String() {
	     return getCharArray(beginIp67002Mm2,IP_67002_MM_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Mm2IsNumeric() {
	    return isNumeric(beginIp67002Mm2
	                    ,beginIp67002Mm2 + IP_67002_MM_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_MM_2_LEN = 2;
  	/**
	 * serializeIp67002Mm2
	 */
	protected void serializeIp67002Mm2(int ip67002Mm2) {
		 putNumber(beginIp67002Mm2,ip67002Mm2,IP_67002_MM_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002Mm2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Mm2
	 */
   	protected  int serializeIp67002Mm2(char[] value) {
	    int  ip67002Mm2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Mm2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Mm2
		       ,2
		      );
		 localIp67002Mm2Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Mm2;
    }

   protected int checkIp67002Mm2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Mm2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Mm2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Mm2
			                 ,IP_67002_MM_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Mm2", beginIp67002Mm2,IP_67002_MM_2_LEN);
    }
   	}
     int localIp67002Dd2Counter = -1;
     public boolean isIp67002Dd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002Dd2Counter != sharedCounter;
         localIp67002Dd2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Dd2
	 *	@return ip67002Dd2
	 */
	public char[]  getIp67002Dd2String() {
	     return getCharArray(beginIp67002Dd2,IP_67002_DD_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Dd2IsNumeric() {
	    return isNumeric(beginIp67002Dd2
	                    ,beginIp67002Dd2 + IP_67002_DD_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_DD_2_LEN = 2;
  	/**
	 * serializeIp67002Dd2
	 */
	protected void serializeIp67002Dd2(int ip67002Dd2) {
		 putNumber(beginIp67002Dd2,ip67002Dd2,IP_67002_DD_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002Dd2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Dd2
	 */
   	protected  int serializeIp67002Dd2(char[] value) {
	    int  ip67002Dd2;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Dd2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Dd2
		       ,2
		      );
		 localIp67002Dd2Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Dd2;
    }

   protected int checkIp67002Dd2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Dd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Dd2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Dd2
			                 ,IP_67002_DD_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Dd2", beginIp67002Dd2,IP_67002_DD_2_LEN);
    }
   	}




}
  
