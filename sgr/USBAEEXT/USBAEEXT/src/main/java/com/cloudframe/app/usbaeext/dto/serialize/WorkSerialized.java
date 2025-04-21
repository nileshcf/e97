package com.cloudframe.app.usbaeext.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 68;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTmAdjNo;
            protected  int beginTmAdjTime;
            protected  int beginTmAdjDepAmt;
            protected  int beginTmAdjCorrAmt;
            protected  int beginTmAdjAmt;
	
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
  
  
             beginTmAdjNo = getStartOffset() + 0;	// set offset for serialization
  
             beginTmAdjTime = getStartOffset() + 7;	// set offset for serialization
  
  
  
  
  
  
             beginTmAdjDepAmt = getStartOffset() + 14;	// set offset for serialization
  
             beginTmAdjCorrAmt = getStartOffset() + 32;	// set offset for serialization
  
  
  
  
  
  
  
  
  
             beginTmAdjAmt = getStartOffset() + 50;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localWaEndSwCounter = -1;
     public boolean isWaEndSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaEndSwCounter != sharedCounter;
         localWaEndSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWaEndSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localWaReturnCodeCounter = -1;
         public boolean isWaReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWaReturnCodeCounter != sharedCounter;
            localWaReturnCodeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkWaReturnCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTmAdjNoCounter = -1;
     public boolean isTmAdjNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjNoCounter != sharedCounter;
         localTmAdjNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tmAdjNo
	 *	@return tmAdjNo
	 */
	public char[]  getTmAdjNoString() {
	     return getCharArray(beginTmAdjNo,TM_ADJ_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjNoIsNumeric() {
	    return isNumeric(beginTmAdjNo
	                    ,beginTmAdjNo + TM_ADJ_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TM_ADJ_NO_LEN = 7;
  	/**
	 * serializeTmAdjNo
	 */
	protected void serializeTmAdjNo(long tmAdjNo) {
		 putNumber(beginTmAdjNo,tmAdjNo,TM_ADJ_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTmAdjNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTmAdjNo
	 */
   	protected  long serializeTmAdjNo(char[] value) {
	    long  tmAdjNo;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tmAdjNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginTmAdjNo
		       ,7
		      );
		 localTmAdjNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  tmAdjNo;
    }

   protected long checkTmAdjNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTmAdjNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTmAdjNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTmAdjNo
			                 ,TM_ADJ_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tmAdjNo", beginTmAdjNo,TM_ADJ_NO_LEN);
    }
   	}
     int localTmAdjTimeCounter = -1;
     public boolean isTmAdjTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjTimeCounter != sharedCounter;
         localTmAdjTimeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tmAdjTime
	 *	@return tmAdjTime
	 */
	public char[]  getTmAdjTimeString() {
	     return getCharArray(beginTmAdjTime,TM_ADJ_TIME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjTimeIsNumeric() {
	    return isNumeric(beginTmAdjTime
	                    ,beginTmAdjTime + TM_ADJ_TIME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TM_ADJ_TIME_LEN = 7;
  	/**
	 * serializeTmAdjTime
	 */
	protected void serializeTmAdjTime(long tmAdjTime) {
		 putNumber(beginTmAdjTime,tmAdjTime,TM_ADJ_TIME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTmAdjTimeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTmAdjTime
	 */
   	protected  long serializeTmAdjTime(char[] value) {
	    long  tmAdjTime;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tmAdjTime = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginTmAdjTime
		       ,7
		      );
		 localTmAdjTimeCounter = shareString.getSerializedField().getModifiedCounter();
		return  tmAdjTime;
    }

   protected long checkTmAdjTimeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTmAdjTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTmAdjTime() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTmAdjTime
			                 ,TM_ADJ_TIME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tmAdjTime", beginTmAdjTime,TM_ADJ_TIME_LEN);
    }
   	}
     int localTmAdjAcctCounter = -1;
     public boolean isTmAdjAcctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjAcctCounter != sharedCounter;
         localTmAdjAcctCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjAcctConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,true, false);
   }
     int localTmAdjDepDdrKeyCounter = -1;
     public boolean isTmAdjDepDdrKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDepDdrKeyCounter != sharedCounter;
         localTmAdjDepDdrKeyCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjDepDdrKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTmAdjPsetCounter = -1;
     public boolean isTmAdjPsetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjPsetCounter != sharedCounter;
         localTmAdjPsetCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjPsetConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTmAdjDdrKeyCounter = -1;
     public boolean isTmAdjDdrKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDdrKeyCounter != sharedCounter;
         localTmAdjDdrKeyCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjDdrKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTmAdjDepAcctCounter = -1;
     public boolean isTmAdjDepAcctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDepAcctCounter != sharedCounter;
         localTmAdjDepAcctCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjDepAcctConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,true, false);
   }
     int localTmAdjDepAmtCounter = -1;
     
     public boolean isTmAdjDepAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDepAmtCounter != sharedCounter;
         localTmAdjDepAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tmAdjDepAmt
	 *	@return tmAdjDepAmt
	 */
	public char[]  getTmAdjDepAmtString() {
	    return getCharArray(beginTmAdjDepAmt,TM_ADJ_DEP_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjDepAmtIsNumeric() {
		    return isNumeric(beginTmAdjDepAmt
	                    ,beginTmAdjDepAmt + TM_ADJ_DEP_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TM_ADJ_DEP_AMT_LEN = 18;
  protected  static final int TM_ADJ_DEP_AMT_SCALE = 2;

   protected BigDecimal checkTmAdjDepAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeTmAdjDepAmt
	 */
	protected void serializeTmAdjDepAmt(BigDecimal tmAdjDepAmt) {
	       putNumber(beginTmAdjDepAmt,tmAdjDepAmt,TM_ADJ_DEP_AMT_LEN,TM_ADJ_DEP_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTmAdjDepAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTmAdjDepAmt
	 */
   	protected  BigDecimal serializeTmAdjDepAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginTmAdjDepAmt
		       ,18
		      );		 localTmAdjDepAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TM_ADJ_DEP_AMT_LEN,TM_ADJ_DEP_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tmAdjDepAmt", beginTmAdjDepAmt,TM_ADJ_DEP_AMT_LEN);
    	}
    }
    /**
	 *	refreshTmAdjDepAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTmAdjDepAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTmAdjDepAmt
			            ,TM_ADJ_DEP_AMT_LEN
			            ,TM_ADJ_DEP_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tmAdjDepAmt", beginTmAdjDepAmt,TM_ADJ_DEP_AMT_LEN);
    }
   	}
     int localTmAdjCorrAmtCounter = -1;
     
     public boolean isTmAdjCorrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjCorrAmtCounter != sharedCounter;
         localTmAdjCorrAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tmAdjCorrAmt
	 *	@return tmAdjCorrAmt
	 */
	public char[]  getTmAdjCorrAmtString() {
	    return getCharArray(beginTmAdjCorrAmt,TM_ADJ_CORR_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjCorrAmtIsNumeric() {
		    return isNumeric(beginTmAdjCorrAmt
	                    ,beginTmAdjCorrAmt + TM_ADJ_CORR_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TM_ADJ_CORR_AMT_LEN = 18;
  protected  static final int TM_ADJ_CORR_AMT_SCALE = 2;

   protected BigDecimal checkTmAdjCorrAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeTmAdjCorrAmt
	 */
	protected void serializeTmAdjCorrAmt(BigDecimal tmAdjCorrAmt) {
	       putNumber(beginTmAdjCorrAmt,tmAdjCorrAmt,TM_ADJ_CORR_AMT_LEN,TM_ADJ_CORR_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTmAdjCorrAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTmAdjCorrAmt
	 */
   	protected  BigDecimal serializeTmAdjCorrAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginTmAdjCorrAmt
		       ,18
		      );		 localTmAdjCorrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TM_ADJ_CORR_AMT_LEN,TM_ADJ_CORR_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tmAdjCorrAmt", beginTmAdjCorrAmt,TM_ADJ_CORR_AMT_LEN);
    	}
    }
    /**
	 *	refreshTmAdjCorrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTmAdjCorrAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTmAdjCorrAmt
			            ,TM_ADJ_CORR_AMT_LEN
			            ,TM_ADJ_CORR_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tmAdjCorrAmt", beginTmAdjCorrAmt,TM_ADJ_CORR_AMT_LEN);
    }
   	}
     int localTmAdjClassCounter = -1;
     public boolean isTmAdjClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjClassCounter != sharedCounter;
         localTmAdjClassCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjClassConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localTmAdjCodeCounter = -1;
     public boolean isTmAdjCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjCodeCounter != sharedCounter;
         localTmAdjCodeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localTmAdjNameCounter = -1;
     public boolean isTmAdjNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjNameCounter != sharedCounter;
         localTmAdjNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjNameConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
     int localTmAdjOperNoCounter = -1;
     public boolean isTmAdjOperNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjOperNoCounter != sharedCounter;
         localTmAdjOperNoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjOperNoConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localTmAdjEntryKeyCounter = -1;
     public boolean isTmAdjEntryKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjEntryKeyCounter != sharedCounter;
         localTmAdjEntryKeyCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjEntryKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localTmAdjStateCounter = -1;
     public boolean isTmAdjStateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjStateCounter != sharedCounter;
         localTmAdjStateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjStateConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localTmAdjCommentCounter = -1;
     public boolean isTmAdjCommentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjCommentCounter != sharedCounter;
         localTmAdjCommentCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjCommentConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localTmAdjRtCounter = -1;
     public boolean isTmAdjRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjRtCounter != sharedCounter;
         localTmAdjRtCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjRtConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
     int localTmAdjAmtCounter = -1;
     
     public boolean isTmAdjAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjAmtCounter != sharedCounter;
         localTmAdjAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of tmAdjAmt
	 *	@return tmAdjAmt
	 */
	public char[]  getTmAdjAmtString() {
	    return getCharArray(beginTmAdjAmt,TM_ADJ_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tmAdjAmtIsNumeric() {
		    return isNumeric(beginTmAdjAmt
	                    ,beginTmAdjAmt + TM_ADJ_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int TM_ADJ_AMT_LEN = 18;
  protected  static final int TM_ADJ_AMT_SCALE = 2;

   protected BigDecimal checkTmAdjAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeTmAdjAmt
	 */
	protected void serializeTmAdjAmt(BigDecimal tmAdjAmt) {
	       putNumber(beginTmAdjAmt,tmAdjAmt,TM_ADJ_AMT_LEN,TM_ADJ_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTmAdjAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeTmAdjAmt
	 */
   	protected  BigDecimal serializeTmAdjAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginTmAdjAmt
		       ,18
		      );		 localTmAdjAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,TM_ADJ_AMT_LEN,TM_ADJ_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("tmAdjAmt", beginTmAdjAmt,TM_ADJ_AMT_LEN);
    	}
    }
    /**
	 *	refreshTmAdjAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTmAdjAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginTmAdjAmt
			            ,TM_ADJ_AMT_LEN
			            ,TM_ADJ_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("tmAdjAmt", beginTmAdjAmt,TM_ADJ_AMT_LEN);
    }
   	}
     int localTmAdjItemClassCounter = -1;
     public boolean isTmAdjItemClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjItemClassCounter != sharedCounter;
         localTmAdjItemClassCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjItemClassConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localTmAdjFirstDrnCounter = -1;
     public boolean isTmAdjFirstDrnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjFirstDrnCounter != sharedCounter;
         localTmAdjFirstDrnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjFirstDrnConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localTmAdjDrnCounter = -1;
     public boolean isTmAdjDrnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDrnCounter != sharedCounter;
         localTmAdjDrnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjDrnConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localTmAdjLookupTextCounter = -1;
     public boolean isTmAdjLookupTextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjLookupTextCounter != sharedCounter;
         localTmAdjLookupTextCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjLookupTextConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localTmAdjAdviceKeyCounter = -1;
     public boolean isTmAdjAdviceKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjAdviceKeyCounter != sharedCounter;
         localTmAdjAdviceKeyCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjAdviceKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localTmAdjCorrF5Counter = -1;
     public boolean isTmAdjCorrF5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjCorrF5Counter != sharedCounter;
         localTmAdjCorrF5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjCorrF5Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localTmAdjDepF5Counter = -1;
     public boolean isTmAdjDepF5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjDepF5Counter != sharedCounter;
         localTmAdjDepF5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjDepF5Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localTmAdjAppInstanceCounter = -1;
     public boolean isTmAdjAppInstanceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjAppInstanceCounter != sharedCounter;
         localTmAdjAppInstanceCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjAppInstanceConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localTmAdjEntryCounter = -1;
     public boolean isTmAdjEntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjEntryCounter != sharedCounter;
         localTmAdjEntryCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjEntryConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localTmAdjCycleCounter = -1;
     public boolean isTmAdjCycleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjCycleCounter != sharedCounter;
         localTmAdjCycleCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjCycleConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTmAdjEndCounter = -1;
     public boolean isTmAdjEndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTmAdjEndCounter != sharedCounter;
         localTmAdjEndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTmAdjEndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }




}
  
