package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyCpduPrevSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class KeyCpduPrevSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyCpduPrevSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_CPDU_PREV_LENGTH = 88;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCpduPrvRefRecType;
            protected  int beginCpduPrvOffrTypeCd;
            protected  int beginCpduPrvOffrTypeId;
            protected  int beginCpduPrvProdSeq;
            protected  int beginCpduPrvEventDiscId;
            protected  int beginCpduPrvPeriodNum;
            protected  int beginCpduPrvEventDiscCd;
            protected  int beginCpduPrvUbOrigInstance;
            protected  int beginCpduPrvPlanStartDt;
            protected  int beginCpduPrvPlanEndDt;
            protected  int beginCpduPrvTotalDiscUsage;
	
	/**
	* Constructor for KeyCpduPrevSerialized
	**/
    public KeyCpduPrevSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyCpduPrevSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduPrevSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyCpduPrevSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,50); // serialize this field at offset 50 by default 
    }
    
	/**
	* sets parent for this KeyCpduPrevSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 50 by default
    }    
	/**
	* initializes the field in KeyCpduPrevSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_CPDU_PREV_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCpduPrvRefRecType = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginCpduPrvOffrTypeCd = getStartOffset() + 19;	// set offset for serialization
  
             beginCpduPrvOffrTypeId = getStartOffset() + 21;	// set offset for serialization
  
             beginCpduPrvProdSeq = getStartOffset() + 25;	// set offset for serialization
  
             beginCpduPrvEventDiscId = getStartOffset() + 34;	// set offset for serialization
  
             beginCpduPrvPeriodNum = getStartOffset() + 43;	// set offset for serialization
  
             beginCpduPrvEventDiscCd = getStartOffset() + 52;	// set offset for serialization
  
             beginCpduPrvUbOrigInstance = getStartOffset() + 55;	// set offset for serialization
  
             beginCpduPrvPlanStartDt = getStartOffset() + 58;	// set offset for serialization
  
             beginCpduPrvPlanEndDt = getStartOffset() + 68;	// set offset for serialization
  
             beginCpduPrvTotalDiscUsage = getStartOffset() + 78;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCpduPrvRefRecTypeCounter = -1;
     public boolean isCpduPrvRefRecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvRefRecTypeCounter != sharedCounter;
         localCpduPrvRefRecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_REF_REC_TYPE_LEN = 1;
	/**
	 * 	serialize this CpduPrvRefRecType
	 */
   protected void serializeCpduPrvRefRecType(char[] cpduPrvRefRecType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvRefRecType,0,getStringValue(),beginCpduPrvRefRecType,CPDU_PRV_REF_REC_TYPE_LEN);
       localCpduPrvRefRecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvRefRecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCpduPrvRefRecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvRefRecType() {	 
   		return (substring(getStringValue(),beginCpduPrvRefRecType,beginCpduPrvRefRecType + CPDU_PRV_REF_REC_TYPE_LEN));
   	}
     int localCpduPrvOffrTypeCdCounter = -1;
     public boolean isCpduPrvOffrTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvOffrTypeCdCounter != sharedCounter;
         localCpduPrvOffrTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_OFFR_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this CpduPrvOffrTypeCd
	 */
   protected void serializeCpduPrvOffrTypeCd(char[] cpduPrvOffrTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvOffrTypeCd,0,getStringValue(),beginCpduPrvOffrTypeCd,CPDU_PRV_OFFR_TYPE_CD_LEN);
       localCpduPrvOffrTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvOffrTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCpduPrvOffrTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvOffrTypeCd() {	 
   		return (substring(getStringValue(),beginCpduPrvOffrTypeCd,beginCpduPrvOffrTypeCd + CPDU_PRV_OFFR_TYPE_CD_LEN));
   	}
         int localCpduPrvOffrTypeIdCounter = -1;
         public boolean isCpduPrvOffrTypeIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCpduPrvOffrTypeIdCounter != sharedCounter;
            localCpduPrvOffrTypeIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int CPDU_PRV_OFFR_TYPE_ID_LEN = 4;
  	/**
	 * serializeCpduPrvOffrTypeId
	 */
	protected void serializeCpduPrvOffrTypeId(int cpduPrvOffrTypeId) {
           replaceValue( //  save the value as string
                   getBinaryString( cpduPrvOffrTypeId,CPDU_PRV_OFFR_TYPE_ID_LEN)
                  ,beginCpduPrvOffrTypeId
                  ,CPDU_PRV_OFFR_TYPE_ID_LEN
                 );
            localCpduPrvOffrTypeIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCpduPrvOffrTypeIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCpduPrvOffrTypeId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCpduPrvOffrTypeId() {	 
			return (getInt(beginCpduPrvOffrTypeId));
   	}
     int localCpduPrvProdSeqCounter = -1;
     public boolean isCpduPrvProdSeqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvProdSeqCounter != sharedCounter;
         localCpduPrvProdSeqCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_PROD_SEQ_LEN = 9;
	/**
	 * 	serialize this CpduPrvProdSeq
	 */
   protected void serializeCpduPrvProdSeq(char[] cpduPrvProdSeq) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvProdSeq,0,getStringValue(),beginCpduPrvProdSeq,CPDU_PRV_PROD_SEQ_LEN);
       localCpduPrvProdSeqCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvProdSeqConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCpduPrvProdSeq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvProdSeq() {	 
   		return (substring(getStringValue(),beginCpduPrvProdSeq,beginCpduPrvProdSeq + CPDU_PRV_PROD_SEQ_LEN));
   	}
     int localCpduPrvEventDiscIdCounter = -1;
     public boolean isCpduPrvEventDiscIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvEventDiscIdCounter != sharedCounter;
         localCpduPrvEventDiscIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_EVENT_DISC_ID_LEN = 9;
	/**
	 * 	serialize this CpduPrvEventDiscId
	 */
   protected void serializeCpduPrvEventDiscId(char[] cpduPrvEventDiscId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvEventDiscId,0,getStringValue(),beginCpduPrvEventDiscId,CPDU_PRV_EVENT_DISC_ID_LEN);
       localCpduPrvEventDiscIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvEventDiscIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCpduPrvEventDiscId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvEventDiscId() {	 
   		return (substring(getStringValue(),beginCpduPrvEventDiscId,beginCpduPrvEventDiscId + CPDU_PRV_EVENT_DISC_ID_LEN));
   	}
     int localCpduPrvPeriodNumCounter = -1;
     public boolean isCpduPrvPeriodNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvPeriodNumCounter != sharedCounter;
         localCpduPrvPeriodNumCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_PERIOD_NUM_LEN = 9;
	/**
	 * 	serialize this CpduPrvPeriodNum
	 */
   protected void serializeCpduPrvPeriodNum(char[] cpduPrvPeriodNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvPeriodNum,0,getStringValue(),beginCpduPrvPeriodNum,CPDU_PRV_PERIOD_NUM_LEN);
       localCpduPrvPeriodNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvPeriodNumConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCpduPrvPeriodNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvPeriodNum() {	 
   		return (substring(getStringValue(),beginCpduPrvPeriodNum,beginCpduPrvPeriodNum + CPDU_PRV_PERIOD_NUM_LEN));
   	}
     int localCpduPrvEventDiscCdCounter = -1;
     public boolean isCpduPrvEventDiscCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvEventDiscCdCounter != sharedCounter;
         localCpduPrvEventDiscCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_EVENT_DISC_CD_LEN = 3;
	/**
	 * 	serialize this CpduPrvEventDiscCd
	 */
   protected void serializeCpduPrvEventDiscCd(char[] cpduPrvEventDiscCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvEventDiscCd,0,getStringValue(),beginCpduPrvEventDiscCd,CPDU_PRV_EVENT_DISC_CD_LEN);
       localCpduPrvEventDiscCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvEventDiscCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpduPrvEventDiscCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvEventDiscCd() {	 
   		return (substring(getStringValue(),beginCpduPrvEventDiscCd,beginCpduPrvEventDiscCd + CPDU_PRV_EVENT_DISC_CD_LEN));
   	}
     int localCpduPrvUbOrigInstanceCounter = -1;
     public boolean isCpduPrvUbOrigInstanceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvUbOrigInstanceCounter != sharedCounter;
         localCpduPrvUbOrigInstanceCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_UB_ORIG_INSTANCE_LEN = 3;
	/**
	 * 	serialize this CpduPrvUbOrigInstance
	 */
   protected void serializeCpduPrvUbOrigInstance(char[] cpduPrvUbOrigInstance) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvUbOrigInstance,0,getStringValue(),beginCpduPrvUbOrigInstance,CPDU_PRV_UB_ORIG_INSTANCE_LEN);
       localCpduPrvUbOrigInstanceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvUbOrigInstanceConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpduPrvUbOrigInstance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvUbOrigInstance() {	 
   		return (substring(getStringValue(),beginCpduPrvUbOrigInstance,beginCpduPrvUbOrigInstance + CPDU_PRV_UB_ORIG_INSTANCE_LEN));
   	}
     int localCpduPrvPlanStartDtCounter = -1;
     public boolean isCpduPrvPlanStartDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvPlanStartDtCounter != sharedCounter;
         localCpduPrvPlanStartDtCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_PLAN_START_DT_LEN = 10;
	/**
	 * 	serialize this CpduPrvPlanStartDt
	 */
   protected void serializeCpduPrvPlanStartDt(char[] cpduPrvPlanStartDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvPlanStartDt,0,getStringValue(),beginCpduPrvPlanStartDt,CPDU_PRV_PLAN_START_DT_LEN);
       localCpduPrvPlanStartDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvPlanStartDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCpduPrvPlanStartDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvPlanStartDt() {	 
   		return (substring(getStringValue(),beginCpduPrvPlanStartDt,beginCpduPrvPlanStartDt + CPDU_PRV_PLAN_START_DT_LEN));
   	}
     int localCpduPrvPlanEndDtCounter = -1;
     public boolean isCpduPrvPlanEndDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduPrvPlanEndDtCounter != sharedCounter;
         localCpduPrvPlanEndDtCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_PRV_PLAN_END_DT_LEN = 10;
	/**
	 * 	serialize this CpduPrvPlanEndDt
	 */
   protected void serializeCpduPrvPlanEndDt(char[] cpduPrvPlanEndDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduPrvPlanEndDt,0,getStringValue(),beginCpduPrvPlanEndDt,CPDU_PRV_PLAN_END_DT_LEN);
       localCpduPrvPlanEndDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduPrvPlanEndDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCpduPrvPlanEndDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduPrvPlanEndDt() {	 
   		return (substring(getStringValue(),beginCpduPrvPlanEndDt,beginCpduPrvPlanEndDt + CPDU_PRV_PLAN_END_DT_LEN));
   	}
        int localCpduPrvTotalDiscUsageCounter = -1;
        public boolean isCpduPrvTotalDiscUsageModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCpduPrvTotalDiscUsageCounter != sharedCounter;
           localCpduPrvTotalDiscUsageCounter = sharedCounter; return hasModified; 
        }
	    public boolean cpduPrvTotalDiscUsageIsNumeric() {
	      return decimalIsNumeric(beginCpduPrvTotalDiscUsage,CPDU_PRV_TOTAL_DISC_USAGE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int CPDU_PRV_TOTAL_DISC_USAGE_LEN = 10;
  	/**
	 * 	serializeCpduPrvTotalDiscUsage
	 */
	protected void serializeCpduPrvTotalDiscUsage(long cpduPrvTotalDiscUsage) {
		   putDecimal(beginCpduPrvTotalDiscUsage,cpduPrvTotalDiscUsage,CPDU_PRV_TOTAL_DISC_USAGE_LEN,true);
   }
   

   protected long checkCpduPrvTotalDiscUsageMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCpduPrvTotalDiscUsage is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCpduPrvTotalDiscUsage() throws CFException {	
   	try { 
		 return (getLongDecimal(beginCpduPrvTotalDiscUsage,CPDU_PRV_TOTAL_DISC_USAGE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("cpduPrvTotalDiscUsage", beginCpduPrvTotalDiscUsage,CPDU_PRV_TOTAL_DISC_USAGE_LEN);
     }
   	}




}
  
