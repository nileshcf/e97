package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01SearchOptExpCcyymmddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01SearchOptExpCcyymmddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01SearchOptExpCcyymmddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_SEARCH_OPT_EXP_CCYYMMDD_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01SearchOptExpCc;
            protected  int beginBdms01SearchOptExpYy;
            protected  int beginBdms01SearchOptExpMm;
            protected  int beginBdms01SearchOptExpDd;
	
	/**
	* Constructor for Bdms01SearchOptExpCcyymmddSerialized
	**/
    public Bdms01SearchOptExpCcyymmddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01SearchOptExpCcyymmddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SearchOptExpCcyymmddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01SearchOptExpCcyymmddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Bdms01SearchOptExpCcyymmddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Bdms01SearchOptExpCcyymmddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_SEARCH_OPT_EXP_CCYYMMDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01SearchOptExpCc = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01SearchOptExpYy = getStartOffset() + 2;	// set offset for serialization
  
             beginBdms01SearchOptExpMm = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01SearchOptExpDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01SearchOptExpCcCounter = -1;
     public boolean isBdms01SearchOptExpCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptExpCcCounter != sharedCounter;
         localBdms01SearchOptExpCcCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_EXP_CC_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchOptExpCc
	 */
   protected void serializeBdms01SearchOptExpCc(char[] bdms01SearchOptExpCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptExpCc,0,getStringValue(),beginBdms01SearchOptExpCc,BDMS_01_SEARCH_OPT_EXP_CC_LEN);
       localBdms01SearchOptExpCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptExpCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptExpCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptExpCc() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptExpCc,beginBdms01SearchOptExpCc + BDMS_01_SEARCH_OPT_EXP_CC_LEN));
   	}
     int localBdms01SearchOptExpYyCounter = -1;
     public boolean isBdms01SearchOptExpYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptExpYyCounter != sharedCounter;
         localBdms01SearchOptExpYyCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_EXP_YY_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchOptExpYy
	 */
   protected void serializeBdms01SearchOptExpYy(char[] bdms01SearchOptExpYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptExpYy,0,getStringValue(),beginBdms01SearchOptExpYy,BDMS_01_SEARCH_OPT_EXP_YY_LEN);
       localBdms01SearchOptExpYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptExpYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptExpYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptExpYy() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptExpYy,beginBdms01SearchOptExpYy + BDMS_01_SEARCH_OPT_EXP_YY_LEN));
   	}
     int localBdms01SearchOptExpMmCounter = -1;
     public boolean isBdms01SearchOptExpMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptExpMmCounter != sharedCounter;
         localBdms01SearchOptExpMmCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_EXP_MM_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchOptExpMm
	 */
   protected void serializeBdms01SearchOptExpMm(char[] bdms01SearchOptExpMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptExpMm,0,getStringValue(),beginBdms01SearchOptExpMm,BDMS_01_SEARCH_OPT_EXP_MM_LEN);
       localBdms01SearchOptExpMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptExpMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptExpMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptExpMm() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptExpMm,beginBdms01SearchOptExpMm + BDMS_01_SEARCH_OPT_EXP_MM_LEN));
   	}
     int localBdms01SearchOptExpDdCounter = -1;
     public boolean isBdms01SearchOptExpDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SearchOptExpDdCounter != sharedCounter;
         localBdms01SearchOptExpDdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEARCH_OPT_EXP_DD_LEN = 2;
	/**
	 * 	serialize this Bdms01SearchOptExpDd
	 */
   protected void serializeBdms01SearchOptExpDd(char[] bdms01SearchOptExpDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SearchOptExpDd,0,getStringValue(),beginBdms01SearchOptExpDd,BDMS_01_SEARCH_OPT_EXP_DD_LEN);
       localBdms01SearchOptExpDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SearchOptExpDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01SearchOptExpDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SearchOptExpDd() {	 
   		return (substring(getStringValue(),beginBdms01SearchOptExpDd,beginBdms01SearchOptExpDd + BDMS_01_SEARCH_OPT_EXP_DD_LEN));
   	}




}
  
