package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01BaseSecurityExpDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01BaseSecurityExpDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BaseSecurityExpDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BASE_SECURITY_EXP_DATA_LENGTH = 216;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01PutEndDt;
            protected  int beginBdms01PutNtcMinDyQty;
            protected  int beginBdms01PutNtcMaxDyQty;
            protected  int beginBdms01CltrlTypeCd;
            protected  int beginBdms01PutFreqCd;
            protected  int beginBdms01MtrtyTypeCd;
            protected  int beginBdms01LnkdCd;
            protected  int beginBdms01ActnRtInd;
            protected  int beginBdms01FrstVrblRstDt;
            protected  int beginBdms01RstFreqCd;
            protected  int beginBdms01Call2TmngCd;
            protected  int beginBdms01ExchgPrimeCd;
            protected  int beginBdms01MrktTierCd;
            protected  int beginBdms01MrktIndCd;
            protected  int beginBdms01NewTraceInd;
            protected  int beginBdms01QuickCd;
            protected  int beginBdms01LseMrktCd;
            protected  int beginBdms01IsinChngInd;
            protected  int beginBdms01StkIssueSttsCd;
            protected  int beginBdms01IssrTypeCd;
            protected  int beginBdms01TraceSymblTxt;
            protected  int beginBdms01RegsInd;
            protected  int beginBdms01PpnCd;
            protected  int beginBdms01PpnInd;
            protected  int beginBdms01DtcUnrtdMoodyCd;
            protected  int beginBdms01DtcUnrtdSpCd;
            protected  int beginBdms01TirsSecTypeCd;
            protected  int beginBdms01SifmaSmgInd;
            protected  int beginBdms01CalledAncmtCd;
            protected  int beginBdms01PrtlRdmptSchdCd;
            protected  int beginBdms01FdrlTaxSttsCd;
            protected  int beginBdms01CntngTaxCd;
            protected  int beginBdms01CntngYldRt;
            protected  int beginBdms01SecTypeCd;
            protected  int beginBdms01CltrlIssCd;
            protected  int beginBdms01RangeInd;
            protected  int beginBdms01B8CntngPymntCd;
            protected  int beginBdms01CrntCpnTypeCd;
            protected  int beginBdms01Extelc1SecTypCd;
	
	/**
	* Constructor for Bdms01BaseSecurityExpDataSerialized
	**/
    public Bdms01BaseSecurityExpDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BaseSecurityExpDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BaseSecurityExpDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BaseSecurityExpDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4030); // serialize this field at offset 4030 by default 
    }
    
	/**
	* sets parent for this Bdms01BaseSecurityExpDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4030 by default
    }    
	/**
	* initializes the field in Bdms01BaseSecurityExpDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BASE_SECURITY_EXP_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01PutEndDt = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01PutNtcMinDyQty = getStartOffset() + 10;	// set offset for serialization
  
             beginBdms01PutNtcMaxDyQty = getStartOffset() + 13;	// set offset for serialization
  
             beginBdms01CltrlTypeCd = getStartOffset() + 16;	// set offset for serialization
  
             beginBdms01PutFreqCd = getStartOffset() + 18;	// set offset for serialization
  
             beginBdms01MtrtyTypeCd = getStartOffset() + 20;	// set offset for serialization
  
             beginBdms01LnkdCd = getStartOffset() + 22;	// set offset for serialization
  
             beginBdms01ActnRtInd = getStartOffset() + 23;	// set offset for serialization
  
             beginBdms01FrstVrblRstDt = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01RstFreqCd = getStartOffset() + 34;	// set offset for serialization
  
             beginBdms01Call2TmngCd = getStartOffset() + 36;	// set offset for serialization
  
             beginBdms01ExchgPrimeCd = getStartOffset() + 38;	// set offset for serialization
  
             beginBdms01MrktTierCd = getStartOffset() + 41;	// set offset for serialization
  
             beginBdms01MrktIndCd = getStartOffset() + 42;	// set offset for serialization
  
             beginBdms01NewTraceInd = getStartOffset() + 46;	// set offset for serialization
  
             beginBdms01QuickCd = getStartOffset() + 47;	// set offset for serialization
  
             beginBdms01LseMrktCd = getStartOffset() + 53;	// set offset for serialization
  
             beginBdms01IsinChngInd = getStartOffset() + 57;	// set offset for serialization
  
             beginBdms01StkIssueSttsCd = getStartOffset() + 58;	// set offset for serialization
  
             beginBdms01IssrTypeCd = getStartOffset() + 59;	// set offset for serialization
  
             beginBdms01TraceSymblTxt = getStartOffset() + 60;	// set offset for serialization
  
             beginBdms01RegsInd = getStartOffset() + 74;	// set offset for serialization
  
             beginBdms01PpnCd = getStartOffset() + 75;	// set offset for serialization
  
             beginBdms01PpnInd = getStartOffset() + 78;	// set offset for serialization
  
             beginBdms01DtcUnrtdMoodyCd = getStartOffset() + 79;	// set offset for serialization
  
             beginBdms01DtcUnrtdSpCd = getStartOffset() + 80;	// set offset for serialization
  
             beginBdms01TirsSecTypeCd = getStartOffset() + 81;	// set offset for serialization
  
             beginBdms01SifmaSmgInd = getStartOffset() + 82;	// set offset for serialization
  
             beginBdms01CalledAncmtCd = getStartOffset() + 83;	// set offset for serialization
  
             beginBdms01PrtlRdmptSchdCd = getStartOffset() + 84;	// set offset for serialization
  
             beginBdms01FdrlTaxSttsCd = getStartOffset() + 85;	// set offset for serialization
  
             beginBdms01CntngTaxCd = getStartOffset() + 86;	// set offset for serialization
  
             beginBdms01CntngYldRt = getStartOffset() + 87;	// set offset for serialization
  
             beginBdms01SecTypeCd = getStartOffset() + 102;	// set offset for serialization
  
             beginBdms01CltrlIssCd = getStartOffset() + 105;	// set offset for serialization
  
             beginBdms01RangeInd = getStartOffset() + 107;	// set offset for serialization
  
             beginBdms01B8CntngPymntCd = getStartOffset() + 108;	// set offset for serialization
  
             beginBdms01CrntCpnTypeCd = getStartOffset() + 109;	// set offset for serialization
  
             beginBdms01Extelc1SecTypCd = getStartOffset() + 110;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01PutEndDtCounter = -1;
     public boolean isBdms01PutEndDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutEndDtCounter != sharedCounter;
         localBdms01PutEndDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_END_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PutEndDt
	 */
   protected void serializeBdms01PutEndDt(char[] bdms01PutEndDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutEndDt,0,getStringValue(),beginBdms01PutEndDt,BDMS_01_PUT_END_DT_LEN);
       localBdms01PutEndDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutEndDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PutEndDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutEndDt() {	 
   		return (substring(getStringValue(),beginBdms01PutEndDt,beginBdms01PutEndDt + BDMS_01_PUT_END_DT_LEN));
   	}
     int localBdms01PutNtcMinDyQtyCounter = -1;
     public boolean isBdms01PutNtcMinDyQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutNtcMinDyQtyCounter != sharedCounter;
         localBdms01PutNtcMinDyQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01PutNtcMinDyQty
	 *	@return bdms01PutNtcMinDyQty
	 */
	public char[]  getBdms01PutNtcMinDyQtyString() {
	     return getCharArray(beginBdms01PutNtcMinDyQty,BDMS_01_PUT_NTC_MIN_DY_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01PutNtcMinDyQtyIsNumeric() {
	    return isNumeric(beginBdms01PutNtcMinDyQty
	                    ,beginBdms01PutNtcMinDyQty + BDMS_01_PUT_NTC_MIN_DY_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_PUT_NTC_MIN_DY_QTY_LEN = 3;
  	/**
	 * serializeBdms01PutNtcMinDyQty
	 */
	protected void serializeBdms01PutNtcMinDyQty(int bdms01PutNtcMinDyQty) {
		 putNumber(beginBdms01PutNtcMinDyQty,bdms01PutNtcMinDyQty,BDMS_01_PUT_NTC_MIN_DY_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01PutNtcMinDyQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01PutNtcMinDyQty
	 */
   	protected  int serializeBdms01PutNtcMinDyQty(char[] value) {
	    int  bdms01PutNtcMinDyQty;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01PutNtcMinDyQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBdms01PutNtcMinDyQty
		       ,3
		      );
		 localBdms01PutNtcMinDyQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01PutNtcMinDyQty;
    }

   protected int checkBdms01PutNtcMinDyQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01PutNtcMinDyQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01PutNtcMinDyQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01PutNtcMinDyQty
			                 ,BDMS_01_PUT_NTC_MIN_DY_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01PutNtcMinDyQty", beginBdms01PutNtcMinDyQty,BDMS_01_PUT_NTC_MIN_DY_QTY_LEN);
    }
   	}
     int localBdms01PutNtcMaxDyQtyCounter = -1;
     public boolean isBdms01PutNtcMaxDyQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutNtcMaxDyQtyCounter != sharedCounter;
         localBdms01PutNtcMaxDyQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01PutNtcMaxDyQty
	 *	@return bdms01PutNtcMaxDyQty
	 */
	public char[]  getBdms01PutNtcMaxDyQtyString() {
	     return getCharArray(beginBdms01PutNtcMaxDyQty,BDMS_01_PUT_NTC_MAX_DY_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01PutNtcMaxDyQtyIsNumeric() {
	    return isNumeric(beginBdms01PutNtcMaxDyQty
	                    ,beginBdms01PutNtcMaxDyQty + BDMS_01_PUT_NTC_MAX_DY_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_PUT_NTC_MAX_DY_QTY_LEN = 3;
  	/**
	 * serializeBdms01PutNtcMaxDyQty
	 */
	protected void serializeBdms01PutNtcMaxDyQty(int bdms01PutNtcMaxDyQty) {
		 putNumber(beginBdms01PutNtcMaxDyQty,bdms01PutNtcMaxDyQty,BDMS_01_PUT_NTC_MAX_DY_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01PutNtcMaxDyQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01PutNtcMaxDyQty
	 */
   	protected  int serializeBdms01PutNtcMaxDyQty(char[] value) {
	    int  bdms01PutNtcMaxDyQty;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01PutNtcMaxDyQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBdms01PutNtcMaxDyQty
		       ,3
		      );
		 localBdms01PutNtcMaxDyQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01PutNtcMaxDyQty;
    }

   protected int checkBdms01PutNtcMaxDyQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01PutNtcMaxDyQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01PutNtcMaxDyQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01PutNtcMaxDyQty
			                 ,BDMS_01_PUT_NTC_MAX_DY_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01PutNtcMaxDyQty", beginBdms01PutNtcMaxDyQty,BDMS_01_PUT_NTC_MAX_DY_QTY_LEN);
    }
   	}
     int localBdms01CltrlTypeCdCounter = -1;
     public boolean isBdms01CltrlTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CltrlTypeCdCounter != sharedCounter;
         localBdms01CltrlTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CLTRL_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CltrlTypeCd
	 */
   protected void serializeBdms01CltrlTypeCd(char[] bdms01CltrlTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CltrlTypeCd,0,getStringValue(),beginBdms01CltrlTypeCd,BDMS_01_CLTRL_TYPE_CD_LEN);
       localBdms01CltrlTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CltrlTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CltrlTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CltrlTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01CltrlTypeCd,beginBdms01CltrlTypeCd + BDMS_01_CLTRL_TYPE_CD_LEN));
   	}
     int localBdms01PutFreqCdCounter = -1;
     public boolean isBdms01PutFreqCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutFreqCdCounter != sharedCounter;
         localBdms01PutFreqCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_FREQ_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01PutFreqCd
	 */
   protected void serializeBdms01PutFreqCd(char[] bdms01PutFreqCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutFreqCd,0,getStringValue(),beginBdms01PutFreqCd,BDMS_01_PUT_FREQ_CD_LEN);
       localBdms01PutFreqCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutFreqCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01PutFreqCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutFreqCd() {	 
   		return (substring(getStringValue(),beginBdms01PutFreqCd,beginBdms01PutFreqCd + BDMS_01_PUT_FREQ_CD_LEN));
   	}
     int localBdms01MtrtyTypeCdCounter = -1;
     public boolean isBdms01MtrtyTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MtrtyTypeCdCounter != sharedCounter;
         localBdms01MtrtyTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MTRTY_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01MtrtyTypeCd
	 */
   protected void serializeBdms01MtrtyTypeCd(char[] bdms01MtrtyTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MtrtyTypeCd,0,getStringValue(),beginBdms01MtrtyTypeCd,BDMS_01_MTRTY_TYPE_CD_LEN);
       localBdms01MtrtyTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MtrtyTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01MtrtyTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MtrtyTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01MtrtyTypeCd,beginBdms01MtrtyTypeCd + BDMS_01_MTRTY_TYPE_CD_LEN));
   	}
     int localBdms01LnkdCdCounter = -1;
     public boolean isBdms01LnkdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01LnkdCdCounter != sharedCounter;
         localBdms01LnkdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_LNKD_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01LnkdCd
	 */
   protected void serializeBdms01LnkdCd(char[] bdms01LnkdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01LnkdCd,0,getStringValue(),beginBdms01LnkdCd,BDMS_01_LNKD_CD_LEN);
       localBdms01LnkdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01LnkdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01LnkdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01LnkdCd() {	 
   		return (substring(getStringValue(),beginBdms01LnkdCd,beginBdms01LnkdCd + BDMS_01_LNKD_CD_LEN));
   	}
     int localBdms01ActnRtIndCounter = -1;
     public boolean isBdms01ActnRtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ActnRtIndCounter != sharedCounter;
         localBdms01ActnRtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ACTN_RT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01ActnRtInd
	 */
   protected void serializeBdms01ActnRtInd(char[] bdms01ActnRtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ActnRtInd,0,getStringValue(),beginBdms01ActnRtInd,BDMS_01_ACTN_RT_IND_LEN);
       localBdms01ActnRtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ActnRtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01ActnRtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ActnRtInd() {	 
   		return (substring(getStringValue(),beginBdms01ActnRtInd,beginBdms01ActnRtInd + BDMS_01_ACTN_RT_IND_LEN));
   	}
     int localBdms01FrstVrblRstDtCounter = -1;
     public boolean isBdms01FrstVrblRstDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FrstVrblRstDtCounter != sharedCounter;
         localBdms01FrstVrblRstDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FRST_VRBL_RST_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01FrstVrblRstDt
	 */
   protected void serializeBdms01FrstVrblRstDt(char[] bdms01FrstVrblRstDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FrstVrblRstDt,0,getStringValue(),beginBdms01FrstVrblRstDt,BDMS_01_FRST_VRBL_RST_DT_LEN);
       localBdms01FrstVrblRstDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FrstVrblRstDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01FrstVrblRstDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FrstVrblRstDt() {	 
   		return (substring(getStringValue(),beginBdms01FrstVrblRstDt,beginBdms01FrstVrblRstDt + BDMS_01_FRST_VRBL_RST_DT_LEN));
   	}
     int localBdms01RstFreqCdCounter = -1;
     public boolean isBdms01RstFreqCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RstFreqCdCounter != sharedCounter;
         localBdms01RstFreqCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RST_FREQ_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01RstFreqCd
	 */
   protected void serializeBdms01RstFreqCd(char[] bdms01RstFreqCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RstFreqCd,0,getStringValue(),beginBdms01RstFreqCd,BDMS_01_RST_FREQ_CD_LEN);
       localBdms01RstFreqCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RstFreqCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01RstFreqCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RstFreqCd() {	 
   		return (substring(getStringValue(),beginBdms01RstFreqCd,beginBdms01RstFreqCd + BDMS_01_RST_FREQ_CD_LEN));
   	}
     int localBdms01Call2TmngCdCounter = -1;
     public boolean isBdms01Call2TmngCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Call2TmngCdCounter != sharedCounter;
         localBdms01Call2TmngCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALL_2_TMNG_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Call2TmngCd
	 */
   protected void serializeBdms01Call2TmngCd(char[] bdms01Call2TmngCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Call2TmngCd,0,getStringValue(),beginBdms01Call2TmngCd,BDMS_01_CALL_2_TMNG_CD_LEN);
       localBdms01Call2TmngCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Call2TmngCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Call2TmngCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Call2TmngCd() {	 
   		return (substring(getStringValue(),beginBdms01Call2TmngCd,beginBdms01Call2TmngCd + BDMS_01_CALL_2_TMNG_CD_LEN));
   	}
     int localBdms01ExchgPrimeCdCounter = -1;
     public boolean isBdms01ExchgPrimeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ExchgPrimeCdCounter != sharedCounter;
         localBdms01ExchgPrimeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EXCHG_PRIME_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01ExchgPrimeCd
	 */
   protected void serializeBdms01ExchgPrimeCd(char[] bdms01ExchgPrimeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ExchgPrimeCd,0,getStringValue(),beginBdms01ExchgPrimeCd,BDMS_01_EXCHG_PRIME_CD_LEN);
       localBdms01ExchgPrimeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ExchgPrimeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01ExchgPrimeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ExchgPrimeCd() {	 
   		return (substring(getStringValue(),beginBdms01ExchgPrimeCd,beginBdms01ExchgPrimeCd + BDMS_01_EXCHG_PRIME_CD_LEN));
   	}
     int localBdms01MrktTierCdCounter = -1;
     public boolean isBdms01MrktTierCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MrktTierCdCounter != sharedCounter;
         localBdms01MrktTierCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MRKT_TIER_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01MrktTierCd
	 */
   protected void serializeBdms01MrktTierCd(char[] bdms01MrktTierCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MrktTierCd,0,getStringValue(),beginBdms01MrktTierCd,BDMS_01_MRKT_TIER_CD_LEN);
       localBdms01MrktTierCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MrktTierCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01MrktTierCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MrktTierCd() {	 
   		return (substring(getStringValue(),beginBdms01MrktTierCd,beginBdms01MrktTierCd + BDMS_01_MRKT_TIER_CD_LEN));
   	}
     int localBdms01MrktIndCdCounter = -1;
     public boolean isBdms01MrktIndCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MrktIndCdCounter != sharedCounter;
         localBdms01MrktIndCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MRKT_IND_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01MrktIndCd
	 */
   protected void serializeBdms01MrktIndCd(char[] bdms01MrktIndCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MrktIndCd,0,getStringValue(),beginBdms01MrktIndCd,BDMS_01_MRKT_IND_CD_LEN);
       localBdms01MrktIndCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MrktIndCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01MrktIndCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MrktIndCd() {	 
   		return (substring(getStringValue(),beginBdms01MrktIndCd,beginBdms01MrktIndCd + BDMS_01_MRKT_IND_CD_LEN));
   	}
     int localBdms01NewTraceIndCounter = -1;
     public boolean isBdms01NewTraceIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01NewTraceIndCounter != sharedCounter;
         localBdms01NewTraceIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_NEW_TRACE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01NewTraceInd
	 */
   protected void serializeBdms01NewTraceInd(char[] bdms01NewTraceInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01NewTraceInd,0,getStringValue(),beginBdms01NewTraceInd,BDMS_01_NEW_TRACE_IND_LEN);
       localBdms01NewTraceIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01NewTraceIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01NewTraceInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01NewTraceInd() {	 
   		return (substring(getStringValue(),beginBdms01NewTraceInd,beginBdms01NewTraceInd + BDMS_01_NEW_TRACE_IND_LEN));
   	}
     int localBdms01QuickCdCounter = -1;
     public boolean isBdms01QuickCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01QuickCdCounter != sharedCounter;
         localBdms01QuickCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_QUICK_CD_LEN = 6;
	/**
	 * 	serialize this Bdms01QuickCd
	 */
   protected void serializeBdms01QuickCd(char[] bdms01QuickCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01QuickCd,0,getStringValue(),beginBdms01QuickCd,BDMS_01_QUICK_CD_LEN);
       localBdms01QuickCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01QuickCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBdms01QuickCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01QuickCd() {	 
   		return (substring(getStringValue(),beginBdms01QuickCd,beginBdms01QuickCd + BDMS_01_QUICK_CD_LEN));
   	}
     int localBdms01LseMrktCdCounter = -1;
     public boolean isBdms01LseMrktCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01LseMrktCdCounter != sharedCounter;
         localBdms01LseMrktCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_LSE_MRKT_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01LseMrktCd
	 */
   protected void serializeBdms01LseMrktCd(char[] bdms01LseMrktCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01LseMrktCd,0,getStringValue(),beginBdms01LseMrktCd,BDMS_01_LSE_MRKT_CD_LEN);
       localBdms01LseMrktCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01LseMrktCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01LseMrktCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01LseMrktCd() {	 
   		return (substring(getStringValue(),beginBdms01LseMrktCd,beginBdms01LseMrktCd + BDMS_01_LSE_MRKT_CD_LEN));
   	}
     int localBdms01IsinChngIndCounter = -1;
     public boolean isBdms01IsinChngIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IsinChngIndCounter != sharedCounter;
         localBdms01IsinChngIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ISIN_CHNG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01IsinChngInd
	 */
   protected void serializeBdms01IsinChngInd(char[] bdms01IsinChngInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IsinChngInd,0,getStringValue(),beginBdms01IsinChngInd,BDMS_01_ISIN_CHNG_IND_LEN);
       localBdms01IsinChngIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IsinChngIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01IsinChngInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IsinChngInd() {	 
   		return (substring(getStringValue(),beginBdms01IsinChngInd,beginBdms01IsinChngInd + BDMS_01_ISIN_CHNG_IND_LEN));
   	}
     int localBdms01StkIssueSttsCdCounter = -1;
     public boolean isBdms01StkIssueSttsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01StkIssueSttsCdCounter != sharedCounter;
         localBdms01StkIssueSttsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_STK_ISSUE_STTS_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01StkIssueSttsCd
	 */
   protected void serializeBdms01StkIssueSttsCd(char[] bdms01StkIssueSttsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01StkIssueSttsCd,0,getStringValue(),beginBdms01StkIssueSttsCd,BDMS_01_STK_ISSUE_STTS_CD_LEN);
       localBdms01StkIssueSttsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01StkIssueSttsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01StkIssueSttsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01StkIssueSttsCd() {	 
   		return (substring(getStringValue(),beginBdms01StkIssueSttsCd,beginBdms01StkIssueSttsCd + BDMS_01_STK_ISSUE_STTS_CD_LEN));
   	}
     int localBdms01IssrTypeCdCounter = -1;
     public boolean isBdms01IssrTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01IssrTypeCdCounter != sharedCounter;
         localBdms01IssrTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ISSR_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01IssrTypeCd
	 */
   protected void serializeBdms01IssrTypeCd(char[] bdms01IssrTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01IssrTypeCd,0,getStringValue(),beginBdms01IssrTypeCd,BDMS_01_ISSR_TYPE_CD_LEN);
       localBdms01IssrTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01IssrTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01IssrTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01IssrTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01IssrTypeCd,beginBdms01IssrTypeCd + BDMS_01_ISSR_TYPE_CD_LEN));
   	}
     int localBdms01TraceSymblTxtCounter = -1;
     public boolean isBdms01TraceSymblTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TraceSymblTxtCounter != sharedCounter;
         localBdms01TraceSymblTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TRACE_SYMBL_TXT_LEN = 14;
	/**
	 * 	serialize this Bdms01TraceSymblTxt
	 */
   protected void serializeBdms01TraceSymblTxt(char[] bdms01TraceSymblTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TraceSymblTxt,0,getStringValue(),beginBdms01TraceSymblTxt,BDMS_01_TRACE_SYMBL_TXT_LEN);
       localBdms01TraceSymblTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TraceSymblTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshBdms01TraceSymblTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TraceSymblTxt() {	 
   		return (substring(getStringValue(),beginBdms01TraceSymblTxt,beginBdms01TraceSymblTxt + BDMS_01_TRACE_SYMBL_TXT_LEN));
   	}
     int localBdms01RegsIndCounter = -1;
     public boolean isBdms01RegsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RegsIndCounter != sharedCounter;
         localBdms01RegsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_REGS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RegsInd
	 */
   protected void serializeBdms01RegsInd(char[] bdms01RegsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RegsInd,0,getStringValue(),beginBdms01RegsInd,BDMS_01_REGS_IND_LEN);
       localBdms01RegsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RegsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RegsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RegsInd() {	 
   		return (substring(getStringValue(),beginBdms01RegsInd,beginBdms01RegsInd + BDMS_01_REGS_IND_LEN));
   	}
     int localBdms01PpnCdCounter = -1;
     public boolean isBdms01PpnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PpnCdCounter != sharedCounter;
         localBdms01PpnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PPN_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01PpnCd
	 */
   protected void serializeBdms01PpnCd(char[] bdms01PpnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PpnCd,0,getStringValue(),beginBdms01PpnCd,BDMS_01_PPN_CD_LEN);
       localBdms01PpnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PpnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01PpnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PpnCd() {	 
   		return (substring(getStringValue(),beginBdms01PpnCd,beginBdms01PpnCd + BDMS_01_PPN_CD_LEN));
   	}
     int localBdms01PpnIndCounter = -1;
     public boolean isBdms01PpnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PpnIndCounter != sharedCounter;
         localBdms01PpnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PPN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PpnInd
	 */
   protected void serializeBdms01PpnInd(char[] bdms01PpnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PpnInd,0,getStringValue(),beginBdms01PpnInd,BDMS_01_PPN_IND_LEN);
       localBdms01PpnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PpnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PpnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PpnInd() {	 
   		return (substring(getStringValue(),beginBdms01PpnInd,beginBdms01PpnInd + BDMS_01_PPN_IND_LEN));
   	}
     int localBdms01DtcUnrtdMoodyCdCounter = -1;
     public boolean isBdms01DtcUnrtdMoodyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DtcUnrtdMoodyCdCounter != sharedCounter;
         localBdms01DtcUnrtdMoodyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DTC_UNRTD_MOODY_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01DtcUnrtdMoodyCd
	 */
   protected void serializeBdms01DtcUnrtdMoodyCd(char[] bdms01DtcUnrtdMoodyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DtcUnrtdMoodyCd,0,getStringValue(),beginBdms01DtcUnrtdMoodyCd,BDMS_01_DTC_UNRTD_MOODY_CD_LEN);
       localBdms01DtcUnrtdMoodyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DtcUnrtdMoodyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DtcUnrtdMoodyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DtcUnrtdMoodyCd() {	 
   		return (substring(getStringValue(),beginBdms01DtcUnrtdMoodyCd,beginBdms01DtcUnrtdMoodyCd + BDMS_01_DTC_UNRTD_MOODY_CD_LEN));
   	}
     int localBdms01DtcUnrtdSpCdCounter = -1;
     public boolean isBdms01DtcUnrtdSpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DtcUnrtdSpCdCounter != sharedCounter;
         localBdms01DtcUnrtdSpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DTC_UNRTD_SP_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01DtcUnrtdSpCd
	 */
   protected void serializeBdms01DtcUnrtdSpCd(char[] bdms01DtcUnrtdSpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DtcUnrtdSpCd,0,getStringValue(),beginBdms01DtcUnrtdSpCd,BDMS_01_DTC_UNRTD_SP_CD_LEN);
       localBdms01DtcUnrtdSpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DtcUnrtdSpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DtcUnrtdSpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DtcUnrtdSpCd() {	 
   		return (substring(getStringValue(),beginBdms01DtcUnrtdSpCd,beginBdms01DtcUnrtdSpCd + BDMS_01_DTC_UNRTD_SP_CD_LEN));
   	}
     int localBdms01TirsSecTypeCdCounter = -1;
     public boolean isBdms01TirsSecTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TirsSecTypeCdCounter != sharedCounter;
         localBdms01TirsSecTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TIRS_SEC_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01TirsSecTypeCd
	 */
   protected void serializeBdms01TirsSecTypeCd(char[] bdms01TirsSecTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TirsSecTypeCd,0,getStringValue(),beginBdms01TirsSecTypeCd,BDMS_01_TIRS_SEC_TYPE_CD_LEN);
       localBdms01TirsSecTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TirsSecTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01TirsSecTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TirsSecTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01TirsSecTypeCd,beginBdms01TirsSecTypeCd + BDMS_01_TIRS_SEC_TYPE_CD_LEN));
   	}
     int localBdms01SifmaSmgIndCounter = -1;
     public boolean isBdms01SifmaSmgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SifmaSmgIndCounter != sharedCounter;
         localBdms01SifmaSmgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SIFMA_SMG_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SifmaSmgInd
	 */
   protected void serializeBdms01SifmaSmgInd(char[] bdms01SifmaSmgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SifmaSmgInd,0,getStringValue(),beginBdms01SifmaSmgInd,BDMS_01_SIFMA_SMG_IND_LEN);
       localBdms01SifmaSmgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SifmaSmgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SifmaSmgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SifmaSmgInd() {	 
   		return (substring(getStringValue(),beginBdms01SifmaSmgInd,beginBdms01SifmaSmgInd + BDMS_01_SIFMA_SMG_IND_LEN));
   	}
     int localBdms01CalledAncmtCdCounter = -1;
     public boolean isBdms01CalledAncmtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CalledAncmtCdCounter != sharedCounter;
         localBdms01CalledAncmtCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CALLED_ANCMT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CalledAncmtCd
	 */
   protected void serializeBdms01CalledAncmtCd(char[] bdms01CalledAncmtCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CalledAncmtCd,0,getStringValue(),beginBdms01CalledAncmtCd,BDMS_01_CALLED_ANCMT_CD_LEN);
       localBdms01CalledAncmtCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CalledAncmtCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CalledAncmtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CalledAncmtCd() {	 
   		return (substring(getStringValue(),beginBdms01CalledAncmtCd,beginBdms01CalledAncmtCd + BDMS_01_CALLED_ANCMT_CD_LEN));
   	}
     int localBdms01PrtlRdmptSchdCdCounter = -1;
     public boolean isBdms01PrtlRdmptSchdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrtlRdmptSchdCdCounter != sharedCounter;
         localBdms01PrtlRdmptSchdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRTL_RDMPT_SCHD_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PrtlRdmptSchdCd
	 */
   protected void serializeBdms01PrtlRdmptSchdCd(char[] bdms01PrtlRdmptSchdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrtlRdmptSchdCd,0,getStringValue(),beginBdms01PrtlRdmptSchdCd,BDMS_01_PRTL_RDMPT_SCHD_CD_LEN);
       localBdms01PrtlRdmptSchdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrtlRdmptSchdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PrtlRdmptSchdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrtlRdmptSchdCd() {	 
   		return (substring(getStringValue(),beginBdms01PrtlRdmptSchdCd,beginBdms01PrtlRdmptSchdCd + BDMS_01_PRTL_RDMPT_SCHD_CD_LEN));
   	}
     int localBdms01FdrlTaxSttsCdCounter = -1;
     public boolean isBdms01FdrlTaxSttsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FdrlTaxSttsCdCounter != sharedCounter;
         localBdms01FdrlTaxSttsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FDRL_TAX_STTS_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01FdrlTaxSttsCd
	 */
   protected void serializeBdms01FdrlTaxSttsCd(char[] bdms01FdrlTaxSttsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FdrlTaxSttsCd,0,getStringValue(),beginBdms01FdrlTaxSttsCd,BDMS_01_FDRL_TAX_STTS_CD_LEN);
       localBdms01FdrlTaxSttsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FdrlTaxSttsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FdrlTaxSttsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FdrlTaxSttsCd() {	 
   		return (substring(getStringValue(),beginBdms01FdrlTaxSttsCd,beginBdms01FdrlTaxSttsCd + BDMS_01_FDRL_TAX_STTS_CD_LEN));
   	}
     int localBdms01CntngTaxCdCounter = -1;
     public boolean isBdms01CntngTaxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CntngTaxCdCounter != sharedCounter;
         localBdms01CntngTaxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CNTNG_TAX_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CntngTaxCd
	 */
   protected void serializeBdms01CntngTaxCd(char[] bdms01CntngTaxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CntngTaxCd,0,getStringValue(),beginBdms01CntngTaxCd,BDMS_01_CNTNG_TAX_CD_LEN);
       localBdms01CntngTaxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CntngTaxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CntngTaxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CntngTaxCd() {	 
   		return (substring(getStringValue(),beginBdms01CntngTaxCd,beginBdms01CntngTaxCd + BDMS_01_CNTNG_TAX_CD_LEN));
   	}
     int localBdms01CntngYldRtCounter = -1;
     
     public boolean isBdms01CntngYldRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CntngYldRtCounter != sharedCounter;
         localBdms01CntngYldRtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CntngYldRt
	 *	@return bdms01CntngYldRt
	 */
	public char[]  getBdms01CntngYldRtString() {
	    return getCharArray(beginBdms01CntngYldRt,BDMS_01_CNTNG_YLD_RT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CntngYldRtIsNumeric() {
		    return isNumeric(beginBdms01CntngYldRt
	                    ,beginBdms01CntngYldRt + BDMS_01_CNTNG_YLD_RT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CNTNG_YLD_RT_LEN = 15;
  protected  static final int BDMS_01_CNTNG_YLD_RT_SCALE = 8;

   protected BigDecimal checkBdms01CntngYldRtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CntngYldRt
	 */
	protected void serializeBdms01CntngYldRt(BigDecimal bdms01CntngYldRt) {
	       putNumber(beginBdms01CntngYldRt,bdms01CntngYldRt,BDMS_01_CNTNG_YLD_RT_LEN,BDMS_01_CNTNG_YLD_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CntngYldRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CntngYldRt
	 */
   	protected  BigDecimal serializeBdms01CntngYldRt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CntngYldRt
		       ,15
		      );		 localBdms01CntngYldRtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CNTNG_YLD_RT_LEN,BDMS_01_CNTNG_YLD_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CntngYldRt", beginBdms01CntngYldRt,BDMS_01_CNTNG_YLD_RT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CntngYldRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CntngYldRt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CntngYldRt
			            ,BDMS_01_CNTNG_YLD_RT_LEN
			            ,BDMS_01_CNTNG_YLD_RT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CntngYldRt", beginBdms01CntngYldRt,BDMS_01_CNTNG_YLD_RT_LEN);
    }
   	}
     int localBdms01SecTypeCdCounter = -1;
     public boolean isBdms01SecTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecTypeCdCounter != sharedCounter;
         localBdms01SecTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEC_TYPE_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01SecTypeCd
	 */
   protected void serializeBdms01SecTypeCd(char[] bdms01SecTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecTypeCd,0,getStringValue(),beginBdms01SecTypeCd,BDMS_01_SEC_TYPE_CD_LEN);
       localBdms01SecTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01SecTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01SecTypeCd,beginBdms01SecTypeCd + BDMS_01_SEC_TYPE_CD_LEN));
   	}
     int localBdms01CltrlIssCdCounter = -1;
     public boolean isBdms01CltrlIssCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CltrlIssCdCounter != sharedCounter;
         localBdms01CltrlIssCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CLTRL_ISS_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CltrlIssCd
	 */
   protected void serializeBdms01CltrlIssCd(char[] bdms01CltrlIssCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CltrlIssCd,0,getStringValue(),beginBdms01CltrlIssCd,BDMS_01_CLTRL_ISS_CD_LEN);
       localBdms01CltrlIssCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CltrlIssCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CltrlIssCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CltrlIssCd() {	 
   		return (substring(getStringValue(),beginBdms01CltrlIssCd,beginBdms01CltrlIssCd + BDMS_01_CLTRL_ISS_CD_LEN));
   	}
     int localBdms01RangeIndCounter = -1;
     public boolean isBdms01RangeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01RangeIndCounter != sharedCounter;
         localBdms01RangeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_RANGE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01RangeInd
	 */
   protected void serializeBdms01RangeInd(char[] bdms01RangeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01RangeInd,0,getStringValue(),beginBdms01RangeInd,BDMS_01_RANGE_IND_LEN);
       localBdms01RangeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01RangeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01RangeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01RangeInd() {	 
   		return (substring(getStringValue(),beginBdms01RangeInd,beginBdms01RangeInd + BDMS_01_RANGE_IND_LEN));
   	}
     int localBdms01B8CntngPymntCdCounter = -1;
     public boolean isBdms01B8CntngPymntCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01B8CntngPymntCdCounter != sharedCounter;
         localBdms01B8CntngPymntCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_B_8_CNTNG_PYMNT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01B8CntngPymntCd
	 */
   protected void serializeBdms01B8CntngPymntCd(char[] bdms01B8CntngPymntCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01B8CntngPymntCd,0,getStringValue(),beginBdms01B8CntngPymntCd,BDMS_01_B_8_CNTNG_PYMNT_CD_LEN);
       localBdms01B8CntngPymntCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01B8CntngPymntCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01B8CntngPymntCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01B8CntngPymntCd() {	 
   		return (substring(getStringValue(),beginBdms01B8CntngPymntCd,beginBdms01B8CntngPymntCd + BDMS_01_B_8_CNTNG_PYMNT_CD_LEN));
   	}
     int localBdms01CrntCpnTypeCdCounter = -1;
     public boolean isBdms01CrntCpnTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CrntCpnTypeCdCounter != sharedCounter;
         localBdms01CrntCpnTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CRNT_CPN_TYPE_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CrntCpnTypeCd
	 */
   protected void serializeBdms01CrntCpnTypeCd(char[] bdms01CrntCpnTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CrntCpnTypeCd,0,getStringValue(),beginBdms01CrntCpnTypeCd,BDMS_01_CRNT_CPN_TYPE_CD_LEN);
       localBdms01CrntCpnTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CrntCpnTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CrntCpnTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CrntCpnTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01CrntCpnTypeCd,beginBdms01CrntCpnTypeCd + BDMS_01_CRNT_CPN_TYPE_CD_LEN));
   	}
     int localBdms01Extelc1SecTypCdCounter = -1;
     public boolean isBdms01Extelc1SecTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Extelc1SecTypCdCounter != sharedCounter;
         localBdms01Extelc1SecTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EXTELC_1_SEC_TYP_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01Extelc1SecTypCd
	 */
   protected void serializeBdms01Extelc1SecTypCd(char[] bdms01Extelc1SecTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Extelc1SecTypCd,0,getStringValue(),beginBdms01Extelc1SecTypCd,BDMS_01_EXTELC_1_SEC_TYP_CD_LEN);
       localBdms01Extelc1SecTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Extelc1SecTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01Extelc1SecTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Extelc1SecTypCd() {	 
   		return (substring(getStringValue(),beginBdms01Extelc1SecTypCd,beginBdms01Extelc1SecTypCd + BDMS_01_EXTELC_1_SEC_TYP_CD_LEN));
   	}




}
  
