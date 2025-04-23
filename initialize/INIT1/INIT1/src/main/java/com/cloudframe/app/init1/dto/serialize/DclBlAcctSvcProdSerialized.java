package com.cloudframe.app.init1.dto.serialize;

/**
*  The class DclBlAcctSvcProdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclBlAcctSvcProdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclBlAcctSvcProdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCL_BL_ACCT_SVC_PROD_LENGTH = 198;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTb13033CustIdNo;
            protected  int beginTb13033AcctNo;
            protected  int beginTb13033SvcProdId;
            protected  int beginTb13033BaSvcProdEffTs;
            protected  int beginTb13033SvcProdUniqueId;
            protected  int beginTb13033SvcProdExpireDt;
            protected  int beginTb13033SvcProdReinstatInd;
            protected  int beginTb13033RuleGrpIdLast;
            protected  int beginTb13033BaSvcProdEndTs;
            protected  int beginTb13033OrigSvcProdEffTs;
            protected  int beginTb13033OrigSvcProdUniqId;
            protected  int beginTb13033VisionUserIdCd;
            protected  int beginTb13033DbUserid;
            protected  int beginTb13033DbTmstamp;
            protected  int beginTb13033OutletId;
            protected  int beginTb13033SlsRepId;
            protected  int beginTb13033CreateTs;
            protected  int beginTb13033OrdLnProdUniqueId;
            protected  int beginTb13033ProdIdTrig;
	
	/**
	* Constructor for DclBlAcctSvcProdSerialized
	**/
    public DclBlAcctSvcProdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclBlAcctSvcProdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCL_BL_ACCT_SVC_PROD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTb13033CustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginTb13033AcctNo = getStartOffset() + 4;	// set offset for serialization
  
             beginTb13033SvcProdId = getStartOffset() + 8;	// set offset for serialization
  
             beginTb13033BaSvcProdEffTs = getStartOffset() + 12;	// set offset for serialization
  
             beginTb13033SvcProdUniqueId = getStartOffset() + 38;	// set offset for serialization
  
             beginTb13033SvcProdExpireDt = getStartOffset() + 42;	// set offset for serialization
  
             beginTb13033SvcProdReinstatInd = getStartOffset() + 52;	// set offset for serialization
  
             beginTb13033RuleGrpIdLast = getStartOffset() + 53;	// set offset for serialization
  
             beginTb13033BaSvcProdEndTs = getStartOffset() + 57;	// set offset for serialization
  
             beginTb13033OrigSvcProdEffTs = getStartOffset() + 83;	// set offset for serialization
  
             beginTb13033OrigSvcProdUniqId = getStartOffset() + 109;	// set offset for serialization
  
             beginTb13033VisionUserIdCd = getStartOffset() + 113;	// set offset for serialization
  
             beginTb13033DbUserid = getStartOffset() + 121;	// set offset for serialization
  
             beginTb13033DbTmstamp = getStartOffset() + 129;	// set offset for serialization
  
             beginTb13033OutletId = getStartOffset() + 155;	// set offset for serialization
  
             beginTb13033SlsRepId = getStartOffset() + 159;	// set offset for serialization
  
             beginTb13033CreateTs = getStartOffset() + 164;	// set offset for serialization
  
             beginTb13033OrdLnProdUniqueId = getStartOffset() + 190;	// set offset for serialization
  
             beginTb13033ProdIdTrig = getStartOffset() + 194;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTb13033CustIdNoCounter = -1;
         public boolean isTb13033CustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033CustIdNoCounter != sharedCounter;
            localTb13033CustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeTb13033CustIdNo
	 */
	protected void serializeTb13033CustIdNo(int tb13033CustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033CustIdNo,TB_13033_CUST_ID_NO_LEN)
                  ,beginTb13033CustIdNo
                  ,TB_13033_CUST_ID_NO_LEN
                 );
            localTb13033CustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033CustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033CustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033CustIdNo() {	 
			return (getInt(beginTb13033CustIdNo));
   	}
         int localTb13033AcctNoCounter = -1;
         public boolean isTb13033AcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033AcctNoCounter != sharedCounter;
            localTb13033AcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_ACCT_NO_LEN = 4;
  	/**
	 * serializeTb13033AcctNo
	 */
	protected void serializeTb13033AcctNo(int tb13033AcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033AcctNo,TB_13033_ACCT_NO_LEN)
                  ,beginTb13033AcctNo
                  ,TB_13033_ACCT_NO_LEN
                 );
            localTb13033AcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033AcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033AcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033AcctNo() {	 
			return (getInt(beginTb13033AcctNo));
   	}
         int localTb13033SvcProdIdCounter = -1;
         public boolean isTb13033SvcProdIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033SvcProdIdCounter != sharedCounter;
            localTb13033SvcProdIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_SVC_PROD_ID_LEN = 4;
  	/**
	 * serializeTb13033SvcProdId
	 */
	protected void serializeTb13033SvcProdId(int tb13033SvcProdId) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033SvcProdId,TB_13033_SVC_PROD_ID_LEN)
                  ,beginTb13033SvcProdId
                  ,TB_13033_SVC_PROD_ID_LEN
                 );
            localTb13033SvcProdIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033SvcProdIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033SvcProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033SvcProdId() {	 
			return (getInt(beginTb13033SvcProdId));
   	}
     int localTb13033BaSvcProdEffTsCounter = -1;
     public boolean isTb13033BaSvcProdEffTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033BaSvcProdEffTsCounter != sharedCounter;
         localTb13033BaSvcProdEffTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_BA_SVC_PROD_EFF_TS_LEN = 26;
	/**
	 * 	serialize this Tb13033BaSvcProdEffTs
	 */
   protected void serializeTb13033BaSvcProdEffTs(char[] tb13033BaSvcProdEffTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033BaSvcProdEffTs,0,getStringValue(),beginTb13033BaSvcProdEffTs,TB_13033_BA_SVC_PROD_EFF_TS_LEN);
       localTb13033BaSvcProdEffTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033BaSvcProdEffTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTb13033BaSvcProdEffTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033BaSvcProdEffTs() {	 
   		return (substring(getStringValue(),beginTb13033BaSvcProdEffTs,beginTb13033BaSvcProdEffTs + TB_13033_BA_SVC_PROD_EFF_TS_LEN));
   	}
         int localTb13033SvcProdUniqueIdCounter = -1;
         public boolean isTb13033SvcProdUniqueIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033SvcProdUniqueIdCounter != sharedCounter;
            localTb13033SvcProdUniqueIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_SVC_PROD_UNIQUE_ID_LEN = 4;
  	/**
	 * serializeTb13033SvcProdUniqueId
	 */
	protected void serializeTb13033SvcProdUniqueId(int tb13033SvcProdUniqueId) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033SvcProdUniqueId,TB_13033_SVC_PROD_UNIQUE_ID_LEN)
                  ,beginTb13033SvcProdUniqueId
                  ,TB_13033_SVC_PROD_UNIQUE_ID_LEN
                 );
            localTb13033SvcProdUniqueIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033SvcProdUniqueIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033SvcProdUniqueId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033SvcProdUniqueId() {	 
			return (getInt(beginTb13033SvcProdUniqueId));
   	}
     int localTb13033SvcProdExpireDtCounter = -1;
     public boolean isTb13033SvcProdExpireDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033SvcProdExpireDtCounter != sharedCounter;
         localTb13033SvcProdExpireDtCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_SVC_PROD_EXPIRE_DT_LEN = 10;
	/**
	 * 	serialize this Tb13033SvcProdExpireDt
	 */
   protected void serializeTb13033SvcProdExpireDt(char[] tb13033SvcProdExpireDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033SvcProdExpireDt,0,getStringValue(),beginTb13033SvcProdExpireDt,TB_13033_SVC_PROD_EXPIRE_DT_LEN);
       localTb13033SvcProdExpireDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033SvcProdExpireDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshTb13033SvcProdExpireDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033SvcProdExpireDt() {	 
   		return (substring(getStringValue(),beginTb13033SvcProdExpireDt,beginTb13033SvcProdExpireDt + TB_13033_SVC_PROD_EXPIRE_DT_LEN));
   	}
     int localTb13033SvcProdReinstatIndCounter = -1;
     public boolean isTb13033SvcProdReinstatIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033SvcProdReinstatIndCounter != sharedCounter;
         localTb13033SvcProdReinstatIndCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_SVC_PROD_REINSTAT_IND_LEN = 1;
	/**
	 * 	serialize this Tb13033SvcProdReinstatInd
	 */
   protected void serializeTb13033SvcProdReinstatInd(char[] tb13033SvcProdReinstatInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033SvcProdReinstatInd,0,getStringValue(),beginTb13033SvcProdReinstatInd,TB_13033_SVC_PROD_REINSTAT_IND_LEN);
       localTb13033SvcProdReinstatIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033SvcProdReinstatIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTb13033SvcProdReinstatInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033SvcProdReinstatInd() {	 
   		return (substring(getStringValue(),beginTb13033SvcProdReinstatInd,beginTb13033SvcProdReinstatInd + TB_13033_SVC_PROD_REINSTAT_IND_LEN));
   	}
         int localTb13033RuleGrpIdLastCounter = -1;
         public boolean isTb13033RuleGrpIdLastModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033RuleGrpIdLastCounter != sharedCounter;
            localTb13033RuleGrpIdLastCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_RULE_GRP_ID_LAST_LEN = 4;
  	/**
	 * serializeTb13033RuleGrpIdLast
	 */
	protected void serializeTb13033RuleGrpIdLast(int tb13033RuleGrpIdLast) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033RuleGrpIdLast,TB_13033_RULE_GRP_ID_LAST_LEN)
                  ,beginTb13033RuleGrpIdLast
                  ,TB_13033_RULE_GRP_ID_LAST_LEN
                 );
            localTb13033RuleGrpIdLastCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033RuleGrpIdLastMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033RuleGrpIdLast is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033RuleGrpIdLast() {	 
			return (getInt(beginTb13033RuleGrpIdLast));
   	}
     int localTb13033BaSvcProdEndTsCounter = -1;
     public boolean isTb13033BaSvcProdEndTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033BaSvcProdEndTsCounter != sharedCounter;
         localTb13033BaSvcProdEndTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_BA_SVC_PROD_END_TS_LEN = 26;
	/**
	 * 	serialize this Tb13033BaSvcProdEndTs
	 */
   protected void serializeTb13033BaSvcProdEndTs(char[] tb13033BaSvcProdEndTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033BaSvcProdEndTs,0,getStringValue(),beginTb13033BaSvcProdEndTs,TB_13033_BA_SVC_PROD_END_TS_LEN);
       localTb13033BaSvcProdEndTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033BaSvcProdEndTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTb13033BaSvcProdEndTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033BaSvcProdEndTs() {	 
   		return (substring(getStringValue(),beginTb13033BaSvcProdEndTs,beginTb13033BaSvcProdEndTs + TB_13033_BA_SVC_PROD_END_TS_LEN));
   	}
     int localTb13033OrigSvcProdEffTsCounter = -1;
     public boolean isTb13033OrigSvcProdEffTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033OrigSvcProdEffTsCounter != sharedCounter;
         localTb13033OrigSvcProdEffTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_ORIG_SVC_PROD_EFF_TS_LEN = 26;
	/**
	 * 	serialize this Tb13033OrigSvcProdEffTs
	 */
   protected void serializeTb13033OrigSvcProdEffTs(char[] tb13033OrigSvcProdEffTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033OrigSvcProdEffTs,0,getStringValue(),beginTb13033OrigSvcProdEffTs,TB_13033_ORIG_SVC_PROD_EFF_TS_LEN);
       localTb13033OrigSvcProdEffTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033OrigSvcProdEffTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTb13033OrigSvcProdEffTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033OrigSvcProdEffTs() {	 
   		return (substring(getStringValue(),beginTb13033OrigSvcProdEffTs,beginTb13033OrigSvcProdEffTs + TB_13033_ORIG_SVC_PROD_EFF_TS_LEN));
   	}
         int localTb13033OrigSvcProdUniqIdCounter = -1;
         public boolean isTb13033OrigSvcProdUniqIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033OrigSvcProdUniqIdCounter != sharedCounter;
            localTb13033OrigSvcProdUniqIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_ORIG_SVC_PROD_UNIQ_ID_LEN = 4;
  	/**
	 * serializeTb13033OrigSvcProdUniqId
	 */
	protected void serializeTb13033OrigSvcProdUniqId(int tb13033OrigSvcProdUniqId) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033OrigSvcProdUniqId,TB_13033_ORIG_SVC_PROD_UNIQ_ID_LEN)
                  ,beginTb13033OrigSvcProdUniqId
                  ,TB_13033_ORIG_SVC_PROD_UNIQ_ID_LEN
                 );
            localTb13033OrigSvcProdUniqIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033OrigSvcProdUniqIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033OrigSvcProdUniqId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033OrigSvcProdUniqId() {	 
			return (getInt(beginTb13033OrigSvcProdUniqId));
   	}
     int localTb13033VisionUserIdCdCounter = -1;
     public boolean isTb13033VisionUserIdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033VisionUserIdCdCounter != sharedCounter;
         localTb13033VisionUserIdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_VISION_USER_ID_CD_LEN = 8;
	/**
	 * 	serialize this Tb13033VisionUserIdCd
	 */
   protected void serializeTb13033VisionUserIdCd(char[] tb13033VisionUserIdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033VisionUserIdCd,0,getStringValue(),beginTb13033VisionUserIdCd,TB_13033_VISION_USER_ID_CD_LEN);
       localTb13033VisionUserIdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033VisionUserIdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTb13033VisionUserIdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033VisionUserIdCd() {	 
   		return (substring(getStringValue(),beginTb13033VisionUserIdCd,beginTb13033VisionUserIdCd + TB_13033_VISION_USER_ID_CD_LEN));
   	}
     int localTb13033DbUseridCounter = -1;
     public boolean isTb13033DbUseridModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033DbUseridCounter != sharedCounter;
         localTb13033DbUseridCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_DB_USERID_LEN = 8;
	/**
	 * 	serialize this Tb13033DbUserid
	 */
   protected void serializeTb13033DbUserid(char[] tb13033DbUserid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033DbUserid,0,getStringValue(),beginTb13033DbUserid,TB_13033_DB_USERID_LEN);
       localTb13033DbUseridCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033DbUseridConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTb13033DbUserid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033DbUserid() {	 
   		return (substring(getStringValue(),beginTb13033DbUserid,beginTb13033DbUserid + TB_13033_DB_USERID_LEN));
   	}
     int localTb13033DbTmstampCounter = -1;
     public boolean isTb13033DbTmstampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033DbTmstampCounter != sharedCounter;
         localTb13033DbTmstampCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_DB_TMSTAMP_LEN = 26;
	/**
	 * 	serialize this Tb13033DbTmstamp
	 */
   protected void serializeTb13033DbTmstamp(char[] tb13033DbTmstamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033DbTmstamp,0,getStringValue(),beginTb13033DbTmstamp,TB_13033_DB_TMSTAMP_LEN);
       localTb13033DbTmstampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033DbTmstampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTb13033DbTmstamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033DbTmstamp() {	 
   		return (substring(getStringValue(),beginTb13033DbTmstamp,beginTb13033DbTmstamp + TB_13033_DB_TMSTAMP_LEN));
   	}
         int localTb13033OutletIdCounter = -1;
         public boolean isTb13033OutletIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033OutletIdCounter != sharedCounter;
            localTb13033OutletIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_OUTLET_ID_LEN = 4;
  	/**
	 * serializeTb13033OutletId
	 */
	protected void serializeTb13033OutletId(int tb13033OutletId) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033OutletId,TB_13033_OUTLET_ID_LEN)
                  ,beginTb13033OutletId
                  ,TB_13033_OUTLET_ID_LEN
                 );
            localTb13033OutletIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033OutletIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033OutletId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033OutletId() {	 
			return (getInt(beginTb13033OutletId));
   	}
     int localTb13033SlsRepIdCounter = -1;
     public boolean isTb13033SlsRepIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033SlsRepIdCounter != sharedCounter;
         localTb13033SlsRepIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_SLS_REP_ID_LEN = 5;
	/**
	 * 	serialize this Tb13033SlsRepId
	 */
   protected void serializeTb13033SlsRepId(char[] tb13033SlsRepId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033SlsRepId,0,getStringValue(),beginTb13033SlsRepId,TB_13033_SLS_REP_ID_LEN);
       localTb13033SlsRepIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033SlsRepIdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshTb13033SlsRepId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033SlsRepId() {	 
   		return (substring(getStringValue(),beginTb13033SlsRepId,beginTb13033SlsRepId + TB_13033_SLS_REP_ID_LEN));
   	}
     int localTb13033CreateTsCounter = -1;
     public boolean isTb13033CreateTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb13033CreateTsCounter != sharedCounter;
         localTb13033CreateTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_13033_CREATE_TS_LEN = 26;
	/**
	 * 	serialize this Tb13033CreateTs
	 */
   protected void serializeTb13033CreateTs(char[] tb13033CreateTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb13033CreateTs,0,getStringValue(),beginTb13033CreateTs,TB_13033_CREATE_TS_LEN);
       localTb13033CreateTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb13033CreateTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTb13033CreateTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb13033CreateTs() {	 
   		return (substring(getStringValue(),beginTb13033CreateTs,beginTb13033CreateTs + TB_13033_CREATE_TS_LEN));
   	}
         int localTb13033OrdLnProdUniqueIdCounter = -1;
         public boolean isTb13033OrdLnProdUniqueIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033OrdLnProdUniqueIdCounter != sharedCounter;
            localTb13033OrdLnProdUniqueIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_ORD_LN_PROD_UNIQUE_ID_LEN = 4;
  	/**
	 * serializeTb13033OrdLnProdUniqueId
	 */
	protected void serializeTb13033OrdLnProdUniqueId(int tb13033OrdLnProdUniqueId) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033OrdLnProdUniqueId,TB_13033_ORD_LN_PROD_UNIQUE_ID_LEN)
                  ,beginTb13033OrdLnProdUniqueId
                  ,TB_13033_ORD_LN_PROD_UNIQUE_ID_LEN
                 );
            localTb13033OrdLnProdUniqueIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033OrdLnProdUniqueIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033OrdLnProdUniqueId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033OrdLnProdUniqueId() {	 
			return (getInt(beginTb13033OrdLnProdUniqueId));
   	}
         int localTb13033ProdIdTrigCounter = -1;
         public boolean isTb13033ProdIdTrigModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb13033ProdIdTrigCounter != sharedCounter;
            localTb13033ProdIdTrigCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_13033_PROD_ID_TRIG_LEN = 4;
  	/**
	 * serializeTb13033ProdIdTrig
	 */
	protected void serializeTb13033ProdIdTrig(int tb13033ProdIdTrig) {
           replaceValue( //  save the value as string
                   getBinaryString( tb13033ProdIdTrig,TB_13033_PROD_ID_TRIG_LEN)
                  ,beginTb13033ProdIdTrig
                  ,TB_13033_PROD_ID_TRIG_LEN
                 );
            localTb13033ProdIdTrigCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb13033ProdIdTrigMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb13033ProdIdTrig is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb13033ProdIdTrig() {	 
			return (getInt(beginTb13033ProdIdTrig));
   	}




}
  
