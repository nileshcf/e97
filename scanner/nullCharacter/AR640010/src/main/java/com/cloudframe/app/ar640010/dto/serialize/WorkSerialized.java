package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 97;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSpaceCount310;
            protected  int beginTildeCount310;
            protected  int beginTildeCount1310;
            protected  int beginPipeCount310;
            protected  int beginScolCount310;
            protected  int beginPackedOne310;
            protected  int beginZonedTwentyeight310;
            protected  int beginZonedTwentynine310;
            protected  int beginZoned0080310;
            protected  int beginMaximumCyl360;
            protected  int beginMaximumTrk360;
            protected  int beginMaximumBlk360;
            protected  int beginMaximumCylDeflt360;
            protected  int beginMaximumTrkDeflt360;
            protected  int beginMaximumBlkDeflt360;
            protected  int beginRequest410;
            protected  int beginError410;
	
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginSpaceCount310 = getStartOffset() + 0;	// set offset for serialization
  
             beginTildeCount310 = getStartOffset() + 3;	// set offset for serialization
  
             beginTildeCount1310 = getStartOffset() + 6;	// set offset for serialization
  
             beginPipeCount310 = getStartOffset() + 9;	// set offset for serialization
  
             beginScolCount310 = getStartOffset() + 12;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginPackedOne310 = getStartOffset() + 15;	// set offset for serialization
  
             beginZonedTwentyeight310 = getStartOffset() + 16;	// set offset for serialization
  
             beginZonedTwentynine310 = getStartOffset() + 18;	// set offset for serialization
  
             beginZoned0080310 = getStartOffset() + 20;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginMaximumCyl360 = getStartOffset() + 24;	// set offset for serialization
  
             beginMaximumTrk360 = getStartOffset() + 35;	// set offset for serialization
  
             beginMaximumBlk360 = getStartOffset() + 46;	// set offset for serialization
  
             beginMaximumCylDeflt360 = getStartOffset() + 57;	// set offset for serialization
  
             beginMaximumTrkDeflt360 = getStartOffset() + 68;	// set offset for serialization
  
             beginMaximumBlkDeflt360 = getStartOffset() + 79;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
             beginRequest410 = getStartOffset() + 90;	// set offset for serialization
  
             beginError410 = getStartOffset() + 95;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localTaraxtkFetchStatus100Counter = -1;
     public boolean isTaraxtkFetchStatus100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkFetchStatus100Counter != sharedCounter;
         localTaraxtkFetchStatus100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraxtkFetchStatus100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTaraxtkConfigValues100Counter = -1;
     public boolean isTaraxtkConfigValues100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraxtkConfigValues100Counter != sharedCounter;
         localTaraxtkConfigValues100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraxtkConfigValues100Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
     int localFirstCall100Counter = -1;
     public boolean isFirstCall100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstCall100Counter != sharedCounter;
         localFirstCall100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstCall100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCallAttachLoad100Counter = -1;
     public boolean isCallAttachLoad100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCallAttachLoad100Counter != sharedCounter;
         localCallAttachLoad100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCallAttachLoad100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localRequestStatus110Counter = -1;
     public boolean isRequestStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequestStatus110Counter != sharedCounter;
         localRequestStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRequestStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDeleteApplOption110Counter = -1;
     public boolean isDeleteApplOption110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeleteApplOption110Counter != sharedCounter;
         localDeleteApplOption110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDeleteApplOption110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localBroadcastStatus110Counter = -1;
     public boolean isBroadcastStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastStatus110Counter != sharedCounter;
         localBroadcastStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBroadcastStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localInstallStatus110Counter = -1;
     public boolean isInstallStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInstallStatus110Counter != sharedCounter;
         localInstallStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInstallStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localRetrieveStatus110Counter = -1;
     public boolean isRetrieveStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetrieveStatus110Counter != sharedCounter;
         localRetrieveStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRetrieveStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localResendStatus110Counter = -1;
     public boolean isResendStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResendStatus110Counter != sharedCounter;
         localResendStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkResendStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSetupStatus110Counter = -1;
     public boolean isSetupStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupStatus110Counter != sharedCounter;
         localSetupStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSetupReported110Counter = -1;
     public boolean isSetupReported110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupReported110Counter != sharedCounter;
         localSetupReported110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupReported110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTransferPostStatus110Counter = -1;
     public boolean isTransferPostStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTransferPostStatus110Counter != sharedCounter;
         localTransferPostStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTransferPostStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCopyStatus110Counter = -1;
     public boolean isCopyStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyStatus110Counter != sharedCounter;
         localCopyStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopyStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDynamEndStatus110Counter = -1;
     public boolean isDynamEndStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamEndStatus110Counter != sharedCounter;
         localDynamEndStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDynamEndStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localGftConnectStatus110Counter = -1;
     public boolean isGftConnectStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftConnectStatus110Counter != sharedCounter;
         localGftConnectStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkGftConnectStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localJclDdStatus110Counter = -1;
     public boolean isJclDdStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJclDdStatus110Counter != sharedCounter;
         localJclDdStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJclDdStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localResultDisp110Counter = -1;
     public boolean isResultDisp110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultDisp110Counter != sharedCounter;
         localResultDisp110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkResultDisp110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localResultFile110Counter = -1;
     public boolean isResultFile110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultFile110Counter != sharedCounter;
         localResultFile110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkResultFile110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSqlExecStatus110Counter = -1;
     public boolean isSqlExecStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlExecStatus110Counter != sharedCounter;
         localSqlExecStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlExecStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSqlRetryOption110Counter = -1;
     public boolean isSqlRetryOption110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlRetryOption110Counter != sharedCounter;
         localSqlRetryOption110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlRetryOption110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localRenameApplStatus110Counter = -1;
     public boolean isRenameApplStatus110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameApplStatus110Counter != sharedCounter;
         localRenameApplStatus110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRenameApplStatus110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSourceDsnSpaceInd110Counter = -1;
     public boolean isSourceDsnSpaceInd110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSourceDsnSpaceInd110Counter != sharedCounter;
         localSourceDsnSpaceInd110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSourceDsnSpaceInd110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localStatusAssignmentOption110Counter = -1;
     public boolean isStatusAssignmentOption110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatusAssignmentOption110Counter != sharedCounter;
         localStatusAssignmentOption110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkStatusAssignmentOption110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLogQueIndicator110Counter = -1;
     public boolean isLogQueIndicator110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogQueIndicator110Counter != sharedCounter;
         localLogQueIndicator110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLogQueIndicator110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSkipByteCountInd110Counter = -1;
     public boolean isSkipByteCountInd110Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSkipByteCountInd110Counter != sharedCounter;
         localSkipByteCountInd110Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSkipByteCountInd110Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPgmMcdynam300Counter = -1;
     public boolean isPgmMcdynam300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmMcdynam300Counter != sharedCounter;
         localPgmMcdynam300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmMcdynam300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmMcwait300Counter = -1;
     public boolean isPgmMcwait300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmMcwait300Counter != sharedCounter;
         localPgmMcwait300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmMcwait300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmAr648010300Counter = -1;
     public boolean isPgmAr648010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmAr648010300Counter != sharedCounter;
         localPgmAr648010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmAr648010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSpaceCount310Counter = -1;
     public boolean isSpaceCount310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpaceCount310Counter != sharedCounter;
         localSpaceCount310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of spaceCount310
	 *	@return spaceCount310
	 */
	public char[]  getSpaceCount310String() {
	     return getCharArray(beginSpaceCount310,SPACE_COUNT_310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean spaceCount310IsNumeric() {
	    return isNumeric(beginSpaceCount310
	                    ,beginSpaceCount310 + SPACE_COUNT_310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SPACE_COUNT_310_LEN = 3;
  	/**
	 * serializeSpaceCount310
	 */
	protected void serializeSpaceCount310(int spaceCount310) {
		 putNumber(beginSpaceCount310,spaceCount310,SPACE_COUNT_310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSpaceCount310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSpaceCount310
	 */
   	protected  int serializeSpaceCount310(char[] value) {
	    int  spaceCount310;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    spaceCount310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSpaceCount310
		       ,3
		      );
		 localSpaceCount310Counter = shareString.getSerializedField().getModifiedCounter();
		return  spaceCount310;
    }

   protected int checkSpaceCount310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSpaceCount310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpaceCount310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSpaceCount310
			                 ,SPACE_COUNT_310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("spaceCount310", beginSpaceCount310,SPACE_COUNT_310_LEN);
    }
   	}
     int localTildeCount310Counter = -1;
     public boolean isTildeCount310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTildeCount310Counter != sharedCounter;
         localTildeCount310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tildeCount310
	 *	@return tildeCount310
	 */
	public char[]  getTildeCount310String() {
	     return getCharArray(beginTildeCount310,TILDE_COUNT_310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tildeCount310IsNumeric() {
	    return isNumeric(beginTildeCount310
	                    ,beginTildeCount310 + TILDE_COUNT_310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TILDE_COUNT_310_LEN = 3;
  	/**
	 * serializeTildeCount310
	 */
	protected void serializeTildeCount310(int tildeCount310) {
		 putNumber(beginTildeCount310,tildeCount310,TILDE_COUNT_310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTildeCount310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTildeCount310
	 */
   	protected  int serializeTildeCount310(char[] value) {
	    int  tildeCount310;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tildeCount310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTildeCount310
		       ,3
		      );
		 localTildeCount310Counter = shareString.getSerializedField().getModifiedCounter();
		return  tildeCount310;
    }

   protected int checkTildeCount310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTildeCount310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTildeCount310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTildeCount310
			                 ,TILDE_COUNT_310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tildeCount310", beginTildeCount310,TILDE_COUNT_310_LEN);
    }
   	}
     int localTildeCount1310Counter = -1;
     public boolean isTildeCount1310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTildeCount1310Counter != sharedCounter;
         localTildeCount1310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tildeCount1310
	 *	@return tildeCount1310
	 */
	public char[]  getTildeCount1310String() {
	     return getCharArray(beginTildeCount1310,TILDE_COUNT_1310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tildeCount1310IsNumeric() {
	    return isNumeric(beginTildeCount1310
	                    ,beginTildeCount1310 + TILDE_COUNT_1310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TILDE_COUNT_1310_LEN = 3;
  	/**
	 * serializeTildeCount1310
	 */
	protected void serializeTildeCount1310(int tildeCount1310) {
		 putNumber(beginTildeCount1310,tildeCount1310,TILDE_COUNT_1310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTildeCount1310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTildeCount1310
	 */
   	protected  int serializeTildeCount1310(char[] value) {
	    int  tildeCount1310;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tildeCount1310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTildeCount1310
		       ,3
		      );
		 localTildeCount1310Counter = shareString.getSerializedField().getModifiedCounter();
		return  tildeCount1310;
    }

   protected int checkTildeCount1310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTildeCount1310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTildeCount1310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTildeCount1310
			                 ,TILDE_COUNT_1310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tildeCount1310", beginTildeCount1310,TILDE_COUNT_1310_LEN);
    }
   	}
     int localPipeCount310Counter = -1;
     public boolean isPipeCount310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPipeCount310Counter != sharedCounter;
         localPipeCount310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pipeCount310
	 *	@return pipeCount310
	 */
	public char[]  getPipeCount310String() {
	     return getCharArray(beginPipeCount310,PIPE_COUNT_310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pipeCount310IsNumeric() {
	    return isNumeric(beginPipeCount310
	                    ,beginPipeCount310 + PIPE_COUNT_310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PIPE_COUNT_310_LEN = 3;
  	/**
	 * serializePipeCount310
	 */
	protected void serializePipeCount310(int pipeCount310) {
		 putNumber(beginPipeCount310,pipeCount310,PIPE_COUNT_310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPipeCount310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePipeCount310
	 */
   	protected  int serializePipeCount310(char[] value) {
	    int  pipeCount310;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pipeCount310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPipeCount310
		       ,3
		      );
		 localPipeCount310Counter = shareString.getSerializedField().getModifiedCounter();
		return  pipeCount310;
    }

   protected int checkPipeCount310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPipeCount310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPipeCount310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPipeCount310
			                 ,PIPE_COUNT_310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pipeCount310", beginPipeCount310,PIPE_COUNT_310_LEN);
    }
   	}
     int localScolCount310Counter = -1;
     public boolean isScolCount310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localScolCount310Counter != sharedCounter;
         localScolCount310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of scolCount310
	 *	@return scolCount310
	 */
	public char[]  getScolCount310String() {
	     return getCharArray(beginScolCount310,SCOL_COUNT_310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean scolCount310IsNumeric() {
	    return isNumeric(beginScolCount310
	                    ,beginScolCount310 + SCOL_COUNT_310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SCOL_COUNT_310_LEN = 3;
  	/**
	 * serializeScolCount310
	 */
	protected void serializeScolCount310(int scolCount310) {
		 putNumber(beginScolCount310,scolCount310,SCOL_COUNT_310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localScolCount310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeScolCount310
	 */
   	protected  int serializeScolCount310(char[] value) {
	    int  scolCount310;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    scolCount310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginScolCount310
		       ,3
		      );
		 localScolCount310Counter = shareString.getSerializedField().getModifiedCounter();
		return  scolCount310;
    }

   protected int checkScolCount310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshScolCount310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshScolCount310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginScolCount310
			                 ,SCOL_COUNT_310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("scolCount310", beginScolCount310,SCOL_COUNT_310_LEN);
    }
   	}
         int localBinaryOne310Counter = -1;
         public boolean isBinaryOne310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryOne310Counter != sharedCounter;
            localBinaryOne310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryOne310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinaryFour310Counter = -1;
         public boolean isBinaryFour310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryFour310Counter != sharedCounter;
            localBinaryFour310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryFour310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinaryFive310Counter = -1;
         public boolean isBinaryFive310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryFive310Counter != sharedCounter;
            localBinaryFive310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryFive310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinaryThirteen310Counter = -1;
         public boolean isBinaryThirteen310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryThirteen310Counter != sharedCounter;
            localBinaryThirteen310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryThirteen310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinaryEighty310Counter = -1;
         public boolean isBinaryEighty310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryEighty310Counter != sharedCounter;
            localBinaryEighty310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryEighty310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinaryLrecl133310Counter = -1;
         public boolean isBinaryLrecl133310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryLrecl133310Counter != sharedCounter;
            localBinaryLrecl133310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinaryLrecl133310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localMinusOne310Counter = -1;
         public boolean isMinusOne310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMinusOne310Counter != sharedCounter;
            localMinusOne310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkMinusOne310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localBinaryControlBlksz310Counter = -1;
         public boolean isBinaryControlBlksz310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryControlBlksz310Counter != sharedCounter;
            localBinaryControlBlksz310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBinaryControlBlksz310MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBinarySysoutBlksz310Counter = -1;
         public boolean isBinarySysoutBlksz310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinarySysoutBlksz310Counter != sharedCounter;
            localBinarySysoutBlksz310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBinarySysoutBlksz310MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBinaryListddpoBlksz310Counter = -1;
         public boolean isBinaryListddpoBlksz310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinaryListddpoBlksz310Counter != sharedCounter;
            localBinaryListddpoBlksz310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBinaryListddpoBlksz310MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBinControlBlksz310Counter = -1;
         public boolean isBinControlBlksz310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinControlBlksz310Counter != sharedCounter;
            localBinControlBlksz310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBinControlBlksz310MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBinSysoutBlksz310Counter = -1;
         public boolean isBinSysoutBlksz310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinSysoutBlksz310Counter != sharedCounter;
            localBinSysoutBlksz310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBinSysoutBlksz310MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBinListddpoBlksz310Counter = -1;
         public boolean isBinListddpoBlksz310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinListddpoBlksz310Counter != sharedCounter;
            localBinListddpoBlksz310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBinListddpoBlksz310MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBinLrecl133310Counter = -1;
         public boolean isBinLrecl133310Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBinLrecl133310Counter != sharedCounter;
            localBinLrecl133310Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkBinLrecl133310MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localPackedOne310Counter = -1;
        public boolean isPackedOne310Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPackedOne310Counter != sharedCounter;
           localPackedOne310Counter = sharedCounter; return hasModified; 
        }
	    public boolean packedOne310IsNumeric() {
	      return decimalIsNumeric(beginPackedOne310,PACKED_ONE_310_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PACKED_ONE_310_LEN = 1;
  	/**
	 * 	serializePackedOne310
	 */
	protected void serializePackedOne310(short packedOne310) {
		   putDecimal(beginPackedOne310,packedOne310,PACKED_ONE_310_LEN,true);
   }
   

   protected short checkPackedOne310MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPackedOne310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPackedOne310() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPackedOne310,PACKED_ONE_310_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("packedOne310", beginPackedOne310,PACKED_ONE_310_LEN);
     }
   	}
     int localZonedTwentyeight310Counter = -1;
     public boolean isZonedTwentyeight310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZonedTwentyeight310Counter != sharedCounter;
         localZonedTwentyeight310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of zonedTwentyeight310
	 *	@return zonedTwentyeight310
	 */
	public char[]  getZonedTwentyeight310String() {
	     return getCharArray(beginZonedTwentyeight310,ZONED_TWENTYEIGHT_310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zonedTwentyeight310IsNumeric() {
	    return isNumeric(beginZonedTwentyeight310
	                    ,beginZonedTwentyeight310 + ZONED_TWENTYEIGHT_310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ZONED_TWENTYEIGHT_310_LEN = 2;
  	/**
	 * serializeZonedTwentyeight310
	 */
	protected void serializeZonedTwentyeight310(int zonedTwentyeight310) {
		 putNumber(beginZonedTwentyeight310,zonedTwentyeight310,ZONED_TWENTYEIGHT_310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localZonedTwentyeight310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeZonedTwentyeight310
	 */
   	protected  int serializeZonedTwentyeight310(char[] value) {
	    int  zonedTwentyeight310;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    zonedTwentyeight310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginZonedTwentyeight310
		       ,2
		      );
		 localZonedTwentyeight310Counter = shareString.getSerializedField().getModifiedCounter();
		return  zonedTwentyeight310;
    }

   protected int checkZonedTwentyeight310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshZonedTwentyeight310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZonedTwentyeight310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginZonedTwentyeight310
			                 ,ZONED_TWENTYEIGHT_310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("zonedTwentyeight310", beginZonedTwentyeight310,ZONED_TWENTYEIGHT_310_LEN);
    }
   	}
     int localZonedTwentynine310Counter = -1;
     public boolean isZonedTwentynine310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZonedTwentynine310Counter != sharedCounter;
         localZonedTwentynine310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of zonedTwentynine310
	 *	@return zonedTwentynine310
	 */
	public char[]  getZonedTwentynine310String() {
	     return getCharArray(beginZonedTwentynine310,ZONED_TWENTYNINE_310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zonedTwentynine310IsNumeric() {
	    return isNumeric(beginZonedTwentynine310
	                    ,beginZonedTwentynine310 + ZONED_TWENTYNINE_310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ZONED_TWENTYNINE_310_LEN = 2;
  	/**
	 * serializeZonedTwentynine310
	 */
	protected void serializeZonedTwentynine310(int zonedTwentynine310) {
		 putNumber(beginZonedTwentynine310,zonedTwentynine310,ZONED_TWENTYNINE_310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localZonedTwentynine310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeZonedTwentynine310
	 */
   	protected  int serializeZonedTwentynine310(char[] value) {
	    int  zonedTwentynine310;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    zonedTwentynine310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginZonedTwentynine310
		       ,2
		      );
		 localZonedTwentynine310Counter = shareString.getSerializedField().getModifiedCounter();
		return  zonedTwentynine310;
    }

   protected int checkZonedTwentynine310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshZonedTwentynine310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZonedTwentynine310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginZonedTwentynine310
			                 ,ZONED_TWENTYNINE_310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("zonedTwentynine310", beginZonedTwentynine310,ZONED_TWENTYNINE_310_LEN);
    }
   	}
     int localZoned0080310Counter = -1;
     public boolean isZoned0080310Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZoned0080310Counter != sharedCounter;
         localZoned0080310Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of zoned0080310
	 *	@return zoned0080310
	 */
	public char[]  getZoned0080310String() {
	     return getCharArray(beginZoned0080310,ZONED_0080310_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zoned0080310IsNumeric() {
	    return isNumeric(beginZoned0080310
	                    ,beginZoned0080310 + ZONED_0080310_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ZONED_0080310_LEN = 4;
  	/**
	 * serializeZoned0080310
	 */
	protected void serializeZoned0080310(int zoned0080310) {
		 putNumber(beginZoned0080310,zoned0080310,ZONED_0080310_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localZoned0080310Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeZoned0080310
	 */
   	protected  int serializeZoned0080310(char[] value) {
	    int  zoned0080310;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    zoned0080310 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginZoned0080310
		       ,4
		      );
		 localZoned0080310Counter = shareString.getSerializedField().getModifiedCounter();
		return  zoned0080310;
    }

   protected int checkZoned0080310MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshZoned0080310 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZoned0080310() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginZoned0080310
			                 ,ZONED_0080310_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("zoned0080310", beginZoned0080310,ZONED_0080310_LEN);
    }
   	}
         int localSqlSuccess330Counter = -1;
         public boolean isSqlSuccess330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlSuccess330Counter != sharedCounter;
            localSqlSuccess330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlSuccess330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlRowNotFound330Counter = -1;
         public boolean isSqlRowNotFound330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlRowNotFound330Counter != sharedCounter;
            localSqlRowNotFound330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlRowNotFound330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlCursorNotOpen330Counter = -1;
         public boolean isSqlCursorNotOpen330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlCursorNotOpen330Counter != sharedCounter;
            localSqlCursorNotOpen330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlCursorNotOpen330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlRowDuplicate330Counter = -1;
         public boolean isSqlRowDuplicate330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlRowDuplicate330Counter != sharedCounter;
            localSqlRowDuplicate330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlRowDuplicate330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlResourceUnavail330Counter = -1;
         public boolean isSqlResourceUnavail330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlResourceUnavail330Counter != sharedCounter;
            localSqlResourceUnavail330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlResourceUnavail330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlResourceLimit330Counter = -1;
         public boolean isSqlResourceLimit330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlResourceLimit330Counter != sharedCounter;
            localSqlResourceLimit330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlResourceLimit330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlWorkunitRollback330Counter = -1;
         public boolean isSqlWorkunitRollback330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlWorkunitRollback330Counter != sharedCounter;
            localSqlWorkunitRollback330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlWorkunitRollback330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlExecUnsuccessful330Counter = -1;
         public boolean isSqlExecUnsuccessful330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlExecUnsuccessful330Counter != sharedCounter;
            localSqlExecUnsuccessful330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlExecUnsuccessful330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlColUsed330Counter = -1;
         public boolean isSqlColUsed330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlColUsed330Counter != sharedCounter;
            localSqlColUsed330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlColUsed330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlColNull330Counter = -1;
         public boolean isSqlColNull330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlColNull330Counter != sharedCounter;
            localSqlColNull330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlColNull330MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSqlSqlerrd3Deadlock330Counter = -1;
         public boolean isSqlSqlerrd3Deadlock330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlSqlerrd3Deadlock330Counter != sharedCounter;
            localSqlSqlerrd3Deadlock330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSqlSqlerrd3Deadlock330MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSqlSqlerrd3Timeout330Counter = -1;
         public boolean isSqlSqlerrd3Timeout330Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlSqlerrd3Timeout330Counter != sharedCounter;
            localSqlSqlerrd3Timeout330Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSqlSqlerrd3Timeout330MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localMaximumCyl360Counter = -1;
     public boolean isMaximumCyl360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaximumCyl360Counter != sharedCounter;
         localMaximumCyl360Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maximumCyl360
	 *	@return maximumCyl360
	 */
	public char[]  getMaximumCyl360String() {
	     return getCharArray(beginMaximumCyl360,MAXIMUM_CYL_360_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maximumCyl360IsNumeric() {
	    return isNumeric(beginMaximumCyl360
	                    ,beginMaximumCyl360 + MAXIMUM_CYL_360_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAXIMUM_CYL_360_LEN = 11;
  	/**
	 * serializeMaximumCyl360
	 */
	protected void serializeMaximumCyl360(long maximumCyl360) {
		 putNumber(beginMaximumCyl360,maximumCyl360,MAXIMUM_CYL_360_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaximumCyl360Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaximumCyl360
	 */
   	protected  long serializeMaximumCyl360(char[] value) {
	    long  maximumCyl360;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maximumCyl360 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMaximumCyl360
		       ,11
		      );
		 localMaximumCyl360Counter = shareString.getSerializedField().getModifiedCounter();
		return  maximumCyl360;
    }

   protected long checkMaximumCyl360MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaximumCyl360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaximumCyl360() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaximumCyl360
			                 ,MAXIMUM_CYL_360_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maximumCyl360", beginMaximumCyl360,MAXIMUM_CYL_360_LEN);
    }
   	}
     int localMaximumTrk360Counter = -1;
     public boolean isMaximumTrk360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaximumTrk360Counter != sharedCounter;
         localMaximumTrk360Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maximumTrk360
	 *	@return maximumTrk360
	 */
	public char[]  getMaximumTrk360String() {
	     return getCharArray(beginMaximumTrk360,MAXIMUM_TRK_360_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maximumTrk360IsNumeric() {
	    return isNumeric(beginMaximumTrk360
	                    ,beginMaximumTrk360 + MAXIMUM_TRK_360_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAXIMUM_TRK_360_LEN = 11;
  	/**
	 * serializeMaximumTrk360
	 */
	protected void serializeMaximumTrk360(long maximumTrk360) {
		 putNumber(beginMaximumTrk360,maximumTrk360,MAXIMUM_TRK_360_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaximumTrk360Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaximumTrk360
	 */
   	protected  long serializeMaximumTrk360(char[] value) {
	    long  maximumTrk360;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maximumTrk360 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMaximumTrk360
		       ,11
		      );
		 localMaximumTrk360Counter = shareString.getSerializedField().getModifiedCounter();
		return  maximumTrk360;
    }

   protected long checkMaximumTrk360MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaximumTrk360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaximumTrk360() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaximumTrk360
			                 ,MAXIMUM_TRK_360_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maximumTrk360", beginMaximumTrk360,MAXIMUM_TRK_360_LEN);
    }
   	}
     int localMaximumBlk360Counter = -1;
     public boolean isMaximumBlk360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaximumBlk360Counter != sharedCounter;
         localMaximumBlk360Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maximumBlk360
	 *	@return maximumBlk360
	 */
	public char[]  getMaximumBlk360String() {
	     return getCharArray(beginMaximumBlk360,MAXIMUM_BLK_360_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maximumBlk360IsNumeric() {
	    return isNumeric(beginMaximumBlk360
	                    ,beginMaximumBlk360 + MAXIMUM_BLK_360_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAXIMUM_BLK_360_LEN = 11;
  	/**
	 * serializeMaximumBlk360
	 */
	protected void serializeMaximumBlk360(long maximumBlk360) {
		 putNumber(beginMaximumBlk360,maximumBlk360,MAXIMUM_BLK_360_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaximumBlk360Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaximumBlk360
	 */
   	protected  long serializeMaximumBlk360(char[] value) {
	    long  maximumBlk360;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maximumBlk360 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMaximumBlk360
		       ,11
		      );
		 localMaximumBlk360Counter = shareString.getSerializedField().getModifiedCounter();
		return  maximumBlk360;
    }

   protected long checkMaximumBlk360MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaximumBlk360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaximumBlk360() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaximumBlk360
			                 ,MAXIMUM_BLK_360_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maximumBlk360", beginMaximumBlk360,MAXIMUM_BLK_360_LEN);
    }
   	}
     int localMaximumCylDeflt360Counter = -1;
     public boolean isMaximumCylDeflt360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaximumCylDeflt360Counter != sharedCounter;
         localMaximumCylDeflt360Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maximumCylDeflt360
	 *	@return maximumCylDeflt360
	 */
	public char[]  getMaximumCylDeflt360String() {
	     return getCharArray(beginMaximumCylDeflt360,MAXIMUM_CYL_DEFLT_360_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maximumCylDeflt360IsNumeric() {
	    return isNumeric(beginMaximumCylDeflt360
	                    ,beginMaximumCylDeflt360 + MAXIMUM_CYL_DEFLT_360_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAXIMUM_CYL_DEFLT_360_LEN = 11;
  	/**
	 * serializeMaximumCylDeflt360
	 */
	protected void serializeMaximumCylDeflt360(long maximumCylDeflt360) {
		 putNumber(beginMaximumCylDeflt360,maximumCylDeflt360,MAXIMUM_CYL_DEFLT_360_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaximumCylDeflt360Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaximumCylDeflt360
	 */
   	protected  long serializeMaximumCylDeflt360(char[] value) {
	    long  maximumCylDeflt360;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maximumCylDeflt360 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMaximumCylDeflt360
		       ,11
		      );
		 localMaximumCylDeflt360Counter = shareString.getSerializedField().getModifiedCounter();
		return  maximumCylDeflt360;
    }

   protected long checkMaximumCylDeflt360MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaximumCylDeflt360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaximumCylDeflt360() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaximumCylDeflt360
			                 ,MAXIMUM_CYL_DEFLT_360_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maximumCylDeflt360", beginMaximumCylDeflt360,MAXIMUM_CYL_DEFLT_360_LEN);
    }
   	}
     int localMaximumTrkDeflt360Counter = -1;
     public boolean isMaximumTrkDeflt360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaximumTrkDeflt360Counter != sharedCounter;
         localMaximumTrkDeflt360Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maximumTrkDeflt360
	 *	@return maximumTrkDeflt360
	 */
	public char[]  getMaximumTrkDeflt360String() {
	     return getCharArray(beginMaximumTrkDeflt360,MAXIMUM_TRK_DEFLT_360_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maximumTrkDeflt360IsNumeric() {
	    return isNumeric(beginMaximumTrkDeflt360
	                    ,beginMaximumTrkDeflt360 + MAXIMUM_TRK_DEFLT_360_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAXIMUM_TRK_DEFLT_360_LEN = 11;
  	/**
	 * serializeMaximumTrkDeflt360
	 */
	protected void serializeMaximumTrkDeflt360(long maximumTrkDeflt360) {
		 putNumber(beginMaximumTrkDeflt360,maximumTrkDeflt360,MAXIMUM_TRK_DEFLT_360_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaximumTrkDeflt360Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaximumTrkDeflt360
	 */
   	protected  long serializeMaximumTrkDeflt360(char[] value) {
	    long  maximumTrkDeflt360;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maximumTrkDeflt360 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMaximumTrkDeflt360
		       ,11
		      );
		 localMaximumTrkDeflt360Counter = shareString.getSerializedField().getModifiedCounter();
		return  maximumTrkDeflt360;
    }

   protected long checkMaximumTrkDeflt360MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaximumTrkDeflt360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaximumTrkDeflt360() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaximumTrkDeflt360
			                 ,MAXIMUM_TRK_DEFLT_360_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maximumTrkDeflt360", beginMaximumTrkDeflt360,MAXIMUM_TRK_DEFLT_360_LEN);
    }
   	}
     int localMaximumBlkDeflt360Counter = -1;
     public boolean isMaximumBlkDeflt360Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaximumBlkDeflt360Counter != sharedCounter;
         localMaximumBlkDeflt360Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maximumBlkDeflt360
	 *	@return maximumBlkDeflt360
	 */
	public char[]  getMaximumBlkDeflt360String() {
	     return getCharArray(beginMaximumBlkDeflt360,MAXIMUM_BLK_DEFLT_360_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maximumBlkDeflt360IsNumeric() {
	    return isNumeric(beginMaximumBlkDeflt360
	                    ,beginMaximumBlkDeflt360 + MAXIMUM_BLK_DEFLT_360_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAXIMUM_BLK_DEFLT_360_LEN = 11;
  	/**
	 * serializeMaximumBlkDeflt360
	 */
	protected void serializeMaximumBlkDeflt360(long maximumBlkDeflt360) {
		 putNumber(beginMaximumBlkDeflt360,maximumBlkDeflt360,MAXIMUM_BLK_DEFLT_360_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaximumBlkDeflt360Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaximumBlkDeflt360
	 */
   	protected  long serializeMaximumBlkDeflt360(char[] value) {
	    long  maximumBlkDeflt360;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maximumBlkDeflt360 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginMaximumBlkDeflt360
		       ,11
		      );
		 localMaximumBlkDeflt360Counter = shareString.getSerializedField().getModifiedCounter();
		return  maximumBlkDeflt360;
    }

   protected long checkMaximumBlkDeflt360MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaximumBlkDeflt360 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMaximumBlkDeflt360() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMaximumBlkDeflt360
			                 ,MAXIMUM_BLK_DEFLT_360_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maximumBlkDeflt360", beginMaximumBlkDeflt360,MAXIMUM_BLK_DEFLT_360_LEN);
    }
   	}
         int localSourceRecords400Counter = -1;
         public boolean isSourceRecords400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSourceRecords400Counter != sharedCounter;
            localSourceRecords400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSourceRecords400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSourceBytes400Counter = -1;
         public boolean isSourceBytes400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSourceBytes400Counter != sharedCounter;
            localSourceBytes400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkSourceBytes400MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localHeaderRecords400Counter = -1;
         public boolean isHeaderRecords400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHeaderRecords400Counter != sharedCounter;
            localHeaderRecords400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkHeaderRecords400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localHeaderBytes400Counter = -1;
         public boolean isHeaderBytes400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHeaderBytes400Counter != sharedCounter;
            localHeaderBytes400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkHeaderBytes400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTargetRecords400Counter = -1;
         public boolean isTargetRecords400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTargetRecords400Counter != sharedCounter;
            localTargetRecords400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTargetRecords400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTargetBytes400Counter = -1;
         public boolean isTargetBytes400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTargetBytes400Counter != sharedCounter;
            localTargetBytes400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkTargetBytes400MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localEndpointsValid400Counter = -1;
         public boolean isEndpointsValid400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEndpointsValid400Counter != sharedCounter;
            localEndpointsValid400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkEndpointsValid400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localEndpointsError400Counter = -1;
         public boolean isEndpointsError400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEndpointsError400Counter != sharedCounter;
            localEndpointsError400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkEndpointsError400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localEndpointsListed400Counter = -1;
         public boolean isEndpointsListed400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEndpointsListed400Counter != sharedCounter;
            localEndpointsListed400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkEndpointsListed400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localAllocateAttempts400Counter = -1;
         public boolean isAllocateAttempts400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAllocateAttempts400Counter != sharedCounter;
            localAllocateAttempts400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkAllocateAttempts400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localSqlRetryAttempts400Counter = -1;
         public boolean isSqlRetryAttempts400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlRetryAttempts400Counter != sharedCounter;
            localSqlRetryAttempts400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSqlRetryAttempts400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localRequest410Counter = -1;
        public boolean isRequest410Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRequest410Counter != sharedCounter;
           localRequest410Counter = sharedCounter; return hasModified; 
        }
	    public boolean request410IsNumeric() {
	      return decimalIsNumeric(beginRequest410,REQUEST_410_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int REQUEST_410_LEN = 5;
  	/**
	 * 	serializeRequest410
	 */
	protected void serializeRequest410(int request410) {
		   putDecimal(beginRequest410,request410,REQUEST_410_LEN,true);
   }
   

   protected int checkRequest410MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRequest410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRequest410() throws CFException {	
   	try { 
		 return (getIntDecimal(beginRequest410,REQUEST_410_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("request410", beginRequest410,REQUEST_410_LEN);
     }
   	}
        int localError410Counter = -1;
        public boolean isError410Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localError410Counter != sharedCounter;
           localError410Counter = sharedCounter; return hasModified; 
        }
	    public boolean error410IsNumeric() {
	      return decimalIsNumeric(beginError410,ERROR_410_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int ERROR_410_LEN = 2;
  	/**
	 * 	serializeError410
	 */
	protected void serializeError410(short error410) {
		   putDecimal(beginError410,error410,ERROR_410_LEN,true);
   }
   

   protected short checkError410MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshError410 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshError410() throws CFException {	
   	try { 
		 return (getShortDecimal(beginError410,ERROR_410_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("error410", beginError410,ERROR_410_LEN);
     }
   	}
     int localResultStartMsg603Counter = -1;
     public boolean isResultStartMsg603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultStartMsg603Counter != sharedCounter;
         localResultStartMsg603Counter = sharedCounter; return hasModified;
     }

   protected char[] checkResultStartMsg603Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
     int localResultEndMsg603Counter = -1;
     public boolean isResultEndMsg603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultEndMsg603Counter != sharedCounter;
         localResultEndMsg603Counter = sharedCounter; return hasModified;
     }

   protected char[] checkResultEndMsg603Constraints(char[] value) {
   			return super.checkConstraints(value , 34 ,false, false);
   }
     int localPendedMsg605Counter = -1;
     public boolean isPendedMsg605Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPendedMsg605Counter != sharedCounter;
         localPendedMsg605Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPendedMsg605Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localSetupProblemCurrMsg606Counter = -1;
     public boolean isSetupProblemCurrMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemCurrMsg606Counter != sharedCounter;
         localSetupProblemCurrMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemCurrMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemOrigMsg606Counter = -1;
     public boolean isSetupProblemOrigMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemOrigMsg606Counter != sharedCounter;
         localSetupProblemOrigMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemOrigMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemBkupMsg606Counter = -1;
     public boolean isSetupProblemBkupMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemBkupMsg606Counter != sharedCounter;
         localSetupProblemBkupMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemBkupMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemSwMsg606Counter = -1;
     public boolean isSetupProblemSwMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemSwMsg606Counter != sharedCounter;
         localSetupProblemSwMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemSwMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemBulkMsg606Counter = -1;
     public boolean isSetupProblemBulkMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemBulkMsg606Counter != sharedCounter;
         localSetupProblemBulkMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemBulkMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemXferMsg606Counter = -1;
     public boolean isSetupProblemXferMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemXferMsg606Counter != sharedCounter;
         localSetupProblemXferMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemXferMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemCyclMsg606Counter = -1;
     public boolean isSetupProblemCyclMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemCyclMsg606Counter != sharedCounter;
         localSetupProblemCyclMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemCyclMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSetupProblemSeqMsg606Counter = -1;
     public boolean isSetupProblemSeqMsg606Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSetupProblemSeqMsg606Counter != sharedCounter;
         localSetupProblemSeqMsg606Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSetupProblemSeqMsg606Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localFtssFileNameMsg607Counter = -1;
     public boolean isFtssFileNameMsg607Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFtssFileNameMsg607Counter != sharedCounter;
         localFtssFileNameMsg607Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFtssFileNameMsg607Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localCopySuccessGft608Counter = -1;
     public boolean isCopySuccessGft608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopySuccessGft608Counter != sharedCounter;
         localCopySuccessGft608Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopySuccessGft608Constraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
     int localCopySuccessAppl608Counter = -1;
     public boolean isCopySuccessAppl608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopySuccessAppl608Counter != sharedCounter;
         localCopySuccessAppl608Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopySuccessAppl608Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
     int localRenameSuccess608Counter = -1;
     public boolean isRenameSuccess608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameSuccess608Counter != sharedCounter;
         localRenameSuccess608Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRenameSuccess608Constraints(char[] value) {
   			return super.checkConstraints(value , 68 ,false, false);
   }
     int localRenameOldMsg608Counter = -1;
     public boolean isRenameOldMsg608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameOldMsg608Counter != sharedCounter;
         localRenameOldMsg608Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRenameOldMsg608Constraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
     int localRenameNewMsg608Counter = -1;
     public boolean isRenameNewMsg608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameNewMsg608Counter != sharedCounter;
         localRenameNewMsg608Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRenameNewMsg608Constraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
     int localWarningText609Counter = -1;
     public boolean isWarningText609Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWarningText609Counter != sharedCounter;
         localWarningText609Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWarningText609Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
     int localCopybookErrorMsg610Counter = -1;
     public boolean isCopybookErrorMsg610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybookErrorMsg610Counter != sharedCounter;
         localCopybookErrorMsg610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopybookErrorMsg610Constraints(char[] value) {
   			return super.checkConstraints(value , 53 ,false, false);
   }
     int localCopybookProgramIdMsg610Counter = -1;
     public boolean isCopybookProgramIdMsg610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybookProgramIdMsg610Counter != sharedCounter;
         localCopybookProgramIdMsg610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopybookProgramIdMsg610Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localCopybookVersionIdMsg610Counter = -1;
     public boolean isCopybookVersionIdMsg610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybookVersionIdMsg610Counter != sharedCounter;
         localCopybookVersionIdMsg610Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopybookVersionIdMsg610Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localParameterErrorMsg611Counter = -1;
     public boolean isParameterErrorMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParameterErrorMsg611Counter != sharedCounter;
         localParameterErrorMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkParameterErrorMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
     int localFunctionRequestMsg611Counter = -1;
     public boolean isFunctionRequestMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFunctionRequestMsg611Counter != sharedCounter;
         localFunctionRequestMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFunctionRequestMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localBulkIdMsg611Counter = -1;
     public boolean isBulkIdMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBulkIdMsg611Counter != sharedCounter;
         localBulkIdMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBulkIdMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localEndptIdMsg611Counter = -1;
     public boolean isEndptIdMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndptIdMsg611Counter != sharedCounter;
         localEndptIdMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEndptIdMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localDeleteIndMsg611Counter = -1;
     public boolean isDeleteIndMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeleteIndMsg611Counter != sharedCounter;
         localDeleteIndMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDeleteIndMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localCyclNumMsg611Counter = -1;
     public boolean isCyclNumMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCyclNumMsg611Counter != sharedCounter;
         localCyclNumMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCyclNumMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localListBroadcastDdMsg611Counter = -1;
     public boolean isListBroadcastDdMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localListBroadcastDdMsg611Counter != sharedCounter;
         localListBroadcastDdMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkListBroadcastDdMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localApplicationDsnMsg611Counter = -1;
     public boolean isApplicationDsnMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplicationDsnMsg611Counter != sharedCounter;
         localApplicationDsnMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkApplicationDsnMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localGftRetrieveDsnMsg611Counter = -1;
     public boolean isGftRetrieveDsnMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftRetrieveDsnMsg611Counter != sharedCounter;
         localGftRetrieveDsnMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkGftRetrieveDsnMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localBroadcastResultMsg611Counter = -1;
     public boolean isBroadcastResultMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastResultMsg611Counter != sharedCounter;
         localBroadcastResultMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBroadcastResultMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localProcDateMsg611Counter = -1;
     public boolean isProcDateMsg611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDateMsg611Counter != sharedCounter;
         localProcDateMsg611Counter = sharedCounter; return hasModified;
     }

   protected char[] checkProcDateMsg611Constraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localAssignLogicError619Counter = -1;
     public boolean isAssignLogicError619Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAssignLogicError619Counter != sharedCounter;
         localAssignLogicError619Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAssignLogicError619Constraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
     int localControlParmMsg620Counter = -1;
     public boolean isControlParmMsg620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localControlParmMsg620Counter != sharedCounter;
         localControlParmMsg620Counter = sharedCounter; return hasModified;
     }

   protected char[] checkControlParmMsg620Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
     int localControlColsMsg620Counter = -1;
     public boolean isControlColsMsg620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localControlColsMsg620Counter != sharedCounter;
         localControlColsMsg620Counter = sharedCounter; return hasModified;
     }

   protected char[] checkControlColsMsg620Constraints(char[] value) {
   			return super.checkConstraints(value , 104 ,false, false);
   }
     int localControlInfoMsg620Counter = -1;
     public boolean isControlInfoMsg620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localControlInfoMsg620Counter != sharedCounter;
         localControlInfoMsg620Counter = sharedCounter; return hasModified;
     }

   protected char[] checkControlInfoMsg620Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
     int localControlDbid620Counter = -1;
     public boolean isControlDbid620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localControlDbid620Counter != sharedCounter;
         localControlDbid620Counter = sharedCounter; return hasModified;
     }

   protected char[] checkControlDbid620Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localControlDbpkg620Counter = -1;
     public boolean isControlDbpkg620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localControlDbpkg620Counter != sharedCounter;
         localControlDbpkg620Counter = sharedCounter; return hasModified;
     }

   protected char[] checkControlDbpkg620Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localControlHlqid620Counter = -1;
     public boolean isControlHlqid620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localControlHlqid620Counter != sharedCounter;
         localControlHlqid620Counter = sharedCounter; return hasModified;
     }

   protected char[] checkControlHlqid620Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localSqlErrorMsg640Counter = -1;
     public boolean isSqlErrorMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlErrorMsg640Counter != sharedCounter;
         localSqlErrorMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlErrorMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
     int localSqlMnfrmFileNamMsg640Counter = -1;
     public boolean isSqlMnfrmFileNamMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlMnfrmFileNamMsg640Counter != sharedCounter;
         localSqlMnfrmFileNamMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlMnfrmFileNamMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
     int localSqlBulkIdMsg640Counter = -1;
     public boolean isSqlBulkIdMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlBulkIdMsg640Counter != sharedCounter;
         localSqlBulkIdMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlBulkIdMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
     int localSqlEndptIdMsg640Counter = -1;
     public boolean isSqlEndptIdMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlEndptIdMsg640Counter != sharedCounter;
         localSqlEndptIdMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlEndptIdMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localSqlStatCdMsg640Counter = -1;
     public boolean isSqlStatCdMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlStatCdMsg640Counter != sharedCounter;
         localSqlStatCdMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlStatCdMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
     int localSqlApplExitNamMsg640Counter = -1;
     public boolean isSqlApplExitNamMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlApplExitNamMsg640Counter != sharedCounter;
         localSqlApplExitNamMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlApplExitNamMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
     int localSqlCyclNumMsg640Counter = -1;
     public boolean isSqlCyclNumMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlCyclNumMsg640Counter != sharedCounter;
         localSqlCyclNumMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlCyclNumMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localSqlCyclNumLoMsg640Counter = -1;
     public boolean isSqlCyclNumLoMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlCyclNumLoMsg640Counter != sharedCounter;
         localSqlCyclNumLoMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlCyclNumLoMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
     int localSqlCyclNumHiMsg640Counter = -1;
     public boolean isSqlCyclNumHiMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlCyclNumHiMsg640Counter != sharedCounter;
         localSqlCyclNumHiMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlCyclNumHiMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
     int localSqlLstUpdtUserIdMsg640Counter = -1;
     public boolean isSqlLstUpdtUserIdMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlLstUpdtUserIdMsg640Counter != sharedCounter;
         localSqlLstUpdtUserIdMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlLstUpdtUserIdMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localSqlLstUpdtTsMsg640Counter = -1;
     public boolean isSqlLstUpdtTsMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlLstUpdtTsMsg640Counter != sharedCounter;
         localSqlLstUpdtTsMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlLstUpdtTsMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
     int localSqlBdioTxtMsg640Counter = -1;
     public boolean isSqlBdioTxtMsg640Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlBdioTxtMsg640Counter != sharedCounter;
         localSqlBdioTxtMsg640Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlBdioTxtMsg640Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localTarafplNotfndMsg641Counter = -1;
     public boolean isTarafplNotfndMsg641Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplNotfndMsg641Counter != sharedCounter;
         localTarafplNotfndMsg641Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafplNotfndMsg641Constraints(char[] value) {
   			return super.checkConstraints(value , 46 ,false, false);
   }
     int localTarafplSelectMsg641Counter = -1;
     public boolean isTarafplSelectMsg641Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafplSelectMsg641Counter != sharedCounter;
         localTarafplSelectMsg641Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafplSelectMsg641Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTarafxsNotfndMsg642Counter = -1;
     public boolean isTarafxsNotfndMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsNotfndMsg642Counter != sharedCounter;
         localTarafxsNotfndMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsNotfndMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 46 ,false, false);
   }
     int localTarafxsSelectMsg642Counter = -1;
     public boolean isTarafxsSelectMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsSelectMsg642Counter != sharedCounter;
         localTarafxsSelectMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsSelectMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTarafxsUpdateMsg642Counter = -1;
     public boolean isTarafxsUpdateMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsUpdateMsg642Counter != sharedCounter;
         localTarafxsUpdateMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsUpdateMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
     int localTarafxsInsertMsg642Counter = -1;
     public boolean isTarafxsInsertMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsInsertMsg642Counter != sharedCounter;
         localTarafxsInsertMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsInsertMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
     int localTarafxsNostatMsg642Counter = -1;
     public boolean isTarafxsNostatMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsNostatMsg642Counter != sharedCounter;
         localTarafxsNostatMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsNostatMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 53 ,false, false);
   }
     int localTarafxsCountMsg642Counter = -1;
     public boolean isTarafxsCountMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsCountMsg642Counter != sharedCounter;
         localTarafxsCountMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsCountMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTarafxsExitMsg642Counter = -1;
     public boolean isTarafxsExitMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsExitMsg642Counter != sharedCounter;
         localTarafxsExitMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsExitMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
     int localTarafxsOpenMsg642Counter = -1;
     public boolean isTarafxsOpenMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsOpenMsg642Counter != sharedCounter;
         localTarafxsOpenMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsOpenMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localTarafxsFetchMsg642Counter = -1;
     public boolean isTarafxsFetchMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsFetchMsg642Counter != sharedCounter;
         localTarafxsFetchMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsFetchMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTarafxsCloseMsg642Counter = -1;
     public boolean isTarafxsCloseMsg642Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxsCloseMsg642Counter != sharedCounter;
         localTarafxsCloseMsg642Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxsCloseMsg642Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTarafxaNotfndMsg643Counter = -1;
     public boolean isTarafxaNotfndMsg643Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaNotfndMsg643Counter != sharedCounter;
         localTarafxaNotfndMsg643Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxaNotfndMsg643Constraints(char[] value) {
   			return super.checkConstraints(value , 46 ,false, false);
   }
     int localTarafxaOpenMsg643Counter = -1;
     public boolean isTarafxaOpenMsg643Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaOpenMsg643Counter != sharedCounter;
         localTarafxaOpenMsg643Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxaOpenMsg643Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localTarafxaFetchMsg643Counter = -1;
     public boolean isTarafxaFetchMsg643Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaFetchMsg643Counter != sharedCounter;
         localTarafxaFetchMsg643Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxaFetchMsg643Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTarafxaCloseMsg643Counter = -1;
     public boolean isTarafxaCloseMsg643Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarafxaCloseMsg643Counter != sharedCounter;
         localTarafxaCloseMsg643Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarafxaCloseMsg643Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTaraefpNotfndMsg644Counter = -1;
     public boolean isTaraefpNotfndMsg644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpNotfndMsg644Counter != sharedCounter;
         localTaraefpNotfndMsg644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraefpNotfndMsg644Constraints(char[] value) {
   			return super.checkConstraints(value , 46 ,false, false);
   }
     int localTaraefpOpenMsg644Counter = -1;
     public boolean isTaraefpOpenMsg644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpOpenMsg644Counter != sharedCounter;
         localTaraefpOpenMsg644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraefpOpenMsg644Constraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
     int localTaraefpFetchMsg644Counter = -1;
     public boolean isTaraefpFetchMsg644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpFetchMsg644Counter != sharedCounter;
         localTaraefpFetchMsg644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraefpFetchMsg644Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTaraefpCloseMsg644Counter = -1;
     public boolean isTaraefpCloseMsg644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpCloseMsg644Counter != sharedCounter;
         localTaraefpCloseMsg644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraefpCloseMsg644Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTaraefpSelectMsg644Counter = -1;
     public boolean isTaraefpSelectMsg644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpSelectMsg644Counter != sharedCounter;
         localTaraefpSelectMsg644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraefpSelectMsg644Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTaraefpBackupMsg644Counter = -1;
     public boolean isTaraefpBackupMsg644Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraefpBackupMsg644Counter != sharedCounter;
         localTaraefpBackupMsg644Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraefpBackupMsg644Constraints(char[] value) {
   			return super.checkConstraints(value , 53 ,false, false);
   }
     int localTaraeptNotfnd645Counter = -1;
     public boolean isTaraeptNotfnd645Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptNotfnd645Counter != sharedCounter;
         localTaraeptNotfnd645Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraeptNotfnd645Constraints(char[] value) {
   			return super.checkConstraints(value , 46 ,false, false);
   }
     int localTaraeptSelectMsg645Counter = -1;
     public boolean isTaraeptSelectMsg645Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptSelectMsg645Counter != sharedCounter;
         localTaraeptSelectMsg645Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraeptSelectMsg645Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localTaraeptBackupMsg645Counter = -1;
     public boolean isTaraeptBackupMsg645Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptBackupMsg645Counter != sharedCounter;
         localTaraeptBackupMsg645Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraeptBackupMsg645Constraints(char[] value) {
   			return super.checkConstraints(value , 53 ,false, false);
   }
     int localTaraeptRouteMsg645Counter = -1;
     public boolean isTaraeptRouteMsg645Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaraeptRouteMsg645Counter != sharedCounter;
         localTaraeptRouteMsg645Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTaraeptRouteMsg645Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
     int localTarastsSelectMsg646Counter = -1;
     public boolean isTarastsSelectMsg646Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTarastsSelectMsg646Counter != sharedCounter;
         localTarastsSelectMsg646Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTarastsSelectMsg646Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localSqlcodeMsg647Counter = -1;
     public boolean isSqlcodeMsg647Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcodeMsg647Counter != sharedCounter;
         localSqlcodeMsg647Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlcodeMsg647Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
     int localDynamParmsMsg650Counter = -1;
     public boolean isDynamParmsMsg650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamParmsMsg650Counter != sharedCounter;
         localDynamParmsMsg650Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDynamParmsMsg650Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
     int localAr647OldDsnMsg661Counter = -1;
     public boolean isAr647OldDsnMsg661Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647OldDsnMsg661Counter != sharedCounter;
         localAr647OldDsnMsg661Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAr647OldDsnMsg661Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
     int localAr647NewDsnMsg661Counter = -1;
     public boolean isAr647NewDsnMsg661Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647NewDsnMsg661Counter != sharedCounter;
         localAr647NewDsnMsg661Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAr647NewDsnMsg661Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
     int localAr648ErrorMsg662Counter = -1;
     public boolean isAr648ErrorMsg662Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr648ErrorMsg662Counter != sharedCounter;
         localAr648ErrorMsg662Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAr648ErrorMsg662Constraints(char[] value) {
   			return super.checkConstraints(value , 53 ,false, false);
   }
     int localAr649ErrorMsg663Counter = -1;
     public boolean isAr649ErrorMsg663Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649ErrorMsg663Counter != sharedCounter;
         localAr649ErrorMsg663Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAr649ErrorMsg663Constraints(char[] value) {
   			return super.checkConstraints(value , 71 ,false, false);
   }
     int localSeqioErrorMsg670Counter = -1;
     public boolean isSeqioErrorMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioErrorMsg670Counter != sharedCounter;
         localSeqioErrorMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioErrorMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 52 ,false, false);
   }
     int localSeqioDdnameMsg670Counter = -1;
     public boolean isSeqioDdnameMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioDdnameMsg670Counter != sharedCounter;
         localSeqioDdnameMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioDdnameMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioRequestMsg670Counter = -1;
     public boolean isSeqioRequestMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioRequestMsg670Counter != sharedCounter;
         localSeqioRequestMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioRequestMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioSysidMsg670Counter = -1;
     public boolean isSeqioSysidMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioSysidMsg670Counter != sharedCounter;
         localSeqioSysidMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioSysidMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioApplidMsg670Counter = -1;
     public boolean isSeqioApplidMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioApplidMsg670Counter != sharedCounter;
         localSeqioApplidMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioApplidMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioDsnMsg670Counter = -1;
     public boolean isSeqioDsnMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioDsnMsg670Counter != sharedCounter;
         localSeqioDsnMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioDsnMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioTapserMsg670Counter = -1;
     public boolean isSeqioTapserMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioTapserMsg670Counter != sharedCounter;
         localSeqioTapserMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioTapserMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioVolserMsg670Counter = -1;
     public boolean isSeqioVolserMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioVolserMsg670Counter != sharedCounter;
         localSeqioVolserMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioVolserMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioLabelMsg670Counter = -1;
     public boolean isSeqioLabelMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioLabelMsg670Counter != sharedCounter;
         localSeqioLabelMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioLabelMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localSeqioRecfmMsg670Counter = -1;
     public boolean isSeqioRecfmMsg670Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqioRecfmMsg670Counter != sharedCounter;
         localSeqioRecfmMsg670Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqioRecfmMsg670Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
     int localCopyFailureGft680Counter = -1;
     public boolean isCopyFailureGft680Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyFailureGft680Counter != sharedCounter;
         localCopyFailureGft680Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopyFailureGft680Constraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
     int localCopyFailureAppl680Counter = -1;
     public boolean isCopyFailureAppl680Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyFailureAppl680Counter != sharedCounter;
         localCopyFailureAppl680Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopyFailureAppl680Constraints(char[] value) {
   			return super.checkConstraints(value , 47 ,false, false);
   }
     int localRenameFailure680Counter = -1;
     public boolean isRenameFailure680Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRenameFailure680Counter != sharedCounter;
         localRenameFailure680Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRenameFailure680Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
     int localCopyCountsMsg680Counter = -1;
     public boolean isCopyCountsMsg680Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyCountsMsg680Counter != sharedCounter;
         localCopyCountsMsg680Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCopyCountsMsg680Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localInstallPostExitInfo680Counter = -1;
     public boolean isInstallPostExitInfo680Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInstallPostExitInfo680Counter != sharedCounter;
         localInstallPostExitInfo680Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInstallPostExitInfo680Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localErrorInfoMsg690Counter = -1;
     public boolean isErrorInfoMsg690Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorInfoMsg690Counter != sharedCounter;
         localErrorInfoMsg690Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorInfoMsg690Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localSeeSystsprtMsg690Counter = -1;
     public boolean isSeeSystsprtMsg690Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeeSystsprtMsg690Counter != sharedCounter;
         localSeeSystsprtMsg690Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeeSystsprtMsg690Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
     int localErrorConsMsg692Counter = -1;
     public boolean isErrorConsMsg692Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorConsMsg692Counter != sharedCounter;
         localErrorConsMsg692Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorConsMsg692Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localErrorConsMsgHdr692Counter = -1;
     public boolean isErrorConsMsgHdr692Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorConsMsgHdr692Counter != sharedCounter;
         localErrorConsMsgHdr692Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorConsMsgHdr692Constraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
     int localOmnibusAlertFlag820Counter = -1;
     public boolean isOmnibusAlertFlag820Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOmnibusAlertFlag820Counter != sharedCounter;
         localOmnibusAlertFlag820Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOmnibusAlertFlag820Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localStatRefId810Counter = -1;
     public boolean isStatRefId810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStatRefId810Counter != sharedCounter;
         localStatRefId810Counter = sharedCounter; return hasModified;
     }

   protected char[] checkStatRefId810Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localErrorResponse900Counter = -1;
     public boolean isErrorResponse900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorResponse900Counter != sharedCounter;
         localErrorResponse900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorResponse900Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localErrorMessage900Counter = -1;
     public boolean isErrorMessage900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorMessage900Counter != sharedCounter;
         localErrorMessage900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkErrorMessage900Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localMcinfoProgramIdCounter = -1;
     public boolean isMcinfoProgramIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoProgramIdCounter != sharedCounter;
         localMcinfoProgramIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMcinfoProgramIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localMcinfoReturnCodeCounter = -1;
         public boolean isMcinfoReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMcinfoReturnCodeCounter != sharedCounter;
            localMcinfoReturnCodeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkMcinfoReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localDb85102cDb2CafLoadDsnaliCounter = -1;
     public boolean isDb85102cDb2CafLoadDsnaliModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102cDb2CafLoadDsnaliCounter != sharedCounter;
         localDb85102cDb2CafLoadDsnaliCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDb85102cDb2CafLoadDsnaliConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localDb85102cDb2BatchErrorRtnCounter = -1;
     public boolean isDb85102cDb2BatchErrorRtnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102cDb2BatchErrorRtnCounter != sharedCounter;
         localDb85102cDb2BatchErrorRtnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDb85102cDb2BatchErrorRtnConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSqlTempCounter = -1;
     public boolean isSqlTempModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlTempCounter != sharedCounter;
         localSqlTempCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlTempConstraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }




}
  
