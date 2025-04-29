package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys204OutRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys204OutRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys204OutRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_204_OUT_REC_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys204InRecCnt;
            protected  int beginSys204StatusCd;
            protected  int beginSys204OutRecCnt;
	
	/**
	* Constructor for Sys204OutRecSerialized
	**/
    public Sys204OutRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys204OutRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_204_OUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys204InRecCnt = getStartOffset() + 0;	// set offset for serialization
  
             beginSys204StatusCd = getStartOffset() + 9;	// set offset for serialization
  
             beginSys204OutRecCnt = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys204InRecCntCounter = -1;
     public boolean isSys204InRecCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204InRecCntCounter != sharedCounter;
         localSys204InRecCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys204InRecCnt
	 *	@return sys204InRecCnt
	 */
	public char[]  getSys204InRecCntString() {
	     return getCharArray(beginSys204InRecCnt,SYS_204_IN_REC_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys204InRecCntIsNumeric() {
	    return isNumeric(beginSys204InRecCnt
	                    ,beginSys204InRecCnt + SYS_204_IN_REC_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_204_IN_REC_CNT_LEN = 9;
  	/**
	 * serializeSys204InRecCnt
	 */
	protected void serializeSys204InRecCnt(long sys204InRecCnt) {
		 putNumber(beginSys204InRecCnt,sys204InRecCnt,SYS_204_IN_REC_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys204InRecCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys204InRecCnt
	 */
   	protected  long serializeSys204InRecCnt(char[] value) {
	    long  sys204InRecCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys204InRecCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSys204InRecCnt
		       ,9
		      );
		 localSys204InRecCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  sys204InRecCnt;
    }

   protected long checkSys204InRecCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys204InRecCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys204InRecCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSys204InRecCnt
			                 ,SYS_204_IN_REC_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys204InRecCnt", beginSys204InRecCnt,SYS_204_IN_REC_CNT_LEN);
    }
   	}
     int localSys204StatusCdCounter = -1;
     public boolean isSys204StatusCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204StatusCdCounter != sharedCounter;
         localSys204StatusCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_204_STATUS_CD_LEN = 1;
	/**
	 * 	serialize this Sys204StatusCd
	 */
   protected void serializeSys204StatusCd(char[] sys204StatusCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys204StatusCd,0,getStringValue(),beginSys204StatusCd,SYS_204_STATUS_CD_LEN);
       localSys204StatusCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys204StatusCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSys204StatusCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys204StatusCd() {	 
   		return (substring(getStringValue(),beginSys204StatusCd,beginSys204StatusCd + SYS_204_STATUS_CD_LEN));
   	}
     int localSys204OutRecCntCounter = -1;
     public boolean isSys204OutRecCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys204OutRecCntCounter != sharedCounter;
         localSys204OutRecCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys204OutRecCnt
	 *	@return sys204OutRecCnt
	 */
	public char[]  getSys204OutRecCntString() {
	     return getCharArray(beginSys204OutRecCnt,SYS_204_OUT_REC_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys204OutRecCntIsNumeric() {
	    return isNumeric(beginSys204OutRecCnt
	                    ,beginSys204OutRecCnt + SYS_204_OUT_REC_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_204_OUT_REC_CNT_LEN = 9;
  	/**
	 * serializeSys204OutRecCnt
	 */
	protected void serializeSys204OutRecCnt(long sys204OutRecCnt) {
		 putNumber(beginSys204OutRecCnt,sys204OutRecCnt,SYS_204_OUT_REC_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys204OutRecCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys204OutRecCnt
	 */
   	protected  long serializeSys204OutRecCnt(char[] value) {
	    long  sys204OutRecCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys204OutRecCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSys204OutRecCnt
		       ,9
		      );
		 localSys204OutRecCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  sys204OutRecCnt;
    }

   protected long checkSys204OutRecCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys204OutRecCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys204OutRecCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSys204OutRecCnt
			                 ,SYS_204_OUT_REC_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys204OutRecCnt", beginSys204OutRecCnt,SYS_204_OUT_REC_CNT_LEN);
    }
   	}




}
  
