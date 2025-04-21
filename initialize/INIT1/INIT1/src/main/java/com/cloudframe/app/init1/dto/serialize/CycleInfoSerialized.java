package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CycleInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CycleInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CycleInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CYCLE_INFO_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginJobIterNo;
            protected  int beginBlTypCd;
            protected  int beginCycNo;
            protected  int beginCycAsofDt;
            protected  int beginCycStartDt;
            protected  int beginCycEndDt;
            protected  int beginCycStartDtIso;
            protected  int beginCycEndDtIso;
            protected  int beginCycMthYr;
            protected  int beginBlStreamCd;
            protected  int beginVisionInstanceCd;
            protected  int beginChgBlEndIso;
            protected  int beginChgDtIso;
            protected  int beginChgStartDtIso;
            protected  int beginChgStartDtIso2;
            protected  int beginChgStartDtIso3;
            protected  int beginChgEndDtIso;
            protected  int beginChgEndDtIso2;
            protected  int beginChgEndDtIso3;
            protected  int beginCycChangeNo;
            protected  int beginCycChangeBp;
            protected  int beginLeapYear;
            protected  int beginLeapYearRemainder;
	
	/**
	* Constructor for CycleInfoSerialized
	**/
    public CycleInfoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CycleInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CYCLE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginJobIterNo = getStartOffset() + 0;	// set offset for serialization
  
             beginBlTypCd = getStartOffset() + 2;	// set offset for serialization
  
             beginCycNo = getStartOffset() + 4;	// set offset for serialization
  
             beginCycAsofDt = getStartOffset() + 6;	// set offset for serialization
  
             beginCycStartDt = getStartOffset() + 16;	// set offset for serialization
  
             beginCycEndDt = getStartOffset() + 26;	// set offset for serialization
  
             beginCycStartDtIso = getStartOffset() + 36;	// set offset for serialization
  
             beginCycEndDtIso = getStartOffset() + 44;	// set offset for serialization
  
             beginCycMthYr = getStartOffset() + 52;	// set offset for serialization
  
             beginBlStreamCd = getStartOffset() + 58;	// set offset for serialization
  
             beginVisionInstanceCd = getStartOffset() + 59;	// set offset for serialization
  
             beginChgBlEndIso = getStartOffset() + 60;	// set offset for serialization
  
  
             beginChgDtIso = getStartOffset() + 68;	// set offset for serialization
  
  
             beginChgStartDtIso = getStartOffset() + 76;	// set offset for serialization
  
  
             beginChgStartDtIso2 = getStartOffset() + 84;	// set offset for serialization
  
  
             beginChgStartDtIso3 = getStartOffset() + 92;	// set offset for serialization
  
  
             beginChgEndDtIso = getStartOffset() + 100;	// set offset for serialization
  
  
             beginChgEndDtIso2 = getStartOffset() + 108;	// set offset for serialization
  
  
             beginChgEndDtIso3 = getStartOffset() + 116;	// set offset for serialization
  
  
             beginCycChangeNo = getStartOffset() + 124;	// set offset for serialization
  
             beginCycChangeBp = getStartOffset() + 126;	// set offset for serialization
  
             beginLeapYear = getStartOffset() + 127;	// set offset for serialization
  
             beginLeapYearRemainder = getStartOffset() + 131;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localJobIterNoCounter = -1;
     public boolean isJobIterNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobIterNoCounter != sharedCounter;
         localJobIterNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of jobIterNo
	 *	@return jobIterNo
	 */
	public char[]  getJobIterNoString() {
	     return getCharArray(beginJobIterNo,JOB_ITER_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean jobIterNoIsNumeric() {
	    return isNumeric(beginJobIterNo
	                    ,beginJobIterNo + JOB_ITER_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JOB_ITER_NO_LEN = 2;
  	/**
	 * serializeJobIterNo
	 */
	protected void serializeJobIterNo(int jobIterNo) {
		 putNumber(beginJobIterNo,jobIterNo,JOB_ITER_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJobIterNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJobIterNo
	 */
   	protected  int serializeJobIterNo(char[] value) {
	    int  jobIterNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    jobIterNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginJobIterNo
		       ,2
		      );
		 localJobIterNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  jobIterNo;
    }

   protected int checkJobIterNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJobIterNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshJobIterNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginJobIterNo
			                 ,JOB_ITER_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("jobIterNo", beginJobIterNo,JOB_ITER_NO_LEN);
    }
   	}
     int localBlTypCdCounter = -1;
     public boolean isBlTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBlTypCdCounter != sharedCounter;
         localBlTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BL_TYP_CD_LEN = 2;
	/**
	 * 	serialize this BlTypCd
	 */
   protected void serializeBlTypCd(char[] blTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(blTypCd,0,getStringValue(),beginBlTypCd,BL_TYP_CD_LEN);
       localBlTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBlTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBlTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBlTypCd() {	 
   		return (substring(getStringValue(),beginBlTypCd,beginBlTypCd + BL_TYP_CD_LEN));
   	}
     int localCycNoCounter = -1;
     public boolean isCycNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycNoCounter != sharedCounter;
         localCycNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cycNo
	 *	@return cycNo
	 */
	public char[]  getCycNoString() {
	     return getCharArray(beginCycNo,CYC_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cycNoIsNumeric() {
	    return isNumeric(beginCycNo
	                    ,beginCycNo + CYC_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYC_NO_LEN = 2;
  	/**
	 * serializeCycNo
	 */
	protected void serializeCycNo(int cycNo) {
		 putNumber(beginCycNo,cycNo,CYC_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCycNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCycNo
	 */
   	protected  int serializeCycNo(char[] value) {
	    int  cycNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cycNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCycNo
		       ,2
		      );
		 localCycNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  cycNo;
    }

   protected int checkCycNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCycNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCycNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCycNo
			                 ,CYC_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cycNo", beginCycNo,CYC_NO_LEN);
    }
   	}
     int localCycAsofDtCounter = -1;
     public boolean isCycAsofDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycAsofDtCounter != sharedCounter;
         localCycAsofDtCounter = sharedCounter; return hasModified;
     }
	protected static final int CYC_ASOF_DT_LEN = 10;
	/**
	 * 	serialize this CycAsofDt
	 */
   protected void serializeCycAsofDt(char[] cycAsofDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cycAsofDt,0,getStringValue(),beginCycAsofDt,CYC_ASOF_DT_LEN);
       localCycAsofDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCycAsofDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCycAsofDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCycAsofDt() {	 
   		return (substring(getStringValue(),beginCycAsofDt,beginCycAsofDt + CYC_ASOF_DT_LEN));
   	}
     int localCycStartDtCounter = -1;
     public boolean isCycStartDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycStartDtCounter != sharedCounter;
         localCycStartDtCounter = sharedCounter; return hasModified;
     }
	protected static final int CYC_START_DT_LEN = 10;
	/**
	 * 	serialize this CycStartDt
	 */
   protected void serializeCycStartDt(char[] cycStartDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cycStartDt,0,getStringValue(),beginCycStartDt,CYC_START_DT_LEN);
       localCycStartDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCycStartDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCycStartDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCycStartDt() {	 
   		return (substring(getStringValue(),beginCycStartDt,beginCycStartDt + CYC_START_DT_LEN));
   	}
     int localCycEndDtCounter = -1;
     public boolean isCycEndDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycEndDtCounter != sharedCounter;
         localCycEndDtCounter = sharedCounter; return hasModified;
     }
	protected static final int CYC_END_DT_LEN = 10;
	/**
	 * 	serialize this CycEndDt
	 */
   protected void serializeCycEndDt(char[] cycEndDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cycEndDt,0,getStringValue(),beginCycEndDt,CYC_END_DT_LEN);
       localCycEndDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCycEndDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCycEndDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCycEndDt() {	 
   		return (substring(getStringValue(),beginCycEndDt,beginCycEndDt + CYC_END_DT_LEN));
   	}
     int localCycStartDtIsoCounter = -1;
     public boolean isCycStartDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycStartDtIsoCounter != sharedCounter;
         localCycStartDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cycStartDtIso
	 *	@return cycStartDtIso
	 */
	public char[]  getCycStartDtIsoString() {
	     return getCharArray(beginCycStartDtIso,CYC_START_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cycStartDtIsoIsNumeric() {
	    return isNumeric(beginCycStartDtIso
	                    ,beginCycStartDtIso + CYC_START_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYC_START_DT_ISO_LEN = 8;
  	/**
	 * serializeCycStartDtIso
	 */
	protected void serializeCycStartDtIso(long cycStartDtIso) {
		 putNumber(beginCycStartDtIso,cycStartDtIso,CYC_START_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCycStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCycStartDtIso
	 */
   	protected  long serializeCycStartDtIso(char[] value) {
	    long  cycStartDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cycStartDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCycStartDtIso
		       ,8
		      );
		 localCycStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  cycStartDtIso;
    }

   protected long checkCycStartDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCycStartDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCycStartDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCycStartDtIso
			                 ,CYC_START_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cycStartDtIso", beginCycStartDtIso,CYC_START_DT_ISO_LEN);
    }
   	}
     int localCycEndDtIsoCounter = -1;
     public boolean isCycEndDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycEndDtIsoCounter != sharedCounter;
         localCycEndDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cycEndDtIso
	 *	@return cycEndDtIso
	 */
	public char[]  getCycEndDtIsoString() {
	     return getCharArray(beginCycEndDtIso,CYC_END_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cycEndDtIsoIsNumeric() {
	    return isNumeric(beginCycEndDtIso
	                    ,beginCycEndDtIso + CYC_END_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYC_END_DT_ISO_LEN = 8;
  	/**
	 * serializeCycEndDtIso
	 */
	protected void serializeCycEndDtIso(long cycEndDtIso) {
		 putNumber(beginCycEndDtIso,cycEndDtIso,CYC_END_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCycEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCycEndDtIso
	 */
   	protected  long serializeCycEndDtIso(char[] value) {
	    long  cycEndDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cycEndDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCycEndDtIso
		       ,8
		      );
		 localCycEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  cycEndDtIso;
    }

   protected long checkCycEndDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCycEndDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCycEndDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCycEndDtIso
			                 ,CYC_END_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cycEndDtIso", beginCycEndDtIso,CYC_END_DT_ISO_LEN);
    }
   	}
     int localCycMthYrCounter = -1;
     public boolean isCycMthYrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycMthYrCounter != sharedCounter;
         localCycMthYrCounter = sharedCounter; return hasModified;
     }
	protected static final int CYC_MTH_YR_LEN = 6;
	/**
	 * 	serialize this CycMthYr
	 */
   protected void serializeCycMthYr(char[] cycMthYr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cycMthYr,0,getStringValue(),beginCycMthYr,CYC_MTH_YR_LEN);
       localCycMthYrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCycMthYrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCycMthYr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCycMthYr() {	 
   		return (substring(getStringValue(),beginCycMthYr,beginCycMthYr + CYC_MTH_YR_LEN));
   	}
     int localBlStreamCdCounter = -1;
     public boolean isBlStreamCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBlStreamCdCounter != sharedCounter;
         localBlStreamCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BL_STREAM_CD_LEN = 1;
	/**
	 * 	serialize this BlStreamCd
	 */
   protected void serializeBlStreamCd(char[] blStreamCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(blStreamCd,0,getStringValue(),beginBlStreamCd,BL_STREAM_CD_LEN);
       localBlStreamCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBlStreamCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBlStreamCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBlStreamCd() {	 
   		return (substring(getStringValue(),beginBlStreamCd,beginBlStreamCd + BL_STREAM_CD_LEN));
   	}
     int localVisionInstanceCdCounter = -1;
     public boolean isVisionInstanceCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVisionInstanceCdCounter != sharedCounter;
         localVisionInstanceCdCounter = sharedCounter; return hasModified;
     }
	protected static final int VISION_INSTANCE_CD_LEN = 1;
	/**
	 * 	serialize this VisionInstanceCd
	 */
   protected void serializeVisionInstanceCd(char[] visionInstanceCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(visionInstanceCd,0,getStringValue(),beginVisionInstanceCd,VISION_INSTANCE_CD_LEN);
       localVisionInstanceCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVisionInstanceCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshVisionInstanceCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVisionInstanceCd() {	 
   		return (substring(getStringValue(),beginVisionInstanceCd,beginVisionInstanceCd + VISION_INSTANCE_CD_LEN));
   	}
     int localChgBlEndIsoCounter = -1;
     public boolean isChgBlEndIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgBlEndIsoCounter != sharedCounter;
         localChgBlEndIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgBlEndIso
	 *	@return chgBlEndIso
	 */
	public char[]  getChgBlEndIsoString() {
	     return getCharArray(beginChgBlEndIso,CHG_BL_END_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgBlEndIsoIsNumeric() {
	    return isNumeric(beginChgBlEndIso
	                    ,beginChgBlEndIso + CHG_BL_END_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_BL_END_ISO_LEN = 8;
  	/**
	 * serializeChgBlEndIso
	 */
	protected void serializeChgBlEndIso(long chgBlEndIso) {
		 putNumber(beginChgBlEndIso,chgBlEndIso,CHG_BL_END_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgBlEndIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgBlEndIso
	 */
   	protected  long serializeChgBlEndIso(char[] value) {
	    long  chgBlEndIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgBlEndIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgBlEndIso
		       ,8
		      );
		 localChgBlEndIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgBlEndIso;
    }

   protected long checkChgBlEndIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgBlEndIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgBlEndIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgBlEndIso
			                 ,CHG_BL_END_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgBlEndIso", beginChgBlEndIso,CHG_BL_END_ISO_LEN);
    }
   	}
     int localChgDtIsoCounter = -1;
     public boolean isChgDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgDtIsoCounter != sharedCounter;
         localChgDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgDtIso
	 *	@return chgDtIso
	 */
	public char[]  getChgDtIsoString() {
	     return getCharArray(beginChgDtIso,CHG_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgDtIsoIsNumeric() {
	    return isNumeric(beginChgDtIso
	                    ,beginChgDtIso + CHG_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_DT_ISO_LEN = 8;
  	/**
	 * serializeChgDtIso
	 */
	protected void serializeChgDtIso(long chgDtIso) {
		 putNumber(beginChgDtIso,chgDtIso,CHG_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgDtIso
	 */
   	protected  long serializeChgDtIso(char[] value) {
	    long  chgDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgDtIso
		       ,8
		      );
		 localChgDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgDtIso;
    }

   protected long checkChgDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgDtIso
			                 ,CHG_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgDtIso", beginChgDtIso,CHG_DT_ISO_LEN);
    }
   	}
     int localChgStartDtIsoCounter = -1;
     public boolean isChgStartDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartDtIsoCounter != sharedCounter;
         localChgStartDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartDtIso
	 *	@return chgStartDtIso
	 */
	public char[]  getChgStartDtIsoString() {
	     return getCharArray(beginChgStartDtIso,CHG_START_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartDtIsoIsNumeric() {
	    return isNumeric(beginChgStartDtIso
	                    ,beginChgStartDtIso + CHG_START_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_DT_ISO_LEN = 8;
  	/**
	 * serializeChgStartDtIso
	 */
	protected void serializeChgStartDtIso(long chgStartDtIso) {
		 putNumber(beginChgStartDtIso,chgStartDtIso,CHG_START_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartDtIso
	 */
   	protected  long serializeChgStartDtIso(char[] value) {
	    long  chgStartDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgStartDtIso
		       ,8
		      );
		 localChgStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartDtIso;
    }

   protected long checkChgStartDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgStartDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgStartDtIso
			                 ,CHG_START_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartDtIso", beginChgStartDtIso,CHG_START_DT_ISO_LEN);
    }
   	}
     int localChgStartDtIso2Counter = -1;
     public boolean isChgStartDtIso2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartDtIso2Counter != sharedCounter;
         localChgStartDtIso2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartDtIso2
	 *	@return chgStartDtIso2
	 */
	public char[]  getChgStartDtIso2String() {
	     return getCharArray(beginChgStartDtIso2,CHG_START_DT_ISO_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartDtIso2IsNumeric() {
	    return isNumeric(beginChgStartDtIso2
	                    ,beginChgStartDtIso2 + CHG_START_DT_ISO_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_DT_ISO_2_LEN = 8;
  	/**
	 * serializeChgStartDtIso2
	 */
	protected void serializeChgStartDtIso2(long chgStartDtIso2) {
		 putNumber(beginChgStartDtIso2,chgStartDtIso2,CHG_START_DT_ISO_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartDtIso2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartDtIso2
	 */
   	protected  long serializeChgStartDtIso2(char[] value) {
	    long  chgStartDtIso2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartDtIso2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgStartDtIso2
		       ,8
		      );
		 localChgStartDtIso2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartDtIso2;
    }

   protected long checkChgStartDtIso2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartDtIso2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgStartDtIso2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgStartDtIso2
			                 ,CHG_START_DT_ISO_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartDtIso2", beginChgStartDtIso2,CHG_START_DT_ISO_2_LEN);
    }
   	}
     int localChgStartDtIso3Counter = -1;
     public boolean isChgStartDtIso3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgStartDtIso3Counter != sharedCounter;
         localChgStartDtIso3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgStartDtIso3
	 *	@return chgStartDtIso3
	 */
	public char[]  getChgStartDtIso3String() {
	     return getCharArray(beginChgStartDtIso3,CHG_START_DT_ISO_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgStartDtIso3IsNumeric() {
	    return isNumeric(beginChgStartDtIso3
	                    ,beginChgStartDtIso3 + CHG_START_DT_ISO_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_START_DT_ISO_3_LEN = 8;
  	/**
	 * serializeChgStartDtIso3
	 */
	protected void serializeChgStartDtIso3(long chgStartDtIso3) {
		 putNumber(beginChgStartDtIso3,chgStartDtIso3,CHG_START_DT_ISO_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgStartDtIso3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgStartDtIso3
	 */
   	protected  long serializeChgStartDtIso3(char[] value) {
	    long  chgStartDtIso3;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgStartDtIso3 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgStartDtIso3
		       ,8
		      );
		 localChgStartDtIso3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgStartDtIso3;
    }

   protected long checkChgStartDtIso3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgStartDtIso3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgStartDtIso3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgStartDtIso3
			                 ,CHG_START_DT_ISO_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgStartDtIso3", beginChgStartDtIso3,CHG_START_DT_ISO_3_LEN);
    }
   	}
     int localChgEndDtIsoCounter = -1;
     public boolean isChgEndDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndDtIsoCounter != sharedCounter;
         localChgEndDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndDtIso
	 *	@return chgEndDtIso
	 */
	public char[]  getChgEndDtIsoString() {
	     return getCharArray(beginChgEndDtIso,CHG_END_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndDtIsoIsNumeric() {
	    return isNumeric(beginChgEndDtIso
	                    ,beginChgEndDtIso + CHG_END_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_DT_ISO_LEN = 8;
  	/**
	 * serializeChgEndDtIso
	 */
	protected void serializeChgEndDtIso(long chgEndDtIso) {
		 putNumber(beginChgEndDtIso,chgEndDtIso,CHG_END_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndDtIso
	 */
   	protected  long serializeChgEndDtIso(char[] value) {
	    long  chgEndDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgEndDtIso
		       ,8
		      );
		 localChgEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndDtIso;
    }

   protected long checkChgEndDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgEndDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgEndDtIso
			                 ,CHG_END_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndDtIso", beginChgEndDtIso,CHG_END_DT_ISO_LEN);
    }
   	}
     int localChgEndDtIso2Counter = -1;
     public boolean isChgEndDtIso2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndDtIso2Counter != sharedCounter;
         localChgEndDtIso2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndDtIso2
	 *	@return chgEndDtIso2
	 */
	public char[]  getChgEndDtIso2String() {
	     return getCharArray(beginChgEndDtIso2,CHG_END_DT_ISO_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndDtIso2IsNumeric() {
	    return isNumeric(beginChgEndDtIso2
	                    ,beginChgEndDtIso2 + CHG_END_DT_ISO_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_DT_ISO_2_LEN = 8;
  	/**
	 * serializeChgEndDtIso2
	 */
	protected void serializeChgEndDtIso2(long chgEndDtIso2) {
		 putNumber(beginChgEndDtIso2,chgEndDtIso2,CHG_END_DT_ISO_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndDtIso2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndDtIso2
	 */
   	protected  long serializeChgEndDtIso2(char[] value) {
	    long  chgEndDtIso2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndDtIso2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgEndDtIso2
		       ,8
		      );
		 localChgEndDtIso2Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndDtIso2;
    }

   protected long checkChgEndDtIso2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndDtIso2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgEndDtIso2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgEndDtIso2
			                 ,CHG_END_DT_ISO_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndDtIso2", beginChgEndDtIso2,CHG_END_DT_ISO_2_LEN);
    }
   	}
     int localChgEndDtIso3Counter = -1;
     public boolean isChgEndDtIso3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChgEndDtIso3Counter != sharedCounter;
         localChgEndDtIso3Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chgEndDtIso3
	 *	@return chgEndDtIso3
	 */
	public char[]  getChgEndDtIso3String() {
	     return getCharArray(beginChgEndDtIso3,CHG_END_DT_ISO_3_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chgEndDtIso3IsNumeric() {
	    return isNumeric(beginChgEndDtIso3
	                    ,beginChgEndDtIso3 + CHG_END_DT_ISO_3_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHG_END_DT_ISO_3_LEN = 8;
  	/**
	 * serializeChgEndDtIso3
	 */
	protected void serializeChgEndDtIso3(long chgEndDtIso3) {
		 putNumber(beginChgEndDtIso3,chgEndDtIso3,CHG_END_DT_ISO_3_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChgEndDtIso3Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChgEndDtIso3
	 */
   	protected  long serializeChgEndDtIso3(char[] value) {
	    long  chgEndDtIso3;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chgEndDtIso3 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginChgEndDtIso3
		       ,8
		      );
		 localChgEndDtIso3Counter = shareString.getSerializedField().getModifiedCounter();
		return  chgEndDtIso3;
    }

   protected long checkChgEndDtIso3MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChgEndDtIso3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshChgEndDtIso3() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginChgEndDtIso3
			                 ,CHG_END_DT_ISO_3_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chgEndDtIso3", beginChgEndDtIso3,CHG_END_DT_ISO_3_LEN);
    }
   	}
     int localCycChangeNoCounter = -1;
     public boolean isCycChangeNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycChangeNoCounter != sharedCounter;
         localCycChangeNoCounter = sharedCounter; return hasModified;
     }
	protected static final int CYC_CHANGE_NO_LEN = 2;
	/**
	 * 	serialize this CycChangeNo
	 */
   protected void serializeCycChangeNo(char[] cycChangeNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cycChangeNo,0,getStringValue(),beginCycChangeNo,CYC_CHANGE_NO_LEN);
       localCycChangeNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCycChangeNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCycChangeNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCycChangeNo() {	 
   		return (substring(getStringValue(),beginCycChangeNo,beginCycChangeNo + CYC_CHANGE_NO_LEN));
   	}
     int localCycChangeBpCounter = -1;
     public boolean isCycChangeBpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCycChangeBpCounter != sharedCounter;
         localCycChangeBpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cycChangeBp
	 *	@return cycChangeBp
	 */
	public char[]  getCycChangeBpString() {
	     return getCharArray(beginCycChangeBp,CYC_CHANGE_BP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cycChangeBpIsNumeric() {
	    return isNumeric(beginCycChangeBp
	                    ,beginCycChangeBp + CYC_CHANGE_BP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYC_CHANGE_BP_LEN = 1;
  	/**
	 * serializeCycChangeBp
	 */
	protected void serializeCycChangeBp(int cycChangeBp) {
		 putNumber(beginCycChangeBp,cycChangeBp,CYC_CHANGE_BP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCycChangeBpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCycChangeBp
	 */
   	protected  int serializeCycChangeBp(char[] value) {
	    int  cycChangeBp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cycChangeBp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCycChangeBp
		       ,1
		      );
		 localCycChangeBpCounter = shareString.getSerializedField().getModifiedCounter();
		return  cycChangeBp;
    }

   protected int checkCycChangeBpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCycChangeBp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCycChangeBp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCycChangeBp
			                 ,CYC_CHANGE_BP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cycChangeBp", beginCycChangeBp,CYC_CHANGE_BP_LEN);
    }
   	}
     int localLeapYearCounter = -1;
     public boolean isLeapYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLeapYearCounter != sharedCounter;
         localLeapYearCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of leapYear
	 *	@return leapYear
	 */
	public char[]  getLeapYearString() {
	     return getCharArray(beginLeapYear,LEAP_YEAR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean leapYearIsNumeric() {
	    return isNumeric(beginLeapYear
	                    ,beginLeapYear + LEAP_YEAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LEAP_YEAR_LEN = 4;
  	/**
	 * serializeLeapYear
	 */
	protected void serializeLeapYear(int leapYear) {
		 putNumber(beginLeapYear,leapYear,LEAP_YEAR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLeapYearCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLeapYear
	 */
   	protected  int serializeLeapYear(char[] value) {
	    int  leapYear;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    leapYear = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginLeapYear
		       ,4
		      );
		 localLeapYearCounter = shareString.getSerializedField().getModifiedCounter();
		return  leapYear;
    }

   protected int checkLeapYearMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLeapYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLeapYear() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLeapYear
			                 ,LEAP_YEAR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("leapYear", beginLeapYear,LEAP_YEAR_LEN);
    }
   	}
     int localLeapYearRemainderCounter = -1;
     public boolean isLeapYearRemainderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLeapYearRemainderCounter != sharedCounter;
         localLeapYearRemainderCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of leapYearRemainder
	 *	@return leapYearRemainder
	 */
	public char[]  getLeapYearRemainderString() {
	     return getCharArray(beginLeapYearRemainder,LEAP_YEAR_REMAINDER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean leapYearRemainderIsNumeric() {
	    return isNumeric(beginLeapYearRemainder
	                    ,beginLeapYearRemainder + LEAP_YEAR_REMAINDER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LEAP_YEAR_REMAINDER_LEN = 1;
  	/**
	 * serializeLeapYearRemainder
	 */
	protected void serializeLeapYearRemainder(int leapYearRemainder) {
		 putNumber(beginLeapYearRemainder,leapYearRemainder,LEAP_YEAR_REMAINDER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLeapYearRemainderCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLeapYearRemainder
	 */
   	protected  int serializeLeapYearRemainder(char[] value) {
	    int  leapYearRemainder;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    leapYearRemainder = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginLeapYearRemainder
		       ,1
		      );
		 localLeapYearRemainderCounter = shareString.getSerializedField().getModifiedCounter();
		return  leapYearRemainder;
    }

   protected int checkLeapYearRemainderMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLeapYearRemainder is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLeapYearRemainder() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLeapYearRemainder
			                 ,LEAP_YEAR_REMAINDER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("leapYearRemainder", beginLeapYearRemainder,LEAP_YEAR_REMAINDER_LEN);
    }
   	}




}
  
