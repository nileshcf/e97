package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class SetlAmt110860Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SetlAmt110860Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SetlAmt110860Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SETL_AMT_110860_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSetlAmt110d860;
	
	/**
	* Constructor for SetlAmt110860Serialized
	**/
    public SetlAmt110860Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SetlAmt110860Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SetlAmt110860Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SetlAmt110860Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,37); // serialize this field at offset 37 by default 
    }
    
	/**
	* sets parent for this SetlAmt110860Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 37 by default
    }    
	/**
	* initializes the field in SetlAmt110860Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SETL_AMT_110860_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSetlAmt110d860 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSetlAmt110d860Counter = -1;
     
     public boolean isSetlAmt110d860Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetlAmt110d860Counter != sharedCounter;
         localSetlAmt110d860Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of setlAmt110d860
	 *	@return setlAmt110d860
	 */
	public char[]  getSetlAmt110d860String() {
	    return getCharArray(beginSetlAmt110d860,SETL_AMT_110D_860_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean setlAmt110d860IsNumeric() {
		    return isNumeric(beginSetlAmt110d860
	                    ,beginSetlAmt110d860 + SETL_AMT_110D_860_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SETL_AMT_110D_860_LEN = 12;
  protected  static final int SETL_AMT_110D_860_SCALE = 2;

   protected BigDecimal checkSetlAmt110d860MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSetlAmt110d860
	 */
	protected void serializeSetlAmt110d860(BigDecimal setlAmt110d860) {
	       putNumber(beginSetlAmt110d860,setlAmt110d860,SETL_AMT_110D_860_LEN,SETL_AMT_110D_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSetlAmt110d860Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSetlAmt110d860
	 */
   	protected  BigDecimal serializeSetlAmt110d860(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSetlAmt110d860
		       ,12
		      );		 localSetlAmt110d860Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SETL_AMT_110D_860_LEN,SETL_AMT_110D_860_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("setlAmt110d860", beginSetlAmt110d860,SETL_AMT_110D_860_LEN);
    	}
    }
    /**
	 *	refreshSetlAmt110d860 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSetlAmt110d860() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSetlAmt110d860
			            ,SETL_AMT_110D_860_LEN
			            ,SETL_AMT_110D_860_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("setlAmt110d860", beginSetlAmt110d860,SETL_AMT_110D_860_LEN);
    }
   	}




}
  
