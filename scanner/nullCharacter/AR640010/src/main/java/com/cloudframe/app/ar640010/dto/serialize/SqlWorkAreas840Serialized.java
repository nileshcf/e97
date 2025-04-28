package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SqlWorkAreas840Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlWorkAreas840Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlWorkAreas840Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_WORK_AREAS_840_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrentTs840;
            protected  int beginFilesAvail840;
            protected  int beginOldStatCd840;
            protected  int beginOldLstUpdtTs840;
	
	/**
	* Constructor for SqlWorkAreas840Serialized
	**/
    public SqlWorkAreas840Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SqlWorkAreas840Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_WORK_AREAS_840_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrentTs840 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginFilesAvail840 = getStartOffset() + 26;	// set offset for serialization
  
             beginOldStatCd840 = getStartOffset() + 30;	// set offset for serialization
  
             beginOldLstUpdtTs840 = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrentTs840Counter = -1;
     public boolean isCurrentTs840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentTs840Counter != sharedCounter;
         localCurrentTs840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_TS_840_LEN = 26;
	/**
	 * 	serialize this CurrentTs840
	 */
   protected void serializeCurrentTs840(char[] currentTs840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentTs840,0,getStringValue(),beginCurrentTs840,CURRENT_TS_840_LEN);
       localCurrentTs840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentTs840Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCurrentTs840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentTs840() {	 
   		return (substring(getStringValue(),beginCurrentTs840,beginCurrentTs840 + CURRENT_TS_840_LEN));
   	}
         int localFilesAvail840Counter = -1;
         public boolean isFilesAvail840Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFilesAvail840Counter != sharedCounter;
            localFilesAvail840Counter = sharedCounter; return hasModified; 
         }
   protected static final int FILES_AVAIL_840_LEN = 4;
  	/**
	 * serializeFilesAvail840
	 */
	protected void serializeFilesAvail840(int filesAvail840) {
           replaceValue( //  save the value as string
                   getBinaryString( filesAvail840,FILES_AVAIL_840_LEN)
                  ,beginFilesAvail840
                  ,FILES_AVAIL_840_LEN
                 );
            localFilesAvail840Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFilesAvail840MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFilesAvail840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFilesAvail840() {	 
			return (getInt(beginFilesAvail840));
   	}
     int localOldStatCd840Counter = -1;
     public boolean isOldStatCd840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldStatCd840Counter != sharedCounter;
         localOldStatCd840Counter = sharedCounter; return hasModified;
     }
	protected static final int OLD_STAT_CD_840_LEN = 1;
	/**
	 * 	serialize this OldStatCd840
	 */
   protected void serializeOldStatCd840(char[] oldStatCd840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldStatCd840,0,getStringValue(),beginOldStatCd840,OLD_STAT_CD_840_LEN);
       localOldStatCd840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldStatCd840Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOldStatCd840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldStatCd840() {	 
   		return (substring(getStringValue(),beginOldStatCd840,beginOldStatCd840 + OLD_STAT_CD_840_LEN));
   	}
     int localOldLstUpdtTs840Counter = -1;
     public boolean isOldLstUpdtTs840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOldLstUpdtTs840Counter != sharedCounter;
         localOldLstUpdtTs840Counter = sharedCounter; return hasModified;
     }
	protected static final int OLD_LST_UPDT_TS_840_LEN = 26;
	/**
	 * 	serialize this OldLstUpdtTs840
	 */
   protected void serializeOldLstUpdtTs840(char[] oldLstUpdtTs840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oldLstUpdtTs840,0,getStringValue(),beginOldLstUpdtTs840,OLD_LST_UPDT_TS_840_LEN);
       localOldLstUpdtTs840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOldLstUpdtTs840Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshOldLstUpdtTs840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOldLstUpdtTs840() {	 
   		return (substring(getStringValue(),beginOldLstUpdtTs840,beginOldLstUpdtTs840 + OLD_LST_UPDT_TS_840_LEN));
   	}




}
  
