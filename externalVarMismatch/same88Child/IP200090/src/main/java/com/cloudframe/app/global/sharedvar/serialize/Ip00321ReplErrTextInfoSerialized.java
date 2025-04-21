package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00321ReplErrTextInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00321ReplErrTextInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00321ReplErrTextInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00321_REPL_ERR_TEXT_INFO_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00321ReplTextCount;
           protected int beginIp00321ReplTextIndicators;
           protected static final int IP_00321_REPL_TEXT_INDICATORS_SIZE = 5;
	
	/**
	* Constructor for Ip00321ReplErrTextInfoSerialized
	**/
    public Ip00321ReplErrTextInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00321ReplErrTextInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ReplErrTextInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00321ReplErrTextInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,176041); // serialize this field at offset 176041 by default 
    }
    
	/**
	* sets parent for this Ip00321ReplErrTextInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 176041 by default
    }    
	/**
	* initializes the field in Ip00321ReplErrTextInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00321_REPL_ERR_TEXT_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00321ReplTextCount = getStartOffset() + 0;	// set offset for serialization
  
	        beginIp00321ReplTextIndicators = getStartOffset() + 1; // set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00321ReplTextCountCounter = -1;
     public boolean isIp00321ReplTextCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ReplTextCountCounter != sharedCounter;
         localIp00321ReplTextCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public char[]  getIp00321ReplTextCountString() {
	     return getCharArray(beginIp00321ReplTextCount,IP_00321_REPL_TEXT_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ReplTextCountIsNumeric() {
	    return isNumeric(beginIp00321ReplTextCount
	                    ,beginIp00321ReplTextCount + IP_00321_REPL_TEXT_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00321_REPL_TEXT_COUNT_LEN = 1;
  	/**
	 * serializeIp00321ReplTextCount
	 */
	protected void serializeIp00321ReplTextCount(int ip00321ReplTextCount) {
		 putNumber(beginIp00321ReplTextCount,ip00321ReplTextCount,IP_00321_REPL_TEXT_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00321ReplTextCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00321ReplTextCount
	 */
   	protected  int serializeIp00321ReplTextCount(char[] value) {
	    int  ip00321ReplTextCount;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00321ReplTextCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00321ReplTextCount
		       ,1
		      );
		 localIp00321ReplTextCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00321ReplTextCount;
    }

   protected int checkIp00321ReplTextCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00321ReplTextCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00321ReplTextCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00321ReplTextCount
			                 ,IP_00321_REPL_TEXT_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00321ReplTextCount", beginIp00321ReplTextCount,IP_00321_REPL_TEXT_COUNT_LEN);
    }
   	}

		public int ip00321ReplTextIndicatorsSize() {
			return IP_00321_REPL_TEXT_INDICATORS_SIZE;
		}



}
  
