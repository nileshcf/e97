package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class DetailLine362Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DetailLine362Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DetailLine362Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_LINE_362_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDetailReportId362;
            protected  int beginDetailCarCon362;
            protected  int beginDetailLogType362;
            protected  int beginDetailLogClass362;
            protected  int beginDetailRecordTotal362;
	
	/**
	* Constructor for DetailLine362Serialized
	**/
    public DetailLine362Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DetailLine362Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_LINE_362_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDetailReportId362 = getStartOffset() + 0;	// set offset for serialization
  
             beginDetailCarCon362 = getStartOffset() + 1;	// set offset for serialization
  
  
             beginDetailLogType362 = getStartOffset() + 10;	// set offset for serialization
  
             beginDetailLogClass362 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginDetailRecordTotal362 = getStartOffset() + 47;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDetailReportId362Counter = -1;
     public boolean isDetailReportId362Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetailReportId362Counter != sharedCounter;
         localDetailReportId362Counter = sharedCounter; return hasModified;
     }
	protected static final int DETAIL_REPORT_ID_362_LEN = 1;
	/**
	 * 	serialize this DetailReportId362
	 */
   protected void serializeDetailReportId362(char[] detailReportId362) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detailReportId362,0,getStringValue(),beginDetailReportId362,DETAIL_REPORT_ID_362_LEN);
       localDetailReportId362Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetailReportId362Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDetailReportId362 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetailReportId362() {	 
   		return (substring(getStringValue(),beginDetailReportId362,beginDetailReportId362 + DETAIL_REPORT_ID_362_LEN));
   	}
     int localDetailCarCon362Counter = -1;
     public boolean isDetailCarCon362Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetailCarCon362Counter != sharedCounter;
         localDetailCarCon362Counter = sharedCounter; return hasModified;
     }
	protected static final int DETAIL_CAR_CON_362_LEN = 1;
	/**
	 * 	serialize this DetailCarCon362
	 */
   protected void serializeDetailCarCon362(char[] detailCarCon362) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detailCarCon362,0,getStringValue(),beginDetailCarCon362,DETAIL_CAR_CON_362_LEN);
       localDetailCarCon362Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetailCarCon362Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDetailCarCon362 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetailCarCon362() {	 
   		return (substring(getStringValue(),beginDetailCarCon362,beginDetailCarCon362 + DETAIL_CAR_CON_362_LEN));
   	}
     int localDetailLogType362Counter = -1;
     public boolean isDetailLogType362Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetailLogType362Counter != sharedCounter;
         localDetailLogType362Counter = sharedCounter; return hasModified;
     }
	protected static final int DETAIL_LOG_TYPE_362_LEN = 27;
	/**
	 * 	serialize this DetailLogType362
	 */
   protected void serializeDetailLogType362(char[] detailLogType362) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detailLogType362,0,getStringValue(),beginDetailLogType362,DETAIL_LOG_TYPE_362_LEN);
       localDetailLogType362Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetailLogType362Constraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
    /**
	 *	refreshDetailLogType362 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetailLogType362() {	 
   		return (substring(getStringValue(),beginDetailLogType362,beginDetailLogType362 + DETAIL_LOG_TYPE_362_LEN));
   	}
     int localDetailLogClass362Counter = -1;
     public boolean isDetailLogClass362Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetailLogClass362Counter != sharedCounter;
         localDetailLogClass362Counter = sharedCounter; return hasModified;
     }
	protected static final int DETAIL_LOG_CLASS_362_LEN = 1;
	/**
	 * 	serialize this DetailLogClass362
	 */
   protected void serializeDetailLogClass362(char[] detailLogClass362) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detailLogClass362,0,getStringValue(),beginDetailLogClass362,DETAIL_LOG_CLASS_362_LEN);
       localDetailLogClass362Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetailLogClass362Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDetailLogClass362 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetailLogClass362() {	 
   		return (substring(getStringValue(),beginDetailLogClass362,beginDetailLogClass362 + DETAIL_LOG_CLASS_362_LEN));
   	}
     int localDetailRecordTotal362Counter = -1;
     public boolean isDetailRecordTotal362Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetailRecordTotal362Counter != sharedCounter;
         localDetailRecordTotal362Counter = sharedCounter; return hasModified;
     }
	protected static final int DETAIL_RECORD_TOTAL_362_LEN = 11;
	/**
	 * 	serialize this DetailRecordTotal362
	 */
   protected void serializeDetailRecordTotal362(char[] detailRecordTotal362) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detailRecordTotal362,0,getStringValue(),beginDetailRecordTotal362,DETAIL_RECORD_TOTAL_362_LEN);
       localDetailRecordTotal362Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetailRecordTotal362Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDetailRecordTotal362 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetailRecordTotal362() {	 
   		return (substring(getStringValue(),beginDetailRecordTotal362,beginDetailRecordTotal362 + DETAIL_RECORD_TOTAL_362_LEN));
   	}




}
  
