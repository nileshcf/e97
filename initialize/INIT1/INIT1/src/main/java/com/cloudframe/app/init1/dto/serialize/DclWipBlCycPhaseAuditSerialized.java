package com.cloudframe.app.init1.dto.serialize;

/**
*  The class DclWipBlCycPhaseAuditSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DclWipBlCycPhaseAuditSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclWipBlCycPhaseAuditSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCL_WIP_BL_CYC_PHASE_AUDIT_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTb33006BlSegregateNo;
            protected  int beginTb33006BlCycNo;
            protected  int beginTb33006BlStreamCd;
            protected  int beginTb33006JobIterationNo;
            protected  int beginTb33006PhaseTyp;
            protected  int beginTb33006CycMthYr;
            protected  int beginTb33006RptTypCd;
            protected  int beginTb33006RptAttrCd;
            protected  int beginTb33006RptAttrIdNo;
            protected  int beginTb33006RptColNameCd;
            protected  int beginTb33006RptColTypCd;
            protected  int beginTb33006RptColValue;
            protected  int beginTb33006DbUserid;
            protected  int beginTb33006DbTmstamp;
	
	/**
	* Constructor for DclWipBlCycPhaseAuditSerialized
	**/
    public DclWipBlCycPhaseAuditSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclWipBlCycPhaseAuditSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCL_WIP_BL_CYC_PHASE_AUDIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTb33006BlSegregateNo = getStartOffset() + 0;	// set offset for serialization
  
             beginTb33006BlCycNo = getStartOffset() + 2;	// set offset for serialization
  
             beginTb33006BlStreamCd = getStartOffset() + 4;	// set offset for serialization
  
             beginTb33006JobIterationNo = getStartOffset() + 5;	// set offset for serialization
  
             beginTb33006PhaseTyp = getStartOffset() + 7;	// set offset for serialization
  
             beginTb33006CycMthYr = getStartOffset() + 9;	// set offset for serialization
  
             beginTb33006RptTypCd = getStartOffset() + 15;	// set offset for serialization
  
             beginTb33006RptAttrCd = getStartOffset() + 20;	// set offset for serialization
  
             beginTb33006RptAttrIdNo = getStartOffset() + 23;	// set offset for serialization
  
             beginTb33006RptColNameCd = getStartOffset() + 27;	// set offset for serialization
  
             beginTb33006RptColTypCd = getStartOffset() + 30;	// set offset for serialization
  
             beginTb33006RptColValue = getStartOffset() + 31;	// set offset for serialization
  
             beginTb33006DbUserid = getStartOffset() + 39;	// set offset for serialization
  
             beginTb33006DbTmstamp = getStartOffset() + 47;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTb33006BlSegregateNoCounter = -1;
         public boolean isTb33006BlSegregateNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb33006BlSegregateNoCounter != sharedCounter;
            localTb33006BlSegregateNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_33006_BL_SEGREGATE_NO_LEN = 2;
  	/**
	 * serializeTb33006BlSegregateNo
	 */
	protected void serializeTb33006BlSegregateNo(short tb33006BlSegregateNo) {
           replaceValue( //  save the value as string
                   getBinaryString( tb33006BlSegregateNo,TB_33006_BL_SEGREGATE_NO_LEN)
                  ,beginTb33006BlSegregateNo
                  ,TB_33006_BL_SEGREGATE_NO_LEN
                 );
            localTb33006BlSegregateNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTb33006BlSegregateNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTb33006BlSegregateNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTb33006BlSegregateNo() {	 
			return (getShort(beginTb33006BlSegregateNo));
   	}
     int localTb33006BlCycNoCounter = -1;
     public boolean isTb33006BlCycNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006BlCycNoCounter != sharedCounter;
         localTb33006BlCycNoCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_BL_CYC_NO_LEN = 2;
	/**
	 * 	serialize this Tb33006BlCycNo
	 */
   protected void serializeTb33006BlCycNo(char[] tb33006BlCycNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006BlCycNo,0,getStringValue(),beginTb33006BlCycNo,TB_33006_BL_CYC_NO_LEN);
       localTb33006BlCycNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006BlCycNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTb33006BlCycNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006BlCycNo() {	 
   		return (substring(getStringValue(),beginTb33006BlCycNo,beginTb33006BlCycNo + TB_33006_BL_CYC_NO_LEN));
   	}
     int localTb33006BlStreamCdCounter = -1;
     public boolean isTb33006BlStreamCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006BlStreamCdCounter != sharedCounter;
         localTb33006BlStreamCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_BL_STREAM_CD_LEN = 1;
	/**
	 * 	serialize this Tb33006BlStreamCd
	 */
   protected void serializeTb33006BlStreamCd(char[] tb33006BlStreamCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006BlStreamCd,0,getStringValue(),beginTb33006BlStreamCd,TB_33006_BL_STREAM_CD_LEN);
       localTb33006BlStreamCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006BlStreamCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTb33006BlStreamCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006BlStreamCd() {	 
   		return (substring(getStringValue(),beginTb33006BlStreamCd,beginTb33006BlStreamCd + TB_33006_BL_STREAM_CD_LEN));
   	}
         int localTb33006JobIterationNoCounter = -1;
         public boolean isTb33006JobIterationNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb33006JobIterationNoCounter != sharedCounter;
            localTb33006JobIterationNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_33006_JOB_ITERATION_NO_LEN = 2;
  	/**
	 * serializeTb33006JobIterationNo
	 */
	protected void serializeTb33006JobIterationNo(short tb33006JobIterationNo) {
           replaceValue( //  save the value as string
                   getBinaryString( tb33006JobIterationNo,TB_33006_JOB_ITERATION_NO_LEN)
                  ,beginTb33006JobIterationNo
                  ,TB_33006_JOB_ITERATION_NO_LEN
                 );
            localTb33006JobIterationNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTb33006JobIterationNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTb33006JobIterationNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTb33006JobIterationNo() {	 
			return (getShort(beginTb33006JobIterationNo));
   	}
     int localTb33006PhaseTypCounter = -1;
     public boolean isTb33006PhaseTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006PhaseTypCounter != sharedCounter;
         localTb33006PhaseTypCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_PHASE_TYP_LEN = 2;
	/**
	 * 	serialize this Tb33006PhaseTyp
	 */
   protected void serializeTb33006PhaseTyp(char[] tb33006PhaseTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006PhaseTyp,0,getStringValue(),beginTb33006PhaseTyp,TB_33006_PHASE_TYP_LEN);
       localTb33006PhaseTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006PhaseTypConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTb33006PhaseTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006PhaseTyp() {	 
   		return (substring(getStringValue(),beginTb33006PhaseTyp,beginTb33006PhaseTyp + TB_33006_PHASE_TYP_LEN));
   	}
     int localTb33006CycMthYrCounter = -1;
     public boolean isTb33006CycMthYrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006CycMthYrCounter != sharedCounter;
         localTb33006CycMthYrCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_CYC_MTH_YR_LEN = 6;
	/**
	 * 	serialize this Tb33006CycMthYr
	 */
   protected void serializeTb33006CycMthYr(char[] tb33006CycMthYr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006CycMthYr,0,getStringValue(),beginTb33006CycMthYr,TB_33006_CYC_MTH_YR_LEN);
       localTb33006CycMthYrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006CycMthYrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTb33006CycMthYr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006CycMthYr() {	 
   		return (substring(getStringValue(),beginTb33006CycMthYr,beginTb33006CycMthYr + TB_33006_CYC_MTH_YR_LEN));
   	}
     int localTb33006RptTypCdCounter = -1;
     public boolean isTb33006RptTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006RptTypCdCounter != sharedCounter;
         localTb33006RptTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_RPT_TYP_CD_LEN = 5;
	/**
	 * 	serialize this Tb33006RptTypCd
	 */
   protected void serializeTb33006RptTypCd(char[] tb33006RptTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006RptTypCd,0,getStringValue(),beginTb33006RptTypCd,TB_33006_RPT_TYP_CD_LEN);
       localTb33006RptTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006RptTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshTb33006RptTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006RptTypCd() {	 
   		return (substring(getStringValue(),beginTb33006RptTypCd,beginTb33006RptTypCd + TB_33006_RPT_TYP_CD_LEN));
   	}
     int localTb33006RptAttrCdCounter = -1;
     public boolean isTb33006RptAttrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006RptAttrCdCounter != sharedCounter;
         localTb33006RptAttrCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_RPT_ATTR_CD_LEN = 3;
	/**
	 * 	serialize this Tb33006RptAttrCd
	 */
   protected void serializeTb33006RptAttrCd(char[] tb33006RptAttrCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006RptAttrCd,0,getStringValue(),beginTb33006RptAttrCd,TB_33006_RPT_ATTR_CD_LEN);
       localTb33006RptAttrCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006RptAttrCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTb33006RptAttrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006RptAttrCd() {	 
   		return (substring(getStringValue(),beginTb33006RptAttrCd,beginTb33006RptAttrCd + TB_33006_RPT_ATTR_CD_LEN));
   	}
         int localTb33006RptAttrIdNoCounter = -1;
         public boolean isTb33006RptAttrIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTb33006RptAttrIdNoCounter != sharedCounter;
            localTb33006RptAttrIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int TB_33006_RPT_ATTR_ID_NO_LEN = 4;
  	/**
	 * serializeTb33006RptAttrIdNo
	 */
	protected void serializeTb33006RptAttrIdNo(int tb33006RptAttrIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( tb33006RptAttrIdNo,TB_33006_RPT_ATTR_ID_NO_LEN)
                  ,beginTb33006RptAttrIdNo
                  ,TB_33006_RPT_ATTR_ID_NO_LEN
                 );
            localTb33006RptAttrIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTb33006RptAttrIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTb33006RptAttrIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTb33006RptAttrIdNo() {	 
			return (getInt(beginTb33006RptAttrIdNo));
   	}
     int localTb33006RptColNameCdCounter = -1;
     public boolean isTb33006RptColNameCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006RptColNameCdCounter != sharedCounter;
         localTb33006RptColNameCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_RPT_COL_NAME_CD_LEN = 3;
	/**
	 * 	serialize this Tb33006RptColNameCd
	 */
   protected void serializeTb33006RptColNameCd(char[] tb33006RptColNameCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006RptColNameCd,0,getStringValue(),beginTb33006RptColNameCd,TB_33006_RPT_COL_NAME_CD_LEN);
       localTb33006RptColNameCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006RptColNameCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTb33006RptColNameCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006RptColNameCd() {	 
   		return (substring(getStringValue(),beginTb33006RptColNameCd,beginTb33006RptColNameCd + TB_33006_RPT_COL_NAME_CD_LEN));
   	}
     int localTb33006RptColTypCdCounter = -1;
     public boolean isTb33006RptColTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006RptColTypCdCounter != sharedCounter;
         localTb33006RptColTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_RPT_COL_TYP_CD_LEN = 1;
	/**
	 * 	serialize this Tb33006RptColTypCd
	 */
   protected void serializeTb33006RptColTypCd(char[] tb33006RptColTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006RptColTypCd,0,getStringValue(),beginTb33006RptColTypCd,TB_33006_RPT_COL_TYP_CD_LEN);
       localTb33006RptColTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006RptColTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTb33006RptColTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006RptColTypCd() {	 
   		return (substring(getStringValue(),beginTb33006RptColTypCd,beginTb33006RptColTypCd + TB_33006_RPT_COL_TYP_CD_LEN));
   	}
        int localTb33006RptColValueCounter = -1;
        public boolean isTb33006RptColValueModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTb33006RptColValueCounter != sharedCounter;
           localTb33006RptColValueCounter = sharedCounter; return hasModified; 
        }
	    public boolean tb33006RptColValueIsNumeric() {
	      return decimalIsNumeric(beginTb33006RptColValue,TB_33006_RPT_COL_VALUE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] tb33006RptColValueString() {
            return getPackedString(beginTb33006RptColValue,TB_33006_RPT_COL_VALUE_LEN);
         }
   protected static final int TB_33006_RPT_COL_VALUE_LEN = 8;
   protected static final int TB_33006_RPT_COL_VALUE_SCALE = 2;
  	/**
	 * 	serializeTb33006RptColValue
	 */
	protected void serializeTb33006RptColValue(BigDecimal tb33006RptColValue) {
		   putDecimal(beginTb33006RptColValue,tb33006RptColValue,TB_33006_RPT_COL_VALUE_LEN,TB_33006_RPT_COL_VALUE_SCALE,true);
		 localTb33006RptColValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkTb33006RptColValueMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshTb33006RptColValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshTb33006RptColValue() throws CFException {	
   	try { 
		 return (getDecimal(beginTb33006RptColValue,TB_33006_RPT_COL_VALUE_LEN,TB_33006_RPT_COL_VALUE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("tb33006RptColValue", beginTb33006RptColValue,TB_33006_RPT_COL_VALUE_LEN);
     }
   	}
     int localTb33006DbUseridCounter = -1;
     public boolean isTb33006DbUseridModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006DbUseridCounter != sharedCounter;
         localTb33006DbUseridCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_DB_USERID_LEN = 8;
	/**
	 * 	serialize this Tb33006DbUserid
	 */
   protected void serializeTb33006DbUserid(char[] tb33006DbUserid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006DbUserid,0,getStringValue(),beginTb33006DbUserid,TB_33006_DB_USERID_LEN);
       localTb33006DbUseridCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006DbUseridConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTb33006DbUserid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006DbUserid() {	 
   		return (substring(getStringValue(),beginTb33006DbUserid,beginTb33006DbUserid + TB_33006_DB_USERID_LEN));
   	}
     int localTb33006DbTmstampCounter = -1;
     public boolean isTb33006DbTmstampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTb33006DbTmstampCounter != sharedCounter;
         localTb33006DbTmstampCounter = sharedCounter; return hasModified;
     }
	protected static final int TB_33006_DB_TMSTAMP_LEN = 26;
	/**
	 * 	serialize this Tb33006DbTmstamp
	 */
   protected void serializeTb33006DbTmstamp(char[] tb33006DbTmstamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tb33006DbTmstamp,0,getStringValue(),beginTb33006DbTmstamp,TB_33006_DB_TMSTAMP_LEN);
       localTb33006DbTmstampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTb33006DbTmstampConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTb33006DbTmstamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTb33006DbTmstamp() {	 
   		return (substring(getStringValue(),beginTb33006DbTmstamp,beginTb33006DbTmstamp + TB_33006_DB_TMSTAMP_LEN));
   	}




}
  
