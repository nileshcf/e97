package com.cloudframe.app.inspct0.dto.serialize;

/**
*  The class MiscSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MiscSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MiscSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MISC_LENGTH = 748;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCnt;
            protected  int beginParm;
            protected  int beginNullWs;
            protected  int beginX1;
            protected  int beginX2;
	
	/**
	* Constructor for MiscSerialized
	**/
    public MiscSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MiscSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MISC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCnt = getStartOffset() + 0;	// set offset for serialization
  
             beginParm = getStartOffset() + 3;	// set offset for serialization
  
             beginNullWs = getStartOffset() + 33;	// set offset for serialization
  
             beginX1 = getStartOffset() + 38;	// set offset for serialization
  
             beginX2 = getStartOffset() + 743;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCntCounter = -1;
     public boolean isCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCntCounter != sharedCounter;
         localCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cnt
	 *	@return cnt
	 */
	public char[]  getCntString() {
	     return getCharArray(beginCnt,CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cntIsNumeric() {
	    return isNumeric(beginCnt
	                    ,beginCnt + CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CNT_LEN = 3;
  	/**
	 * serializeCnt
	 */
	protected void serializeCnt(int cnt) {
		 putNumber(beginCnt,cnt,CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCnt
	 */
   	protected  int serializeCnt(char[] value) {
	    int  cnt;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCnt
		       ,3
		      );
		 localCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  cnt;
    }

   protected int checkCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCnt
			                 ,CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cnt", beginCnt,CNT_LEN);
    }
   	}
     int localParmCounter = -1;
     public boolean isParmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmCounter != sharedCounter;
         localParmCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_LEN = 30;
	/**
	 * 	serialize this Parm
	 */
   protected void serializeParm(char[] parm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parm,0,getStringValue(),beginParm,PARM_LEN);
       localParmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshParm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParm() {	 
   		return (substring(getStringValue(),beginParm,beginParm + PARM_LEN));
   	}
     int localNullWsCounter = -1;
     public boolean isNullWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNullWsCounter != sharedCounter;
         localNullWsCounter = sharedCounter; return hasModified;
     }
	protected static final int NULL_WS_LEN = 5;
	/**
	 * 	serialize this NullWs
	 */
   protected void serializeNullWs(char[] nullWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nullWs,0,getStringValue(),beginNullWs,NULL_WS_LEN);
       localNullWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNullWsConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshNullWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNullWs() {	 
   		return (substring(getStringValue(),beginNullWs,beginNullWs + NULL_WS_LEN));
   	}
     int localX1Counter = -1;
     public boolean isX1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX1Counter != sharedCounter;
         localX1Counter = sharedCounter; return hasModified;
     }
	protected static final int X_1_LEN = 5;
	/**
	 * 	serialize this X1
	 */
   protected void serializeX1(char[] x1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x1,0,getStringValue(),beginX1,X_1_LEN);
       localX1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX1Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshX1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX1() {	 
   		return (substring(getStringValue(),beginX1,beginX1 + X_1_LEN));
   	}
     int localX2Counter = -1;
     public boolean isX2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX2Counter != sharedCounter;
         localX2Counter = sharedCounter; return hasModified;
     }
	protected static final int X_2_LEN = 5;
	/**
	 * 	serialize this X2
	 */
   protected void serializeX2(char[] x2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x2,0,getStringValue(),beginX2,X_2_LEN);
       localX2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX2Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshX2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX2() {	 
   		return (substring(getStringValue(),beginX2,beginX2 + X_2_LEN));
   	}




}
  
