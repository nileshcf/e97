package com.cloudframe.app.cfabcall.dto.serialize;

/**
*  The class ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmLen;
            protected  int beginAbendTy;
            protected  int beginAbendCode01;
	
	/**
	* Constructor for ParmSerialized
	**/
    public ParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmLen = getStartOffset() + 0;	// set offset for serialization
  
             beginAbendTy = getStartOffset() + 2;	// set offset for serialization
  
             beginAbendCode01 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParmLenCounter = -1;
         public boolean isParmLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmLenCounter != sharedCounter;
            localParmLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_LEN_LEN = 2;
  	/**
	 * serializeParmLen
	 */
	protected void serializeParmLen(short parmLen) {
           replaceValue( //  save the value as string
                   getBinaryString( parmLen,PARM_LEN_LEN)
                  ,beginParmLen
                  ,PARM_LEN_LEN
                 );
            localParmLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmLen() {	 
			return (getShort(beginParmLen));
   	}
     int localAbendTyCounter = -1;
     public boolean isAbendTyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendTyCounter != sharedCounter;
         localAbendTyCounter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_TY_LEN = 1;
	/**
	 * 	serialize this AbendTy
	 */
   protected void serializeAbendTy(char[] abendTy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendTy,0,getStringValue(),beginAbendTy,ABEND_TY_LEN);
       localAbendTyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendTyConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAbendTy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendTy() {	 
   		return (substring(getStringValue(),beginAbendTy,beginAbendTy + ABEND_TY_LEN));
   	}
     int localAbendCode01Counter = -1;
     public boolean isAbendCode01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode01Counter != sharedCounter;
         localAbendCode01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of abendCode01
	 *	@return abendCode01
	 */
	public char[]  getAbendCode01String() {
	     return getCharArray(beginAbendCode01,ABEND_CODE_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode01IsNumeric() {
	    return isNumeric(beginAbendCode01
	                    ,beginAbendCode01 + ABEND_CODE_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ABEND_CODE_01_LEN = 4;
  	/**
	 * serializeAbendCode01
	 */
	protected void serializeAbendCode01(int abendCode01) {
		 putNumber(beginAbendCode01,abendCode01,ABEND_CODE_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAbendCode01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAbendCode01
	 */
   	protected  int serializeAbendCode01(char[] value) {
	    int  abendCode01;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    abendCode01 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAbendCode01
		       ,4
		      );
		 localAbendCode01Counter = shareString.getSerializedField().getModifiedCounter();
		return  abendCode01;
    }

   protected int checkAbendCode01MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAbendCode01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAbendCode01() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAbendCode01
			                 ,ABEND_CODE_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("abendCode01", beginAbendCode01,ABEND_CODE_01_LEN);
    }
   	}




}
  
