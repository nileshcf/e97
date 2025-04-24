package com.cloudframe.app.var88grp.dto.serialize;

/**
*  The class Livelli88Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Livelli88Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Livelli88Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LIVELLI_88_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSwCurvaChild;
	
	/**
	* Constructor for Livelli88Serialized
	**/
    public Livelli88Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Livelli88Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LIVELLI_88_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSwCurvaChild = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSwCurvaChildCounter = -1;
     public boolean isSwCurvaChildModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwCurvaChildCounter != sharedCounter;
         localSwCurvaChildCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of swCurvaChild
	 *	@return swCurvaChild
	 */
	public char[]  getSwCurvaChildString() {
	     return getCharArray(beginSwCurvaChild,SW_CURVA_CHILD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean swCurvaChildIsNumeric() {
	    return isNumeric(beginSwCurvaChild
	                    ,beginSwCurvaChild + SW_CURVA_CHILD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SW_CURVA_CHILD_LEN = 1;
  	/**
	 * serializeSwCurvaChild
	 */
	protected void serializeSwCurvaChild(int swCurvaChild) {
		 putNumber(beginSwCurvaChild,swCurvaChild,SW_CURVA_CHILD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSwCurvaChildCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSwCurvaChild
	 */
   	protected  int serializeSwCurvaChild(char[] value) {
	    int  swCurvaChild;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    swCurvaChild = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginSwCurvaChild
		       ,1
		      );
		 localSwCurvaChildCounter = shareString.getSerializedField().getModifiedCounter();
		return  swCurvaChild;
    }

   protected int checkSwCurvaChildMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSwCurvaChild is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSwCurvaChild() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSwCurvaChild
			                 ,SW_CURVA_CHILD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("swCurvaChild", beginSwCurvaChild,SW_CURVA_CHILD_LEN);
    }
   	}




}
  
