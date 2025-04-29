package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DtPage2Ln4aSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtPage2Ln4aSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtPage2Ln4aSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_PAGE_2_LN_4A_LENGTH = 137;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt24aCc;
            protected  int beginDt24aNsdDbNbr;
            protected  int beginDt24aNsdCrNbr;
	
	/**
	* Constructor for DtPage2Ln4aSerialized
	**/
    public DtPage2Ln4aSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtPage2Ln4aSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_PAGE_2_LN_4A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt24aCc = getStartOffset() + 0;	// set offset for serialization
  
  
  
             beginDt24aNsdDbNbr = getStartOffset() + 31;	// set offset for serialization
  
  
             beginDt24aNsdCrNbr = getStartOffset() + 70;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDt24aCcCounter = -1;
     public boolean isDt24aCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24aCcCounter != sharedCounter;
         localDt24aCcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24A_CC_LEN = 1;
	/**
	 * 	serialize this Dt24aCc
	 */
   protected void serializeDt24aCc(char[] dt24aCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24aCc,0,getStringValue(),beginDt24aCc,DT_24A_CC_LEN);
       localDt24aCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24aCcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt24aCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24aCc() {	 
   		return (substring(getStringValue(),beginDt24aCc,beginDt24aCc + DT_24A_CC_LEN));
   	}
     int localDt24aNsdDbNbrCounter = -1;
     public boolean isDt24aNsdDbNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24aNsdDbNbrCounter != sharedCounter;
         localDt24aNsdDbNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24A_NSD_DB_NBR_LEN = 12;
	/**
	 * 	serialize this Dt24aNsdDbNbr
	 */
   protected void serializeDt24aNsdDbNbr(char[] dt24aNsdDbNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24aNsdDbNbr,0,getStringValue(),beginDt24aNsdDbNbr,DT_24A_NSD_DB_NBR_LEN);
       localDt24aNsdDbNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24aNsdDbNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDt24aNsdDbNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24aNsdDbNbr() {	 
   		return (substring(getStringValue(),beginDt24aNsdDbNbr,beginDt24aNsdDbNbr + DT_24A_NSD_DB_NBR_LEN));
   	}
     int localDt24aNsdCrNbrCounter = -1;
     public boolean isDt24aNsdCrNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt24aNsdCrNbrCounter != sharedCounter;
         localDt24aNsdCrNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_24A_NSD_CR_NBR_LEN = 12;
	/**
	 * 	serialize this Dt24aNsdCrNbr
	 */
   protected void serializeDt24aNsdCrNbr(char[] dt24aNsdCrNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt24aNsdCrNbr,0,getStringValue(),beginDt24aNsdCrNbr,DT_24A_NSD_CR_NBR_LEN);
       localDt24aNsdCrNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt24aNsdCrNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDt24aNsdCrNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt24aNsdCrNbr() {	 
   		return (substring(getStringValue(),beginDt24aNsdCrNbr,beginDt24aNsdCrNbr + DT_24A_NSD_CR_NBR_LEN));
   	}




}
  
