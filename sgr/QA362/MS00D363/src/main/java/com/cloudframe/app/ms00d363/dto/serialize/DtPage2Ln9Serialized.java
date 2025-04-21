package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_9_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt29Cc;
            protected  int beginDt29SurchgNbr;
	
	/**
	* Constructor for DtPage2Ln9Serialized
	**/
    public DtPage2Ln9Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt29Cc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt29SurchgNbr = getStartOffset() + 28;	// set offset for serialization
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localDt29CcCounter = -1;
     public boolean isDt29CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt29CcCounter != sharedCounter;
         localDt29CcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_29_CC_LEN = 1;
	/**
	 * 	serialize this Dt29Cc
	 */
   protected void serializeDt29Cc(char[] dt29Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt29Cc,0,getStringValue(),beginDt29Cc,DT_29_CC_LEN);
       localDt29CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt29CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt29Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt29Cc() {	 
   		return (substring(getStringValue(),beginDt29Cc,beginDt29Cc + DT_29_CC_LEN));
   	}
     int localDt29SurchgNbrCounter = -1;
     public boolean isDt29SurchgNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt29SurchgNbrCounter != sharedCounter;
         localDt29SurchgNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_29_SURCHG_NBR_LEN = 15;
	/**
	 * 	serialize this Dt29SurchgNbr
	 */
   protected void serializeDt29SurchgNbr(char[] dt29SurchgNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt29SurchgNbr,0,getStringValue(),beginDt29SurchgNbr,DT_29_SURCHG_NBR_LEN);
       localDt29SurchgNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt29SurchgNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDt29SurchgNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt29SurchgNbr() {	 
   		return (substring(getStringValue(),beginDt29SurchgNbr,beginDt29SurchgNbr + DT_29_SURCHG_NBR_LEN));
   	}




}
  
