package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50004iReadTableIdRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50004iReadTableIdRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50004iReadTableIdRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50004I_READ_TABLE_ID_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50004iReadTableNum;
	
	/**
	* Constructor for Ip50004iReadTableIdRedefinedSerialized
	**/
    public Ip50004iReadTableIdRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50004iReadTableIdRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iReadTableIdRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50004iReadTableIdRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip50004iReadTableIdRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip50004iReadTableIdRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50004I_READ_TABLE_ID_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp50004iReadTableNum = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp50004iReadTableNumCounter = -1;
     public boolean isIp50004iReadTableNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50004iReadTableNumCounter != sharedCounter;
         localIp50004iReadTableNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip50004iReadTableNum
	 *	@return ip50004iReadTableNum
	 */
	public char[]  getIp50004iReadTableNumString() {
	     return getCharArray(beginIp50004iReadTableNum,IP_50004I_READ_TABLE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50004iReadTableNumIsNumeric() {
	    return isNumeric(beginIp50004iReadTableNum
	                    ,beginIp50004iReadTableNum + IP_50004I_READ_TABLE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_50004I_READ_TABLE_NUM_LEN = 4;
  	/**
	 * serializeIp50004iReadTableNum
	 */
	protected void serializeIp50004iReadTableNum(int ip50004iReadTableNum) {
		 putNumber(beginIp50004iReadTableNum,ip50004iReadTableNum,IP_50004I_READ_TABLE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp50004iReadTableNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp50004iReadTableNum
	 */
   	protected  int serializeIp50004iReadTableNum(char[] value) {
	    int  ip50004iReadTableNum;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip50004iReadTableNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp50004iReadTableNum
		       ,4
		      );
		 localIp50004iReadTableNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip50004iReadTableNum;
    }

   protected int checkIp50004iReadTableNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp50004iReadTableNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp50004iReadTableNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp50004iReadTableNum
			                 ,IP_50004I_READ_TABLE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip50004iReadTableNum", beginIp50004iReadTableNum,IP_50004I_READ_TABLE_NUM_LEN);
    }
   	}




}
  
