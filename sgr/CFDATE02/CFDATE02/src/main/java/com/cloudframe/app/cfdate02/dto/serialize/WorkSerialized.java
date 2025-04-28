package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBkupDtIso;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBkupDtIso = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localBkupDtIsoCounter = -1;
     public boolean isBkupDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBkupDtIsoCounter != sharedCounter;
         localBkupDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public char[]  getBkupDtIsoString() {
	     return getCharArray(beginBkupDtIso,BKUP_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bkupDtIsoIsNumeric() {
	    return isNumeric(beginBkupDtIso
	                    ,beginBkupDtIso + BKUP_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BKUP_DT_ISO_LEN = 8;
  	/**
	 * serializeBkupDtIso
	 */
	protected void serializeBkupDtIso(long bkupDtIso) {
		 putNumber(beginBkupDtIso,bkupDtIso,BKUP_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBkupDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBkupDtIso
	 */
   	protected  long serializeBkupDtIso(char[] value) {
	    long  bkupDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bkupDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBkupDtIso
		       ,8
		      );
		 localBkupDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  bkupDtIso;
    }

   protected long checkBkupDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBkupDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBkupDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBkupDtIso
			                 ,BKUP_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bkupDtIso", beginBkupDtIso,BKUP_DT_ISO_LEN);
    }
   	}
         int localIntegerOfDateCounter = -1;
         public boolean isIntegerOfDateModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIntegerOfDateCounter != sharedCounter;
            localIntegerOfDateCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIntegerOfDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localPaygoSplanTableXCounter = -1;
     public boolean isPaygoSplanTableXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPaygoSplanTableXCounter != sharedCounter;
         localPaygoSplanTableXCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPaygoSplanTableXConstraints(char[] value) {
   			return super.checkConstraints(value , 52 ,false, false);
   }




}
  
