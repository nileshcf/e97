package com.cloudframe.app.vsammon7.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginI;
            protected  int beginRnCnt;
	
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
             beginI = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginRnCnt = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localICounter = -1;
     public boolean isIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localICounter != sharedCounter;
         localICounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() {
	     return getCharArray(beginI,I_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric() {
	    return isNumeric(beginI
	                    ,beginI + I_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_LEN = 5;
  	/**
	 * serializeI
	 */
	protected void serializeI(long i) {
		 putNumber(beginI,i,I_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localICounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeI
	 */
   	protected  long serializeI(char[] value) {
	    long  i;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    i = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginI
		       ,5
		      );
		 localICounter = shareString.getSerializedField().getModifiedCounter();
		return  i;
    }

   protected long checkIMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshI() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginI
			                 ,I_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("i", beginI,I_LEN);
    }
   	}
         int localJCounter = -1;
         public boolean isJModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localJCounter != sharedCounter;
            localJCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkJMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localQCounter = -1;
         public boolean isQModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localQCounter != sharedCounter;
            localQCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkQMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRCounter = -1;
         public boolean isRModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRCounter != sharedCounter;
            localRCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localRnCntCounter = -1;
     public boolean isRnCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRnCntCounter != sharedCounter;
         localRnCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rnCnt
	 *	@return rnCnt
	 */
	public char[]  getRnCntString() {
	     return getCharArray(beginRnCnt,RN_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rnCntIsNumeric() {
	    return isNumeric(beginRnCnt
	                    ,beginRnCnt + RN_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RN_CNT_LEN = 4;
  	/**
	 * serializeRnCnt
	 */
	protected void serializeRnCnt(int rnCnt) {
		 putNumber(beginRnCnt,rnCnt,RN_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRnCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRnCnt
	 */
   	protected  int serializeRnCnt(char[] value) {
	    int  rnCnt;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rnCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginRnCnt
		       ,4
		      );
		 localRnCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  rnCnt;
    }

   protected int checkRnCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRnCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRnCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRnCnt
			                 ,RN_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rnCnt", beginRnCnt,RN_CNT_LEN);
    }
   	}
     int localEofSwCounter = -1;
     public boolean isEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofSwCounter != sharedCounter;
         localEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
