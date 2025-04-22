package com.cloudframe.app.cfrt02a.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTheNumber;
            protected  int beginInx;
	
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
  
  
             beginTheNumber = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginInx = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTheMessageCounter = -1;
     public boolean isTheMessageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTheMessageCounter != sharedCounter;
         localTheMessageCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTheMessageConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localTheDisplayCounter = -1;
     public boolean isTheDisplayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTheDisplayCounter != sharedCounter;
         localTheDisplayCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTheDisplayConstraints(char[] value) {
   			return super.checkConstraints(value , 605 ,false, false);
   }
     int localTheNumberCounter = -1;
     public boolean isTheNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTheNumberCounter != sharedCounter;
         localTheNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of theNumber
	 *	@return theNumber
	 */
	public char[]  getTheNumberString() {
	     return getCharArray(beginTheNumber,THE_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theNumberIsNumeric() {
	    return isNumeric(beginTheNumber
	                    ,beginTheNumber + THE_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int THE_NUMBER_LEN = 2;
  	/**
	 * serializeTheNumber
	 */
	protected void serializeTheNumber(int theNumber) {
		 putNumber(beginTheNumber,theNumber,THE_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTheNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTheNumber
	 */
   	protected  int serializeTheNumber(char[] value) {
	    int  theNumber;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    theNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginTheNumber
		       ,2
		      );
		 localTheNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  theNumber;
    }

   protected int checkTheNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTheNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTheNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTheNumber
			                 ,THE_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("theNumber", beginTheNumber,THE_NUMBER_LEN);
    }
   	}
     int localASpaceCounter = -1;
     public boolean isASpaceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASpaceCounter != sharedCounter;
         localASpaceCounter = sharedCounter; return hasModified;
     }

   protected char[] checkASpaceConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localStageCounter = -1;
     public boolean isStageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStageCounter != sharedCounter;
         localStageCounter = sharedCounter; return hasModified;
     }

   protected char[] checkStageConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
         int localStartCounter = -1;
         public boolean isStartModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStartCounter != sharedCounter;
            localStartCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkStartMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localSubCounter = -1;
         public boolean isSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSubCounter != sharedCounter;
            localSubCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkSubMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localInxCounter = -1;
     public boolean isInxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInxCounter != sharedCounter;
         localInxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inx
	 *	@return inx
	 */
	public char[]  getInxString() {
	     return getCharArray(beginInx,INX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inxIsNumeric() {
	    return isNumeric(beginInx
	                    ,beginInx + INX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INX_LEN = 1;
  	/**
	 * serializeInx
	 */
	protected void serializeInx(int inx) {
		 putNumber(beginInx,inx,INX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInx
	 */
   	protected  int serializeInx(char[] value) {
	    int  inx;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginInx
		       ,1
		      );
		 localInxCounter = shareString.getSerializedField().getModifiedCounter();
		return  inx;
    }

   protected int checkInxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInx
			                 ,INX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inx", beginInx,INX_LEN);
    }
   	}




}
  
