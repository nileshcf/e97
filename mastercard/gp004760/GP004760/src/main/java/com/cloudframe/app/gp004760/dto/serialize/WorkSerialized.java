package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStatusCode600;
            protected  int beginIdx800;
            protected  int beginSub800;
            protected  int beginPlusOneHundred300;
            protected  int beginOutfileCnt;
            protected  int beginOcrCnt;
            protected  int beginWsSqlcodeDisp800;
	
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
  
  
  
  
  
             beginStatusCode600 = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginIdx800 = getStartOffset() + 2;	// set offset for serialization
  
             beginSub800 = getStartOffset() + 7;	// set offset for serialization
  
             beginPlusOneHundred300 = getStartOffset() + 12;	// set offset for serialization
  
  
             beginOutfileCnt = getStartOffset() + 15;	// set offset for serialization
  
             beginOcrCnt = getStartOffset() + 20;	// set offset for serialization
  
  
  
  
             beginWsSqlcodeDisp800 = getStartOffset() + 21;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localSys201FileStatus200Counter = -1;
     public boolean isSys201FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201FileStatus200Counter != sharedCounter;
         localSys201FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys202FileStatus200Counter = -1;
     public boolean isSys202FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202FileStatus200Counter != sharedCounter;
         localSys202FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys202FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localStatusCode300Counter = -1;
     public boolean isStatusCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatusCode300Counter != sharedCounter;
         localStatusCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkStatusCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localAbendCode300Counter = -1;
     public boolean isAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode300Counter != sharedCounter;
         localAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localErrorMessage600Counter = -1;
     public boolean isErrorMessage600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorMessage600Counter != sharedCounter;
         localErrorMessage600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorMessage600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
     int localStatusCode600Counter = -1;
     public boolean isStatusCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatusCode600Counter != sharedCounter;
         localStatusCode600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of statusCode600
	 *	@return statusCode600
	 */
	public char[]  getStatusCode600String() {
	     return getCharArray(beginStatusCode600,STATUS_CODE_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean statusCode600IsNumeric() {
	    return isNumeric(beginStatusCode600
	                    ,beginStatusCode600 + STATUS_CODE_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STATUS_CODE_600_LEN = 2;
  	/**
	 * serializeStatusCode600
	 */
	protected void serializeStatusCode600(int statusCode600) {
		 putNumber(beginStatusCode600,statusCode600,STATUS_CODE_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStatusCode600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStatusCode600
	 */
   	protected  int serializeStatusCode600(char[] value) {
	    int  statusCode600;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    statusCode600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginStatusCode600
		       ,2
		      );
		 localStatusCode600Counter = shareString.getSerializedField().getModifiedCounter();
		return  statusCode600;
    }

   protected int checkStatusCode600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStatusCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStatusCode600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStatusCode600
			                 ,STATUS_CODE_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("statusCode600", beginStatusCode600,STATUS_CODE_600_LEN);
    }
   	}
     int localDisplayAbendMsgTxt600Counter = -1;
     public boolean isDisplayAbendMsgTxt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayAbendMsgTxt600Counter != sharedCounter;
         localDisplayAbendMsgTxt600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDisplayAbendMsgTxt600Constraints(char[] value) {
   			return super.checkConstraints(value , 480 ,false, false);
   }
     int localAbendPara300Counter = -1;
     public boolean isAbendPara300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPara300Counter != sharedCounter;
         localAbendPara300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPara300Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localIdx800Counter = -1;
     public boolean isIdx800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIdx800Counter != sharedCounter;
         localIdx800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of idx800
	 *	@return idx800
	 */
	public char[]  getIdx800String() {
	     return getCharArray(beginIdx800,IDX_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean idx800IsNumeric() {
	    return isNumeric(beginIdx800
	                    ,beginIdx800 + IDX_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IDX_800_LEN = 5;
  	/**
	 * serializeIdx800
	 */
	protected void serializeIdx800(long idx800) {
		 putNumber(beginIdx800,idx800,IDX_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIdx800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIdx800
	 */
   	protected  long serializeIdx800(char[] value) {
	    long  idx800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    idx800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIdx800
		       ,5
		      );
		 localIdx800Counter = shareString.getSerializedField().getModifiedCounter();
		return  idx800;
    }

   protected long checkIdx800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIdx800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIdx800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIdx800
			                 ,IDX_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("idx800", beginIdx800,IDX_800_LEN);
    }
   	}
     int localSub800Counter = -1;
     public boolean isSub800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub800Counter != sharedCounter;
         localSub800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub800
	 *	@return sub800
	 */
	public char[]  getSub800String() {
	     return getCharArray(beginSub800,SUB_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub800IsNumeric() {
	    return isNumeric(beginSub800
	                    ,beginSub800 + SUB_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_800_LEN = 5;
  	/**
	 * serializeSub800
	 */
	protected void serializeSub800(long sub800) {
		 putNumber(beginSub800,sub800,SUB_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub800
	 */
   	protected  long serializeSub800(char[] value) {
	    long  sub800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginSub800
		       ,5
		      );
		 localSub800Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub800;
    }

   protected long checkSub800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub800
			                 ,SUB_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub800", beginSub800,SUB_800_LEN);
    }
   	}
     int localPlusOneHundred300Counter = -1;
     public boolean isPlusOneHundred300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlusOneHundred300Counter != sharedCounter;
         localPlusOneHundred300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plusOneHundred300
	 *	@return plusOneHundred300
	 */
	public char[]  getPlusOneHundred300String() {
	     return getCharArray(beginPlusOneHundred300,PLUS_ONE_HUNDRED_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plusOneHundred300IsNumeric() {
	    return isNumeric(beginPlusOneHundred300
	                    ,beginPlusOneHundred300 + PLUS_ONE_HUNDRED_300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLUS_ONE_HUNDRED_300_LEN = 3;
  	/**
	 * serializePlusOneHundred300
	 */
	protected void serializePlusOneHundred300(short plusOneHundred300) {
		 putNumber(beginPlusOneHundred300,plusOneHundred300,PLUS_ONE_HUNDRED_300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlusOneHundred300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlusOneHundred300
	 */
   	protected  short serializePlusOneHundred300(char[] value) {
	    short  plusOneHundred300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plusOneHundred300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginPlusOneHundred300
		       ,3
		      );
		 localPlusOneHundred300Counter = shareString.getSerializedField().getModifiedCounter();
		return  plusOneHundred300;
    }

   protected short checkPlusOneHundred300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPlusOneHundred300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPlusOneHundred300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginPlusOneHundred300
			                 ,PLUS_ONE_HUNDRED_300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plusOneHundred300", beginPlusOneHundred300,PLUS_ONE_HUNDRED_300_LEN);
    }
   	}
     int localCabtccextCsr100Counter = -1;
     public boolean isCabtccextCsr100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCabtccextCsr100Counter != sharedCounter;
         localCabtccextCsr100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCabtccextCsr100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localOutfileCntCounter = -1;
     public boolean isOutfileCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutfileCntCounter != sharedCounter;
         localOutfileCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of outfileCnt
	 *	@return outfileCnt
	 */
	public char[]  getOutfileCntString() {
	     return getCharArray(beginOutfileCnt,OUTFILE_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outfileCntIsNumeric() {
	    return isNumeric(beginOutfileCnt
	                    ,beginOutfileCnt + OUTFILE_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OUTFILE_CNT_LEN = 5;
  	/**
	 * serializeOutfileCnt
	 */
	protected void serializeOutfileCnt(long outfileCnt) {
		 putNumber(beginOutfileCnt,outfileCnt,OUTFILE_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutfileCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOutfileCnt
	 */
   	protected  long serializeOutfileCnt(char[] value) {
	    long  outfileCnt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    outfileCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginOutfileCnt
		       ,5
		      );
		 localOutfileCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  outfileCnt;
    }

   protected long checkOutfileCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOutfileCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOutfileCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOutfileCnt
			                 ,OUTFILE_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("outfileCnt", beginOutfileCnt,OUTFILE_CNT_LEN);
    }
   	}
     int localOcrCntCounter = -1;
     public boolean isOcrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOcrCntCounter != sharedCounter;
         localOcrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ocrCnt
	 *	@return ocrCnt
	 */
	public char[]  getOcrCntString() {
	     return getCharArray(beginOcrCnt,OCR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ocrCntIsNumeric() {
	    return isNumeric(beginOcrCnt
	                    ,beginOcrCnt + OCR_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OCR_CNT_LEN = 1;
  	/**
	 * serializeOcrCnt
	 */
	protected void serializeOcrCnt(int ocrCnt) {
		 putNumber(beginOcrCnt,ocrCnt,OCR_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOcrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOcrCnt
	 */
   	protected  int serializeOcrCnt(char[] value) {
	    int  ocrCnt;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ocrCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginOcrCnt
		       ,1
		      );
		 localOcrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ocrCnt;
    }

   protected int checkOcrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOcrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOcrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOcrCnt
			                 ,OCR_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ocrCnt", beginOcrCnt,OCR_CNT_LEN);
    }
   	}
     int localThisPgmDb2CollIdBase300Counter = -1;
     public boolean isThisPgmDb2CollIdBase300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThisPgmDb2CollIdBase300Counter != sharedCounter;
         localThisPgmDb2CollIdBase300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkThisPgmDb2CollIdBase300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localDb2ErrModule300Counter = -1;
     public boolean isDb2ErrModule300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ErrModule300Counter != sharedCounter;
         localDb2ErrModule300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDb2ErrModule300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localOutputCntMsg600Counter = -1;
     public boolean isOutputCntMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputCntMsg600Counter != sharedCounter;
         localOutputCntMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputCntMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 43 ,false, false);
   }
     int localWsSqlcodeDisp800Counter = -1;
     public boolean isWsSqlcodeDisp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsSqlcodeDisp800Counter != sharedCounter;
         localWsSqlcodeDisp800Counter = sharedCounter; return hasModified;
     }
	protected static final int WS_SQLCODE_DISP_800_LEN = 4;
	/**
	 * 	serialize this WsSqlcodeDisp800
	 */
   protected void serializeWsSqlcodeDisp800(char[] wsSqlcodeDisp800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsSqlcodeDisp800,0,getStringValue(),beginWsSqlcodeDisp800,WS_SQLCODE_DISP_800_LEN);
       localWsSqlcodeDisp800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsSqlcodeDisp800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshWsSqlcodeDisp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsSqlcodeDisp800() {	 
   		return (substring(getStringValue(),beginWsSqlcodeDisp800,beginWsSqlcodeDisp800 + WS_SQLCODE_DISP_800_LEN));
   	}
     int localWsCurrParagraph800Counter = -1;
     public boolean isWsCurrParagraph800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsCurrParagraph800Counter != sharedCounter;
         localWsCurrParagraph800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWsCurrParagraph800Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localWsSqlFunction800Counter = -1;
     public boolean isWsSqlFunction800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsSqlFunction800Counter != sharedCounter;
         localWsSqlFunction800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWsSqlFunction800Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localWsCurrTable800Counter = -1;
     public boolean isWsCurrTable800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsCurrTable800Counter != sharedCounter;
         localWsCurrTable800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWsCurrTable800Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }




}
  
