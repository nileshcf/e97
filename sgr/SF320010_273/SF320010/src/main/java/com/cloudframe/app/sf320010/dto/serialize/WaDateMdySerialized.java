package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class WaDateMdySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WaDateMdySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WaDateMdySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WA_DATE_MDY_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWaDateMn;
            protected  int beginWaDateDy;
            protected  int beginWaDateYr;
	
	/**
	* Constructor for WaDateMdySerialized
	**/
    public WaDateMdySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WaDateMdySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WA_DATE_MDY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWaDateMn = getStartOffset() + 0;	// set offset for serialization
  
             beginWaDateDy = getStartOffset() + 2;	// set offset for serialization
  
             beginWaDateYr = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWaDateMnCounter = -1;
     public boolean isWaDateMnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateMnCounter != sharedCounter;
         localWaDateMnCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_MN_LEN = 2;
	/**
	 * 	serialize this WaDateMn
	 */
   protected void serializeWaDateMn(char[] waDateMn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateMn,0,getStringValue(),beginWaDateMn,WA_DATE_MN_LEN);
       localWaDateMnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateMnConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateMn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateMn() {	 
   		return (substring(getStringValue(),beginWaDateMn,beginWaDateMn + WA_DATE_MN_LEN));
   	}
     int localWaDateDyCounter = -1;
     public boolean isWaDateDyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateDyCounter != sharedCounter;
         localWaDateDyCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_DY_LEN = 2;
	/**
	 * 	serialize this WaDateDy
	 */
   protected void serializeWaDateDy(char[] waDateDy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateDy,0,getStringValue(),beginWaDateDy,WA_DATE_DY_LEN);
       localWaDateDyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateDyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateDy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateDy() {	 
   		return (substring(getStringValue(),beginWaDateDy,beginWaDateDy + WA_DATE_DY_LEN));
   	}
     int localWaDateYrCounter = -1;
     public boolean isWaDateYrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWaDateYrCounter != sharedCounter;
         localWaDateYrCounter = sharedCounter; return hasModified;
     }
	protected static final int WA_DATE_YR_LEN = 2;
	/**
	 * 	serialize this WaDateYr
	 */
   protected void serializeWaDateYr(char[] waDateYr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(waDateYr,0,getStringValue(),beginWaDateYr,WA_DATE_YR_LEN);
       localWaDateYrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWaDateYrConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWaDateYr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWaDateYr() {	 
   		return (substring(getStringValue(),beginWaDateYr,beginWaDateYr + WA_DATE_YR_LEN));
   	}




}
  
