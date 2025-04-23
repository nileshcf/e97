package com.cloudframe.app.evaluat1.dto.serialize;

/**
*  The class MonthsGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MonthsGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MonthsGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MONTHS_GRP_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMonths;
           protected int beginMonthsR;
           protected static final int MONTHS_R_SIZE = 12;
	
	/**
	* Constructor for MonthsGrpSerialized
	**/
    public MonthsGrpSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MonthsGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MONTHS_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMonths = getStartOffset() + 0;	// set offset for serialization
  
	        beginMonthsR = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
     int localMonthsCounter = -1;
     public boolean isMonthsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthsCounter != sharedCounter;
         localMonthsCounter = sharedCounter; return hasModified;
     }
	protected static final int MONTHS_LEN = 36;
	/**
	 * 	serialize this Months
	 */
   protected void serializeMonths(char[] months) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(months,0,getStringValue(),beginMonths,MONTHS_LEN);
       localMonthsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMonthsConstraints(char[] value) {
   			return super.checkConstraints(value , 36 ,false, false);
   }
    /**
	 *	refreshMonths is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMonths() {	 
   		return (substring(getStringValue(),beginMonths,beginMonths + MONTHS_LEN));
   	}
 
   
  protected  static final int MONTHS_R_LEN = 3;
   /**
	 *	serializeMonthsR as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeMonthsR(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginMonthsR + index*MONTHS_R_LEN)
   	          , MONTHS_R_LEN 
   	          );
   }

		public int monthsRSize() {
			return MONTHS_R_SIZE;
		}



}
  
