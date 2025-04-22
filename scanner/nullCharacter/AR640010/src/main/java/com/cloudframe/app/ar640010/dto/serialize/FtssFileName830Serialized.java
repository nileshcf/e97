package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class FtssFileName830Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FtssFileName830Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FtssFileName830Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FTSS_FILE_NAME_830_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFtssFileBulkId830;
            protected  int beginFtssFileEndptNo830;
            protected  int beginFtssFileJulDay830;
	
	/**
	* Constructor for FtssFileName830Serialized
	**/
    public FtssFileName830Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FtssFileName830Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FTSS_FILE_NAME_830_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFtssFileBulkId830 = getStartOffset() + 0;	// set offset for serialization
  
             beginFtssFileEndptNo830 = getStartOffset() + 4;	// set offset for serialization
  
             beginFtssFileJulDay830 = getStartOffset() + 9;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFtssFileBulkId830Counter = -1;
     public boolean isFtssFileBulkId830Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFtssFileBulkId830Counter != sharedCounter;
         localFtssFileBulkId830Counter = sharedCounter; return hasModified;
     }
	protected static final int FTSS_FILE_BULK_ID_830_LEN = 4;
	/**
	 * 	serialize this FtssFileBulkId830
	 */
   protected void serializeFtssFileBulkId830(char[] ftssFileBulkId830) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ftssFileBulkId830,0,getStringValue(),beginFtssFileBulkId830,FTSS_FILE_BULK_ID_830_LEN);
       localFtssFileBulkId830Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFtssFileBulkId830Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFtssFileBulkId830 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFtssFileBulkId830() {	 
   		return (substring(getStringValue(),beginFtssFileBulkId830,beginFtssFileBulkId830 + FTSS_FILE_BULK_ID_830_LEN));
   	}
     int localFtssFileEndptNo830Counter = -1;
     public boolean isFtssFileEndptNo830Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFtssFileEndptNo830Counter != sharedCounter;
         localFtssFileEndptNo830Counter = sharedCounter; return hasModified;
     }
	protected static final int FTSS_FILE_ENDPT_NO_830_LEN = 5;
	/**
	 * 	serialize this FtssFileEndptNo830
	 */
   protected void serializeFtssFileEndptNo830(char[] ftssFileEndptNo830) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ftssFileEndptNo830,0,getStringValue(),beginFtssFileEndptNo830,FTSS_FILE_ENDPT_NO_830_LEN);
       localFtssFileEndptNo830Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFtssFileEndptNo830Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFtssFileEndptNo830 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFtssFileEndptNo830() {	 
   		return (substring(getStringValue(),beginFtssFileEndptNo830,beginFtssFileEndptNo830 + FTSS_FILE_ENDPT_NO_830_LEN));
   	}
     int localFtssFileJulDay830Counter = -1;
     public boolean isFtssFileJulDay830Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFtssFileJulDay830Counter != sharedCounter;
         localFtssFileJulDay830Counter = sharedCounter; return hasModified;
     }
	protected static final int FTSS_FILE_JUL_DAY_830_LEN = 3;
	/**
	 * 	serialize this FtssFileJulDay830
	 */
   protected void serializeFtssFileJulDay830(char[] ftssFileJulDay830) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ftssFileJulDay830,0,getStringValue(),beginFtssFileJulDay830,FTSS_FILE_JUL_DAY_830_LEN);
       localFtssFileJulDay830Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFtssFileJulDay830Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFtssFileJulDay830 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFtssFileJulDay830() {	 
   		return (substring(getStringValue(),beginFtssFileJulDay830,beginFtssFileJulDay830 + FTSS_FILE_JUL_DAY_830_LEN));
   	}




}
  
