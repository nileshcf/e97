package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class BalRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BalRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BalRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BAL_RECORD_LENGTH = 200;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBalReportType;
            protected  int beginBalReportId;
            protected  int beginBalCutoffNum;
            protected  int beginBalSettlSvc;
            protected  int beginBalProcessorId;
            protected  int beginBalIca;
            protected  int beginBalAcqIssFlag;
            protected  int beginBalCurrCode;
            protected  int beginBalCurrExp;
            protected  int beginBalCmpltdAmt;
            protected  int beginBalCmpltdAmtInd;
            protected  int beginBalIntrchgAmt;
            protected  int beginBalIntrchgAmtInd;
            protected  int beginBalSettlAmt;
            protected  int beginBalSettlAmtInd;
            protected  int beginBalRecordCnt;
            protected  int beginBalFiller;
	
	/**
	* Constructor for BalRecordSerialized
	**/
    public BalRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BalRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BAL_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBalReportType = getStartOffset() + 0;	// set offset for serialization
  
             beginBalReportId = getStartOffset() + 10;	// set offset for serialization
  
             beginBalCutoffNum = getStartOffset() + 15;	// set offset for serialization
  
             beginBalSettlSvc = getStartOffset() + 18;	// set offset for serialization
  
             beginBalProcessorId = getStartOffset() + 21;	// set offset for serialization
  
             beginBalIca = getStartOffset() + 31;	// set offset for serialization
  
             beginBalAcqIssFlag = getStartOffset() + 37;	// set offset for serialization
  
             beginBalCurrCode = getStartOffset() + 38;	// set offset for serialization
  
             beginBalCurrExp = getStartOffset() + 41;	// set offset for serialization
  
             beginBalCmpltdAmt = getStartOffset() + 42;	// set offset for serialization
  
             beginBalCmpltdAmtInd = getStartOffset() + 59;	// set offset for serialization
  
             beginBalIntrchgAmt = getStartOffset() + 60;	// set offset for serialization
  
             beginBalIntrchgAmtInd = getStartOffset() + 77;	// set offset for serialization
  
             beginBalSettlAmt = getStartOffset() + 78;	// set offset for serialization
  
             beginBalSettlAmtInd = getStartOffset() + 95;	// set offset for serialization
  
             beginBalRecordCnt = getStartOffset() + 96;	// set offset for serialization
  
             beginBalFiller = getStartOffset() + 105;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBalReportTypeCounter = -1;
     public boolean isBalReportTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalReportTypeCounter != sharedCounter;
         localBalReportTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_REPORT_TYPE_LEN = 10;
	/**
	 * 	serialize this BalReportType
	 */
   protected void serializeBalReportType(char[] balReportType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balReportType,0,getStringValue(),beginBalReportType,BAL_REPORT_TYPE_LEN);
       localBalReportTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalReportTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBalReportType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalReportType() {	 
   		return (substring(getStringValue(),beginBalReportType,beginBalReportType + BAL_REPORT_TYPE_LEN));
   	}
     int localBalReportIdCounter = -1;
     public boolean isBalReportIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalReportIdCounter != sharedCounter;
         localBalReportIdCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_REPORT_ID_LEN = 5;
	/**
	 * 	serialize this BalReportId
	 */
   protected void serializeBalReportId(char[] balReportId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balReportId,0,getStringValue(),beginBalReportId,BAL_REPORT_ID_LEN);
       localBalReportIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalReportIdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshBalReportId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalReportId() {	 
   		return (substring(getStringValue(),beginBalReportId,beginBalReportId + BAL_REPORT_ID_LEN));
   	}
     int localBalCutoffNumCounter = -1;
     public boolean isBalCutoffNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalCutoffNumCounter != sharedCounter;
         localBalCutoffNumCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_CUTOFF_NUM_LEN = 3;
	/**
	 * 	serialize this BalCutoffNum
	 */
   protected void serializeBalCutoffNum(char[] balCutoffNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balCutoffNum,0,getStringValue(),beginBalCutoffNum,BAL_CUTOFF_NUM_LEN);
       localBalCutoffNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalCutoffNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBalCutoffNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalCutoffNum() {	 
   		return (substring(getStringValue(),beginBalCutoffNum,beginBalCutoffNum + BAL_CUTOFF_NUM_LEN));
   	}
     int localBalSettlSvcCounter = -1;
     public boolean isBalSettlSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalSettlSvcCounter != sharedCounter;
         localBalSettlSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_SETTL_SVC_LEN = 3;
	/**
	 * 	serialize this BalSettlSvc
	 */
   protected void serializeBalSettlSvc(char[] balSettlSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balSettlSvc,0,getStringValue(),beginBalSettlSvc,BAL_SETTL_SVC_LEN);
       localBalSettlSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalSettlSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBalSettlSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalSettlSvc() {	 
   		return (substring(getStringValue(),beginBalSettlSvc,beginBalSettlSvc + BAL_SETTL_SVC_LEN));
   	}
     int localBalProcessorIdCounter = -1;
     public boolean isBalProcessorIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalProcessorIdCounter != sharedCounter;
         localBalProcessorIdCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_PROCESSOR_ID_LEN = 10;
	/**
	 * 	serialize this BalProcessorId
	 */
   protected void serializeBalProcessorId(char[] balProcessorId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balProcessorId,0,getStringValue(),beginBalProcessorId,BAL_PROCESSOR_ID_LEN);
       localBalProcessorIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalProcessorIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBalProcessorId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalProcessorId() {	 
   		return (substring(getStringValue(),beginBalProcessorId,beginBalProcessorId + BAL_PROCESSOR_ID_LEN));
   	}
     int localBalIcaCounter = -1;
     public boolean isBalIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalIcaCounter != sharedCounter;
         localBalIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_ICA_LEN = 6;
	/**
	 * 	serialize this BalIca
	 */
   protected void serializeBalIca(char[] balIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balIca,0,getStringValue(),beginBalIca,BAL_ICA_LEN);
       localBalIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBalIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalIca() {	 
   		return (substring(getStringValue(),beginBalIca,beginBalIca + BAL_ICA_LEN));
   	}
     int localBalAcqIssFlagCounter = -1;
     public boolean isBalAcqIssFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalAcqIssFlagCounter != sharedCounter;
         localBalAcqIssFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_ACQ_ISS_FLAG_LEN = 1;
	/**
	 * 	serialize this BalAcqIssFlag
	 */
   protected void serializeBalAcqIssFlag(char[] balAcqIssFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balAcqIssFlag,0,getStringValue(),beginBalAcqIssFlag,BAL_ACQ_ISS_FLAG_LEN);
       localBalAcqIssFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalAcqIssFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBalAcqIssFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalAcqIssFlag() {	 
   		return (substring(getStringValue(),beginBalAcqIssFlag,beginBalAcqIssFlag + BAL_ACQ_ISS_FLAG_LEN));
   	}
     int localBalCurrCodeCounter = -1;
     public boolean isBalCurrCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalCurrCodeCounter != sharedCounter;
         localBalCurrCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of balCurrCode
	 *	@return balCurrCode
	 */
	public char[]  getBalCurrCodeString() {
	     return getCharArray(beginBalCurrCode,BAL_CURR_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean balCurrCodeIsNumeric() {
	    return isNumeric(beginBalCurrCode
	                    ,beginBalCurrCode + BAL_CURR_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAL_CURR_CODE_LEN = 3;
  	/**
	 * serializeBalCurrCode
	 */
	protected void serializeBalCurrCode(int balCurrCode) {
		 putNumber(beginBalCurrCode,balCurrCode,BAL_CURR_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBalCurrCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBalCurrCode
	 */
   	protected  int serializeBalCurrCode(char[] value) {
	    int  balCurrCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    balCurrCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBalCurrCode
		       ,3
		      );
		 localBalCurrCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  balCurrCode;
    }

   protected int checkBalCurrCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBalCurrCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBalCurrCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBalCurrCode
			                 ,BAL_CURR_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("balCurrCode", beginBalCurrCode,BAL_CURR_CODE_LEN);
    }
   	}
     int localBalCurrExpCounter = -1;
     public boolean isBalCurrExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalCurrExpCounter != sharedCounter;
         localBalCurrExpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of balCurrExp
	 *	@return balCurrExp
	 */
	public char[]  getBalCurrExpString() {
	     return getCharArray(beginBalCurrExp,BAL_CURR_EXP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean balCurrExpIsNumeric() {
	    return isNumeric(beginBalCurrExp
	                    ,beginBalCurrExp + BAL_CURR_EXP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAL_CURR_EXP_LEN = 1;
  	/**
	 * serializeBalCurrExp
	 */
	protected void serializeBalCurrExp(int balCurrExp) {
		 putNumber(beginBalCurrExp,balCurrExp,BAL_CURR_EXP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBalCurrExpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBalCurrExp
	 */
   	protected  int serializeBalCurrExp(char[] value) {
	    int  balCurrExp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    balCurrExp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginBalCurrExp
		       ,1
		      );
		 localBalCurrExpCounter = shareString.getSerializedField().getModifiedCounter();
		return  balCurrExp;
    }

   protected int checkBalCurrExpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBalCurrExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBalCurrExp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBalCurrExp
			                 ,BAL_CURR_EXP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("balCurrExp", beginBalCurrExp,BAL_CURR_EXP_LEN);
    }
   	}
     int localBalCmpltdAmtCounter = -1;
     public boolean isBalCmpltdAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalCmpltdAmtCounter != sharedCounter;
         localBalCmpltdAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of balCmpltdAmt
	 *	@return balCmpltdAmt
	 */
	public char[]  getBalCmpltdAmtString() {
	     return getCharArray(beginBalCmpltdAmt,BAL_CMPLTD_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean balCmpltdAmtIsNumeric() {
	    return isNumeric(beginBalCmpltdAmt
	                    ,beginBalCmpltdAmt + BAL_CMPLTD_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAL_CMPLTD_AMT_LEN = 17;
  	/**
	 * serializeBalCmpltdAmt
	 */
	protected void serializeBalCmpltdAmt(long balCmpltdAmt) {
		 putNumber(beginBalCmpltdAmt,balCmpltdAmt,BAL_CMPLTD_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBalCmpltdAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBalCmpltdAmt
	 */
   	protected  long serializeBalCmpltdAmt(char[] value) {
	    long  balCmpltdAmt;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    balCmpltdAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,false/*isSigned?*/)
		       ,beginBalCmpltdAmt
		       ,17
		      );
		 localBalCmpltdAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  balCmpltdAmt;
    }

   protected long checkBalCmpltdAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBalCmpltdAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBalCmpltdAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBalCmpltdAmt
			                 ,BAL_CMPLTD_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("balCmpltdAmt", beginBalCmpltdAmt,BAL_CMPLTD_AMT_LEN);
    }
   	}
     int localBalCmpltdAmtIndCounter = -1;
     public boolean isBalCmpltdAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalCmpltdAmtIndCounter != sharedCounter;
         localBalCmpltdAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_CMPLTD_AMT_IND_LEN = 1;
	/**
	 * 	serialize this BalCmpltdAmtInd
	 */
   protected void serializeBalCmpltdAmtInd(char[] balCmpltdAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balCmpltdAmtInd,0,getStringValue(),beginBalCmpltdAmtInd,BAL_CMPLTD_AMT_IND_LEN);
       localBalCmpltdAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalCmpltdAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBalCmpltdAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalCmpltdAmtInd() {	 
   		return (substring(getStringValue(),beginBalCmpltdAmtInd,beginBalCmpltdAmtInd + BAL_CMPLTD_AMT_IND_LEN));
   	}
     int localBalIntrchgAmtCounter = -1;
     public boolean isBalIntrchgAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalIntrchgAmtCounter != sharedCounter;
         localBalIntrchgAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of balIntrchgAmt
	 *	@return balIntrchgAmt
	 */
	public char[]  getBalIntrchgAmtString() {
	     return getCharArray(beginBalIntrchgAmt,BAL_INTRCHG_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean balIntrchgAmtIsNumeric() {
	    return isNumeric(beginBalIntrchgAmt
	                    ,beginBalIntrchgAmt + BAL_INTRCHG_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAL_INTRCHG_AMT_LEN = 17;
  	/**
	 * serializeBalIntrchgAmt
	 */
	protected void serializeBalIntrchgAmt(long balIntrchgAmt) {
		 putNumber(beginBalIntrchgAmt,balIntrchgAmt,BAL_INTRCHG_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBalIntrchgAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBalIntrchgAmt
	 */
   	protected  long serializeBalIntrchgAmt(char[] value) {
	    long  balIntrchgAmt;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    balIntrchgAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,false/*isSigned?*/)
		       ,beginBalIntrchgAmt
		       ,17
		      );
		 localBalIntrchgAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  balIntrchgAmt;
    }

   protected long checkBalIntrchgAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBalIntrchgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBalIntrchgAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBalIntrchgAmt
			                 ,BAL_INTRCHG_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("balIntrchgAmt", beginBalIntrchgAmt,BAL_INTRCHG_AMT_LEN);
    }
   	}
     int localBalIntrchgAmtIndCounter = -1;
     public boolean isBalIntrchgAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalIntrchgAmtIndCounter != sharedCounter;
         localBalIntrchgAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_INTRCHG_AMT_IND_LEN = 1;
	/**
	 * 	serialize this BalIntrchgAmtInd
	 */
   protected void serializeBalIntrchgAmtInd(char[] balIntrchgAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balIntrchgAmtInd,0,getStringValue(),beginBalIntrchgAmtInd,BAL_INTRCHG_AMT_IND_LEN);
       localBalIntrchgAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalIntrchgAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBalIntrchgAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalIntrchgAmtInd() {	 
   		return (substring(getStringValue(),beginBalIntrchgAmtInd,beginBalIntrchgAmtInd + BAL_INTRCHG_AMT_IND_LEN));
   	}
     int localBalSettlAmtCounter = -1;
     public boolean isBalSettlAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalSettlAmtCounter != sharedCounter;
         localBalSettlAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of balSettlAmt
	 *	@return balSettlAmt
	 */
	public char[]  getBalSettlAmtString() {
	     return getCharArray(beginBalSettlAmt,BAL_SETTL_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean balSettlAmtIsNumeric() {
	    return isNumeric(beginBalSettlAmt
	                    ,beginBalSettlAmt + BAL_SETTL_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAL_SETTL_AMT_LEN = 17;
  	/**
	 * serializeBalSettlAmt
	 */
	protected void serializeBalSettlAmt(long balSettlAmt) {
		 putNumber(beginBalSettlAmt,balSettlAmt,BAL_SETTL_AMT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBalSettlAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBalSettlAmt
	 */
   	protected  long serializeBalSettlAmt(char[] value) {
	    long  balSettlAmt;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    balSettlAmt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,false/*isSigned?*/)
		       ,beginBalSettlAmt
		       ,17
		      );
		 localBalSettlAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  balSettlAmt;
    }

   protected long checkBalSettlAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBalSettlAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBalSettlAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBalSettlAmt
			                 ,BAL_SETTL_AMT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("balSettlAmt", beginBalSettlAmt,BAL_SETTL_AMT_LEN);
    }
   	}
     int localBalSettlAmtIndCounter = -1;
     public boolean isBalSettlAmtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalSettlAmtIndCounter != sharedCounter;
         localBalSettlAmtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_SETTL_AMT_IND_LEN = 1;
	/**
	 * 	serialize this BalSettlAmtInd
	 */
   protected void serializeBalSettlAmtInd(char[] balSettlAmtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balSettlAmtInd,0,getStringValue(),beginBalSettlAmtInd,BAL_SETTL_AMT_IND_LEN);
       localBalSettlAmtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalSettlAmtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBalSettlAmtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalSettlAmtInd() {	 
   		return (substring(getStringValue(),beginBalSettlAmtInd,beginBalSettlAmtInd + BAL_SETTL_AMT_IND_LEN));
   	}
     int localBalRecordCntCounter = -1;
     public boolean isBalRecordCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalRecordCntCounter != sharedCounter;
         localBalRecordCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of balRecordCnt
	 *	@return balRecordCnt
	 */
	public char[]  getBalRecordCntString() {
	     return getCharArray(beginBalRecordCnt,BAL_RECORD_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean balRecordCntIsNumeric() {
	    return isNumeric(beginBalRecordCnt
	                    ,beginBalRecordCnt + BAL_RECORD_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BAL_RECORD_CNT_LEN = 9;
  	/**
	 * serializeBalRecordCnt
	 */
	protected void serializeBalRecordCnt(long balRecordCnt) {
		 putNumber(beginBalRecordCnt,balRecordCnt,BAL_RECORD_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBalRecordCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBalRecordCnt
	 */
   	protected  long serializeBalRecordCnt(char[] value) {
	    long  balRecordCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    balRecordCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginBalRecordCnt
		       ,9
		      );
		 localBalRecordCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  balRecordCnt;
    }

   protected long checkBalRecordCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBalRecordCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBalRecordCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBalRecordCnt
			                 ,BAL_RECORD_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("balRecordCnt", beginBalRecordCnt,BAL_RECORD_CNT_LEN);
    }
   	}
     int localBalFillerCounter = -1;
     public boolean isBalFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBalFillerCounter != sharedCounter;
         localBalFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int BAL_FILLER_LEN = 95;
	/**
	 * 	serialize this BalFiller
	 */
   protected void serializeBalFiller(char[] balFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(balFiller,0,getStringValue(),beginBalFiller,BAL_FILLER_LEN);
       localBalFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBalFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 95 ,false, false);
   }
    /**
	 *	refreshBalFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBalFiller() {	 
   		return (substring(getStringValue(),beginBalFiller,beginBalFiller + BAL_FILLER_LEN));
   	}




}
  
