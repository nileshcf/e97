package com.cloudframe.app.init1.dto.serialize;

/**
*  The class SaveInfoAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SaveInfoAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SaveInfoAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAVE_INFO_AREA_LENGTH = 623;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHldIldclLnShrGrpNo;
            protected  int beginHldIldcrLnShrGrpNo;
            protected  int beginCpduOffrTypCd;
            protected  int beginUsgOffrTypCd;
            protected  int beginUsgBeginDtIso;
            protected  int beginLsgBlPerFromDtIso;
            protected  int beginLsgBlPerToDtIso;
            protected  int beginCustMtnStatCd;
            protected  int beginInvJitrEligDtIso;
            protected  int beginInvCycEffDtIso;
            protected  int beginInvPrevBlCycNo;
            protected  int beginDelayedCycNo;
            protected  int beginInvInvoiceNo;
            protected  int beginTooLateFlagSw;
            protected  int beginRl001DtlBlSegregateNo;
	
	/**
	* Constructor for SaveInfoAreaSerialized
	**/
    public SaveInfoAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SaveInfoAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAVE_INFO_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
             beginHldIldclLnShrGrpNo = getStartOffset() + 210;	// set offset for serialization
  
             beginHldIldcrLnShrGrpNo = getStartOffset() + 214;	// set offset for serialization
  
             beginCpduOffrTypCd = getStartOffset() + 218;	// set offset for serialization
  
  
  
  
  
             beginUsgOffrTypCd = getStartOffset() + 361;	// set offset for serialization
  
             beginUsgBeginDtIso = getStartOffset() + 363;	// set offset for serialization
  
             beginLsgBlPerFromDtIso = getStartOffset() + 371;	// set offset for serialization
  
             beginLsgBlPerToDtIso = getStartOffset() + 379;	// set offset for serialization
  
  
             beginCustMtnStatCd = getStartOffset() + 405;	// set offset for serialization
  
  
  
  
  
             beginInvJitrEligDtIso = getStartOffset() + 555;	// set offset for serialization
  
             beginInvCycEffDtIso = getStartOffset() + 563;	// set offset for serialization
  
             beginInvPrevBlCycNo = getStartOffset() + 571;	// set offset for serialization
  
             beginDelayedCycNo = getStartOffset() + 573;	// set offset for serialization
  
             beginInvInvoiceNo = getStartOffset() + 575;	// set offset for serialization
  
             beginTooLateFlagSw = getStartOffset() + 593;	// set offset for serialization
  
  
             beginRl001DtlBlSegregateNo = getStartOffset() + 609;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localHldIldclLnShrGrpNoCounter = -1;
         public boolean isHldIldclLnShrGrpNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHldIldclLnShrGrpNoCounter != sharedCounter;
            localHldIldclLnShrGrpNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int HLD_ILDCL_LN_SHR_GRP_NO_LEN = 4;
  	/**
	 * serializeHldIldclLnShrGrpNo
	 */
	protected void serializeHldIldclLnShrGrpNo(int hldIldclLnShrGrpNo) {
           replaceValue( //  save the value as string
                   getBinaryString( hldIldclLnShrGrpNo,HLD_ILDCL_LN_SHR_GRP_NO_LEN)
                  ,beginHldIldclLnShrGrpNo
                  ,HLD_ILDCL_LN_SHR_GRP_NO_LEN
                 );
            localHldIldclLnShrGrpNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkHldIldclLnShrGrpNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshHldIldclLnShrGrpNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHldIldclLnShrGrpNo() {	 
			return (getInt(beginHldIldclLnShrGrpNo));
   	}
         int localHldIldcrLnShrGrpNoCounter = -1;
         public boolean isHldIldcrLnShrGrpNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHldIldcrLnShrGrpNoCounter != sharedCounter;
            localHldIldcrLnShrGrpNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int HLD_ILDCR_LN_SHR_GRP_NO_LEN = 4;
  	/**
	 * serializeHldIldcrLnShrGrpNo
	 */
	protected void serializeHldIldcrLnShrGrpNo(int hldIldcrLnShrGrpNo) {
           replaceValue( //  save the value as string
                   getBinaryString( hldIldcrLnShrGrpNo,HLD_ILDCR_LN_SHR_GRP_NO_LEN)
                  ,beginHldIldcrLnShrGrpNo
                  ,HLD_ILDCR_LN_SHR_GRP_NO_LEN
                 );
            localHldIldcrLnShrGrpNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkHldIldcrLnShrGrpNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshHldIldcrLnShrGrpNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHldIldcrLnShrGrpNo() {	 
			return (getInt(beginHldIldcrLnShrGrpNo));
   	}
     int localCpduOffrTypCdCounter = -1;
     public boolean isCpduOffrTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduOffrTypCdCounter != sharedCounter;
         localCpduOffrTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_OFFR_TYP_CD_LEN = 2;
	/**
	 * 	serialize this CpduOffrTypCd
	 */
   protected void serializeCpduOffrTypCd(char[] cpduOffrTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduOffrTypCd,0,getStringValue(),beginCpduOffrTypCd,CPDU_OFFR_TYP_CD_LEN);
       localCpduOffrTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduOffrTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCpduOffrTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduOffrTypCd() {	 
   		return (substring(getStringValue(),beginCpduOffrTypCd,beginCpduOffrTypCd + CPDU_OFFR_TYP_CD_LEN));
   	}
     int localUsgOffrTypCdCounter = -1;
     public boolean isUsgOffrTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgOffrTypCdCounter != sharedCounter;
         localUsgOffrTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_OFFR_TYP_CD_LEN = 2;
	/**
	 * 	serialize this UsgOffrTypCd
	 */
   protected void serializeUsgOffrTypCd(char[] usgOffrTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgOffrTypCd,0,getStringValue(),beginUsgOffrTypCd,USG_OFFR_TYP_CD_LEN);
       localUsgOffrTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgOffrTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshUsgOffrTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgOffrTypCd() {	 
   		return (substring(getStringValue(),beginUsgOffrTypCd,beginUsgOffrTypCd + USG_OFFR_TYP_CD_LEN));
   	}
     int localUsgBeginDtIsoCounter = -1;
     public boolean isUsgBeginDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgBeginDtIsoCounter != sharedCounter;
         localUsgBeginDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of usgBeginDtIso
	 *	@return usgBeginDtIso
	 */
	public char[]  getUsgBeginDtIsoString() {
	     return getCharArray(beginUsgBeginDtIso,USG_BEGIN_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean usgBeginDtIsoIsNumeric() {
	    return isNumeric(beginUsgBeginDtIso
	                    ,beginUsgBeginDtIso + USG_BEGIN_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int USG_BEGIN_DT_ISO_LEN = 8;
  	/**
	 * serializeUsgBeginDtIso
	 */
	protected void serializeUsgBeginDtIso(long usgBeginDtIso) {
		 putNumber(beginUsgBeginDtIso,usgBeginDtIso,USG_BEGIN_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUsgBeginDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUsgBeginDtIso
	 */
   	protected  long serializeUsgBeginDtIso(char[] value) {
	    long  usgBeginDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    usgBeginDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginUsgBeginDtIso
		       ,8
		      );
		 localUsgBeginDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  usgBeginDtIso;
    }

   protected long checkUsgBeginDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUsgBeginDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshUsgBeginDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginUsgBeginDtIso
			                 ,USG_BEGIN_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("usgBeginDtIso", beginUsgBeginDtIso,USG_BEGIN_DT_ISO_LEN);
    }
   	}
     int localLsgBlPerFromDtIsoCounter = -1;
     public boolean isLsgBlPerFromDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsgBlPerFromDtIsoCounter != sharedCounter;
         localLsgBlPerFromDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsgBlPerFromDtIso
	 *	@return lsgBlPerFromDtIso
	 */
	public char[]  getLsgBlPerFromDtIsoString() {
	     return getCharArray(beginLsgBlPerFromDtIso,LSG_BL_PER_FROM_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsgBlPerFromDtIsoIsNumeric() {
	    return isNumeric(beginLsgBlPerFromDtIso
	                    ,beginLsgBlPerFromDtIso + LSG_BL_PER_FROM_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LSG_BL_PER_FROM_DT_ISO_LEN = 8;
  	/**
	 * serializeLsgBlPerFromDtIso
	 */
	protected void serializeLsgBlPerFromDtIso(long lsgBlPerFromDtIso) {
		 putNumber(beginLsgBlPerFromDtIso,lsgBlPerFromDtIso,LSG_BL_PER_FROM_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsgBlPerFromDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsgBlPerFromDtIso
	 */
   	protected  long serializeLsgBlPerFromDtIso(char[] value) {
	    long  lsgBlPerFromDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsgBlPerFromDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginLsgBlPerFromDtIso
		       ,8
		      );
		 localLsgBlPerFromDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsgBlPerFromDtIso;
    }

   protected long checkLsgBlPerFromDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsgBlPerFromDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsgBlPerFromDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsgBlPerFromDtIso
			                 ,LSG_BL_PER_FROM_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsgBlPerFromDtIso", beginLsgBlPerFromDtIso,LSG_BL_PER_FROM_DT_ISO_LEN);
    }
   	}
     int localLsgBlPerToDtIsoCounter = -1;
     public boolean isLsgBlPerToDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsgBlPerToDtIsoCounter != sharedCounter;
         localLsgBlPerToDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsgBlPerToDtIso
	 *	@return lsgBlPerToDtIso
	 */
	public char[]  getLsgBlPerToDtIsoString() {
	     return getCharArray(beginLsgBlPerToDtIso,LSG_BL_PER_TO_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsgBlPerToDtIsoIsNumeric() {
	    return isNumeric(beginLsgBlPerToDtIso
	                    ,beginLsgBlPerToDtIso + LSG_BL_PER_TO_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LSG_BL_PER_TO_DT_ISO_LEN = 8;
  	/**
	 * serializeLsgBlPerToDtIso
	 */
	protected void serializeLsgBlPerToDtIso(long lsgBlPerToDtIso) {
		 putNumber(beginLsgBlPerToDtIso,lsgBlPerToDtIso,LSG_BL_PER_TO_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsgBlPerToDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsgBlPerToDtIso
	 */
   	protected  long serializeLsgBlPerToDtIso(char[] value) {
	    long  lsgBlPerToDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsgBlPerToDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginLsgBlPerToDtIso
		       ,8
		      );
		 localLsgBlPerToDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsgBlPerToDtIso;
    }

   protected long checkLsgBlPerToDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsgBlPerToDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsgBlPerToDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsgBlPerToDtIso
			                 ,LSG_BL_PER_TO_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsgBlPerToDtIso", beginLsgBlPerToDtIso,LSG_BL_PER_TO_DT_ISO_LEN);
    }
   	}
     int localCustMtnStatCdCounter = -1;
     public boolean isCustMtnStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustMtnStatCdCounter != sharedCounter;
         localCustMtnStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUST_MTN_STAT_CD_LEN = 1;
	/**
	 * 	serialize this CustMtnStatCd
	 */
   protected void serializeCustMtnStatCd(char[] custMtnStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(custMtnStatCd,0,getStringValue(),beginCustMtnStatCd,CUST_MTN_STAT_CD_LEN);
       localCustMtnStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustMtnStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCustMtnStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustMtnStatCd() {	 
   		return (substring(getStringValue(),beginCustMtnStatCd,beginCustMtnStatCd + CUST_MTN_STAT_CD_LEN));
   	}
     int localInvJitrEligDtIsoCounter = -1;
     public boolean isInvJitrEligDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvJitrEligDtIsoCounter != sharedCounter;
         localInvJitrEligDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of invJitrEligDtIso
	 *	@return invJitrEligDtIso
	 */
	public char[]  getInvJitrEligDtIsoString() {
	     return getCharArray(beginInvJitrEligDtIso,INV_JITR_ELIG_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean invJitrEligDtIsoIsNumeric() {
	    return isNumeric(beginInvJitrEligDtIso
	                    ,beginInvJitrEligDtIso + INV_JITR_ELIG_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INV_JITR_ELIG_DT_ISO_LEN = 8;
  	/**
	 * serializeInvJitrEligDtIso
	 */
	protected void serializeInvJitrEligDtIso(long invJitrEligDtIso) {
		 putNumber(beginInvJitrEligDtIso,invJitrEligDtIso,INV_JITR_ELIG_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInvJitrEligDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInvJitrEligDtIso
	 */
   	protected  long serializeInvJitrEligDtIso(char[] value) {
	    long  invJitrEligDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    invJitrEligDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginInvJitrEligDtIso
		       ,8
		      );
		 localInvJitrEligDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  invJitrEligDtIso;
    }

   protected long checkInvJitrEligDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInvJitrEligDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInvJitrEligDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInvJitrEligDtIso
			                 ,INV_JITR_ELIG_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("invJitrEligDtIso", beginInvJitrEligDtIso,INV_JITR_ELIG_DT_ISO_LEN);
    }
   	}
     int localInvCycEffDtIsoCounter = -1;
     public boolean isInvCycEffDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvCycEffDtIsoCounter != sharedCounter;
         localInvCycEffDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of invCycEffDtIso
	 *	@return invCycEffDtIso
	 */
	public char[]  getInvCycEffDtIsoString() {
	     return getCharArray(beginInvCycEffDtIso,INV_CYC_EFF_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean invCycEffDtIsoIsNumeric() {
	    return isNumeric(beginInvCycEffDtIso
	                    ,beginInvCycEffDtIso + INV_CYC_EFF_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INV_CYC_EFF_DT_ISO_LEN = 8;
  	/**
	 * serializeInvCycEffDtIso
	 */
	protected void serializeInvCycEffDtIso(long invCycEffDtIso) {
		 putNumber(beginInvCycEffDtIso,invCycEffDtIso,INV_CYC_EFF_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInvCycEffDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInvCycEffDtIso
	 */
   	protected  long serializeInvCycEffDtIso(char[] value) {
	    long  invCycEffDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    invCycEffDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginInvCycEffDtIso
		       ,8
		      );
		 localInvCycEffDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  invCycEffDtIso;
    }

   protected long checkInvCycEffDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInvCycEffDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInvCycEffDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInvCycEffDtIso
			                 ,INV_CYC_EFF_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("invCycEffDtIso", beginInvCycEffDtIso,INV_CYC_EFF_DT_ISO_LEN);
    }
   	}
     int localInvPrevBlCycNoCounter = -1;
     public boolean isInvPrevBlCycNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvPrevBlCycNoCounter != sharedCounter;
         localInvPrevBlCycNoCounter = sharedCounter; return hasModified;
     }
	protected static final int INV_PREV_BL_CYC_NO_LEN = 2;
	/**
	 * 	serialize this InvPrevBlCycNo
	 */
   protected void serializeInvPrevBlCycNo(char[] invPrevBlCycNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(invPrevBlCycNo,0,getStringValue(),beginInvPrevBlCycNo,INV_PREV_BL_CYC_NO_LEN);
       localInvPrevBlCycNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInvPrevBlCycNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshInvPrevBlCycNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInvPrevBlCycNo() {	 
   		return (substring(getStringValue(),beginInvPrevBlCycNo,beginInvPrevBlCycNo + INV_PREV_BL_CYC_NO_LEN));
   	}
     int localDelayedCycNoCounter = -1;
     public boolean isDelayedCycNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelayedCycNoCounter != sharedCounter;
         localDelayedCycNoCounter = sharedCounter; return hasModified;
     }
	protected static final int DELAYED_CYC_NO_LEN = 2;
	/**
	 * 	serialize this DelayedCycNo
	 */
   protected void serializeDelayedCycNo(char[] delayedCycNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(delayedCycNo,0,getStringValue(),beginDelayedCycNo,DELAYED_CYC_NO_LEN);
       localDelayedCycNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDelayedCycNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDelayedCycNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDelayedCycNo() {	 
   		return (substring(getStringValue(),beginDelayedCycNo,beginDelayedCycNo + DELAYED_CYC_NO_LEN));
   	}
     int localInvInvoiceNoCounter = -1;
     public boolean isInvInvoiceNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvInvoiceNoCounter != sharedCounter;
         localInvInvoiceNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of invInvoiceNo
	 *	@return invInvoiceNo
	 */
	public char[]  getInvInvoiceNoString() {
	     return getCharArray(beginInvInvoiceNo,INV_INVOICE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean invInvoiceNoIsNumeric() {
	    return isNumeric(beginInvInvoiceNo
	                    ,beginInvInvoiceNo + INV_INVOICE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INV_INVOICE_NO_LEN = 18;
  	/**
	 * serializeInvInvoiceNo
	 */
	protected void serializeInvInvoiceNo(long invInvoiceNo) {
		 putNumber(beginInvInvoiceNo,invInvoiceNo,INV_INVOICE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInvInvoiceNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInvInvoiceNo
	 */
   	protected  long serializeInvInvoiceNo(char[] value) {
	    long  invInvoiceNo;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    invInvoiceNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginInvInvoiceNo
		       ,18
		      );
		 localInvInvoiceNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  invInvoiceNo;
    }

   protected long checkInvInvoiceNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInvInvoiceNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInvInvoiceNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInvInvoiceNo
			                 ,INV_INVOICE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("invInvoiceNo", beginInvInvoiceNo,INV_INVOICE_NO_LEN);
    }
   	}
     int localTooLateFlagSwCounter = -1;
     public boolean isTooLateFlagSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTooLateFlagSwCounter != sharedCounter;
         localTooLateFlagSwCounter = sharedCounter; return hasModified;
     }
	protected static final int TOO_LATE_FLAG_SW_LEN = 1;
	/**
	 * 	serialize this TooLateFlagSw
	 */
   protected void serializeTooLateFlagSw(char[] tooLateFlagSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tooLateFlagSw,0,getStringValue(),beginTooLateFlagSw,TOO_LATE_FLAG_SW_LEN);
       localTooLateFlagSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTooLateFlagSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTooLateFlagSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTooLateFlagSw() {	 
   		return (substring(getStringValue(),beginTooLateFlagSw,beginTooLateFlagSw + TOO_LATE_FLAG_SW_LEN));
   	}
     int localRl001DtlBlSegregateNoCounter = -1;
     public boolean isRl001DtlBlSegregateNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001DtlBlSegregateNoCounter != sharedCounter;
         localRl001DtlBlSegregateNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of rl001DtlBlSegregateNo
	 *	@return rl001DtlBlSegregateNo
	 */
	public char[]  getRl001DtlBlSegregateNoString() {
	     return getCharArray(beginRl001DtlBlSegregateNo,RL_001_DTL_BL_SEGREGATE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rl001DtlBlSegregateNoIsNumeric() {
	    return isNumeric(beginRl001DtlBlSegregateNo
	                    ,beginRl001DtlBlSegregateNo + RL_001_DTL_BL_SEGREGATE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RL_001_DTL_BL_SEGREGATE_NO_LEN = 2;
  	/**
	 * serializeRl001DtlBlSegregateNo
	 */
	protected void serializeRl001DtlBlSegregateNo(int rl001DtlBlSegregateNo) {
		 putNumber(beginRl001DtlBlSegregateNo,rl001DtlBlSegregateNo,RL_001_DTL_BL_SEGREGATE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRl001DtlBlSegregateNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRl001DtlBlSegregateNo
	 */
   	protected  int serializeRl001DtlBlSegregateNo(char[] value) {
	    int  rl001DtlBlSegregateNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    rl001DtlBlSegregateNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRl001DtlBlSegregateNo
		       ,2
		      );
		 localRl001DtlBlSegregateNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  rl001DtlBlSegregateNo;
    }

   protected int checkRl001DtlBlSegregateNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRl001DtlBlSegregateNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRl001DtlBlSegregateNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRl001DtlBlSegregateNo
			                 ,RL_001_DTL_BL_SEGREGATE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("rl001DtlBlSegregateNo", beginRl001DtlBlSegregateNo,RL_001_DTL_BL_SEGREGATE_NO_LEN);
    }
   	}




}
  
