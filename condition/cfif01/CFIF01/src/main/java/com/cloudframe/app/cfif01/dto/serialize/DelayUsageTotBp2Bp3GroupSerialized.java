package com.cloudframe.app.cfif01.dto.serialize;

/**
*  The class DelayUsageTotBp2Bp3GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DelayUsageTotBp2Bp3GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DelayUsageTotBp2Bp3GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DELAY_USAGE_TOT_BP_2_BP_3_GROUP_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDelayUsageTotBp2Bp3;
            protected  int beginDelayUsageTotBp2Bp3Dec;
	
	/**
	* Constructor for DelayUsageTotBp2Bp3GroupSerialized
	**/
    public DelayUsageTotBp2Bp3GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DelayUsageTotBp2Bp3GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DELAY_USAGE_TOT_BP_2_BP_3_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDelayUsageTotBp2Bp3 = getStartOffset() + 0;	// set offset for serialization
  
             beginDelayUsageTotBp2Bp3Dec = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localDelayUsageTotBp2Bp3Counter = -1;
        public boolean isDelayUsageTotBp2Bp3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDelayUsageTotBp2Bp3Counter != sharedCounter;
           localDelayUsageTotBp2Bp3Counter = sharedCounter; return hasModified; 
        }
	    public boolean delayUsageTotBp2Bp3IsNumeric() {
	      return decimalIsNumeric(beginDelayUsageTotBp2Bp3,DELAY_USAGE_TOT_BP_2_BP_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DELAY_USAGE_TOT_BP_2_BP_3_LEN = 5;
  	/**
	 * 	serializeDelayUsageTotBp2Bp3
	 */
	protected void serializeDelayUsageTotBp2Bp3(int delayUsageTotBp2Bp3) {
		   putDecimal(beginDelayUsageTotBp2Bp3,delayUsageTotBp2Bp3,DELAY_USAGE_TOT_BP_2_BP_3_LEN,true);
   }
   

   protected int checkDelayUsageTotBp2Bp3MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshDelayUsageTotBp2Bp3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDelayUsageTotBp2Bp3() throws CFException {	
   	try { 
		 return (getIntDecimal(beginDelayUsageTotBp2Bp3,DELAY_USAGE_TOT_BP_2_BP_3_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("delayUsageTotBp2Bp3", beginDelayUsageTotBp2Bp3,DELAY_USAGE_TOT_BP_2_BP_3_LEN);
     }
   	}
        int localDelayUsageTotBp2Bp3DecCounter = -1;
        public boolean isDelayUsageTotBp2Bp3DecModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDelayUsageTotBp2Bp3DecCounter != sharedCounter;
           localDelayUsageTotBp2Bp3DecCounter = sharedCounter; return hasModified; 
        }
	    public boolean delayUsageTotBp2Bp3DecIsNumeric() {
	      return decimalIsNumeric(beginDelayUsageTotBp2Bp3Dec,DELAY_USAGE_TOT_BP_2_BP_3_DEC_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] delayUsageTotBp2Bp3DecString() {
            return getPackedString(beginDelayUsageTotBp2Bp3Dec,DELAY_USAGE_TOT_BP_2_BP_3_DEC_LEN);
         }
   protected static final int DELAY_USAGE_TOT_BP_2_BP_3_DEC_LEN = 5;
   protected static final int DELAY_USAGE_TOT_BP_2_BP_3_DEC_SCALE = 3;
  	/**
	 * 	serializeDelayUsageTotBp2Bp3Dec
	 */
	protected void serializeDelayUsageTotBp2Bp3Dec(BigDecimal delayUsageTotBp2Bp3Dec) {
		   putDecimal(beginDelayUsageTotBp2Bp3Dec,delayUsageTotBp2Bp3Dec,DELAY_USAGE_TOT_BP_2_BP_3_DEC_LEN,DELAY_USAGE_TOT_BP_2_BP_3_DEC_SCALE,true);
		 localDelayUsageTotBp2Bp3DecCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDelayUsageTotBp2Bp3DecMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshDelayUsageTotBp2Bp3Dec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDelayUsageTotBp2Bp3Dec() throws CFException {	
   	try { 
		 return (getDecimal(beginDelayUsageTotBp2Bp3Dec,DELAY_USAGE_TOT_BP_2_BP_3_DEC_LEN,DELAY_USAGE_TOT_BP_2_BP_3_DEC_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("delayUsageTotBp2Bp3Dec", beginDelayUsageTotBp2Bp3Dec,DELAY_USAGE_TOT_BP_2_BP_3_DEC_LEN);
     }
   	}




}
  
