package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002Date2RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002Date2RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002Date2RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_DATE_2_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Ccyy2;
	
	/**
	* Constructor for Ip67002Date2RedefinedSerialized
	**/
    public Ip67002Date2RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002Date2RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Date2RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002Date2RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this Ip67002Date2RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in Ip67002Date2RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_DATE_2_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002Ccyy2 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localIp67002Ccyy2Counter = -1;
     public boolean isIp67002Ccyy2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002Ccyy2Counter != sharedCounter;
         localIp67002Ccyy2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Ccyy2
	 *	@return ip67002Ccyy2
	 */
	public char[]  getIp67002Ccyy2String() {
	     return getCharArray(beginIp67002Ccyy2,IP_67002_CCYY_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Ccyy2IsNumeric() {
	    return isNumeric(beginIp67002Ccyy2
	                    ,beginIp67002Ccyy2 + IP_67002_CCYY_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_CCYY_2_LEN = 4;
  	/**
	 * serializeIp67002Ccyy2
	 */
	protected void serializeIp67002Ccyy2(int ip67002Ccyy2) {
		 putNumber(beginIp67002Ccyy2,ip67002Ccyy2,IP_67002_CCYY_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002Ccyy2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Ccyy2
	 */
   	protected  int serializeIp67002Ccyy2(char[] value) {
	    int  ip67002Ccyy2;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Ccyy2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp67002Ccyy2
		       ,4
		      );
		 localIp67002Ccyy2Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Ccyy2;
    }

   protected int checkIp67002Ccyy2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Ccyy2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Ccyy2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Ccyy2
			                 ,IP_67002_CCYY_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Ccyy2", beginIp67002Ccyy2,IP_67002_CCYY_2_LEN);
    }
   	}




}
  
