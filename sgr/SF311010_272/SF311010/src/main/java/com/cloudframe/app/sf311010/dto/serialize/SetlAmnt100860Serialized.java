package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class SetlAmnt100860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SetlAmnt100860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SetlAmnt100860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SETL_AMNT_100860_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSetlAmt100d860;
	
	/**
	* Constructor for SetlAmnt100860Serialized
	**/
    public SetlAmnt100860Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SetlAmnt100860Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SetlAmnt100860Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SetlAmnt100860Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,375); // serialize this field at offset 375 by default 
    }
    
	/**
	* sets parent for this SetlAmnt100860Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 375 by default
    }    
	/**
	* initializes the field in SetlAmnt100860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SETL_AMNT_100860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSetlAmt100d860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSetlAmt100d860Counter = -1;
     
     public boolean isSetlAmt100d860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetlAmt100d860Counter != sharedCounter;
         localSetlAmt100d860Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of setlAmt100d860
	 *	@return setlAmt100d860
	 */
	public char[]  getSetlAmt100d860String() {
	    return getCharArray(beginSetlAmt100d860,SETL_AMT_100D_860_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean setlAmt100d860IsNumeric() {
		    return isNumeric(beginSetlAmt100d860
	                    ,beginSetlAmt100d860 + SETL_AMT_100D_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SETL_AMT_100D_860_LEN = 12;
  protected  static final int SETL_AMT_100D_860_SCALE = 2;

   protected BigDecimal checkSetlAmt100d860MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSetlAmt100d860
	 */
	protected void serializeSetlAmt100d860(BigDecimal setlAmt100d860) {
	       putNumber(beginSetlAmt100d860,setlAmt100d860,SETL_AMT_100D_860_LEN,SETL_AMT_100D_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSetlAmt100d860Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSetlAmt100d860
	 */
   	protected  BigDecimal serializeSetlAmt100d860(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSetlAmt100d860
		       ,12
		      );		 localSetlAmt100d860Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SETL_AMT_100D_860_LEN,SETL_AMT_100D_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("setlAmt100d860", beginSetlAmt100d860,SETL_AMT_100D_860_LEN);
    	}
    }
    /**
	 *	refreshSetlAmt100d860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSetlAmt100d860() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSetlAmt100d860
			            ,SETL_AMT_100D_860_LEN
			            ,SETL_AMT_100D_860_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("setlAmt100d860", beginSetlAmt100d860,SETL_AMT_100D_860_LEN);
    }
   	}




}
  
