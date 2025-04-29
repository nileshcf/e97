package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002MmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002MmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002MmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_MMDD_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Mm;
            protected  int beginIp67002Dd;
	
	/**
	* Constructor for Ip67002MmddSerialized
	**/
    public Ip67002MmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002MmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002MmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002MmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Ip67002MmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Ip67002MmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_MMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002Mm = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002Dd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002MmCounter = -1;
     public boolean isIp67002MmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002MmCounter != sharedCounter;
         localIp67002MmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Mm
	 *	@return ip67002Mm
	 */
	public char[]  getIp67002MmString() {
	     return getCharArray(beginIp67002Mm,IP_67002_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002MmIsNumeric() {
	    return isNumeric(beginIp67002Mm
	                    ,beginIp67002Mm + IP_67002_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_MM_LEN = 2;
  	/**
	 * serializeIp67002Mm
	 */
	protected void serializeIp67002Mm(int ip67002Mm) {
		 putNumber(beginIp67002Mm,ip67002Mm,IP_67002_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002MmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Mm
	 */
   	protected  int serializeIp67002Mm(char[] value) {
	    int  ip67002Mm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Mm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Mm
		       ,2
		      );
		 localIp67002MmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Mm;
    }

   protected int checkIp67002MmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Mm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Mm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Mm
			                 ,IP_67002_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Mm", beginIp67002Mm,IP_67002_MM_LEN);
    }
   	}
     int localIp67002DdCounter = -1;
     public boolean isIp67002DdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002DdCounter != sharedCounter;
         localIp67002DdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Dd
	 *	@return ip67002Dd
	 */
	public char[]  getIp67002DdString() {
	     return getCharArray(beginIp67002Dd,IP_67002_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DdIsNumeric() {
	    return isNumeric(beginIp67002Dd
	                    ,beginIp67002Dd + IP_67002_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_DD_LEN = 2;
  	/**
	 * serializeIp67002Dd
	 */
	protected void serializeIp67002Dd(int ip67002Dd) {
		 putNumber(beginIp67002Dd,ip67002Dd,IP_67002_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002DdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Dd
	 */
   	protected  int serializeIp67002Dd(char[] value) {
	    int  ip67002Dd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Dd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Dd
		       ,2
		      );
		 localIp67002DdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Dd;
    }

   protected int checkIp67002DdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Dd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Dd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Dd
			                 ,IP_67002_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Dd", beginIp67002Dd,IP_67002_DD_LEN);
    }
   	}




}
  
