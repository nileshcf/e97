package com.cloudframe.app.uhdynsql.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcodeDisp;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSqlcodeDisp = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localWfWidgetsFlagCounter = -1;
     public boolean isWfWidgetsFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWfWidgetsFlagCounter != sharedCounter;
         localWfWidgetsFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWfWidgetsFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSqlcodeDispCounter = -1;
     public boolean isSqlcodeDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcodeDispCounter != sharedCounter;
         localSqlcodeDispCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE_DISP_LEN = 4;
	/**
	 * 	serialize this SqlcodeDisp
	 */
   protected void serializeSqlcodeDisp(char[] sqlcodeDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcodeDisp,0,getStringValue(),beginSqlcodeDisp,SQLCODE_DISP_LEN);
       localSqlcodeDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcodeDispConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcodeDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcodeDisp() {	 
   		return (substring(getStringValue(),beginSqlcodeDisp,beginSqlcodeDisp + SQLCODE_DISP_LEN));
   	}
     int localWqSqlColorPredCounter = -1;
     public boolean isWqSqlColorPredModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlColorPredCounter != sharedCounter;
         localWqSqlColorPredCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWqSqlColorPredConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localWqSqlSupplierPredCounter = -1;
     public boolean isWqSqlSupplierPredModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlSupplierPredCounter != sharedCounter;
         localWqSqlSupplierPredCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWqSqlSupplierPredConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localWqSqlSelectClauseCounter = -1;
     public boolean isWqSqlSelectClauseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlSelectClauseCounter != sharedCounter;
         localWqSqlSelectClauseCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWqSqlSelectClauseConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
     int localWqSqlFromClauseCounter = -1;
     public boolean isWqSqlFromClauseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlFromClauseCounter != sharedCounter;
         localWqSqlFromClauseCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWqSqlFromClauseConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localWqSqlPredicateClauseCounter = -1;
     public boolean isWqSqlPredicateClauseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlPredicateClauseCounter != sharedCounter;
         localWqSqlPredicateClauseCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWqSqlPredicateClauseConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
     int localWqSqlOrderByClauseCounter = -1;
     public boolean isWqSqlOrderByClauseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWqSqlOrderByClauseCounter != sharedCounter;
         localWqSqlOrderByClauseCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWqSqlOrderByClauseConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }




}
  
