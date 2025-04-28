package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWS1;
            protected  int beginWS2;
            protected  int beginFrom;
            protected  int beginCurrentMonth;
            protected  int beginOinGeoCd;
	
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
  
  
  
  
  
             beginWS1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWS2 = getStartOffset() + 12;	// set offset for serialization
  
             beginFrom = getStartOffset() + 25;	// set offset for serialization
  
  
  
             beginCurrentMonth = getStartOffset() + 34;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginOinGeoCd = getStartOffset() + 36;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localWmbcsCsCharacterCounter = -1;
     public boolean isWmbcsCsCharacterModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWmbcsCsCharacterCounter != sharedCounter;
         localWmbcsCsCharacterCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWmbcsCsCharacterConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWmbcsShiftOutPcCounter = -1;
     public boolean isWmbcsShiftOutPcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWmbcsShiftOutPcCounter != sharedCounter;
         localWmbcsShiftOutPcCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWmbcsShiftOutPcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWmbcsShiftInPcCounter = -1;
     public boolean isWmbcsShiftInPcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWmbcsShiftInPcCounter != sharedCounter;
         localWmbcsShiftInPcCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWmbcsShiftInPcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localCisoutWorkRecCounter = -1;
     public boolean isCisoutWorkRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCisoutWorkRecCounter != sharedCounter;
         localCisoutWorkRecCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCisoutWorkRecConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCondCounter = -1;
     public boolean isCondModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCondCounter != sharedCounter;
         localCondCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCondConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localWS1Counter = -1;
     public boolean isWS1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS1Counter != sharedCounter;
         localWS1Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_1_LEN = 12;
	/**
	 * 	serialize this WS1
	 */
   protected void serializeWS1(char[] wS1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS1,0,getStringValue(),beginWS1,W_S_1_LEN);
       localWS1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS1Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWS1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS1() {	 
   		return (substring(getStringValue(),beginWS1,beginWS1 + W_S_1_LEN));
   	}
     int localWS2Counter = -1;
     public boolean isWS2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS2Counter != sharedCounter;
         localWS2Counter = sharedCounter; return hasModified;
     }
	protected static final int W_S_2_LEN = 13;
	/**
	 * 	serialize this WS2
	 */
   protected void serializeWS2(char[] wS2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wS2,0,getStringValue(),beginWS2,W_S_2_LEN);
       localWS2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWS2Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshWS2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWS2() {	 
   		return (substring(getStringValue(),beginWS2,beginWS2 + W_S_2_LEN));
   	}
     int localFromCounter = -1;
     
     public boolean isFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFromCounter != sharedCounter;
         localFromCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of from
	 *	@return from
	 */
	public char[]  getFromString() {
	    return getCharArray(beginFrom,FROM_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fromIsNumeric() {
		    return isNumeric(beginFrom
	                    ,beginFrom + FROM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int FROM_LEN = 9;
  protected  static final int FROM_SCALE = 2;

   protected BigDecimal checkFromMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }

  	/**
	 * serializeFrom
	 */
	protected void serializeFrom(BigDecimal from) {
	       putNumber(beginFrom,from,FROM_LEN,FROM_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFromCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeFrom
	 */
   	protected  BigDecimal serializeFrom(char[] value) throws CFException {
        if (value.length < 9) value = pad(9, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginFrom
		       ,9
		      );		 localFromCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,FROM_LEN,FROM_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("from", beginFrom,FROM_LEN);
    	}
    }
    /**
	 *	refreshFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshFrom() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginFrom
			            ,FROM_LEN
			            ,FROM_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("from", beginFrom,FROM_LEN);
    }
   	}
         int localTempMktgCdCounter = -1;
         public boolean isTempMktgCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTempMktgCdCounter != sharedCounter;
            localTempMktgCdCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTempMktgCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localRevoDnsCdCounter = -1;
     public boolean isRevoDnsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRevoDnsCdCounter != sharedCounter;
         localRevoDnsCdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRevoDnsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localCurrentMonthCounter = -1;
     public boolean isCurrentMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentMonthCounter != sharedCounter;
         localCurrentMonthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of currentMonth
	 *	@return currentMonth
	 */
	public char[]  getCurrentMonthString() {
	     return getCharArray(beginCurrentMonth,CURRENT_MONTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currentMonthIsNumeric() {
	    return isNumeric(beginCurrentMonth
	                    ,beginCurrentMonth + CURRENT_MONTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CURRENT_MONTH_LEN = 2;
  	/**
	 * serializeCurrentMonth
	 */
	protected void serializeCurrentMonth(int currentMonth) {
		 putNumber(beginCurrentMonth,currentMonth,CURRENT_MONTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurrentMonthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurrentMonth
	 */
   	protected  int serializeCurrentMonth(char[] value) {
	    int  currentMonth;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    currentMonth = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCurrentMonth
		       ,2
		      );
		 localCurrentMonthCounter = shareString.getSerializedField().getModifiedCounter();
		return  currentMonth;
    }

   protected int checkCurrentMonthMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurrentMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurrentMonth() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCurrentMonth
			                 ,CURRENT_MONTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("currentMonth", beginCurrentMonth,CURRENT_MONTH_LEN);
    }
   	}
     int localMonthRangeCounter = -1;
     public boolean isMonthRangeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthRangeCounter != sharedCounter;
         localMonthRangeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMonthRangeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localDelayCustIdNoCounter = -1;
         public boolean isDelayCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDelayCustIdNoCounter != sharedCounter;
            localDelayCustIdNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDelayCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDelayMtnCounter = -1;
     public boolean isDelayMtnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelayMtnCounter != sharedCounter;
         localDelayMtnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDelayMtnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localDelayBillPeriodCounter = -1;
     public boolean isDelayBillPeriodModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelayBillPeriodCounter != sharedCounter;
         localDelayBillPeriodCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDelayBillPeriodConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localDelayMeasCdCounter = -1;
     public boolean isDelayMeasCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelayMeasCdCounter != sharedCounter;
         localDelayMeasCdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDelayMeasCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDelaydatEofSwCounter = -1;
     public boolean isDelaydatEofSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDelaydatEofSwCounter != sharedCounter;
         localDelaydatEofSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDelaydatEofSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localReadDelaydatSwCounter = -1;
     public boolean isReadDelaydatSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadDelaydatSwCounter != sharedCounter;
         localReadDelaydatSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkReadDelaydatSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localBillku00CustIdNoCounter = -1;
         public boolean isBillku00CustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBillku00CustIdNoCounter != sharedCounter;
            localBillku00CustIdNoCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBillku00CustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localBillku00MtnCounter = -1;
     public boolean isBillku00MtnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBillku00MtnCounter != sharedCounter;
         localBillku00MtnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBillku00MtnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localX4Counter = -1;
     public boolean isX4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX4Counter != sharedCounter;
         localX4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkX4Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localX3Counter = -1;
     public boolean isX3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX3Counter != sharedCounter;
         localX3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkX3Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localBatchIdCounter = -1;
     public boolean isBatchIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBatchIdCounter != sharedCounter;
         localBatchIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBatchIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
        int localOinGeoCdCounter = -1;
        public boolean isOinGeoCdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localOinGeoCdCounter != sharedCounter;
           localOinGeoCdCounter = sharedCounter; return hasModified; 
        }
	    public boolean oinGeoCdIsNumeric() {
	      return decimalIsNumeric(beginOinGeoCd,OIN_GEO_CD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int OIN_GEO_CD_LEN = 4;
  	/**
	 * 	serializeOinGeoCd
	 */
	protected void serializeOinGeoCd(int oinGeoCd) {
		   putDecimal(beginOinGeoCd,oinGeoCd,OIN_GEO_CD_LEN,true);
   }
   

   protected int checkOinGeoCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshOinGeoCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOinGeoCd() throws CFException {	
   	try { 
		 return (getIntDecimal(beginOinGeoCd,OIN_GEO_CD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("oinGeoCd", beginOinGeoCd,OIN_GEO_CD_LEN);
     }
   	}
     int localTranCodeCounter = -1;
     public boolean isTranCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranCodeCounter != sharedCounter;
         localTranCodeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTranCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localParmStateCounter = -1;
     public boolean isParmStateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmStateCounter != sharedCounter;
         localParmStateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkParmStateConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localParmTyperunCounter = -1;
     public boolean isParmTyperunModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmTyperunCounter != sharedCounter;
         localParmTyperunCounter = sharedCounter; return hasModified;
     }

   protected char[] checkParmTyperunConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localParmRaoCounter = -1;
     public boolean isParmRaoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmRaoCounter != sharedCounter;
         localParmRaoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkParmRaoConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }




}
  
