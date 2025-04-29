package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ComnTagData500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ComnTagData500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ComnTagData500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMN_TAG_DATA_500_LENGTH = 1002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginComnTagLen500;
            protected  int beginComnTagValue500;
	
	/**
	* Constructor for ComnTagData500Serialized
	**/
    public ComnTagData500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ComnTagData500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTagData500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ComnTagData500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this ComnTagData500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in ComnTagData500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMN_TAG_DATA_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginComnTagLen500 = getStartOffset() + 0;	// set offset for serialization
  
             beginComnTagValue500 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localComnTagLen500Counter = -1;
     public boolean isComnTagLen500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTagLen500Counter != sharedCounter;
         localComnTagLen500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of comnTagLen500
	 *	@return comnTagLen500
	 */
	public char[]  getComnTagLen500String() {
	     return getCharArray(beginComnTagLen500,COMN_TAG_LEN_500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean comnTagLen500IsNumeric() {
	    return isNumeric(beginComnTagLen500
	                    ,beginComnTagLen500 + COMN_TAG_LEN_500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMN_TAG_LEN_500_LEN = 3;
  	/**
	 * serializeComnTagLen500
	 */
	protected void serializeComnTagLen500(int comnTagLen500) {
		 putNumber(beginComnTagLen500,comnTagLen500,COMN_TAG_LEN_500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localComnTagLen500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeComnTagLen500
	 */
   	protected  int serializeComnTagLen500(char[] value) {
	    int  comnTagLen500;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    comnTagLen500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginComnTagLen500
		       ,3
		      );
		 localComnTagLen500Counter = shareString.getSerializedField().getModifiedCounter();
		return  comnTagLen500;
    }

   protected int checkComnTagLen500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshComnTagLen500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshComnTagLen500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginComnTagLen500
			                 ,COMN_TAG_LEN_500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("comnTagLen500", beginComnTagLen500,COMN_TAG_LEN_500_LEN);
    }
   	}
     int localComnTagValue500Counter = -1;
     public boolean isComnTagValue500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComnTagValue500Counter != sharedCounter;
         localComnTagValue500Counter = sharedCounter; return hasModified;
     }
	protected static final int COMN_TAG_VALUE_500_LEN = 999;
	/**
	 * 	serialize this ComnTagValue500
	 */
   protected void serializeComnTagValue500(char[] comnTagValue500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(comnTagValue500,0,getStringValue(),beginComnTagValue500,COMN_TAG_VALUE_500_LEN);
       localComnTagValue500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkComnTagValue500Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshComnTagValue500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshComnTagValue500() {	 
   		return (substring(getStringValue(),beginComnTagValue500,beginComnTagValue500 + COMN_TAG_VALUE_500_LEN));
   	}




}
  
