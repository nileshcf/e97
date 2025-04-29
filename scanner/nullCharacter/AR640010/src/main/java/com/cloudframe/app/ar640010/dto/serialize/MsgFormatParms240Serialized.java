package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MsgFormatParms240Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MsgFormatParms240Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgFormatParms240Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_FORMAT_PARMS_240_LENGTH = 669;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGftSubsystemId240;
            protected  int beginMsgNum240;
            protected  int beginMsgSeverityInd240;
            protected  int beginMsgTypeInd240;
            protected  int beginMsgBulkid240;
            protected  int beginMsgEndpt240;
            protected  int beginMsgCyclNum240;
            protected  int beginMsgFilename240;
            protected  int beginXferMthd240;
            protected  int beginXferMthdNode240;
            protected  int beginXferProcId240;
            protected  int beginXferMthdMsgId240;
            protected  int beginMsgErrCd240;
            protected  int beginMsgStatRefId240;
            protected  int beginMsgStatRefDesc240;
            protected  int beginMsgErrorDescription240;
           protected int beginMsgErr240;
           protected static final int MSG_ERR_240_SIZE = 5;
            protected  int beginMsgProgName240;
            protected  int beginMsgParaName240;
            protected  int beginMsgBusPrtnrId240;
            protected  int beginMsgAbendCd240;
	
	/**
	* Constructor for MsgFormatParms240Serialized
	**/
    public MsgFormatParms240Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MsgFormatParms240Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_FORMAT_PARMS_240_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGftSubsystemId240 = getStartOffset() + 0;	// set offset for serialization
  
             beginMsgNum240 = getStartOffset() + 4;	// set offset for serialization
  
             beginMsgSeverityInd240 = getStartOffset() + 7;	// set offset for serialization
  
             beginMsgTypeInd240 = getStartOffset() + 8;	// set offset for serialization
  
             beginMsgBulkid240 = getStartOffset() + 12;	// set offset for serialization
  
             beginMsgEndpt240 = getStartOffset() + 16;	// set offset for serialization
  
             beginMsgCyclNum240 = getStartOffset() + 23;	// set offset for serialization
  
             beginMsgFilename240 = getStartOffset() + 25;	// set offset for serialization
  
             beginXferMthd240 = getStartOffset() + 69;	// set offset for serialization
  
             beginXferMthdNode240 = getStartOffset() + 72;	// set offset for serialization
  
             beginXferProcId240 = getStartOffset() + 92;	// set offset for serialization
  
             beginXferMthdMsgId240 = getStartOffset() + 112;	// set offset for serialization
  
             beginMsgErrCd240 = getStartOffset() + 132;	// set offset for serialization
  
             beginMsgStatRefId240 = getStartOffset() + 136;	// set offset for serialization
  
             beginMsgStatRefDesc240 = getStartOffset() + 140;	// set offset for serialization
  
             beginMsgErrorDescription240 = getStartOffset() + 220;	// set offset for serialization
  
	        beginMsgErr240 = getStartOffset() + 220; // set offset for serialization
  
             beginMsgProgName240 = getStartOffset() + 620;	// set offset for serialization
  
             beginMsgParaName240 = getStartOffset() + 628;	// set offset for serialization
  
             beginMsgBusPrtnrId240 = getStartOffset() + 658;	// set offset for serialization
  
             beginMsgAbendCd240 = getStartOffset() + 664;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGftSubsystemId240Counter = -1;
     public boolean isGftSubsystemId240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftSubsystemId240Counter != sharedCounter;
         localGftSubsystemId240Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_SUBSYSTEM_ID_240_LEN = 4;
	/**
	 * 	serialize this GftSubsystemId240
	 */
   protected void serializeGftSubsystemId240(char[] gftSubsystemId240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftSubsystemId240,0,getStringValue(),beginGftSubsystemId240,GFT_SUBSYSTEM_ID_240_LEN);
       localGftSubsystemId240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftSubsystemId240Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshGftSubsystemId240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftSubsystemId240() {	 
   		return (substring(getStringValue(),beginGftSubsystemId240,beginGftSubsystemId240 + GFT_SUBSYSTEM_ID_240_LEN));
   	}
     int localMsgNum240Counter = -1;
     public boolean isMsgNum240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgNum240Counter != sharedCounter;
         localMsgNum240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_NUM_240_LEN = 3;
	/**
	 * 	serialize this MsgNum240
	 */
   protected void serializeMsgNum240(char[] msgNum240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgNum240,0,getStringValue(),beginMsgNum240,MSG_NUM_240_LEN);
       localMsgNum240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgNum240Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsgNum240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgNum240() {	 
   		return (substring(getStringValue(),beginMsgNum240,beginMsgNum240 + MSG_NUM_240_LEN));
   	}
     int localMsgSeverityInd240Counter = -1;
     public boolean isMsgSeverityInd240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgSeverityInd240Counter != sharedCounter;
         localMsgSeverityInd240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_SEVERITY_IND_240_LEN = 1;
	/**
	 * 	serialize this MsgSeverityInd240
	 */
   protected void serializeMsgSeverityInd240(char[] msgSeverityInd240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgSeverityInd240,0,getStringValue(),beginMsgSeverityInd240,MSG_SEVERITY_IND_240_LEN);
       localMsgSeverityInd240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgSeverityInd240Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsgSeverityInd240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgSeverityInd240() {	 
   		return (substring(getStringValue(),beginMsgSeverityInd240,beginMsgSeverityInd240 + MSG_SEVERITY_IND_240_LEN));
   	}
     int localMsgTypeInd240Counter = -1;
     public boolean isMsgTypeInd240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgTypeInd240Counter != sharedCounter;
         localMsgTypeInd240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_TYPE_IND_240_LEN = 4;
	/**
	 * 	serialize this MsgTypeInd240
	 */
   protected void serializeMsgTypeInd240(char[] msgTypeInd240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgTypeInd240,0,getStringValue(),beginMsgTypeInd240,MSG_TYPE_IND_240_LEN);
       localMsgTypeInd240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgTypeInd240Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsgTypeInd240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgTypeInd240() {	 
   		return (substring(getStringValue(),beginMsgTypeInd240,beginMsgTypeInd240 + MSG_TYPE_IND_240_LEN));
   	}
     int localMsgBulkid240Counter = -1;
     public boolean isMsgBulkid240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgBulkid240Counter != sharedCounter;
         localMsgBulkid240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_BULKID_240_LEN = 4;
	/**
	 * 	serialize this MsgBulkid240
	 */
   protected void serializeMsgBulkid240(char[] msgBulkid240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgBulkid240,0,getStringValue(),beginMsgBulkid240,MSG_BULKID_240_LEN);
       localMsgBulkid240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgBulkid240Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsgBulkid240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgBulkid240() {	 
   		return (substring(getStringValue(),beginMsgBulkid240,beginMsgBulkid240 + MSG_BULKID_240_LEN));
   	}
     int localMsgEndpt240Counter = -1;
     public boolean isMsgEndpt240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgEndpt240Counter != sharedCounter;
         localMsgEndpt240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_ENDPT_240_LEN = 7;
	/**
	 * 	serialize this MsgEndpt240
	 */
   protected void serializeMsgEndpt240(char[] msgEndpt240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgEndpt240,0,getStringValue(),beginMsgEndpt240,MSG_ENDPT_240_LEN);
       localMsgEndpt240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgEndpt240Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMsgEndpt240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgEndpt240() {	 
   		return (substring(getStringValue(),beginMsgEndpt240,beginMsgEndpt240 + MSG_ENDPT_240_LEN));
   	}
        int localMsgCyclNum240Counter = -1;
        public boolean isMsgCyclNum240Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMsgCyclNum240Counter != sharedCounter;
           localMsgCyclNum240Counter = sharedCounter; return hasModified; 
        }
	    public boolean msgCyclNum240IsNumeric() {
	      return decimalIsNumeric(beginMsgCyclNum240,MSG_CYCL_NUM_240_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MSG_CYCL_NUM_240_LEN = 2;
  	/**
	 * 	serializeMsgCyclNum240
	 */
	protected void serializeMsgCyclNum240(short msgCyclNum240) {
		   putDecimal(beginMsgCyclNum240,msgCyclNum240,MSG_CYCL_NUM_240_LEN,true);
   }
   

   protected short checkMsgCyclNum240MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshMsgCyclNum240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMsgCyclNum240() throws CFException {	
   	try { 
		 return (getShortDecimal(beginMsgCyclNum240,MSG_CYCL_NUM_240_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("msgCyclNum240", beginMsgCyclNum240,MSG_CYCL_NUM_240_LEN);
     }
   	}
     int localMsgFilename240Counter = -1;
     public boolean isMsgFilename240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgFilename240Counter != sharedCounter;
         localMsgFilename240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_FILENAME_240_LEN = 44;
	/**
	 * 	serialize this MsgFilename240
	 */
   protected void serializeMsgFilename240(char[] msgFilename240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgFilename240,0,getStringValue(),beginMsgFilename240,MSG_FILENAME_240_LEN);
       localMsgFilename240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgFilename240Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshMsgFilename240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgFilename240() {	 
   		return (substring(getStringValue(),beginMsgFilename240,beginMsgFilename240 + MSG_FILENAME_240_LEN));
   	}
     int localXferMthd240Counter = -1;
     public boolean isXferMthd240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXferMthd240Counter != sharedCounter;
         localXferMthd240Counter = sharedCounter; return hasModified;
     }
	protected static final int XFER_MTHD_240_LEN = 3;
	/**
	 * 	serialize this XferMthd240
	 */
   protected void serializeXferMthd240(char[] xferMthd240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xferMthd240,0,getStringValue(),beginXferMthd240,XFER_MTHD_240_LEN);
       localXferMthd240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXferMthd240Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshXferMthd240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXferMthd240() {	 
   		return (substring(getStringValue(),beginXferMthd240,beginXferMthd240 + XFER_MTHD_240_LEN));
   	}
     int localXferMthdNode240Counter = -1;
     public boolean isXferMthdNode240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXferMthdNode240Counter != sharedCounter;
         localXferMthdNode240Counter = sharedCounter; return hasModified;
     }
	protected static final int XFER_MTHD_NODE_240_LEN = 20;
	/**
	 * 	serialize this XferMthdNode240
	 */
   protected void serializeXferMthdNode240(char[] xferMthdNode240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xferMthdNode240,0,getStringValue(),beginXferMthdNode240,XFER_MTHD_NODE_240_LEN);
       localXferMthdNode240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXferMthdNode240Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshXferMthdNode240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXferMthdNode240() {	 
   		return (substring(getStringValue(),beginXferMthdNode240,beginXferMthdNode240 + XFER_MTHD_NODE_240_LEN));
   	}
     int localXferProcId240Counter = -1;
     public boolean isXferProcId240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXferProcId240Counter != sharedCounter;
         localXferProcId240Counter = sharedCounter; return hasModified;
     }
	protected static final int XFER_PROC_ID_240_LEN = 20;
	/**
	 * 	serialize this XferProcId240
	 */
   protected void serializeXferProcId240(char[] xferProcId240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xferProcId240,0,getStringValue(),beginXferProcId240,XFER_PROC_ID_240_LEN);
       localXferProcId240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXferProcId240Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshXferProcId240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXferProcId240() {	 
   		return (substring(getStringValue(),beginXferProcId240,beginXferProcId240 + XFER_PROC_ID_240_LEN));
   	}
     int localXferMthdMsgId240Counter = -1;
     public boolean isXferMthdMsgId240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXferMthdMsgId240Counter != sharedCounter;
         localXferMthdMsgId240Counter = sharedCounter; return hasModified;
     }
	protected static final int XFER_MTHD_MSG_ID_240_LEN = 20;
	/**
	 * 	serialize this XferMthdMsgId240
	 */
   protected void serializeXferMthdMsgId240(char[] xferMthdMsgId240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xferMthdMsgId240,0,getStringValue(),beginXferMthdMsgId240,XFER_MTHD_MSG_ID_240_LEN);
       localXferMthdMsgId240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXferMthdMsgId240Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshXferMthdMsgId240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXferMthdMsgId240() {	 
   		return (substring(getStringValue(),beginXferMthdMsgId240,beginXferMthdMsgId240 + XFER_MTHD_MSG_ID_240_LEN));
   	}
     int localMsgErrCd240Counter = -1;
     public boolean isMsgErrCd240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgErrCd240Counter != sharedCounter;
         localMsgErrCd240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_ERR_CD_240_LEN = 4;
	/**
	 * 	serialize this MsgErrCd240
	 */
   protected void serializeMsgErrCd240(char[] msgErrCd240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgErrCd240,0,getStringValue(),beginMsgErrCd240,MSG_ERR_CD_240_LEN);
       localMsgErrCd240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgErrCd240Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsgErrCd240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgErrCd240() {	 
   		return (substring(getStringValue(),beginMsgErrCd240,beginMsgErrCd240 + MSG_ERR_CD_240_LEN));
   	}
     int localMsgStatRefId240Counter = -1;
     public boolean isMsgStatRefId240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgStatRefId240Counter != sharedCounter;
         localMsgStatRefId240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_STAT_REF_ID_240_LEN = 4;
	/**
	 * 	serialize this MsgStatRefId240
	 */
   protected void serializeMsgStatRefId240(char[] msgStatRefId240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgStatRefId240,0,getStringValue(),beginMsgStatRefId240,MSG_STAT_REF_ID_240_LEN);
       localMsgStatRefId240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgStatRefId240Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMsgStatRefId240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgStatRefId240() {	 
   		return (substring(getStringValue(),beginMsgStatRefId240,beginMsgStatRefId240 + MSG_STAT_REF_ID_240_LEN));
   	}
     int localMsgStatRefDesc240Counter = -1;
     public boolean isMsgStatRefDesc240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgStatRefDesc240Counter != sharedCounter;
         localMsgStatRefDesc240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_STAT_REF_DESC_240_LEN = 80;
	/**
	 * 	serialize this MsgStatRefDesc240
	 */
   protected void serializeMsgStatRefDesc240(char[] msgStatRefDesc240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgStatRefDesc240,0,getStringValue(),beginMsgStatRefDesc240,MSG_STAT_REF_DESC_240_LEN);
       localMsgStatRefDesc240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgStatRefDesc240Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshMsgStatRefDesc240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgStatRefDesc240() {	 
   		return (substring(getStringValue(),beginMsgStatRefDesc240,beginMsgStatRefDesc240 + MSG_STAT_REF_DESC_240_LEN));
   	}
     int localMsgErrorDescription240Counter = -1;
     public boolean isMsgErrorDescription240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgErrorDescription240Counter != sharedCounter;
         localMsgErrorDescription240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_ERROR_DESCRIPTION_240_LEN = 400;
	/**
	 * 	serialize this MsgErrorDescription240
	 */
   protected void serializeMsgErrorDescription240(char[] msgErrorDescription240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgErrorDescription240,0,getStringValue(),beginMsgErrorDescription240,MSG_ERROR_DESCRIPTION_240_LEN);
       localMsgErrorDescription240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgErrorDescription240Constraints(char[] value) {
   			return super.checkConstraints(value , 400 ,false, false);
   }
    /**
	 *	refreshMsgErrorDescription240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgErrorDescription240() {	 
   		return (substring(getStringValue(),beginMsgErrorDescription240,beginMsgErrorDescription240 + MSG_ERROR_DESCRIPTION_240_LEN));
   	}
     int localMsgProgName240Counter = -1;
     public boolean isMsgProgName240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgProgName240Counter != sharedCounter;
         localMsgProgName240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_PROG_NAME_240_LEN = 8;
	/**
	 * 	serialize this MsgProgName240
	 */
   protected void serializeMsgProgName240(char[] msgProgName240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgProgName240,0,getStringValue(),beginMsgProgName240,MSG_PROG_NAME_240_LEN);
       localMsgProgName240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgProgName240Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMsgProgName240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgProgName240() {	 
   		return (substring(getStringValue(),beginMsgProgName240,beginMsgProgName240 + MSG_PROG_NAME_240_LEN));
   	}
     int localMsgParaName240Counter = -1;
     public boolean isMsgParaName240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgParaName240Counter != sharedCounter;
         localMsgParaName240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_PARA_NAME_240_LEN = 30;
	/**
	 * 	serialize this MsgParaName240
	 */
   protected void serializeMsgParaName240(char[] msgParaName240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgParaName240,0,getStringValue(),beginMsgParaName240,MSG_PARA_NAME_240_LEN);
       localMsgParaName240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgParaName240Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshMsgParaName240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgParaName240() {	 
   		return (substring(getStringValue(),beginMsgParaName240,beginMsgParaName240 + MSG_PARA_NAME_240_LEN));
   	}
     int localMsgBusPrtnrId240Counter = -1;
     public boolean isMsgBusPrtnrId240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgBusPrtnrId240Counter != sharedCounter;
         localMsgBusPrtnrId240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_BUS_PRTNR_ID_240_LEN = 6;
	/**
	 * 	serialize this MsgBusPrtnrId240
	 */
   protected void serializeMsgBusPrtnrId240(char[] msgBusPrtnrId240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgBusPrtnrId240,0,getStringValue(),beginMsgBusPrtnrId240,MSG_BUS_PRTNR_ID_240_LEN);
       localMsgBusPrtnrId240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgBusPrtnrId240Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMsgBusPrtnrId240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgBusPrtnrId240() {	 
   		return (substring(getStringValue(),beginMsgBusPrtnrId240,beginMsgBusPrtnrId240 + MSG_BUS_PRTNR_ID_240_LEN));
   	}
     int localMsgAbendCd240Counter = -1;
     public boolean isMsgAbendCd240Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsgAbendCd240Counter != sharedCounter;
         localMsgAbendCd240Counter = sharedCounter; return hasModified;
     }
	protected static final int MSG_ABEND_CD_240_LEN = 5;
	/**
	 * 	serialize this MsgAbendCd240
	 */
   protected void serializeMsgAbendCd240(char[] msgAbendCd240) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msgAbendCd240,0,getStringValue(),beginMsgAbendCd240,MSG_ABEND_CD_240_LEN);
       localMsgAbendCd240Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsgAbendCd240Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshMsgAbendCd240 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsgAbendCd240() {	 
   		return (substring(getStringValue(),beginMsgAbendCd240,beginMsgAbendCd240 + MSG_ABEND_CD_240_LEN));
   	}

		public int msgErr240Size() {
			return MSG_ERR_240_SIZE;
		}



}
  
