package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503MpMipProfileLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503MpMipProfileLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503MpMipProfileLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_MP_MIP_PROFILE_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503MpLogTime;
            protected  int beginSf503MpLogDate;
            protected  int beginSf503MpIssFloorLim2Retail;
            protected  int beginSf503MpIssFloorLim2Travel;
            protected  int beginSf503MpIssFloorLim2Cash;
            protected  int beginSf503MpPosRetailLimit;
            protected  int beginSf503MpPosTravelLimit;
            protected  int beginSf503MpPosCashLimit;
            protected  int beginSf503MpXCodeLimit;
            protected  int beginSf503MpRclFileInd;
            protected  int beginSf503MpNegFileAvailInd;
            protected  int beginSf503MpMbrDelayFileInd;
            protected  int beginSf503MpLocalNegFileInd;
           protected int beginSf503MpIpqTimes;
           protected static final int SF_503_MP_IPQ_TIMES_SIZE = 20;
	
	/**
	* Constructor for Sf503MpMipProfileLogSerialized
	**/
    public Sf503MpMipProfileLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503MpMipProfileLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503MpMipProfileLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503MpMipProfileLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503MpMipProfileLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503MpMipProfileLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_MP_MIP_PROFILE_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503MpLogTime = getStartOffset() + 2;	// set offset for serialization
  
             beginSf503MpLogDate = getStartOffset() + 8;	// set offset for serialization
  
  
             beginSf503MpIssFloorLim2Retail = getStartOffset() + 17;	// set offset for serialization
  
             beginSf503MpIssFloorLim2Travel = getStartOffset() + 19;	// set offset for serialization
  
             beginSf503MpIssFloorLim2Cash = getStartOffset() + 21;	// set offset for serialization
  
             beginSf503MpPosRetailLimit = getStartOffset() + 23;	// set offset for serialization
  
             beginSf503MpPosTravelLimit = getStartOffset() + 25;	// set offset for serialization
  
             beginSf503MpPosCashLimit = getStartOffset() + 27;	// set offset for serialization
  
             beginSf503MpXCodeLimit = getStartOffset() + 29;	// set offset for serialization
  
             beginSf503MpRclFileInd = getStartOffset() + 31;	// set offset for serialization
  
             beginSf503MpNegFileAvailInd = getStartOffset() + 32;	// set offset for serialization
  
             beginSf503MpMbrDelayFileInd = getStartOffset() + 33;	// set offset for serialization
  
             beginSf503MpLocalNegFileInd = getStartOffset() + 34;	// set offset for serialization
  
	        beginSf503MpIpqTimes = getStartOffset() + 35; // set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503MpLogTimeCounter = -1;
     public boolean isSf503MpLogTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpLogTimeCounter != sharedCounter;
         localSf503MpLogTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_LOG_TIME_LEN = 6;
	/**
	 * 	serialize this Sf503MpLogTime
	 */
   protected void serializeSf503MpLogTime(char[] sf503MpLogTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpLogTime,0,getStringValue(),beginSf503MpLogTime,SF_503_MP_LOG_TIME_LEN);
       localSf503MpLogTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpLogTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503MpLogTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpLogTime() {	 
   		return (substring(getStringValue(),beginSf503MpLogTime,beginSf503MpLogTime + SF_503_MP_LOG_TIME_LEN));
   	}
     int localSf503MpLogDateCounter = -1;
     public boolean isSf503MpLogDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpLogDateCounter != sharedCounter;
         localSf503MpLogDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_LOG_DATE_LEN = 6;
	/**
	 * 	serialize this Sf503MpLogDate
	 */
   protected void serializeSf503MpLogDate(char[] sf503MpLogDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpLogDate,0,getStringValue(),beginSf503MpLogDate,SF_503_MP_LOG_DATE_LEN);
       localSf503MpLogDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpLogDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503MpLogDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpLogDate() {	 
   		return (substring(getStringValue(),beginSf503MpLogDate,beginSf503MpLogDate + SF_503_MP_LOG_DATE_LEN));
   	}
         int localSf503MpIssFloorLim2RetailCounter = -1;
         public boolean isSf503MpIssFloorLim2RetailModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpIssFloorLim2RetailCounter != sharedCounter;
            localSf503MpIssFloorLim2RetailCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_ISS_FLOOR_LIM_2_RETAIL_LEN = 2;
  	/**
	 * serializeSf503MpIssFloorLim2Retail
	 */
	protected void serializeSf503MpIssFloorLim2Retail(int sf503MpIssFloorLim2Retail) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpIssFloorLim2Retail,SF_503_MP_ISS_FLOOR_LIM_2_RETAIL_LEN)
                  ,beginSf503MpIssFloorLim2Retail
                  ,SF_503_MP_ISS_FLOOR_LIM_2_RETAIL_LEN
                 );
            localSf503MpIssFloorLim2RetailCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpIssFloorLim2RetailMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpIssFloorLim2Retail is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpIssFloorLim2Retail() {	 
			return (getUnsignedShort(beginSf503MpIssFloorLim2Retail));
   	}
         int localSf503MpIssFloorLim2TravelCounter = -1;
         public boolean isSf503MpIssFloorLim2TravelModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpIssFloorLim2TravelCounter != sharedCounter;
            localSf503MpIssFloorLim2TravelCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN = 2;
  	/**
	 * serializeSf503MpIssFloorLim2Travel
	 */
	protected void serializeSf503MpIssFloorLim2Travel(int sf503MpIssFloorLim2Travel) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpIssFloorLim2Travel,SF_503_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN)
                  ,beginSf503MpIssFloorLim2Travel
                  ,SF_503_MP_ISS_FLOOR_LIM_2_TRAVEL_LEN
                 );
            localSf503MpIssFloorLim2TravelCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpIssFloorLim2TravelMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpIssFloorLim2Travel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpIssFloorLim2Travel() {	 
			return (getUnsignedShort(beginSf503MpIssFloorLim2Travel));
   	}
         int localSf503MpIssFloorLim2CashCounter = -1;
         public boolean isSf503MpIssFloorLim2CashModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpIssFloorLim2CashCounter != sharedCounter;
            localSf503MpIssFloorLim2CashCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_ISS_FLOOR_LIM_2_CASH_LEN = 2;
  	/**
	 * serializeSf503MpIssFloorLim2Cash
	 */
	protected void serializeSf503MpIssFloorLim2Cash(int sf503MpIssFloorLim2Cash) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpIssFloorLim2Cash,SF_503_MP_ISS_FLOOR_LIM_2_CASH_LEN)
                  ,beginSf503MpIssFloorLim2Cash
                  ,SF_503_MP_ISS_FLOOR_LIM_2_CASH_LEN
                 );
            localSf503MpIssFloorLim2CashCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpIssFloorLim2CashMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpIssFloorLim2Cash is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpIssFloorLim2Cash() {	 
			return (getUnsignedShort(beginSf503MpIssFloorLim2Cash));
   	}
         int localSf503MpPosRetailLimitCounter = -1;
         public boolean isSf503MpPosRetailLimitModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpPosRetailLimitCounter != sharedCounter;
            localSf503MpPosRetailLimitCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_POS_RETAIL_LIMIT_LEN = 2;
  	/**
	 * serializeSf503MpPosRetailLimit
	 */
	protected void serializeSf503MpPosRetailLimit(int sf503MpPosRetailLimit) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpPosRetailLimit,SF_503_MP_POS_RETAIL_LIMIT_LEN)
                  ,beginSf503MpPosRetailLimit
                  ,SF_503_MP_POS_RETAIL_LIMIT_LEN
                 );
            localSf503MpPosRetailLimitCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpPosRetailLimitMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpPosRetailLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpPosRetailLimit() {	 
			return (getUnsignedShort(beginSf503MpPosRetailLimit));
   	}
         int localSf503MpPosTravelLimitCounter = -1;
         public boolean isSf503MpPosTravelLimitModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpPosTravelLimitCounter != sharedCounter;
            localSf503MpPosTravelLimitCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_POS_TRAVEL_LIMIT_LEN = 2;
  	/**
	 * serializeSf503MpPosTravelLimit
	 */
	protected void serializeSf503MpPosTravelLimit(int sf503MpPosTravelLimit) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpPosTravelLimit,SF_503_MP_POS_TRAVEL_LIMIT_LEN)
                  ,beginSf503MpPosTravelLimit
                  ,SF_503_MP_POS_TRAVEL_LIMIT_LEN
                 );
            localSf503MpPosTravelLimitCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpPosTravelLimitMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpPosTravelLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpPosTravelLimit() {	 
			return (getUnsignedShort(beginSf503MpPosTravelLimit));
   	}
         int localSf503MpPosCashLimitCounter = -1;
         public boolean isSf503MpPosCashLimitModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpPosCashLimitCounter != sharedCounter;
            localSf503MpPosCashLimitCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_POS_CASH_LIMIT_LEN = 2;
  	/**
	 * serializeSf503MpPosCashLimit
	 */
	protected void serializeSf503MpPosCashLimit(int sf503MpPosCashLimit) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpPosCashLimit,SF_503_MP_POS_CASH_LIMIT_LEN)
                  ,beginSf503MpPosCashLimit
                  ,SF_503_MP_POS_CASH_LIMIT_LEN
                 );
            localSf503MpPosCashLimitCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpPosCashLimitMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpPosCashLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpPosCashLimit() {	 
			return (getUnsignedShort(beginSf503MpPosCashLimit));
   	}
         int localSf503MpXCodeLimitCounter = -1;
         public boolean isSf503MpXCodeLimitModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf503MpXCodeLimitCounter != sharedCounter;
            localSf503MpXCodeLimitCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_503_MP_XCODE_LIMIT_LEN = 2;
  	/**
	 * serializeSf503MpXCodeLimit
	 */
	protected void serializeSf503MpXCodeLimit(int sf503MpXCodeLimit) {
           replaceValue( //  save the value as string
                   getBinaryString( sf503MpXCodeLimit,SF_503_MP_XCODE_LIMIT_LEN)
                  ,beginSf503MpXCodeLimit
                  ,SF_503_MP_XCODE_LIMIT_LEN
                 );
            localSf503MpXCodeLimitCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf503MpXCodeLimitMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf503MpXCodeLimit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf503MpXCodeLimit() {	 
			return (getUnsignedShort(beginSf503MpXCodeLimit));
   	}
     int localSf503MpRclFileIndCounter = -1;
     public boolean isSf503MpRclFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpRclFileIndCounter != sharedCounter;
         localSf503MpRclFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_RCL_FILE_IND_LEN = 1;
	/**
	 * 	serialize this Sf503MpRclFileInd
	 */
   protected void serializeSf503MpRclFileInd(char[] sf503MpRclFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpRclFileInd,0,getStringValue(),beginSf503MpRclFileInd,SF_503_MP_RCL_FILE_IND_LEN);
       localSf503MpRclFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpRclFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503MpRclFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpRclFileInd() {	 
   		return (substring(getStringValue(),beginSf503MpRclFileInd,beginSf503MpRclFileInd + SF_503_MP_RCL_FILE_IND_LEN));
   	}
     int localSf503MpNegFileAvailIndCounter = -1;
     public boolean isSf503MpNegFileAvailIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpNegFileAvailIndCounter != sharedCounter;
         localSf503MpNegFileAvailIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_NEG_FILE_AVAIL_IND_LEN = 1;
	/**
	 * 	serialize this Sf503MpNegFileAvailInd
	 */
   protected void serializeSf503MpNegFileAvailInd(char[] sf503MpNegFileAvailInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpNegFileAvailInd,0,getStringValue(),beginSf503MpNegFileAvailInd,SF_503_MP_NEG_FILE_AVAIL_IND_LEN);
       localSf503MpNegFileAvailIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpNegFileAvailIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503MpNegFileAvailInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpNegFileAvailInd() {	 
   		return (substring(getStringValue(),beginSf503MpNegFileAvailInd,beginSf503MpNegFileAvailInd + SF_503_MP_NEG_FILE_AVAIL_IND_LEN));
   	}
     int localSf503MpMbrDelayFileIndCounter = -1;
     public boolean isSf503MpMbrDelayFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpMbrDelayFileIndCounter != sharedCounter;
         localSf503MpMbrDelayFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_MBR_DELAY_FILE_IND_LEN = 1;
	/**
	 * 	serialize this Sf503MpMbrDelayFileInd
	 */
   protected void serializeSf503MpMbrDelayFileInd(char[] sf503MpMbrDelayFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpMbrDelayFileInd,0,getStringValue(),beginSf503MpMbrDelayFileInd,SF_503_MP_MBR_DELAY_FILE_IND_LEN);
       localSf503MpMbrDelayFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpMbrDelayFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503MpMbrDelayFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpMbrDelayFileInd() {	 
   		return (substring(getStringValue(),beginSf503MpMbrDelayFileInd,beginSf503MpMbrDelayFileInd + SF_503_MP_MBR_DELAY_FILE_IND_LEN));
   	}
     int localSf503MpLocalNegFileIndCounter = -1;
     public boolean isSf503MpLocalNegFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpLocalNegFileIndCounter != sharedCounter;
         localSf503MpLocalNegFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_LOCAL_NEG_FILE_IND_LEN = 1;
	/**
	 * 	serialize this Sf503MpLocalNegFileInd
	 */
   protected void serializeSf503MpLocalNegFileInd(char[] sf503MpLocalNegFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpLocalNegFileInd,0,getStringValue(),beginSf503MpLocalNegFileInd,SF_503_MP_LOCAL_NEG_FILE_IND_LEN);
       localSf503MpLocalNegFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpLocalNegFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503MpLocalNegFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpLocalNegFileInd() {	 
   		return (substring(getStringValue(),beginSf503MpLocalNegFileInd,beginSf503MpLocalNegFileInd + SF_503_MP_LOCAL_NEG_FILE_IND_LEN));
   	}

	protected static final int SF_503_MP_IPQ_TIMES_LEN = 2;
    /**
	 * 	serialize this Sf503MpIpqTimes as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeSf503MpIpqTimes(int index, int value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginSf503MpIpqTimes + index*SF_503_MP_IPQ_TIMES_LEN), SF_503_MP_IPQ_TIMES_LEN);
   }

		public int sf503MpIpqTimesSize() {
			return SF_503_MP_IPQ_TIMES_SIZE;
		}



}
  
