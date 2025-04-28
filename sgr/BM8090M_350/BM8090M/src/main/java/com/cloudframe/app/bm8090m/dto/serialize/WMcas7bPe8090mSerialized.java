package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WMcas7bPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WMcas7bPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WMcas7bPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_MCAS_7B_PE_8090M_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWMcas73Pe8090m;
	
	/**
	* Constructor for WMcas7bPe8090mSerialized
	**/
    public WMcas7bPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WMcas7bPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7bPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WMcas7bPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3115); // serialize this field at offset 3115 by default 
    }
    
	/**
	* sets parent for this WMcas7bPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3115 by default
    }    
	/**
	* initializes the field in WMcas7bPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_MCAS_7B_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWMcas73Pe8090m = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWMcas73Pe8090mCounter = -1;
     public boolean isWMcas73Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcas73Pe8090mCounter != sharedCounter;
         localWMcas73Pe8090mCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wMcas73Pe8090m
	 *	@return wMcas73Pe8090m
	 */
	public char[]  getWMcas73Pe8090mString() {
	     return getCharArray(beginWMcas73Pe8090m,W_MCAS_73_PE_8090M_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas73Pe8090mIsNumeric() {
	    return isNumeric(beginWMcas73Pe8090m
	                    ,beginWMcas73Pe8090m + W_MCAS_73_PE_8090M_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_MCAS_73_PE_8090M_LEN = 3;
  	/**
	 * serializeWMcas73Pe8090m
	 */
	protected void serializeWMcas73Pe8090m(int wMcas73Pe8090m) {
		 putNumber(beginWMcas73Pe8090m,wMcas73Pe8090m,W_MCAS_73_PE_8090M_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWMcas73Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWMcas73Pe8090m
	 */
   	protected  int serializeWMcas73Pe8090m(char[] value) {
	    int  wMcas73Pe8090m;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wMcas73Pe8090m = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginWMcas73Pe8090m
		       ,3
		      );
		 localWMcas73Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
		return  wMcas73Pe8090m;
    }

   protected int checkWMcas73Pe8090mMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWMcas73Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWMcas73Pe8090m() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWMcas73Pe8090m
			                 ,W_MCAS_73_PE_8090M_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wMcas73Pe8090m", beginWMcas73Pe8090m,W_MCAS_73_PE_8090M_LEN);
    }
   	}




}
  
