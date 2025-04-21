package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class SeprEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeprEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeprEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEPR_ENTRY_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeprLength;
            protected  int beginSeprOffset;
	
	/**
	* Constructor for SeprEntrySerialized
	**/
    public SeprEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SeprEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeprEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SeprEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SeprEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SeprEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEPR_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSeprLength = getStartOffset() + 0;	// set offset for serialization
  
             beginSeprOffset = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSeprLengthCounter = -1;
     public boolean isSeprLengthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprLengthCounter != sharedCounter;
         localSeprLengthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seprLength
	 *	@return seprLength
	 */
	public char[]  getSeprLengthString() {
	     return getCharArray(beginSeprLength,SEPR_LENGTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seprLengthIsNumeric() {
	    return isNumeric(beginSeprLength
	                    ,beginSeprLength + SEPR_LENGTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEPR_LENGTH_LEN = 3;
  	/**
	 * serializeSeprLength
	 */
	protected void serializeSeprLength(int seprLength) {
		 putNumber(beginSeprLength,seprLength,SEPR_LENGTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeprLengthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeprLength
	 */
   	protected  int serializeSeprLength(char[] value) {
	    int  seprLength;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seprLength = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSeprLength
		       ,3
		      );
		 localSeprLengthCounter = shareString.getSerializedField().getModifiedCounter();
		return  seprLength;
    }

   protected int checkSeprLengthMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeprLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeprLength() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSeprLength
			                 ,SEPR_LENGTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seprLength", beginSeprLength,SEPR_LENGTH_LEN);
    }
   	}
     int localSeprOffsetCounter = -1;
     public boolean isSeprOffsetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprOffsetCounter != sharedCounter;
         localSeprOffsetCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seprOffset
	 *	@return seprOffset
	 */
	public char[]  getSeprOffsetString() {
	     return getCharArray(beginSeprOffset,SEPR_OFFSET_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seprOffsetIsNumeric() {
	    return isNumeric(beginSeprOffset
	                    ,beginSeprOffset + SEPR_OFFSET_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEPR_OFFSET_LEN = 3;
  	/**
	 * serializeSeprOffset
	 */
	protected void serializeSeprOffset(int seprOffset) {
		 putNumber(beginSeprOffset,seprOffset,SEPR_OFFSET_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeprOffsetCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeprOffset
	 */
   	protected  int serializeSeprOffset(char[] value) {
	    int  seprOffset;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seprOffset = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSeprOffset
		       ,3
		      );
		 localSeprOffsetCounter = shareString.getSerializedField().getModifiedCounter();
		return  seprOffset;
    }

   protected int checkSeprOffsetMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeprOffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeprOffset() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSeprOffset
			                 ,SEPR_OFFSET_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seprOffset", beginSeprOffset,SEPR_OFFSET_LEN);
    }
   	}




}
  
