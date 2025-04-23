package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlm2tPromoCustMtnRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Rlm2tPromoCustMtnRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlm2tPromoCustMtnRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLM_2T_PROMO_CUST_MTN_REC_LENGTH = 178;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlm2tCustIdNo;
            protected  int beginRlm2tNpa;
            protected  int beginRlm2tNxx;
            protected  int beginRlm2tTln;
            protected  int beginRlm2tMtnEffDt;
            protected  int beginRlm2tOffrTypId;
            protected  int beginRlm2tOffrTypCd;
            protected  int beginRlm2tFreeUsgMin;
            protected  int beginRlm2tAllowTypCd;
            protected  int beginRlm2tAllowCrTyp;
            protected  int beginRlm2tFreeTmLeft;
            protected  int beginRlm2tPromoConnectId;
            protected  int beginRlm2tLnOfSvcIdNoP2;
            protected  int beginRlm2tLnOfSvcIdNoP1;
            protected  int beginRlm2tLnSvcProdEffTs;
            protected  int beginRlm2tLnSvcProdEndTs;
            protected  int beginRlm2tAcctNo;
            protected  int beginRlm2tBlSegregateNo;
            protected  int beginRlm2tJobIterationNo;
            protected  int beginRlm2tBlStreamCd;
            protected  int beginRlm2tDbUserid;
            protected  int beginRlm2tDbTmstamp;
	
	/**
	* Constructor for Rlm2tPromoCustMtnRecSerialized
	**/
    public Rlm2tPromoCustMtnRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Rlm2tPromoCustMtnRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLM_2T_PROMO_CUST_MTN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlm2tCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginRlm2tNpa = getStartOffset() + 4;	// set offset for serialization
  
             beginRlm2tNxx = getStartOffset() + 7;	// set offset for serialization
  
             beginRlm2tTln = getStartOffset() + 10;	// set offset for serialization
  
             beginRlm2tMtnEffDt = getStartOffset() + 14;	// set offset for serialization
  
             beginRlm2tOffrTypId = getStartOffset() + 24;	// set offset for serialization
  
             beginRlm2tOffrTypCd = getStartOffset() + 28;	// set offset for serialization
  
             beginRlm2tFreeUsgMin = getStartOffset() + 30;	// set offset for serialization
  
             beginRlm2tAllowTypCd = getStartOffset() + 34;	// set offset for serialization
  
             beginRlm2tAllowCrTyp = getStartOffset() + 36;	// set offset for serialization
  
  
  
             beginRlm2tFreeTmLeft = getStartOffset() + 57;	// set offset for serialization
  
             beginRlm2tPromoConnectId = getStartOffset() + 67;	// set offset for serialization
  
             beginRlm2tLnOfSvcIdNoP2 = getStartOffset() + 71;	// set offset for serialization
  
             beginRlm2tLnOfSvcIdNoP1 = getStartOffset() + 79;	// set offset for serialization
  
             beginRlm2tLnSvcProdEffTs = getStartOffset() + 83;	// set offset for serialization
  
             beginRlm2tLnSvcProdEndTs = getStartOffset() + 109;	// set offset for serialization
  
             beginRlm2tAcctNo = getStartOffset() + 135;	// set offset for serialization
  
             beginRlm2tBlSegregateNo = getStartOffset() + 139;	// set offset for serialization
  
             beginRlm2tJobIterationNo = getStartOffset() + 141;	// set offset for serialization
  
             beginRlm2tBlStreamCd = getStartOffset() + 143;	// set offset for serialization
  
             beginRlm2tDbUserid = getStartOffset() + 144;	// set offset for serialization
  
             beginRlm2tDbTmstamp = getStartOffset() + 152;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localRlm2tCustIdNoCounter = -1;
         public boolean isRlm2tCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tCustIdNoCounter != sharedCounter;
            localRlm2tCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeRlm2tCustIdNo
	 */
	protected void serializeRlm2tCustIdNo(int rlm2tCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tCustIdNo,RLM_2T_CUST_ID_NO_LEN)
                  ,beginRlm2tCustIdNo
                  ,RLM_2T_CUST_ID_NO_LEN
                 );
            localRlm2tCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlm2tCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlm2tCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlm2tCustIdNo() {	 
			return (getInt(beginRlm2tCustIdNo));
   	}
     int localRlm2tNpaCounter = -1;
     public boolean isRlm2tNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tNpaCounter != sharedCounter;
         localRlm2tNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_NPA_LEN = 3;
	/**
	 * 	serialize this Rlm2tNpa
	 */
   protected void serializeRlm2tNpa(char[] rlm2tNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tNpa,0,getStringValue(),beginRlm2tNpa,RLM_2T_NPA_LEN);
       localRlm2tNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRlm2tNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tNpa() {	 
   		return (substring(getStringValue(),beginRlm2tNpa,beginRlm2tNpa + RLM_2T_NPA_LEN));
   	}
     int localRlm2tNxxCounter = -1;
     public boolean isRlm2tNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tNxxCounter != sharedCounter;
         localRlm2tNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_NXX_LEN = 3;
	/**
	 * 	serialize this Rlm2tNxx
	 */
   protected void serializeRlm2tNxx(char[] rlm2tNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tNxx,0,getStringValue(),beginRlm2tNxx,RLM_2T_NXX_LEN);
       localRlm2tNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRlm2tNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tNxx() {	 
   		return (substring(getStringValue(),beginRlm2tNxx,beginRlm2tNxx + RLM_2T_NXX_LEN));
   	}
     int localRlm2tTlnCounter = -1;
     public boolean isRlm2tTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tTlnCounter != sharedCounter;
         localRlm2tTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_TLN_LEN = 4;
	/**
	 * 	serialize this Rlm2tTln
	 */
   protected void serializeRlm2tTln(char[] rlm2tTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tTln,0,getStringValue(),beginRlm2tTln,RLM_2T_TLN_LEN);
       localRlm2tTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRlm2tTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tTln() {	 
   		return (substring(getStringValue(),beginRlm2tTln,beginRlm2tTln + RLM_2T_TLN_LEN));
   	}
     int localRlm2tMtnEffDtCounter = -1;
     public boolean isRlm2tMtnEffDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tMtnEffDtCounter != sharedCounter;
         localRlm2tMtnEffDtCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_MTN_EFF_DT_LEN = 10;
	/**
	 * 	serialize this Rlm2tMtnEffDt
	 */
   protected void serializeRlm2tMtnEffDt(char[] rlm2tMtnEffDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tMtnEffDt,0,getStringValue(),beginRlm2tMtnEffDt,RLM_2T_MTN_EFF_DT_LEN);
       localRlm2tMtnEffDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tMtnEffDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRlm2tMtnEffDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tMtnEffDt() {	 
   		return (substring(getStringValue(),beginRlm2tMtnEffDt,beginRlm2tMtnEffDt + RLM_2T_MTN_EFF_DT_LEN));
   	}
         int localRlm2tOffrTypIdCounter = -1;
         public boolean isRlm2tOffrTypIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tOffrTypIdCounter != sharedCounter;
            localRlm2tOffrTypIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_OFFR_TYP_ID_LEN = 4;
  	/**
	 * serializeRlm2tOffrTypId
	 */
	protected void serializeRlm2tOffrTypId(int rlm2tOffrTypId) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tOffrTypId,RLM_2T_OFFR_TYP_ID_LEN)
                  ,beginRlm2tOffrTypId
                  ,RLM_2T_OFFR_TYP_ID_LEN
                 );
            localRlm2tOffrTypIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlm2tOffrTypIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlm2tOffrTypId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlm2tOffrTypId() {	 
			return (getInt(beginRlm2tOffrTypId));
   	}
     int localRlm2tOffrTypCdCounter = -1;
     public boolean isRlm2tOffrTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tOffrTypCdCounter != sharedCounter;
         localRlm2tOffrTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_OFFR_TYP_CD_LEN = 2;
	/**
	 * 	serialize this Rlm2tOffrTypCd
	 */
   protected void serializeRlm2tOffrTypCd(char[] rlm2tOffrTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tOffrTypCd,0,getStringValue(),beginRlm2tOffrTypCd,RLM_2T_OFFR_TYP_CD_LEN);
       localRlm2tOffrTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tOffrTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlm2tOffrTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tOffrTypCd() {	 
   		return (substring(getStringValue(),beginRlm2tOffrTypCd,beginRlm2tOffrTypCd + RLM_2T_OFFR_TYP_CD_LEN));
   	}
         int localRlm2tFreeUsgMinCounter = -1;
         public boolean isRlm2tFreeUsgMinModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tFreeUsgMinCounter != sharedCounter;
            localRlm2tFreeUsgMinCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_FREE_USG_MIN_LEN = 4;
  	/**
	 * serializeRlm2tFreeUsgMin
	 */
	protected void serializeRlm2tFreeUsgMin(int rlm2tFreeUsgMin) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tFreeUsgMin,RLM_2T_FREE_USG_MIN_LEN)
                  ,beginRlm2tFreeUsgMin
                  ,RLM_2T_FREE_USG_MIN_LEN
                 );
            localRlm2tFreeUsgMinCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlm2tFreeUsgMinMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlm2tFreeUsgMin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlm2tFreeUsgMin() {	 
			return (getInt(beginRlm2tFreeUsgMin));
   	}
     int localRlm2tAllowTypCdCounter = -1;
     public boolean isRlm2tAllowTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tAllowTypCdCounter != sharedCounter;
         localRlm2tAllowTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_ALLOW_TYP_CD_LEN = 2;
	/**
	 * 	serialize this Rlm2tAllowTypCd
	 */
   protected void serializeRlm2tAllowTypCd(char[] rlm2tAllowTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tAllowTypCd,0,getStringValue(),beginRlm2tAllowTypCd,RLM_2T_ALLOW_TYP_CD_LEN);
       localRlm2tAllowTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tAllowTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRlm2tAllowTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tAllowTypCd() {	 
   		return (substring(getStringValue(),beginRlm2tAllowTypCd,beginRlm2tAllowTypCd + RLM_2T_ALLOW_TYP_CD_LEN));
   	}
     int localRlm2tAllowCrTypCounter = -1;
     public boolean isRlm2tAllowCrTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tAllowCrTypCounter != sharedCounter;
         localRlm2tAllowCrTypCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_ALLOW_CR_TYP_LEN = 1;
	/**
	 * 	serialize this Rlm2tAllowCrTyp
	 */
   protected void serializeRlm2tAllowCrTyp(char[] rlm2tAllowCrTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tAllowCrTyp,0,getStringValue(),beginRlm2tAllowCrTyp,RLM_2T_ALLOW_CR_TYP_LEN);
       localRlm2tAllowCrTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tAllowCrTypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlm2tAllowCrTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tAllowCrTyp() {	 
   		return (substring(getStringValue(),beginRlm2tAllowCrTyp,beginRlm2tAllowCrTyp + RLM_2T_ALLOW_CR_TYP_LEN));
   	}
        int localRlm2tFreeTmLeftCounter = -1;
        public boolean isRlm2tFreeTmLeftModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlm2tFreeTmLeftCounter != sharedCounter;
           localRlm2tFreeTmLeftCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlm2tFreeTmLeftIsNumeric() {
	      return decimalIsNumeric(beginRlm2tFreeTmLeft,RLM_2T_FREE_TM_LEFT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RLM_2T_FREE_TM_LEFT_LEN = 10;
  	/**
	 * 	serializeRlm2tFreeTmLeft
	 */
	protected void serializeRlm2tFreeTmLeft(long rlm2tFreeTmLeft) {
		   putDecimal(beginRlm2tFreeTmLeft,rlm2tFreeTmLeft,RLM_2T_FREE_TM_LEFT_LEN,true);
   }
   

   protected long checkRlm2tFreeTmLeftMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1E /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRlm2tFreeTmLeft is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRlm2tFreeTmLeft() throws CFException {	
   	try { 
		 return (getLongDecimal(beginRlm2tFreeTmLeft,RLM_2T_FREE_TM_LEFT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlm2tFreeTmLeft", beginRlm2tFreeTmLeft,RLM_2T_FREE_TM_LEFT_LEN);
     }
   	}
         int localRlm2tPromoConnectIdCounter = -1;
         public boolean isRlm2tPromoConnectIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tPromoConnectIdCounter != sharedCounter;
            localRlm2tPromoConnectIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_PROMO_CONNECT_ID_LEN = 4;
  	/**
	 * serializeRlm2tPromoConnectId
	 */
	protected void serializeRlm2tPromoConnectId(int rlm2tPromoConnectId) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tPromoConnectId,RLM_2T_PROMO_CONNECT_ID_LEN)
                  ,beginRlm2tPromoConnectId
                  ,RLM_2T_PROMO_CONNECT_ID_LEN
                 );
            localRlm2tPromoConnectIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlm2tPromoConnectIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlm2tPromoConnectId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlm2tPromoConnectId() {	 
			return (getInt(beginRlm2tPromoConnectId));
   	}
         int localRlm2tLnOfSvcIdNoP2Counter = -1;
         public boolean isRlm2tLnOfSvcIdNoP2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tLnOfSvcIdNoP2Counter != sharedCounter;
            localRlm2tLnOfSvcIdNoP2Counter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_LN_OF_SVC_ID_NO_P_2_LEN = 8;
  	/**
	 * serializeRlm2tLnOfSvcIdNoP2
	 */
	protected void serializeRlm2tLnOfSvcIdNoP2(long rlm2tLnOfSvcIdNoP2) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tLnOfSvcIdNoP2,RLM_2T_LN_OF_SVC_ID_NO_P_2_LEN)
                  ,beginRlm2tLnOfSvcIdNoP2
                  ,RLM_2T_LN_OF_SVC_ID_NO_P_2_LEN
                 );
            localRlm2tLnOfSvcIdNoP2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkRlm2tLnOfSvcIdNoP2MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     /**
	 *	refreshRlm2tLnOfSvcIdNoP2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshRlm2tLnOfSvcIdNoP2() {	 
			return (getLong(beginRlm2tLnOfSvcIdNoP2));
   	}
        int localRlm2tLnOfSvcIdNoP1Counter = -1;
        public boolean isRlm2tLnOfSvcIdNoP1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlm2tLnOfSvcIdNoP1Counter != sharedCounter;
           localRlm2tLnOfSvcIdNoP1Counter = sharedCounter; return hasModified; 
        }
	    public boolean rlm2tLnOfSvcIdNoP1IsNumeric() {
	      return decimalIsNumeric(beginRlm2tLnOfSvcIdNoP1,RLM_2T_LN_OF_SVC_ID_NO_P_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RLM_2T_LN_OF_SVC_ID_NO_P_1_LEN = 4;
  	/**
	 * 	serializeRlm2tLnOfSvcIdNoP1
	 */
	protected void serializeRlm2tLnOfSvcIdNoP1(int rlm2tLnOfSvcIdNoP1) {
		   putDecimal(beginRlm2tLnOfSvcIdNoP1,rlm2tLnOfSvcIdNoP1,RLM_2T_LN_OF_SVC_ID_NO_P_1_LEN,true);
   }
   

   protected int checkRlm2tLnOfSvcIdNoP1MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshRlm2tLnOfSvcIdNoP1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlm2tLnOfSvcIdNoP1() throws CFException {	
   	try { 
		 return (getIntDecimal(beginRlm2tLnOfSvcIdNoP1,RLM_2T_LN_OF_SVC_ID_NO_P_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlm2tLnOfSvcIdNoP1", beginRlm2tLnOfSvcIdNoP1,RLM_2T_LN_OF_SVC_ID_NO_P_1_LEN);
     }
   	}
     int localRlm2tLnSvcProdEffTsCounter = -1;
     public boolean isRlm2tLnSvcProdEffTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tLnSvcProdEffTsCounter != sharedCounter;
         localRlm2tLnSvcProdEffTsCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_LN_SVC_PROD_EFF_TS_LEN = 26;
	/**
	 * 	serialize this Rlm2tLnSvcProdEffTs
	 */
   protected void serializeRlm2tLnSvcProdEffTs(char[] rlm2tLnSvcProdEffTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tLnSvcProdEffTs,0,getStringValue(),beginRlm2tLnSvcProdEffTs,RLM_2T_LN_SVC_PROD_EFF_TS_LEN);
       localRlm2tLnSvcProdEffTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tLnSvcProdEffTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRlm2tLnSvcProdEffTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tLnSvcProdEffTs() {	 
   		return (substring(getStringValue(),beginRlm2tLnSvcProdEffTs,beginRlm2tLnSvcProdEffTs + RLM_2T_LN_SVC_PROD_EFF_TS_LEN));
   	}
     int localRlm2tLnSvcProdEndTsCounter = -1;
     public boolean isRlm2tLnSvcProdEndTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tLnSvcProdEndTsCounter != sharedCounter;
         localRlm2tLnSvcProdEndTsCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_LN_SVC_PROD_END_TS_LEN = 26;
	/**
	 * 	serialize this Rlm2tLnSvcProdEndTs
	 */
   protected void serializeRlm2tLnSvcProdEndTs(char[] rlm2tLnSvcProdEndTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tLnSvcProdEndTs,0,getStringValue(),beginRlm2tLnSvcProdEndTs,RLM_2T_LN_SVC_PROD_END_TS_LEN);
       localRlm2tLnSvcProdEndTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tLnSvcProdEndTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRlm2tLnSvcProdEndTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tLnSvcProdEndTs() {	 
   		return (substring(getStringValue(),beginRlm2tLnSvcProdEndTs,beginRlm2tLnSvcProdEndTs + RLM_2T_LN_SVC_PROD_END_TS_LEN));
   	}
         int localRlm2tAcctNoCounter = -1;
         public boolean isRlm2tAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tAcctNoCounter != sharedCounter;
            localRlm2tAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_ACCT_NO_LEN = 4;
  	/**
	 * serializeRlm2tAcctNo
	 */
	protected void serializeRlm2tAcctNo(int rlm2tAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tAcctNo,RLM_2T_ACCT_NO_LEN)
                  ,beginRlm2tAcctNo
                  ,RLM_2T_ACCT_NO_LEN
                 );
            localRlm2tAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRlm2tAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRlm2tAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRlm2tAcctNo() {	 
			return (getInt(beginRlm2tAcctNo));
   	}
         int localRlm2tBlSegregateNoCounter = -1;
         public boolean isRlm2tBlSegregateNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tBlSegregateNoCounter != sharedCounter;
            localRlm2tBlSegregateNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_BL_SEGREGATE_NO_LEN = 2;
  	/**
	 * serializeRlm2tBlSegregateNo
	 */
	protected void serializeRlm2tBlSegregateNo(short rlm2tBlSegregateNo) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tBlSegregateNo,RLM_2T_BL_SEGREGATE_NO_LEN)
                  ,beginRlm2tBlSegregateNo
                  ,RLM_2T_BL_SEGREGATE_NO_LEN
                 );
            localRlm2tBlSegregateNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRlm2tBlSegregateNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRlm2tBlSegregateNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRlm2tBlSegregateNo() {	 
			return (getShort(beginRlm2tBlSegregateNo));
   	}
         int localRlm2tJobIterationNoCounter = -1;
         public boolean isRlm2tJobIterationNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRlm2tJobIterationNoCounter != sharedCounter;
            localRlm2tJobIterationNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int RLM_2T_JOB_ITERATION_NO_LEN = 2;
  	/**
	 * serializeRlm2tJobIterationNo
	 */
	protected void serializeRlm2tJobIterationNo(short rlm2tJobIterationNo) {
           replaceValue( //  save the value as string
                   getBinaryString( rlm2tJobIterationNo,RLM_2T_JOB_ITERATION_NO_LEN)
                  ,beginRlm2tJobIterationNo
                  ,RLM_2T_JOB_ITERATION_NO_LEN
                 );
            localRlm2tJobIterationNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRlm2tJobIterationNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRlm2tJobIterationNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRlm2tJobIterationNo() {	 
			return (getShort(beginRlm2tJobIterationNo));
   	}
     int localRlm2tBlStreamCdCounter = -1;
     public boolean isRlm2tBlStreamCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tBlStreamCdCounter != sharedCounter;
         localRlm2tBlStreamCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_BL_STREAM_CD_LEN = 1;
	/**
	 * 	serialize this Rlm2tBlStreamCd
	 */
   protected void serializeRlm2tBlStreamCd(char[] rlm2tBlStreamCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tBlStreamCd,0,getStringValue(),beginRlm2tBlStreamCd,RLM_2T_BL_STREAM_CD_LEN);
       localRlm2tBlStreamCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tBlStreamCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRlm2tBlStreamCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tBlStreamCd() {	 
   		return (substring(getStringValue(),beginRlm2tBlStreamCd,beginRlm2tBlStreamCd + RLM_2T_BL_STREAM_CD_LEN));
   	}
     int localRlm2tDbUseridCounter = -1;
     public boolean isRlm2tDbUseridModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tDbUseridCounter != sharedCounter;
         localRlm2tDbUseridCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_DB_USERID_LEN = 8;
	/**
	 * 	serialize this Rlm2tDbUserid
	 */
   protected void serializeRlm2tDbUserid(char[] rlm2tDbUserid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tDbUserid,0,getStringValue(),beginRlm2tDbUserid,RLM_2T_DB_USERID_LEN);
       localRlm2tDbUseridCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tDbUseridConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRlm2tDbUserid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tDbUserid() {	 
   		return (substring(getStringValue(),beginRlm2tDbUserid,beginRlm2tDbUserid + RLM_2T_DB_USERID_LEN));
   	}
     int localRlm2tDbTmstampCounter = -1;
     public boolean isRlm2tDbTmstampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlm2tDbTmstampCounter != sharedCounter;
         localRlm2tDbTmstampCounter = sharedCounter; return hasModified;
     }
	protected static final int RLM_2T_DB_TMSTAMP_LEN = 26;
	/**
	 * 	serialize this Rlm2tDbTmstamp
	 */
   protected void serializeRlm2tDbTmstamp(char[] rlm2tDbTmstamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlm2tDbTmstamp,0,getStringValue(),beginRlm2tDbTmstamp,RLM_2T_DB_TMSTAMP_LEN);
       localRlm2tDbTmstampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlm2tDbTmstampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRlm2tDbTmstamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlm2tDbTmstamp() {	 
   		return (substring(getStringValue(),beginRlm2tDbTmstamp,beginRlm2tDbTmstamp + RLM_2T_DB_TMSTAMP_LEN));
   	}




}
  
