package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360OtherDataFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360OtherDataFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360OtherDataFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_OTHER_DATA_FIELDS_LENGTH = 124;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360TjfRecType;
            protected  int beginX360PlusSettDate;
            protected  int beginX360BatchFeeKey;
            protected  int beginX360Report211NeededSwitch;
            protected  int beginX360McsImpDec;
            protected  int beginX360InstName;
            protected  int beginX360ProcName;
            protected  int beginX360AtmPosFlag;
            protected  int beginX360SetlTyp;
            protected  int beginX360InstId;
            protected  int beginX360TransactionCnt;
            protected  int beginX360BatchSendingIca;
            protected  int beginX360SrtMcsSeqNum;
            protected  int beginX360SpecialProcessor;
	
	/**
	* Constructor for X360OtherDataFieldsSerialized
	**/
    public X360OtherDataFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360OtherDataFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360OtherDataFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360OtherDataFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,95); // serialize this field at offset 95 by default 
    }
    
	/**
	* sets parent for this X360OtherDataFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 95 by default
    }    
	/**
	* initializes the field in X360OtherDataFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_OTHER_DATA_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360TjfRecType = getStartOffset() + 0;	// set offset for serialization
  
             beginX360PlusSettDate = getStartOffset() + 2;	// set offset for serialization
  
             beginX360BatchFeeKey = getStartOffset() + 6;	// set offset for serialization
  
             beginX360Report211NeededSwitch = getStartOffset() + 20;	// set offset for serialization
  
             beginX360McsImpDec = getStartOffset() + 21;	// set offset for serialization
  
             beginX360InstName = getStartOffset() + 22;	// set offset for serialization
  
             beginX360ProcName = getStartOffset() + 47;	// set offset for serialization
  
             beginX360AtmPosFlag = getStartOffset() + 72;	// set offset for serialization
  
             beginX360SetlTyp = getStartOffset() + 73;	// set offset for serialization
  
             beginX360InstId = getStartOffset() + 74;	// set offset for serialization
  
  
             beginX360TransactionCnt = getStartOffset() + 94;	// set offset for serialization
  
             beginX360BatchSendingIca = getStartOffset() + 99;	// set offset for serialization
  
             beginX360SrtMcsSeqNum = getStartOffset() + 105;	// set offset for serialization
  
             beginX360SpecialProcessor = getStartOffset() + 111;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localX360TjfRecTypeCounter = -1;
     public boolean isX360TjfRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360TjfRecTypeCounter != sharedCounter;
         localX360TjfRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_TJF_REC_TYPE_LEN = 2;
	/**
	 * 	serialize this X360TjfRecType
	 */
   protected void serializeX360TjfRecType(char[] x360TjfRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360TjfRecType,0,getStringValue(),beginX360TjfRecType,X_360_TJF_REC_TYPE_LEN);
       localX360TjfRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360TjfRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshX360TjfRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360TjfRecType() {	 
   		return (substring(getStringValue(),beginX360TjfRecType,beginX360TjfRecType + X_360_TJF_REC_TYPE_LEN));
   	}
     int localX360PlusSettDateCounter = -1;
     public boolean isX360PlusSettDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360PlusSettDateCounter != sharedCounter;
         localX360PlusSettDateCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_PLUS_SETT_DATE_LEN = 4;
	/**
	 * 	serialize this X360PlusSettDate
	 */
   protected void serializeX360PlusSettDate(char[] x360PlusSettDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360PlusSettDate,0,getStringValue(),beginX360PlusSettDate,X_360_PLUS_SETT_DATE_LEN);
       localX360PlusSettDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360PlusSettDateConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshX360PlusSettDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360PlusSettDate() {	 
   		return (substring(getStringValue(),beginX360PlusSettDate,beginX360PlusSettDate + X_360_PLUS_SETT_DATE_LEN));
   	}
     int localX360BatchFeeKeyCounter = -1;
     public boolean isX360BatchFeeKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360BatchFeeKeyCounter != sharedCounter;
         localX360BatchFeeKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_BATCH_FEE_KEY_LEN = 14;
	/**
	 * 	serialize this X360BatchFeeKey
	 */
   protected void serializeX360BatchFeeKey(char[] x360BatchFeeKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360BatchFeeKey,0,getStringValue(),beginX360BatchFeeKey,X_360_BATCH_FEE_KEY_LEN);
       localX360BatchFeeKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360BatchFeeKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshX360BatchFeeKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360BatchFeeKey() {	 
   		return (substring(getStringValue(),beginX360BatchFeeKey,beginX360BatchFeeKey + X_360_BATCH_FEE_KEY_LEN));
   	}
     int localX360Report211NeededSwitchCounter = -1;
     public boolean isX360Report211NeededSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360Report211NeededSwitchCounter != sharedCounter;
         localX360Report211NeededSwitchCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_REPORT_211_NEEDED_SWITCH_LEN = 1;
	/**
	 * 	serialize this X360Report211NeededSwitch
	 */
   protected void serializeX360Report211NeededSwitch(char[] x360Report211NeededSwitch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360Report211NeededSwitch,0,getStringValue(),beginX360Report211NeededSwitch,X_360_REPORT_211_NEEDED_SWITCH_LEN);
       localX360Report211NeededSwitchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360Report211NeededSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360Report211NeededSwitch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360Report211NeededSwitch() {	 
   		return (substring(getStringValue(),beginX360Report211NeededSwitch,beginX360Report211NeededSwitch + X_360_REPORT_211_NEEDED_SWITCH_LEN));
   	}
     int localX360McsImpDecCounter = -1;
     public boolean isX360McsImpDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360McsImpDecCounter != sharedCounter;
         localX360McsImpDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360McsImpDec
	 *	@return x360McsImpDec
	 */
	public char[]  getX360McsImpDecString() {
	     return getCharArray(beginX360McsImpDec,X_360_MCS_IMP_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360McsImpDecIsNumeric() {
	    return isNumeric(beginX360McsImpDec
	                    ,beginX360McsImpDec + X_360_MCS_IMP_DEC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_MCS_IMP_DEC_LEN = 1;
  	/**
	 * serializeX360McsImpDec
	 */
	protected void serializeX360McsImpDec(int x360McsImpDec) {
		 putNumber(beginX360McsImpDec,x360McsImpDec,X_360_MCS_IMP_DEC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360McsImpDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360McsImpDec
	 */
   	protected  int serializeX360McsImpDec(char[] value) {
	    int  x360McsImpDec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360McsImpDec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginX360McsImpDec
		       ,1
		      );
		 localX360McsImpDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360McsImpDec;
    }

   protected int checkX360McsImpDecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360McsImpDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360McsImpDec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360McsImpDec
			                 ,X_360_MCS_IMP_DEC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360McsImpDec", beginX360McsImpDec,X_360_MCS_IMP_DEC_LEN);
    }
   	}
     int localX360InstNameCounter = -1;
     public boolean isX360InstNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360InstNameCounter != sharedCounter;
         localX360InstNameCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_INST_NAME_LEN = 25;
	/**
	 * 	serialize this X360InstName
	 */
   protected void serializeX360InstName(char[] x360InstName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360InstName,0,getStringValue(),beginX360InstName,X_360_INST_NAME_LEN);
       localX360InstNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360InstNameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshX360InstName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360InstName() {	 
   		return (substring(getStringValue(),beginX360InstName,beginX360InstName + X_360_INST_NAME_LEN));
   	}
     int localX360ProcNameCounter = -1;
     public boolean isX360ProcNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360ProcNameCounter != sharedCounter;
         localX360ProcNameCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_PROC_NAME_LEN = 25;
	/**
	 * 	serialize this X360ProcName
	 */
   protected void serializeX360ProcName(char[] x360ProcName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360ProcName,0,getStringValue(),beginX360ProcName,X_360_PROC_NAME_LEN);
       localX360ProcNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360ProcNameConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshX360ProcName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360ProcName() {	 
   		return (substring(getStringValue(),beginX360ProcName,beginX360ProcName + X_360_PROC_NAME_LEN));
   	}
     int localX360AtmPosFlagCounter = -1;
     public boolean isX360AtmPosFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AtmPosFlagCounter != sharedCounter;
         localX360AtmPosFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_ATM_POS_FLAG_LEN = 1;
	/**
	 * 	serialize this X360AtmPosFlag
	 */
   protected void serializeX360AtmPosFlag(char[] x360AtmPosFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360AtmPosFlag,0,getStringValue(),beginX360AtmPosFlag,X_360_ATM_POS_FLAG_LEN);
       localX360AtmPosFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360AtmPosFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360AtmPosFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360AtmPosFlag() {	 
   		return (substring(getStringValue(),beginX360AtmPosFlag,beginX360AtmPosFlag + X_360_ATM_POS_FLAG_LEN));
   	}
     int localX360SetlTypCounter = -1;
     public boolean isX360SetlTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SetlTypCounter != sharedCounter;
         localX360SetlTypCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SETL_TYP_LEN = 1;
	/**
	 * 	serialize this X360SetlTyp
	 */
   protected void serializeX360SetlTyp(char[] x360SetlTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SetlTyp,0,getStringValue(),beginX360SetlTyp,X_360_SETL_TYP_LEN);
       localX360SetlTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SetlTypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360SetlTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SetlTyp() {	 
   		return (substring(getStringValue(),beginX360SetlTyp,beginX360SetlTyp + X_360_SETL_TYP_LEN));
   	}
     int localX360InstIdCounter = -1;
     public boolean isX360InstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360InstIdCounter != sharedCounter;
         localX360InstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_INST_ID_LEN = 10;
	/**
	 * 	serialize this X360InstId
	 */
   protected void serializeX360InstId(char[] x360InstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360InstId,0,getStringValue(),beginX360InstId,X_360_INST_ID_LEN);
       localX360InstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360InstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshX360InstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360InstId() {	 
   		return (substring(getStringValue(),beginX360InstId,beginX360InstId + X_360_INST_ID_LEN));
   	}
        int localX360TransactionCntCounter = -1;
        public boolean isX360TransactionCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360TransactionCntCounter != sharedCounter;
           localX360TransactionCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360TransactionCntIsNumeric() {
	      return decimalIsNumeric(beginX360TransactionCnt,X_360_TRANSACTION_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_TRANSACTION_CNT_LEN = 5;
  	/**
	 * 	serializeX360TransactionCnt
	 */
	protected void serializeX360TransactionCnt(int x360TransactionCnt) {
		   putDecimal(beginX360TransactionCnt,x360TransactionCnt,X_360_TRANSACTION_CNT_LEN,true);
   }
   

   protected int checkX360TransactionCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360TransactionCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360TransactionCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360TransactionCnt,X_360_TRANSACTION_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360TransactionCnt", beginX360TransactionCnt,X_360_TRANSACTION_CNT_LEN);
     }
   	}
     int localX360BatchSendingIcaCounter = -1;
     public boolean isX360BatchSendingIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360BatchSendingIcaCounter != sharedCounter;
         localX360BatchSendingIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360BatchSendingIca
	 *	@return x360BatchSendingIca
	 */
	public char[]  getX360BatchSendingIcaString() {
	     return getCharArray(beginX360BatchSendingIca,X_360_BATCH_SENDING_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360BatchSendingIcaIsNumeric() {
	    return isNumeric(beginX360BatchSendingIca
	                    ,beginX360BatchSendingIca + X_360_BATCH_SENDING_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_BATCH_SENDING_ICA_LEN = 6;
  	/**
	 * serializeX360BatchSendingIca
	 */
	protected void serializeX360BatchSendingIca(long x360BatchSendingIca) {
		 putNumber(beginX360BatchSendingIca,x360BatchSendingIca,X_360_BATCH_SENDING_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360BatchSendingIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360BatchSendingIca
	 */
   	protected  long serializeX360BatchSendingIca(char[] value) {
	    long  x360BatchSendingIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360BatchSendingIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360BatchSendingIca
		       ,6
		      );
		 localX360BatchSendingIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360BatchSendingIca;
    }

   protected long checkX360BatchSendingIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360BatchSendingIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360BatchSendingIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360BatchSendingIca
			                 ,X_360_BATCH_SENDING_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360BatchSendingIca", beginX360BatchSendingIca,X_360_BATCH_SENDING_ICA_LEN);
    }
   	}
     int localX360SrtMcsSeqNumCounter = -1;
     public boolean isX360SrtMcsSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtMcsSeqNumCounter != sharedCounter;
         localX360SrtMcsSeqNumCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SRT_MCS_SEQ_NUM_LEN = 6;
	/**
	 * 	serialize this X360SrtMcsSeqNum
	 */
   protected void serializeX360SrtMcsSeqNum(char[] x360SrtMcsSeqNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SrtMcsSeqNum,0,getStringValue(),beginX360SrtMcsSeqNum,X_360_SRT_MCS_SEQ_NUM_LEN);
       localX360SrtMcsSeqNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SrtMcsSeqNumConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshX360SrtMcsSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SrtMcsSeqNum() {	 
   		return (substring(getStringValue(),beginX360SrtMcsSeqNum,beginX360SrtMcsSeqNum + X_360_SRT_MCS_SEQ_NUM_LEN));
   	}
     int localX360SpecialProcessorCounter = -1;
     public boolean isX360SpecialProcessorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SpecialProcessorCounter != sharedCounter;
         localX360SpecialProcessorCounter = sharedCounter; return hasModified;
     }
	protected static final int X_360_SPECIAL_PROCESSOR_LEN = 1;
	/**
	 * 	serialize this X360SpecialProcessor
	 */
   protected void serializeX360SpecialProcessor(char[] x360SpecialProcessor) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360SpecialProcessor,0,getStringValue(),beginX360SpecialProcessor,X_360_SPECIAL_PROCESSOR_LEN);
       localX360SpecialProcessorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360SpecialProcessorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshX360SpecialProcessor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360SpecialProcessor() {	 
   		return (substring(getStringValue(),beginX360SpecialProcessor,beginX360SpecialProcessor + X_360_SPECIAL_PROCESSOR_LEN));
   	}




}
  
