package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginValEdit400;
            protected  int beginVal1400;
            protected  int beginVal2400;
	
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
  
  
  
             beginValEdit400 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginVal1400 = getStartOffset() + 11;	// set offset for serialization
  
             beginVal2400 = getStartOffset() + 14;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp00485MemberEntriesCounter = -1;
         public boolean isIp00485MemberEntriesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00485MemberEntriesCounter != sharedCounter;
            localIp00485MemberEntriesCounter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkIp00485MemberEntriesMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localZeroVal300Counter = -1;
         public boolean isZeroVal300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localZeroVal300Counter != sharedCounter;
            localZeroVal300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkZeroVal300MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localMinusoneVal300Counter = -1;
         public boolean isMinusoneVal300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMinusoneVal300Counter != sharedCounter;
            localMinusoneVal300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMinusoneVal300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localValEdit400Counter = -1;
     public boolean isValEdit400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValEdit400Counter != sharedCounter;
         localValEdit400Counter = sharedCounter; return hasModified;
     }
	protected static final int VAL_EDIT_400_LEN = 11;
	/**
	 * 	serialize this ValEdit400
	 */
   protected void serializeValEdit400(char[] valEdit400) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(valEdit400,0,getStringValue(),beginValEdit400,VAL_EDIT_400_LEN);
       localValEdit400Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkValEdit400Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshValEdit400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshValEdit400() {	 
   		return (substring(getStringValue(),beginValEdit400,beginValEdit400 + VAL_EDIT_400_LEN));
   	}
         int localVal400Counter = -1;
         public boolean isVal400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVal400Counter != sharedCounter;
            localVal400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkVal400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localVal1400Counter = -1;
     public boolean isVal1400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVal1400Counter != sharedCounter;
         localVal1400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of val1400
	 *	@return val1400
	 */
	public char[]  getVal1400String() {
	     return getCharArray(beginVal1400,VAL_1400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean val1400IsNumeric() {
	    return isNumeric(beginVal1400
	                    ,beginVal1400 + VAL_1400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VAL_1400_LEN = 3;
  	/**
	 * serializeVal1400
	 */
	protected void serializeVal1400(int val1400) {
		 putNumber(beginVal1400,val1400,VAL_1400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localVal1400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeVal1400
	 */
   	protected  int serializeVal1400(char[] value) {
	    int  val1400;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    val1400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginVal1400
		       ,3
		      );
		 localVal1400Counter = shareString.getSerializedField().getModifiedCounter();
		return  val1400;
    }

   protected int checkVal1400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshVal1400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshVal1400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginVal1400
			                 ,VAL_1400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("val1400", beginVal1400,VAL_1400_LEN);
    }
   	}
        int localVal2400Counter = -1;
        public boolean isVal2400Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localVal2400Counter != sharedCounter;
           localVal2400Counter = sharedCounter; return hasModified; 
        }
	    public boolean val2400IsNumeric() {
	      return decimalIsNumeric(beginVal2400,VAL_2400_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int VAL_2400_LEN = 3;
  	/**
	 * 	serializeVal2400
	 */
	protected void serializeVal2400(short val2400) {
		   putDecimal(beginVal2400,val2400,VAL_2400_LEN,true);
   }
   

   protected short checkVal2400MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshVal2400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshVal2400() throws CFException {	
   	try { 
		 return (getShortDecimal(beginVal2400,VAL_2400_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("val2400", beginVal2400,VAL_2400_LEN);
     }
   	}
         int localVal3400Counter = -1;
         public boolean isVal3400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVal3400Counter != sharedCounter;
            localVal3400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkVal3400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }




}
  
