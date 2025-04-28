package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WMcat3Pe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WMcat3Pe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WMcat3Pe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_MCAT_3_PE_8090M_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWMcat31Pe8090m;
	
	/**
	* Constructor for WMcat3Pe8090mSerialized
	**/
    public WMcat3Pe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WMcat3Pe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcat3Pe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WMcat3Pe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2964); // serialize this field at offset 2964 by default 
    }
    
	/**
	* sets parent for this WMcat3Pe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2964 by default
    }    
	/**
	* initializes the field in WMcat3Pe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_MCAT_3_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWMcat31Pe8090m = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWMcat31Pe8090mCounter = -1;
     public boolean isWMcat31Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcat31Pe8090mCounter != sharedCounter;
         localWMcat31Pe8090mCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wMcat31Pe8090m
	 *	@return wMcat31Pe8090m
	 */
	public char[]  getWMcat31Pe8090mString() {
	     return getCharArray(beginWMcat31Pe8090m,W_MCAT_31_PE_8090M_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcat31Pe8090mIsNumeric() {
	    return isNumeric(beginWMcat31Pe8090m
	                    ,beginWMcat31Pe8090m + W_MCAT_31_PE_8090M_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_MCAT_31_PE_8090M_LEN = 1;
  	/**
	 * serializeWMcat31Pe8090m
	 */
	protected void serializeWMcat31Pe8090m(int wMcat31Pe8090m) {
		 putNumber(beginWMcat31Pe8090m,wMcat31Pe8090m,W_MCAT_31_PE_8090M_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWMcat31Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWMcat31Pe8090m
	 */
   	protected  int serializeWMcat31Pe8090m(char[] value) {
	    int  wMcat31Pe8090m;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wMcat31Pe8090m = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWMcat31Pe8090m
		       ,1
		      );
		 localWMcat31Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
		return  wMcat31Pe8090m;
    }

   protected int checkWMcat31Pe8090mMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWMcat31Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWMcat31Pe8090m() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWMcat31Pe8090m
			                 ,W_MCAT_31_PE_8090M_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wMcat31Pe8090m", beginWMcat31Pe8090m,W_MCAT_31_PE_8090M_LEN);
    }
   	}




}
  
