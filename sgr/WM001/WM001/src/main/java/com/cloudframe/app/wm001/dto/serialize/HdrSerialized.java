package com.cloudframe.app.wm001.dto.serialize;

/**
*  The class HdrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HDR_LENGTH = 76;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHdrL2;
            protected  int beginHdrCnt;
            protected  int beginHdrL3;
	
	/**
	* Constructor for HdrSerialized
	**/
    public HdrSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HDR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginHdrL2 = getStartOffset() + 1;	// set offset for serialization
  
  
             beginHdrCnt = getStartOffset() + 37;	// set offset for serialization
  
  
             beginHdrL3 = getStartOffset() + 40;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHdrL2Counter = -1;
     public boolean isHdrL2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrL2Counter != sharedCounter;
         localHdrL2Counter = sharedCounter; return hasModified;
     }
	protected static final int HDR_L_2_LEN = 35;
	/**
	 * 	serialize this HdrL2
	 */
   protected void serializeHdrL2(char[] hdrL2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hdrL2,0,getStringValue(),beginHdrL2,HDR_L_2_LEN);
       localHdrL2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHdrL2Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshHdrL2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHdrL2() {	 
   		return (substring(getStringValue(),beginHdrL2,beginHdrL2 + HDR_L_2_LEN));
   	}
     int localHdrCntCounter = -1;
     public boolean isHdrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrCntCounter != sharedCounter;
         localHdrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hdrCnt
	 *	@return hdrCnt
	 */
	public char[]  getHdrCntString() {
	     return getCharArray(beginHdrCnt,HDR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hdrCntIsNumeric() {
	    return isNumeric(beginHdrCnt
	                    ,beginHdrCnt + HDR_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HDR_CNT_LEN = 2;
  	/**
	 * serializeHdrCnt
	 */
	protected void serializeHdrCnt(int hdrCnt) {
		 putNumber(beginHdrCnt,hdrCnt,HDR_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHdrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHdrCnt
	 */
   	protected  int serializeHdrCnt(char[] value) {
	    int  hdrCnt;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hdrCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginHdrCnt
		       ,2
		      );
		 localHdrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  hdrCnt;
    }

   protected int checkHdrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHdrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHdrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHdrCnt
			                 ,HDR_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hdrCnt", beginHdrCnt,HDR_CNT_LEN);
    }
   	}
     int localHdrL3Counter = -1;
     public boolean isHdrL3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdrL3Counter != sharedCounter;
         localHdrL3Counter = sharedCounter; return hasModified;
     }
	protected static final int HDR_L_3_LEN = 35;
	/**
	 * 	serialize this HdrL3
	 */
   protected void serializeHdrL3(char[] hdrL3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hdrL3,0,getStringValue(),beginHdrL3,HDR_L_3_LEN);
       localHdrL3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHdrL3Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshHdrL3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHdrL3() {	 
   		return (substring(getStringValue(),beginHdrL3,beginHdrL3 + HDR_L_3_LEN));
   	}




}
  
