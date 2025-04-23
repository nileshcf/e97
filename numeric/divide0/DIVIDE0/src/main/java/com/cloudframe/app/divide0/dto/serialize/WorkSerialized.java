package com.cloudframe.app.divide0.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDecimal;
            protected  int beginEditFld1;
            protected  int beginEditFld2;
            protected  int beginFbTotalVolume;
            protected  int beginDaPcntHoldDisp;
            protected  int beginDaPercentDisp;
	
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
  
  
             beginDecimal = getStartOffset() + 0;	// set offset for serialization
  
             beginEditFld1 = getStartOffset() + 3;	// set offset for serialization
  
             beginEditFld2 = getStartOffset() + 8;	// set offset for serialization
  
             beginFbTotalVolume = getStartOffset() + 14;	// set offset for serialization
  
             beginDaPcntHoldDisp = getStartOffset() + 25;	// set offset for serialization
  
             beginDaPercentDisp = getStartOffset() + 33;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp20004ItemLengthCounter = -1;
         public boolean isIp20004ItemLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp20004ItemLengthCounter != sharedCounter;
            localIp20004ItemLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIp20004ItemLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localTmpLth800Counter = -1;
         public boolean isTmpLth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTmpLth800Counter != sharedCounter;
            localTmpLth800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkTmpLth800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
        int localDecimalCounter = -1;
        public boolean isDecimalModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDecimalCounter != sharedCounter;
           localDecimalCounter = sharedCounter; return hasModified; 
        }
	    public boolean decimalIsNumeric() {
	      return decimalIsNumeric(beginDecimal,DECIMAL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] decimalString() {
            return getPackedString(beginDecimal,DECIMAL_LEN);
         }
   protected static final int DECIMAL_LEN = 3;
   protected static final int DECIMAL_SCALE = 2;
  	/**
	 * 	serializeDecimal
	 */
	protected void serializeDecimal(BigDecimal decimal) {
		   putDecimal(beginDecimal,decimal,DECIMAL_LEN,DECIMAL_SCALE,true);
		 localDecimalCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDecimalMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshDecimal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDecimal() throws CFException {	
   	try { 
		 return (getDecimal(beginDecimal,DECIMAL_LEN,DECIMAL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("decimal", beginDecimal,DECIMAL_LEN);
     }
   	}
     int localEditFld1Counter = -1;
     public boolean isEditFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditFld1Counter != sharedCounter;
         localEditFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_FLD_1_LEN = 5;
	/**
	 * 	serialize this EditFld1
	 */
   protected void serializeEditFld1(char[] editFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(editFld1,0,getStringValue(),beginEditFld1,EDIT_FLD_1_LEN);
       localEditFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshEditFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEditFld1() {	 
   		return (substring(getStringValue(),beginEditFld1,beginEditFld1 + EDIT_FLD_1_LEN));
   	}
     int localEditFld2Counter = -1;
     public boolean isEditFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditFld2Counter != sharedCounter;
         localEditFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_FLD_2_LEN = 6;
	/**
	 * 	serialize this EditFld2
	 */
   protected void serializeEditFld2(char[] editFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(editFld2,0,getStringValue(),beginEditFld2,EDIT_FLD_2_LEN);
       localEditFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshEditFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEditFld2() {	 
   		return (substring(getStringValue(),beginEditFld2,beginEditFld2 + EDIT_FLD_2_LEN));
   	}
     int localFbTotalVolumeCounter = -1;
     public boolean isFbTotalVolumeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFbTotalVolumeCounter != sharedCounter;
         localFbTotalVolumeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fbTotalVolume
	 *	@return fbTotalVolume
	 */
	public char[]  getFbTotalVolumeString() {
	     return getCharArray(beginFbTotalVolume,FB_TOTAL_VOLUME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fbTotalVolumeIsNumeric() {
	    return isNumeric(beginFbTotalVolume
	                    ,beginFbTotalVolume + FB_TOTAL_VOLUME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FB_TOTAL_VOLUME_LEN = 11;
  	/**
	 * serializeFbTotalVolume
	 */
	protected void serializeFbTotalVolume(long fbTotalVolume) {
		 putNumber(beginFbTotalVolume,fbTotalVolume,FB_TOTAL_VOLUME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFbTotalVolumeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFbTotalVolume
	 */
   	protected  long serializeFbTotalVolume(char[] value) {
	    long  fbTotalVolume;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fbTotalVolume = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginFbTotalVolume
		       ,11
		      );
		 localFbTotalVolumeCounter = shareString.getSerializedField().getModifiedCounter();
		return  fbTotalVolume;
    }

   protected long checkFbTotalVolumeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFbTotalVolume is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFbTotalVolume() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFbTotalVolume
			                 ,FB_TOTAL_VOLUME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fbTotalVolume", beginFbTotalVolume,FB_TOTAL_VOLUME_LEN);
    }
   	}
     int localDaPcntHoldDispCounter = -1;
     public boolean isDaPcntHoldDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaPcntHoldDispCounter != sharedCounter;
         localDaPcntHoldDispCounter = sharedCounter; return hasModified;
     }
	protected static final int DA_PCNT_HOLD_DISP_LEN = 8;
	/**
	 * 	serialize this DaPcntHoldDisp
	 */
   protected void serializeDaPcntHoldDisp(char[] daPcntHoldDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(daPcntHoldDisp,0,getStringValue(),beginDaPcntHoldDisp,DA_PCNT_HOLD_DISP_LEN);
       localDaPcntHoldDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDaPcntHoldDispConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDaPcntHoldDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDaPcntHoldDisp() {	 
   		return (substring(getStringValue(),beginDaPcntHoldDisp,beginDaPcntHoldDisp + DA_PCNT_HOLD_DISP_LEN));
   	}
     int localDaPercentDispCounter = -1;
     public boolean isDaPercentDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaPercentDispCounter != sharedCounter;
         localDaPercentDispCounter = sharedCounter; return hasModified;
     }
	protected static final int DA_PERCENT_DISP_LEN = 6;
	/**
	 * 	serialize this DaPercentDisp
	 */
   protected void serializeDaPercentDisp(char[] daPercentDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(daPercentDisp,0,getStringValue(),beginDaPercentDisp,DA_PERCENT_DISP_LEN);
       localDaPercentDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDaPercentDispConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDaPercentDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDaPercentDisp() {	 
   		return (substring(getStringValue(),beginDaPercentDisp,beginDaPercentDisp + DA_PERCENT_DISP_LEN));
   	}




}
  
