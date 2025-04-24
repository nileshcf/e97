package com.cloudframe.app.ip305710.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxRrnLimit300;
	
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
  
  
  
  
  
             beginMaxRrnLimit300 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
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
     int localIp305710300Counter = -1;
     public boolean isIp305710300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp305710300Counter != sharedCounter;
         localIp305710300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp305710300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp996010300Counter = -1;
     public boolean isPgmIp996010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996010300Counter != sharedCounter;
         localPgmIp996010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp610010300Counter = -1;
     public boolean isPgmIp610010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp610010300Counter != sharedCounter;
         localPgmIp610010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp610010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localMaxLength300Counter = -1;
         public boolean isMaxLength300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxLength300Counter != sharedCounter;
            localMaxLength300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkMaxLength300MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localMaxRrnLimit300Counter = -1;
     public boolean isMaxRrnLimit300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxRrnLimit300Counter != sharedCounter;
         localMaxRrnLimit300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxRrnLimit300
	 *	@return maxRrnLimit300
	 */
	public char[]  getMaxRrnLimit300String() {
	     return getCharArray(beginMaxRrnLimit300,MAX_RRN_LIMIT_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxRrnLimit300IsNumeric() {
	    return isNumeric(beginMaxRrnLimit300
	                    ,beginMaxRrnLimit300 + MAX_RRN_LIMIT_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_RRN_LIMIT_300_LEN = 2;
  	/**
	 * serializeMaxRrnLimit300
	 */
	protected void serializeMaxRrnLimit300(int maxRrnLimit300) {
		 putNumber(beginMaxRrnLimit300,maxRrnLimit300,MAX_RRN_LIMIT_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxRrnLimit300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxRrnLimit300
	 */
   	protected  int serializeMaxRrnLimit300(char[] value) {
	    int  maxRrnLimit300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxRrnLimit300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMaxRrnLimit300
		       ,2
		      );
		 localMaxRrnLimit300Counter = shareString.getSerializedField().getModifiedCounter();
		return  maxRrnLimit300;
    }

   protected int checkMaxRrnLimit300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxRrnLimit300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxRrnLimit300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMaxRrnLimit300
			                 ,MAX_RRN_LIMIT_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxRrnLimit300", beginMaxRrnLimit300,MAX_RRN_LIMIT_300_LEN);
    }
   	}
     int localAbendCd3003300Counter = -1;
     public boolean isAbendCd3003300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCd3003300Counter != sharedCounter;
         localAbendCd3003300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendCd3003300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localTableId300Counter = -1;
     public boolean isTableId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId300Counter != sharedCounter;
         localTableId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableId300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localPara2100300Counter = -1;
     public boolean isPara2100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2100300Counter != sharedCounter;
         localPara2100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2100300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localUniqMaxCabPtrErrorCd610Counter = -1;
     public boolean isUniqMaxCabPtrErrorCd610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUniqMaxCabPtrErrorCd610Counter != sharedCounter;
         localUniqMaxCabPtrErrorCd610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkUniqMaxCabPtrErrorCd610Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localUniqMaxCabPtrErrorMsg610Counter = -1;
     public boolean isUniqMaxCabPtrErrorMsg610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUniqMaxCabPtrErrorMsg610Counter != sharedCounter;
         localUniqMaxCabPtrErrorMsg610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkUniqMaxCabPtrErrorMsg610Constraints(char[] value) {
   			return super.checkConstraints(value , 52 ,false, false);
   }
     int localPtrIp996010800Counter = -1;
     public boolean isPtrIp996010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996010800Counter != sharedCounter;
         localPtrIp996010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localRrnNbr800Counter = -1;
         public boolean isRrnNbr800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRrnNbr800Counter != sharedCounter;
            localRrnNbr800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRrnNbr800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localEntryLength800Counter = -1;
         public boolean isEntryLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEntryLength800Counter != sharedCounter;
            localEntryLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkEntryLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localStart800Counter = -1;
         public boolean isStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStart800Counter != sharedCounter;
            localStart800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkStart800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localLength800Counter = -1;
         public boolean isLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLength800Counter != sharedCounter;
            localLength800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkLength800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localCurrPtrLngth800Counter = -1;
         public boolean isCurrPtrLngth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCurrPtrLngth800Counter != sharedCounter;
            localCurrPtrLngth800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCurrPtrLngth800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }




}
  
