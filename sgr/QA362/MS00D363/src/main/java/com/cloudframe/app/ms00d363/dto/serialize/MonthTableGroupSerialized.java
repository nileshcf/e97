package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class MonthTableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonthTableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonthTableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONTH_TABLE_GROUP_LENGTH = 444;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMonthTable;
	
	/**
	* Constructor for MonthTableGroupSerialized
	**/
    public MonthTableGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MonthTableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONTH_TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMonthTable = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMonthTableCounter = -1;
     public boolean isMonthTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthTableCounter != sharedCounter;
         localMonthTableCounter = sharedCounter; return hasModified;
     }
	protected static final int MONTH_TABLE_LEN = 444;
	/**
	 * 	serialize this MonthTable
	 */
   protected void serializeMonthTable(char[] monthTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(monthTable,0,getStringValue(),beginMonthTable,MONTH_TABLE_LEN);
       localMonthTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonthTableConstraints(char[] value) {
   			return super.checkConstraints(value , 444 ,false, false);
   }
    /**
	 *	refreshMonthTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonthTable() {	 
   		return (substring(getStringValue(),beginMonthTable,beginMonthTable + MONTH_TABLE_LEN));
   	}




}
  
