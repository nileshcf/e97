package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01TcontrolSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01TcontrolSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01TcontrolSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_TCONTROL_SEG_DATA_LENGTH = 145;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01TcontrolSegSqlcd;
            protected  int beginBdms01UpdtTranCd;
            protected  int beginBdms01UpdtTmstp;
            protected  int beginBdms01UpdtTrmlCd;
            protected  int beginBdms01UpdtCommentTxt;
	
	/**
	* Constructor for Bdms01TcontrolSegDataSerialized
	**/
    public Bdms01TcontrolSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01TcontrolSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01TcontrolSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01TcontrolSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4485); // serialize this field at offset 4485 by default 
    }
    
	/**
	* sets parent for this Bdms01TcontrolSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4485 by default
    }    
	/**
	* initializes the field in Bdms01TcontrolSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_TCONTROL_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01TcontrolSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01UpdtTranCd = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01UpdtTmstp = getStartOffset() + 12;	// set offset for serialization
  
             beginBdms01UpdtTrmlCd = getStartOffset() + 38;	// set offset for serialization
  
             beginBdms01UpdtCommentTxt = getStartOffset() + 46;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01TcontrolSegSqlcdCounter = -1;
     public boolean isBdms01TcontrolSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TcontrolSegSqlcdCounter != sharedCounter;
         localBdms01TcontrolSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01TcontrolSegSqlcd
	 *	@return bdms01TcontrolSegSqlcd
	 */
	public char[]  getBdms01TcontrolSegSqlcdString() {
	     return getCharArray(beginBdms01TcontrolSegSqlcd,BDMS_01_TCONTROL_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01TcontrolSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01TcontrolSegSqlcd
	                    ,beginBdms01TcontrolSegSqlcd + BDMS_01_TCONTROL_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_TCONTROL_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01TcontrolSegSqlcd
	 */
	protected void serializeBdms01TcontrolSegSqlcd(int bdms01TcontrolSegSqlcd) {
		 putNumber(beginBdms01TcontrolSegSqlcd,bdms01TcontrolSegSqlcd,BDMS_01_TCONTROL_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01TcontrolSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01TcontrolSegSqlcd
	 */
   	protected  int serializeBdms01TcontrolSegSqlcd(char[] value) {
	    int  bdms01TcontrolSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01TcontrolSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01TcontrolSegSqlcd
		       ,4
		      );
		 localBdms01TcontrolSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01TcontrolSegSqlcd;
    }

   protected int checkBdms01TcontrolSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01TcontrolSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01TcontrolSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01TcontrolSegSqlcd
			                 ,BDMS_01_TCONTROL_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01TcontrolSegSqlcd", beginBdms01TcontrolSegSqlcd,BDMS_01_TCONTROL_SEG_SQLCD_LEN);
    }
   	}
     int localBdms01UpdtTranCdCounter = -1;
     public boolean isBdms01UpdtTranCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UpdtTranCdCounter != sharedCounter;
         localBdms01UpdtTranCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UPDT_TRAN_CD_LEN = 8;
	/**
	 * 	serialize this Bdms01UpdtTranCd
	 */
   protected void serializeBdms01UpdtTranCd(char[] bdms01UpdtTranCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UpdtTranCd,0,getStringValue(),beginBdms01UpdtTranCd,BDMS_01_UPDT_TRAN_CD_LEN);
       localBdms01UpdtTranCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UpdtTranCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01UpdtTranCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UpdtTranCd() {	 
   		return (substring(getStringValue(),beginBdms01UpdtTranCd,beginBdms01UpdtTranCd + BDMS_01_UPDT_TRAN_CD_LEN));
   	}
     int localBdms01UpdtTmstpCounter = -1;
     public boolean isBdms01UpdtTmstpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UpdtTmstpCounter != sharedCounter;
         localBdms01UpdtTmstpCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UPDT_TMSTP_LEN = 26;
	/**
	 * 	serialize this Bdms01UpdtTmstp
	 */
   protected void serializeBdms01UpdtTmstp(char[] bdms01UpdtTmstp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UpdtTmstp,0,getStringValue(),beginBdms01UpdtTmstp,BDMS_01_UPDT_TMSTP_LEN);
       localBdms01UpdtTmstpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UpdtTmstpConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshBdms01UpdtTmstp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UpdtTmstp() {	 
   		return (substring(getStringValue(),beginBdms01UpdtTmstp,beginBdms01UpdtTmstp + BDMS_01_UPDT_TMSTP_LEN));
   	}
     int localBdms01UpdtTrmlCdCounter = -1;
     public boolean isBdms01UpdtTrmlCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UpdtTrmlCdCounter != sharedCounter;
         localBdms01UpdtTrmlCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UPDT_TRML_CD_LEN = 8;
	/**
	 * 	serialize this Bdms01UpdtTrmlCd
	 */
   protected void serializeBdms01UpdtTrmlCd(char[] bdms01UpdtTrmlCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UpdtTrmlCd,0,getStringValue(),beginBdms01UpdtTrmlCd,BDMS_01_UPDT_TRML_CD_LEN);
       localBdms01UpdtTrmlCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UpdtTrmlCdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBdms01UpdtTrmlCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UpdtTrmlCd() {	 
   		return (substring(getStringValue(),beginBdms01UpdtTrmlCd,beginBdms01UpdtTrmlCd + BDMS_01_UPDT_TRML_CD_LEN));
   	}
     int localBdms01UpdtCommentTxtCounter = -1;
     public boolean isBdms01UpdtCommentTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UpdtCommentTxtCounter != sharedCounter;
         localBdms01UpdtCommentTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UPDT_COMMENT_TXT_LEN = 79;
	/**
	 * 	serialize this Bdms01UpdtCommentTxt
	 */
   protected void serializeBdms01UpdtCommentTxt(char[] bdms01UpdtCommentTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UpdtCommentTxt,0,getStringValue(),beginBdms01UpdtCommentTxt,BDMS_01_UPDT_COMMENT_TXT_LEN);
       localBdms01UpdtCommentTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UpdtCommentTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 79 ,false, false);
   }
    /**
	 *	refreshBdms01UpdtCommentTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UpdtCommentTxt() {	 
   		return (substring(getStringValue(),beginBdms01UpdtCommentTxt,beginBdms01UpdtCommentTxt + BDMS_01_UPDT_COMMENT_TXT_LEN));
   	}




}
  
