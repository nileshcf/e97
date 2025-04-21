package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Sys201CalcFeeInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201CalcFeeInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201CalcFeeInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_CALC_FEE_INFO_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201CalcPayParty;
            protected  int beginSys201CalcFeeSetlAmt;
            protected  int beginSys201CalcFeeSetlCur;
            protected  int beginSys201CalcFeeDrCrInd;
	
	/**
	* Constructor for Sys201CalcFeeInfoSerialized
	**/
    public Sys201CalcFeeInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys201CalcFeeInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201CalcFeeInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys201CalcFeeInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,750); // serialize this field at offset 750 by default 
    }
    
	/**
	* sets parent for this Sys201CalcFeeInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 750 by default
    }    
	/**
	* initializes the field in Sys201CalcFeeInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_CALC_FEE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201CalcPayParty = getStartOffset() + 0;	// set offset for serialization
  
             beginSys201CalcFeeSetlAmt = getStartOffset() + 3;	// set offset for serialization
  
             beginSys201CalcFeeSetlCur = getStartOffset() + 15;	// set offset for serialization
  
             beginSys201CalcFeeDrCrInd = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201CalcPayPartyCounter = -1;
     public boolean isSys201CalcPayPartyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CalcPayPartyCounter != sharedCounter;
         localSys201CalcPayPartyCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_CALC_PAY_PARTY_LEN = 3;
	/**
	 * 	serialize this Sys201CalcPayParty
	 */
   protected void serializeSys201CalcPayParty(char[] sys201CalcPayParty) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201CalcPayParty,0,getStringValue(),beginSys201CalcPayParty,SYS_201_CALC_PAY_PARTY_LEN);
       localSys201CalcPayPartyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201CalcPayPartyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSys201CalcPayParty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201CalcPayParty() {	 
   		return (substring(getStringValue(),beginSys201CalcPayParty,beginSys201CalcPayParty + SYS_201_CALC_PAY_PARTY_LEN));
   	}
     int localSys201CalcFeeSetlAmtCounter = -1;
     public boolean isSys201CalcFeeSetlAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CalcFeeSetlAmtCounter != sharedCounter;
         localSys201CalcFeeSetlAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public char[]  getSys201CalcFeeSetlAmtString() {
	     return getCharArray(beginSys201CalcFeeSetlAmt,SYS_201_CALC_FEE_SETL_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201CalcFeeSetlAmtIsNumeric() {
	    return isNumeric(beginSys201CalcFeeSetlAmt
	                    ,beginSys201CalcFeeSetlAmt + SYS_201_CALC_FEE_SETL_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_201_CALC_FEE_SETL_AMT_LEN = 12;
  	/**
	 * serializeSys201CalcFeeSetlAmt
	 */
	protected void serializeSys201CalcFeeSetlAmt(long sys201CalcFeeSetlAmt) {
		 putNumber(beginSys201CalcFeeSetlAmt,sys201CalcFeeSetlAmt,SYS_201_CALC_FEE_SETL_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys201CalcFeeSetlAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys201CalcFeeSetlAmt
	 */
   	protected  long serializeSys201CalcFeeSetlAmt(char[] value) {
	    long  sys201CalcFeeSetlAmt;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys201CalcFeeSetlAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,true/*isSigned?*/)
		       ,beginSys201CalcFeeSetlAmt
		       ,12
		      );
		 localSys201CalcFeeSetlAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  sys201CalcFeeSetlAmt;
    }

   protected long checkSys201CalcFeeSetlAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSys201CalcFeeSetlAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSys201CalcFeeSetlAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSys201CalcFeeSetlAmt
			                 ,SYS_201_CALC_FEE_SETL_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys201CalcFeeSetlAmt", beginSys201CalcFeeSetlAmt,SYS_201_CALC_FEE_SETL_AMT_LEN);
    }
   	}
     int localSys201CalcFeeSetlCurCounter = -1;
     public boolean isSys201CalcFeeSetlCurModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CalcFeeSetlCurCounter != sharedCounter;
         localSys201CalcFeeSetlCurCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys201CalcFeeSetlCur
	 *	@return sys201CalcFeeSetlCur
	 */
	public char[]  getSys201CalcFeeSetlCurString() {
	     return getCharArray(beginSys201CalcFeeSetlCur,SYS_201_CALC_FEE_SETL_CUR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201CalcFeeSetlCurIsNumeric() {
	    return isNumeric(beginSys201CalcFeeSetlCur
	                    ,beginSys201CalcFeeSetlCur + SYS_201_CALC_FEE_SETL_CUR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_201_CALC_FEE_SETL_CUR_LEN = 3;
  	/**
	 * serializeSys201CalcFeeSetlCur
	 */
	protected void serializeSys201CalcFeeSetlCur(int sys201CalcFeeSetlCur) {
		 putNumber(beginSys201CalcFeeSetlCur,sys201CalcFeeSetlCur,SYS_201_CALC_FEE_SETL_CUR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys201CalcFeeSetlCurCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys201CalcFeeSetlCur
	 */
   	protected  int serializeSys201CalcFeeSetlCur(char[] value) {
	    int  sys201CalcFeeSetlCur;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys201CalcFeeSetlCur = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSys201CalcFeeSetlCur
		       ,3
		      );
		 localSys201CalcFeeSetlCurCounter = shareString.getSerializedField().getModifiedCounter();
		return  sys201CalcFeeSetlCur;
    }

   protected int checkSys201CalcFeeSetlCurMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys201CalcFeeSetlCur is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys201CalcFeeSetlCur() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSys201CalcFeeSetlCur
			                 ,SYS_201_CALC_FEE_SETL_CUR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys201CalcFeeSetlCur", beginSys201CalcFeeSetlCur,SYS_201_CALC_FEE_SETL_CUR_LEN);
    }
   	}
     int localSys201CalcFeeDrCrIndCounter = -1;
     public boolean isSys201CalcFeeDrCrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CalcFeeDrCrIndCounter != sharedCounter;
         localSys201CalcFeeDrCrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_CALC_FEE_DR_CR_IND_LEN = 2;
	/**
	 * 	serialize this Sys201CalcFeeDrCrInd
	 */
   protected void serializeSys201CalcFeeDrCrInd(char[] sys201CalcFeeDrCrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201CalcFeeDrCrInd,0,getStringValue(),beginSys201CalcFeeDrCrInd,SYS_201_CALC_FEE_DR_CR_IND_LEN);
       localSys201CalcFeeDrCrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201CalcFeeDrCrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys201CalcFeeDrCrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201CalcFeeDrCrInd() {	 
   		return (substring(getStringValue(),beginSys201CalcFeeDrCrInd,beginSys201CalcFeeDrCrInd + SYS_201_CALC_FEE_DR_CR_IND_LEN));
   	}




}
  
