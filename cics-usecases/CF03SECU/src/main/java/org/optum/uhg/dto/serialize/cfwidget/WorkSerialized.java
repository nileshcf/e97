package org.optum.uhg.dto.serialize.cfwidget;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrCode;
            protected  int beginWriteRec;
	
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
  
  
  
  
  
  
  
  
             beginErrCode = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWriteRec = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLoSupplierCounter = -1;
     public boolean isLoSupplierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLoSupplierCounter != sharedCounter;
         localLoSupplierCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLoSupplierConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localHiSupplierCounter = -1;
     public boolean isHiSupplierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHiSupplierCounter != sharedCounter;
         localHiSupplierCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHiSupplierConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTimestampCounter = -1;
     public boolean isTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimestampCounter != sharedCounter;
         localTimestampCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localDateRCounter = -1;
     public boolean isDateRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateRCounter != sharedCounter;
         localDateRCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDateRConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localTimeRCounter = -1;
     public boolean isTimeRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeRCounter != sharedCounter;
         localTimeRCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTimeRConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
     int localErrPgmCounter = -1;
     public boolean isErrPgmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrPgmCounter != sharedCounter;
         localErrPgmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrPgmConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localErrLocCounter = -1;
     public boolean isErrLocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrLocCounter != sharedCounter;
         localErrLocCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrLocConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localErrMsgCounter = -1;
     public boolean isErrMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsgCounter != sharedCounter;
         localErrMsgCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localErrCodeCounter = -1;
     public boolean isErrCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrCodeCounter != sharedCounter;
         localErrCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errCode
	 *	@return errCode
	 */
	public char[]  getErrCodeString() {
	     return getCharArray(beginErrCode,ERR_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errCodeIsNumeric() {
	    return isNumeric(beginErrCode
	                    ,beginErrCode + ERR_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERR_CODE_LEN = 9;
  	/**
	 * serializeErrCode
	 */
	protected void serializeErrCode(long errCode) {
		 putNumber(beginErrCode,errCode,ERR_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrCode
	 */
   	protected  long serializeErrCode(char[] value) {
	    long  errCode;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errCode = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginErrCode
		       ,9
		      );
		 localErrCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  errCode;
    }

   protected long checkErrCodeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshErrCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshErrCode() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginErrCode
			                 ,ERR_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errCode", beginErrCode,ERR_CODE_LEN);
    }
   	}
     int localEofFlagCounter = -1;
     public boolean isEofFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofFlagCounter != sharedCounter;
         localEofFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWriteRecCounter = -1;
     public boolean isWriteRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteRecCounter != sharedCounter;
         localWriteRecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of writeRec
	 *	@return writeRec
	 */
	public char[]  getWriteRecString() {
	     return getCharArray(beginWriteRec,WRITE_REC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeRecIsNumeric() {
	    return isNumeric(beginWriteRec
	                    ,beginWriteRec + WRITE_REC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WRITE_REC_LEN = 1;
  	/**
	 * serializeWriteRec
	 */
	protected void serializeWriteRec(int writeRec) {
		 putNumber(beginWriteRec,writeRec,WRITE_REC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWriteRecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWriteRec
	 */
   	protected  int serializeWriteRec(char[] value) {
	    int  writeRec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    writeRec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWriteRec
		       ,1
		      );
		 localWriteRecCounter = shareString.getSerializedField().getModifiedCounter();
		return  writeRec;
    }

   protected int checkWriteRecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWriteRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWriteRec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWriteRec
			                 ,WRITE_REC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("writeRec", beginWriteRec,WRITE_REC_LEN);
    }
   	}




}
  
