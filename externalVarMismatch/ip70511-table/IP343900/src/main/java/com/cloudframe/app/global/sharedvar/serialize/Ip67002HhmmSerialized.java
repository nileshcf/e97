package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002HhmmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002HhmmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002HhmmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_HHMM_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Hh;
            protected  int beginIp67002Mth;
	
	/**
	* Constructor for Ip67002HhmmSerialized
	**/
    public Ip67002HhmmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002HhmmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002HhmmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002HhmmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this Ip67002HhmmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in Ip67002HhmmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_HHMM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002Hh = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002Mth = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002HhCounter = -1;
     public boolean isIp67002HhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002HhCounter != sharedCounter;
         localIp67002HhCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public char[]  getIp67002HhString() {
	     return getCharArray(beginIp67002Hh,IP_67002_HH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002HhIsNumeric() {
	    return isNumeric(beginIp67002Hh
	                    ,beginIp67002Hh + IP_67002_HH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_HH_LEN = 2;
  	/**
	 * serializeIp67002Hh
	 */
	protected void serializeIp67002Hh(int ip67002Hh) {
		 putNumber(beginIp67002Hh,ip67002Hh,IP_67002_HH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002HhCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Hh
	 */
   	protected  int serializeIp67002Hh(char[] value) {
	    int  ip67002Hh;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Hh = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Hh
		       ,2
		      );
		 localIp67002HhCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Hh;
    }

   protected int checkIp67002HhMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Hh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Hh() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Hh
			                 ,IP_67002_HH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Hh", beginIp67002Hh,IP_67002_HH_LEN);
    }
   	}
     int localIp67002MthCounter = -1;
     public boolean isIp67002MthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002MthCounter != sharedCounter;
         localIp67002MthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public char[]  getIp67002MthString() {
	     return getCharArray(beginIp67002Mth,IP_67002_MTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002MthIsNumeric() {
	    return isNumeric(beginIp67002Mth
	                    ,beginIp67002Mth + IP_67002_MTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_MTH_LEN = 2;
  	/**
	 * serializeIp67002Mth
	 */
	protected void serializeIp67002Mth(int ip67002Mth) {
		 putNumber(beginIp67002Mth,ip67002Mth,IP_67002_MTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002MthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Mth
	 */
   	protected  int serializeIp67002Mth(char[] value) {
	    int  ip67002Mth;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Mth = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002Mth
		       ,2
		      );
		 localIp67002MthCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Mth;
    }

   protected int checkIp67002MthMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Mth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Mth() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Mth
			                 ,IP_67002_MTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Mth", beginIp67002Mth,IP_67002_MTH_LEN);
    }
   	}




}
  
