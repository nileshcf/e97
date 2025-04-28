package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 232;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFxDateYyddd800;
            protected  int beginTranCurTmp800;
            protected  int beginTranCurExp800;
            protected  int beginTranAmtTmp800;
            protected  int beginTranCur800;
            protected  int beginTranAmt800;
            protected  int beginTransAmount800;
            protected  int beginAmtE1750800;
            protected  int beginAmtE1754800;
            protected  int beginAmtE1848800;
            protected  int beginAmtE1849800;
            protected  int beginAmtE1850800;
            protected  int beginAmtE1851800;
            protected  int beginAmtE1852800;
            protected  int beginValueOne300;
            protected  int beginSys209Count600;
            protected  int beginSys210Count600;
            protected  int beginSys211Count600;
            protected  int beginSys212Count600;
            protected  int beginSys213Count600;
            protected  int beginSys214Count600;
            protected  int beginSys215Count600;
            protected  int beginSys216Count600;
            protected  int beginSortKeyLength800;
	
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
  
             beginFxDateYyddd800 = getStartOffset() + 0;	// set offset for serialization
  
             beginTranCurTmp800 = getStartOffset() + 5;	// set offset for serialization
  
             beginTranCurExp800 = getStartOffset() + 8;	// set offset for serialization
  
             beginTranAmtTmp800 = getStartOffset() + 9;	// set offset for serialization
  
             beginTranCur800 = getStartOffset() + 21;	// set offset for serialization
  
             beginTranAmt800 = getStartOffset() + 24;	// set offset for serialization
  
             beginTransAmount800 = getStartOffset() + 36;	// set offset for serialization
  
             beginAmtE1750800 = getStartOffset() + 48;	// set offset for serialization
  
             beginAmtE1754800 = getStartOffset() + 60;	// set offset for serialization
  
             beginAmtE1848800 = getStartOffset() + 72;	// set offset for serialization
  
             beginAmtE1849800 = getStartOffset() + 84;	// set offset for serialization
  
             beginAmtE1850800 = getStartOffset() + 96;	// set offset for serialization
  
             beginAmtE1851800 = getStartOffset() + 108;	// set offset for serialization
  
             beginAmtE1852800 = getStartOffset() + 120;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginValueOne300 = getStartOffset() + 132;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginSys209Count600 = getStartOffset() + 133;	// set offset for serialization
  
             beginSys210Count600 = getStartOffset() + 145;	// set offset for serialization
  
             beginSys211Count600 = getStartOffset() + 157;	// set offset for serialization
  
             beginSys212Count600 = getStartOffset() + 169;	// set offset for serialization
  
             beginSys213Count600 = getStartOffset() + 181;	// set offset for serialization
  
             beginSys214Count600 = getStartOffset() + 193;	// set offset for serialization
  
             beginSys215Count600 = getStartOffset() + 205;	// set offset for serialization
  
             beginSys216Count600 = getStartOffset() + 217;	// set offset for serialization
  
  
  
  
  
  
  
  
             beginSortKeyLength800 = getStartOffset() + 229;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localPds165s1800Counter = -1;
     public boolean isPds165s1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPds165s1800Counter != sharedCounter;
         localPds165s1800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPds165s1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localFxDateYyddd800Counter = -1;
     public boolean isFxDateYyddd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFxDateYyddd800Counter != sharedCounter;
         localFxDateYyddd800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fxDateYyddd800
	 *	@return fxDateYyddd800
	 */
	public char[]  getFxDateYyddd800String() {
	     return getCharArray(beginFxDateYyddd800,FX_DATE_YYDDD_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fxDateYyddd800IsNumeric() {
	    return isNumeric(beginFxDateYyddd800
	                    ,beginFxDateYyddd800 + FX_DATE_YYDDD_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FX_DATE_YYDDD_800_LEN = 5;
  	/**
	 * serializeFxDateYyddd800
	 */
	protected void serializeFxDateYyddd800(long fxDateYyddd800) {
		 putNumber(beginFxDateYyddd800,fxDateYyddd800,FX_DATE_YYDDD_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFxDateYyddd800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFxDateYyddd800
	 */
   	protected  long serializeFxDateYyddd800(char[] value) {
	    long  fxDateYyddd800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fxDateYyddd800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginFxDateYyddd800
		       ,5
		      );
		 localFxDateYyddd800Counter = shareString.getSerializedField().getModifiedCounter();
		return  fxDateYyddd800;
    }

   protected long checkFxDateYyddd800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFxDateYyddd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFxDateYyddd800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFxDateYyddd800
			                 ,FX_DATE_YYDDD_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fxDateYyddd800", beginFxDateYyddd800,FX_DATE_YYDDD_800_LEN);
    }
   	}
     int localTranCurTmp800Counter = -1;
     public boolean isTranCurTmp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranCurTmp800Counter != sharedCounter;
         localTranCurTmp800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranCurTmp800
	 *	@return tranCurTmp800
	 */
	public char[]  getTranCurTmp800String() {
	     return getCharArray(beginTranCurTmp800,TRAN_CUR_TMP_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurTmp800IsNumeric() {
	    return isNumeric(beginTranCurTmp800
	                    ,beginTranCurTmp800 + TRAN_CUR_TMP_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_CUR_TMP_800_LEN = 3;
  	/**
	 * serializeTranCurTmp800
	 */
	protected void serializeTranCurTmp800(int tranCurTmp800) {
		 putNumber(beginTranCurTmp800,tranCurTmp800,TRAN_CUR_TMP_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranCurTmp800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranCurTmp800
	 */
   	protected  int serializeTranCurTmp800(char[] value) {
	    int  tranCurTmp800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranCurTmp800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTranCurTmp800
		       ,3
		      );
		 localTranCurTmp800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranCurTmp800;
    }

   protected int checkTranCurTmp800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranCurTmp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranCurTmp800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranCurTmp800
			                 ,TRAN_CUR_TMP_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranCurTmp800", beginTranCurTmp800,TRAN_CUR_TMP_800_LEN);
    }
   	}
     int localTranCurExp800Counter = -1;
     public boolean isTranCurExp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranCurExp800Counter != sharedCounter;
         localTranCurExp800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranCurExp800
	 *	@return tranCurExp800
	 */
	public char[]  getTranCurExp800String() {
	     return getCharArray(beginTranCurExp800,TRAN_CUR_EXP_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCurExp800IsNumeric() {
	    return isNumeric(beginTranCurExp800
	                    ,beginTranCurExp800 + TRAN_CUR_EXP_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_CUR_EXP_800_LEN = 1;
  	/**
	 * serializeTranCurExp800
	 */
	protected void serializeTranCurExp800(int tranCurExp800) {
		 putNumber(beginTranCurExp800,tranCurExp800,TRAN_CUR_EXP_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranCurExp800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranCurExp800
	 */
   	protected  int serializeTranCurExp800(char[] value) {
	    int  tranCurExp800;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranCurExp800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginTranCurExp800
		       ,1
		      );
		 localTranCurExp800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranCurExp800;
    }

   protected int checkTranCurExp800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranCurExp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranCurExp800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranCurExp800
			                 ,TRAN_CUR_EXP_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranCurExp800", beginTranCurExp800,TRAN_CUR_EXP_800_LEN);
    }
   	}
     int localTranAmtTmp800Counter = -1;
     public boolean isTranAmtTmp800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranAmtTmp800Counter != sharedCounter;
         localTranAmtTmp800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranAmtTmp800
	 *	@return tranAmtTmp800
	 */
	public char[]  getTranAmtTmp800String() {
	     return getCharArray(beginTranAmtTmp800,TRAN_AMT_TMP_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmtTmp800IsNumeric() {
	    return isNumeric(beginTranAmtTmp800
	                    ,beginTranAmtTmp800 + TRAN_AMT_TMP_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_AMT_TMP_800_LEN = 12;
  	/**
	 * serializeTranAmtTmp800
	 */
	protected void serializeTranAmtTmp800(long tranAmtTmp800) {
		 putNumber(beginTranAmtTmp800,tranAmtTmp800,TRAN_AMT_TMP_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranAmtTmp800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranAmtTmp800
	 */
   	protected  long serializeTranAmtTmp800(char[] value) {
	    long  tranAmtTmp800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranAmtTmp800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTranAmtTmp800
		       ,12
		      );
		 localTranAmtTmp800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranAmtTmp800;
    }

   protected long checkTranAmtTmp800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranAmtTmp800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTranAmtTmp800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTranAmtTmp800
			                 ,TRAN_AMT_TMP_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranAmtTmp800", beginTranAmtTmp800,TRAN_AMT_TMP_800_LEN);
    }
   	}
     int localTranCur800Counter = -1;
     public boolean isTranCur800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranCur800Counter != sharedCounter;
         localTranCur800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranCur800
	 *	@return tranCur800
	 */
	public char[]  getTranCur800String() {
	     return getCharArray(beginTranCur800,TRAN_CUR_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranCur800IsNumeric() {
	    return isNumeric(beginTranCur800
	                    ,beginTranCur800 + TRAN_CUR_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_CUR_800_LEN = 3;
  	/**
	 * serializeTranCur800
	 */
	protected void serializeTranCur800(int tranCur800) {
		 putNumber(beginTranCur800,tranCur800,TRAN_CUR_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranCur800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranCur800
	 */
   	protected  int serializeTranCur800(char[] value) {
	    int  tranCur800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranCur800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTranCur800
		       ,3
		      );
		 localTranCur800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranCur800;
    }

   protected int checkTranCur800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranCur800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTranCur800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTranCur800
			                 ,TRAN_CUR_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranCur800", beginTranCur800,TRAN_CUR_800_LEN);
    }
   	}
     int localTranAmt800Counter = -1;
     public boolean isTranAmt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranAmt800Counter != sharedCounter;
         localTranAmt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tranAmt800
	 *	@return tranAmt800
	 */
	public char[]  getTranAmt800String() {
	     return getCharArray(beginTranAmt800,TRAN_AMT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranAmt800IsNumeric() {
	    return isNumeric(beginTranAmt800
	                    ,beginTranAmt800 + TRAN_AMT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRAN_AMT_800_LEN = 12;
  	/**
	 * serializeTranAmt800
	 */
	protected void serializeTranAmt800(long tranAmt800) {
		 putNumber(beginTranAmt800,tranAmt800,TRAN_AMT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTranAmt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTranAmt800
	 */
   	protected  long serializeTranAmt800(char[] value) {
	    long  tranAmt800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tranAmt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTranAmt800
		       ,12
		      );
		 localTranAmt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  tranAmt800;
    }

   protected long checkTranAmt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTranAmt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTranAmt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTranAmt800
			                 ,TRAN_AMT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tranAmt800", beginTranAmt800,TRAN_AMT_800_LEN);
    }
   	}
     int localTransAmount800Counter = -1;
     public boolean isTransAmount800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransAmount800Counter != sharedCounter;
         localTransAmount800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of transAmount800
	 *	@return transAmount800
	 */
	public char[]  getTransAmount800String() {
	     return getCharArray(beginTransAmount800,TRANS_AMOUNT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean transAmount800IsNumeric() {
	    return isNumeric(beginTransAmount800
	                    ,beginTransAmount800 + TRANS_AMOUNT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRANS_AMOUNT_800_LEN = 12;
  	/**
	 * serializeTransAmount800
	 */
	protected void serializeTransAmount800(long transAmount800) {
		 putNumber(beginTransAmount800,transAmount800,TRANS_AMOUNT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTransAmount800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTransAmount800
	 */
   	protected  long serializeTransAmount800(char[] value) {
	    long  transAmount800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    transAmount800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginTransAmount800
		       ,12
		      );
		 localTransAmount800Counter = shareString.getSerializedField().getModifiedCounter();
		return  transAmount800;
    }

   protected long checkTransAmount800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTransAmount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTransAmount800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTransAmount800
			                 ,TRANS_AMOUNT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("transAmount800", beginTransAmount800,TRANS_AMOUNT_800_LEN);
    }
   	}
     int localAmtE1750800Counter = -1;
     public boolean isAmtE1750800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1750800Counter != sharedCounter;
         localAmtE1750800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1750800
	 *	@return amtE1750800
	 */
	public char[]  getAmtE1750800String() {
	     return getCharArray(beginAmtE1750800,AMT_E_1750800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1750800IsNumeric() {
	    return isNumeric(beginAmtE1750800
	                    ,beginAmtE1750800 + AMT_E_1750800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1750800_LEN = 12;
  	/**
	 * serializeAmtE1750800
	 */
	protected void serializeAmtE1750800(long amtE1750800) {
		 putNumber(beginAmtE1750800,amtE1750800,AMT_E_1750800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1750800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1750800
	 */
   	protected  long serializeAmtE1750800(char[] value) {
	    long  amtE1750800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1750800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1750800
		       ,12
		      );
		 localAmtE1750800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1750800;
    }

   protected long checkAmtE1750800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1750800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1750800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1750800
			                 ,AMT_E_1750800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1750800", beginAmtE1750800,AMT_E_1750800_LEN);
    }
   	}
     int localAmtE1754800Counter = -1;
     public boolean isAmtE1754800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1754800Counter != sharedCounter;
         localAmtE1754800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1754800
	 *	@return amtE1754800
	 */
	public char[]  getAmtE1754800String() {
	     return getCharArray(beginAmtE1754800,AMT_E_1754800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754800IsNumeric() {
	    return isNumeric(beginAmtE1754800
	                    ,beginAmtE1754800 + AMT_E_1754800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1754800_LEN = 12;
  	/**
	 * serializeAmtE1754800
	 */
	protected void serializeAmtE1754800(long amtE1754800) {
		 putNumber(beginAmtE1754800,amtE1754800,AMT_E_1754800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1754800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1754800
	 */
   	protected  long serializeAmtE1754800(char[] value) {
	    long  amtE1754800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1754800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1754800
		       ,12
		      );
		 localAmtE1754800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1754800;
    }

   protected long checkAmtE1754800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1754800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1754800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1754800
			                 ,AMT_E_1754800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1754800", beginAmtE1754800,AMT_E_1754800_LEN);
    }
   	}
     int localAmtE1848800Counter = -1;
     public boolean isAmtE1848800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1848800Counter != sharedCounter;
         localAmtE1848800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1848800
	 *	@return amtE1848800
	 */
	public char[]  getAmtE1848800String() {
	     return getCharArray(beginAmtE1848800,AMT_E_1848800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1848800IsNumeric() {
	    return isNumeric(beginAmtE1848800
	                    ,beginAmtE1848800 + AMT_E_1848800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1848800_LEN = 12;
  	/**
	 * serializeAmtE1848800
	 */
	protected void serializeAmtE1848800(long amtE1848800) {
		 putNumber(beginAmtE1848800,amtE1848800,AMT_E_1848800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1848800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1848800
	 */
   	protected  long serializeAmtE1848800(char[] value) {
	    long  amtE1848800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1848800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1848800
		       ,12
		      );
		 localAmtE1848800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1848800;
    }

   protected long checkAmtE1848800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1848800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1848800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1848800
			                 ,AMT_E_1848800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1848800", beginAmtE1848800,AMT_E_1848800_LEN);
    }
   	}
     int localAmtE1849800Counter = -1;
     public boolean isAmtE1849800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1849800Counter != sharedCounter;
         localAmtE1849800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1849800
	 *	@return amtE1849800
	 */
	public char[]  getAmtE1849800String() {
	     return getCharArray(beginAmtE1849800,AMT_E_1849800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1849800IsNumeric() {
	    return isNumeric(beginAmtE1849800
	                    ,beginAmtE1849800 + AMT_E_1849800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1849800_LEN = 12;
  	/**
	 * serializeAmtE1849800
	 */
	protected void serializeAmtE1849800(long amtE1849800) {
		 putNumber(beginAmtE1849800,amtE1849800,AMT_E_1849800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1849800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1849800
	 */
   	protected  long serializeAmtE1849800(char[] value) {
	    long  amtE1849800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1849800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1849800
		       ,12
		      );
		 localAmtE1849800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1849800;
    }

   protected long checkAmtE1849800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1849800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1849800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1849800
			                 ,AMT_E_1849800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1849800", beginAmtE1849800,AMT_E_1849800_LEN);
    }
   	}
     int localAmtE1850800Counter = -1;
     public boolean isAmtE1850800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1850800Counter != sharedCounter;
         localAmtE1850800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1850800
	 *	@return amtE1850800
	 */
	public char[]  getAmtE1850800String() {
	     return getCharArray(beginAmtE1850800,AMT_E_1850800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1850800IsNumeric() {
	    return isNumeric(beginAmtE1850800
	                    ,beginAmtE1850800 + AMT_E_1850800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1850800_LEN = 12;
  	/**
	 * serializeAmtE1850800
	 */
	protected void serializeAmtE1850800(long amtE1850800) {
		 putNumber(beginAmtE1850800,amtE1850800,AMT_E_1850800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1850800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1850800
	 */
   	protected  long serializeAmtE1850800(char[] value) {
	    long  amtE1850800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1850800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1850800
		       ,12
		      );
		 localAmtE1850800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1850800;
    }

   protected long checkAmtE1850800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1850800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1850800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1850800
			                 ,AMT_E_1850800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1850800", beginAmtE1850800,AMT_E_1850800_LEN);
    }
   	}
     int localAmtE1851800Counter = -1;
     public boolean isAmtE1851800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1851800Counter != sharedCounter;
         localAmtE1851800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1851800
	 *	@return amtE1851800
	 */
	public char[]  getAmtE1851800String() {
	     return getCharArray(beginAmtE1851800,AMT_E_1851800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1851800IsNumeric() {
	    return isNumeric(beginAmtE1851800
	                    ,beginAmtE1851800 + AMT_E_1851800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1851800_LEN = 12;
  	/**
	 * serializeAmtE1851800
	 */
	protected void serializeAmtE1851800(long amtE1851800) {
		 putNumber(beginAmtE1851800,amtE1851800,AMT_E_1851800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1851800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1851800
	 */
   	protected  long serializeAmtE1851800(char[] value) {
	    long  amtE1851800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1851800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1851800
		       ,12
		      );
		 localAmtE1851800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1851800;
    }

   protected long checkAmtE1851800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1851800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1851800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1851800
			                 ,AMT_E_1851800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1851800", beginAmtE1851800,AMT_E_1851800_LEN);
    }
   	}
     int localAmtE1852800Counter = -1;
     public boolean isAmtE1852800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1852800Counter != sharedCounter;
         localAmtE1852800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1852800
	 *	@return amtE1852800
	 */
	public char[]  getAmtE1852800String() {
	     return getCharArray(beginAmtE1852800,AMT_E_1852800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1852800IsNumeric() {
	    return isNumeric(beginAmtE1852800
	                    ,beginAmtE1852800 + AMT_E_1852800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1852800_LEN = 12;
  	/**
	 * serializeAmtE1852800
	 */
	protected void serializeAmtE1852800(long amtE1852800) {
		 putNumber(beginAmtE1852800,amtE1852800,AMT_E_1852800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1852800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1852800
	 */
   	protected  long serializeAmtE1852800(char[] value) {
	    long  amtE1852800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1852800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1852800
		       ,12
		      );
		 localAmtE1852800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1852800;
    }

   protected long checkAmtE1852800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1852800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1852800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1852800
			                 ,AMT_E_1852800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1852800", beginAmtE1852800,AMT_E_1852800_LEN);
    }
   	}
     int localDesc18001750Counter = -1;
     public boolean isDesc18001750Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001750Counter != sharedCounter;
         localDesc18001750Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001750Constraints(char[] value) {
   			return super.checkConstraints(value , 93 ,false, false);
   }
     int localDesc28001750Counter = -1;
     public boolean isDesc28001750Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc28001750Counter != sharedCounter;
         localDesc28001750Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc28001750Constraints(char[] value) {
   			return super.checkConstraints(value , 91 ,false, false);
   }
     int localDesc18001754Counter = -1;
     public boolean isDesc18001754Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001754Counter != sharedCounter;
         localDesc18001754Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001754Constraints(char[] value) {
   			return super.checkConstraints(value , 99 ,false, false);
   }
     int localDesc28001754Counter = -1;
     public boolean isDesc28001754Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc28001754Counter != sharedCounter;
         localDesc28001754Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc28001754Constraints(char[] value) {
   			return super.checkConstraints(value , 75 ,false, false);
   }
     int localDesc18001848Counter = -1;
     public boolean isDesc18001848Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001848Counter != sharedCounter;
         localDesc18001848Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001848Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localDesc28001848Counter = -1;
     public boolean isDesc28001848Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc28001848Counter != sharedCounter;
         localDesc28001848Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc28001848Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localDesc18001849Counter = -1;
     public boolean isDesc18001849Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001849Counter != sharedCounter;
         localDesc18001849Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001849Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localDesc28001849Counter = -1;
     public boolean isDesc28001849Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc28001849Counter != sharedCounter;
         localDesc28001849Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc28001849Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localDesc18001850Counter = -1;
     public boolean isDesc18001850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001850Counter != sharedCounter;
         localDesc18001850Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001850Constraints(char[] value) {
   			return super.checkConstraints(value , 106 ,false, false);
   }
     int localDesc28001850Counter = -1;
     public boolean isDesc28001850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc28001850Counter != sharedCounter;
         localDesc28001850Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc28001850Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localDesc18001851Counter = -1;
     public boolean isDesc18001851Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001851Counter != sharedCounter;
         localDesc18001851Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001851Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localDesc18001852Counter = -1;
     public boolean isDesc18001852Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDesc18001852Counter != sharedCounter;
         localDesc18001852Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDesc18001852Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localP0165800Counter = -1;
     public boolean isP0165800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localP0165800Counter != sharedCounter;
         localP0165800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkP0165800Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localTxnAmt2800Counter = -1;
     public boolean isTxnAmt2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnAmt2800Counter != sharedCounter;
         localTxnAmt2800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTxnAmt2800Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
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
     int localWrite1800Counter = -1;
     public boolean isWrite1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite1800Counter != sharedCounter;
         localWrite1800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWrite2800Counter = -1;
     public boolean isWrite2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite2800Counter != sharedCounter;
         localWrite2800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWrite3800Counter = -1;
     public boolean isWrite3800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite3800Counter != sharedCounter;
         localWrite3800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite3800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWrite4800Counter = -1;
     public boolean isWrite4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite4800Counter != sharedCounter;
         localWrite4800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite4800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWrite5800Counter = -1;
     public boolean isWrite5800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite5800Counter != sharedCounter;
         localWrite5800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite5800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWrite6800Counter = -1;
     public boolean isWrite6800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite6800Counter != sharedCounter;
         localWrite6800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite6800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWrite7800Counter = -1;
     public boolean isWrite7800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWrite7800Counter != sharedCounter;
         localWrite7800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWrite7800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsSys201Open100Counter = -1;
     public boolean isIsSys201Open100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsSys201Open100Counter != sharedCounter;
         localIsSys201Open100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsSys201Open100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001FileStatus200Counter = -1;
     public boolean isSys001FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001FileStatus200Counter != sharedCounter;
         localSys001FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys012FileStatus200Counter = -1;
     public boolean isSys012FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys012FileStatus200Counter != sharedCounter;
         localSys012FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys012FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus201Counter = -1;
     public boolean isOutputOtbndFileStatus201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus201Counter != sharedCounter;
         localOutputOtbndFileStatus201Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus201Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus202Counter = -1;
     public boolean isOutputOtbndFileStatus202Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus202Counter != sharedCounter;
         localOutputOtbndFileStatus202Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus202Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus203Counter = -1;
     public boolean isOutputOtbndFileStatus203Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus203Counter != sharedCounter;
         localOutputOtbndFileStatus203Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus203Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus204Counter = -1;
     public boolean isOutputOtbndFileStatus204Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus204Counter != sharedCounter;
         localOutputOtbndFileStatus204Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus204Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus205Counter = -1;
     public boolean isOutputOtbndFileStatus205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus205Counter != sharedCounter;
         localOutputOtbndFileStatus205Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus205Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus206Counter = -1;
     public boolean isOutputOtbndFileStatus206Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus206Counter != sharedCounter;
         localOutputOtbndFileStatus206Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus206Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localOutputOtbndFileStatus207Counter = -1;
     public boolean isOutputOtbndFileStatus207Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputOtbndFileStatus207Counter != sharedCounter;
         localOutputOtbndFileStatus207Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputOtbndFileStatus207Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localPgmId300Counter = -1;
     public boolean isPgmId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmId300Counter != sharedCounter;
         localPgmId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmId300Constraints(char[] value) {
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
     int localPgmIp280310300Counter = -1;
     public boolean isPgmIp280310300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp280310300Counter != sharedCounter;
         localPgmIp280310300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp280310300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp343230300Counter = -1;
     public boolean isPgmIp343230300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp343230300Counter != sharedCounter;
         localPgmIp343230300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp343230300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp218480300Counter = -1;
     public boolean isPgmIp218480300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp218480300Counter != sharedCounter;
         localPgmIp218480300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp218480300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp218490300Counter = -1;
     public boolean isPgmIp218490300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp218490300Counter != sharedCounter;
         localPgmIp218490300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp218490300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp218500300Counter = -1;
     public boolean isPgmIp218500300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp218500300Counter != sharedCounter;
         localPgmIp218500300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp218500300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp218510300Counter = -1;
     public boolean isPgmIp218510300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp218510300Counter != sharedCounter;
         localPgmIp218510300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp218510300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp218520300Counter = -1;
     public boolean isPgmIp218520300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp218520300Counter != sharedCounter;
         localPgmIp218520300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp218520300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp217540300Counter = -1;
     public boolean isPgmIp217540300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp217540300Counter != sharedCounter;
         localPgmIp217540300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp217540300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp280010300Counter = -1;
     public boolean isPgmIp280010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp280010300Counter != sharedCounter;
         localPgmIp280010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp280010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp288010300Counter = -1;
     public boolean isPgmIp288010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp288010300Counter != sharedCounter;
         localPgmIp288010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp288010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp752010300Counter = -1;
     public boolean isPgmIp752010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp752010300Counter != sharedCounter;
         localPgmIp752010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp752010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp670010300Counter = -1;
     public boolean isPgmIp670010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp670010300Counter != sharedCounter;
         localPgmIp670010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp670010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp783510300Counter = -1;
     public boolean isPgmIp783510300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp783510300Counter != sharedCounter;
         localPgmIp783510300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp783510300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp281010300Counter = -1;
     public boolean isPgmIp281010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp281010300Counter != sharedCounter;
         localPgmIp281010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp281010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localAbendRoutine300Counter = -1;
     public boolean isAbendRoutine300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendRoutine300Counter != sharedCounter;
         localAbendRoutine300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendRoutine300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localReadParser300Counter = -1;
     public boolean isReadParser300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadParser300Counter != sharedCounter;
         localReadParser300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadParser300Constraints(char[] value) {
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
     int localValueTest300Counter = -1;
     public boolean isValueTest300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueTest300Counter != sharedCounter;
         localValueTest300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueTest300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueX300Counter = -1;
     public boolean isValueX300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueX300Counter != sharedCounter;
         localValueX300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueX300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localValueOne300Counter = -1;
     public boolean isValueOne300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueOne300Counter != sharedCounter;
         localValueOne300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of valueOne300
	 *	@return valueOne300
	 */
	public char[]  getValueOne300String() {
	     return getCharArray(beginValueOne300,VALUE_ONE_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean valueOne300IsNumeric() {
	    return isNumeric(beginValueOne300
	                    ,beginValueOne300 + VALUE_ONE_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_ONE_300_LEN = 1;
  	/**
	 * serializeValueOne300
	 */
	protected void serializeValueOne300(int valueOne300) {
		 putNumber(beginValueOne300,valueOne300,VALUE_ONE_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValueOne300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValueOne300
	 */
   	protected  int serializeValueOne300(char[] value) {
	    int  valueOne300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    valueOne300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValueOne300
		       ,1
		      );
		 localValueOne300Counter = shareString.getSerializedField().getModifiedCounter();
		return  valueOne300;
    }

   protected int checkValueOne300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValueOne300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValueOne300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValueOne300
			                 ,VALUE_ONE_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("valueOne300", beginValueOne300,VALUE_ONE_300_LEN);
    }
   	}
     int localPara1310300Counter = -1;
     public boolean isPara1310300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1310300Counter != sharedCounter;
         localPara1310300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1310300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1320300Counter = -1;
     public boolean isPara1320300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1320300Counter != sharedCounter;
         localPara1320300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1320300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1330300Counter = -1;
     public boolean isPara1330300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1330300Counter != sharedCounter;
         localPara1330300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1330300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1410300Counter = -1;
     public boolean isPara1410300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1410300Counter != sharedCounter;
         localPara1410300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1410300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1420300Counter = -1;
     public boolean isPara1420300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1420300Counter != sharedCounter;
         localPara1420300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1420300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2110300Counter = -1;
     public boolean isPara2110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2110300Counter != sharedCounter;
         localPara2110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2110300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara3100300Counter = -1;
     public boolean isPara3100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3100300Counter != sharedCounter;
         localPara3100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3100300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara3200300Counter = -1;
     public boolean isPara3200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3200300Counter != sharedCounter;
         localPara3200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3200300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8100300Counter = -1;
     public boolean isPara8100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8100300Counter != sharedCounter;
         localPara8100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8100300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localSys001OpenAbendCode300Counter = -1;
     public boolean isSys001OpenAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001OpenAbendCode300Counter != sharedCounter;
         localSys001OpenAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001OpenAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys001ReadAbendCode300Counter = -1;
     public boolean isSys001ReadAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001ReadAbendCode300Counter != sharedCounter;
         localSys001ReadAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001ReadAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys001CloseAbendCode300Counter = -1;
     public boolean isSys001CloseAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001CloseAbendCode300Counter != sharedCounter;
         localSys001CloseAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001CloseAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys012OpenAbendCode300Counter = -1;
     public boolean isSys012OpenAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys012OpenAbendCode300Counter != sharedCounter;
         localSys012OpenAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys012OpenAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys012EmptyAbendCode300Counter = -1;
     public boolean isSys012EmptyAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys012EmptyAbendCode300Counter != sharedCounter;
         localSys012EmptyAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys012EmptyAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys012CloseAbendCode300Counter = -1;
     public boolean isSys012CloseAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys012CloseAbendCode300Counter != sharedCounter;
         localSys012CloseAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys012CloseAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys201OpenAbendCode300Counter = -1;
     public boolean isSys201OpenAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201OpenAbendCode300Counter != sharedCounter;
         localSys201OpenAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201OpenAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSys201CloseAbendCode300Counter = -1;
     public boolean isSys201CloseAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CloseAbendCode300Counter != sharedCounter;
         localSys201CloseAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys201CloseAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localReadParserAbendCode300Counter = -1;
     public boolean isReadParserAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadParserAbendCode300Counter != sharedCounter;
         localReadParserAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadParserAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localIpmOutbndUnscrubRdw400Counter = -1;
         public boolean isIpmOutbndUnscrubRdw400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmOutbndUnscrubRdw400Counter != sharedCounter;
            localIpmOutbndUnscrubRdw400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmOutbndUnscrubRdw400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localIpmCountReadCnt400Counter = -1;
         public boolean isIpmCountReadCnt400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmCountReadCnt400Counter != sharedCounter;
            localIpmCountReadCnt400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmCountReadCnt400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds1400Counter = -1;
         public boolean isIpmRecordsPds1400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds1400Counter != sharedCounter;
            localIpmRecordsPds1400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds1400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds2400Counter = -1;
         public boolean isIpmRecordsPds2400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds2400Counter != sharedCounter;
            localIpmRecordsPds2400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds2400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds3400Counter = -1;
         public boolean isIpmRecordsPds3400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds3400Counter != sharedCounter;
            localIpmRecordsPds3400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds3400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds4400Counter = -1;
         public boolean isIpmRecordsPds4400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds4400Counter != sharedCounter;
            localIpmRecordsPds4400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds4400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds5400Counter = -1;
         public boolean isIpmRecordsPds5400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds5400Counter != sharedCounter;
            localIpmRecordsPds5400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds5400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds6400Counter = -1;
         public boolean isIpmRecordsPds6400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds6400Counter != sharedCounter;
            localIpmRecordsPds6400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds6400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localIpmRecordsPds7400Counter = -1;
         public boolean isIpmRecordsPds7400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIpmRecordsPds7400Counter != sharedCounter;
            localIpmRecordsPds7400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIpmRecordsPds7400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localOutputOutboundExtrCount400Counter = -1;
         public boolean isOutputOutboundExtrCount400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutputOutboundExtrCount400Counter != sharedCounter;
            localOutputOutboundExtrCount400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkOutputOutboundExtrCount400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localOutputOutboundExtrCnt2400Counter = -1;
         public boolean isOutputOutboundExtrCnt2400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutputOutboundExtrCnt2400Counter != sharedCounter;
            localOutputOutboundExtrCnt2400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkOutputOutboundExtrCnt2400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSys209Count600Counter = -1;
     
     public boolean isSys209Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys209Count600Counter != sharedCounter;
         localSys209Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys209Count600
	 *	@return sys209Count600
	 */
	public char[]  getSys209Count600String() {
	    return getCharArray(beginSys209Count600,SYS_209_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys209Count600IsNumeric() {
		    return isNumeric(beginSys209Count600
	                    ,beginSys209Count600 + SYS_209_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_209_COUNT_600_LEN = 12;
  protected  static final int SYS_209_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys209Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys209Count600
	 */
	protected void serializeSys209Count600(BigDecimal sys209Count600) {
	       putNumber(beginSys209Count600,sys209Count600,SYS_209_COUNT_600_LEN,SYS_209_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys209Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys209Count600
	 */
   	protected  BigDecimal serializeSys209Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys209Count600
		       ,12
		      );		 localSys209Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_209_COUNT_600_LEN,SYS_209_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys209Count600", beginSys209Count600,SYS_209_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys209Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys209Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys209Count600
			            ,SYS_209_COUNT_600_LEN
			            ,SYS_209_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys209Count600", beginSys209Count600,SYS_209_COUNT_600_LEN);
    }
   	}
     int localSys210Count600Counter = -1;
     
     public boolean isSys210Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys210Count600Counter != sharedCounter;
         localSys210Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys210Count600
	 *	@return sys210Count600
	 */
	public char[]  getSys210Count600String() {
	    return getCharArray(beginSys210Count600,SYS_210_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys210Count600IsNumeric() {
		    return isNumeric(beginSys210Count600
	                    ,beginSys210Count600 + SYS_210_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_210_COUNT_600_LEN = 12;
  protected  static final int SYS_210_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys210Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys210Count600
	 */
	protected void serializeSys210Count600(BigDecimal sys210Count600) {
	       putNumber(beginSys210Count600,sys210Count600,SYS_210_COUNT_600_LEN,SYS_210_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys210Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys210Count600
	 */
   	protected  BigDecimal serializeSys210Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys210Count600
		       ,12
		      );		 localSys210Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_210_COUNT_600_LEN,SYS_210_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys210Count600", beginSys210Count600,SYS_210_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys210Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys210Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys210Count600
			            ,SYS_210_COUNT_600_LEN
			            ,SYS_210_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys210Count600", beginSys210Count600,SYS_210_COUNT_600_LEN);
    }
   	}
     int localSys211Count600Counter = -1;
     
     public boolean isSys211Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys211Count600Counter != sharedCounter;
         localSys211Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys211Count600
	 *	@return sys211Count600
	 */
	public char[]  getSys211Count600String() {
	    return getCharArray(beginSys211Count600,SYS_211_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys211Count600IsNumeric() {
		    return isNumeric(beginSys211Count600
	                    ,beginSys211Count600 + SYS_211_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_211_COUNT_600_LEN = 12;
  protected  static final int SYS_211_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys211Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys211Count600
	 */
	protected void serializeSys211Count600(BigDecimal sys211Count600) {
	       putNumber(beginSys211Count600,sys211Count600,SYS_211_COUNT_600_LEN,SYS_211_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys211Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys211Count600
	 */
   	protected  BigDecimal serializeSys211Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys211Count600
		       ,12
		      );		 localSys211Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_211_COUNT_600_LEN,SYS_211_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys211Count600", beginSys211Count600,SYS_211_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys211Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys211Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys211Count600
			            ,SYS_211_COUNT_600_LEN
			            ,SYS_211_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys211Count600", beginSys211Count600,SYS_211_COUNT_600_LEN);
    }
   	}
     int localSys212Count600Counter = -1;
     
     public boolean isSys212Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys212Count600Counter != sharedCounter;
         localSys212Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys212Count600
	 *	@return sys212Count600
	 */
	public char[]  getSys212Count600String() {
	    return getCharArray(beginSys212Count600,SYS_212_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys212Count600IsNumeric() {
		    return isNumeric(beginSys212Count600
	                    ,beginSys212Count600 + SYS_212_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_212_COUNT_600_LEN = 12;
  protected  static final int SYS_212_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys212Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys212Count600
	 */
	protected void serializeSys212Count600(BigDecimal sys212Count600) {
	       putNumber(beginSys212Count600,sys212Count600,SYS_212_COUNT_600_LEN,SYS_212_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys212Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys212Count600
	 */
   	protected  BigDecimal serializeSys212Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys212Count600
		       ,12
		      );		 localSys212Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_212_COUNT_600_LEN,SYS_212_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys212Count600", beginSys212Count600,SYS_212_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys212Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys212Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys212Count600
			            ,SYS_212_COUNT_600_LEN
			            ,SYS_212_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys212Count600", beginSys212Count600,SYS_212_COUNT_600_LEN);
    }
   	}
     int localSys213Count600Counter = -1;
     
     public boolean isSys213Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys213Count600Counter != sharedCounter;
         localSys213Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys213Count600
	 *	@return sys213Count600
	 */
	public char[]  getSys213Count600String() {
	    return getCharArray(beginSys213Count600,SYS_213_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys213Count600IsNumeric() {
		    return isNumeric(beginSys213Count600
	                    ,beginSys213Count600 + SYS_213_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_213_COUNT_600_LEN = 12;
  protected  static final int SYS_213_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys213Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys213Count600
	 */
	protected void serializeSys213Count600(BigDecimal sys213Count600) {
	       putNumber(beginSys213Count600,sys213Count600,SYS_213_COUNT_600_LEN,SYS_213_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys213Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys213Count600
	 */
   	protected  BigDecimal serializeSys213Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys213Count600
		       ,12
		      );		 localSys213Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_213_COUNT_600_LEN,SYS_213_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys213Count600", beginSys213Count600,SYS_213_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys213Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys213Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys213Count600
			            ,SYS_213_COUNT_600_LEN
			            ,SYS_213_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys213Count600", beginSys213Count600,SYS_213_COUNT_600_LEN);
    }
   	}
     int localSys214Count600Counter = -1;
     
     public boolean isSys214Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys214Count600Counter != sharedCounter;
         localSys214Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys214Count600
	 *	@return sys214Count600
	 */
	public char[]  getSys214Count600String() {
	    return getCharArray(beginSys214Count600,SYS_214_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys214Count600IsNumeric() {
		    return isNumeric(beginSys214Count600
	                    ,beginSys214Count600 + SYS_214_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_214_COUNT_600_LEN = 12;
  protected  static final int SYS_214_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys214Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys214Count600
	 */
	protected void serializeSys214Count600(BigDecimal sys214Count600) {
	       putNumber(beginSys214Count600,sys214Count600,SYS_214_COUNT_600_LEN,SYS_214_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys214Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys214Count600
	 */
   	protected  BigDecimal serializeSys214Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys214Count600
		       ,12
		      );		 localSys214Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_214_COUNT_600_LEN,SYS_214_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys214Count600", beginSys214Count600,SYS_214_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys214Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys214Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys214Count600
			            ,SYS_214_COUNT_600_LEN
			            ,SYS_214_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys214Count600", beginSys214Count600,SYS_214_COUNT_600_LEN);
    }
   	}
     int localSys215Count600Counter = -1;
     
     public boolean isSys215Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys215Count600Counter != sharedCounter;
         localSys215Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys215Count600
	 *	@return sys215Count600
	 */
	public char[]  getSys215Count600String() {
	    return getCharArray(beginSys215Count600,SYS_215_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys215Count600IsNumeric() {
		    return isNumeric(beginSys215Count600
	                    ,beginSys215Count600 + SYS_215_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_215_COUNT_600_LEN = 12;
  protected  static final int SYS_215_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys215Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys215Count600
	 */
	protected void serializeSys215Count600(BigDecimal sys215Count600) {
	       putNumber(beginSys215Count600,sys215Count600,SYS_215_COUNT_600_LEN,SYS_215_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys215Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys215Count600
	 */
   	protected  BigDecimal serializeSys215Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys215Count600
		       ,12
		      );		 localSys215Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_215_COUNT_600_LEN,SYS_215_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys215Count600", beginSys215Count600,SYS_215_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys215Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys215Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys215Count600
			            ,SYS_215_COUNT_600_LEN
			            ,SYS_215_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys215Count600", beginSys215Count600,SYS_215_COUNT_600_LEN);
    }
   	}
     int localSys216Count600Counter = -1;
     
     public boolean isSys216Count600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys216Count600Counter != sharedCounter;
         localSys216Count600Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sys216Count600
	 *	@return sys216Count600
	 */
	public char[]  getSys216Count600String() {
	    return getCharArray(beginSys216Count600,SYS_216_COUNT_600_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys216Count600IsNumeric() {
		    return isNumeric(beginSys216Count600
	                    ,beginSys216Count600 + SYS_216_COUNT_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SYS_216_COUNT_600_LEN = 12;
  protected  static final int SYS_216_COUNT_600_SCALE = 2;

   protected BigDecimal checkSys216Count600MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeSys216Count600
	 */
	protected void serializeSys216Count600(BigDecimal sys216Count600) {
	       putNumber(beginSys216Count600,sys216Count600,SYS_216_COUNT_600_LEN,SYS_216_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys216Count600Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSys216Count600
	 */
   	protected  BigDecimal serializeSys216Count600(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginSys216Count600
		       ,12
		      );		 localSys216Count600Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SYS_216_COUNT_600_LEN,SYS_216_COUNT_600_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sys216Count600", beginSys216Count600,SYS_216_COUNT_600_LEN);
    	}
    }
    /**
	 *	refreshSys216Count600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSys216Count600() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSys216Count600
			            ,SYS_216_COUNT_600_LEN
			            ,SYS_216_COUNT_600_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sys216Count600", beginSys216Count600,SYS_216_COUNT_600_LEN);
    }
   	}
     int localRegion1600Counter = -1;
     public boolean isRegion1600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegion1600Counter != sharedCounter;
         localRegion1600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRegion1600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localRegionB600Counter = -1;
     public boolean isRegionB600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegionB600Counter != sharedCounter;
         localRegionB600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRegionB600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localRegionC600Counter = -1;
     public boolean isRegionC600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegionC600Counter != sharedCounter;
         localRegionC600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRegionC600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localRegionD600Counter = -1;
     public boolean isRegionD600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegionD600Counter != sharedCounter;
         localRegionD600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRegionD600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localRegionA600Counter = -1;
     public boolean isRegionA600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegionA600Counter != sharedCounter;
         localRegionA600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRegionA600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localRegionE600Counter = -1;
     public boolean isRegionE600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegionE600Counter != sharedCounter;
         localRegionE600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRegionE600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDisplayAbendMsgTxt600Counter = -1;
     public boolean isDisplayAbendMsgTxt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayAbendMsgTxt600Counter != sharedCounter;
         localDisplayAbendMsgTxt600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDisplayAbendMsgTxt600Constraints(char[] value) {
   			return super.checkConstraints(value , 320 ,false, false);
   }
     int localSortKeyLength800Counter = -1;
     public boolean isSortKeyLength800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSortKeyLength800Counter != sharedCounter;
         localSortKeyLength800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sortKeyLength800
	 *	@return sortKeyLength800
	 */
	public char[]  getSortKeyLength800String() {
	     return getCharArray(beginSortKeyLength800,SORT_KEY_LENGTH_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sortKeyLength800IsNumeric() {
	    return isNumeric(beginSortKeyLength800
	                    ,beginSortKeyLength800 + SORT_KEY_LENGTH_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SORT_KEY_LENGTH_800_LEN = 3;
  	/**
	 * serializeSortKeyLength800
	 */
	protected void serializeSortKeyLength800(int sortKeyLength800) {
		 putNumber(beginSortKeyLength800,sortKeyLength800,SORT_KEY_LENGTH_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSortKeyLength800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSortKeyLength800
	 */
   	protected  int serializeSortKeyLength800(char[] value) {
	    int  sortKeyLength800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sortKeyLength800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSortKeyLength800
		       ,3
		      );
		 localSortKeyLength800Counter = shareString.getSerializedField().getModifiedCounter();
		return  sortKeyLength800;
    }

   protected int checkSortKeyLength800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSortKeyLength800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSortKeyLength800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSortKeyLength800
			                 ,SORT_KEY_LENGTH_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sortKeyLength800", beginSortKeyLength800,SORT_KEY_LENGTH_800_LEN);
    }
   	}
     int localAbendPtr800Counter = -1;
     public boolean isAbendPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPtr800Counter != sharedCounter;
         localAbendPtr800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPtr800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp280010800Counter = -1;
     public boolean isPtrIp280010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280010800Counter != sharedCounter;
         localPtrIp280010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp280010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp280310800Counter = -1;
     public boolean isPtrIp280310800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280310800Counter != sharedCounter;
         localPtrIp280310800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp280310800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp662010800Counter = -1;
     public boolean isPtrIp662010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp662010800Counter != sharedCounter;
         localPtrIp662010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp662010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
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
     int localPtrIp343230800Counter = -1;
     public boolean isPtrIp343230800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp343230800Counter != sharedCounter;
         localPtrIp343230800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp343230800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp218480800Counter = -1;
     public boolean isPtrIp218480800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp218480800Counter != sharedCounter;
         localPtrIp218480800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp218480800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp218490800Counter = -1;
     public boolean isPtrIp218490800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp218490800Counter != sharedCounter;
         localPtrIp218490800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp218490800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp218500800Counter = -1;
     public boolean isPtrIp218500800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp218500800Counter != sharedCounter;
         localPtrIp218500800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp218500800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp218510800Counter = -1;
     public boolean isPtrIp218510800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp218510800Counter != sharedCounter;
         localPtrIp218510800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp218510800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp218520800Counter = -1;
     public boolean isPtrIp218520800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp218520800Counter != sharedCounter;
         localPtrIp218520800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp218520800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp217540800Counter = -1;
     public boolean isPtrIp217540800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp217540800Counter != sharedCounter;
         localPtrIp217540800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp217540800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp288010800Counter = -1;
     public boolean isPtrIp288010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp288010800Counter != sharedCounter;
         localPtrIp288010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp288010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp670010800Counter = -1;
     public boolean isPtrIp670010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp670010800Counter != sharedCounter;
         localPtrIp670010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp670010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp752010800Counter = -1;
     public boolean isPtrIp752010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp752010800Counter != sharedCounter;
         localPtrIp752010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp752010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp783510800Counter = -1;
     public boolean isPtrIp783510800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp783510800Counter != sharedCounter;
         localPtrIp783510800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp783510800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp281010800Counter = -1;
     public boolean isPtrIp281010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp281010800Counter != sharedCounter;
         localPtrIp281010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp281010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }




}
  
