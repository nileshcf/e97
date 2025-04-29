package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class ParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMS_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmLength800;
            protected  int beginParmJobgroup800;
            protected  int beginParmJobgrpNum800;
            protected  int beginRetryCount800;
            protected  int beginLaunchType800;
            protected  int beginCommitCnt800;
            protected  int beginCloneOwnerId800;
            protected  int beginPreclearThrhdCnt800;
            protected  int beginDebugFlag800;
            protected  int beginPrcsAgrmntId800;
	
	/**
	* Constructor for ParmsSerialized
	**/
    public ParmsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmLength800 = getStartOffset() + 0;	// set offset for serialization
  
             beginParmJobgroup800 = getStartOffset() + 2;	// set offset for serialization
  
             beginParmJobgrpNum800 = getStartOffset() + 8;	// set offset for serialization
  
  
             beginRetryCount800 = getStartOffset() + 11;	// set offset for serialization
  
  
             beginLaunchType800 = getStartOffset() + 14;	// set offset for serialization
  
  
             beginCommitCnt800 = getStartOffset() + 16;	// set offset for serialization
  
  
             beginCloneOwnerId800 = getStartOffset() + 21;	// set offset for serialization
  
  
             beginPreclearThrhdCnt800 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginDebugFlag800 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginPrcsAgrmntId800 = getStartOffset() + 33;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParmLength800Counter = -1;
         public boolean isParmLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmLength800Counter != sharedCounter;
            localParmLength800Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_LENGTH_800_LEN = 2;
  	/**
	 * serializeParmLength800
	 */
	protected void serializeParmLength800(short parmLength800) {
           replaceValue( //  save the value as string
                   getBinaryString( parmLength800,PARM_LENGTH_800_LEN)
                  ,beginParmLength800
                  ,PARM_LENGTH_800_LEN
                 );
            localParmLength800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmLength800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmLength800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmLength800() {	 
			return (getShort(beginParmLength800));
   	}
     int localParmJobgroup800Counter = -1;
     public boolean isParmJobgroup800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmJobgroup800Counter != sharedCounter;
         localParmJobgroup800Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_JOBGROUP_800_LEN = 6;
	/**
	 * 	serialize this ParmJobgroup800
	 */
   protected void serializeParmJobgroup800(char[] parmJobgroup800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmJobgroup800,0,getStringValue(),beginParmJobgroup800,PARM_JOBGROUP_800_LEN);
       localParmJobgroup800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmJobgroup800Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshParmJobgroup800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmJobgroup800() {	 
   		return (substring(getStringValue(),beginParmJobgroup800,beginParmJobgroup800 + PARM_JOBGROUP_800_LEN));
   	}
     int localParmJobgrpNum800Counter = -1;
     public boolean isParmJobgrpNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmJobgrpNum800Counter != sharedCounter;
         localParmJobgrpNum800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public char[]  getParmJobgrpNum800String() {
	     return getCharArray(beginParmJobgrpNum800,PARM_JOBGRP_NUM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmJobgrpNum800IsNumeric() {
	    return isNumeric(beginParmJobgrpNum800
	                    ,beginParmJobgrpNum800 + PARM_JOBGRP_NUM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PARM_JOBGRP_NUM_800_LEN = 2;
  	/**
	 * serializeParmJobgrpNum800
	 */
	protected void serializeParmJobgrpNum800(int parmJobgrpNum800) {
		 putNumber(beginParmJobgrpNum800,parmJobgrpNum800,PARM_JOBGRP_NUM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localParmJobgrpNum800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeParmJobgrpNum800
	 */
   	protected  int serializeParmJobgrpNum800(char[] value) {
	    int  parmJobgrpNum800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    parmJobgrpNum800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginParmJobgrpNum800
		       ,2
		      );
		 localParmJobgrpNum800Counter = shareString.getSerializedField().getModifiedCounter();
		return  parmJobgrpNum800;
    }

   protected int checkParmJobgrpNum800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshParmJobgrpNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshParmJobgrpNum800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginParmJobgrpNum800
			                 ,PARM_JOBGRP_NUM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("parmJobgrpNum800", beginParmJobgrpNum800,PARM_JOBGRP_NUM_800_LEN);
    }
   	}
     int localRetryCount800Counter = -1;
     public boolean isRetryCount800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetryCount800Counter != sharedCounter;
         localRetryCount800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of retryCount800
	 *	@return retryCount800
	 */
	public char[]  getRetryCount800String() {
	     return getCharArray(beginRetryCount800,RETRY_COUNT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean retryCount800IsNumeric() {
	    return isNumeric(beginRetryCount800
	                    ,beginRetryCount800 + RETRY_COUNT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RETRY_COUNT_800_LEN = 2;
  	/**
	 * serializeRetryCount800
	 */
	protected void serializeRetryCount800(int retryCount800) {
		 putNumber(beginRetryCount800,retryCount800,RETRY_COUNT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRetryCount800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRetryCount800
	 */
   	protected  int serializeRetryCount800(char[] value) {
	    int  retryCount800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    retryCount800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRetryCount800
		       ,2
		      );
		 localRetryCount800Counter = shareString.getSerializedField().getModifiedCounter();
		return  retryCount800;
    }

   protected int checkRetryCount800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRetryCount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRetryCount800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRetryCount800
			                 ,RETRY_COUNT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("retryCount800", beginRetryCount800,RETRY_COUNT_800_LEN);
    }
   	}
     int localLaunchType800Counter = -1;
     public boolean isLaunchType800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLaunchType800Counter != sharedCounter;
         localLaunchType800Counter = sharedCounter; return hasModified;
     }
	protected static final int LAUNCH_TYPE_800_LEN = 1;
	/**
	 * 	serialize this LaunchType800
	 */
   protected void serializeLaunchType800(char[] launchType800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(launchType800,0,getStringValue(),beginLaunchType800,LAUNCH_TYPE_800_LEN);
       localLaunchType800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLaunchType800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLaunchType800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLaunchType800() {	 
   		return (substring(getStringValue(),beginLaunchType800,beginLaunchType800 + LAUNCH_TYPE_800_LEN));
   	}
     int localCommitCnt800Counter = -1;
     public boolean isCommitCnt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCommitCnt800Counter != sharedCounter;
         localCommitCnt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of commitCnt800
	 *	@return commitCnt800
	 */
	public char[]  getCommitCnt800String() {
	     return getCharArray(beginCommitCnt800,COMMIT_CNT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean commitCnt800IsNumeric() {
	    return isNumeric(beginCommitCnt800
	                    ,beginCommitCnt800 + COMMIT_CNT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMMIT_CNT_800_LEN = 4;
  	/**
	 * serializeCommitCnt800
	 */
	protected void serializeCommitCnt800(int commitCnt800) {
		 putNumber(beginCommitCnt800,commitCnt800,COMMIT_CNT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCommitCnt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCommitCnt800
	 */
   	protected  int serializeCommitCnt800(char[] value) {
	    int  commitCnt800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    commitCnt800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCommitCnt800
		       ,4
		      );
		 localCommitCnt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  commitCnt800;
    }

   protected int checkCommitCnt800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCommitCnt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCommitCnt800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCommitCnt800
			                 ,COMMIT_CNT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("commitCnt800", beginCommitCnt800,COMMIT_CNT_800_LEN);
    }
   	}
     int localCloneOwnerId800Counter = -1;
     public boolean isCloneOwnerId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloneOwnerId800Counter != sharedCounter;
         localCloneOwnerId800Counter = sharedCounter; return hasModified;
     }
	protected static final int CLONE_OWNER_ID_800_LEN = 3;
	/**
	 * 	serialize this CloneOwnerId800
	 */
   protected void serializeCloneOwnerId800(char[] cloneOwnerId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cloneOwnerId800,0,getStringValue(),beginCloneOwnerId800,CLONE_OWNER_ID_800_LEN);
       localCloneOwnerId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCloneOwnerId800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCloneOwnerId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCloneOwnerId800() {	 
   		return (substring(getStringValue(),beginCloneOwnerId800,beginCloneOwnerId800 + CLONE_OWNER_ID_800_LEN));
   	}
     int localPreclearThrhdCnt800Counter = -1;
     public boolean isPreclearThrhdCnt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPreclearThrhdCnt800Counter != sharedCounter;
         localPreclearThrhdCnt800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of preclearThrhdCnt800
	 *	@return preclearThrhdCnt800
	 */
	public char[]  getPreclearThrhdCnt800String() {
	     return getCharArray(beginPreclearThrhdCnt800,PRECLEAR_THRHD_CNT_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean preclearThrhdCnt800IsNumeric() {
	    return isNumeric(beginPreclearThrhdCnt800
	                    ,beginPreclearThrhdCnt800 + PRECLEAR_THRHD_CNT_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PRECLEAR_THRHD_CNT_800_LEN = 5;
  	/**
	 * serializePreclearThrhdCnt800
	 */
	protected void serializePreclearThrhdCnt800(long preclearThrhdCnt800) {
		 putNumber(beginPreclearThrhdCnt800,preclearThrhdCnt800,PRECLEAR_THRHD_CNT_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPreclearThrhdCnt800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePreclearThrhdCnt800
	 */
   	protected  long serializePreclearThrhdCnt800(char[] value) {
	    long  preclearThrhdCnt800;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    preclearThrhdCnt800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginPreclearThrhdCnt800
		       ,5
		      );
		 localPreclearThrhdCnt800Counter = shareString.getSerializedField().getModifiedCounter();
		return  preclearThrhdCnt800;
    }

   protected long checkPreclearThrhdCnt800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPreclearThrhdCnt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPreclearThrhdCnt800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPreclearThrhdCnt800
			                 ,PRECLEAR_THRHD_CNT_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("preclearThrhdCnt800", beginPreclearThrhdCnt800,PRECLEAR_THRHD_CNT_800_LEN);
    }
   	}
     int localDebugFlag800Counter = -1;
     public boolean isDebugFlag800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDebugFlag800Counter != sharedCounter;
         localDebugFlag800Counter = sharedCounter; return hasModified;
     }
	protected static final int DEBUG_FLAG_800_LEN = 1;
	/**
	 * 	serialize this DebugFlag800
	 */
   protected void serializeDebugFlag800(char[] debugFlag800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(debugFlag800,0,getStringValue(),beginDebugFlag800,DEBUG_FLAG_800_LEN);
       localDebugFlag800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDebugFlag800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDebugFlag800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDebugFlag800() {	 
   		return (substring(getStringValue(),beginDebugFlag800,beginDebugFlag800 + DEBUG_FLAG_800_LEN));
   	}
     int localPrcsAgrmntId800Counter = -1;
     public boolean isPrcsAgrmntId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrcsAgrmntId800Counter != sharedCounter;
         localPrcsAgrmntId800Counter = sharedCounter; return hasModified;
     }
	protected static final int PRCS_AGRMNT_ID_800_LEN = 11;
	/**
	 * 	serialize this PrcsAgrmntId800
	 */
   protected void serializePrcsAgrmntId800(char[] prcsAgrmntId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prcsAgrmntId800,0,getStringValue(),beginPrcsAgrmntId800,PRCS_AGRMNT_ID_800_LEN);
       localPrcsAgrmntId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrcsAgrmntId800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshPrcsAgrmntId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrcsAgrmntId800() {	 
   		return (substring(getStringValue(),beginPrcsAgrmntId800,beginPrcsAgrmntId800 + PRCS_AGRMNT_ID_800_LEN));
   	}




}
  
