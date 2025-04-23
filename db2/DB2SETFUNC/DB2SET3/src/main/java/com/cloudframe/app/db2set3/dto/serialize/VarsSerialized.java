package com.cloudframe.app.db2set3.dto.serialize;

/**
*  The class VarsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class VarsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(VarsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VARS_LENGTH = 270;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFirstDayMnth;
            protected  int beginInputDate;
            protected  int beginEffEndDateCalc;
            protected  int beginEffEndDateBuild;
            protected  int beginLastDate;
	
	/**
	* Constructor for VarsSerialized
	**/
    public VarsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in VarsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VARS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFirstDayMnth = getStartOffset() + 220;	// set offset for serialization
  
             beginInputDate = getStartOffset() + 230;	// set offset for serialization
  
             beginEffEndDateCalc = getStartOffset() + 240;	// set offset for serialization
  
             beginEffEndDateBuild = getStartOffset() + 250;	// set offset for serialization
  
             beginLastDate = getStartOffset() + 260;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFirstDayMnthCounter = -1;
     public boolean isFirstDayMnthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstDayMnthCounter != sharedCounter;
         localFirstDayMnthCounter = sharedCounter; return hasModified;
     }
	protected static final int FIRST_DAY_MNTH_LEN = 10;
	/**
	 * 	serialize this FirstDayMnth
	 */
   protected void serializeFirstDayMnth(char[] firstDayMnth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(firstDayMnth,0,getStringValue(),beginFirstDayMnth,FIRST_DAY_MNTH_LEN);
       localFirstDayMnthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFirstDayMnthConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFirstDayMnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFirstDayMnth() {	 
   		return (substring(getStringValue(),beginFirstDayMnth,beginFirstDayMnth + FIRST_DAY_MNTH_LEN));
   	}
     int localInputDateCounter = -1;
     public boolean isInputDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputDateCounter != sharedCounter;
         localInputDateCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_DATE_LEN = 10;
	/**
	 * 	serialize this InputDate
	 */
   protected void serializeInputDate(char[] inputDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputDate,0,getStringValue(),beginInputDate,INPUT_DATE_LEN);
       localInputDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshInputDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputDate() {	 
   		return (substring(getStringValue(),beginInputDate,beginInputDate + INPUT_DATE_LEN));
   	}
     int localEffEndDateCalcCounter = -1;
     public boolean isEffEndDateCalcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEffEndDateCalcCounter != sharedCounter;
         localEffEndDateCalcCounter = sharedCounter; return hasModified;
     }
	protected static final int EFF_END_DATE_CALC_LEN = 10;
	/**
	 * 	serialize this EffEndDateCalc
	 */
   protected void serializeEffEndDateCalc(char[] effEndDateCalc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(effEndDateCalc,0,getStringValue(),beginEffEndDateCalc,EFF_END_DATE_CALC_LEN);
       localEffEndDateCalcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEffEndDateCalcConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshEffEndDateCalc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEffEndDateCalc() {	 
   		return (substring(getStringValue(),beginEffEndDateCalc,beginEffEndDateCalc + EFF_END_DATE_CALC_LEN));
   	}
     int localEffEndDateBuildCounter = -1;
     public boolean isEffEndDateBuildModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEffEndDateBuildCounter != sharedCounter;
         localEffEndDateBuildCounter = sharedCounter; return hasModified;
     }
	protected static final int EFF_END_DATE_BUILD_LEN = 10;
	/**
	 * 	serialize this EffEndDateBuild
	 */
   protected void serializeEffEndDateBuild(char[] effEndDateBuild) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(effEndDateBuild,0,getStringValue(),beginEffEndDateBuild,EFF_END_DATE_BUILD_LEN);
       localEffEndDateBuildCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEffEndDateBuildConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshEffEndDateBuild is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEffEndDateBuild() {	 
   		return (substring(getStringValue(),beginEffEndDateBuild,beginEffEndDateBuild + EFF_END_DATE_BUILD_LEN));
   	}
     int localLastDateCounter = -1;
     public boolean isLastDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastDateCounter != sharedCounter;
         localLastDateCounter = sharedCounter; return hasModified;
     }
	protected static final int LAST_DATE_LEN = 10;
	/**
	 * 	serialize this LastDate
	 */
   protected void serializeLastDate(char[] lastDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lastDate,0,getStringValue(),beginLastDate,LAST_DATE_LEN);
       localLastDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLastDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLastDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLastDate() {	 
   		return (substring(getStringValue(),beginLastDate,beginLastDate + LAST_DATE_LEN));
   	}




}
  
