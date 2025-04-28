package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnPgmAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnPgmAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnPgmAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_PGM_AREA_LENGTH = 1024;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnErrorType;
            protected  int beginCmnUserid;
            protected  int beginCmnErrMsgNo;
            protected  int beginCmnErrApplId;
            protected  int beginCmnErrPgmName;
            protected  int beginCmnErrPgmParanum;
            protected  int beginCmnErrPgmAction;
            protected  int beginCmnErrSqlcode;
            protected  int beginCmnErrField;
            protected  int beginCmnApplName;
            protected  int beginCmnFiller;
            protected  int beginCmnUserAbendCd;
            protected  int beginCmnAbendInd;
	
	/**
	* Constructor for CmnPgmAreaSerialized
	**/
    public CmnPgmAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnPgmAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPgmAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnPgmAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CmnPgmAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CmnPgmAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_PGM_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnErrorType = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnUserid = getStartOffset() + 4;	// set offset for serialization
  
  
             beginCmnErrMsgNo = getStartOffset() + 28;	// set offset for serialization
  
  
             beginCmnErrApplId = getStartOffset() + 40;	// set offset for serialization
  
             beginCmnErrPgmName = getStartOffset() + 45;	// set offset for serialization
  
             beginCmnErrPgmParanum = getStartOffset() + 53;	// set offset for serialization
  
             beginCmnErrPgmAction = getStartOffset() + 57;	// set offset for serialization
  
             beginCmnErrSqlcode = getStartOffset() + 69;	// set offset for serialization
  
             beginCmnErrField = getStartOffset() + 73;	// set offset for serialization
  
  
  
  
  
  
             beginCmnApplName = getStartOffset() + 741;	// set offset for serialization
  
             beginCmnFiller = getStartOffset() + 779;	// set offset for serialization
  
             beginCmnUserAbendCd = getStartOffset() + 1021;	// set offset for serialization
  
             beginCmnAbendInd = getStartOffset() + 1023;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnErrorTypeCounter = -1;
     public boolean isCmnErrorTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrorTypeCounter != sharedCounter;
         localCmnErrorTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERROR_TYPE_LEN = 4;
	/**
	 * 	serialize this CmnErrorType
	 */
   protected void serializeCmnErrorType(char[] cmnErrorType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrorType,0,getStringValue(),beginCmnErrorType,CMN_ERROR_TYPE_LEN);
       localCmnErrorTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrorTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCmnErrorType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrorType() {	 
   		return (substring(getStringValue(),beginCmnErrorType,beginCmnErrorType + CMN_ERROR_TYPE_LEN));
   	}
     int localCmnUseridCounter = -1;
     public boolean isCmnUseridModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnUseridCounter != sharedCounter;
         localCmnUseridCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_USERID_LEN = 8;
	/**
	 * 	serialize this CmnUserid
	 */
   protected void serializeCmnUserid(char[] cmnUserid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnUserid,0,getStringValue(),beginCmnUserid,CMN_USERID_LEN);
       localCmnUseridCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnUseridConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnUserid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnUserid() {	 
   		return (substring(getStringValue(),beginCmnUserid,beginCmnUserid + CMN_USERID_LEN));
   	}
         int localCmnErrMsgNoCounter = -1;
         public boolean isCmnErrMsgNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmnErrMsgNoCounter != sharedCounter;
            localCmnErrMsgNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMN_ERR_MSG_NO_LEN = 4;
  	/**
	 * serializeCmnErrMsgNo
	 */
	protected void serializeCmnErrMsgNo(int cmnErrMsgNo) {
           replaceValue( //  save the value as string
                   getBinaryString( cmnErrMsgNo,CMN_ERR_MSG_NO_LEN)
                  ,beginCmnErrMsgNo
                  ,CMN_ERR_MSG_NO_LEN
                 );
            localCmnErrMsgNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCmnErrMsgNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCmnErrMsgNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnErrMsgNo() {	 
			return (getInt(beginCmnErrMsgNo));
   	}
     int localCmnErrApplIdCounter = -1;
     public boolean isCmnErrApplIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrApplIdCounter != sharedCounter;
         localCmnErrApplIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_APPL_ID_LEN = 5;
	/**
	 * 	serialize this CmnErrApplId
	 */
   protected void serializeCmnErrApplId(char[] cmnErrApplId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrApplId,0,getStringValue(),beginCmnErrApplId,CMN_ERR_APPL_ID_LEN);
       localCmnErrApplIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrApplIdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCmnErrApplId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrApplId() {	 
   		return (substring(getStringValue(),beginCmnErrApplId,beginCmnErrApplId + CMN_ERR_APPL_ID_LEN));
   	}
     int localCmnErrPgmNameCounter = -1;
     public boolean isCmnErrPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrPgmNameCounter != sharedCounter;
         localCmnErrPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this CmnErrPgmName
	 */
   protected void serializeCmnErrPgmName(char[] cmnErrPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrPgmName,0,getStringValue(),beginCmnErrPgmName,CMN_ERR_PGM_NAME_LEN);
       localCmnErrPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnErrPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrPgmName() {	 
   		return (substring(getStringValue(),beginCmnErrPgmName,beginCmnErrPgmName + CMN_ERR_PGM_NAME_LEN));
   	}
     int localCmnErrPgmParanumCounter = -1;
     public boolean isCmnErrPgmParanumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrPgmParanumCounter != sharedCounter;
         localCmnErrPgmParanumCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_PGM_PARANUM_LEN = 4;
	/**
	 * 	serialize this CmnErrPgmParanum
	 */
   protected void serializeCmnErrPgmParanum(char[] cmnErrPgmParanum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrPgmParanum,0,getStringValue(),beginCmnErrPgmParanum,CMN_ERR_PGM_PARANUM_LEN);
       localCmnErrPgmParanumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrPgmParanumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCmnErrPgmParanum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrPgmParanum() {	 
   		return (substring(getStringValue(),beginCmnErrPgmParanum,beginCmnErrPgmParanum + CMN_ERR_PGM_PARANUM_LEN));
   	}
     int localCmnErrPgmActionCounter = -1;
     public boolean isCmnErrPgmActionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrPgmActionCounter != sharedCounter;
         localCmnErrPgmActionCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_PGM_ACTION_LEN = 12;
	/**
	 * 	serialize this CmnErrPgmAction
	 */
   protected void serializeCmnErrPgmAction(char[] cmnErrPgmAction) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrPgmAction,0,getStringValue(),beginCmnErrPgmAction,CMN_ERR_PGM_ACTION_LEN);
       localCmnErrPgmActionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrPgmActionConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCmnErrPgmAction is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrPgmAction() {	 
   		return (substring(getStringValue(),beginCmnErrPgmAction,beginCmnErrPgmAction + CMN_ERR_PGM_ACTION_LEN));
   	}
         int localCmnErrSqlcodeCounter = -1;
         public boolean isCmnErrSqlcodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmnErrSqlcodeCounter != sharedCounter;
            localCmnErrSqlcodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMN_ERR_SQLCODE_LEN = 4;
  	/**
	 * serializeCmnErrSqlcode
	 */
	protected void serializeCmnErrSqlcode(int cmnErrSqlcode) {
           replaceValue( //  save the value as string
                   getBinaryString( cmnErrSqlcode,CMN_ERR_SQLCODE_LEN)
                  ,beginCmnErrSqlcode
                  ,CMN_ERR_SQLCODE_LEN
                 );
            localCmnErrSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCmnErrSqlcodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCmnErrSqlcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmnErrSqlcode() {	 
			return (getInt(beginCmnErrSqlcode));
   	}
     int localCmnErrFieldCounter = -1;
     public boolean isCmnErrFieldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnErrFieldCounter != sharedCounter;
         localCmnErrFieldCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ERR_FIELD_LEN = 18;
	/**
	 * 	serialize this CmnErrField
	 */
   protected void serializeCmnErrField(char[] cmnErrField) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnErrField,0,getStringValue(),beginCmnErrField,CMN_ERR_FIELD_LEN);
       localCmnErrFieldCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnErrFieldConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshCmnErrField is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnErrField() {	 
   		return (substring(getStringValue(),beginCmnErrField,beginCmnErrField + CMN_ERR_FIELD_LEN));
   	}
     int localCmnApplNameCounter = -1;
     public boolean isCmnApplNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnApplNameCounter != sharedCounter;
         localCmnApplNameCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_APPL_NAME_LEN = 38;
	/**
	 * 	serialize this CmnApplName
	 */
   protected void serializeCmnApplName(char[] cmnApplName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnApplName,0,getStringValue(),beginCmnApplName,CMN_APPL_NAME_LEN);
       localCmnApplNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnApplNameConstraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
   }
    /**
	 *	refreshCmnApplName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnApplName() {	 
   		return (substring(getStringValue(),beginCmnApplName,beginCmnApplName + CMN_APPL_NAME_LEN));
   	}
     int localCmnFillerCounter = -1;
     public boolean isCmnFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnFillerCounter != sharedCounter;
         localCmnFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_FILLER_LEN = 242;
	/**
	 * 	serialize this CmnFiller
	 */
   protected void serializeCmnFiller(char[] cmnFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnFiller,0,getStringValue(),beginCmnFiller,CMN_FILLER_LEN);
       localCmnFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 242 ,false, false);
   }
    /**
	 *	refreshCmnFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnFiller() {	 
   		return (substring(getStringValue(),beginCmnFiller,beginCmnFiller + CMN_FILLER_LEN));
   	}
         int localCmnUserAbendCdCounter = -1;
         public boolean isCmnUserAbendCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmnUserAbendCdCounter != sharedCounter;
            localCmnUserAbendCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMN_USER_ABEND_CD_LEN = 2;
  	/**
	 * serializeCmnUserAbendCd
	 */
	protected void serializeCmnUserAbendCd(short cmnUserAbendCd) {
           replaceValue( //  save the value as string
                   getBinaryString( cmnUserAbendCd,CMN_USER_ABEND_CD_LEN)
                  ,beginCmnUserAbendCd
                  ,CMN_USER_ABEND_CD_LEN
                 );
            localCmnUserAbendCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCmnUserAbendCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCmnUserAbendCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCmnUserAbendCd() {	 
			return (getShort(beginCmnUserAbendCd));
   	}
     int localCmnAbendIndCounter = -1;
     public boolean isCmnAbendIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnAbendIndCounter != sharedCounter;
         localCmnAbendIndCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_ABEND_IND_LEN = 1;
	/**
	 * 	serialize this CmnAbendInd
	 */
   protected void serializeCmnAbendInd(char[] cmnAbendInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnAbendInd,0,getStringValue(),beginCmnAbendInd,CMN_ABEND_IND_LEN);
       localCmnAbendIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnAbendIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnAbendInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnAbendInd() {	 
   		return (substring(getStringValue(),beginCmnAbendInd,beginCmnAbendInd + CMN_ABEND_IND_LEN));
   	}




}
  
