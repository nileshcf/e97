package com.cloudframe.app.inspct1.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSubEdt;
	
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
  
  
  
             beginSubEdt = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localSub1Counter = -1;
         public boolean isSub1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub1Counter != sharedCounter;
            localSub1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSub1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSub2Counter = -1;
         public boolean isSub2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub2Counter != sharedCounter;
            localSub2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSub2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSub3Counter = -1;
         public boolean isSub3Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub3Counter != sharedCounter;
            localSub3Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSub3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localSubEdtCounter = -1;
     public boolean isSubEdtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSubEdtCounter != sharedCounter;
         localSubEdtCounter = sharedCounter; return hasModified;
     }
	protected static final int SUB_EDT_LEN = 9;
	/**
	 * 	serialize this SubEdt
	 */
   protected void serializeSubEdt(char[] subEdt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(subEdt,0,getStringValue(),beginSubEdt,SUB_EDT_LEN);
       localSubEdtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSubEdtConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSubEdt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSubEdt() {	 
   		return (substring(getStringValue(),beginSubEdt,beginSubEdt + SUB_EDT_LEN));
   	}
     int localSearchPredicateCounter = -1;
     public boolean isSearchPredicateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSearchPredicateCounter != sharedCounter;
         localSearchPredicateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSearchPredicateConstraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
     int localSearchPredicate2Counter = -1;
     public boolean isSearchPredicate2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSearchPredicate2Counter != sharedCounter;
         localSearchPredicate2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSearchPredicate2Constraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
     int localConvrtPredicateCounter = -1;
     public boolean isConvrtPredicateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConvrtPredicateCounter != sharedCounter;
         localConvrtPredicateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkConvrtPredicateConstraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
     int localReplacPredicateCounter = -1;
     public boolean isReplacPredicateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReplacPredicateCounter != sharedCounter;
         localReplacPredicateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkReplacPredicateConstraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
     int localParmCounter = -1;
     public boolean isParmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmCounter != sharedCounter;
         localParmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkParmConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localCounterLineCounter = -1;
     public boolean isCounterLineModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCounterLineCounter != sharedCounter;
         localCounterLineCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCounterLineConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localXmlSegmentCounter = -1;
     public boolean isXmlSegmentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlSegmentCounter != sharedCounter;
         localXmlSegmentCounter = sharedCounter; return hasModified;
     }

   protected char[] checkXmlSegmentConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
         int localLtCountCounter = -1;
         public boolean isLtCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLtCountCounter != sharedCounter;
            localLtCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkLtCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localFloatPlusCountCounter = -1;
         public boolean isFloatPlusCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFloatPlusCountCounter != sharedCounter;
            localFloatPlusCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkFloatPlusCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localFloatMinusCountCounter = -1;
         public boolean isFloatMinusCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFloatMinusCountCounter != sharedCounter;
            localFloatMinusCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkFloatMinusCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localFloatDollarCountCounter = -1;
         public boolean isFloatDollarCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFloatDollarCountCounter != sharedCounter;
            localFloatDollarCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkFloatDollarCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localHtmlMLengthCounter = -1;
         public boolean isHtmlMLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHtmlMLengthCounter != sharedCounter;
            localHtmlMLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkHtmlMLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localLessthanCounter = -1;
     public boolean isLessthanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLessthanCounter != sharedCounter;
         localLessthanCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLessthanConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localGreaterthanCounter = -1;
     public boolean isGreaterthanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGreaterthanCounter != sharedCounter;
         localGreaterthanCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGreaterthanConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localAmpersandCounter = -1;
     public boolean isAmpersandModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmpersandCounter != sharedCounter;
         localAmpersandCounter = sharedCounter; return hasModified;
     }

   protected char[] checkAmpersandConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localApostropheCounter = -1;
     public boolean isApostropheModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApostropheCounter != sharedCounter;
         localApostropheCounter = sharedCounter; return hasModified;
     }

   protected char[] checkApostropheConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDoublquoteCounter = -1;
     public boolean isDoublquoteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDoublquoteCounter != sharedCounter;
         localDoublquoteCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDoublquoteConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }




}
  
