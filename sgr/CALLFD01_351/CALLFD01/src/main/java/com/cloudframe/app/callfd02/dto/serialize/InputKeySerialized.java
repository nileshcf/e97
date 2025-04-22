package com.cloudframe.app.callfd02.dto.serialize;

/**
*  The class InputKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_KEY_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIoType;
            protected  int beginInputSeq;
	
	/**
	* Constructor for InputKeySerialized
	**/
    public InputKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InputKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InputKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this InputKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in InputKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIoType = getStartOffset() + 0;	// set offset for serialization
  
  
             beginInputSeq = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIoTypeCounter = -1;
     public boolean isIoTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoTypeCounter != sharedCounter;
         localIoTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IO_TYPE_LEN = 2;
	/**
	 * 	serialize this IoType
	 */
   protected void serializeIoType(char[] ioType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ioType,0,getStringValue(),beginIoType,IO_TYPE_LEN);
       localIoTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIoTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIoType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIoType() {	 
   		return (substring(getStringValue(),beginIoType,beginIoType + IO_TYPE_LEN));
   	}
     int localInputSeqCounter = -1;
     public boolean isInputSeqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputSeqCounter != sharedCounter;
         localInputSeqCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inputSeq
	 *	@return inputSeq
	 */
	public char[]  getInputSeqString() {
	     return getCharArray(beginInputSeq,INPUT_SEQ_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputSeqIsNumeric() {
	    return isNumeric(beginInputSeq
	                    ,beginInputSeq + INPUT_SEQ_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INPUT_SEQ_LEN = 6;
  	/**
	 * serializeInputSeq
	 */
	protected void serializeInputSeq(long inputSeq) {
		 putNumber(beginInputSeq,inputSeq,INPUT_SEQ_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInputSeqCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInputSeq
	 */
   	protected  long serializeInputSeq(char[] value) {
	    long  inputSeq;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inputSeq = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginInputSeq
		       ,6
		      );
		 localInputSeqCounter = shareString.getSerializedField().getModifiedCounter();
		return  inputSeq;
    }

   protected long checkInputSeqMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInputSeq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInputSeq() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInputSeq
			                 ,INPUT_SEQ_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inputSeq", beginInputSeq,INPUT_SEQ_LEN);
    }
   	}




}
  
