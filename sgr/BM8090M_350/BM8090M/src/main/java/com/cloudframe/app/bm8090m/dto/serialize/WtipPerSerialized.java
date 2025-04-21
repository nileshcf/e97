package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WtipPerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtipPerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtipPerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WTIP_PER_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWPer;
	
	/**
	* Constructor for WtipPerSerialized
	**/
    public WtipPerSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WtipPerSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtipPerSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WtipPerSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WtipPerSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WtipPerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WTIP_PER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWPer = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWPerCounter = -1;
     public boolean isWPerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPerCounter != sharedCounter;
         localWPerCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wPer
	 *	@return wPer
	 */
	public char[]  getWPerString() {
	     return getCharArray(beginWPer,W_PER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wPerIsNumeric() {
	    return isNumeric(beginWPer
	                    ,beginWPer + W_PER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_PER_LEN = 1;
  	/**
	 * serializeWPer
	 */
	protected void serializeWPer(int wPer) {
		 putNumber(beginWPer,wPer,W_PER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWPerCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWPer
	 */
   	protected  int serializeWPer(char[] value) {
	    int  wPer;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wPer = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWPer
		       ,1
		      );
		 localWPerCounter = shareString.getSerializedField().getModifiedCounter();
		return  wPer;
    }

   protected int checkWPerMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWPer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWPer() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWPer
			                 ,W_PER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wPer", beginWPer,W_PER_LEN);
    }
   	}




}
  
