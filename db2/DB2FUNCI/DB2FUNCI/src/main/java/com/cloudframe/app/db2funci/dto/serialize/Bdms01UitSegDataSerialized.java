package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01UitSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01UitSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01UitSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_UIT_SEG_DATA_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01UitSegSqlcd;
            protected  int beginMsdUnitIdCd;
            protected  int beginMsdUnitIdNo;
            protected  int beginBdms01TypeUitCd;
            protected  int beginBdms01UitInterestPayCd;
            protected  int beginBdms01SpnsrId;
            protected  int beginBdms01WrapInd;
            protected  int beginBdms01CshRnvstCd;
	
	/**
	* Constructor for Bdms01UitSegDataSerialized
	**/
    public Bdms01UitSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01UitSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01UitSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01UitSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3517); // serialize this field at offset 3517 by default 
    }
    
	/**
	* sets parent for this Bdms01UitSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3517 by default
    }    
	/**
	* initializes the field in Bdms01UitSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_UIT_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01UitSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdUnitIdCd = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdUnitIdNo = getStartOffset() + 6;	// set offset for serialization
  
             beginBdms01TypeUitCd = getStartOffset() + 9;	// set offset for serialization
  
             beginBdms01UitInterestPayCd = getStartOffset() + 11;	// set offset for serialization
  
             beginBdms01SpnsrId = getStartOffset() + 13;	// set offset for serialization
  
             beginBdms01WrapInd = getStartOffset() + 16;	// set offset for serialization
  
             beginBdms01CshRnvstCd = getStartOffset() + 17;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01UitSegSqlcdCounter = -1;
     public boolean isBdms01UitSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UitSegSqlcdCounter != sharedCounter;
         localBdms01UitSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01UitSegSqlcd
	 *	@return bdms01UitSegSqlcd
	 */
	public char[]  getBdms01UitSegSqlcdString() {
	     return getCharArray(beginBdms01UitSegSqlcd,BDMS_01_UIT_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01UitSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01UitSegSqlcd
	                    ,beginBdms01UitSegSqlcd + BDMS_01_UIT_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_UIT_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01UitSegSqlcd
	 */
	protected void serializeBdms01UitSegSqlcd(int bdms01UitSegSqlcd) {
		 putNumber(beginBdms01UitSegSqlcd,bdms01UitSegSqlcd,BDMS_01_UIT_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01UitSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01UitSegSqlcd
	 */
   	protected  int serializeBdms01UitSegSqlcd(char[] value) {
	    int  bdms01UitSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01UitSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01UitSegSqlcd
		       ,4
		      );
		 localBdms01UitSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01UitSegSqlcd;
    }

   protected int checkBdms01UitSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01UitSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01UitSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01UitSegSqlcd
			                 ,BDMS_01_UIT_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01UitSegSqlcd", beginBdms01UitSegSqlcd,BDMS_01_UIT_SEG_SQLCD_LEN);
    }
   	}
     int localMsdUnitIdCdCounter = -1;
     public boolean isMsdUnitIdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdUnitIdCdCounter != sharedCounter;
         localMsdUnitIdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_UNIT_ID_CD_LEN = 2;
	/**
	 * 	serialize this MsdUnitIdCd
	 */
   protected void serializeMsdUnitIdCd(char[] msdUnitIdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdUnitIdCd,0,getStringValue(),beginMsdUnitIdCd,MSD_UNIT_ID_CD_LEN);
       localMsdUnitIdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdUnitIdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdUnitIdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdUnitIdCd() {	 
   		return (substring(getStringValue(),beginMsdUnitIdCd,beginMsdUnitIdCd + MSD_UNIT_ID_CD_LEN));
   	}
     int localMsdUnitIdNoCounter = -1;
     public boolean isMsdUnitIdNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdUnitIdNoCounter != sharedCounter;
         localMsdUnitIdNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdUnitIdNo
	 *	@return msdUnitIdNo
	 */
	public char[]  getMsdUnitIdNoString() {
	     return getCharArray(beginMsdUnitIdNo,MSD_UNIT_ID_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdUnitIdNoIsNumeric() {
	    return isNumeric(beginMsdUnitIdNo
	                    ,beginMsdUnitIdNo + MSD_UNIT_ID_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_UNIT_ID_NO_LEN = 3;
  	/**
	 * serializeMsdUnitIdNo
	 */
	protected void serializeMsdUnitIdNo(int msdUnitIdNo) {
		 putNumber(beginMsdUnitIdNo,msdUnitIdNo,MSD_UNIT_ID_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdUnitIdNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdUnitIdNo
	 */
   	protected  int serializeMsdUnitIdNo(char[] value) {
	    int  msdUnitIdNo;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdUnitIdNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginMsdUnitIdNo
		       ,3
		      );
		 localMsdUnitIdNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdUnitIdNo;
    }

   protected int checkMsdUnitIdNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdUnitIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMsdUnitIdNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMsdUnitIdNo
			                 ,MSD_UNIT_ID_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdUnitIdNo", beginMsdUnitIdNo,MSD_UNIT_ID_NO_LEN);
    }
   	}
     int localBdms01TypeUitCdCounter = -1;
     public boolean isBdms01TypeUitCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeUitCdCounter != sharedCounter;
         localBdms01TypeUitCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_UIT_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TypeUitCd
	 */
   protected void serializeBdms01TypeUitCd(char[] bdms01TypeUitCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeUitCd,0,getStringValue(),beginBdms01TypeUitCd,BDMS_01_TYPE_UIT_CD_LEN);
       localBdms01TypeUitCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeUitCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TypeUitCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeUitCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeUitCd,beginBdms01TypeUitCd + BDMS_01_TYPE_UIT_CD_LEN));
   	}
     int localBdms01UitInterestPayCdCounter = -1;
     public boolean isBdms01UitInterestPayCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UitInterestPayCdCounter != sharedCounter;
         localBdms01UitInterestPayCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UIT_INTEREST_PAY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01UitInterestPayCd
	 */
   protected void serializeBdms01UitInterestPayCd(char[] bdms01UitInterestPayCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UitInterestPayCd,0,getStringValue(),beginBdms01UitInterestPayCd,BDMS_01_UIT_INTEREST_PAY_CD_LEN);
       localBdms01UitInterestPayCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UitInterestPayCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01UitInterestPayCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UitInterestPayCd() {	 
   		return (substring(getStringValue(),beginBdms01UitInterestPayCd,beginBdms01UitInterestPayCd + BDMS_01_UIT_INTEREST_PAY_CD_LEN));
   	}
     int localBdms01SpnsrIdCounter = -1;
     public boolean isBdms01SpnsrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SpnsrIdCounter != sharedCounter;
         localBdms01SpnsrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SPNSR_ID_LEN = 3;
	/**
	 * 	serialize this Bdms01SpnsrId
	 */
   protected void serializeBdms01SpnsrId(char[] bdms01SpnsrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SpnsrId,0,getStringValue(),beginBdms01SpnsrId,BDMS_01_SPNSR_ID_LEN);
       localBdms01SpnsrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SpnsrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01SpnsrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SpnsrId() {	 
   		return (substring(getStringValue(),beginBdms01SpnsrId,beginBdms01SpnsrId + BDMS_01_SPNSR_ID_LEN));
   	}
     int localBdms01WrapIndCounter = -1;
     public boolean isBdms01WrapIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01WrapIndCounter != sharedCounter;
         localBdms01WrapIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_WRAP_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01WrapInd
	 */
   protected void serializeBdms01WrapInd(char[] bdms01WrapInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01WrapInd,0,getStringValue(),beginBdms01WrapInd,BDMS_01_WRAP_IND_LEN);
       localBdms01WrapIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01WrapIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01WrapInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01WrapInd() {	 
   		return (substring(getStringValue(),beginBdms01WrapInd,beginBdms01WrapInd + BDMS_01_WRAP_IND_LEN));
   	}
     int localBdms01CshRnvstCdCounter = -1;
     public boolean isBdms01CshRnvstCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CshRnvstCdCounter != sharedCounter;
         localBdms01CshRnvstCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CSH_RNVST_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01CshRnvstCd
	 */
   protected void serializeBdms01CshRnvstCd(char[] bdms01CshRnvstCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CshRnvstCd,0,getStringValue(),beginBdms01CshRnvstCd,BDMS_01_CSH_RNVST_CD_LEN);
       localBdms01CshRnvstCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CshRnvstCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01CshRnvstCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CshRnvstCd() {	 
   		return (substring(getStringValue(),beginBdms01CshRnvstCd,beginBdms01CshRnvstCd + BDMS_01_CSH_RNVST_CD_LEN));
   	}




}
  
