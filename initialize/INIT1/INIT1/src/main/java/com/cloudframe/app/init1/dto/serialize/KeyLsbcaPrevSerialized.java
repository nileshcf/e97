package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyLsbcaPrevSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyLsbcaPrevSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyLsbcaPrevSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_LSBCA_PREV_LENGTH = 62;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsbcaPrvBlSegregateNo;
            protected  int beginLsbcaPrvBlStreamCd;
            protected  int beginLsbcaPrvJobIterationNo;
            protected  int beginLsbcaPrvCustIdNo;
            protected  int beginLsbcaPrvAcctNo;
            protected  int beginLsbcaPrvBlCycEndDt;
            protected  int beginLsbcaPrvShrGrpCompTyp;
            protected  int beginLsbcaPrvNpa;
            protected  int beginLsbcaPrvNxx;
            protected  int beginLsbcaPrvTln;
            protected  int beginLsbcaPrvBlPerFromDt;
            protected  int beginLsbcaPrvBlPerToDt;
            protected  int beginLsbcaPrvLnShrGrpNo;
            protected  int beginLsbcaPrvShrActvSeqNo;
	
	/**
	* Constructor for KeyLsbcaPrevSerialized
	**/
    public KeyLsbcaPrevSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyLsbcaPrevSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsbcaPrevSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyLsbcaPrevSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,148); // serialize this field at offset 148 by default 
    }
    
	/**
	* sets parent for this KeyLsbcaPrevSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 148 by default
    }    
	/**
	* initializes the field in KeyLsbcaPrevSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_LSBCA_PREV_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsbcaPrvBlSegregateNo = getStartOffset() + 0;	// set offset for serialization
  
             beginLsbcaPrvBlStreamCd = getStartOffset() + 2;	// set offset for serialization
  
             beginLsbcaPrvJobIterationNo = getStartOffset() + 3;	// set offset for serialization
  
             beginLsbcaPrvCustIdNo = getStartOffset() + 5;	// set offset for serialization
  
             beginLsbcaPrvAcctNo = getStartOffset() + 9;	// set offset for serialization
  
             beginLsbcaPrvBlCycEndDt = getStartOffset() + 13;	// set offset for serialization
  
             beginLsbcaPrvShrGrpCompTyp = getStartOffset() + 23;	// set offset for serialization
  
             beginLsbcaPrvNpa = getStartOffset() + 24;	// set offset for serialization
  
             beginLsbcaPrvNxx = getStartOffset() + 27;	// set offset for serialization
  
             beginLsbcaPrvTln = getStartOffset() + 30;	// set offset for serialization
  
             beginLsbcaPrvBlPerFromDt = getStartOffset() + 34;	// set offset for serialization
  
             beginLsbcaPrvBlPerToDt = getStartOffset() + 44;	// set offset for serialization
  
             beginLsbcaPrvLnShrGrpNo = getStartOffset() + 54;	// set offset for serialization
  
             beginLsbcaPrvShrActvSeqNo = getStartOffset() + 58;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsbcaPrvBlSegregateNoCounter = -1;
         public boolean isLsbcaPrvBlSegregateNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaPrvBlSegregateNoCounter != sharedCounter;
            localLsbcaPrvBlSegregateNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_PRV_BL_SEGREGATE_NO_LEN = 2;
  	/**
	 * serializeLsbcaPrvBlSegregateNo
	 */
	protected void serializeLsbcaPrvBlSegregateNo(short lsbcaPrvBlSegregateNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaPrvBlSegregateNo,LSBCA_PRV_BL_SEGREGATE_NO_LEN)
                  ,beginLsbcaPrvBlSegregateNo
                  ,LSBCA_PRV_BL_SEGREGATE_NO_LEN
                 );
            localLsbcaPrvBlSegregateNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLsbcaPrvBlSegregateNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsbcaPrvBlSegregateNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLsbcaPrvBlSegregateNo() {	 
			return (getShort(beginLsbcaPrvBlSegregateNo));
   	}
     int localLsbcaPrvBlStreamCdCounter = -1;
     public boolean isLsbcaPrvBlStreamCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvBlStreamCdCounter != sharedCounter;
         localLsbcaPrvBlStreamCdCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_BL_STREAM_CD_LEN = 1;
	/**
	 * 	serialize this LsbcaPrvBlStreamCd
	 */
   protected void serializeLsbcaPrvBlStreamCd(char[] lsbcaPrvBlStreamCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvBlStreamCd,0,getStringValue(),beginLsbcaPrvBlStreamCd,LSBCA_PRV_BL_STREAM_CD_LEN);
       localLsbcaPrvBlStreamCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvBlStreamCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvBlStreamCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvBlStreamCd() {	 
   		return (substring(getStringValue(),beginLsbcaPrvBlStreamCd,beginLsbcaPrvBlStreamCd + LSBCA_PRV_BL_STREAM_CD_LEN));
   	}
         int localLsbcaPrvJobIterationNoCounter = -1;
         public boolean isLsbcaPrvJobIterationNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaPrvJobIterationNoCounter != sharedCounter;
            localLsbcaPrvJobIterationNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_PRV_JOB_ITERATION_NO_LEN = 2;
  	/**
	 * serializeLsbcaPrvJobIterationNo
	 */
	protected void serializeLsbcaPrvJobIterationNo(short lsbcaPrvJobIterationNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaPrvJobIterationNo,LSBCA_PRV_JOB_ITERATION_NO_LEN)
                  ,beginLsbcaPrvJobIterationNo
                  ,LSBCA_PRV_JOB_ITERATION_NO_LEN
                 );
            localLsbcaPrvJobIterationNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLsbcaPrvJobIterationNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsbcaPrvJobIterationNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLsbcaPrvJobIterationNo() {	 
			return (getShort(beginLsbcaPrvJobIterationNo));
   	}
         int localLsbcaPrvCustIdNoCounter = -1;
         public boolean isLsbcaPrvCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaPrvCustIdNoCounter != sharedCounter;
            localLsbcaPrvCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_PRV_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeLsbcaPrvCustIdNo
	 */
	protected void serializeLsbcaPrvCustIdNo(int lsbcaPrvCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaPrvCustIdNo,LSBCA_PRV_CUST_ID_NO_LEN)
                  ,beginLsbcaPrvCustIdNo
                  ,LSBCA_PRV_CUST_ID_NO_LEN
                 );
            localLsbcaPrvCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsbcaPrvCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsbcaPrvCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsbcaPrvCustIdNo() {	 
			return (getInt(beginLsbcaPrvCustIdNo));
   	}
         int localLsbcaPrvAcctNoCounter = -1;
         public boolean isLsbcaPrvAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaPrvAcctNoCounter != sharedCounter;
            localLsbcaPrvAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_PRV_ACCT_NO_LEN = 4;
  	/**
	 * serializeLsbcaPrvAcctNo
	 */
	protected void serializeLsbcaPrvAcctNo(int lsbcaPrvAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaPrvAcctNo,LSBCA_PRV_ACCT_NO_LEN)
                  ,beginLsbcaPrvAcctNo
                  ,LSBCA_PRV_ACCT_NO_LEN
                 );
            localLsbcaPrvAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsbcaPrvAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsbcaPrvAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsbcaPrvAcctNo() {	 
			return (getInt(beginLsbcaPrvAcctNo));
   	}
     int localLsbcaPrvBlCycEndDtCounter = -1;
     public boolean isLsbcaPrvBlCycEndDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvBlCycEndDtCounter != sharedCounter;
         localLsbcaPrvBlCycEndDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_BL_CYC_END_DT_LEN = 10;
	/**
	 * 	serialize this LsbcaPrvBlCycEndDt
	 */
   protected void serializeLsbcaPrvBlCycEndDt(char[] lsbcaPrvBlCycEndDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvBlCycEndDt,0,getStringValue(),beginLsbcaPrvBlCycEndDt,LSBCA_PRV_BL_CYC_END_DT_LEN);
       localLsbcaPrvBlCycEndDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvBlCycEndDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvBlCycEndDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvBlCycEndDt() {	 
   		return (substring(getStringValue(),beginLsbcaPrvBlCycEndDt,beginLsbcaPrvBlCycEndDt + LSBCA_PRV_BL_CYC_END_DT_LEN));
   	}
     int localLsbcaPrvShrGrpCompTypCounter = -1;
     public boolean isLsbcaPrvShrGrpCompTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvShrGrpCompTypCounter != sharedCounter;
         localLsbcaPrvShrGrpCompTypCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_SHR_GRP_COMP_TYP_LEN = 1;
	/**
	 * 	serialize this LsbcaPrvShrGrpCompTyp
	 */
   protected void serializeLsbcaPrvShrGrpCompTyp(char[] lsbcaPrvShrGrpCompTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvShrGrpCompTyp,0,getStringValue(),beginLsbcaPrvShrGrpCompTyp,LSBCA_PRV_SHR_GRP_COMP_TYP_LEN);
       localLsbcaPrvShrGrpCompTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvShrGrpCompTypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvShrGrpCompTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvShrGrpCompTyp() {	 
   		return (substring(getStringValue(),beginLsbcaPrvShrGrpCompTyp,beginLsbcaPrvShrGrpCompTyp + LSBCA_PRV_SHR_GRP_COMP_TYP_LEN));
   	}
     int localLsbcaPrvNpaCounter = -1;
     public boolean isLsbcaPrvNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvNpaCounter != sharedCounter;
         localLsbcaPrvNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_NPA_LEN = 3;
	/**
	 * 	serialize this LsbcaPrvNpa
	 */
   protected void serializeLsbcaPrvNpa(char[] lsbcaPrvNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvNpa,0,getStringValue(),beginLsbcaPrvNpa,LSBCA_PRV_NPA_LEN);
       localLsbcaPrvNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvNpa() {	 
   		return (substring(getStringValue(),beginLsbcaPrvNpa,beginLsbcaPrvNpa + LSBCA_PRV_NPA_LEN));
   	}
     int localLsbcaPrvNxxCounter = -1;
     public boolean isLsbcaPrvNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvNxxCounter != sharedCounter;
         localLsbcaPrvNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_NXX_LEN = 3;
	/**
	 * 	serialize this LsbcaPrvNxx
	 */
   protected void serializeLsbcaPrvNxx(char[] lsbcaPrvNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvNxx,0,getStringValue(),beginLsbcaPrvNxx,LSBCA_PRV_NXX_LEN);
       localLsbcaPrvNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvNxx() {	 
   		return (substring(getStringValue(),beginLsbcaPrvNxx,beginLsbcaPrvNxx + LSBCA_PRV_NXX_LEN));
   	}
     int localLsbcaPrvTlnCounter = -1;
     public boolean isLsbcaPrvTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvTlnCounter != sharedCounter;
         localLsbcaPrvTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_TLN_LEN = 4;
	/**
	 * 	serialize this LsbcaPrvTln
	 */
   protected void serializeLsbcaPrvTln(char[] lsbcaPrvTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvTln,0,getStringValue(),beginLsbcaPrvTln,LSBCA_PRV_TLN_LEN);
       localLsbcaPrvTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvTln() {	 
   		return (substring(getStringValue(),beginLsbcaPrvTln,beginLsbcaPrvTln + LSBCA_PRV_TLN_LEN));
   	}
     int localLsbcaPrvBlPerFromDtCounter = -1;
     public boolean isLsbcaPrvBlPerFromDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvBlPerFromDtCounter != sharedCounter;
         localLsbcaPrvBlPerFromDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_BL_PER_FROM_DT_LEN = 10;
	/**
	 * 	serialize this LsbcaPrvBlPerFromDt
	 */
   protected void serializeLsbcaPrvBlPerFromDt(char[] lsbcaPrvBlPerFromDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvBlPerFromDt,0,getStringValue(),beginLsbcaPrvBlPerFromDt,LSBCA_PRV_BL_PER_FROM_DT_LEN);
       localLsbcaPrvBlPerFromDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvBlPerFromDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvBlPerFromDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvBlPerFromDt() {	 
   		return (substring(getStringValue(),beginLsbcaPrvBlPerFromDt,beginLsbcaPrvBlPerFromDt + LSBCA_PRV_BL_PER_FROM_DT_LEN));
   	}
     int localLsbcaPrvBlPerToDtCounter = -1;
     public boolean isLsbcaPrvBlPerToDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsbcaPrvBlPerToDtCounter != sharedCounter;
         localLsbcaPrvBlPerToDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LSBCA_PRV_BL_PER_TO_DT_LEN = 10;
	/**
	 * 	serialize this LsbcaPrvBlPerToDt
	 */
   protected void serializeLsbcaPrvBlPerToDt(char[] lsbcaPrvBlPerToDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsbcaPrvBlPerToDt,0,getStringValue(),beginLsbcaPrvBlPerToDt,LSBCA_PRV_BL_PER_TO_DT_LEN);
       localLsbcaPrvBlPerToDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsbcaPrvBlPerToDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLsbcaPrvBlPerToDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsbcaPrvBlPerToDt() {	 
   		return (substring(getStringValue(),beginLsbcaPrvBlPerToDt,beginLsbcaPrvBlPerToDt + LSBCA_PRV_BL_PER_TO_DT_LEN));
   	}
         int localLsbcaPrvLnShrGrpNoCounter = -1;
         public boolean isLsbcaPrvLnShrGrpNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaPrvLnShrGrpNoCounter != sharedCounter;
            localLsbcaPrvLnShrGrpNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_PRV_LN_SHR_GRP_NO_LEN = 4;
  	/**
	 * serializeLsbcaPrvLnShrGrpNo
	 */
	protected void serializeLsbcaPrvLnShrGrpNo(int lsbcaPrvLnShrGrpNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaPrvLnShrGrpNo,LSBCA_PRV_LN_SHR_GRP_NO_LEN)
                  ,beginLsbcaPrvLnShrGrpNo
                  ,LSBCA_PRV_LN_SHR_GRP_NO_LEN
                 );
            localLsbcaPrvLnShrGrpNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsbcaPrvLnShrGrpNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsbcaPrvLnShrGrpNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsbcaPrvLnShrGrpNo() {	 
			return (getInt(beginLsbcaPrvLnShrGrpNo));
   	}
         int localLsbcaPrvShrActvSeqNoCounter = -1;
         public boolean isLsbcaPrvShrActvSeqNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsbcaPrvShrActvSeqNoCounter != sharedCounter;
            localLsbcaPrvShrActvSeqNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSBCA_PRV_SHR_ACTV_SEQ_NO_LEN = 4;
  	/**
	 * serializeLsbcaPrvShrActvSeqNo
	 */
	protected void serializeLsbcaPrvShrActvSeqNo(int lsbcaPrvShrActvSeqNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsbcaPrvShrActvSeqNo,LSBCA_PRV_SHR_ACTV_SEQ_NO_LEN)
                  ,beginLsbcaPrvShrActvSeqNo
                  ,LSBCA_PRV_SHR_ACTV_SEQ_NO_LEN
                 );
            localLsbcaPrvShrActvSeqNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsbcaPrvShrActvSeqNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsbcaPrvShrActvSeqNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsbcaPrvShrActvSeqNo() {	 
			return (getInt(beginLsbcaPrvShrActvSeqNo));
   	}




}
  
