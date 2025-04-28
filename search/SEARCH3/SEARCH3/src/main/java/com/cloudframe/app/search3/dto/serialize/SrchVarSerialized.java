package com.cloudframe.app.search3.dto.serialize;

/**
*  The class SrchVarSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SrchVarSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SrchVarSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRCH_VAR_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSrchVar1;
            protected  int beginSrchVar2;
	
	/**
	* Constructor for SrchVarSerialized
	**/
    public SrchVarSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SrchVarSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRCH_VAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSrchVar1 = getStartOffset() + 0;	// set offset for serialization
  
             beginSrchVar2 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSrchVar1Counter = -1;
     public boolean isSrchVar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrchVar1Counter != sharedCounter;
         localSrchVar1Counter = sharedCounter; return hasModified;
     }
	protected static final int SRCH_VAR_1_LEN = 2;
	/**
	 * 	serialize this SrchVar1
	 */
   protected void serializeSrchVar1(char[] srchVar1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srchVar1,0,getStringValue(),beginSrchVar1,SRCH_VAR_1_LEN);
       localSrchVar1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrchVar1Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSrchVar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrchVar1() {	 
   		return (substring(getStringValue(),beginSrchVar1,beginSrchVar1 + SRCH_VAR_1_LEN));
   	}
     int localSrchVar2Counter = -1;
     public boolean isSrchVar2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrchVar2Counter != sharedCounter;
         localSrchVar2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of srchVar2
	 *	@return srchVar2
	 */
	public char[]  getSrchVar2String() {
	     return getCharArray(beginSrchVar2,SRCH_VAR_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchVar2IsNumeric() {
	    return isNumeric(beginSrchVar2
	                    ,beginSrchVar2 + SRCH_VAR_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SRCH_VAR_2_LEN = 4;
  	/**
	 * serializeSrchVar2
	 */
	protected void serializeSrchVar2(int srchVar2) {
		 putNumber(beginSrchVar2,srchVar2,SRCH_VAR_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSrchVar2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSrchVar2
	 */
   	protected  int serializeSrchVar2(char[] value) {
	    int  srchVar2;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    srchVar2 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSrchVar2
		       ,4
		      );
		 localSrchVar2Counter = shareString.getSerializedField().getModifiedCounter();
		return  srchVar2;
    }

   protected int checkSrchVar2MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSrchVar2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrchVar2() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSrchVar2
			                 ,SRCH_VAR_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("srchVar2", beginSrchVar2,SRCH_VAR_2_LEN);
    }
   	}




}
  
