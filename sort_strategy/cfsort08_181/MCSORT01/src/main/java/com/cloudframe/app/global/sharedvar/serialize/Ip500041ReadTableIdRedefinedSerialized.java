package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip500041ReadTableIdRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip500041ReadTableIdRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip500041ReadTableIdRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_500041_READ_TABLE_ID_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp500041ReadTableNum;
	
	/**
	* Constructor for Ip500041ReadTableIdRedefinedSerialized
	**/
    public Ip500041ReadTableIdRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip500041ReadTableIdRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041ReadTableIdRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip500041ReadTableIdRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip500041ReadTableIdRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip500041ReadTableIdRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_500041_READ_TABLE_ID_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp500041ReadTableNum = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp500041ReadTableNumCounter = -1;
     public boolean isIp500041ReadTableNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp500041ReadTableNumCounter != sharedCounter;
         localIp500041ReadTableNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip500041ReadTableNum
	 *	@return ip500041ReadTableNum
	 */
	public char[]  getIp500041ReadTableNumString() {
	     return getCharArray(beginIp500041ReadTableNum,IP_500041_READ_TABLE_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip500041ReadTableNumIsNumeric() {
	    return isNumeric(beginIp500041ReadTableNum
	                    ,beginIp500041ReadTableNum + IP_500041_READ_TABLE_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_500041_READ_TABLE_NUM_LEN = 4;
  	/**
	 * serializeIp500041ReadTableNum
	 */
	protected void serializeIp500041ReadTableNum(int ip500041ReadTableNum) {
		 putNumber(beginIp500041ReadTableNum,ip500041ReadTableNum,IP_500041_READ_TABLE_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp500041ReadTableNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp500041ReadTableNum
	 */
   	protected  int serializeIp500041ReadTableNum(char[] value) {
	    int  ip500041ReadTableNum;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip500041ReadTableNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp500041ReadTableNum
		       ,4
		      );
		 localIp500041ReadTableNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip500041ReadTableNum;
    }

   protected int checkIp500041ReadTableNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp500041ReadTableNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp500041ReadTableNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp500041ReadTableNum
			                 ,IP_500041_READ_TABLE_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip500041ReadTableNum", beginIp500041ReadTableNum,IP_500041_READ_TABLE_NUM_LEN);
    }
   	}




}
  
