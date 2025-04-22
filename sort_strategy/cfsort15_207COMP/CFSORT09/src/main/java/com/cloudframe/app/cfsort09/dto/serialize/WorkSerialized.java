package com.cloudframe.app.cfsort09.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDispI;
            protected  int beginDispJ;
	
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
  
  
             beginDispI = getStartOffset() + 0;	// set offset for serialization
  
             beginDispJ = getStartOffset() + 19;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkIMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localJCounter = -1;
         public boolean isJModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localJCounter != sharedCounter;
            localJCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkJMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDispICounter = -1;
     public boolean isDispIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDispICounter != sharedCounter;
         localDispICounter = sharedCounter; return hasModified;
     }
	protected static final int DISP_I_LEN = 19;
	/**
	 * 	serialize this DispI
	 */
   protected void serializeDispI(char[] dispI) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dispI,0,getStringValue(),beginDispI,DISP_I_LEN);
       localDispICounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDispIConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshDispI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDispI() {	 
   		return (substring(getStringValue(),beginDispI,beginDispI + DISP_I_LEN));
   	}
     int localDispJCounter = -1;
     public boolean isDispJModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDispJCounter != sharedCounter;
         localDispJCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dispJ
	 *	@return dispJ
	 */
	public char[]  getDispJString() {
	     return getCharArray(beginDispJ,DISP_J_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispJIsNumeric() {
	    return isNumeric(beginDispJ
	                    ,beginDispJ + DISP_J_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DISP_J_LEN = 18;
  	/**
	 * serializeDispJ
	 */
	protected void serializeDispJ(long dispJ) {
		 putNumber(beginDispJ,dispJ,DISP_J_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDispJCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDispJ
	 */
   	protected  long serializeDispJ(char[] value) {
	    long  dispJ;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dispJ = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginDispJ
		       ,18
		      );
		 localDispJCounter = shareString.getSerializedField().getModifiedCounter();
		return  dispJ;
    }

   protected long checkDispJMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDispJ is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDispJ() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDispJ
			                 ,DISP_J_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dispJ", beginDispJ,DISP_J_LEN);
    }
   	}
     int localDisplayFileStatusCounter = -1;
     public boolean isDisplayFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayFileStatusCounter != sharedCounter;
         localDisplayFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDisplayFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }




}
  
