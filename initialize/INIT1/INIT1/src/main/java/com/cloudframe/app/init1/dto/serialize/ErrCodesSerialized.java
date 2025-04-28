package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ErrCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERR_CODES_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrSumCd;
            protected  int beginErrUsgCd;
            protected  int beginErrLscCd;
            protected  int beginErrRemCd;
            protected  int beginErrAtdCd;
	
	/**
	* Constructor for ErrCodesSerialized
	**/
    public ErrCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,440); // serialize this field at offset 440 by default 
    }
    
	/**
	* sets parent for this ErrCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 440 by default
    }    
	/**
	* initializes the field in ErrCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERR_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrSumCd = getStartOffset() + 0;	// set offset for serialization
  
             beginErrUsgCd = getStartOffset() + 3;	// set offset for serialization
  
             beginErrLscCd = getStartOffset() + 6;	// set offset for serialization
  
             beginErrRemCd = getStartOffset() + 9;	// set offset for serialization
  
             beginErrAtdCd = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrSumCdCounter = -1;
     public boolean isErrSumCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrSumCdCounter != sharedCounter;
         localErrSumCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_SUM_CD_LEN = 3;
	/**
	 * 	serialize this ErrSumCd
	 */
   protected void serializeErrSumCd(char[] errSumCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errSumCd,0,getStringValue(),beginErrSumCd,ERR_SUM_CD_LEN);
       localErrSumCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrSumCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrSumCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrSumCd() {	 
   		return (substring(getStringValue(),beginErrSumCd,beginErrSumCd + ERR_SUM_CD_LEN));
   	}
     int localErrUsgCdCounter = -1;
     public boolean isErrUsgCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrUsgCdCounter != sharedCounter;
         localErrUsgCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_USG_CD_LEN = 3;
	/**
	 * 	serialize this ErrUsgCd
	 */
   protected void serializeErrUsgCd(char[] errUsgCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errUsgCd,0,getStringValue(),beginErrUsgCd,ERR_USG_CD_LEN);
       localErrUsgCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrUsgCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrUsgCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrUsgCd() {	 
   		return (substring(getStringValue(),beginErrUsgCd,beginErrUsgCd + ERR_USG_CD_LEN));
   	}
     int localErrLscCdCounter = -1;
     public boolean isErrLscCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrLscCdCounter != sharedCounter;
         localErrLscCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_LSC_CD_LEN = 3;
	/**
	 * 	serialize this ErrLscCd
	 */
   protected void serializeErrLscCd(char[] errLscCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errLscCd,0,getStringValue(),beginErrLscCd,ERR_LSC_CD_LEN);
       localErrLscCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrLscCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrLscCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrLscCd() {	 
   		return (substring(getStringValue(),beginErrLscCd,beginErrLscCd + ERR_LSC_CD_LEN));
   	}
     int localErrRemCdCounter = -1;
     public boolean isErrRemCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrRemCdCounter != sharedCounter;
         localErrRemCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_REM_CD_LEN = 3;
	/**
	 * 	serialize this ErrRemCd
	 */
   protected void serializeErrRemCd(char[] errRemCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errRemCd,0,getStringValue(),beginErrRemCd,ERR_REM_CD_LEN);
       localErrRemCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrRemCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrRemCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrRemCd() {	 
   		return (substring(getStringValue(),beginErrRemCd,beginErrRemCd + ERR_REM_CD_LEN));
   	}
     int localErrAtdCdCounter = -1;
     public boolean isErrAtdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrAtdCdCounter != sharedCounter;
         localErrAtdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ERR_ATD_CD_LEN = 3;
	/**
	 * 	serialize this ErrAtdCd
	 */
   protected void serializeErrAtdCd(char[] errAtdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errAtdCd,0,getStringValue(),beginErrAtdCd,ERR_ATD_CD_LEN);
       localErrAtdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrAtdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshErrAtdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrAtdCd() {	 
   		return (substring(getStringValue(),beginErrAtdCd,beginErrAtdCd + ERR_ATD_CD_LEN));
   	}




}
  
