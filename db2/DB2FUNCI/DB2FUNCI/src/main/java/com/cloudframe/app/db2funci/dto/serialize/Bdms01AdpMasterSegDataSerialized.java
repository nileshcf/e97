package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01AdpMasterSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01AdpMasterSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01AdpMasterSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_ADP_MASTER_SEG_DATA_LENGTH = 206;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01AdpMasterSegSqlcd;
            protected  int beginMsdCountryCode;
            protected  int beginMsdCountryOfOrigin;
            protected  int beginMsdDontUseAddDt;
            protected  int beginMsdDontUseInd;
            protected  int beginMsdDnuReason;
            protected  int beginMsdReferToSec;
            protected  int beginMsdSourceCodeNewSetup;
            protected  int beginBdms01AddedTmstp;
            protected  int beginBdms01DoNotUseDt;
            protected  int beginBdms01TrmlCd;
            protected  int beginBdms01TranCd;
            protected  int beginBdms01SecurityIdaCd;
            protected  int beginBdms01TypeSecurityCd;
            protected  int beginBdms01CntryIssueCd;
            protected  int beginBdms01CntryOrgnCd;
            protected  int beginBdms01ClientNbr;
            protected  int beginBdms01McgillCd;
            protected  int beginBdms01CusipCntraNbr;
            protected  int beginMsdTradingSymbol;
            protected  int beginMsdClassInd;
	
	/**
	* Constructor for Bdms01AdpMasterSegDataSerialized
	**/
    public Bdms01AdpMasterSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01AdpMasterSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01AdpMasterSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01AdpMasterSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,116); // serialize this field at offset 116 by default 
    }
    
	/**
	* sets parent for this Bdms01AdpMasterSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 116 by default
    }    
	/**
	* initializes the field in Bdms01AdpMasterSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_ADP_MASTER_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01AdpMasterSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCountryCode = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdCountryOfOrigin = getStartOffset() + 6;	// set offset for serialization
  
  
  
             beginMsdDontUseAddDt = getStartOffset() + 46;	// set offset for serialization
  
             beginMsdDontUseInd = getStartOffset() + 54;	// set offset for serialization
  
             beginMsdDnuReason = getStartOffset() + 55;	// set offset for serialization
  
             beginMsdReferToSec = getStartOffset() + 85;	// set offset for serialization
  
             beginMsdSourceCodeNewSetup = getStartOffset() + 92;	// set offset for serialization
  
             beginBdms01AddedTmstp = getStartOffset() + 94;	// set offset for serialization
  
             beginBdms01DoNotUseDt = getStartOffset() + 120;	// set offset for serialization
  
             beginBdms01TrmlCd = getStartOffset() + 130;	// set offset for serialization
  
             beginBdms01TranCd = getStartOffset() + 138;	// set offset for serialization
  
             beginBdms01SecurityIdaCd = getStartOffset() + 146;	// set offset for serialization
  
             beginBdms01TypeSecurityCd = getStartOffset() + 150;	// set offset for serialization
  
             beginBdms01CntryIssueCd = getStartOffset() + 153;	// set offset for serialization
  
             beginBdms01CntryOrgnCd = getStartOffset() + 155;	// set offset for serialization
  
             beginBdms01ClientNbr = getStartOffset() + 157;	// set offset for serialization
  
             beginBdms01McgillCd = getStartOffset() + 161;	// set offset for serialization
  
             beginBdms01CusipCntraNbr = getStartOffset() + 166;	// set offset for serialization
  
             beginMsdTradingSymbol = getStartOffset() + 174;	// set offset for serialization
  
             beginMsdClassInd = getStartOffset() + 194;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01AdpMasterSegSqlcdCounter = -1;
     public boolean isBdms01AdpMasterSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AdpMasterSegSqlcdCounter != sharedCounter;
         localBdms01AdpMasterSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01AdpMasterSegSqlcd
	 *	@return bdms01AdpMasterSegSqlcd
	 */
	public char[]  getBdms01AdpMasterSegSqlcdString() {
	     return getCharArray(beginBdms01AdpMasterSegSqlcd,BDMS_01_ADP_MASTER_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01AdpMasterSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01AdpMasterSegSqlcd
	                    ,beginBdms01AdpMasterSegSqlcd + BDMS_01_ADP_MASTER_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_ADP_MASTER_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01AdpMasterSegSqlcd
	 */
	protected void serializeBdms01AdpMasterSegSqlcd(int bdms01AdpMasterSegSqlcd) {
		 putNumber(beginBdms01AdpMasterSegSqlcd,bdms01AdpMasterSegSqlcd,BDMS_01_ADP_MASTER_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01AdpMasterSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01AdpMasterSegSqlcd
	 */
   	protected  int serializeBdms01AdpMasterSegSqlcd(char[] value) {
	    int  bdms01AdpMasterSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01AdpMasterSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01AdpMasterSegSqlcd
		       ,4
		      );
		 localBdms01AdpMasterSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01AdpMasterSegSqlcd;
    }

   protected int checkBdms01AdpMasterSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01AdpMasterSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01AdpMasterSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01AdpMasterSegSqlcd
			                 ,BDMS_01_ADP_MASTER_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01AdpMasterSegSqlcd", beginBdms01AdpMasterSegSqlcd,BDMS_01_ADP_MASTER_SEG_SQLCD_LEN);
    }
   	}
     int localMsdCountryCodeCounter = -1;
     public boolean isMsdCountryCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCountryCodeCounter != sharedCounter;
         localMsdCountryCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_COUNTRY_CODE_LEN = 2;
	/**
	 * 	serialize this MsdCountryCode
	 */
   protected void serializeMsdCountryCode(char[] msdCountryCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCountryCode,0,getStringValue(),beginMsdCountryCode,MSD_COUNTRY_CODE_LEN);
       localMsdCountryCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCountryCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdCountryCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCountryCode() {	 
   		return (substring(getStringValue(),beginMsdCountryCode,beginMsdCountryCode + MSD_COUNTRY_CODE_LEN));
   	}
     int localMsdCountryOfOriginCounter = -1;
     public boolean isMsdCountryOfOriginModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCountryOfOriginCounter != sharedCounter;
         localMsdCountryOfOriginCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_COUNTRY_OF_ORIGIN_LEN = 2;
	/**
	 * 	serialize this MsdCountryOfOrigin
	 */
   protected void serializeMsdCountryOfOrigin(char[] msdCountryOfOrigin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCountryOfOrigin,0,getStringValue(),beginMsdCountryOfOrigin,MSD_COUNTRY_OF_ORIGIN_LEN);
       localMsdCountryOfOriginCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCountryOfOriginConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdCountryOfOrigin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCountryOfOrigin() {	 
   		return (substring(getStringValue(),beginMsdCountryOfOrigin,beginMsdCountryOfOrigin + MSD_COUNTRY_OF_ORIGIN_LEN));
   	}
     int localMsdDontUseAddDtCounter = -1;
     public boolean isMsdDontUseAddDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDontUseAddDtCounter != sharedCounter;
         localMsdDontUseAddDtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdDontUseAddDt
	 *	@return msdDontUseAddDt
	 */
	public char[]  getMsdDontUseAddDtString() {
	     return getCharArray(beginMsdDontUseAddDt,MSD_DONT_USE_ADD_DT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdDontUseAddDtIsNumeric() {
	    return isNumeric(beginMsdDontUseAddDt
	                    ,beginMsdDontUseAddDt + MSD_DONT_USE_ADD_DT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_DONT_USE_ADD_DT_LEN = 8;
  	/**
	 * serializeMsdDontUseAddDt
	 */
	protected void serializeMsdDontUseAddDt(long msdDontUseAddDt) {
		 putNumber(beginMsdDontUseAddDt,msdDontUseAddDt,MSD_DONT_USE_ADD_DT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdDontUseAddDtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdDontUseAddDt
	 */
   	protected  long serializeMsdDontUseAddDt(char[] value) {
	    long  msdDontUseAddDt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdDontUseAddDt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdDontUseAddDt
		       ,8
		      );
		 localMsdDontUseAddDtCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdDontUseAddDt;
    }

   protected long checkMsdDontUseAddDtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdDontUseAddDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdDontUseAddDt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdDontUseAddDt
			                 ,MSD_DONT_USE_ADD_DT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdDontUseAddDt", beginMsdDontUseAddDt,MSD_DONT_USE_ADD_DT_LEN);
    }
   	}
     int localMsdDontUseIndCounter = -1;
     public boolean isMsdDontUseIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDontUseIndCounter != sharedCounter;
         localMsdDontUseIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DONT_USE_IND_LEN = 1;
	/**
	 * 	serialize this MsdDontUseInd
	 */
   protected void serializeMsdDontUseInd(char[] msdDontUseInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDontUseInd,0,getStringValue(),beginMsdDontUseInd,MSD_DONT_USE_IND_LEN);
       localMsdDontUseIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDontUseIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdDontUseInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDontUseInd() {	 
   		return (substring(getStringValue(),beginMsdDontUseInd,beginMsdDontUseInd + MSD_DONT_USE_IND_LEN));
   	}
     int localMsdDnuReasonCounter = -1;
     public boolean isMsdDnuReasonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdDnuReasonCounter != sharedCounter;
         localMsdDnuReasonCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_DNU_REASON_LEN = 30;
	/**
	 * 	serialize this MsdDnuReason
	 */
   protected void serializeMsdDnuReason(char[] msdDnuReason) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdDnuReason,0,getStringValue(),beginMsdDnuReason,MSD_DNU_REASON_LEN);
       localMsdDnuReasonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdDnuReasonConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshMsdDnuReason is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdDnuReason() {	 
   		return (substring(getStringValue(),beginMsdDnuReason,beginMsdDnuReason + MSD_DNU_REASON_LEN));
   	}
     int localMsdReferToSecCounter = -1;
     public boolean isMsdReferToSecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdReferToSecCounter != sharedCounter;
         localMsdReferToSecCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_REFER_TO_SEC_LEN = 7;
	/**
	 * 	serialize this MsdReferToSec
	 */
   protected void serializeMsdReferToSec(char[] msdReferToSec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdReferToSec,0,getStringValue(),beginMsdReferToSec,MSD_REFER_TO_SEC_LEN);
       localMsdReferToSecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdReferToSecConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMsdReferToSec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdReferToSec() {	 
   		return (substring(getStringValue(),beginMsdReferToSec,beginMsdReferToSec + MSD_REFER_TO_SEC_LEN));
   	}
     int localMsdSourceCodeNewSetupCounter = -1;
     public boolean isMsdSourceCodeNewSetupModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSourceCodeNewSetupCounter != sharedCounter;
         localMsdSourceCodeNewSetupCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SOURCE_CODE_NEW_SETUP_LEN = 2;
	/**
	 * 	serialize this MsdSourceCodeNewSetup
	 */
   protected void serializeMsdSourceCodeNewSetup(char[] msdSourceCodeNewSetup) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSourceCodeNewSetup,0,getStringValue(),beginMsdSourceCodeNewSetup,MSD_SOURCE_CODE_NEW_SETUP_LEN);
       localMsdSourceCodeNewSetupCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSourceCodeNewSetupConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdSourceCodeNewSetup is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSourceCodeNewSetup() {	 
   		return (substring(getStringValue(),beginMsdSourceCodeNewSetup,beginMsdSourceCodeNewSetup + MSD_SOURCE_CODE_NEW_SETUP_LEN));
   	}
     int localBdms01AddedTmstpCounter = -1;
     public boolean isBdms01AddedTmstpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AddedTmstpCounter != sharedCounter;
         localBdms01AddedTmstpCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ADDED_TMSTP_LEN = 26;
	/**
	 * 	serialize this Bdms01AddedTmstp
	 */
   protected void serializeBdms01AddedTmstp(char[] bdms01AddedTmstp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01AddedTmstp,0,getStringValue(),beginBdms01AddedTmstp,BDMS_01_ADDED_TMSTP_LEN);
       localBdms01AddedTmstpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01AddedTmstpConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshBdms01AddedTmstp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01AddedTmstp() {	 
   		return (substring(getStringValue(),beginBdms01AddedTmstp,beginBdms01AddedTmstp + BDMS_01_ADDED_TMSTP_LEN));
   	}
     int localBdms01DoNotUseDtCounter = -1;
     public boolean isBdms01DoNotUseDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DoNotUseDtCounter != sharedCounter;
         localBdms01DoNotUseDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DO_NOT_USE_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01DoNotUseDt
	 */
   protected void serializeBdms01DoNotUseDt(char[] bdms01DoNotUseDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DoNotUseDt,0,getStringValue(),beginBdms01DoNotUseDt,BDMS_01_DO_NOT_USE_DT_LEN);
       localBdms01DoNotUseDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DoNotUseDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01DoNotUseDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DoNotUseDt() {	 
   		return (substring(getStringValue(),beginBdms01DoNotUseDt,beginBdms01DoNotUseDt + BDMS_01_DO_NOT_USE_DT_LEN));
   	}
     int localBdms01TrmlCdCounter = -1;
     public boolean isBdms01TrmlCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TrmlCdCounter != sharedCounter;
         localBdms01TrmlCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TRML_CD_LEN = 8;
	/**
	 * 	serialize this Bdms01TrmlCd
	 */
   protected void serializeBdms01TrmlCd(char[] bdms01TrmlCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TrmlCd,0,getStringValue(),beginBdms01TrmlCd,BDMS_01_TRML_CD_LEN);
       localBdms01TrmlCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TrmlCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01TrmlCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TrmlCd() {	 
   		return (substring(getStringValue(),beginBdms01TrmlCd,beginBdms01TrmlCd + BDMS_01_TRML_CD_LEN));
   	}
     int localBdms01TranCdCounter = -1;
     public boolean isBdms01TranCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TranCdCounter != sharedCounter;
         localBdms01TranCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TRAN_CD_LEN = 8;
	/**
	 * 	serialize this Bdms01TranCd
	 */
   protected void serializeBdms01TranCd(char[] bdms01TranCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TranCd,0,getStringValue(),beginBdms01TranCd,BDMS_01_TRAN_CD_LEN);
       localBdms01TranCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TranCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01TranCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TranCd() {	 
   		return (substring(getStringValue(),beginBdms01TranCd,beginBdms01TranCd + BDMS_01_TRAN_CD_LEN));
   	}
     int localBdms01SecurityIdaCdCounter = -1;
     public boolean isBdms01SecurityIdaCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecurityIdaCdCounter != sharedCounter;
         localBdms01SecurityIdaCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SECURITY_IDA_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01SecurityIdaCd
	 */
   protected void serializeBdms01SecurityIdaCd(char[] bdms01SecurityIdaCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecurityIdaCd,0,getStringValue(),beginBdms01SecurityIdaCd,BDMS_01_SECURITY_IDA_CD_LEN);
       localBdms01SecurityIdaCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecurityIdaCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01SecurityIdaCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecurityIdaCd() {	 
   		return (substring(getStringValue(),beginBdms01SecurityIdaCd,beginBdms01SecurityIdaCd + BDMS_01_SECURITY_IDA_CD_LEN));
   	}
     int localBdms01TypeSecurityCdCounter = -1;
     public boolean isBdms01TypeSecurityCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeSecurityCdCounter != sharedCounter;
         localBdms01TypeSecurityCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_SECURITY_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01TypeSecurityCd
	 */
   protected void serializeBdms01TypeSecurityCd(char[] bdms01TypeSecurityCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeSecurityCd,0,getStringValue(),beginBdms01TypeSecurityCd,BDMS_01_TYPE_SECURITY_CD_LEN);
       localBdms01TypeSecurityCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeSecurityCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01TypeSecurityCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeSecurityCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeSecurityCd,beginBdms01TypeSecurityCd + BDMS_01_TYPE_SECURITY_CD_LEN));
   	}
     int localBdms01CntryIssueCdCounter = -1;
     public boolean isBdms01CntryIssueCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CntryIssueCdCounter != sharedCounter;
         localBdms01CntryIssueCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CNTRY_ISSUE_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CntryIssueCd
	 */
   protected void serializeBdms01CntryIssueCd(char[] bdms01CntryIssueCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CntryIssueCd,0,getStringValue(),beginBdms01CntryIssueCd,BDMS_01_CNTRY_ISSUE_CD_LEN);
       localBdms01CntryIssueCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CntryIssueCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CntryIssueCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CntryIssueCd() {	 
   		return (substring(getStringValue(),beginBdms01CntryIssueCd,beginBdms01CntryIssueCd + BDMS_01_CNTRY_ISSUE_CD_LEN));
   	}
     int localBdms01CntryOrgnCdCounter = -1;
     public boolean isBdms01CntryOrgnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CntryOrgnCdCounter != sharedCounter;
         localBdms01CntryOrgnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CNTRY_ORGN_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CntryOrgnCd
	 */
   protected void serializeBdms01CntryOrgnCd(char[] bdms01CntryOrgnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CntryOrgnCd,0,getStringValue(),beginBdms01CntryOrgnCd,BDMS_01_CNTRY_ORGN_CD_LEN);
       localBdms01CntryOrgnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CntryOrgnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CntryOrgnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CntryOrgnCd() {	 
   		return (substring(getStringValue(),beginBdms01CntryOrgnCd,beginBdms01CntryOrgnCd + BDMS_01_CNTRY_ORGN_CD_LEN));
   	}
     int localBdms01ClientNbrCounter = -1;
     public boolean isBdms01ClientNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ClientNbrCounter != sharedCounter;
         localBdms01ClientNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CLIENT_NBR_LEN = 4;
	/**
	 * 	serialize this Bdms01ClientNbr
	 */
   protected void serializeBdms01ClientNbr(char[] bdms01ClientNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01ClientNbr,0,getStringValue(),beginBdms01ClientNbr,BDMS_01_CLIENT_NBR_LEN);
       localBdms01ClientNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01ClientNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01ClientNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01ClientNbr() {	 
   		return (substring(getStringValue(),beginBdms01ClientNbr,beginBdms01ClientNbr + BDMS_01_CLIENT_NBR_LEN));
   	}
     int localBdms01McgillCdCounter = -1;
     public boolean isBdms01McgillCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01McgillCdCounter != sharedCounter;
         localBdms01McgillCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01McgillCd
	 *	@return bdms01McgillCd
	 */
	public char[]  getBdms01McgillCdString() {
	     return getCharArray(beginBdms01McgillCd,BDMS_01_MCGILL_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01McgillCdIsNumeric() {
	    return isNumeric(beginBdms01McgillCd
	                    ,beginBdms01McgillCd + BDMS_01_MCGILL_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_MCGILL_CD_LEN = 5;
  	/**
	 * serializeBdms01McgillCd
	 */
	protected void serializeBdms01McgillCd(long bdms01McgillCd) {
		 putNumber(beginBdms01McgillCd,bdms01McgillCd,BDMS_01_MCGILL_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01McgillCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01McgillCd
	 */
   	protected  long serializeBdms01McgillCd(char[] value) {
	    long  bdms01McgillCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01McgillCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginBdms01McgillCd
		       ,5
		      );
		 localBdms01McgillCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01McgillCd;
    }

   protected long checkBdms01McgillCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01McgillCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBdms01McgillCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBdms01McgillCd
			                 ,BDMS_01_MCGILL_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01McgillCd", beginBdms01McgillCd,BDMS_01_MCGILL_CD_LEN);
    }
   	}
     int localBdms01CusipCntraNbrCounter = -1;
     public boolean isBdms01CusipCntraNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CusipCntraNbrCounter != sharedCounter;
         localBdms01CusipCntraNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CUSIP_CNTRA_NBR_LEN = 8;
	/**
	 * 	serialize this Bdms01CusipCntraNbr
	 */
   protected void serializeBdms01CusipCntraNbr(char[] bdms01CusipCntraNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CusipCntraNbr,0,getStringValue(),beginBdms01CusipCntraNbr,BDMS_01_CUSIP_CNTRA_NBR_LEN);
       localBdms01CusipCntraNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CusipCntraNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01CusipCntraNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CusipCntraNbr() {	 
   		return (substring(getStringValue(),beginBdms01CusipCntraNbr,beginBdms01CusipCntraNbr + BDMS_01_CUSIP_CNTRA_NBR_LEN));
   	}
     int localMsdTradingSymbolCounter = -1;
     public boolean isMsdTradingSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdTradingSymbolCounter != sharedCounter;
         localMsdTradingSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_TRADING_SYMBOL_LEN = 20;
	/**
	 * 	serialize this MsdTradingSymbol
	 */
   protected void serializeMsdTradingSymbol(char[] msdTradingSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdTradingSymbol,0,getStringValue(),beginMsdTradingSymbol,MSD_TRADING_SYMBOL_LEN);
       localMsdTradingSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdTradingSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshMsdTradingSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdTradingSymbol() {	 
   		return (substring(getStringValue(),beginMsdTradingSymbol,beginMsdTradingSymbol + MSD_TRADING_SYMBOL_LEN));
   	}
     int localMsdClassIndCounter = -1;
     public boolean isMsdClassIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdClassIndCounter != sharedCounter;
         localMsdClassIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CLASS_IND_LEN = 1;
	/**
	 * 	serialize this MsdClassInd
	 */
   protected void serializeMsdClassInd(char[] msdClassInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdClassInd,0,getStringValue(),beginMsdClassInd,MSD_CLASS_IND_LEN);
       localMsdClassIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdClassIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdClassInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdClassInd() {	 
   		return (substring(getStringValue(),beginMsdClassInd,beginMsdClassInd + MSD_CLASS_IND_LEN));
   	}




}
  
