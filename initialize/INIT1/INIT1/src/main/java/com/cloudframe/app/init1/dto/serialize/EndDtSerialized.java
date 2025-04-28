package com.cloudframe.app.init1.dto.serialize;

/**
*  The class EndDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EndDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EndDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int END_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEndDtMm;
            protected  int beginEndDtYyyy;
	
	/**
	* Constructor for EndDtSerialized
	**/
    public EndDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EndDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EndDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EndDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this EndDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in EndDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(END_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEndDtMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginEndDtYyyy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEndDtMmCounter = -1;
     public boolean isEndDtMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndDtMmCounter != sharedCounter;
         localEndDtMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of endDtMm
	 *	@return endDtMm
	 */
	public char[]  getEndDtMmString() {
	     return getCharArray(beginEndDtMm,END_DT_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endDtMmIsNumeric() {
	    return isNumeric(beginEndDtMm
	                    ,beginEndDtMm + END_DT_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int END_DT_MM_LEN = 2;
  	/**
	 * serializeEndDtMm
	 */
	protected void serializeEndDtMm(int endDtMm) {
		 putNumber(beginEndDtMm,endDtMm,END_DT_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEndDtMm
	 */
   	protected  int serializeEndDtMm(char[] value) {
	    int  endDtMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    endDtMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginEndDtMm
		       ,2
		      );
		 localEndDtMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  endDtMm;
    }

   protected int checkEndDtMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEndDtMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEndDtMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEndDtMm
			                 ,END_DT_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("endDtMm", beginEndDtMm,END_DT_MM_LEN);
    }
   	}
     int localEndDtYyyyCounter = -1;
     public boolean isEndDtYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndDtYyyyCounter != sharedCounter;
         localEndDtYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of endDtYyyy
	 *	@return endDtYyyy
	 */
	public char[]  getEndDtYyyyString() {
	     return getCharArray(beginEndDtYyyy,END_DT_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endDtYyyyIsNumeric() {
	    return isNumeric(beginEndDtYyyy
	                    ,beginEndDtYyyy + END_DT_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int END_DT_YYYY_LEN = 4;
  	/**
	 * serializeEndDtYyyy
	 */
	protected void serializeEndDtYyyy(int endDtYyyy) {
		 putNumber(beginEndDtYyyy,endDtYyyy,END_DT_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEndDtYyyy
	 */
   	protected  int serializeEndDtYyyy(char[] value) {
	    int  endDtYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    endDtYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginEndDtYyyy
		       ,4
		      );
		 localEndDtYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  endDtYyyy;
    }

   protected int checkEndDtYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEndDtYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEndDtYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEndDtYyyy
			                 ,END_DT_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("endDtYyyy", beginEndDtYyyy,END_DT_YYYY_LEN);
    }
   	}




}
  
