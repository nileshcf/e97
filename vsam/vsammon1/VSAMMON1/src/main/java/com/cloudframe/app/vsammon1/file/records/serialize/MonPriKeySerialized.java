package com.cloudframe.app.vsammon1.file.records.serialize;

/**
*  The class MonPriKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MonPriKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonPriKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MON_PRI_KEY_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMonXcdtTskStrtTm;
            protected  int beginMonXcdtProgNm;
            protected  int beginMonXcdtMthdNm;
            protected  int beginMonXctorTskNo;
	
	/**
	* Constructor for MonPriKeySerialized
	**/
    public MonPriKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MonPriKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonPriKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MonPriKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MonPriKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MonPriKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MON_PRI_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMonXcdtTskStrtTm = getStartOffset() + 10;	// set offset for serialization
  
             beginMonXcdtProgNm = getStartOffset() + 18;	// set offset for serialization
  
             beginMonXcdtMthdNm = getStartOffset() + 26;	// set offset for serialization
  
             beginMonXctorTskNo = getStartOffset() + 61;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMonXcdtTskStrtTmCounter = -1;
     public boolean isMonXcdtTskStrtTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtTskStrtTmCounter != sharedCounter;
         localMonXcdtTskStrtTmCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_TSK_STRT_TM_LEN = 8;
	/**
	 * 	serialize this MonXcdtTskStrtTm
	 */
   protected void serializeMonXcdtTskStrtTm(char[] monXcdtTskStrtTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtTskStrtTm,0,getStringValue(),beginMonXcdtTskStrtTm,MON_XCDT_TSK_STRT_TM_LEN);
       localMonXcdtTskStrtTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtTskStrtTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMonXcdtTskStrtTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtTskStrtTm() {	 
   		return (substring(getStringValue(),beginMonXcdtTskStrtTm,beginMonXcdtTskStrtTm + MON_XCDT_TSK_STRT_TM_LEN));
   	}
     int localMonXcdtProgNmCounter = -1;
     public boolean isMonXcdtProgNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtProgNmCounter != sharedCounter;
         localMonXcdtProgNmCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_PROG_NM_LEN = 8;
	/**
	 * 	serialize this MonXcdtProgNm
	 */
   protected void serializeMonXcdtProgNm(char[] monXcdtProgNm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtProgNm,0,getStringValue(),beginMonXcdtProgNm,MON_XCDT_PROG_NM_LEN);
       localMonXcdtProgNmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtProgNmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMonXcdtProgNm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtProgNm() {	 
   		return (substring(getStringValue(),beginMonXcdtProgNm,beginMonXcdtProgNm + MON_XCDT_PROG_NM_LEN));
   	}
     int localMonXcdtMthdNmCounter = -1;
     public boolean isMonXcdtMthdNmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonXcdtMthdNmCounter != sharedCounter;
         localMonXcdtMthdNmCounter = sharedCounter; return hasModified;
     }
	protected static final int MON_XCDT_MTHD_NM_LEN = 35;
	/**
	 * 	serialize this MonXcdtMthdNm
	 */
   protected void serializeMonXcdtMthdNm(char[] monXcdtMthdNm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monXcdtMthdNm,0,getStringValue(),beginMonXcdtMthdNm,MON_XCDT_MTHD_NM_LEN);
       localMonXcdtMthdNmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonXcdtMthdNmConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshMonXcdtMthdNm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonXcdtMthdNm() {	 
   		return (substring(getStringValue(),beginMonXcdtMthdNm,beginMonXcdtMthdNm + MON_XCDT_MTHD_NM_LEN));
   	}
        int localMonXctorTskNoCounter = -1;
        public boolean isMonXctorTskNoModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMonXctorTskNoCounter != sharedCounter;
           localMonXctorTskNoCounter = sharedCounter; return hasModified; 
        }
	    public boolean monXctorTskNoIsNumeric() {
	      return decimalIsNumeric(beginMonXctorTskNo,MON_XCTOR_TSK_NO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MON_XCTOR_TSK_NO_LEN = 4;
  	/**
	 * 	serializeMonXctorTskNo
	 */
	protected void serializeMonXctorTskNo(int monXctorTskNo) {
		   putDecimal(beginMonXctorTskNo,monXctorTskNo,MON_XCTOR_TSK_NO_LEN,true);
   }
   

   protected int checkMonXctorTskNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshMonXctorTskNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonXctorTskNo() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMonXctorTskNo,MON_XCTOR_TSK_NO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("monXctorTskNo", beginMonXctorTskNo,MON_XCTOR_TSK_NO_LEN);
     }
   	}




}
  
