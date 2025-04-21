package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCnt1;
            protected  int beginEdit;
	
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
  
  
  
             beginCnt1 = getStartOffset() + 0;	// set offset for serialization
  
             beginEdit = getStartOffset() + 2;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localString1Counter = -1;
     public boolean isString1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localString1Counter != sharedCounter;
         localString1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkString1Constraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
     int localString2Counter = -1;
     public boolean isString2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localString2Counter != sharedCounter;
         localString2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkString2Constraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
     int localHoldStringCounter = -1;
     public boolean isHoldStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldStringCounter != sharedCounter;
         localHoldStringCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHoldStringConstraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
     int localCnt1Counter = -1;
     public boolean isCnt1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCnt1Counter != sharedCounter;
         localCnt1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cnt1
	 *	@return cnt1
	 */
	public char[]  getCnt1String() {
	     return getCharArray(beginCnt1,CNT_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnt1IsNumeric() {
	    return isNumeric(beginCnt1
	                    ,beginCnt1 + CNT_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CNT_1_LEN = 2;
  	/**
	 * serializeCnt1
	 */
	protected void serializeCnt1(int cnt1) {
		 putNumber(beginCnt1,cnt1,CNT_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCnt1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCnt1
	 */
   	protected  int serializeCnt1(char[] value) {
	    int  cnt1;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cnt1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCnt1
		       ,2
		      );
		 localCnt1Counter = shareString.getSerializedField().getModifiedCounter();
		return  cnt1;
    }

   protected int checkCnt1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCnt1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCnt1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCnt1
			                 ,CNT_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cnt1", beginCnt1,CNT_1_LEN);
    }
   	}
     int localEditCounter = -1;
     public boolean isEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditCounter != sharedCounter;
         localEditCounter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_LEN = 5;
	/**
	 * 	serialize this Edit
	 */
   protected void serializeEdit(char[] edit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(edit,0,getStringValue(),beginEdit,EDIT_LEN);
       localEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEdit() {	 
   		return (substring(getStringValue(),beginEdit,beginEdit + EDIT_LEN));
   	}
     int localParm1Counter = -1;
     public boolean isParm1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm1Counter != sharedCounter;
         localParm1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParm1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParm2Counter = -1;
     public boolean isParm2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm2Counter != sharedCounter;
         localParm2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParm2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParm3Counter = -1;
     public boolean isParm3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm3Counter != sharedCounter;
         localParm3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParm3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParm4Counter = -1;
     public boolean isParm4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm4Counter != sharedCounter;
         localParm4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParm4Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParm5Counter = -1;
     public boolean isParm5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm5Counter != sharedCounter;
         localParm5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParm5Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localParm6Counter = -1;
     public boolean isParm6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParm6Counter != sharedCounter;
         localParm6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParm6Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
         int localP1CntCounter = -1;
         public boolean isP1CntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP1CntCounter != sharedCounter;
            localP1CntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkP1CntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localP2CntCounter = -1;
         public boolean isP2CntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP2CntCounter != sharedCounter;
            localP2CntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkP2CntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localP3CntCounter = -1;
         public boolean isP3CntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP3CntCounter != sharedCounter;
            localP3CntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkP3CntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localP4CntCounter = -1;
         public boolean isP4CntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP4CntCounter != sharedCounter;
            localP4CntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkP4CntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localP5CntCounter = -1;
         public boolean isP5CntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP5CntCounter != sharedCounter;
            localP5CntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkP5CntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localP6CntCounter = -1;
         public boolean isP6CntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localP6CntCounter != sharedCounter;
            localP6CntCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkP6CntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDelimRecCounter = -1;
     public boolean isDelimRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelimRecCounter != sharedCounter;
         localDelimRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDelimRecConstraints(char[] value) {
   			return super.checkConstraints(value , 1761 ,false, false);
   }
         int localLenCounter = -1;
         public boolean isLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLenCounter != sharedCounter;
            localLenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localSvcIdNoP1Counter = -1;
     public boolean isSvcIdNoP1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvcIdNoP1Counter != sharedCounter;
         localSvcIdNoP1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSvcIdNoP1Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localSvcIdNoP2Counter = -1;
     public boolean isSvcIdNoP2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvcIdNoP2Counter != sharedCounter;
         localSvcIdNoP2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSvcIdNoP2Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }




}
  
