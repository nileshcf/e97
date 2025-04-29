package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SeqioLreclMsg670Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeqioLreclMsg670Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeqioLreclMsg670Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEQIO_LRECL_MSG_670_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeqioLreclValue670;
	
	/**
	* Constructor for SeqioLreclMsg670Serialized
	**/
    public SeqioLreclMsg670Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SeqioLreclMsg670Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEQIO_LRECL_MSG_670_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSeqioLreclValue670 = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSeqioLreclValue670Counter = -1;
     public boolean isSeqioLreclValue670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioLreclValue670Counter != sharedCounter;
         localSeqioLreclValue670Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seqioLreclValue670
	 *	@return seqioLreclValue670
	 */
	public char[]  getSeqioLreclValue670String() {
	     return getCharArray(beginSeqioLreclValue670,SEQIO_LRECL_VALUE_670_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seqioLreclValue670IsNumeric() {
	    return isNumeric(beginSeqioLreclValue670
	                    ,beginSeqioLreclValue670 + SEQIO_LRECL_VALUE_670_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEQIO_LRECL_VALUE_670_LEN = 9;
  	/**
	 * serializeSeqioLreclValue670
	 */
	protected void serializeSeqioLreclValue670(long seqioLreclValue670) {
		 putNumber(beginSeqioLreclValue670,seqioLreclValue670,SEQIO_LRECL_VALUE_670_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeqioLreclValue670Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeqioLreclValue670
	 */
   	protected  long serializeSeqioLreclValue670(char[] value) {
	    long  seqioLreclValue670;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seqioLreclValue670 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSeqioLreclValue670
		       ,9
		      );
		 localSeqioLreclValue670Counter = shareString.getSerializedField().getModifiedCounter();
		return  seqioLreclValue670;
    }

   protected long checkSeqioLreclValue670MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeqioLreclValue670 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSeqioLreclValue670() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSeqioLreclValue670
			                 ,SEQIO_LRECL_VALUE_670_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seqioLreclValue670", beginSeqioLreclValue670,SEQIO_LRECL_VALUE_670_LEN);
    }
   	}




}
  
