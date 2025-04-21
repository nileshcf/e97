package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class Parms1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parms1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parms1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMS_1000_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmLngth1000;
            protected  int beginCommitFreq1000;
	
	/**
	* Constructor for Parms1000Serialized
	**/
    public Parms1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Parms1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmLngth1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginCommitFreq1000 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParmLngth1000Counter = -1;
         public boolean isParmLngth1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmLngth1000Counter != sharedCounter;
            localParmLngth1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_LNGTH_1000_LEN = 2;
  	/**
	 * serializeParmLngth1000
	 */
	protected void serializeParmLngth1000(short parmLngth1000) {
           replaceValue( //  save the value as string
                   getBinaryString( parmLngth1000,PARM_LNGTH_1000_LEN)
                  ,beginParmLngth1000
                  ,PARM_LNGTH_1000_LEN
                 );
            localParmLngth1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmLngth1000MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmLngth1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmLngth1000() {	 
			return (getShort(beginParmLngth1000));
   	}
     int localCommitFreq1000Counter = -1;
     public boolean isCommitFreq1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCommitFreq1000Counter != sharedCounter;
         localCommitFreq1000Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of commitFreq1000
	 *	@return commitFreq1000
	 */
	public char[]  getCommitFreq1000String() {
	     return getCharArray(beginCommitFreq1000,COMMIT_FREQ_1000_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean commitFreq1000IsNumeric() {
	    return isNumeric(beginCommitFreq1000
	                    ,beginCommitFreq1000 + COMMIT_FREQ_1000_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMMIT_FREQ_1000_LEN = 8;
  	/**
	 * serializeCommitFreq1000
	 */
	protected void serializeCommitFreq1000(long commitFreq1000) {
		 putNumber(beginCommitFreq1000,commitFreq1000,COMMIT_FREQ_1000_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCommitFreq1000Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCommitFreq1000
	 */
   	protected  long serializeCommitFreq1000(char[] value) {
	    long  commitFreq1000;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    commitFreq1000 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCommitFreq1000
		       ,8
		      );
		 localCommitFreq1000Counter = shareString.getSerializedField().getModifiedCounter();
		return  commitFreq1000;
    }

   protected long checkCommitFreq1000MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCommitFreq1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCommitFreq1000() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCommitFreq1000
			                 ,COMMIT_FREQ_1000_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("commitFreq1000", beginCommitFreq1000,COMMIT_FREQ_1000_LEN);
    }
   	}




}
  
