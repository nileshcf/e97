package com.cloudframe.app.qsamrw01.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFileSeqNbr400;
	
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
  
  
             beginFileSeqNbr400 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIsItTheFirstTime100Counter = -1;
     public boolean isIsItTheFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItTheFirstTime100Counter != sharedCounter;
         localIsItTheFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItTheFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localHistFileEmptySw100Counter = -1;
     public boolean isHistFileEmptySw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHistFileEmptySw100Counter != sharedCounter;
         localHistFileEmptySw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHistFileEmptySw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFileSeqNbr400Counter = -1;
     public boolean isFileSeqNbr400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileSeqNbr400Counter != sharedCounter;
         localFileSeqNbr400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fileSeqNbr400
	 *	@return fileSeqNbr400
	 */
	public char[]  getFileSeqNbr400String() {
	     return getCharArray(beginFileSeqNbr400,FILE_SEQ_NBR_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fileSeqNbr400IsNumeric() {
	    return isNumeric(beginFileSeqNbr400
	                    ,beginFileSeqNbr400 + FILE_SEQ_NBR_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FILE_SEQ_NBR_400_LEN = 3;
  	/**
	 * serializeFileSeqNbr400
	 */
	protected void serializeFileSeqNbr400(int fileSeqNbr400) {
		 putNumber(beginFileSeqNbr400,fileSeqNbr400,FILE_SEQ_NBR_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFileSeqNbr400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFileSeqNbr400
	 */
   	protected  int serializeFileSeqNbr400(char[] value) {
	    int  fileSeqNbr400;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fileSeqNbr400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFileSeqNbr400
		       ,3
		      );
		 localFileSeqNbr400Counter = shareString.getSerializedField().getModifiedCounter();
		return  fileSeqNbr400;
    }

   protected int checkFileSeqNbr400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFileSeqNbr400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFileSeqNbr400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFileSeqNbr400
			                 ,FILE_SEQ_NBR_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fileSeqNbr400", beginFileSeqNbr400,FILE_SEQ_NBR_400_LEN);
    }
   	}




}
  
