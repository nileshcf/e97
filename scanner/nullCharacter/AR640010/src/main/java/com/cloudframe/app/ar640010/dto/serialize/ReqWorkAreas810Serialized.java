package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ReqWorkAreas810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ReqWorkAreas810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReqWorkAreas810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REQ_WORK_AREAS_810_LENGTH = 378;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApplTkn810;
            protected  int beginFunctionTs810;
            protected  int beginBulkId810;
            protected  int beginEndptId810;
            protected  int beginEndptIdOrig810;
            protected  int beginBusPrtnrIdOrig810;
            protected  int beginCyclNum810;
            protected  int beginBusPrtnrId810;
            protected  int beginProcJulDay810;
            protected  int beginComputeDate810;
            protected  int beginStatCd810;
            protected  int beginXferMthdCd810;
            protected  int beginXferTypeCd810;
            protected  int beginSndRcvPrmsnCd810;
            protected  int beginRenameHlq810;
            protected  int beginRenameSystemId810;
            protected  int beginPreExitDsn810;
            protected  int beginRteToHubSw810;
	
	/**
	* Constructor for ReqWorkAreas810Serialized
	**/
    public ReqWorkAreas810Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReqWorkAreas810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REQ_WORK_AREAS_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApplTkn810 = getStartOffset() + 0;	// set offset for serialization
  
             beginFunctionTs810 = getStartOffset() + 128;	// set offset for serialization
  
             beginBulkId810 = getStartOffset() + 154;	// set offset for serialization
  
             beginEndptId810 = getStartOffset() + 158;	// set offset for serialization
  
             beginEndptIdOrig810 = getStartOffset() + 165;	// set offset for serialization
  
             beginBusPrtnrIdOrig810 = getStartOffset() + 172;	// set offset for serialization
  
             beginCyclNum810 = getStartOffset() + 178;	// set offset for serialization
  
  
             beginBusPrtnrId810 = getStartOffset() + 184;	// set offset for serialization
  
  
             beginProcJulDay810 = getStartOffset() + 200;	// set offset for serialization
  
             beginComputeDate810 = getStartOffset() + 203;	// set offset for serialization
  
             beginStatCd810 = getStartOffset() + 211;	// set offset for serialization
  
             beginXferMthdCd810 = getStartOffset() + 212;	// set offset for serialization
  
             beginXferTypeCd810 = getStartOffset() + 213;	// set offset for serialization
  
             beginSndRcvPrmsnCd810 = getStartOffset() + 214;	// set offset for serialization
  
             beginRenameHlq810 = getStartOffset() + 215;	// set offset for serialization
  
             beginRenameSystemId810 = getStartOffset() + 223;	// set offset for serialization
  
             beginPreExitDsn810 = getStartOffset() + 231;	// set offset for serialization
  
  
             beginRteToHubSw810 = getStartOffset() + 377;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localApplTkn810Counter = -1;
     public boolean isApplTkn810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplTkn810Counter != sharedCounter;
         localApplTkn810Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_TKN_810_LEN = 128;
	/**
	 * 	serialize this ApplTkn810
	 */
   protected void serializeApplTkn810(char[] applTkn810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applTkn810,0,getStringValue(),beginApplTkn810,APPL_TKN_810_LEN);
       localApplTkn810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplTkn810Constraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshApplTkn810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplTkn810() {	 
   		return (substring(getStringValue(),beginApplTkn810,beginApplTkn810 + APPL_TKN_810_LEN));
   	}
     int localFunctionTs810Counter = -1;
     public boolean isFunctionTs810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionTs810Counter != sharedCounter;
         localFunctionTs810Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_TS_810_LEN = 26;
	/**
	 * 	serialize this FunctionTs810
	 */
   protected void serializeFunctionTs810(char[] functionTs810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionTs810,0,getStringValue(),beginFunctionTs810,FUNCTION_TS_810_LEN);
       localFunctionTs810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionTs810Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFunctionTs810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionTs810() {	 
   		return (substring(getStringValue(),beginFunctionTs810,beginFunctionTs810 + FUNCTION_TS_810_LEN));
   	}
     int localBulkId810Counter = -1;
     public boolean isBulkId810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBulkId810Counter != sharedCounter;
         localBulkId810Counter = sharedCounter; return hasModified;
     }
	protected static final int BULK_ID_810_LEN = 4;
	/**
	 * 	serialize this BulkId810
	 */
   protected void serializeBulkId810(char[] bulkId810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bulkId810,0,getStringValue(),beginBulkId810,BULK_ID_810_LEN);
       localBulkId810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBulkId810Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBulkId810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBulkId810() {	 
   		return (substring(getStringValue(),beginBulkId810,beginBulkId810 + BULK_ID_810_LEN));
   	}
     int localEndptId810Counter = -1;
     public boolean isEndptId810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndptId810Counter != sharedCounter;
         localEndptId810Counter = sharedCounter; return hasModified;
     }
	protected static final int ENDPT_ID_810_LEN = 7;
	/**
	 * 	serialize this EndptId810
	 */
   protected void serializeEndptId810(char[] endptId810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endptId810,0,getStringValue(),beginEndptId810,ENDPT_ID_810_LEN);
       localEndptId810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndptId810Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshEndptId810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndptId810() {	 
   		return (substring(getStringValue(),beginEndptId810,beginEndptId810 + ENDPT_ID_810_LEN));
   	}
     int localEndptIdOrig810Counter = -1;
     public boolean isEndptIdOrig810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndptIdOrig810Counter != sharedCounter;
         localEndptIdOrig810Counter = sharedCounter; return hasModified;
     }
	protected static final int ENDPT_ID_ORIG_810_LEN = 7;
	/**
	 * 	serialize this EndptIdOrig810
	 */
   protected void serializeEndptIdOrig810(char[] endptIdOrig810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endptIdOrig810,0,getStringValue(),beginEndptIdOrig810,ENDPT_ID_ORIG_810_LEN);
       localEndptIdOrig810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndptIdOrig810Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshEndptIdOrig810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndptIdOrig810() {	 
   		return (substring(getStringValue(),beginEndptIdOrig810,beginEndptIdOrig810 + ENDPT_ID_ORIG_810_LEN));
   	}
     int localBusPrtnrIdOrig810Counter = -1;
     public boolean isBusPrtnrIdOrig810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBusPrtnrIdOrig810Counter != sharedCounter;
         localBusPrtnrIdOrig810Counter = sharedCounter; return hasModified;
     }
	protected static final int BUS_PRTNR_ID_ORIG_810_LEN = 6;
	/**
	 * 	serialize this BusPrtnrIdOrig810
	 */
   protected void serializeBusPrtnrIdOrig810(char[] busPrtnrIdOrig810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(busPrtnrIdOrig810,0,getStringValue(),beginBusPrtnrIdOrig810,BUS_PRTNR_ID_ORIG_810_LEN);
       localBusPrtnrIdOrig810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBusPrtnrIdOrig810Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBusPrtnrIdOrig810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBusPrtnrIdOrig810() {	 
   		return (substring(getStringValue(),beginBusPrtnrIdOrig810,beginBusPrtnrIdOrig810 + BUS_PRTNR_ID_ORIG_810_LEN));
   	}
        int localCyclNum810Counter = -1;
        public boolean isCyclNum810Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCyclNum810Counter != sharedCounter;
           localCyclNum810Counter = sharedCounter; return hasModified; 
        }
	    public boolean cyclNum810IsNumeric() {
	      return decimalIsNumeric(beginCyclNum810,CYCL_NUM_810_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int CYCL_NUM_810_LEN = 2;
  	/**
	 * 	serializeCyclNum810
	 */
	protected void serializeCyclNum810(short cyclNum810) {
		   putDecimal(beginCyclNum810,cyclNum810,CYCL_NUM_810_LEN,true);
   }
   

   protected short checkCyclNum810MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshCyclNum810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCyclNum810() throws CFException {	
   	try { 
		 return (getShortDecimal(beginCyclNum810,CYCL_NUM_810_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("cyclNum810", beginCyclNum810,CYCL_NUM_810_LEN);
     }
   	}
     int localBusPrtnrId810Counter = -1;
     public boolean isBusPrtnrId810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBusPrtnrId810Counter != sharedCounter;
         localBusPrtnrId810Counter = sharedCounter; return hasModified;
     }
	protected static final int BUS_PRTNR_ID_810_LEN = 6;
	/**
	 * 	serialize this BusPrtnrId810
	 */
   protected void serializeBusPrtnrId810(char[] busPrtnrId810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(busPrtnrId810,0,getStringValue(),beginBusPrtnrId810,BUS_PRTNR_ID_810_LEN);
       localBusPrtnrId810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBusPrtnrId810Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBusPrtnrId810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBusPrtnrId810() {	 
   		return (substring(getStringValue(),beginBusPrtnrId810,beginBusPrtnrId810 + BUS_PRTNR_ID_810_LEN));
   	}
     int localProcJulDay810Counter = -1;
     public boolean isProcJulDay810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcJulDay810Counter != sharedCounter;
         localProcJulDay810Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of procJulDay810
	 *	@return procJulDay810
	 */
	public char[]  getProcJulDay810String() {
	     return getCharArray(beginProcJulDay810,PROC_JUL_DAY_810_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean procJulDay810IsNumeric() {
	    return isNumeric(beginProcJulDay810
	                    ,beginProcJulDay810 + PROC_JUL_DAY_810_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROC_JUL_DAY_810_LEN = 3;
  	/**
	 * serializeProcJulDay810
	 */
	protected void serializeProcJulDay810(int procJulDay810) {
		 putNumber(beginProcJulDay810,procJulDay810,PROC_JUL_DAY_810_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProcJulDay810Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProcJulDay810
	 */
   	protected  int serializeProcJulDay810(char[] value) {
	    int  procJulDay810;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    procJulDay810 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginProcJulDay810
		       ,3
		      );
		 localProcJulDay810Counter = shareString.getSerializedField().getModifiedCounter();
		return  procJulDay810;
    }

   protected int checkProcJulDay810MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProcJulDay810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshProcJulDay810() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginProcJulDay810
			                 ,PROC_JUL_DAY_810_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("procJulDay810", beginProcJulDay810,PROC_JUL_DAY_810_LEN);
    }
   	}
     int localComputeDate810Counter = -1;
     public boolean isComputeDate810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComputeDate810Counter != sharedCounter;
         localComputeDate810Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of computeDate810
	 *	@return computeDate810
	 */
	public char[]  getComputeDate810String() {
	     return getCharArray(beginComputeDate810,COMPUTE_DATE_810_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean computeDate810IsNumeric() {
	    return isNumeric(beginComputeDate810
	                    ,beginComputeDate810 + COMPUTE_DATE_810_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMPUTE_DATE_810_LEN = 8;
  	/**
	 * serializeComputeDate810
	 */
	protected void serializeComputeDate810(long computeDate810) {
		 putNumber(beginComputeDate810,computeDate810,COMPUTE_DATE_810_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localComputeDate810Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeComputeDate810
	 */
   	protected  long serializeComputeDate810(char[] value) {
	    long  computeDate810;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    computeDate810 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginComputeDate810
		       ,8
		      );
		 localComputeDate810Counter = shareString.getSerializedField().getModifiedCounter();
		return  computeDate810;
    }

   protected long checkComputeDate810MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshComputeDate810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshComputeDate810() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginComputeDate810
			                 ,COMPUTE_DATE_810_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("computeDate810", beginComputeDate810,COMPUTE_DATE_810_LEN);
    }
   	}
     int localStatCd810Counter = -1;
     public boolean isStatCd810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatCd810Counter != sharedCounter;
         localStatCd810Counter = sharedCounter; return hasModified;
     }
	protected static final int STAT_CD_810_LEN = 1;
	/**
	 * 	serialize this StatCd810
	 */
   protected void serializeStatCd810(char[] statCd810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(statCd810,0,getStringValue(),beginStatCd810,STAT_CD_810_LEN);
       localStatCd810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStatCd810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshStatCd810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStatCd810() {	 
   		return (substring(getStringValue(),beginStatCd810,beginStatCd810 + STAT_CD_810_LEN));
   	}
     int localXferMthdCd810Counter = -1;
     public boolean isXferMthdCd810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXferMthdCd810Counter != sharedCounter;
         localXferMthdCd810Counter = sharedCounter; return hasModified;
     }
	protected static final int XFER_MTHD_CD_810_LEN = 1;
	/**
	 * 	serialize this XferMthdCd810
	 */
   protected void serializeXferMthdCd810(char[] xferMthdCd810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xferMthdCd810,0,getStringValue(),beginXferMthdCd810,XFER_MTHD_CD_810_LEN);
       localXferMthdCd810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXferMthdCd810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXferMthdCd810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXferMthdCd810() {	 
   		return (substring(getStringValue(),beginXferMthdCd810,beginXferMthdCd810 + XFER_MTHD_CD_810_LEN));
   	}
     int localXferTypeCd810Counter = -1;
     public boolean isXferTypeCd810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXferTypeCd810Counter != sharedCounter;
         localXferTypeCd810Counter = sharedCounter; return hasModified;
     }
	protected static final int XFER_TYPE_CD_810_LEN = 1;
	/**
	 * 	serialize this XferTypeCd810
	 */
   protected void serializeXferTypeCd810(char[] xferTypeCd810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xferTypeCd810,0,getStringValue(),beginXferTypeCd810,XFER_TYPE_CD_810_LEN);
       localXferTypeCd810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXferTypeCd810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXferTypeCd810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXferTypeCd810() {	 
   		return (substring(getStringValue(),beginXferTypeCd810,beginXferTypeCd810 + XFER_TYPE_CD_810_LEN));
   	}
     int localSndRcvPrmsnCd810Counter = -1;
     public boolean isSndRcvPrmsnCd810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSndRcvPrmsnCd810Counter != sharedCounter;
         localSndRcvPrmsnCd810Counter = sharedCounter; return hasModified;
     }
	protected static final int SND_RCV_PRMSN_CD_810_LEN = 1;
	/**
	 * 	serialize this SndRcvPrmsnCd810
	 */
   protected void serializeSndRcvPrmsnCd810(char[] sndRcvPrmsnCd810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sndRcvPrmsnCd810,0,getStringValue(),beginSndRcvPrmsnCd810,SND_RCV_PRMSN_CD_810_LEN);
       localSndRcvPrmsnCd810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSndRcvPrmsnCd810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSndRcvPrmsnCd810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSndRcvPrmsnCd810() {	 
   		return (substring(getStringValue(),beginSndRcvPrmsnCd810,beginSndRcvPrmsnCd810 + SND_RCV_PRMSN_CD_810_LEN));
   	}
     int localRenameHlq810Counter = -1;
     public boolean isRenameHlq810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameHlq810Counter != sharedCounter;
         localRenameHlq810Counter = sharedCounter; return hasModified;
     }
	protected static final int RENAME_HLQ_810_LEN = 8;
	/**
	 * 	serialize this RenameHlq810
	 */
   protected void serializeRenameHlq810(char[] renameHlq810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(renameHlq810,0,getStringValue(),beginRenameHlq810,RENAME_HLQ_810_LEN);
       localRenameHlq810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRenameHlq810Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRenameHlq810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRenameHlq810() {	 
   		return (substring(getStringValue(),beginRenameHlq810,beginRenameHlq810 + RENAME_HLQ_810_LEN));
   	}
     int localRenameSystemId810Counter = -1;
     public boolean isRenameSystemId810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameSystemId810Counter != sharedCounter;
         localRenameSystemId810Counter = sharedCounter; return hasModified;
     }
	protected static final int RENAME_SYSTEM_ID_810_LEN = 8;
	/**
	 * 	serialize this RenameSystemId810
	 */
   protected void serializeRenameSystemId810(char[] renameSystemId810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(renameSystemId810,0,getStringValue(),beginRenameSystemId810,RENAME_SYSTEM_ID_810_LEN);
       localRenameSystemId810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRenameSystemId810Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRenameSystemId810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRenameSystemId810() {	 
   		return (substring(getStringValue(),beginRenameSystemId810,beginRenameSystemId810 + RENAME_SYSTEM_ID_810_LEN));
   	}
     int localPreExitDsn810Counter = -1;
     public boolean isPreExitDsn810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPreExitDsn810Counter != sharedCounter;
         localPreExitDsn810Counter = sharedCounter; return hasModified;
     }
	protected static final int PRE_EXIT_DSN_810_LEN = 44;
	/**
	 * 	serialize this PreExitDsn810
	 */
   protected void serializePreExitDsn810(char[] preExitDsn810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(preExitDsn810,0,getStringValue(),beginPreExitDsn810,PRE_EXIT_DSN_810_LEN);
       localPreExitDsn810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPreExitDsn810Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshPreExitDsn810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPreExitDsn810() {	 
   		return (substring(getStringValue(),beginPreExitDsn810,beginPreExitDsn810 + PRE_EXIT_DSN_810_LEN));
   	}
     int localRteToHubSw810Counter = -1;
     public boolean isRteToHubSw810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRteToHubSw810Counter != sharedCounter;
         localRteToHubSw810Counter = sharedCounter; return hasModified;
     }
	protected static final int RTE_TO_HUB_SW_810_LEN = 1;
	/**
	 * 	serialize this RteToHubSw810
	 */
   protected void serializeRteToHubSw810(char[] rteToHubSw810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rteToHubSw810,0,getStringValue(),beginRteToHubSw810,RTE_TO_HUB_SW_810_LEN);
       localRteToHubSw810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRteToHubSw810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRteToHubSw810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRteToHubSw810() {	 
   		return (substring(getStringValue(),beginRteToHubSw810,beginRteToHubSw810 + RTE_TO_HUB_SW_810_LEN));
   	}




}
  
