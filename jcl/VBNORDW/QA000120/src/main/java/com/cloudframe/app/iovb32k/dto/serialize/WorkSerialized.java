package com.cloudframe.app.iovb32k.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInFileStatus;
            protected  int beginOutFileStatus;
            protected  int beginDisplayNum1;
            protected  int beginDisplayNum2;
            protected  int beginDisplayNum3;
	
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
             beginInFileStatus = getStartOffset() + 0;	// set offset for serialization
  
             beginOutFileStatus = getStartOffset() + 2;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
             beginDisplayNum1 = getStartOffset() + 4;	// set offset for serialization
  
             beginDisplayNum2 = getStartOffset() + 10;	// set offset for serialization
  
             beginDisplayNum3 = getStartOffset() + 16;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localInFileStatusCounter = -1;
     public boolean isInFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInFileStatusCounter != sharedCounter;
         localInFileStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inFileStatus
	 *	@return inFileStatus
	 */
	public char[]  getInFileStatusString() {
	     return getCharArray(beginInFileStatus,IN_FILE_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inFileStatusIsNumeric() {
	    return isNumeric(beginInFileStatus
	                    ,beginInFileStatus + IN_FILE_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IN_FILE_STATUS_LEN = 2;
  	/**
	 * serializeInFileStatus
	 */
	protected void serializeInFileStatus(int inFileStatus) {
		 putNumber(beginInFileStatus,inFileStatus,IN_FILE_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInFileStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInFileStatus
	 */
   	protected  int serializeInFileStatus(char[] value) {
	    int  inFileStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inFileStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginInFileStatus
		       ,2
		      );
		 localInFileStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  inFileStatus;
    }

   protected int checkInFileStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInFileStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInFileStatus
			                 ,IN_FILE_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inFileStatus", beginInFileStatus,IN_FILE_STATUS_LEN);
    }
   	}
     int localOutFileStatusCounter = -1;
     public boolean isOutFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutFileStatusCounter != sharedCounter;
         localOutFileStatusCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of outFileStatus
	 *	@return outFileStatus
	 */
	public char[]  getOutFileStatusString() {
	     return getCharArray(beginOutFileStatus,OUT_FILE_STATUS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outFileStatusIsNumeric() {
	    return isNumeric(beginOutFileStatus
	                    ,beginOutFileStatus + OUT_FILE_STATUS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OUT_FILE_STATUS_LEN = 2;
  	/**
	 * serializeOutFileStatus
	 */
	protected void serializeOutFileStatus(int outFileStatus) {
		 putNumber(beginOutFileStatus,outFileStatus,OUT_FILE_STATUS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutFileStatusCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOutFileStatus
	 */
   	protected  int serializeOutFileStatus(char[] value) {
	    int  outFileStatus;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    outFileStatus = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOutFileStatus
		       ,2
		      );
		 localOutFileStatusCounter = shareString.getSerializedField().getModifiedCounter();
		return  outFileStatus;
    }

   protected int checkOutFileStatusMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOutFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutFileStatus() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOutFileStatus
			                 ,OUT_FILE_STATUS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("outFileStatus", beginOutFileStatus,OUT_FILE_STATUS_LEN);
    }
   	}
         int localInEofFlagCounter = -1;
         public boolean isInEofFlagModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInEofFlagCounter != sharedCounter;
            localInEofFlagCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkInEofFlagMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localLreclMaxCounter = -1;
         public boolean isLreclMaxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLreclMaxCounter != sharedCounter;
            localLreclMaxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkLreclMaxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localOutRecLenCounter = -1;
         public boolean isOutRecLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutRecLenCounter != sharedCounter;
            localOutRecLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkOutRecLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localInRecLenCounter = -1;
         public boolean isInRecLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInRecLenCounter != sharedCounter;
            localInRecLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkInRecLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
         int localKCounter = -1;
         public boolean isKModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localKCounter != sharedCounter;
            localKCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkKMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localDataLenMinCounter = -1;
         public boolean isDataLenMinModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDataLenMinCounter != sharedCounter;
            localDataLenMinCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkDataLenMinMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localDataLenMaxCounter = -1;
         public boolean isDataLenMaxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDataLenMaxCounter != sharedCounter;
            localDataLenMaxCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkDataLenMaxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRecInCtrCounter = -1;
         public boolean isRecInCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecInCtrCounter != sharedCounter;
            localRecInCtrCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRecInCtrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localRecOutCtrCounter = -1;
         public boolean isRecOutCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecOutCtrCounter != sharedCounter;
            localRecOutCtrCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkRecOutCtrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localDisplayNum1Counter = -1;
     public boolean isDisplayNum1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayNum1Counter != sharedCounter;
         localDisplayNum1Counter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_NUM_1_LEN = 6;
	/**
	 * 	serialize this DisplayNum1
	 */
   protected void serializeDisplayNum1(char[] displayNum1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayNum1,0,getStringValue(),beginDisplayNum1,DISPLAY_NUM_1_LEN);
       localDisplayNum1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayNum1Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDisplayNum1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayNum1() {	 
   		return (substring(getStringValue(),beginDisplayNum1,beginDisplayNum1 + DISPLAY_NUM_1_LEN));
   	}
     int localDisplayNum2Counter = -1;
     public boolean isDisplayNum2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayNum2Counter != sharedCounter;
         localDisplayNum2Counter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_NUM_2_LEN = 6;
	/**
	 * 	serialize this DisplayNum2
	 */
   protected void serializeDisplayNum2(char[] displayNum2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayNum2,0,getStringValue(),beginDisplayNum2,DISPLAY_NUM_2_LEN);
       localDisplayNum2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayNum2Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDisplayNum2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayNum2() {	 
   		return (substring(getStringValue(),beginDisplayNum2,beginDisplayNum2 + DISPLAY_NUM_2_LEN));
   	}
     int localDisplayNum3Counter = -1;
     public boolean isDisplayNum3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayNum3Counter != sharedCounter;
         localDisplayNum3Counter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_NUM_3_LEN = 6;
	/**
	 * 	serialize this DisplayNum3
	 */
   protected void serializeDisplayNum3(char[] displayNum3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayNum3,0,getStringValue(),beginDisplayNum3,DISPLAY_NUM_3_LEN);
       localDisplayNum3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayNum3Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDisplayNum3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayNum3() {	 
   		return (substring(getStringValue(),beginDisplayNum3,beginDisplayNum3 + DISPLAY_NUM_3_LEN));
   	}
     int localModeCounter = -1;
     public boolean isModeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localModeCounter != sharedCounter;
         localModeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkModeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
