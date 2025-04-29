package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class HoldIrdTable500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldIrdTable500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldIrdTable500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_IRD_TABLE_500_LENGTH = 154;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIrdLdCnt500;
            protected  int beginIrdLdCnt1500;
           protected int beginIrdTbl500;
           protected static final int IRD_TBL_500_SIZE = 50;
	
	/**
	* Constructor for HoldIrdTable500Serialized
	**/
    public HoldIrdTable500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in HoldIrdTable500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_IRD_TABLE_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIrdLdCnt500 = getStartOffset() + 0;	// set offset for serialization
  
             beginIrdLdCnt1500 = getStartOffset() + 2;	// set offset for serialization
  
	        beginIrdTbl500 = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
         int localIrdLdCnt500Counter = -1;
         public boolean isIrdLdCnt500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIrdLdCnt500Counter != sharedCounter;
            localIrdLdCnt500Counter = sharedCounter; return hasModified; 
         }
   protected static final int IRD_LD_CNT_500_LEN = 2;
  	/**
	 * serializeIrdLdCnt500
	 */
	protected void serializeIrdLdCnt500(short irdLdCnt500) {
           replaceValue( //  save the value as string
                   getBinaryString( irdLdCnt500,IRD_LD_CNT_500_LEN)
                  ,beginIrdLdCnt500
                  ,IRD_LD_CNT_500_LEN
                 );
            localIrdLdCnt500Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIrdLdCnt500MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIrdLdCnt500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIrdLdCnt500() {	 
			return (getShort(beginIrdLdCnt500));
   	}
         int localIrdLdCnt1500Counter = -1;
         public boolean isIrdLdCnt1500Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIrdLdCnt1500Counter != sharedCounter;
            localIrdLdCnt1500Counter = sharedCounter; return hasModified; 
         }
   protected static final int IRD_LD_CNT_1500_LEN = 2;
  	/**
	 * serializeIrdLdCnt1500
	 */
	protected void serializeIrdLdCnt1500(short irdLdCnt1500) {
           replaceValue( //  save the value as string
                   getBinaryString( irdLdCnt1500,IRD_LD_CNT_1500_LEN)
                  ,beginIrdLdCnt1500
                  ,IRD_LD_CNT_1500_LEN
                 );
            localIrdLdCnt1500Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIrdLdCnt1500MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIrdLdCnt1500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIrdLdCnt1500() {	 
			return (getShort(beginIrdLdCnt1500));
   	}

		public int irdTbl500Size() {
			return IRD_TBL_500_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 4 + (dependValue *  3);
     }
     
     public int getVariableLength(int idx) {
     	return 4 + (idx *  3);
     }
}
  
