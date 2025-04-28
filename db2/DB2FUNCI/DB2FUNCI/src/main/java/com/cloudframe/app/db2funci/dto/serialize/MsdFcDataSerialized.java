package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdFcDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdFcDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdFcDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_FC_DATA_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01Fc2DataInd;
            protected  int beginBdms01Fc2DepositoryCd;
            protected  int beginBdms01Fc2TrnfrDptryInd;
            protected  int beginBdms01Fc2PortalInd;
            protected  int beginBdms01Fc2ChllIntrDpstInd;
            protected  int beginBdms01Fc2DtcIssTypeCd;
            protected  int beginBdms01Fc2IpoInd;
            protected  int beginBdms01Fc2CloseIpoDt;
            protected  int beginBdms01Fc2DrctRgstnInd;
            protected  int beginBdms01DtcCstdnOnlyInd;
            protected  int beginBdms01BkDrsCd;
            protected  int beginBdms01PprlsLglInd;
	
	/**
	* Constructor for MsdFcDataSerialized
	**/
    public MsdFcDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdFcDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdFcDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdFcDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1351); // serialize this field at offset 1351 by default 
    }
    
	/**
	* sets parent for this MsdFcDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1351 by default
    }    
	/**
	* initializes the field in MsdFcDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_FC_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01Fc2DataInd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginBdms01Fc2DepositoryCd = getStartOffset() + 8;	// set offset for serialization
  
             beginBdms01Fc2TrnfrDptryInd = getStartOffset() + 12;	// set offset for serialization
  
             beginBdms01Fc2PortalInd = getStartOffset() + 13;	// set offset for serialization
  
             beginBdms01Fc2ChllIntrDpstInd = getStartOffset() + 14;	// set offset for serialization
  
             beginBdms01Fc2DtcIssTypeCd = getStartOffset() + 15;	// set offset for serialization
  
             beginBdms01Fc2IpoInd = getStartOffset() + 18;	// set offset for serialization
  
             beginBdms01Fc2CloseIpoDt = getStartOffset() + 19;	// set offset for serialization
  
             beginBdms01Fc2DrctRgstnInd = getStartOffset() + 29;	// set offset for serialization
  
             beginBdms01DtcCstdnOnlyInd = getStartOffset() + 30;	// set offset for serialization
  
             beginBdms01BkDrsCd = getStartOffset() + 31;	// set offset for serialization
  
             beginBdms01PprlsLglInd = getStartOffset() + 32;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01Fc2DataIndCounter = -1;
     public boolean isBdms01Fc2DataIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2DataIndCounter != sharedCounter;
         localBdms01Fc2DataIndCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01Fc2DataInd
	 *	@return bdms01Fc2DataInd
	 */
	public char[]  getBdms01Fc2DataIndString() {
	     return getCharArray(beginBdms01Fc2DataInd,BDMS_01_FC_2_DATA_IND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01Fc2DataIndIsNumeric() {
	    return isNumeric(beginBdms01Fc2DataInd
	                    ,beginBdms01Fc2DataInd + BDMS_01_FC_2_DATA_IND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_FC_2_DATA_IND_LEN = 8;
  	/**
	 * serializeBdms01Fc2DataInd
	 */
	protected void serializeBdms01Fc2DataInd(long bdms01Fc2DataInd) {
		 putNumber(beginBdms01Fc2DataInd,bdms01Fc2DataInd,BDMS_01_FC_2_DATA_IND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01Fc2DataIndCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01Fc2DataInd
	 */
   	protected  long serializeBdms01Fc2DataInd(char[] value) {
	    long  bdms01Fc2DataInd;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01Fc2DataInd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBdms01Fc2DataInd
		       ,8
		      );
		 localBdms01Fc2DataIndCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01Fc2DataInd;
    }

   protected long checkBdms01Fc2DataIndMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01Fc2DataInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBdms01Fc2DataInd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBdms01Fc2DataInd
			                 ,BDMS_01_FC_2_DATA_IND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01Fc2DataInd", beginBdms01Fc2DataInd,BDMS_01_FC_2_DATA_IND_LEN);
    }
   	}
     int localBdms01Fc2DepositoryCdCounter = -1;
     public boolean isBdms01Fc2DepositoryCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2DepositoryCdCounter != sharedCounter;
         localBdms01Fc2DepositoryCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_DEPOSITORY_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01Fc2DepositoryCd
	 */
   protected void serializeBdms01Fc2DepositoryCd(char[] bdms01Fc2DepositoryCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2DepositoryCd,0,getStringValue(),beginBdms01Fc2DepositoryCd,BDMS_01_FC_2_DEPOSITORY_CD_LEN);
       localBdms01Fc2DepositoryCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2DepositoryCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2DepositoryCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2DepositoryCd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2DepositoryCd,beginBdms01Fc2DepositoryCd + BDMS_01_FC_2_DEPOSITORY_CD_LEN));
   	}
     int localBdms01Fc2TrnfrDptryIndCounter = -1;
     public boolean isBdms01Fc2TrnfrDptryIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2TrnfrDptryIndCounter != sharedCounter;
         localBdms01Fc2TrnfrDptryIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_TRNFR_DPTRY_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2TrnfrDptryInd
	 */
   protected void serializeBdms01Fc2TrnfrDptryInd(char[] bdms01Fc2TrnfrDptryInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2TrnfrDptryInd,0,getStringValue(),beginBdms01Fc2TrnfrDptryInd,BDMS_01_FC_2_TRNFR_DPTRY_IND_LEN);
       localBdms01Fc2TrnfrDptryIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2TrnfrDptryIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2TrnfrDptryInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2TrnfrDptryInd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2TrnfrDptryInd,beginBdms01Fc2TrnfrDptryInd + BDMS_01_FC_2_TRNFR_DPTRY_IND_LEN));
   	}
     int localBdms01Fc2PortalIndCounter = -1;
     public boolean isBdms01Fc2PortalIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2PortalIndCounter != sharedCounter;
         localBdms01Fc2PortalIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_PORTAL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2PortalInd
	 */
   protected void serializeBdms01Fc2PortalInd(char[] bdms01Fc2PortalInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2PortalInd,0,getStringValue(),beginBdms01Fc2PortalInd,BDMS_01_FC_2_PORTAL_IND_LEN);
       localBdms01Fc2PortalIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2PortalIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2PortalInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2PortalInd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2PortalInd,beginBdms01Fc2PortalInd + BDMS_01_FC_2_PORTAL_IND_LEN));
   	}
     int localBdms01Fc2ChllIntrDpstIndCounter = -1;
     public boolean isBdms01Fc2ChllIntrDpstIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2ChllIntrDpstIndCounter != sharedCounter;
         localBdms01Fc2ChllIntrDpstIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_CHLL_INTR_DPST_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2ChllIntrDpstInd
	 */
   protected void serializeBdms01Fc2ChllIntrDpstInd(char[] bdms01Fc2ChllIntrDpstInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2ChllIntrDpstInd,0,getStringValue(),beginBdms01Fc2ChllIntrDpstInd,BDMS_01_FC_2_CHLL_INTR_DPST_IND_LEN);
       localBdms01Fc2ChllIntrDpstIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2ChllIntrDpstIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2ChllIntrDpstInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2ChllIntrDpstInd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2ChllIntrDpstInd,beginBdms01Fc2ChllIntrDpstInd + BDMS_01_FC_2_CHLL_INTR_DPST_IND_LEN));
   	}
     int localBdms01Fc2DtcIssTypeCdCounter = -1;
     public boolean isBdms01Fc2DtcIssTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2DtcIssTypeCdCounter != sharedCounter;
         localBdms01Fc2DtcIssTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_DTC_ISS_TYPE_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01Fc2DtcIssTypeCd
	 */
   protected void serializeBdms01Fc2DtcIssTypeCd(char[] bdms01Fc2DtcIssTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2DtcIssTypeCd,0,getStringValue(),beginBdms01Fc2DtcIssTypeCd,BDMS_01_FC_2_DTC_ISS_TYPE_CD_LEN);
       localBdms01Fc2DtcIssTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2DtcIssTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2DtcIssTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2DtcIssTypeCd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2DtcIssTypeCd,beginBdms01Fc2DtcIssTypeCd + BDMS_01_FC_2_DTC_ISS_TYPE_CD_LEN));
   	}
     int localBdms01Fc2IpoIndCounter = -1;
     public boolean isBdms01Fc2IpoIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2IpoIndCounter != sharedCounter;
         localBdms01Fc2IpoIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IPO_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2IpoInd
	 */
   protected void serializeBdms01Fc2IpoInd(char[] bdms01Fc2IpoInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2IpoInd,0,getStringValue(),beginBdms01Fc2IpoInd,BDMS_01_FC_2_IPO_IND_LEN);
       localBdms01Fc2IpoIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2IpoIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2IpoInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2IpoInd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2IpoInd,beginBdms01Fc2IpoInd + BDMS_01_FC_2_IPO_IND_LEN));
   	}
     int localBdms01Fc2CloseIpoDtCounter = -1;
     public boolean isBdms01Fc2CloseIpoDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2CloseIpoDtCounter != sharedCounter;
         localBdms01Fc2CloseIpoDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_CLOSE_IPO_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01Fc2CloseIpoDt
	 */
   protected void serializeBdms01Fc2CloseIpoDt(char[] bdms01Fc2CloseIpoDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2CloseIpoDt,0,getStringValue(),beginBdms01Fc2CloseIpoDt,BDMS_01_FC_2_CLOSE_IPO_DT_LEN);
       localBdms01Fc2CloseIpoDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2CloseIpoDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2CloseIpoDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2CloseIpoDt() {	 
   		return (substring(getStringValue(),beginBdms01Fc2CloseIpoDt,beginBdms01Fc2CloseIpoDt + BDMS_01_FC_2_CLOSE_IPO_DT_LEN));
   	}
     int localBdms01Fc2DrctRgstnIndCounter = -1;
     public boolean isBdms01Fc2DrctRgstnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2DrctRgstnIndCounter != sharedCounter;
         localBdms01Fc2DrctRgstnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_DRCT_RGSTN_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2DrctRgstnInd
	 */
   protected void serializeBdms01Fc2DrctRgstnInd(char[] bdms01Fc2DrctRgstnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2DrctRgstnInd,0,getStringValue(),beginBdms01Fc2DrctRgstnInd,BDMS_01_FC_2_DRCT_RGSTN_IND_LEN);
       localBdms01Fc2DrctRgstnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2DrctRgstnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2DrctRgstnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2DrctRgstnInd() {	 
   		return (substring(getStringValue(),beginBdms01Fc2DrctRgstnInd,beginBdms01Fc2DrctRgstnInd + BDMS_01_FC_2_DRCT_RGSTN_IND_LEN));
   	}
     int localBdms01DtcCstdnOnlyIndCounter = -1;
     public boolean isBdms01DtcCstdnOnlyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DtcCstdnOnlyIndCounter != sharedCounter;
         localBdms01DtcCstdnOnlyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DTC_CSTDN_ONLY_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01DtcCstdnOnlyInd
	 */
   protected void serializeBdms01DtcCstdnOnlyInd(char[] bdms01DtcCstdnOnlyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DtcCstdnOnlyInd,0,getStringValue(),beginBdms01DtcCstdnOnlyInd,BDMS_01_DTC_CSTDN_ONLY_IND_LEN);
       localBdms01DtcCstdnOnlyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DtcCstdnOnlyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DtcCstdnOnlyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DtcCstdnOnlyInd() {	 
   		return (substring(getStringValue(),beginBdms01DtcCstdnOnlyInd,beginBdms01DtcCstdnOnlyInd + BDMS_01_DTC_CSTDN_ONLY_IND_LEN));
   	}
     int localBdms01BkDrsCdCounter = -1;
     public boolean isBdms01BkDrsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BkDrsCdCounter != sharedCounter;
         localBdms01BkDrsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BK_DRS_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01BkDrsCd
	 */
   protected void serializeBdms01BkDrsCd(char[] bdms01BkDrsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BkDrsCd,0,getStringValue(),beginBdms01BkDrsCd,BDMS_01_BK_DRS_CD_LEN);
       localBdms01BkDrsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BkDrsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BkDrsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BkDrsCd() {	 
   		return (substring(getStringValue(),beginBdms01BkDrsCd,beginBdms01BkDrsCd + BDMS_01_BK_DRS_CD_LEN));
   	}
     int localBdms01PprlsLglIndCounter = -1;
     public boolean isBdms01PprlsLglIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PprlsLglIndCounter != sharedCounter;
         localBdms01PprlsLglIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PPRLS_LGL_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PprlsLglInd
	 */
   protected void serializeBdms01PprlsLglInd(char[] bdms01PprlsLglInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PprlsLglInd,0,getStringValue(),beginBdms01PprlsLglInd,BDMS_01_PPRLS_LGL_IND_LEN);
       localBdms01PprlsLglIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PprlsLglIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PprlsLglInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PprlsLglInd() {	 
   		return (substring(getStringValue(),beginBdms01PprlsLglInd,beginBdms01PprlsLglInd + BDMS_01_PPRLS_LGL_IND_LEN));
   	}




}
  
