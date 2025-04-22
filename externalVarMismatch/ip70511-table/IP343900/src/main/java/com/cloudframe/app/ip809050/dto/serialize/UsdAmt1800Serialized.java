package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class UsdAmt1800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UsdAmt1800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UsdAmt1800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int USD_AMT_1800_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUsdAmt800;
            protected  int beginUsdAmtDec800;
	
	/**
	* Constructor for UsdAmt1800Serialized
	**/
    public UsdAmt1800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for UsdAmt1800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UsdAmt1800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this UsdAmt1800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,376); // serialize this field at offset 376 by default 
    }
    
	/**
	* sets parent for this UsdAmt1800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 376 by default
    }    
	/**
	* initializes the field in UsdAmt1800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(USD_AMT_1800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUsdAmt800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginUsdAmtDec800 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUsdAmt800Counter = -1;
     public boolean isUsdAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsdAmt800Counter != sharedCounter;
         localUsdAmt800Counter = sharedCounter; return hasModified;
     }
	protected static final int USD_AMT_800_LEN = 10;
	/**
	 * 	serialize this UsdAmt800
	 */
   protected void serializeUsdAmt800(char[] usdAmt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usdAmt800,0,getStringValue(),beginUsdAmt800,USD_AMT_800_LEN);
       localUsdAmt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsdAmt800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshUsdAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsdAmt800() {	 
   		return (substring(getStringValue(),beginUsdAmt800,beginUsdAmt800 + USD_AMT_800_LEN));
   	}
     int localUsdAmtDec800Counter = -1;
     public boolean isUsdAmtDec800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsdAmtDec800Counter != sharedCounter;
         localUsdAmtDec800Counter = sharedCounter; return hasModified;
     }
	protected static final int USD_AMT_DEC_800_LEN = 2;
	/**
	 * 	serialize this UsdAmtDec800
	 */
   protected void serializeUsdAmtDec800(char[] usdAmtDec800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usdAmtDec800,0,getStringValue(),beginUsdAmtDec800,USD_AMT_DEC_800_LEN);
       localUsdAmtDec800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsdAmtDec800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshUsdAmtDec800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsdAmtDec800() {	 
   		return (substring(getStringValue(),beginUsdAmtDec800,beginUsdAmtDec800 + USD_AMT_DEC_800_LEN));
   	}




}
  
