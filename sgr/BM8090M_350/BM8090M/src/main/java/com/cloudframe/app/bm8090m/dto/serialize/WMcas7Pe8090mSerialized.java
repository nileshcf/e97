package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WMcas7Pe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WMcas7Pe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WMcas7Pe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_MCAS_7_PE_8090M_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWMcas71Pe8090m;
            protected  int beginWMcas7pPe8090m;
	
	/**
	* Constructor for WMcas7Pe8090mSerialized
	**/
    public WMcas7Pe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WMcas7Pe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WMcas7Pe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WMcas7Pe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3090); // serialize this field at offset 3090 by default 
    }
    
	/**
	* sets parent for this WMcas7Pe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3090 by default
    }    
	/**
	* initializes the field in WMcas7Pe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_MCAS_7_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWMcas71Pe8090m = getStartOffset() + 1;	// set offset for serialization
  
             beginWMcas7pPe8090m = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWMcas71Pe8090mCounter = -1;
     public boolean isWMcas71Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcas71Pe8090mCounter != sharedCounter;
         localWMcas71Pe8090mCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wMcas71Pe8090m
	 *	@return wMcas71Pe8090m
	 */
	public char[]  getWMcas71Pe8090mString() {
	     return getCharArray(beginWMcas71Pe8090m,W_MCAS_71_PE_8090M_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wMcas71Pe8090mIsNumeric() {
	    return isNumeric(beginWMcas71Pe8090m
	                    ,beginWMcas71Pe8090m + W_MCAS_71_PE_8090M_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_MCAS_71_PE_8090M_LEN = 1;
  	/**
	 * serializeWMcas71Pe8090m
	 */
	protected void serializeWMcas71Pe8090m(int wMcas71Pe8090m) {
		 putNumber(beginWMcas71Pe8090m,wMcas71Pe8090m,W_MCAS_71_PE_8090M_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWMcas71Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWMcas71Pe8090m
	 */
   	protected  int serializeWMcas71Pe8090m(char[] value) {
	    int  wMcas71Pe8090m;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wMcas71Pe8090m = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWMcas71Pe8090m
		       ,1
		      );
		 localWMcas71Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
		return  wMcas71Pe8090m;
    }

   protected int checkWMcas71Pe8090mMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWMcas71Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWMcas71Pe8090m() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWMcas71Pe8090m
			                 ,W_MCAS_71_PE_8090M_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wMcas71Pe8090m", beginWMcas71Pe8090m,W_MCAS_71_PE_8090M_LEN);
    }
   	}
     int localWMcas7pPe8090mCounter = -1;
     public boolean isWMcas7pPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMcas7pPe8090mCounter != sharedCounter;
         localWMcas7pPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_MCAS_7P_PE_8090M_LEN = 10;
	/**
	 * 	serialize this WMcas7pPe8090m
	 */
   protected void serializeWMcas7pPe8090m(char[] wMcas7pPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wMcas7pPe8090m,0,getStringValue(),beginWMcas7pPe8090m,W_MCAS_7P_PE_8090M_LEN);
       localWMcas7pPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWMcas7pPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWMcas7pPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWMcas7pPe8090m() {	 
   		return (substring(getStringValue(),beginWMcas7pPe8090m,beginWMcas7pPe8090m + W_MCAS_7P_PE_8090M_LEN));
   	}




}
  
