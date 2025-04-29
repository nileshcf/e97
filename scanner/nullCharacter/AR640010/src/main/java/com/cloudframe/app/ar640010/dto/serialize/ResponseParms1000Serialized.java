package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResponseParms1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ResponseParms1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResponseParms1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESPONSE_PARMS_1000_LENGTH = 326;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFunctionResponse1000;
            protected  int beginRequestNbr1000;
            protected  int beginResponseDsn1000;
            protected  int beginBulkFilesAvail1000;
            protected  int beginAllocUnitType1000;
            protected  int beginAllocUnitsUsed1000;
            protected  int beginRecfm1000;
            protected  int beginLrecl1000;
            protected  int beginBlksz1000;
            protected  int beginRecordCopyCnt1000;
            protected  int beginBroadcastEndpts1000;
            protected  int beginBroadcastErrors1000;
            protected  int beginResponseMessage1000;
            protected  int beginApplProcDate1000;
            protected  int beginApplProcDateJul1000;
            protected  int beginResponseBusPrtnrId1000;
            protected  int beginResponseIca1000;
            protected  int beginResponseTknname1000;
            protected  int beginResponseGftDsnFail1000;
	
	/**
	* Constructor for ResponseParms1000Serialized
	**/
    public ResponseParms1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ResponseParms1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESPONSE_PARMS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFunctionResponse1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginRequestNbr1000 = getStartOffset() + 4;	// set offset for serialization
  
             beginResponseDsn1000 = getStartOffset() + 9;	// set offset for serialization
  
             beginBulkFilesAvail1000 = getStartOffset() + 53;	// set offset for serialization
  
             beginAllocUnitType1000 = getStartOffset() + 57;	// set offset for serialization
  
             beginAllocUnitsUsed1000 = getStartOffset() + 58;	// set offset for serialization
  
             beginRecfm1000 = getStartOffset() + 62;	// set offset for serialization
  
             beginLrecl1000 = getStartOffset() + 65;	// set offset for serialization
  
             beginBlksz1000 = getStartOffset() + 69;	// set offset for serialization
  
             beginRecordCopyCnt1000 = getStartOffset() + 73;	// set offset for serialization
  
             beginBroadcastEndpts1000 = getStartOffset() + 77;	// set offset for serialization
  
             beginBroadcastErrors1000 = getStartOffset() + 81;	// set offset for serialization
  
             beginResponseMessage1000 = getStartOffset() + 85;	// set offset for serialization
  
  
             beginApplProcDate1000 = getStartOffset() + 135;	// set offset for serialization
  
             beginApplProcDateJul1000 = getStartOffset() + 145;	// set offset for serialization
  
             beginResponseBusPrtnrId1000 = getStartOffset() + 148;	// set offset for serialization
  
             beginResponseIca1000 = getStartOffset() + 148;	// set offset for serialization
  
             beginResponseTknname1000 = getStartOffset() + 154;	// set offset for serialization
  
             beginResponseGftDsnFail1000 = getStartOffset() + 282;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFunctionResponse1000Counter = -1;
     public boolean isFunctionResponse1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionResponse1000Counter != sharedCounter;
         localFunctionResponse1000Counter = sharedCounter; return hasModified;
     }
	protected static final int FUNCTION_RESPONSE_1000_LEN = 4;
	/**
	 * 	serialize this FunctionResponse1000
	 */
   protected void serializeFunctionResponse1000(char[] functionResponse1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(functionResponse1000,0,getStringValue(),beginFunctionResponse1000,FUNCTION_RESPONSE_1000_LEN);
       localFunctionResponse1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFunctionResponse1000Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFunctionResponse1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFunctionResponse1000() {	 
   		return (substring(getStringValue(),beginFunctionResponse1000,beginFunctionResponse1000 + FUNCTION_RESPONSE_1000_LEN));
   	}
        int localRequestNbr1000Counter = -1;
        public boolean isRequestNbr1000Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRequestNbr1000Counter != sharedCounter;
           localRequestNbr1000Counter = sharedCounter; return hasModified; 
        }
	    public boolean requestNbr1000IsNumeric() {
	      return decimalIsNumeric(beginRequestNbr1000,REQUEST_NBR_1000_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int REQUEST_NBR_1000_LEN = 5;
  	/**
	 * 	serializeRequestNbr1000
	 */
	protected void serializeRequestNbr1000(int requestNbr1000) {
		   putDecimal(beginRequestNbr1000,requestNbr1000,REQUEST_NBR_1000_LEN,true);
   }
   

   protected int checkRequestNbr1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRequestNbr1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRequestNbr1000() throws CFException {	
   	try { 
		 return (getIntDecimal(beginRequestNbr1000,REQUEST_NBR_1000_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("requestNbr1000", beginRequestNbr1000,REQUEST_NBR_1000_LEN);
     }
   	}
     int localResponseDsn1000Counter = -1;
     public boolean isResponseDsn1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseDsn1000Counter != sharedCounter;
         localResponseDsn1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_DSN_1000_LEN = 44;
	/**
	 * 	serialize this ResponseDsn1000
	 */
   protected void serializeResponseDsn1000(char[] responseDsn1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseDsn1000,0,getStringValue(),beginResponseDsn1000,RESPONSE_DSN_1000_LEN);
       localResponseDsn1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseDsn1000Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshResponseDsn1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseDsn1000() {	 
   		return (substring(getStringValue(),beginResponseDsn1000,beginResponseDsn1000 + RESPONSE_DSN_1000_LEN));
   	}
         int localBulkFilesAvail1000Counter = -1;
         public boolean isBulkFilesAvail1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBulkFilesAvail1000Counter != sharedCounter;
            localBulkFilesAvail1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int BULK_FILES_AVAIL_1000_LEN = 4;
  	/**
	 * serializeBulkFilesAvail1000
	 */
	protected void serializeBulkFilesAvail1000(int bulkFilesAvail1000) {
           replaceValue( //  save the value as string
                   getBinaryString( bulkFilesAvail1000,BULK_FILES_AVAIL_1000_LEN)
                  ,beginBulkFilesAvail1000
                  ,BULK_FILES_AVAIL_1000_LEN
                 );
            localBulkFilesAvail1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBulkFilesAvail1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBulkFilesAvail1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBulkFilesAvail1000() {	 
			return (getInt(beginBulkFilesAvail1000));
   	}
     int localAllocUnitType1000Counter = -1;
     public boolean isAllocUnitType1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAllocUnitType1000Counter != sharedCounter;
         localAllocUnitType1000Counter = sharedCounter; return hasModified;
     }
	protected static final int ALLOC_UNIT_TYPE_1000_LEN = 1;
	/**
	 * 	serialize this AllocUnitType1000
	 */
   protected void serializeAllocUnitType1000(char[] allocUnitType1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(allocUnitType1000,0,getStringValue(),beginAllocUnitType1000,ALLOC_UNIT_TYPE_1000_LEN);
       localAllocUnitType1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAllocUnitType1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAllocUnitType1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAllocUnitType1000() {	 
   		return (substring(getStringValue(),beginAllocUnitType1000,beginAllocUnitType1000 + ALLOC_UNIT_TYPE_1000_LEN));
   	}
         int localAllocUnitsUsed1000Counter = -1;
         public boolean isAllocUnitsUsed1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAllocUnitsUsed1000Counter != sharedCounter;
            localAllocUnitsUsed1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int ALLOC_UNITS_USED_1000_LEN = 4;
  	/**
	 * serializeAllocUnitsUsed1000
	 */
	protected void serializeAllocUnitsUsed1000(int allocUnitsUsed1000) {
           replaceValue( //  save the value as string
                   getBinaryString( allocUnitsUsed1000,ALLOC_UNITS_USED_1000_LEN)
                  ,beginAllocUnitsUsed1000
                  ,ALLOC_UNITS_USED_1000_LEN
                 );
            localAllocUnitsUsed1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAllocUnitsUsed1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAllocUnitsUsed1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAllocUnitsUsed1000() {	 
			return (getInt(beginAllocUnitsUsed1000));
   	}
     int localRecfm1000Counter = -1;
     public boolean isRecfm1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecfm1000Counter != sharedCounter;
         localRecfm1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RECFM_1000_LEN = 3;
	/**
	 * 	serialize this Recfm1000
	 */
   protected void serializeRecfm1000(char[] recfm1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recfm1000,0,getStringValue(),beginRecfm1000,RECFM_1000_LEN);
       localRecfm1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecfm1000Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRecfm1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecfm1000() {	 
   		return (substring(getStringValue(),beginRecfm1000,beginRecfm1000 + RECFM_1000_LEN));
   	}
         int localLrecl1000Counter = -1;
         public boolean isLrecl1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLrecl1000Counter != sharedCounter;
            localLrecl1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int LRECL_1000_LEN = 4;
  	/**
	 * serializeLrecl1000
	 */
	protected void serializeLrecl1000(int lrecl1000) {
           replaceValue( //  save the value as string
                   getBinaryString( lrecl1000,LRECL_1000_LEN)
                  ,beginLrecl1000
                  ,LRECL_1000_LEN
                 );
            localLrecl1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLrecl1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLrecl1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLrecl1000() {	 
			return (getInt(beginLrecl1000));
   	}
         int localBlksz1000Counter = -1;
         public boolean isBlksz1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBlksz1000Counter != sharedCounter;
            localBlksz1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int BLKSZ_1000_LEN = 4;
  	/**
	 * serializeBlksz1000
	 */
	protected void serializeBlksz1000(int blksz1000) {
           replaceValue( //  save the value as string
                   getBinaryString( blksz1000,BLKSZ_1000_LEN)
                  ,beginBlksz1000
                  ,BLKSZ_1000_LEN
                 );
            localBlksz1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBlksz1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBlksz1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBlksz1000() {	 
			return (getInt(beginBlksz1000));
   	}
         int localRecordCopyCnt1000Counter = -1;
         public boolean isRecordCopyCnt1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecordCopyCnt1000Counter != sharedCounter;
            localRecordCopyCnt1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int RECORD_COPY_CNT_1000_LEN = 4;
  	/**
	 * serializeRecordCopyCnt1000
	 */
	protected void serializeRecordCopyCnt1000(int recordCopyCnt1000) {
           replaceValue( //  save the value as string
                   getBinaryString( recordCopyCnt1000,RECORD_COPY_CNT_1000_LEN)
                  ,beginRecordCopyCnt1000
                  ,RECORD_COPY_CNT_1000_LEN
                 );
            localRecordCopyCnt1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRecordCopyCnt1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRecordCopyCnt1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRecordCopyCnt1000() {	 
			return (getInt(beginRecordCopyCnt1000));
   	}
         int localBroadcastEndpts1000Counter = -1;
         public boolean isBroadcastEndpts1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBroadcastEndpts1000Counter != sharedCounter;
            localBroadcastEndpts1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int BROADCAST_ENDPTS_1000_LEN = 4;
  	/**
	 * serializeBroadcastEndpts1000
	 */
	protected void serializeBroadcastEndpts1000(int broadcastEndpts1000) {
           replaceValue( //  save the value as string
                   getBinaryString( broadcastEndpts1000,BROADCAST_ENDPTS_1000_LEN)
                  ,beginBroadcastEndpts1000
                  ,BROADCAST_ENDPTS_1000_LEN
                 );
            localBroadcastEndpts1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBroadcastEndpts1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBroadcastEndpts1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBroadcastEndpts1000() {	 
			return (getInt(beginBroadcastEndpts1000));
   	}
         int localBroadcastErrors1000Counter = -1;
         public boolean isBroadcastErrors1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBroadcastErrors1000Counter != sharedCounter;
            localBroadcastErrors1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int BROADCAST_ERRORS_1000_LEN = 4;
  	/**
	 * serializeBroadcastErrors1000
	 */
	protected void serializeBroadcastErrors1000(int broadcastErrors1000) {
           replaceValue( //  save the value as string
                   getBinaryString( broadcastErrors1000,BROADCAST_ERRORS_1000_LEN)
                  ,beginBroadcastErrors1000
                  ,BROADCAST_ERRORS_1000_LEN
                 );
            localBroadcastErrors1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBroadcastErrors1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBroadcastErrors1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBroadcastErrors1000() {	 
			return (getInt(beginBroadcastErrors1000));
   	}
     int localResponseMessage1000Counter = -1;
     public boolean isResponseMessage1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseMessage1000Counter != sharedCounter;
         localResponseMessage1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_MESSAGE_1000_LEN = 50;
	/**
	 * 	serialize this ResponseMessage1000
	 */
   protected void serializeResponseMessage1000(char[] responseMessage1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseMessage1000,0,getStringValue(),beginResponseMessage1000,RESPONSE_MESSAGE_1000_LEN);
       localResponseMessage1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseMessage1000Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshResponseMessage1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseMessage1000() {	 
   		return (substring(getStringValue(),beginResponseMessage1000,beginResponseMessage1000 + RESPONSE_MESSAGE_1000_LEN));
   	}
     int localApplProcDate1000Counter = -1;
     public boolean isApplProcDate1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplProcDate1000Counter != sharedCounter;
         localApplProcDate1000Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_PROC_DATE_1000_LEN = 10;
	/**
	 * 	serialize this ApplProcDate1000
	 */
   protected void serializeApplProcDate1000(char[] applProcDate1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applProcDate1000,0,getStringValue(),beginApplProcDate1000,APPL_PROC_DATE_1000_LEN);
       localApplProcDate1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplProcDate1000Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshApplProcDate1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplProcDate1000() {	 
   		return (substring(getStringValue(),beginApplProcDate1000,beginApplProcDate1000 + APPL_PROC_DATE_1000_LEN));
   	}
     int localApplProcDateJul1000Counter = -1;
     public boolean isApplProcDateJul1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplProcDateJul1000Counter != sharedCounter;
         localApplProcDateJul1000Counter = sharedCounter; return hasModified;
     }
	protected static final int APPL_PROC_DATE_JUL_1000_LEN = 3;
	/**
	 * 	serialize this ApplProcDateJul1000
	 */
   protected void serializeApplProcDateJul1000(char[] applProcDateJul1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applProcDateJul1000,0,getStringValue(),beginApplProcDateJul1000,APPL_PROC_DATE_JUL_1000_LEN);
       localApplProcDateJul1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplProcDateJul1000Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshApplProcDateJul1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplProcDateJul1000() {	 
   		return (substring(getStringValue(),beginApplProcDateJul1000,beginApplProcDateJul1000 + APPL_PROC_DATE_JUL_1000_LEN));
   	}
     int localResponseBusPrtnrId1000Counter = -1;
     public boolean isResponseBusPrtnrId1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseBusPrtnrId1000Counter != sharedCounter;
         localResponseBusPrtnrId1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_BUS_PRTNR_ID_1000_LEN = 6;
	/**
	 * 	serialize this ResponseBusPrtnrId1000
	 */
   protected void serializeResponseBusPrtnrId1000(char[] responseBusPrtnrId1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseBusPrtnrId1000,0,getStringValue(),beginResponseBusPrtnrId1000,RESPONSE_BUS_PRTNR_ID_1000_LEN);
       localResponseBusPrtnrId1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseBusPrtnrId1000Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshResponseBusPrtnrId1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseBusPrtnrId1000() {	 
   		return (substring(getStringValue(),beginResponseBusPrtnrId1000,beginResponseBusPrtnrId1000 + RESPONSE_BUS_PRTNR_ID_1000_LEN));
   	}
     int localResponseIca1000Counter = -1;
     public boolean isResponseIca1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseIca1000Counter != sharedCounter;
         localResponseIca1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_ICA_1000_LEN = 6;
	/**
	 * 	serialize this ResponseIca1000
	 */
   protected void serializeResponseIca1000(char[] responseIca1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseIca1000,0,getStringValue(),beginResponseIca1000,RESPONSE_ICA_1000_LEN);
       localResponseIca1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseIca1000Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshResponseIca1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseIca1000() {	 
   		return (substring(getStringValue(),beginResponseIca1000,beginResponseIca1000 + RESPONSE_ICA_1000_LEN));
   	}
     int localResponseTknname1000Counter = -1;
     public boolean isResponseTknname1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseTknname1000Counter != sharedCounter;
         localResponseTknname1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_TKNNAME_1000_LEN = 128;
	/**
	 * 	serialize this ResponseTknname1000
	 */
   protected void serializeResponseTknname1000(char[] responseTknname1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseTknname1000,0,getStringValue(),beginResponseTknname1000,RESPONSE_TKNNAME_1000_LEN);
       localResponseTknname1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseTknname1000Constraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshResponseTknname1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseTknname1000() {	 
   		return (substring(getStringValue(),beginResponseTknname1000,beginResponseTknname1000 + RESPONSE_TKNNAME_1000_LEN));
   	}
     int localResponseGftDsnFail1000Counter = -1;
     public boolean isResponseGftDsnFail1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseGftDsnFail1000Counter != sharedCounter;
         localResponseGftDsnFail1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_GFT_DSN_FAIL_1000_LEN = 44;
	/**
	 * 	serialize this ResponseGftDsnFail1000
	 */
   protected void serializeResponseGftDsnFail1000(char[] responseGftDsnFail1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseGftDsnFail1000,0,getStringValue(),beginResponseGftDsnFail1000,RESPONSE_GFT_DSN_FAIL_1000_LEN);
       localResponseGftDsnFail1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseGftDsnFail1000Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshResponseGftDsnFail1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseGftDsnFail1000() {	 
   		return (substring(getStringValue(),beginResponseGftDsnFail1000,beginResponseGftDsnFail1000 + RESPONSE_GFT_DSN_FAIL_1000_LEN));
   	}




}
  
