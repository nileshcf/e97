package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004TableIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004TableIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004TableIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_TABLE_ID_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf20004TableNo;
	
	/**
	* Constructor for Cf20004TableIdSerialized
	**/
    public Cf20004TableIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004TableIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004TableIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Cf20004TableIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Cf20004TableIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_TABLE_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCf20004TableNo = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCf20004TableNoCounter = -1;
     public boolean isCf20004TableNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004TableNoCounter != sharedCounter;
         localCf20004TableNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cf20004TableNo
	 *	@return cf20004TableNo
	 */
	public char[]  getCf20004TableNoString() {
	     return getCharArray(beginCf20004TableNo,CF_20004_TABLE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cf20004TableNoIsNumeric() {
	    return isNumeric(beginCf20004TableNo
	                    ,beginCf20004TableNo + CF_20004_TABLE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CF_20004_TABLE_NO_LEN = 4;
  	/**
	 * serializeCf20004TableNo
	 */
	protected void serializeCf20004TableNo(int cf20004TableNo) {
		 putNumber(beginCf20004TableNo,cf20004TableNo,CF_20004_TABLE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCf20004TableNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCf20004TableNo
	 */
   	protected  int serializeCf20004TableNo(char[] value) {
	    int  cf20004TableNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cf20004TableNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCf20004TableNo
		       ,4
		      );
		 localCf20004TableNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  cf20004TableNo;
    }

   protected int checkCf20004TableNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCf20004TableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCf20004TableNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCf20004TableNo
			                 ,CF_20004_TABLE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cf20004TableNo", beginCf20004TableNo,CF_20004_TABLE_NO_LEN);
    }
   	}




}
  
