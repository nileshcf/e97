package com.cloudframe.app.search3.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSrchval;
            protected  int beginIp66601UserTagType01;
            protected  int beginIp66601UserTagNo01;
            protected  int beginIp66601UserTagOccurrence01;
            protected  int beginIp66601UserTagSubfldNo01;
	
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
  
             beginSrchval = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
             beginIp66601UserTagType01 = getStartOffset() + 2;	// set offset for serialization
  
             beginIp66601UserTagNo01 = getStartOffset() + 6;	// set offset for serialization
  
             beginIp66601UserTagOccurrence01 = getStartOffset() + 10;	// set offset for serialization
  
             beginIp66601UserTagSubfldNo01 = getStartOffset() + 14;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
         int localLastDeTag800Counter = -1;
         public boolean isLastDeTag800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLastDeTag800Counter != sharedCounter;
            localLastDeTag800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkLastDeTag800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSrchvalCounter = -1;
     public boolean isSrchvalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrchvalCounter != sharedCounter;
         localSrchvalCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of srchval
	 *	@return srchval
	 */
	public char[]  getSrchvalString() {
	     return getCharArray(beginSrchval,SRCHVAL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchvalIsNumeric() {
	    return isNumeric(beginSrchval
	                    ,beginSrchval + SRCHVAL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRCHVAL_LEN = 2;
  	/**
	 * serializeSrchval
	 */
	protected void serializeSrchval(int srchval) {
		 putNumber(beginSrchval,srchval,SRCHVAL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrchvalCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrchval
	 */
   	protected  int serializeSrchval(char[] value) {
	    int  srchval;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    srchval = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSrchval
		       ,2
		      );
		 localSrchvalCounter = shareString.getSerializedField().getModifiedCounter();
		return  srchval;
    }

   protected int checkSrchvalMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrchval is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrchval() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSrchval
			                 ,SRCHVAL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("srchval", beginSrchval,SRCHVAL_LEN);
    }
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
         int localStartCounter = -1;
         public boolean isStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStartCounter != sharedCounter;
            localStartCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
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
     int localValueCr300Counter = -1;
     public boolean isValueCr300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueCr300Counter != sharedCounter;
         localValueCr300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueCr300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localValueDr300Counter = -1;
     public boolean isValueDr300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueDr300Counter != sharedCounter;
         localValueDr300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueDr300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localAccAmount801Counter = -1;
         public boolean isAccAmount801Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAccAmount801Counter != sharedCounter;
            localAccAmount801Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAccAmount801MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localAccFinNonFinInd400Counter = -1;
     public boolean isAccFinNonFinInd400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAccFinNonFinInd400Counter != sharedCounter;
         localAccFinNonFinInd400Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAccFinNonFinInd400Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localAccFinNonFinAmt400Counter = -1;
         public boolean isAccFinNonFinAmt400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAccFinNonFinAmt400Counter != sharedCounter;
            localAccFinNonFinAmt400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAccFinNonFinAmt400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localEntryFoundFlgCounter = -1;
     public boolean isEntryFoundFlgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEntryFoundFlgCounter != sharedCounter;
         localEntryFoundFlgCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEntryFoundFlgConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIp66601UserTagType01Counter = -1;
     public boolean isIp66601UserTagType01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601UserTagType01Counter != sharedCounter;
         localIp66601UserTagType01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public char[]  getIp66601UserTagType01String() {
	     return getCharArray(beginIp66601UserTagType01,IP_66601_USER_TAG_TYPE_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagType01IsNumeric() {
	    return isNumeric(beginIp66601UserTagType01
	                    ,beginIp66601UserTagType01 + IP_66601_USER_TAG_TYPE_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_66601_USER_TAG_TYPE_01_LEN = 4;
  	/**
	 * serializeIp66601UserTagType01
	 */
	protected void serializeIp66601UserTagType01(short ip66601UserTagType01) {
		 putNumber(beginIp66601UserTagType01,ip66601UserTagType01,IP_66601_USER_TAG_TYPE_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp66601UserTagType01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp66601UserTagType01
	 */
   	protected  short serializeIp66601UserTagType01(char[] value) {
	    short  ip66601UserTagType01;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip66601UserTagType01 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp66601UserTagType01
		       ,4
		      );
		 localIp66601UserTagType01Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip66601UserTagType01;
    }

   protected short checkIp66601UserTagType01MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp66601UserTagType01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagType01() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp66601UserTagType01
			                 ,IP_66601_USER_TAG_TYPE_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip66601UserTagType01", beginIp66601UserTagType01,IP_66601_USER_TAG_TYPE_01_LEN);
    }
   	}
     int localIp66601UserTagNo01Counter = -1;
     public boolean isIp66601UserTagNo01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601UserTagNo01Counter != sharedCounter;
         localIp66601UserTagNo01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public char[]  getIp66601UserTagNo01String() {
	     return getCharArray(beginIp66601UserTagNo01,IP_66601_USER_TAG_NO_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagNo01IsNumeric() {
	    return isNumeric(beginIp66601UserTagNo01
	                    ,beginIp66601UserTagNo01 + IP_66601_USER_TAG_NO_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_66601_USER_TAG_NO_01_LEN = 4;
  	/**
	 * serializeIp66601UserTagNo01
	 */
	protected void serializeIp66601UserTagNo01(short ip66601UserTagNo01) {
		 putNumber(beginIp66601UserTagNo01,ip66601UserTagNo01,IP_66601_USER_TAG_NO_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp66601UserTagNo01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp66601UserTagNo01
	 */
   	protected  short serializeIp66601UserTagNo01(char[] value) {
	    short  ip66601UserTagNo01;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip66601UserTagNo01 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp66601UserTagNo01
		       ,4
		      );
		 localIp66601UserTagNo01Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip66601UserTagNo01;
    }

   protected short checkIp66601UserTagNo01MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp66601UserTagNo01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagNo01() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp66601UserTagNo01
			                 ,IP_66601_USER_TAG_NO_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip66601UserTagNo01", beginIp66601UserTagNo01,IP_66601_USER_TAG_NO_01_LEN);
    }
   	}
     int localIp66601UserTagOccurrence01Counter = -1;
     public boolean isIp66601UserTagOccurrence01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601UserTagOccurrence01Counter != sharedCounter;
         localIp66601UserTagOccurrence01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public char[]  getIp66601UserTagOccurrence01String() {
	     return getCharArray(beginIp66601UserTagOccurrence01,IP_66601_USER_TAG_OCCURRENCE_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagOccurrence01IsNumeric() {
	    return isNumeric(beginIp66601UserTagOccurrence01
	                    ,beginIp66601UserTagOccurrence01 + IP_66601_USER_TAG_OCCURRENCE_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_66601_USER_TAG_OCCURRENCE_01_LEN = 4;
  	/**
	 * serializeIp66601UserTagOccurrence01
	 */
	protected void serializeIp66601UserTagOccurrence01(short ip66601UserTagOccurrence01) {
		 putNumber(beginIp66601UserTagOccurrence01,ip66601UserTagOccurrence01,IP_66601_USER_TAG_OCCURRENCE_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp66601UserTagOccurrence01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp66601UserTagOccurrence01
	 */
   	protected  short serializeIp66601UserTagOccurrence01(char[] value) {
	    short  ip66601UserTagOccurrence01;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip66601UserTagOccurrence01 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp66601UserTagOccurrence01
		       ,4
		      );
		 localIp66601UserTagOccurrence01Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip66601UserTagOccurrence01;
    }

   protected short checkIp66601UserTagOccurrence01MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp66601UserTagOccurrence01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagOccurrence01() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp66601UserTagOccurrence01
			                 ,IP_66601_USER_TAG_OCCURRENCE_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip66601UserTagOccurrence01", beginIp66601UserTagOccurrence01,IP_66601_USER_TAG_OCCURRENCE_01_LEN);
    }
   	}
     int localIp66601UserTagSubfldNo01Counter = -1;
     public boolean isIp66601UserTagSubfldNo01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601UserTagSubfldNo01Counter != sharedCounter;
         localIp66601UserTagSubfldNo01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public char[]  getIp66601UserTagSubfldNo01String() {
	     return getCharArray(beginIp66601UserTagSubfldNo01,IP_66601_USER_TAG_SUBFLD_NO_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagSubfldNo01IsNumeric() {
	    return isNumeric(beginIp66601UserTagSubfldNo01
	                    ,beginIp66601UserTagSubfldNo01 + IP_66601_USER_TAG_SUBFLD_NO_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_66601_USER_TAG_SUBFLD_NO_01_LEN = 4;
  	/**
	 * serializeIp66601UserTagSubfldNo01
	 */
	protected void serializeIp66601UserTagSubfldNo01(short ip66601UserTagSubfldNo01) {
		 putNumber(beginIp66601UserTagSubfldNo01,ip66601UserTagSubfldNo01,IP_66601_USER_TAG_SUBFLD_NO_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp66601UserTagSubfldNo01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp66601UserTagSubfldNo01
	 */
   	protected  short serializeIp66601UserTagSubfldNo01(char[] value) {
	    short  ip66601UserTagSubfldNo01;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip66601UserTagSubfldNo01 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginIp66601UserTagSubfldNo01
		       ,4
		      );
		 localIp66601UserTagSubfldNo01Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip66601UserTagSubfldNo01;
    }

   protected short checkIp66601UserTagSubfldNo01MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshIp66601UserTagSubfldNo01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp66601UserTagSubfldNo01() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginIp66601UserTagSubfldNo01
			                 ,IP_66601_USER_TAG_SUBFLD_NO_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip66601UserTagSubfldNo01", beginIp66601UserTagSubfldNo01,IP_66601_USER_TAG_SUBFLD_NO_01_LEN);
    }
   	}
         int localIp66601UserTagStart01Counter = -1;
         public boolean isIp66601UserTagStart01Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagStart01Counter != sharedCounter;
            localIp66601UserTagStart01Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp66601UserTagStart01MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localIp66601UserTagLngth01Counter = -1;
         public boolean isIp66601UserTagLngth01Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66601UserTagLngth01Counter != sharedCounter;
            localIp66601UserTagLngth01Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp66601UserTagLngth01MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localIp66601UserTagStatus01Counter = -1;
     public boolean isIp66601UserTagStatus01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66601UserTagStatus01Counter != sharedCounter;
         localIp66601UserTagStatus01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp66601UserTagStatus01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
