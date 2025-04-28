package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ProgramCountersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ProgramCountersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProgramCountersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROGRAM_COUNTERS_LENGTH = 340;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInvoiceCtr;
            protected  int beginJitrInvCtr;
            protected  int beginCommitCtr;
            protected  int beginQuotient;
            protected  int beginRemainder;
            protected  int beginAcctCpduCtr;
            protected  int beginAcctUsageCtr;
            protected  int beginAcctLsbcaCtr;
            protected  int beginAcctLsgremCtr;
            protected  int beginAcctDataChgAmt;
            protected  int beginBillCpduCtr;
            protected  int beginBillUsageCtr;
            protected  int beginBillLsbcaCtr;
            protected  int beginBillLsgremCtr;
            protected  int beginBillDataChgAmt;
            protected  int beginUbCpduCtr;
            protected  int beginUbBillmsgCtr;
            protected  int beginUbUsageCtr;
            protected  int beginUbDataChgAmt;
            protected  int beginTotDataChgAmt;
            protected  int beginUbLsbcaCtr;
            protected  int beginUbLsgremCtr;
            protected  int beginLnshrgCtr;
            protected  int beginUbAtdsumCtr;
            protected  int beginFlgCpduCtr;
            protected  int beginFlgUsageCtr;
            protected  int beginFlgLsbcaCtr;
            protected  int beginFlgLsgremCtr;
            protected  int beginFlgAtdsumCtr;
            protected  int beginCustFlgUsgCtr;
            protected  int beginCustUsgCtr;
            protected  int beginFgvAlwCount;
            protected  int beginOkdCpduCtr;
            protected  int beginOkdUsageCtr;
            protected  int beginOkdLsbcaCtr;
            protected  int beginOkdLsgremCtr;
            protected  int beginOkdAtdsumCtr;
            protected  int beginOutCpduCtr;
            protected  int beginOutBillmsgCtr;
            protected  int beginBypassBillmsgCtr;
            protected  int beginOutUsageCtr;
            protected  int beginOutLsbcaCtr;
            protected  int beginOutLsgremCtr;
            protected  int beginOutAtdsumCtr;
            protected  int beginErrAcctCtr;
            protected  int beginErrThreshold;
            protected  int beginAlpPlanCtr;
            protected  int beginSfoPlanCtr;
            protected  int beginSpoAlwCtr;
            protected  int beginGlbProdCtr;
            protected  int beginSvcProdCtr;
            protected  int beginSpoProdCtr;
            protected  int beginAlpCpduCtr;
            protected  int beginSfoCpduCtr;
            protected  int beginNpspoCpduCtr;
            protected  int beginComCpduCtr;
            protected  int beginVisCreateCtr;
            protected  int beginDupSpoAlwCtr;
            protected  int beginDiscArrayCtr;
            protected  int beginRevoRejectCtr;
            protected  int beginBasvcprdCtr;
            protected  int beginDtsvcalwCtr;
            protected  int beginSfoplanCtr01;
            protected  int beginSpoallowCtr;
            protected  int beginMtnfileCtr;
            protected  int beginU07fileCtr;
            protected  int beginRccycCtr;
            protected  int beginM2mAlwCtr;
            protected  int beginM2mpromoCtr;
            protected  int beginMtnStatCtr;
            protected  int beginM2mTermCtr;
            protected  int beginTrlCpduCnt;
            protected  int beginTrlUsageCnt;
            protected  int beginTrlLsbcaCnt;
            protected  int beginTrlLsgremCnt;
            protected  int beginTrlAtdsumCnt;
            protected  int beginSaveI;
            protected  int beginCount;
            protected  int beginIdx;
	
	/**
	* Constructor for ProgramCountersSerialized
	**/
    public ProgramCountersSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProgramCountersSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramCountersSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProgramCountersSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ProgramCountersSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ProgramCountersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROGRAM_COUNTERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInvoiceCtr = getStartOffset() + 0;	// set offset for serialization
  
             beginJitrInvCtr = getStartOffset() + 4;	// set offset for serialization
  
             beginCommitCtr = getStartOffset() + 8;	// set offset for serialization
  
             beginQuotient = getStartOffset() + 12;	// set offset for serialization
  
             beginRemainder = getStartOffset() + 16;	// set offset for serialization
  
             beginAcctCpduCtr = getStartOffset() + 20;	// set offset for serialization
  
             beginAcctUsageCtr = getStartOffset() + 24;	// set offset for serialization
  
             beginAcctLsbcaCtr = getStartOffset() + 28;	// set offset for serialization
  
             beginAcctLsgremCtr = getStartOffset() + 32;	// set offset for serialization
  
             beginAcctDataChgAmt = getStartOffset() + 36;	// set offset for serialization
  
             beginBillCpduCtr = getStartOffset() + 46;	// set offset for serialization
  
             beginBillUsageCtr = getStartOffset() + 50;	// set offset for serialization
  
             beginBillLsbcaCtr = getStartOffset() + 54;	// set offset for serialization
  
             beginBillLsgremCtr = getStartOffset() + 58;	// set offset for serialization
  
             beginBillDataChgAmt = getStartOffset() + 62;	// set offset for serialization
  
             beginUbCpduCtr = getStartOffset() + 72;	// set offset for serialization
  
             beginUbBillmsgCtr = getStartOffset() + 76;	// set offset for serialization
  
             beginUbUsageCtr = getStartOffset() + 80;	// set offset for serialization
  
             beginUbDataChgAmt = getStartOffset() + 84;	// set offset for serialization
  
             beginTotDataChgAmt = getStartOffset() + 94;	// set offset for serialization
  
             beginUbLsbcaCtr = getStartOffset() + 104;	// set offset for serialization
  
             beginUbLsgremCtr = getStartOffset() + 108;	// set offset for serialization
  
             beginLnshrgCtr = getStartOffset() + 112;	// set offset for serialization
  
             beginUbAtdsumCtr = getStartOffset() + 116;	// set offset for serialization
  
             beginFlgCpduCtr = getStartOffset() + 120;	// set offset for serialization
  
             beginFlgUsageCtr = getStartOffset() + 124;	// set offset for serialization
  
             beginFlgLsbcaCtr = getStartOffset() + 128;	// set offset for serialization
  
             beginFlgLsgremCtr = getStartOffset() + 132;	// set offset for serialization
  
             beginFlgAtdsumCtr = getStartOffset() + 136;	// set offset for serialization
  
             beginCustFlgUsgCtr = getStartOffset() + 140;	// set offset for serialization
  
             beginCustUsgCtr = getStartOffset() + 146;	// set offset for serialization
  
             beginFgvAlwCount = getStartOffset() + 152;	// set offset for serialization
  
             beginOkdCpduCtr = getStartOffset() + 158;	// set offset for serialization
  
             beginOkdUsageCtr = getStartOffset() + 162;	// set offset for serialization
  
             beginOkdLsbcaCtr = getStartOffset() + 166;	// set offset for serialization
  
             beginOkdLsgremCtr = getStartOffset() + 170;	// set offset for serialization
  
             beginOkdAtdsumCtr = getStartOffset() + 174;	// set offset for serialization
  
             beginOutCpduCtr = getStartOffset() + 178;	// set offset for serialization
  
             beginOutBillmsgCtr = getStartOffset() + 182;	// set offset for serialization
  
             beginBypassBillmsgCtr = getStartOffset() + 186;	// set offset for serialization
  
             beginOutUsageCtr = getStartOffset() + 190;	// set offset for serialization
  
             beginOutLsbcaCtr = getStartOffset() + 194;	// set offset for serialization
  
             beginOutLsgremCtr = getStartOffset() + 198;	// set offset for serialization
  
             beginOutAtdsumCtr = getStartOffset() + 202;	// set offset for serialization
  
             beginErrAcctCtr = getStartOffset() + 206;	// set offset for serialization
  
             beginErrThreshold = getStartOffset() + 210;	// set offset for serialization
  
             beginAlpPlanCtr = getStartOffset() + 214;	// set offset for serialization
  
             beginSfoPlanCtr = getStartOffset() + 218;	// set offset for serialization
  
             beginSpoAlwCtr = getStartOffset() + 222;	// set offset for serialization
  
             beginGlbProdCtr = getStartOffset() + 226;	// set offset for serialization
  
             beginSvcProdCtr = getStartOffset() + 230;	// set offset for serialization
  
             beginSpoProdCtr = getStartOffset() + 234;	// set offset for serialization
  
             beginAlpCpduCtr = getStartOffset() + 238;	// set offset for serialization
  
             beginSfoCpduCtr = getStartOffset() + 242;	// set offset for serialization
  
             beginNpspoCpduCtr = getStartOffset() + 246;	// set offset for serialization
  
             beginComCpduCtr = getStartOffset() + 250;	// set offset for serialization
  
             beginVisCreateCtr = getStartOffset() + 254;	// set offset for serialization
  
             beginDupSpoAlwCtr = getStartOffset() + 258;	// set offset for serialization
  
             beginDiscArrayCtr = getStartOffset() + 262;	// set offset for serialization
  
             beginRevoRejectCtr = getStartOffset() + 266;	// set offset for serialization
  
             beginBasvcprdCtr = getStartOffset() + 270;	// set offset for serialization
  
             beginDtsvcalwCtr = getStartOffset() + 274;	// set offset for serialization
  
             beginSfoplanCtr01 = getStartOffset() + 278;	// set offset for serialization
  
             beginSpoallowCtr = getStartOffset() + 282;	// set offset for serialization
  
             beginMtnfileCtr = getStartOffset() + 286;	// set offset for serialization
  
             beginU07fileCtr = getStartOffset() + 290;	// set offset for serialization
  
             beginRccycCtr = getStartOffset() + 294;	// set offset for serialization
  
             beginM2mAlwCtr = getStartOffset() + 298;	// set offset for serialization
  
             beginM2mpromoCtr = getStartOffset() + 302;	// set offset for serialization
  
             beginMtnStatCtr = getStartOffset() + 306;	// set offset for serialization
  
             beginM2mTermCtr = getStartOffset() + 310;	// set offset for serialization
  
             beginTrlCpduCnt = getStartOffset() + 314;	// set offset for serialization
  
             beginTrlUsageCnt = getStartOffset() + 318;	// set offset for serialization
  
             beginTrlLsbcaCnt = getStartOffset() + 322;	// set offset for serialization
  
             beginTrlLsgremCnt = getStartOffset() + 326;	// set offset for serialization
  
             beginTrlAtdsumCnt = getStartOffset() + 330;	// set offset for serialization
  
             beginSaveI = getStartOffset() + 334;	// set offset for serialization
  
             beginCount = getStartOffset() + 336;	// set offset for serialization
  
             beginIdx = getStartOffset() + 338;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localInvoiceCtrCounter = -1;
         public boolean isInvoiceCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localInvoiceCtrCounter != sharedCounter;
            localInvoiceCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int INVOICE_CTR_LEN = 4;
  	/**
	 * serializeInvoiceCtr
	 */
	protected void serializeInvoiceCtr(int invoiceCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( invoiceCtr,INVOICE_CTR_LEN)
                  ,beginInvoiceCtr
                  ,INVOICE_CTR_LEN
                 );
            localInvoiceCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkInvoiceCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshInvoiceCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInvoiceCtr() {	 
			return (getInt(beginInvoiceCtr));
   	}
         int localJitrInvCtrCounter = -1;
         public boolean isJitrInvCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localJitrInvCtrCounter != sharedCounter;
            localJitrInvCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int JITR_INV_CTR_LEN = 4;
  	/**
	 * serializeJitrInvCtr
	 */
	protected void serializeJitrInvCtr(int jitrInvCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( jitrInvCtr,JITR_INV_CTR_LEN)
                  ,beginJitrInvCtr
                  ,JITR_INV_CTR_LEN
                 );
            localJitrInvCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkJitrInvCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshJitrInvCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshJitrInvCtr() {	 
			return (getInt(beginJitrInvCtr));
   	}
         int localCommitCtrCounter = -1;
         public boolean isCommitCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCommitCtrCounter != sharedCounter;
            localCommitCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int COMMIT_CTR_LEN = 4;
  	/**
	 * serializeCommitCtr
	 */
	protected void serializeCommitCtr(int commitCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( commitCtr,COMMIT_CTR_LEN)
                  ,beginCommitCtr
                  ,COMMIT_CTR_LEN
                 );
            localCommitCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCommitCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCommitCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCommitCtr() {	 
			return (getInt(beginCommitCtr));
   	}
         int localQuotientCounter = -1;
         public boolean isQuotientModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localQuotientCounter != sharedCounter;
            localQuotientCounter = sharedCounter; return hasModified; 
         }
   protected static final int QUOTIENT_LEN = 4;
  	/**
	 * serializeQuotient
	 */
	protected void serializeQuotient(int quotient) {
           replaceValue( //  save the value as string
                   getBinaryString( quotient,QUOTIENT_LEN)
                  ,beginQuotient
                  ,QUOTIENT_LEN
                 );
            localQuotientCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkQuotientMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshQuotient is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshQuotient() {	 
			return (getInt(beginQuotient));
   	}
         int localRemainderCounter = -1;
         public boolean isRemainderModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRemainderCounter != sharedCounter;
            localRemainderCounter = sharedCounter; return hasModified; 
         }
   protected static final int REMAINDER_LEN = 4;
  	/**
	 * serializeRemainder
	 */
	protected void serializeRemainder(int remainder) {
           replaceValue( //  save the value as string
                   getBinaryString( remainder,REMAINDER_LEN)
                  ,beginRemainder
                  ,REMAINDER_LEN
                 );
            localRemainderCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRemainderMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRemainder is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRemainder() {	 
			return (getInt(beginRemainder));
   	}
         int localAcctCpduCtrCounter = -1;
         public boolean isAcctCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAcctCpduCtrCounter != sharedCounter;
            localAcctCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ACCT_CPDU_CTR_LEN = 4;
  	/**
	 * serializeAcctCpduCtr
	 */
	protected void serializeAcctCpduCtr(int acctCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( acctCpduCtr,ACCT_CPDU_CTR_LEN)
                  ,beginAcctCpduCtr
                  ,ACCT_CPDU_CTR_LEN
                 );
            localAcctCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAcctCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAcctCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAcctCpduCtr() {	 
			return (getInt(beginAcctCpduCtr));
   	}
         int localAcctUsageCtrCounter = -1;
         public boolean isAcctUsageCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAcctUsageCtrCounter != sharedCounter;
            localAcctUsageCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ACCT_USAGE_CTR_LEN = 4;
  	/**
	 * serializeAcctUsageCtr
	 */
	protected void serializeAcctUsageCtr(int acctUsageCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( acctUsageCtr,ACCT_USAGE_CTR_LEN)
                  ,beginAcctUsageCtr
                  ,ACCT_USAGE_CTR_LEN
                 );
            localAcctUsageCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAcctUsageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAcctUsageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAcctUsageCtr() {	 
			return (getInt(beginAcctUsageCtr));
   	}
         int localAcctLsbcaCtrCounter = -1;
         public boolean isAcctLsbcaCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAcctLsbcaCtrCounter != sharedCounter;
            localAcctLsbcaCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ACCT_LSBCA_CTR_LEN = 4;
  	/**
	 * serializeAcctLsbcaCtr
	 */
	protected void serializeAcctLsbcaCtr(int acctLsbcaCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( acctLsbcaCtr,ACCT_LSBCA_CTR_LEN)
                  ,beginAcctLsbcaCtr
                  ,ACCT_LSBCA_CTR_LEN
                 );
            localAcctLsbcaCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAcctLsbcaCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAcctLsbcaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAcctLsbcaCtr() {	 
			return (getInt(beginAcctLsbcaCtr));
   	}
         int localAcctLsgremCtrCounter = -1;
         public boolean isAcctLsgremCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAcctLsgremCtrCounter != sharedCounter;
            localAcctLsgremCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ACCT_LSGREM_CTR_LEN = 4;
  	/**
	 * serializeAcctLsgremCtr
	 */
	protected void serializeAcctLsgremCtr(int acctLsgremCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( acctLsgremCtr,ACCT_LSGREM_CTR_LEN)
                  ,beginAcctLsgremCtr
                  ,ACCT_LSGREM_CTR_LEN
                 );
            localAcctLsgremCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAcctLsgremCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAcctLsgremCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAcctLsgremCtr() {	 
			return (getInt(beginAcctLsgremCtr));
   	}
        int localAcctDataChgAmtCounter = -1;
        public boolean isAcctDataChgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAcctDataChgAmtCounter != sharedCounter;
           localAcctDataChgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean acctDataChgAmtIsNumeric() {
	      return decimalIsNumeric(beginAcctDataChgAmt,ACCT_DATA_CHG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] acctDataChgAmtString() {
            return getPackedString(beginAcctDataChgAmt,ACCT_DATA_CHG_AMT_LEN);
         }
   protected static final int ACCT_DATA_CHG_AMT_LEN = 10;
   protected static final int ACCT_DATA_CHG_AMT_SCALE = 11;
  	/**
	 * 	serializeAcctDataChgAmt
	 */
	protected void serializeAcctDataChgAmt(BigDecimal acctDataChgAmt) {
		   putDecimal(beginAcctDataChgAmt,acctDataChgAmt,ACCT_DATA_CHG_AMT_LEN,ACCT_DATA_CHG_AMT_SCALE,true);
		 localAcctDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAcctDataChgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshAcctDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAcctDataChgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginAcctDataChgAmt,ACCT_DATA_CHG_AMT_LEN,ACCT_DATA_CHG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("acctDataChgAmt", beginAcctDataChgAmt,ACCT_DATA_CHG_AMT_LEN);
     }
   	}
         int localBillCpduCtrCounter = -1;
         public boolean isBillCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBillCpduCtrCounter != sharedCounter;
            localBillCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int BILL_CPDU_CTR_LEN = 4;
  	/**
	 * serializeBillCpduCtr
	 */
	protected void serializeBillCpduCtr(int billCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( billCpduCtr,BILL_CPDU_CTR_LEN)
                  ,beginBillCpduCtr
                  ,BILL_CPDU_CTR_LEN
                 );
            localBillCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBillCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBillCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillCpduCtr() {	 
			return (getInt(beginBillCpduCtr));
   	}
         int localBillUsageCtrCounter = -1;
         public boolean isBillUsageCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBillUsageCtrCounter != sharedCounter;
            localBillUsageCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int BILL_USAGE_CTR_LEN = 4;
  	/**
	 * serializeBillUsageCtr
	 */
	protected void serializeBillUsageCtr(int billUsageCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( billUsageCtr,BILL_USAGE_CTR_LEN)
                  ,beginBillUsageCtr
                  ,BILL_USAGE_CTR_LEN
                 );
            localBillUsageCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBillUsageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBillUsageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillUsageCtr() {	 
			return (getInt(beginBillUsageCtr));
   	}
         int localBillLsbcaCtrCounter = -1;
         public boolean isBillLsbcaCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBillLsbcaCtrCounter != sharedCounter;
            localBillLsbcaCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int BILL_LSBCA_CTR_LEN = 4;
  	/**
	 * serializeBillLsbcaCtr
	 */
	protected void serializeBillLsbcaCtr(int billLsbcaCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( billLsbcaCtr,BILL_LSBCA_CTR_LEN)
                  ,beginBillLsbcaCtr
                  ,BILL_LSBCA_CTR_LEN
                 );
            localBillLsbcaCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBillLsbcaCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBillLsbcaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillLsbcaCtr() {	 
			return (getInt(beginBillLsbcaCtr));
   	}
         int localBillLsgremCtrCounter = -1;
         public boolean isBillLsgremCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBillLsgremCtrCounter != sharedCounter;
            localBillLsgremCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int BILL_LSGREM_CTR_LEN = 4;
  	/**
	 * serializeBillLsgremCtr
	 */
	protected void serializeBillLsgremCtr(int billLsgremCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( billLsgremCtr,BILL_LSGREM_CTR_LEN)
                  ,beginBillLsgremCtr
                  ,BILL_LSGREM_CTR_LEN
                 );
            localBillLsgremCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBillLsgremCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBillLsgremCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBillLsgremCtr() {	 
			return (getInt(beginBillLsgremCtr));
   	}
        int localBillDataChgAmtCounter = -1;
        public boolean isBillDataChgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localBillDataChgAmtCounter != sharedCounter;
           localBillDataChgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean billDataChgAmtIsNumeric() {
	      return decimalIsNumeric(beginBillDataChgAmt,BILL_DATA_CHG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] billDataChgAmtString() {
            return getPackedString(beginBillDataChgAmt,BILL_DATA_CHG_AMT_LEN);
         }
   protected static final int BILL_DATA_CHG_AMT_LEN = 10;
   protected static final int BILL_DATA_CHG_AMT_SCALE = 11;
  	/**
	 * 	serializeBillDataChgAmt
	 */
	protected void serializeBillDataChgAmt(BigDecimal billDataChgAmt) {
		   putDecimal(beginBillDataChgAmt,billDataChgAmt,BILL_DATA_CHG_AMT_LEN,BILL_DATA_CHG_AMT_SCALE,true);
		 localBillDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkBillDataChgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshBillDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBillDataChgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginBillDataChgAmt,BILL_DATA_CHG_AMT_LEN,BILL_DATA_CHG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("billDataChgAmt", beginBillDataChgAmt,BILL_DATA_CHG_AMT_LEN);
     }
   	}
         int localUbCpduCtrCounter = -1;
         public boolean isUbCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUbCpduCtrCounter != sharedCounter;
            localUbCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int UB_CPDU_CTR_LEN = 4;
  	/**
	 * serializeUbCpduCtr
	 */
	protected void serializeUbCpduCtr(int ubCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ubCpduCtr,UB_CPDU_CTR_LEN)
                  ,beginUbCpduCtr
                  ,UB_CPDU_CTR_LEN
                 );
            localUbCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUbCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUbCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUbCpduCtr() {	 
			return (getInt(beginUbCpduCtr));
   	}
         int localUbBillmsgCtrCounter = -1;
         public boolean isUbBillmsgCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUbBillmsgCtrCounter != sharedCounter;
            localUbBillmsgCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int UB_BILLMSG_CTR_LEN = 4;
  	/**
	 * serializeUbBillmsgCtr
	 */
	protected void serializeUbBillmsgCtr(int ubBillmsgCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ubBillmsgCtr,UB_BILLMSG_CTR_LEN)
                  ,beginUbBillmsgCtr
                  ,UB_BILLMSG_CTR_LEN
                 );
            localUbBillmsgCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUbBillmsgCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUbBillmsgCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUbBillmsgCtr() {	 
			return (getInt(beginUbBillmsgCtr));
   	}
         int localUbUsageCtrCounter = -1;
         public boolean isUbUsageCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUbUsageCtrCounter != sharedCounter;
            localUbUsageCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int UB_USAGE_CTR_LEN = 4;
  	/**
	 * serializeUbUsageCtr
	 */
	protected void serializeUbUsageCtr(int ubUsageCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ubUsageCtr,UB_USAGE_CTR_LEN)
                  ,beginUbUsageCtr
                  ,UB_USAGE_CTR_LEN
                 );
            localUbUsageCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUbUsageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUbUsageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUbUsageCtr() {	 
			return (getInt(beginUbUsageCtr));
   	}
        int localUbDataChgAmtCounter = -1;
        public boolean isUbDataChgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUbDataChgAmtCounter != sharedCounter;
           localUbDataChgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean ubDataChgAmtIsNumeric() {
	      return decimalIsNumeric(beginUbDataChgAmt,UB_DATA_CHG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] ubDataChgAmtString() {
            return getPackedString(beginUbDataChgAmt,UB_DATA_CHG_AMT_LEN);
         }
   protected static final int UB_DATA_CHG_AMT_LEN = 10;
   protected static final int UB_DATA_CHG_AMT_SCALE = 11;
  	/**
	 * 	serializeUbDataChgAmt
	 */
	protected void serializeUbDataChgAmt(BigDecimal ubDataChgAmt) {
		   putDecimal(beginUbDataChgAmt,ubDataChgAmt,UB_DATA_CHG_AMT_LEN,UB_DATA_CHG_AMT_SCALE,true);
		 localUbDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkUbDataChgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshUbDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshUbDataChgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginUbDataChgAmt,UB_DATA_CHG_AMT_LEN,UB_DATA_CHG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("ubDataChgAmt", beginUbDataChgAmt,UB_DATA_CHG_AMT_LEN);
     }
   	}
        int localTotDataChgAmtCounter = -1;
        public boolean isTotDataChgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTotDataChgAmtCounter != sharedCounter;
           localTotDataChgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean totDataChgAmtIsNumeric() {
	      return decimalIsNumeric(beginTotDataChgAmt,TOT_DATA_CHG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] totDataChgAmtString() {
            return getPackedString(beginTotDataChgAmt,TOT_DATA_CHG_AMT_LEN);
         }
   protected static final int TOT_DATA_CHG_AMT_LEN = 10;
   protected static final int TOT_DATA_CHG_AMT_SCALE = 11;
  	/**
	 * 	serializeTotDataChgAmt
	 */
	protected void serializeTotDataChgAmt(BigDecimal totDataChgAmt) {
		   putDecimal(beginTotDataChgAmt,totDataChgAmt,TOT_DATA_CHG_AMT_LEN,TOT_DATA_CHG_AMT_SCALE,true);
		 localTotDataChgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTotDataChgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,18/*precision*/);
   }
     /**
	 *	refreshTotDataChgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTotDataChgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginTotDataChgAmt,TOT_DATA_CHG_AMT_LEN,TOT_DATA_CHG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("totDataChgAmt", beginTotDataChgAmt,TOT_DATA_CHG_AMT_LEN);
     }
   	}
         int localUbLsbcaCtrCounter = -1;
         public boolean isUbLsbcaCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUbLsbcaCtrCounter != sharedCounter;
            localUbLsbcaCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int UB_LSBCA_CTR_LEN = 4;
  	/**
	 * serializeUbLsbcaCtr
	 */
	protected void serializeUbLsbcaCtr(int ubLsbcaCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ubLsbcaCtr,UB_LSBCA_CTR_LEN)
                  ,beginUbLsbcaCtr
                  ,UB_LSBCA_CTR_LEN
                 );
            localUbLsbcaCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUbLsbcaCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUbLsbcaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUbLsbcaCtr() {	 
			return (getInt(beginUbLsbcaCtr));
   	}
         int localUbLsgremCtrCounter = -1;
         public boolean isUbLsgremCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUbLsgremCtrCounter != sharedCounter;
            localUbLsgremCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int UB_LSGREM_CTR_LEN = 4;
  	/**
	 * serializeUbLsgremCtr
	 */
	protected void serializeUbLsgremCtr(int ubLsgremCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ubLsgremCtr,UB_LSGREM_CTR_LEN)
                  ,beginUbLsgremCtr
                  ,UB_LSGREM_CTR_LEN
                 );
            localUbLsgremCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUbLsgremCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUbLsgremCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUbLsgremCtr() {	 
			return (getInt(beginUbLsgremCtr));
   	}
         int localLnshrgCtrCounter = -1;
         public boolean isLnshrgCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLnshrgCtrCounter != sharedCounter;
            localLnshrgCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int LNSHRG_CTR_LEN = 4;
  	/**
	 * serializeLnshrgCtr
	 */
	protected void serializeLnshrgCtr(int lnshrgCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( lnshrgCtr,LNSHRG_CTR_LEN)
                  ,beginLnshrgCtr
                  ,LNSHRG_CTR_LEN
                 );
            localLnshrgCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLnshrgCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLnshrgCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLnshrgCtr() {	 
			return (getInt(beginLnshrgCtr));
   	}
         int localUbAtdsumCtrCounter = -1;
         public boolean isUbAtdsumCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUbAtdsumCtrCounter != sharedCounter;
            localUbAtdsumCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int UB_ATDSUM_CTR_LEN = 4;
  	/**
	 * serializeUbAtdsumCtr
	 */
	protected void serializeUbAtdsumCtr(int ubAtdsumCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ubAtdsumCtr,UB_ATDSUM_CTR_LEN)
                  ,beginUbAtdsumCtr
                  ,UB_ATDSUM_CTR_LEN
                 );
            localUbAtdsumCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkUbAtdsumCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshUbAtdsumCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUbAtdsumCtr() {	 
			return (getInt(beginUbAtdsumCtr));
   	}
         int localFlgCpduCtrCounter = -1;
         public boolean isFlgCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFlgCpduCtrCounter != sharedCounter;
            localFlgCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FLG_CPDU_CTR_LEN = 4;
  	/**
	 * serializeFlgCpduCtr
	 */
	protected void serializeFlgCpduCtr(int flgCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( flgCpduCtr,FLG_CPDU_CTR_LEN)
                  ,beginFlgCpduCtr
                  ,FLG_CPDU_CTR_LEN
                 );
            localFlgCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFlgCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFlgCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlgCpduCtr() {	 
			return (getInt(beginFlgCpduCtr));
   	}
         int localFlgUsageCtrCounter = -1;
         public boolean isFlgUsageCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFlgUsageCtrCounter != sharedCounter;
            localFlgUsageCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FLG_USAGE_CTR_LEN = 4;
  	/**
	 * serializeFlgUsageCtr
	 */
	protected void serializeFlgUsageCtr(int flgUsageCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( flgUsageCtr,FLG_USAGE_CTR_LEN)
                  ,beginFlgUsageCtr
                  ,FLG_USAGE_CTR_LEN
                 );
            localFlgUsageCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFlgUsageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFlgUsageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlgUsageCtr() {	 
			return (getInt(beginFlgUsageCtr));
   	}
         int localFlgLsbcaCtrCounter = -1;
         public boolean isFlgLsbcaCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFlgLsbcaCtrCounter != sharedCounter;
            localFlgLsbcaCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FLG_LSBCA_CTR_LEN = 4;
  	/**
	 * serializeFlgLsbcaCtr
	 */
	protected void serializeFlgLsbcaCtr(int flgLsbcaCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( flgLsbcaCtr,FLG_LSBCA_CTR_LEN)
                  ,beginFlgLsbcaCtr
                  ,FLG_LSBCA_CTR_LEN
                 );
            localFlgLsbcaCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFlgLsbcaCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFlgLsbcaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlgLsbcaCtr() {	 
			return (getInt(beginFlgLsbcaCtr));
   	}
         int localFlgLsgremCtrCounter = -1;
         public boolean isFlgLsgremCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFlgLsgremCtrCounter != sharedCounter;
            localFlgLsgremCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FLG_LSGREM_CTR_LEN = 4;
  	/**
	 * serializeFlgLsgremCtr
	 */
	protected void serializeFlgLsgremCtr(int flgLsgremCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( flgLsgremCtr,FLG_LSGREM_CTR_LEN)
                  ,beginFlgLsgremCtr
                  ,FLG_LSGREM_CTR_LEN
                 );
            localFlgLsgremCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFlgLsgremCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFlgLsgremCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlgLsgremCtr() {	 
			return (getInt(beginFlgLsgremCtr));
   	}
         int localFlgAtdsumCtrCounter = -1;
         public boolean isFlgAtdsumCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFlgAtdsumCtrCounter != sharedCounter;
            localFlgAtdsumCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FLG_ATDSUM_CTR_LEN = 4;
  	/**
	 * serializeFlgAtdsumCtr
	 */
	protected void serializeFlgAtdsumCtr(int flgAtdsumCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( flgAtdsumCtr,FLG_ATDSUM_CTR_LEN)
                  ,beginFlgAtdsumCtr
                  ,FLG_ATDSUM_CTR_LEN
                 );
            localFlgAtdsumCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFlgAtdsumCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFlgAtdsumCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFlgAtdsumCtr() {	 
			return (getInt(beginFlgAtdsumCtr));
   	}
        int localCustFlgUsgCtrCounter = -1;
        public boolean isCustFlgUsgCtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCustFlgUsgCtrCounter != sharedCounter;
           localCustFlgUsgCtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean custFlgUsgCtrIsNumeric() {
	      return decimalIsNumeric(beginCustFlgUsgCtr,CUST_FLG_USG_CTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] custFlgUsgCtrString() {
            return getPackedString(beginCustFlgUsgCtr,CUST_FLG_USG_CTR_LEN);
         }
   protected static final int CUST_FLG_USG_CTR_LEN = 6;
   protected static final int CUST_FLG_USG_CTR_SCALE = 2;
  	/**
	 * 	serializeCustFlgUsgCtr
	 */
	protected void serializeCustFlgUsgCtr(BigDecimal custFlgUsgCtr) {
		   putDecimal(beginCustFlgUsgCtr,custFlgUsgCtr,CUST_FLG_USG_CTR_LEN,CUST_FLG_USG_CTR_SCALE,true);
		 localCustFlgUsgCtrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCustFlgUsgCtrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshCustFlgUsgCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCustFlgUsgCtr() throws CFException {	
   	try { 
		 return (getDecimal(beginCustFlgUsgCtr,CUST_FLG_USG_CTR_LEN,CUST_FLG_USG_CTR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("custFlgUsgCtr", beginCustFlgUsgCtr,CUST_FLG_USG_CTR_LEN);
     }
   	}
        int localCustUsgCtrCounter = -1;
        public boolean isCustUsgCtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCustUsgCtrCounter != sharedCounter;
           localCustUsgCtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean custUsgCtrIsNumeric() {
	      return decimalIsNumeric(beginCustUsgCtr,CUST_USG_CTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] custUsgCtrString() {
            return getPackedString(beginCustUsgCtr,CUST_USG_CTR_LEN);
         }
   protected static final int CUST_USG_CTR_LEN = 6;
   protected static final int CUST_USG_CTR_SCALE = 2;
  	/**
	 * 	serializeCustUsgCtr
	 */
	protected void serializeCustUsgCtr(BigDecimal custUsgCtr) {
		   putDecimal(beginCustUsgCtr,custUsgCtr,CUST_USG_CTR_LEN,CUST_USG_CTR_SCALE,true);
		 localCustUsgCtrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCustUsgCtrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshCustUsgCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCustUsgCtr() throws CFException {	
   	try { 
		 return (getDecimal(beginCustUsgCtr,CUST_USG_CTR_LEN,CUST_USG_CTR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("custUsgCtr", beginCustUsgCtr,CUST_USG_CTR_LEN);
     }
   	}
        int localFgvAlwCountCounter = -1;
        public boolean isFgvAlwCountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFgvAlwCountCounter != sharedCounter;
           localFgvAlwCountCounter = sharedCounter; return hasModified; 
        }
	    public boolean fgvAlwCountIsNumeric() {
	      return decimalIsNumeric(beginFgvAlwCount,FGV_ALW_COUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] fgvAlwCountString() {
            return getPackedString(beginFgvAlwCount,FGV_ALW_COUNT_LEN);
         }
   protected static final int FGV_ALW_COUNT_LEN = 6;
   protected static final int FGV_ALW_COUNT_SCALE = 2;
  	/**
	 * 	serializeFgvAlwCount
	 */
	protected void serializeFgvAlwCount(BigDecimal fgvAlwCount) {
		   putDecimal(beginFgvAlwCount,fgvAlwCount,FGV_ALW_COUNT_LEN,FGV_ALW_COUNT_SCALE,true);
		 localFgvAlwCountCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkFgvAlwCountMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshFgvAlwCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFgvAlwCount() throws CFException {	
   	try { 
		 return (getDecimal(beginFgvAlwCount,FGV_ALW_COUNT_LEN,FGV_ALW_COUNT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("fgvAlwCount", beginFgvAlwCount,FGV_ALW_COUNT_LEN);
     }
   	}
         int localOkdCpduCtrCounter = -1;
         public boolean isOkdCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOkdCpduCtrCounter != sharedCounter;
            localOkdCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OKD_CPDU_CTR_LEN = 4;
  	/**
	 * serializeOkdCpduCtr
	 */
	protected void serializeOkdCpduCtr(int okdCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( okdCpduCtr,OKD_CPDU_CTR_LEN)
                  ,beginOkdCpduCtr
                  ,OKD_CPDU_CTR_LEN
                 );
            localOkdCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOkdCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOkdCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOkdCpduCtr() {	 
			return (getInt(beginOkdCpduCtr));
   	}
         int localOkdUsageCtrCounter = -1;
         public boolean isOkdUsageCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOkdUsageCtrCounter != sharedCounter;
            localOkdUsageCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OKD_USAGE_CTR_LEN = 4;
  	/**
	 * serializeOkdUsageCtr
	 */
	protected void serializeOkdUsageCtr(int okdUsageCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( okdUsageCtr,OKD_USAGE_CTR_LEN)
                  ,beginOkdUsageCtr
                  ,OKD_USAGE_CTR_LEN
                 );
            localOkdUsageCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOkdUsageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOkdUsageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOkdUsageCtr() {	 
			return (getInt(beginOkdUsageCtr));
   	}
         int localOkdLsbcaCtrCounter = -1;
         public boolean isOkdLsbcaCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOkdLsbcaCtrCounter != sharedCounter;
            localOkdLsbcaCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OKD_LSBCA_CTR_LEN = 4;
  	/**
	 * serializeOkdLsbcaCtr
	 */
	protected void serializeOkdLsbcaCtr(int okdLsbcaCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( okdLsbcaCtr,OKD_LSBCA_CTR_LEN)
                  ,beginOkdLsbcaCtr
                  ,OKD_LSBCA_CTR_LEN
                 );
            localOkdLsbcaCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOkdLsbcaCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOkdLsbcaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOkdLsbcaCtr() {	 
			return (getInt(beginOkdLsbcaCtr));
   	}
         int localOkdLsgremCtrCounter = -1;
         public boolean isOkdLsgremCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOkdLsgremCtrCounter != sharedCounter;
            localOkdLsgremCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OKD_LSGREM_CTR_LEN = 4;
  	/**
	 * serializeOkdLsgremCtr
	 */
	protected void serializeOkdLsgremCtr(int okdLsgremCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( okdLsgremCtr,OKD_LSGREM_CTR_LEN)
                  ,beginOkdLsgremCtr
                  ,OKD_LSGREM_CTR_LEN
                 );
            localOkdLsgremCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOkdLsgremCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOkdLsgremCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOkdLsgremCtr() {	 
			return (getInt(beginOkdLsgremCtr));
   	}
         int localOkdAtdsumCtrCounter = -1;
         public boolean isOkdAtdsumCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOkdAtdsumCtrCounter != sharedCounter;
            localOkdAtdsumCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OKD_ATDSUM_CTR_LEN = 4;
  	/**
	 * serializeOkdAtdsumCtr
	 */
	protected void serializeOkdAtdsumCtr(int okdAtdsumCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( okdAtdsumCtr,OKD_ATDSUM_CTR_LEN)
                  ,beginOkdAtdsumCtr
                  ,OKD_ATDSUM_CTR_LEN
                 );
            localOkdAtdsumCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOkdAtdsumCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOkdAtdsumCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOkdAtdsumCtr() {	 
			return (getInt(beginOkdAtdsumCtr));
   	}
         int localOutCpduCtrCounter = -1;
         public boolean isOutCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutCpduCtrCounter != sharedCounter;
            localOutCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_CPDU_CTR_LEN = 4;
  	/**
	 * serializeOutCpduCtr
	 */
	protected void serializeOutCpduCtr(int outCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( outCpduCtr,OUT_CPDU_CTR_LEN)
                  ,beginOutCpduCtr
                  ,OUT_CPDU_CTR_LEN
                 );
            localOutCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOutCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutCpduCtr() {	 
			return (getInt(beginOutCpduCtr));
   	}
         int localOutBillmsgCtrCounter = -1;
         public boolean isOutBillmsgCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutBillmsgCtrCounter != sharedCounter;
            localOutBillmsgCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_BILLMSG_CTR_LEN = 4;
  	/**
	 * serializeOutBillmsgCtr
	 */
	protected void serializeOutBillmsgCtr(int outBillmsgCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( outBillmsgCtr,OUT_BILLMSG_CTR_LEN)
                  ,beginOutBillmsgCtr
                  ,OUT_BILLMSG_CTR_LEN
                 );
            localOutBillmsgCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutBillmsgCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOutBillmsgCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutBillmsgCtr() {	 
			return (getInt(beginOutBillmsgCtr));
   	}
         int localBypassBillmsgCtrCounter = -1;
         public boolean isBypassBillmsgCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBypassBillmsgCtrCounter != sharedCounter;
            localBypassBillmsgCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int BYPASS_BILLMSG_CTR_LEN = 4;
  	/**
	 * serializeBypassBillmsgCtr
	 */
	protected void serializeBypassBillmsgCtr(int bypassBillmsgCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( bypassBillmsgCtr,BYPASS_BILLMSG_CTR_LEN)
                  ,beginBypassBillmsgCtr
                  ,BYPASS_BILLMSG_CTR_LEN
                 );
            localBypassBillmsgCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBypassBillmsgCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBypassBillmsgCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBypassBillmsgCtr() {	 
			return (getInt(beginBypassBillmsgCtr));
   	}
         int localOutUsageCtrCounter = -1;
         public boolean isOutUsageCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutUsageCtrCounter != sharedCounter;
            localOutUsageCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_USAGE_CTR_LEN = 4;
  	/**
	 * serializeOutUsageCtr
	 */
	protected void serializeOutUsageCtr(int outUsageCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( outUsageCtr,OUT_USAGE_CTR_LEN)
                  ,beginOutUsageCtr
                  ,OUT_USAGE_CTR_LEN
                 );
            localOutUsageCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutUsageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOutUsageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutUsageCtr() {	 
			return (getInt(beginOutUsageCtr));
   	}
         int localOutLsbcaCtrCounter = -1;
         public boolean isOutLsbcaCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutLsbcaCtrCounter != sharedCounter;
            localOutLsbcaCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_LSBCA_CTR_LEN = 4;
  	/**
	 * serializeOutLsbcaCtr
	 */
	protected void serializeOutLsbcaCtr(int outLsbcaCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( outLsbcaCtr,OUT_LSBCA_CTR_LEN)
                  ,beginOutLsbcaCtr
                  ,OUT_LSBCA_CTR_LEN
                 );
            localOutLsbcaCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutLsbcaCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOutLsbcaCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutLsbcaCtr() {	 
			return (getInt(beginOutLsbcaCtr));
   	}
         int localOutLsgremCtrCounter = -1;
         public boolean isOutLsgremCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutLsgremCtrCounter != sharedCounter;
            localOutLsgremCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_LSGREM_CTR_LEN = 4;
  	/**
	 * serializeOutLsgremCtr
	 */
	protected void serializeOutLsgremCtr(int outLsgremCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( outLsgremCtr,OUT_LSGREM_CTR_LEN)
                  ,beginOutLsgremCtr
                  ,OUT_LSGREM_CTR_LEN
                 );
            localOutLsgremCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutLsgremCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOutLsgremCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutLsgremCtr() {	 
			return (getInt(beginOutLsgremCtr));
   	}
         int localOutAtdsumCtrCounter = -1;
         public boolean isOutAtdsumCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutAtdsumCtrCounter != sharedCounter;
            localOutAtdsumCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int OUT_ATDSUM_CTR_LEN = 4;
  	/**
	 * serializeOutAtdsumCtr
	 */
	protected void serializeOutAtdsumCtr(int outAtdsumCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( outAtdsumCtr,OUT_ATDSUM_CTR_LEN)
                  ,beginOutAtdsumCtr
                  ,OUT_ATDSUM_CTR_LEN
                 );
            localOutAtdsumCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkOutAtdsumCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshOutAtdsumCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutAtdsumCtr() {	 
			return (getInt(beginOutAtdsumCtr));
   	}
         int localErrAcctCtrCounter = -1;
         public boolean isErrAcctCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrAcctCtrCounter != sharedCounter;
            localErrAcctCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ERR_ACCT_CTR_LEN = 4;
  	/**
	 * serializeErrAcctCtr
	 */
	protected void serializeErrAcctCtr(int errAcctCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( errAcctCtr,ERR_ACCT_CTR_LEN)
                  ,beginErrAcctCtr
                  ,ERR_ACCT_CTR_LEN
                 );
            localErrAcctCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkErrAcctCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshErrAcctCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshErrAcctCtr() {	 
			return (getInt(beginErrAcctCtr));
   	}
         int localErrThresholdCounter = -1;
         public boolean isErrThresholdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrThresholdCounter != sharedCounter;
            localErrThresholdCounter = sharedCounter; return hasModified; 
         }
   protected static final int ERR_THRESHOLD_LEN = 4;
  	/**
	 * serializeErrThreshold
	 */
	protected void serializeErrThreshold(int errThreshold) {
           replaceValue( //  save the value as string
                   getBinaryString( errThreshold,ERR_THRESHOLD_LEN)
                  ,beginErrThreshold
                  ,ERR_THRESHOLD_LEN
                 );
            localErrThresholdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkErrThresholdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshErrThreshold is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshErrThreshold() {	 
			return (getInt(beginErrThreshold));
   	}
         int localAlpPlanCtrCounter = -1;
         public boolean isAlpPlanCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAlpPlanCtrCounter != sharedCounter;
            localAlpPlanCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ALP_PLAN_CTR_LEN = 4;
  	/**
	 * serializeAlpPlanCtr
	 */
	protected void serializeAlpPlanCtr(int alpPlanCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( alpPlanCtr,ALP_PLAN_CTR_LEN)
                  ,beginAlpPlanCtr
                  ,ALP_PLAN_CTR_LEN
                 );
            localAlpPlanCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAlpPlanCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAlpPlanCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAlpPlanCtr() {	 
			return (getInt(beginAlpPlanCtr));
   	}
         int localSfoPlanCtrCounter = -1;
         public boolean isSfoPlanCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSfoPlanCtrCounter != sharedCounter;
            localSfoPlanCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SFO_PLAN_CTR_LEN = 4;
  	/**
	 * serializeSfoPlanCtr
	 */
	protected void serializeSfoPlanCtr(int sfoPlanCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( sfoPlanCtr,SFO_PLAN_CTR_LEN)
                  ,beginSfoPlanCtr
                  ,SFO_PLAN_CTR_LEN
                 );
            localSfoPlanCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSfoPlanCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSfoPlanCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSfoPlanCtr() {	 
			return (getInt(beginSfoPlanCtr));
   	}
         int localSpoAlwCtrCounter = -1;
         public boolean isSpoAlwCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpoAlwCtrCounter != sharedCounter;
            localSpoAlwCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SPO_ALW_CTR_LEN = 4;
  	/**
	 * serializeSpoAlwCtr
	 */
	protected void serializeSpoAlwCtr(int spoAlwCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( spoAlwCtr,SPO_ALW_CTR_LEN)
                  ,beginSpoAlwCtr
                  ,SPO_ALW_CTR_LEN
                 );
            localSpoAlwCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpoAlwCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpoAlwCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpoAlwCtr() {	 
			return (getInt(beginSpoAlwCtr));
   	}
         int localGlbProdCtrCounter = -1;
         public boolean isGlbProdCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGlbProdCtrCounter != sharedCounter;
            localGlbProdCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int GLB_PROD_CTR_LEN = 4;
  	/**
	 * serializeGlbProdCtr
	 */
	protected void serializeGlbProdCtr(int glbProdCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( glbProdCtr,GLB_PROD_CTR_LEN)
                  ,beginGlbProdCtr
                  ,GLB_PROD_CTR_LEN
                 );
            localGlbProdCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkGlbProdCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshGlbProdCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGlbProdCtr() {	 
			return (getInt(beginGlbProdCtr));
   	}
         int localSvcProdCtrCounter = -1;
         public boolean isSvcProdCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSvcProdCtrCounter != sharedCounter;
            localSvcProdCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SVC_PROD_CTR_LEN = 4;
  	/**
	 * serializeSvcProdCtr
	 */
	protected void serializeSvcProdCtr(int svcProdCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( svcProdCtr,SVC_PROD_CTR_LEN)
                  ,beginSvcProdCtr
                  ,SVC_PROD_CTR_LEN
                 );
            localSvcProdCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSvcProdCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSvcProdCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSvcProdCtr() {	 
			return (getInt(beginSvcProdCtr));
   	}
         int localSpoProdCtrCounter = -1;
         public boolean isSpoProdCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpoProdCtrCounter != sharedCounter;
            localSpoProdCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SPO_PROD_CTR_LEN = 4;
  	/**
	 * serializeSpoProdCtr
	 */
	protected void serializeSpoProdCtr(int spoProdCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( spoProdCtr,SPO_PROD_CTR_LEN)
                  ,beginSpoProdCtr
                  ,SPO_PROD_CTR_LEN
                 );
            localSpoProdCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpoProdCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpoProdCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpoProdCtr() {	 
			return (getInt(beginSpoProdCtr));
   	}
         int localAlpCpduCtrCounter = -1;
         public boolean isAlpCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAlpCpduCtrCounter != sharedCounter;
            localAlpCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int ALP_CPDU_CTR_LEN = 4;
  	/**
	 * serializeAlpCpduCtr
	 */
	protected void serializeAlpCpduCtr(int alpCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( alpCpduCtr,ALP_CPDU_CTR_LEN)
                  ,beginAlpCpduCtr
                  ,ALP_CPDU_CTR_LEN
                 );
            localAlpCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkAlpCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAlpCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAlpCpduCtr() {	 
			return (getInt(beginAlpCpduCtr));
   	}
         int localSfoCpduCtrCounter = -1;
         public boolean isSfoCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSfoCpduCtrCounter != sharedCounter;
            localSfoCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SFO_CPDU_CTR_LEN = 4;
  	/**
	 * serializeSfoCpduCtr
	 */
	protected void serializeSfoCpduCtr(int sfoCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( sfoCpduCtr,SFO_CPDU_CTR_LEN)
                  ,beginSfoCpduCtr
                  ,SFO_CPDU_CTR_LEN
                 );
            localSfoCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSfoCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSfoCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSfoCpduCtr() {	 
			return (getInt(beginSfoCpduCtr));
   	}
         int localNpspoCpduCtrCounter = -1;
         public boolean isNpspoCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNpspoCpduCtrCounter != sharedCounter;
            localNpspoCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int NPSPO_CPDU_CTR_LEN = 4;
  	/**
	 * serializeNpspoCpduCtr
	 */
	protected void serializeNpspoCpduCtr(int npspoCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( npspoCpduCtr,NPSPO_CPDU_CTR_LEN)
                  ,beginNpspoCpduCtr
                  ,NPSPO_CPDU_CTR_LEN
                 );
            localNpspoCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkNpspoCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshNpspoCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNpspoCpduCtr() {	 
			return (getInt(beginNpspoCpduCtr));
   	}
         int localComCpduCtrCounter = -1;
         public boolean isComCpduCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localComCpduCtrCounter != sharedCounter;
            localComCpduCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int COM_CPDU_CTR_LEN = 4;
  	/**
	 * serializeComCpduCtr
	 */
	protected void serializeComCpduCtr(int comCpduCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( comCpduCtr,COM_CPDU_CTR_LEN)
                  ,beginComCpduCtr
                  ,COM_CPDU_CTR_LEN
                 );
            localComCpduCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkComCpduCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshComCpduCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshComCpduCtr() {	 
			return (getInt(beginComCpduCtr));
   	}
         int localVisCreateCtrCounter = -1;
         public boolean isVisCreateCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVisCreateCtrCounter != sharedCounter;
            localVisCreateCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int VIS_CREATE_CTR_LEN = 4;
  	/**
	 * serializeVisCreateCtr
	 */
	protected void serializeVisCreateCtr(int visCreateCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( visCreateCtr,VIS_CREATE_CTR_LEN)
                  ,beginVisCreateCtr
                  ,VIS_CREATE_CTR_LEN
                 );
            localVisCreateCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkVisCreateCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshVisCreateCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVisCreateCtr() {	 
			return (getInt(beginVisCreateCtr));
   	}
         int localDupSpoAlwCtrCounter = -1;
         public boolean isDupSpoAlwCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDupSpoAlwCtrCounter != sharedCounter;
            localDupSpoAlwCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int DUP_SPO_ALW_CTR_LEN = 4;
  	/**
	 * serializeDupSpoAlwCtr
	 */
	protected void serializeDupSpoAlwCtr(int dupSpoAlwCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( dupSpoAlwCtr,DUP_SPO_ALW_CTR_LEN)
                  ,beginDupSpoAlwCtr
                  ,DUP_SPO_ALW_CTR_LEN
                 );
            localDupSpoAlwCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDupSpoAlwCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDupSpoAlwCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDupSpoAlwCtr() {	 
			return (getInt(beginDupSpoAlwCtr));
   	}
         int localDiscArrayCtrCounter = -1;
         public boolean isDiscArrayCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDiscArrayCtrCounter != sharedCounter;
            localDiscArrayCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int DISC_ARRAY_CTR_LEN = 4;
  	/**
	 * serializeDiscArrayCtr
	 */
	protected void serializeDiscArrayCtr(int discArrayCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( discArrayCtr,DISC_ARRAY_CTR_LEN)
                  ,beginDiscArrayCtr
                  ,DISC_ARRAY_CTR_LEN
                 );
            localDiscArrayCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDiscArrayCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDiscArrayCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDiscArrayCtr() {	 
			return (getInt(beginDiscArrayCtr));
   	}
         int localRevoRejectCtrCounter = -1;
         public boolean isRevoRejectCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRevoRejectCtrCounter != sharedCounter;
            localRevoRejectCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int REVO_REJECT_CTR_LEN = 4;
  	/**
	 * serializeRevoRejectCtr
	 */
	protected void serializeRevoRejectCtr(int revoRejectCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( revoRejectCtr,REVO_REJECT_CTR_LEN)
                  ,beginRevoRejectCtr
                  ,REVO_REJECT_CTR_LEN
                 );
            localRevoRejectCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRevoRejectCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRevoRejectCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRevoRejectCtr() {	 
			return (getInt(beginRevoRejectCtr));
   	}
         int localBasvcprdCtrCounter = -1;
         public boolean isBasvcprdCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBasvcprdCtrCounter != sharedCounter;
            localBasvcprdCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int BASVCPRD_CTR_LEN = 4;
  	/**
	 * serializeBasvcprdCtr
	 */
	protected void serializeBasvcprdCtr(int basvcprdCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( basvcprdCtr,BASVCPRD_CTR_LEN)
                  ,beginBasvcprdCtr
                  ,BASVCPRD_CTR_LEN
                 );
            localBasvcprdCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkBasvcprdCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshBasvcprdCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBasvcprdCtr() {	 
			return (getInt(beginBasvcprdCtr));
   	}
         int localDtsvcalwCtrCounter = -1;
         public boolean isDtsvcalwCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDtsvcalwCtrCounter != sharedCounter;
            localDtsvcalwCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int DTSVCALW_CTR_LEN = 4;
  	/**
	 * serializeDtsvcalwCtr
	 */
	protected void serializeDtsvcalwCtr(int dtsvcalwCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( dtsvcalwCtr,DTSVCALW_CTR_LEN)
                  ,beginDtsvcalwCtr
                  ,DTSVCALW_CTR_LEN
                 );
            localDtsvcalwCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDtsvcalwCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDtsvcalwCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDtsvcalwCtr() {	 
			return (getInt(beginDtsvcalwCtr));
   	}
         int localSfoplanCtr01Counter = -1;
         public boolean isSfoplanCtr01Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSfoplanCtr01Counter != sharedCounter;
            localSfoplanCtr01Counter = sharedCounter; return hasModified; 
         }
   protected static final int SFOPLAN_CTR_01_LEN = 4;
  	/**
	 * serializeSfoplanCtr01
	 */
	protected void serializeSfoplanCtr01(int sfoplanCtr01) {
           replaceValue( //  save the value as string
                   getBinaryString( sfoplanCtr01,SFOPLAN_CTR_01_LEN)
                  ,beginSfoplanCtr01
                  ,SFOPLAN_CTR_01_LEN
                 );
            localSfoplanCtr01Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSfoplanCtr01MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSfoplanCtr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSfoplanCtr01() {	 
			return (getInt(beginSfoplanCtr01));
   	}
         int localSpoallowCtrCounter = -1;
         public boolean isSpoallowCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpoallowCtrCounter != sharedCounter;
            localSpoallowCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SPOALLOW_CTR_LEN = 4;
  	/**
	 * serializeSpoallowCtr
	 */
	protected void serializeSpoallowCtr(int spoallowCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( spoallowCtr,SPOALLOW_CTR_LEN)
                  ,beginSpoallowCtr
                  ,SPOALLOW_CTR_LEN
                 );
            localSpoallowCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSpoallowCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSpoallowCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSpoallowCtr() {	 
			return (getInt(beginSpoallowCtr));
   	}
         int localMtnfileCtrCounter = -1;
         public boolean isMtnfileCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMtnfileCtrCounter != sharedCounter;
            localMtnfileCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int MTNFILE_CTR_LEN = 4;
  	/**
	 * serializeMtnfileCtr
	 */
	protected void serializeMtnfileCtr(int mtnfileCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( mtnfileCtr,MTNFILE_CTR_LEN)
                  ,beginMtnfileCtr
                  ,MTNFILE_CTR_LEN
                 );
            localMtnfileCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMtnfileCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMtnfileCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMtnfileCtr() {	 
			return (getInt(beginMtnfileCtr));
   	}
         int localU07fileCtrCounter = -1;
         public boolean isU07fileCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localU07fileCtrCounter != sharedCounter;
            localU07fileCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int U_07FILE_CTR_LEN = 4;
  	/**
	 * serializeU07fileCtr
	 */
	protected void serializeU07fileCtr(int u07fileCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( u07fileCtr,U_07FILE_CTR_LEN)
                  ,beginU07fileCtr
                  ,U_07FILE_CTR_LEN
                 );
            localU07fileCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkU07fileCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshU07fileCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshU07fileCtr() {	 
			return (getInt(beginU07fileCtr));
   	}
         int localRccycCtrCounter = -1;
         public boolean isRccycCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRccycCtrCounter != sharedCounter;
            localRccycCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int RCCYC_CTR_LEN = 4;
  	/**
	 * serializeRccycCtr
	 */
	protected void serializeRccycCtr(int rccycCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( rccycCtr,RCCYC_CTR_LEN)
                  ,beginRccycCtr
                  ,RCCYC_CTR_LEN
                 );
            localRccycCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkRccycCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshRccycCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRccycCtr() {	 
			return (getInt(beginRccycCtr));
   	}
         int localM2mAlwCtrCounter = -1;
         public boolean isM2mAlwCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localM2mAlwCtrCounter != sharedCounter;
            localM2mAlwCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int M_2M_ALW_CTR_LEN = 4;
  	/**
	 * serializeM2mAlwCtr
	 */
	protected void serializeM2mAlwCtr(int m2mAlwCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( m2mAlwCtr,M_2M_ALW_CTR_LEN)
                  ,beginM2mAlwCtr
                  ,M_2M_ALW_CTR_LEN
                 );
            localM2mAlwCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkM2mAlwCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshM2mAlwCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshM2mAlwCtr() {	 
			return (getInt(beginM2mAlwCtr));
   	}
         int localM2mpromoCtrCounter = -1;
         public boolean isM2mpromoCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localM2mpromoCtrCounter != sharedCounter;
            localM2mpromoCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int M_2MPROMO_CTR_LEN = 4;
  	/**
	 * serializeM2mpromoCtr
	 */
	protected void serializeM2mpromoCtr(int m2mpromoCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( m2mpromoCtr,M_2MPROMO_CTR_LEN)
                  ,beginM2mpromoCtr
                  ,M_2MPROMO_CTR_LEN
                 );
            localM2mpromoCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkM2mpromoCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshM2mpromoCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshM2mpromoCtr() {	 
			return (getInt(beginM2mpromoCtr));
   	}
         int localMtnStatCtrCounter = -1;
         public boolean isMtnStatCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMtnStatCtrCounter != sharedCounter;
            localMtnStatCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int MTN_STAT_CTR_LEN = 4;
  	/**
	 * serializeMtnStatCtr
	 */
	protected void serializeMtnStatCtr(int mtnStatCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( mtnStatCtr,MTN_STAT_CTR_LEN)
                  ,beginMtnStatCtr
                  ,MTN_STAT_CTR_LEN
                 );
            localMtnStatCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMtnStatCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMtnStatCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMtnStatCtr() {	 
			return (getInt(beginMtnStatCtr));
   	}
         int localM2mTermCtrCounter = -1;
         public boolean isM2mTermCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localM2mTermCtrCounter != sharedCounter;
            localM2mTermCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int M_2M_TERM_CTR_LEN = 4;
  	/**
	 * serializeM2mTermCtr
	 */
	protected void serializeM2mTermCtr(int m2mTermCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( m2mTermCtr,M_2M_TERM_CTR_LEN)
                  ,beginM2mTermCtr
                  ,M_2M_TERM_CTR_LEN
                 );
            localM2mTermCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkM2mTermCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshM2mTermCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshM2mTermCtr() {	 
			return (getInt(beginM2mTermCtr));
   	}
         int localTrlCpduCntCounter = -1;
         public boolean isTrlCpduCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrlCpduCntCounter != sharedCounter;
            localTrlCpduCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRL_CPDU_CNT_LEN = 4;
  	/**
	 * serializeTrlCpduCnt
	 */
	protected void serializeTrlCpduCnt(int trlCpduCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( trlCpduCnt,TRL_CPDU_CNT_LEN)
                  ,beginTrlCpduCnt
                  ,TRL_CPDU_CNT_LEN
                 );
            localTrlCpduCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrlCpduCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrlCpduCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrlCpduCnt() {	 
			return (getInt(beginTrlCpduCnt));
   	}
         int localTrlUsageCntCounter = -1;
         public boolean isTrlUsageCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrlUsageCntCounter != sharedCounter;
            localTrlUsageCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRL_USAGE_CNT_LEN = 4;
  	/**
	 * serializeTrlUsageCnt
	 */
	protected void serializeTrlUsageCnt(int trlUsageCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( trlUsageCnt,TRL_USAGE_CNT_LEN)
                  ,beginTrlUsageCnt
                  ,TRL_USAGE_CNT_LEN
                 );
            localTrlUsageCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrlUsageCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrlUsageCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrlUsageCnt() {	 
			return (getInt(beginTrlUsageCnt));
   	}
         int localTrlLsbcaCntCounter = -1;
         public boolean isTrlLsbcaCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrlLsbcaCntCounter != sharedCounter;
            localTrlLsbcaCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRL_LSBCA_CNT_LEN = 4;
  	/**
	 * serializeTrlLsbcaCnt
	 */
	protected void serializeTrlLsbcaCnt(int trlLsbcaCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( trlLsbcaCnt,TRL_LSBCA_CNT_LEN)
                  ,beginTrlLsbcaCnt
                  ,TRL_LSBCA_CNT_LEN
                 );
            localTrlLsbcaCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrlLsbcaCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrlLsbcaCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrlLsbcaCnt() {	 
			return (getInt(beginTrlLsbcaCnt));
   	}
         int localTrlLsgremCntCounter = -1;
         public boolean isTrlLsgremCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrlLsgremCntCounter != sharedCounter;
            localTrlLsgremCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRL_LSGREM_CNT_LEN = 4;
  	/**
	 * serializeTrlLsgremCnt
	 */
	protected void serializeTrlLsgremCnt(int trlLsgremCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( trlLsgremCnt,TRL_LSGREM_CNT_LEN)
                  ,beginTrlLsgremCnt
                  ,TRL_LSGREM_CNT_LEN
                 );
            localTrlLsgremCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrlLsgremCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrlLsgremCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrlLsgremCnt() {	 
			return (getInt(beginTrlLsgremCnt));
   	}
         int localTrlAtdsumCntCounter = -1;
         public boolean isTrlAtdsumCntModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTrlAtdsumCntCounter != sharedCounter;
            localTrlAtdsumCntCounter = sharedCounter; return hasModified; 
         }
   protected static final int TRL_ATDSUM_CNT_LEN = 4;
  	/**
	 * serializeTrlAtdsumCnt
	 */
	protected void serializeTrlAtdsumCnt(int trlAtdsumCnt) {
           replaceValue( //  save the value as string
                   getBinaryString( trlAtdsumCnt,TRL_ATDSUM_CNT_LEN)
                  ,beginTrlAtdsumCnt
                  ,TRL_ATDSUM_CNT_LEN
                 );
            localTrlAtdsumCntCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTrlAtdsumCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTrlAtdsumCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTrlAtdsumCnt() {	 
			return (getInt(beginTrlAtdsumCnt));
   	}
         int localSaveICounter = -1;
         public boolean isSaveIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSaveICounter != sharedCounter;
            localSaveICounter = sharedCounter; return hasModified; 
         }
   protected static final int SAVE_I_LEN = 2;
  	/**
	 * serializeSaveI
	 */
	protected void serializeSaveI(short saveI) {
           replaceValue( //  save the value as string
                   getBinaryString( saveI,SAVE_I_LEN)
                  ,beginSaveI
                  ,SAVE_I_LEN
                 );
            localSaveICounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSaveIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSaveI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSaveI() {	 
			return (getShort(beginSaveI));
   	}
         int localCountCounter = -1;
         public boolean isCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCountCounter != sharedCounter;
            localCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int COUNT_LEN = 2;
  	/**
	 * serializeCount
	 */
	protected void serializeCount(short count) {
           replaceValue( //  save the value as string
                   getBinaryString( count,COUNT_LEN)
                  ,beginCount
                  ,COUNT_LEN
                 );
            localCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCount() {	 
			return (getShort(beginCount));
   	}
         int localIdxCounter = -1;
         public boolean isIdxModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIdxCounter != sharedCounter;
            localIdxCounter = sharedCounter; return hasModified; 
         }
   protected static final int IDX_LEN = 2;
  	/**
	 * serializeIdx
	 */
	protected void serializeIdx(short idx) {
           replaceValue( //  save the value as string
                   getBinaryString( idx,IDX_LEN)
                  ,beginIdx
                  ,IDX_LEN
                 );
            localIdxCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIdxMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIdx() {	 
			return (getShort(beginIdx));
   	}




}
  
