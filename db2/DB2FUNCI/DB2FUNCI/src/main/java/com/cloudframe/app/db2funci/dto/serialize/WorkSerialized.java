package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCntngYldRt;
            protected  int beginBdms01CntngYldRtEdt;
            protected  int beginIsinCnt;
            protected  int beginDecimalEdit;
            protected  int beginCtryHoliCt;
            protected  int beginSqlcodeDisp;
	
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
             beginCntngYldRt = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01CntngYldRtEdt = getStartOffset() + 5;	// set offset for serialization
  
             beginIsinCnt = getStartOffset() + 21;	// set offset for serialization
  
             beginDecimalEdit = getStartOffset() + 29;	// set offset for serialization
  
             beginCtryHoliCt = getStartOffset() + 45;	// set offset for serialization
  
             beginSqlcodeDisp = getStartOffset() + 50;	// set offset for serialization
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
        int localCntngYldRtCounter = -1;
        public boolean isCntngYldRtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCntngYldRtCounter != sharedCounter;
           localCntngYldRtCounter = sharedCounter; return hasModified; 
        }
	    public boolean cntngYldRtIsNumeric() {
	      return decimalIsNumeric(beginCntngYldRt,CNTNG_YLD_RT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] cntngYldRtString() {
            return getPackedString(beginCntngYldRt,CNTNG_YLD_RT_LEN);
         }
   protected static final int CNTNG_YLD_RT_LEN = 5;
   protected static final int CNTNG_YLD_RT_SCALE = 6;
  	/**
	 * 	serializeCntngYldRt
	 */
	protected void serializeCntngYldRt(BigDecimal cntngYldRt) {
		   putDecimal(beginCntngYldRt,cntngYldRt,CNTNG_YLD_RT_LEN,CNTNG_YLD_RT_SCALE,true);
		 localCntngYldRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkCntngYldRtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshCntngYldRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshCntngYldRt() throws CFException {	
   	try { 
		 return (getDecimal(beginCntngYldRt,CNTNG_YLD_RT_LEN,CNTNG_YLD_RT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("cntngYldRt", beginCntngYldRt,CNTNG_YLD_RT_LEN);
     }
   	}
     int localBdms01CntngYldRtEdtCounter = -1;
     public boolean isBdms01CntngYldRtEdtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CntngYldRtEdtCounter != sharedCounter;
         localBdms01CntngYldRtEdtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CNTNG_YLD_RT_EDT_LEN = 16;
	/**
	 * 	serialize this Bdms01CntngYldRtEdt
	 */
   protected void serializeBdms01CntngYldRtEdt(char[] bdms01CntngYldRtEdt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CntngYldRtEdt,0,getStringValue(),beginBdms01CntngYldRtEdt,BDMS_01_CNTNG_YLD_RT_EDT_LEN);
       localBdms01CntngYldRtEdtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CntngYldRtEdtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshBdms01CntngYldRtEdt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CntngYldRtEdt() {	 
   		return (substring(getStringValue(),beginBdms01CntngYldRtEdt,beginBdms01CntngYldRtEdt + BDMS_01_CNTNG_YLD_RT_EDT_LEN));
   	}
     int localIsinCntCounter = -1;
     public boolean isIsinCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsinCntCounter != sharedCounter;
         localIsinCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of isinCnt
	 *	@return isinCnt
	 */
	public char[]  getIsinCntString() {
	     return getCharArray(beginIsinCnt,ISIN_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isinCntIsNumeric() {
	    return isNumeric(beginIsinCnt
	                    ,beginIsinCnt + ISIN_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ISIN_CNT_LEN = 8;
  	/**
	 * serializeIsinCnt
	 */
	protected void serializeIsinCnt(long isinCnt) {
		 putNumber(beginIsinCnt,isinCnt,ISIN_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIsinCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIsinCnt
	 */
   	protected  long serializeIsinCnt(char[] value) {
	    long  isinCnt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    isinCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginIsinCnt
		       ,8
		      );
		 localIsinCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  isinCnt;
    }

   protected long checkIsinCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIsinCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIsinCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIsinCnt
			                 ,ISIN_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("isinCnt", beginIsinCnt,ISIN_CNT_LEN);
    }
   	}
     int localDecimalEditCounter = -1;
     public boolean isDecimalEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDecimalEditCounter != sharedCounter;
         localDecimalEditCounter = sharedCounter; return hasModified;
     }
	protected static final int DECIMAL_EDIT_LEN = 16;
	/**
	 * 	serialize this DecimalEdit
	 */
   protected void serializeDecimalEdit(char[] decimalEdit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(decimalEdit,0,getStringValue(),beginDecimalEdit,DECIMAL_EDIT_LEN);
       localDecimalEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDecimalEditConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDecimalEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDecimalEdit() {	 
   		return (substring(getStringValue(),beginDecimalEdit,beginDecimalEdit + DECIMAL_EDIT_LEN));
   	}
        int localCtryHoliCtCounter = -1;
        public boolean isCtryHoliCtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCtryHoliCtCounter != sharedCounter;
           localCtryHoliCtCounter = sharedCounter; return hasModified; 
        }
	    public boolean ctryHoliCtIsNumeric() {
	      return decimalIsNumeric(beginCtryHoliCt,CTRY_HOLI_CT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int CTRY_HOLI_CT_LEN = 5;
  	/**
	 * 	serializeCtryHoliCt
	 */
	protected void serializeCtryHoliCt(int ctryHoliCt) {
		   putDecimal(beginCtryHoliCt,ctryHoliCt,CTRY_HOLI_CT_LEN,true);
   }
   

   protected int checkCtryHoliCtMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshCtryHoliCt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCtryHoliCt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginCtryHoliCt,CTRY_HOLI_CT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ctryHoliCt", beginCtryHoliCt,CTRY_HOLI_CT_LEN);
     }
   	}
     int localSqlcodeDispCounter = -1;
     public boolean isSqlcodeDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcodeDispCounter != sharedCounter;
         localSqlcodeDispCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE_DISP_LEN = 5;
	/**
	 * 	serialize this SqlcodeDisp
	 */
   protected void serializeSqlcodeDisp(char[] sqlcodeDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcodeDisp,0,getStringValue(),beginSqlcodeDisp,SQLCODE_DISP_LEN);
       localSqlcodeDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcodeDispConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSqlcodeDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcodeDisp() {	 
   		return (substring(getStringValue(),beginSqlcodeDisp,beginSqlcodeDisp + SQLCODE_DISP_LEN));
   	}
     int localSysinFlagCounter = -1;
     public boolean isSysinFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysinFlagCounter != sharedCounter;
         localSysinFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSysinFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localProcnmCounter = -1;
     public boolean isProcnmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcnmCounter != sharedCounter;
         localProcnmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkProcnmConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localSchemaCounter = -1;
     public boolean isSchemaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSchemaCounter != sharedCounter;
         localSchemaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSchemaConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localNumCursorsCounter = -1;
         public boolean isNumCursorsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNumCursorsCounter != sharedCounter;
            localNumCursorsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNumCursorsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localOutCodeCounter = -1;
         public boolean isOutCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOutCodeCounter != sharedCounter;
            localOutCodeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkOutCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localParmindCounter = -1;
         public boolean isParmindModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmindCounter != sharedCounter;
            localParmindCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkParmindMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localIsinCursorFlgCounter = -1;
     public boolean isIsinCursorFlgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsinCursorFlgCounter != sharedCounter;
         localIsinCursorFlgCounter = sharedCounter; return hasModified;
     }

   protected char[] checkIsinCursorFlgConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localLoc1Counter = -1;
     public boolean isLoc1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLoc1Counter != sharedCounter;
         localLoc1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkLoc1Constraints(char[] value) {
   			return super.checkConstraints(value , 0 ,false, false);
   }




}
  
