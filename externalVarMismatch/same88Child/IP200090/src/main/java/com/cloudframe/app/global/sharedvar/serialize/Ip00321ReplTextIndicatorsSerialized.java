package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00321ReplTextIndicatorsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00321ReplTextIndicatorsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00321ReplTextIndicatorsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00321_REPL_TEXT_INDICATORS_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00321ReplTextInd;
	
	/**
	* Constructor for Ip00321ReplTextIndicatorsSerialized
	**/
    public Ip00321ReplTextIndicatorsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00321ReplTextIndicatorsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ReplTextIndicatorsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00321ReplTextIndicatorsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,176042); // serialize this field at offset 176042 by default 
    }
    
	/**
	* sets parent for this Ip00321ReplTextIndicatorsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 176042 by default
    }    
	/**
	* initializes the field in Ip00321ReplTextIndicatorsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00321_REPL_TEXT_INDICATORS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00321ReplTextInd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00321ReplTextIndCounter = -1;
     public boolean isIp00321ReplTextIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00321ReplTextIndCounter != sharedCounter;
         localIp00321ReplTextIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00321ReplTextInd
	 *	@return ip00321ReplTextInd
	 */
	public char[]  getIp00321ReplTextIndString() {
	     return getCharArray(beginIp00321ReplTextInd,IP_00321_REPL_TEXT_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00321ReplTextIndIsNumeric() {
	    return isNumeric(beginIp00321ReplTextInd
	                    ,beginIp00321ReplTextInd + IP_00321_REPL_TEXT_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00321_REPL_TEXT_IND_LEN = 1;
  	/**
	 * serializeIp00321ReplTextInd
	 */
	protected void serializeIp00321ReplTextInd(int ip00321ReplTextInd) {
		 putNumber(beginIp00321ReplTextInd,ip00321ReplTextInd,IP_00321_REPL_TEXT_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00321ReplTextIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00321ReplTextInd
	 */
   	protected  int serializeIp00321ReplTextInd(char[] value) {
	    int  ip00321ReplTextInd;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00321ReplTextInd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginIp00321ReplTextInd
		       ,1
		      );
		 localIp00321ReplTextIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00321ReplTextInd;
    }

   protected int checkIp00321ReplTextIndMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00321ReplTextInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00321ReplTextInd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00321ReplTextInd
			                 ,IP_00321_REPL_TEXT_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00321ReplTextInd", beginIp00321ReplTextInd,IP_00321_REPL_TEXT_IND_LEN);
    }
   	}




}
  
