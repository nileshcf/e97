package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01AdpMasterExpDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01AdpMasterExpDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01AdpMasterExpDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_ADP_MASTER_EXP_DATA_LENGTH = 213;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01EisNumber;
            protected  int beginBdms01EisCntry;
            protected  int beginBdms01SecLckdInd;
            protected  int beginBdms01FatcaCd;
            protected  int beginBdms01MtrlMdfdDt;
            protected  int beginBdms01FatcaOvrrdCd;
            protected  int beginBdms01FatcaCdCalcInd;
	
	/**
	* Constructor for Bdms01AdpMasterExpDataSerialized
	**/
    public Bdms01AdpMasterExpDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01AdpMasterExpDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01AdpMasterExpDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01AdpMasterExpDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4631); // serialize this field at offset 4631 by default 
    }
    
	/**
	* sets parent for this Bdms01AdpMasterExpDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4631 by default
    }    
	/**
	* initializes the field in Bdms01AdpMasterExpDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_ADP_MASTER_EXP_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01EisNumber = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01EisCntry = getStartOffset() + 10;	// set offset for serialization
  
             beginBdms01SecLckdInd = getStartOffset() + 12;	// set offset for serialization
  
             beginBdms01FatcaCd = getStartOffset() + 13;	// set offset for serialization
  
             beginBdms01MtrlMdfdDt = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01FatcaOvrrdCd = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01FatcaCdCalcInd = getStartOffset() + 25;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01EisNumberCounter = -1;
     public boolean isBdms01EisNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EisNumberCounter != sharedCounter;
         localBdms01EisNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01EisNumber
	 *	@return bdms01EisNumber
	 */
	public char[]  getBdms01EisNumberString() {
	     return getCharArray(beginBdms01EisNumber,BDMS_01_EIS_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01EisNumberIsNumeric() {
	    return isNumeric(beginBdms01EisNumber
	                    ,beginBdms01EisNumber + BDMS_01_EIS_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_EIS_NUMBER_LEN = 10;
  	/**
	 * serializeBdms01EisNumber
	 */
	protected void serializeBdms01EisNumber(long bdms01EisNumber) {
		 putNumber(beginBdms01EisNumber,bdms01EisNumber,BDMS_01_EIS_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01EisNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01EisNumber
	 */
   	protected  long serializeBdms01EisNumber(char[] value) {
	    long  bdms01EisNumber;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01EisNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginBdms01EisNumber
		       ,10
		      );
		 localBdms01EisNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01EisNumber;
    }

   protected long checkBdms01EisNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01EisNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBdms01EisNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBdms01EisNumber
			                 ,BDMS_01_EIS_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01EisNumber", beginBdms01EisNumber,BDMS_01_EIS_NUMBER_LEN);
    }
   	}
     int localBdms01EisCntryCounter = -1;
     public boolean isBdms01EisCntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EisCntryCounter != sharedCounter;
         localBdms01EisCntryCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EIS_CNTRY_LEN = 2;
	/**
	 * 	serialize this Bdms01EisCntry
	 */
   protected void serializeBdms01EisCntry(char[] bdms01EisCntry) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EisCntry,0,getStringValue(),beginBdms01EisCntry,BDMS_01_EIS_CNTRY_LEN);
       localBdms01EisCntryCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EisCntryConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01EisCntry is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EisCntry() {	 
   		return (substring(getStringValue(),beginBdms01EisCntry,beginBdms01EisCntry + BDMS_01_EIS_CNTRY_LEN));
   	}
     int localBdms01SecLckdIndCounter = -1;
     public boolean isBdms01SecLckdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecLckdIndCounter != sharedCounter;
         localBdms01SecLckdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEC_LCKD_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01SecLckdInd
	 */
   protected void serializeBdms01SecLckdInd(char[] bdms01SecLckdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecLckdInd,0,getStringValue(),beginBdms01SecLckdInd,BDMS_01_SEC_LCKD_IND_LEN);
       localBdms01SecLckdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecLckdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01SecLckdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecLckdInd() {	 
   		return (substring(getStringValue(),beginBdms01SecLckdInd,beginBdms01SecLckdInd + BDMS_01_SEC_LCKD_IND_LEN));
   	}
     int localBdms01FatcaCdCounter = -1;
     public boolean isBdms01FatcaCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FatcaCdCounter != sharedCounter;
         localBdms01FatcaCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FATCA_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01FatcaCd
	 */
   protected void serializeBdms01FatcaCd(char[] bdms01FatcaCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FatcaCd,0,getStringValue(),beginBdms01FatcaCd,BDMS_01_FATCA_CD_LEN);
       localBdms01FatcaCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FatcaCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FatcaCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FatcaCd() {	 
   		return (substring(getStringValue(),beginBdms01FatcaCd,beginBdms01FatcaCd + BDMS_01_FATCA_CD_LEN));
   	}
     int localBdms01MtrlMdfdDtCounter = -1;
     public boolean isBdms01MtrlMdfdDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MtrlMdfdDtCounter != sharedCounter;
         localBdms01MtrlMdfdDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_MTRL_MDFD_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01MtrlMdfdDt
	 */
   protected void serializeBdms01MtrlMdfdDt(char[] bdms01MtrlMdfdDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01MtrlMdfdDt,0,getStringValue(),beginBdms01MtrlMdfdDt,BDMS_01_MTRL_MDFD_DT_LEN);
       localBdms01MtrlMdfdDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01MtrlMdfdDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01MtrlMdfdDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01MtrlMdfdDt() {	 
   		return (substring(getStringValue(),beginBdms01MtrlMdfdDt,beginBdms01MtrlMdfdDt + BDMS_01_MTRL_MDFD_DT_LEN));
   	}
     int localBdms01FatcaOvrrdCdCounter = -1;
     public boolean isBdms01FatcaOvrrdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FatcaOvrrdCdCounter != sharedCounter;
         localBdms01FatcaOvrrdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FATCA_OVRRD_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01FatcaOvrrdCd
	 */
   protected void serializeBdms01FatcaOvrrdCd(char[] bdms01FatcaOvrrdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FatcaOvrrdCd,0,getStringValue(),beginBdms01FatcaOvrrdCd,BDMS_01_FATCA_OVRRD_CD_LEN);
       localBdms01FatcaOvrrdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FatcaOvrrdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FatcaOvrrdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FatcaOvrrdCd() {	 
   		return (substring(getStringValue(),beginBdms01FatcaOvrrdCd,beginBdms01FatcaOvrrdCd + BDMS_01_FATCA_OVRRD_CD_LEN));
   	}
     int localBdms01FatcaCdCalcIndCounter = -1;
     public boolean isBdms01FatcaCdCalcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FatcaCdCalcIndCounter != sharedCounter;
         localBdms01FatcaCdCalcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FATCA_CD_CALC_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01FatcaCdCalcInd
	 */
   protected void serializeBdms01FatcaCdCalcInd(char[] bdms01FatcaCdCalcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FatcaCdCalcInd,0,getStringValue(),beginBdms01FatcaCdCalcInd,BDMS_01_FATCA_CD_CALC_IND_LEN);
       localBdms01FatcaCdCalcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FatcaCdCalcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FatcaCdCalcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FatcaCdCalcInd() {	 
   		return (substring(getStringValue(),beginBdms01FatcaCdCalcInd,beginBdms01FatcaCdCalcInd + BDMS_01_FATCA_CD_CALC_IND_LEN));
   	}




}
  
