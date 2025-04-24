package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002CcyyRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002CcyyRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002CcyyRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_CCYY_REDEFINED_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Cc;
            protected  int beginIp67002Yy;
	
	/**
	* Constructor for Ip67002CcyyRedefinedSerialized
	**/
    public Ip67002CcyyRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002CcyyRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002CcyyRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002CcyyRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Ip67002CcyyRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Ip67002CcyyRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_CCYY_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002Cc = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002Yy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002CcCounter = -1;
     public boolean isIp67002CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002CcCounter != sharedCounter;
         localIp67002CcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Cc
	 *	@return ip67002Cc
	 */
	public char[]  getIp67002CcString() {
	     return getCharArray(beginIp67002Cc,IP_67002_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcIsNumeric() {
	    return isNumeric(beginIp67002Cc
	                    ,beginIp67002Cc + IP_67002_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_CC_LEN = 2;
  	/**
	 * serializeIp67002Cc
	 */
	protected void serializeIp67002Cc(int ip67002Cc) {
		 putNumber(beginIp67002Cc,ip67002Cc,IP_67002_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002CcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Cc
	 */
   	protected  int serializeIp67002Cc(char[] value) {
	    int  ip67002Cc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Cc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Cc
		       ,2
		      );
		 localIp67002CcCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Cc;
    }

   protected int checkIp67002CcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Cc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Cc
			                 ,IP_67002_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Cc", beginIp67002Cc,IP_67002_CC_LEN);
    }
   	}
     int localIp67002YyCounter = -1;
     public boolean isIp67002YyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002YyCounter != sharedCounter;
         localIp67002YyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Yy
	 *	@return ip67002Yy
	 */
	public char[]  getIp67002YyString() {
	     return getCharArray(beginIp67002Yy,IP_67002_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002YyIsNumeric() {
	    return isNumeric(beginIp67002Yy
	                    ,beginIp67002Yy + IP_67002_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_YY_LEN = 2;
  	/**
	 * serializeIp67002Yy
	 */
	protected void serializeIp67002Yy(int ip67002Yy) {
		 putNumber(beginIp67002Yy,ip67002Yy,IP_67002_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002YyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Yy
	 */
   	protected  int serializeIp67002Yy(char[] value) {
	    int  ip67002Yy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Yy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Yy
		       ,2
		      );
		 localIp67002YyCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Yy;
    }

   protected int checkIp67002YyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Yy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Yy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Yy
			                 ,IP_67002_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Yy", beginIp67002Yy,IP_67002_YY_LEN);
    }
   	}




}
  
