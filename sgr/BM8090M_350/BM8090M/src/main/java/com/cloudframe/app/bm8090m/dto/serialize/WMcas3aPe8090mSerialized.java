package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WMcas3aPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WMcas3aPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WMcas3aPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_MCAS_3A_PE_8090M_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWMcas32Pe8090m;
	
	/**
	* Constructor for WMcas3aPe8090mSerialized
	**/
    public WMcas3aPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WMcas3aPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas3aPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WMcas3aPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2943); // serialize this field at offset 2943 by default 
    }
    
	/**
	* sets parent for this WMcas3aPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2943 by default
    }    
	/**
	* initializes the field in WMcas3aPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_MCAS_3A_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWMcas32Pe8090m = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWMcas32Pe8090mCounter = -1;
     public boolean isWMcas32Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcas32Pe8090mCounter != sharedCounter;
         localWMcas32Pe8090mCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wMcas32Pe8090m
	 *	@return wMcas32Pe8090m
	 */
	public char[]  getWMcas32Pe8090mString() {
	     return getCharArray(beginWMcas32Pe8090m,W_MCAS_32_PE_8090M_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas32Pe8090mIsNumeric() {
	    return isNumeric(beginWMcas32Pe8090m
	                    ,beginWMcas32Pe8090m + W_MCAS_32_PE_8090M_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_MCAS_32_PE_8090M_LEN = 2;
  	/**
	 * serializeWMcas32Pe8090m
	 */
	protected void serializeWMcas32Pe8090m(int wMcas32Pe8090m) {
		 putNumber(beginWMcas32Pe8090m,wMcas32Pe8090m,W_MCAS_32_PE_8090M_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWMcas32Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWMcas32Pe8090m
	 */
   	protected  int serializeWMcas32Pe8090m(char[] value) {
	    int  wMcas32Pe8090m;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wMcas32Pe8090m = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWMcas32Pe8090m
		       ,2
		      );
		 localWMcas32Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
		return  wMcas32Pe8090m;
    }

   protected int checkWMcas32Pe8090mMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWMcas32Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWMcas32Pe8090m() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWMcas32Pe8090m
			                 ,W_MCAS_32_PE_8090M_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wMcas32Pe8090m", beginWMcas32Pe8090m,W_MCAS_32_PE_8090M_LEN);
    }
   	}




}
  
