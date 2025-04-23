package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class CtcCcyy2802RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CtcCcyy2802RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CtcCcyy2802RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CTC_CCYY_2802_REDEFINED_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCtcCc2802;
            protected  int beginCtcCcx2802;
	
	/**
	* Constructor for CtcCcyy2802RedefinedSerialized
	**/
    public CtcCcyy2802RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CtcCcyy2802RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcCcyy2802RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CtcCcyy2802RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CtcCcyy2802RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CtcCcyy2802RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CTC_CCYY_2802_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCtcCc2802 = getStartOffset() + 0;	// set offset for serialization
  
             beginCtcCcx2802 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCtcCc2802Counter = -1;
     public boolean isCtcCc2802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcCc2802Counter != sharedCounter;
         localCtcCc2802Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ctcCc2802
	 *	@return ctcCc2802
	 */
	public char[]  getCtcCc2802String() {
	     return getCharArray(beginCtcCc2802,CTC_CC_2802_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcCc2802IsNumeric() {
	    return isNumeric(beginCtcCc2802
	                    ,beginCtcCc2802 + CTC_CC_2802_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CTC_CC_2802_LEN = 2;
  	/**
	 * serializeCtcCc2802
	 */
	protected void serializeCtcCc2802(int ctcCc2802) {
		 putNumber(beginCtcCc2802,ctcCc2802,CTC_CC_2802_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCtcCc2802Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCtcCc2802
	 */
   	protected  int serializeCtcCc2802(char[] value) {
	    int  ctcCc2802;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ctcCc2802 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCtcCc2802
		       ,2
		      );
		 localCtcCc2802Counter = shareString.getSerializedField().getModifiedCounter();
		return  ctcCc2802;
    }

   protected int checkCtcCc2802MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCtcCc2802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtcCc2802() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCtcCc2802
			                 ,CTC_CC_2802_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ctcCc2802", beginCtcCc2802,CTC_CC_2802_LEN);
    }
   	}
     int localCtcCcx2802Counter = -1;
     public boolean isCtcCcx2802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcCcx2802Counter != sharedCounter;
         localCtcCcx2802Counter = sharedCounter; return hasModified;
     }
	protected static final int CTC_CCX_2802_LEN = 2;
	/**
	 * 	serialize this CtcCcx2802
	 */
   protected void serializeCtcCcx2802(char[] ctcCcx2802) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ctcCcx2802,0,getStringValue(),beginCtcCcx2802,CTC_CCX_2802_LEN);
       localCtcCcx2802Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCtcCcx2802Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCtcCcx2802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCtcCcx2802() {	 
   		return (substring(getStringValue(),beginCtcCcx2802,beginCtcCcx2802 + CTC_CCX_2802_LEN));
   	}




}
  
