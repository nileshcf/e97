package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SeqioBlksizeMsg670Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeqioBlksizeMsg670Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeqioBlksizeMsg670Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEQIO_BLKSIZE_MSG_670_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeqioBlksizeValue670;
	
	/**
	* Constructor for SeqioBlksizeMsg670Serialized
	**/
    public SeqioBlksizeMsg670Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SeqioBlksizeMsg670Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEQIO_BLKSIZE_MSG_670_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSeqioBlksizeValue670 = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSeqioBlksizeValue670Counter = -1;
     public boolean isSeqioBlksizeValue670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioBlksizeValue670Counter != sharedCounter;
         localSeqioBlksizeValue670Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seqioBlksizeValue670
	 *	@return seqioBlksizeValue670
	 */
	public char[]  getSeqioBlksizeValue670String() {
	     return getCharArray(beginSeqioBlksizeValue670,SEQIO_BLKSIZE_VALUE_670_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seqioBlksizeValue670IsNumeric() {
	    return isNumeric(beginSeqioBlksizeValue670
	                    ,beginSeqioBlksizeValue670 + SEQIO_BLKSIZE_VALUE_670_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEQIO_BLKSIZE_VALUE_670_LEN = 9;
  	/**
	 * serializeSeqioBlksizeValue670
	 */
	protected void serializeSeqioBlksizeValue670(long seqioBlksizeValue670) {
		 putNumber(beginSeqioBlksizeValue670,seqioBlksizeValue670,SEQIO_BLKSIZE_VALUE_670_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeqioBlksizeValue670Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeqioBlksizeValue670
	 */
   	protected  long serializeSeqioBlksizeValue670(char[] value) {
	    long  seqioBlksizeValue670;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seqioBlksizeValue670 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSeqioBlksizeValue670
		       ,9
		      );
		 localSeqioBlksizeValue670Counter = shareString.getSerializedField().getModifiedCounter();
		return  seqioBlksizeValue670;
    }

   protected long checkSeqioBlksizeValue670MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeqioBlksizeValue670 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSeqioBlksizeValue670() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSeqioBlksizeValue670
			                 ,SEQIO_BLKSIZE_VALUE_670_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seqioBlksizeValue670", beginSeqioBlksizeValue670,SEQIO_BLKSIZE_VALUE_670_LEN);
    }
   	}




}
  
