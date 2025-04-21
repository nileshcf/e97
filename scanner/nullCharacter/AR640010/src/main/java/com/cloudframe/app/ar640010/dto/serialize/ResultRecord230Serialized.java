package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultRecord230Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ResultRecord230Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultRecord230Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_RECORD_230_LENGTH = 278;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResultJobTs230;
            protected  int beginResultJobName230;
            protected  int beginResultStepName230;
            protected  int beginResultProcStep230;
            protected  int beginResultJobId230;
            protected  int beginResultDbId230;
            protected  int beginResultDbPkg230;
            protected  int beginResultCpuId230;
            protected  int beginResultRequest230;
            protected  int beginResultEndptId230;
            protected  int beginResultBulkId230;
            protected  int beginResultCyclNum230;
            protected  int beginResultStatus230;
            protected  int beginResultReason230;
            protected  int beginResultTs230;
            protected  int beginResultListDd230;
            protected  int beginResultListDsn230;
            protected  int beginResultExitNam230;
            protected  int beginResultExitDsn230;
            protected  int beginResultCodeExit230;
	
	/**
	* Constructor for ResultRecord230Serialized
	**/
    public ResultRecord230Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ResultRecord230Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_RECORD_230_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginResultJobTs230 = getStartOffset() + 0;	// set offset for serialization
  
             beginResultJobName230 = getStartOffset() + 19;	// set offset for serialization
  
             beginResultStepName230 = getStartOffset() + 27;	// set offset for serialization
  
             beginResultProcStep230 = getStartOffset() + 35;	// set offset for serialization
  
             beginResultJobId230 = getStartOffset() + 43;	// set offset for serialization
  
             beginResultDbId230 = getStartOffset() + 51;	// set offset for serialization
  
             beginResultDbPkg230 = getStartOffset() + 59;	// set offset for serialization
  
             beginResultCpuId230 = getStartOffset() + 75;	// set offset for serialization
  
             beginResultRequest230 = getStartOffset() + 83;	// set offset for serialization
  
             beginResultEndptId230 = getStartOffset() + 88;	// set offset for serialization
  
             beginResultBulkId230 = getStartOffset() + 95;	// set offset for serialization
  
             beginResultCyclNum230 = getStartOffset() + 99;	// set offset for serialization
  
             beginResultStatus230 = getStartOffset() + 101;	// set offset for serialization
  
             beginResultReason230 = getStartOffset() + 107;	// set offset for serialization
  
             beginResultTs230 = getStartOffset() + 137;	// set offset for serialization
  
             beginResultListDd230 = getStartOffset() + 163;	// set offset for serialization
  
             beginResultListDsn230 = getStartOffset() + 171;	// set offset for serialization
  
             beginResultExitNam230 = getStartOffset() + 225;	// set offset for serialization
  
             beginResultExitDsn230 = getStartOffset() + 233;	// set offset for serialization
  
             beginResultCodeExit230 = getStartOffset() + 277;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localResultJobTs230Counter = -1;
     public boolean isResultJobTs230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultJobTs230Counter != sharedCounter;
         localResultJobTs230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_JOB_TS_230_LEN = 19;
	/**
	 * 	serialize this ResultJobTs230
	 */
   protected void serializeResultJobTs230(char[] resultJobTs230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultJobTs230,0,getStringValue(),beginResultJobTs230,RESULT_JOB_TS_230_LEN);
       localResultJobTs230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultJobTs230Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshResultJobTs230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultJobTs230() {	 
   		return (substring(getStringValue(),beginResultJobTs230,beginResultJobTs230 + RESULT_JOB_TS_230_LEN));
   	}
     int localResultJobName230Counter = -1;
     public boolean isResultJobName230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultJobName230Counter != sharedCounter;
         localResultJobName230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_JOB_NAME_230_LEN = 8;
	/**
	 * 	serialize this ResultJobName230
	 */
   protected void serializeResultJobName230(char[] resultJobName230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultJobName230,0,getStringValue(),beginResultJobName230,RESULT_JOB_NAME_230_LEN);
       localResultJobName230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultJobName230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultJobName230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultJobName230() {	 
   		return (substring(getStringValue(),beginResultJobName230,beginResultJobName230 + RESULT_JOB_NAME_230_LEN));
   	}
     int localResultStepName230Counter = -1;
     public boolean isResultStepName230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultStepName230Counter != sharedCounter;
         localResultStepName230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_STEP_NAME_230_LEN = 8;
	/**
	 * 	serialize this ResultStepName230
	 */
   protected void serializeResultStepName230(char[] resultStepName230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultStepName230,0,getStringValue(),beginResultStepName230,RESULT_STEP_NAME_230_LEN);
       localResultStepName230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultStepName230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultStepName230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultStepName230() {	 
   		return (substring(getStringValue(),beginResultStepName230,beginResultStepName230 + RESULT_STEP_NAME_230_LEN));
   	}
     int localResultProcStep230Counter = -1;
     public boolean isResultProcStep230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultProcStep230Counter != sharedCounter;
         localResultProcStep230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_PROC_STEP_230_LEN = 8;
	/**
	 * 	serialize this ResultProcStep230
	 */
   protected void serializeResultProcStep230(char[] resultProcStep230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultProcStep230,0,getStringValue(),beginResultProcStep230,RESULT_PROC_STEP_230_LEN);
       localResultProcStep230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultProcStep230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultProcStep230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultProcStep230() {	 
   		return (substring(getStringValue(),beginResultProcStep230,beginResultProcStep230 + RESULT_PROC_STEP_230_LEN));
   	}
     int localResultJobId230Counter = -1;
     public boolean isResultJobId230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultJobId230Counter != sharedCounter;
         localResultJobId230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_JOB_ID_230_LEN = 8;
	/**
	 * 	serialize this ResultJobId230
	 */
   protected void serializeResultJobId230(char[] resultJobId230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultJobId230,0,getStringValue(),beginResultJobId230,RESULT_JOB_ID_230_LEN);
       localResultJobId230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultJobId230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultJobId230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultJobId230() {	 
   		return (substring(getStringValue(),beginResultJobId230,beginResultJobId230 + RESULT_JOB_ID_230_LEN));
   	}
     int localResultDbId230Counter = -1;
     public boolean isResultDbId230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultDbId230Counter != sharedCounter;
         localResultDbId230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_DB_ID_230_LEN = 8;
	/**
	 * 	serialize this ResultDbId230
	 */
   protected void serializeResultDbId230(char[] resultDbId230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultDbId230,0,getStringValue(),beginResultDbId230,RESULT_DB_ID_230_LEN);
       localResultDbId230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultDbId230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultDbId230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultDbId230() {	 
   		return (substring(getStringValue(),beginResultDbId230,beginResultDbId230 + RESULT_DB_ID_230_LEN));
   	}
     int localResultDbPkg230Counter = -1;
     public boolean isResultDbPkg230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultDbPkg230Counter != sharedCounter;
         localResultDbPkg230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_DB_PKG_230_LEN = 16;
	/**
	 * 	serialize this ResultDbPkg230
	 */
   protected void serializeResultDbPkg230(char[] resultDbPkg230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultDbPkg230,0,getStringValue(),beginResultDbPkg230,RESULT_DB_PKG_230_LEN);
       localResultDbPkg230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultDbPkg230Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshResultDbPkg230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultDbPkg230() {	 
   		return (substring(getStringValue(),beginResultDbPkg230,beginResultDbPkg230 + RESULT_DB_PKG_230_LEN));
   	}
     int localResultCpuId230Counter = -1;
     public boolean isResultCpuId230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultCpuId230Counter != sharedCounter;
         localResultCpuId230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_CPU_ID_230_LEN = 8;
	/**
	 * 	serialize this ResultCpuId230
	 */
   protected void serializeResultCpuId230(char[] resultCpuId230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultCpuId230,0,getStringValue(),beginResultCpuId230,RESULT_CPU_ID_230_LEN);
       localResultCpuId230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultCpuId230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultCpuId230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultCpuId230() {	 
   		return (substring(getStringValue(),beginResultCpuId230,beginResultCpuId230 + RESULT_CPU_ID_230_LEN));
   	}
        int localResultRequest230Counter = -1;
        public boolean isResultRequest230Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localResultRequest230Counter != sharedCounter;
           localResultRequest230Counter = sharedCounter; return hasModified; 
        }
	    public boolean resultRequest230IsNumeric() {
	      return decimalIsNumeric(beginResultRequest230,RESULT_REQUEST_230_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RESULT_REQUEST_230_LEN = 5;
  	/**
	 * 	serializeResultRequest230
	 */
	protected void serializeResultRequest230(int resultRequest230) {
		   putDecimal(beginResultRequest230,resultRequest230,RESULT_REQUEST_230_LEN,true);
   }
   

   protected int checkResultRequest230MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshResultRequest230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshResultRequest230() throws CFException {	
   	try { 
		 return (getIntDecimal(beginResultRequest230,RESULT_REQUEST_230_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("resultRequest230", beginResultRequest230,RESULT_REQUEST_230_LEN);
     }
   	}
     int localResultEndptId230Counter = -1;
     public boolean isResultEndptId230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultEndptId230Counter != sharedCounter;
         localResultEndptId230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_ENDPT_ID_230_LEN = 7;
	/**
	 * 	serialize this ResultEndptId230
	 */
   protected void serializeResultEndptId230(char[] resultEndptId230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultEndptId230,0,getStringValue(),beginResultEndptId230,RESULT_ENDPT_ID_230_LEN);
       localResultEndptId230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultEndptId230Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshResultEndptId230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultEndptId230() {	 
   		return (substring(getStringValue(),beginResultEndptId230,beginResultEndptId230 + RESULT_ENDPT_ID_230_LEN));
   	}
     int localResultBulkId230Counter = -1;
     public boolean isResultBulkId230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultBulkId230Counter != sharedCounter;
         localResultBulkId230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_BULK_ID_230_LEN = 4;
	/**
	 * 	serialize this ResultBulkId230
	 */
   protected void serializeResultBulkId230(char[] resultBulkId230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultBulkId230,0,getStringValue(),beginResultBulkId230,RESULT_BULK_ID_230_LEN);
       localResultBulkId230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultBulkId230Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshResultBulkId230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultBulkId230() {	 
   		return (substring(getStringValue(),beginResultBulkId230,beginResultBulkId230 + RESULT_BULK_ID_230_LEN));
   	}
        int localResultCyclNum230Counter = -1;
        public boolean isResultCyclNum230Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localResultCyclNum230Counter != sharedCounter;
           localResultCyclNum230Counter = sharedCounter; return hasModified; 
        }
	    public boolean resultCyclNum230IsNumeric() {
	      return decimalIsNumeric(beginResultCyclNum230,RESULT_CYCL_NUM_230_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RESULT_CYCL_NUM_230_LEN = 2;
  	/**
	 * 	serializeResultCyclNum230
	 */
	protected void serializeResultCyclNum230(short resultCyclNum230) {
		   putDecimal(beginResultCyclNum230,resultCyclNum230,RESULT_CYCL_NUM_230_LEN,true);
   }
   

   protected short checkResultCyclNum230MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshResultCyclNum230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshResultCyclNum230() throws CFException {	
   	try { 
		 return (getShortDecimal(beginResultCyclNum230,RESULT_CYCL_NUM_230_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("resultCyclNum230", beginResultCyclNum230,RESULT_CYCL_NUM_230_LEN);
     }
   	}
     int localResultStatus230Counter = -1;
     public boolean isResultStatus230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultStatus230Counter != sharedCounter;
         localResultStatus230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_STATUS_230_LEN = 6;
	/**
	 * 	serialize this ResultStatus230
	 */
   protected void serializeResultStatus230(char[] resultStatus230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultStatus230,0,getStringValue(),beginResultStatus230,RESULT_STATUS_230_LEN);
       localResultStatus230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultStatus230Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshResultStatus230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultStatus230() {	 
   		return (substring(getStringValue(),beginResultStatus230,beginResultStatus230 + RESULT_STATUS_230_LEN));
   	}
     int localResultReason230Counter = -1;
     public boolean isResultReason230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultReason230Counter != sharedCounter;
         localResultReason230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_REASON_230_LEN = 30;
	/**
	 * 	serialize this ResultReason230
	 */
   protected void serializeResultReason230(char[] resultReason230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultReason230,0,getStringValue(),beginResultReason230,RESULT_REASON_230_LEN);
       localResultReason230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultReason230Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshResultReason230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultReason230() {	 
   		return (substring(getStringValue(),beginResultReason230,beginResultReason230 + RESULT_REASON_230_LEN));
   	}
     int localResultTs230Counter = -1;
     public boolean isResultTs230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultTs230Counter != sharedCounter;
         localResultTs230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_TS_230_LEN = 26;
	/**
	 * 	serialize this ResultTs230
	 */
   protected void serializeResultTs230(char[] resultTs230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultTs230,0,getStringValue(),beginResultTs230,RESULT_TS_230_LEN);
       localResultTs230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultTs230Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshResultTs230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultTs230() {	 
   		return (substring(getStringValue(),beginResultTs230,beginResultTs230 + RESULT_TS_230_LEN));
   	}
     int localResultListDd230Counter = -1;
     public boolean isResultListDd230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultListDd230Counter != sharedCounter;
         localResultListDd230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_LIST_DD_230_LEN = 8;
	/**
	 * 	serialize this ResultListDd230
	 */
   protected void serializeResultListDd230(char[] resultListDd230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultListDd230,0,getStringValue(),beginResultListDd230,RESULT_LIST_DD_230_LEN);
       localResultListDd230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultListDd230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultListDd230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultListDd230() {	 
   		return (substring(getStringValue(),beginResultListDd230,beginResultListDd230 + RESULT_LIST_DD_230_LEN));
   	}
     int localResultListDsn230Counter = -1;
     public boolean isResultListDsn230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultListDsn230Counter != sharedCounter;
         localResultListDsn230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_LIST_DSN_230_LEN = 54;
	/**
	 * 	serialize this ResultListDsn230
	 */
   protected void serializeResultListDsn230(char[] resultListDsn230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultListDsn230,0,getStringValue(),beginResultListDsn230,RESULT_LIST_DSN_230_LEN);
       localResultListDsn230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultListDsn230Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshResultListDsn230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultListDsn230() {	 
   		return (substring(getStringValue(),beginResultListDsn230,beginResultListDsn230 + RESULT_LIST_DSN_230_LEN));
   	}
     int localResultExitNam230Counter = -1;
     public boolean isResultExitNam230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultExitNam230Counter != sharedCounter;
         localResultExitNam230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_EXIT_NAM_230_LEN = 8;
	/**
	 * 	serialize this ResultExitNam230
	 */
   protected void serializeResultExitNam230(char[] resultExitNam230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultExitNam230,0,getStringValue(),beginResultExitNam230,RESULT_EXIT_NAM_230_LEN);
       localResultExitNam230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultExitNam230Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultExitNam230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultExitNam230() {	 
   		return (substring(getStringValue(),beginResultExitNam230,beginResultExitNam230 + RESULT_EXIT_NAM_230_LEN));
   	}
     int localResultExitDsn230Counter = -1;
     public boolean isResultExitDsn230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultExitDsn230Counter != sharedCounter;
         localResultExitDsn230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_EXIT_DSN_230_LEN = 44;
	/**
	 * 	serialize this ResultExitDsn230
	 */
   protected void serializeResultExitDsn230(char[] resultExitDsn230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultExitDsn230,0,getStringValue(),beginResultExitDsn230,RESULT_EXIT_DSN_230_LEN);
       localResultExitDsn230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultExitDsn230Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshResultExitDsn230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultExitDsn230() {	 
   		return (substring(getStringValue(),beginResultExitDsn230,beginResultExitDsn230 + RESULT_EXIT_DSN_230_LEN));
   	}
     int localResultCodeExit230Counter = -1;
     public boolean isResultCodeExit230Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultCodeExit230Counter != sharedCounter;
         localResultCodeExit230Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_CODE_EXIT_230_LEN = 1;
	/**
	 * 	serialize this ResultCodeExit230
	 */
   protected void serializeResultCodeExit230(char[] resultCodeExit230) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultCodeExit230,0,getStringValue(),beginResultCodeExit230,RESULT_CODE_EXIT_230_LEN);
       localResultCodeExit230Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultCodeExit230Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshResultCodeExit230 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultCodeExit230() {	 
   		return (substring(getStringValue(),beginResultCodeExit230,beginResultCodeExit230 + RESULT_CODE_EXIT_230_LEN));
   	}




}
  
