package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HdPage1Ln4Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPage1Ln4Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPage1Ln4Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PAGE_1_LN_4_LENGTH = 104;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd14Cc;
            protected  int beginHd14InstId;
            protected  int beginHd14InstDesc;
            protected  int beginHd14BinNumber;
            protected  int beginHd14BinId;
	
	/**
	* Constructor for HdPage1Ln4Serialized
	**/
    public HdPage1Ln4Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HdPage1Ln4Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PAGE_1_LN_4_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd14Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
             beginHd14InstId = getStartOffset() + 23;	// set offset for serialization
  
  
             beginHd14InstDesc = getStartOffset() + 34;	// set offset for serialization
  
  
             beginHd14BinNumber = getStartOffset() + 62;	// set offset for serialization
  
  
             beginHd14BinId = getStartOffset() + 75;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localHd14CcCounter = -1;
     public boolean isHd14CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd14CcCounter != sharedCounter;
         localHd14CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_14_CC_LEN = 1;
	/**
	 * 	serialize this Hd14Cc
	 */
   protected void serializeHd14Cc(char[] hd14Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd14Cc,0,getStringValue(),beginHd14Cc,HD_14_CC_LEN);
       localHd14CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd14CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd14Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd14Cc() {	 
   		return (substring(getStringValue(),beginHd14Cc,beginHd14Cc + HD_14_CC_LEN));
   	}
     int localHd14InstIdCounter = -1;
     public boolean isHd14InstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd14InstIdCounter != sharedCounter;
         localHd14InstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_14_INST_ID_LEN = 10;
	/**
	 * 	serialize this Hd14InstId
	 */
   protected void serializeHd14InstId(char[] hd14InstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd14InstId,0,getStringValue(),beginHd14InstId,HD_14_INST_ID_LEN);
       localHd14InstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd14InstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHd14InstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd14InstId() {	 
   		return (substring(getStringValue(),beginHd14InstId,beginHd14InstId + HD_14_INST_ID_LEN));
   	}
     int localHd14InstDescCounter = -1;
     public boolean isHd14InstDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd14InstDescCounter != sharedCounter;
         localHd14InstDescCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_14_INST_DESC_LEN = 25;
	/**
	 * 	serialize this Hd14InstDesc
	 */
   protected void serializeHd14InstDesc(char[] hd14InstDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd14InstDesc,0,getStringValue(),beginHd14InstDesc,HD_14_INST_DESC_LEN);
       localHd14InstDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd14InstDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshHd14InstDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd14InstDesc() {	 
   		return (substring(getStringValue(),beginHd14InstDesc,beginHd14InstDesc + HD_14_INST_DESC_LEN));
   	}
     int localHd14BinNumberCounter = -1;
     public boolean isHd14BinNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd14BinNumberCounter != sharedCounter;
         localHd14BinNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_14_BIN_NUMBER_LEN = 12;
	/**
	 * 	serialize this Hd14BinNumber
	 */
   protected void serializeHd14BinNumber(char[] hd14BinNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd14BinNumber,0,getStringValue(),beginHd14BinNumber,HD_14_BIN_NUMBER_LEN);
       localHd14BinNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd14BinNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshHd14BinNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd14BinNumber() {	 
   		return (substring(getStringValue(),beginHd14BinNumber,beginHd14BinNumber + HD_14_BIN_NUMBER_LEN));
   	}
     int localHd14BinIdCounter = -1;
     public boolean isHd14BinIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd14BinIdCounter != sharedCounter;
         localHd14BinIdCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_14_BIN_ID_LEN = 11;
	/**
	 * 	serialize this Hd14BinId
	 */
   protected void serializeHd14BinId(char[] hd14BinId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd14BinId,0,getStringValue(),beginHd14BinId,HD_14_BIN_ID_LEN);
       localHd14BinIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd14BinIdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshHd14BinId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd14BinId() {	 
   		return (substring(getStringValue(),beginHd14BinId,beginHd14BinId + HD_14_BIN_ID_LEN));
   	}




}
  
