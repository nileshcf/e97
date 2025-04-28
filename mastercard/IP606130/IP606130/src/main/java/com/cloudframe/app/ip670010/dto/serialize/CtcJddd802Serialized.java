package com.cloudframe.app.ip670010.dto.serialize;

/**
*  The class CtcJddd802Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CtcJddd802Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CtcJddd802Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CTC_JDDD_802_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCtcJDdd80201;
	
	/**
	* Constructor for CtcJddd802Serialized
	**/
    public CtcJddd802Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CtcJddd802Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcJddd802Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CtcJddd802Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this CtcJddd802Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in CtcJddd802Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CTC_JDDD_802_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCtcJDdd80201 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCtcJDdd80201Counter = -1;
     public boolean isCtcJDdd80201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtcJDdd80201Counter != sharedCounter;
         localCtcJDdd80201Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ctcJDdd80201
	 *	@return ctcJDdd80201
	 */
	public char[]  getCtcJDdd80201String() {
	     return getCharArray(beginCtcJDdd80201,CTC_JDDD_80201_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcJDdd80201IsNumeric() {
	    return isNumeric(beginCtcJDdd80201
	                    ,beginCtcJDdd80201 + CTC_JDDD_80201_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CTC_JDDD_80201_LEN = 3;
  	/**
	 * serializeCtcJDdd80201
	 */
	protected void serializeCtcJDdd80201(int ctcJDdd80201) {
		 putNumber(beginCtcJDdd80201,ctcJDdd80201,CTC_JDDD_80201_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCtcJDdd80201Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCtcJDdd80201
	 */
   	protected  int serializeCtcJDdd80201(char[] value) {
	    int  ctcJDdd80201;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ctcJDdd80201 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCtcJDdd80201
		       ,3
		      );
		 localCtcJDdd80201Counter = shareString.getSerializedField().getModifiedCounter();
		return  ctcJDdd80201;
    }

   protected int checkCtcJDdd80201MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCtcJDdd80201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtcJDdd80201() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCtcJDdd80201
			                 ,CTC_JDDD_80201_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ctcJDdd80201", beginCtcJDdd80201,CTC_JDDD_80201_LEN);
    }
   	}




}
  
