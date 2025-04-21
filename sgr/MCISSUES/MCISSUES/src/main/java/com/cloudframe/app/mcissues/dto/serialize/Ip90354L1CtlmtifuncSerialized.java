package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip90354L1CtlmtifuncSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip90354L1CtlmtifuncSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip90354L1CtlmtifuncSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_90354_L_1_CTLMTIFUNC_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp90354L1Ctlmti;
            protected  int beginIp90354L1Ctlfunc;
	
	/**
	* Constructor for Ip90354L1CtlmtifuncSerialized
	**/
    public Ip90354L1CtlmtifuncSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip90354L1CtlmtifuncSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354L1CtlmtifuncSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip90354L1CtlmtifuncSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Ip90354L1CtlmtifuncSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Ip90354L1CtlmtifuncSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_90354_L_1_CTLMTIFUNC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp90354L1Ctlmti = getStartOffset() + 0;	// set offset for serialization
  
             beginIp90354L1Ctlfunc = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp90354L1CtlmtiCounter = -1;
     public boolean isIp90354L1CtlmtiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90354L1CtlmtiCounter != sharedCounter;
         localIp90354L1CtlmtiCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90354L1Ctlmti
	 *	@return ip90354L1Ctlmti
	 */
	public char[]  getIp90354L1CtlmtiString() {
	     return getCharArray(beginIp90354L1Ctlmti,IP_90354_L_1_CTLMTI_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90354L1CtlmtiIsNumeric() {
	    return isNumeric(beginIp90354L1Ctlmti
	                    ,beginIp90354L1Ctlmti + IP_90354_L_1_CTLMTI_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90354_L_1_CTLMTI_LEN = 4;
  	/**
	 * serializeIp90354L1Ctlmti
	 */
	protected void serializeIp90354L1Ctlmti(int ip90354L1Ctlmti) {
		 putNumber(beginIp90354L1Ctlmti,ip90354L1Ctlmti,IP_90354_L_1_CTLMTI_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90354L1CtlmtiCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90354L1Ctlmti
	 */
   	protected  int serializeIp90354L1Ctlmti(char[] value) {
	    int  ip90354L1Ctlmti;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90354L1Ctlmti = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp90354L1Ctlmti
		       ,4
		      );
		 localIp90354L1CtlmtiCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90354L1Ctlmti;
    }

   protected int checkIp90354L1CtlmtiMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90354L1Ctlmti is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90354L1Ctlmti() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90354L1Ctlmti
			                 ,IP_90354_L_1_CTLMTI_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90354L1Ctlmti", beginIp90354L1Ctlmti,IP_90354_L_1_CTLMTI_LEN);
    }
   	}
     int localIp90354L1CtlfuncCounter = -1;
     public boolean isIp90354L1CtlfuncModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp90354L1CtlfuncCounter != sharedCounter;
         localIp90354L1CtlfuncCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip90354L1Ctlfunc
	 *	@return ip90354L1Ctlfunc
	 */
	public char[]  getIp90354L1CtlfuncString() {
	     return getCharArray(beginIp90354L1Ctlfunc,IP_90354_L_1_CTLFUNC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip90354L1CtlfuncIsNumeric() {
	    return isNumeric(beginIp90354L1Ctlfunc
	                    ,beginIp90354L1Ctlfunc + IP_90354_L_1_CTLFUNC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_90354_L_1_CTLFUNC_LEN = 3;
  	/**
	 * serializeIp90354L1Ctlfunc
	 */
	protected void serializeIp90354L1Ctlfunc(int ip90354L1Ctlfunc) {
		 putNumber(beginIp90354L1Ctlfunc,ip90354L1Ctlfunc,IP_90354_L_1_CTLFUNC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp90354L1CtlfuncCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp90354L1Ctlfunc
	 */
   	protected  int serializeIp90354L1Ctlfunc(char[] value) {
	    int  ip90354L1Ctlfunc;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip90354L1Ctlfunc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp90354L1Ctlfunc
		       ,3
		      );
		 localIp90354L1CtlfuncCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip90354L1Ctlfunc;
    }

   protected int checkIp90354L1CtlfuncMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp90354L1Ctlfunc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp90354L1Ctlfunc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp90354L1Ctlfunc
			                 ,IP_90354_L_1_CTLFUNC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip90354L1Ctlfunc", beginIp90354L1Ctlfunc,IP_90354_L_1_CTLFUNC_LEN);
    }
   	}




}
  
