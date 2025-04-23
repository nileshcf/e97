package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WMcas6Pe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WMcas6Pe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WMcas6Pe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_MCAS_6_PE_8090M_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWMcas61Pe8090m;
            protected  int beginWMcas6pPe8090m;
	
	/**
	* Constructor for WMcas6Pe8090mSerialized
	**/
    public WMcas6Pe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WMcas6Pe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas6Pe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WMcas6Pe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2994); // serialize this field at offset 2994 by default 
    }
    
	/**
	* sets parent for this WMcas6Pe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2994 by default
    }    
	/**
	* initializes the field in WMcas6Pe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_MCAS_6_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWMcas61Pe8090m = getStartOffset() + 4;	// set offset for serialization
  
             beginWMcas6pPe8090m = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWMcas61Pe8090mCounter = -1;
     public boolean isWMcas61Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcas61Pe8090mCounter != sharedCounter;
         localWMcas61Pe8090mCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wMcas61Pe8090m
	 *	@return wMcas61Pe8090m
	 */
	public char[]  getWMcas61Pe8090mString() {
	     return getCharArray(beginWMcas61Pe8090m,W_MCAS_61_PE_8090M_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas61Pe8090mIsNumeric() {
	    return isNumeric(beginWMcas61Pe8090m
	                    ,beginWMcas61Pe8090m + W_MCAS_61_PE_8090M_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_MCAS_61_PE_8090M_LEN = 1;
  	/**
	 * serializeWMcas61Pe8090m
	 */
	protected void serializeWMcas61Pe8090m(int wMcas61Pe8090m) {
		 putNumber(beginWMcas61Pe8090m,wMcas61Pe8090m,W_MCAS_61_PE_8090M_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWMcas61Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWMcas61Pe8090m
	 */
   	protected  int serializeWMcas61Pe8090m(char[] value) {
	    int  wMcas61Pe8090m;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wMcas61Pe8090m = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWMcas61Pe8090m
		       ,1
		      );
		 localWMcas61Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
		return  wMcas61Pe8090m;
    }

   protected int checkWMcas61Pe8090mMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWMcas61Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWMcas61Pe8090m() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWMcas61Pe8090m
			                 ,W_MCAS_61_PE_8090M_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wMcas61Pe8090m", beginWMcas61Pe8090m,W_MCAS_61_PE_8090M_LEN);
    }
   	}
     int localWMcas6pPe8090mCounter = -1;
     public boolean isWMcas6pPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcas6pPe8090mCounter != sharedCounter;
         localWMcas6pPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_MCAS_6P_PE_8090M_LEN = 10;
	/**
	 * 	serialize this WMcas6pPe8090m
	 */
   protected void serializeWMcas6pPe8090m(char[] wMcas6pPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wMcas6pPe8090m,0,getStringValue(),beginWMcas6pPe8090m,W_MCAS_6P_PE_8090M_LEN);
       localWMcas6pPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWMcas6pPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWMcas6pPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWMcas6pPe8090m() {	 
   		return (substring(getStringValue(),beginWMcas6pPe8090m,beginWMcas6pPe8090m + W_MCAS_6P_PE_8090M_LEN));
   	}




}
  
