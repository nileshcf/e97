package com.cloudframe.app.o529351u.dto.serialize;

/**
*  The class FeSpiRulesRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FeSpiRulesRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FeSpiRulesRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FE_SPI_RULES_RECORD_LENGTH = 4263;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrUpdateId;
           protected int beginFesrFromCondPs;
           protected static final int FESR_FROM_COND_PS_SIZE = 30;
           protected int beginFesrFromCondFrToSvc;
           protected static final int FESR_FROM_COND_FR_TO_SVC_SIZE = 198;
           protected int beginFesrFromCondPrvTyp;
           protected static final int FESR_FROM_COND_PRV_TYP_SIZE = 80;
           protected int beginFesrFromCondFrToIcd9;
           protected static final int FESR_FROM_COND_FR_TO_ICD_9_SIZE = 100;
           protected int beginFesrFromCondCause;
           protected static final int FESR_FROM_COND_CAUSE_SIZE = 7;
           protected int beginFesrIpaCode;
           protected static final int FESR_IPA_CODE_SIZE = 3;
	
	/**
	* Constructor for FeSpiRulesRecordSerialized
	**/
    public FeSpiRulesRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FeSpiRulesRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FE_SPI_RULES_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginFesrUpdateId = getStartOffset() + 22;	// set offset for serialization
  
	        beginFesrFromCondPs = getStartOffset() + 27; // set offset for serialization
  
	        beginFesrFromCondFrToSvc = getStartOffset() + 117; // set offset for serialization
  
	        beginFesrFromCondPrvTyp = getStartOffset() + 3087; // set offset for serialization
  
	        beginFesrFromCondFrToIcd9 = getStartOffset() + 3247; // set offset for serialization
  
	        beginFesrFromCondCause = getStartOffset() + 4247; // set offset for serialization
  
	        beginFesrIpaCode = getStartOffset() + 4254; // set offset for serialization
  
	   /*  end of offset */
	}
        int localFesrUpdateIdCounter = -1;
        public boolean isFesrUpdateIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesrUpdateIdCounter != sharedCounter;
           localFesrUpdateIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesrUpdateIdIsNumeric() {
	      return decimalIsNumeric(beginFesrUpdateId,FESR_UPDATE_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESR_UPDATE_ID_LEN = 5;
  	/**
	 * 	serializeFesrUpdateId
	 */
	protected void serializeFesrUpdateId(int fesrUpdateId) {
		   putDecimal(beginFesrUpdateId,fesrUpdateId,FESR_UPDATE_ID_LEN,true);
   }
   

   protected int checkFesrUpdateIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesrUpdateId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesrUpdateId() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesrUpdateId,FESR_UPDATE_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesrUpdateId", beginFesrUpdateId,FESR_UPDATE_ID_LEN);
     }
   	}

		public int fesrFromCondPsSize() {
			return FESR_FROM_COND_PS_SIZE;
		}
		public int fesrFromCondFrToSvcSize() {
			return FESR_FROM_COND_FR_TO_SVC_SIZE;
		}
		public int fesrFromCondPrvTypSize() {
			return FESR_FROM_COND_PRV_TYP_SIZE;
		}
		public int fesrFromCondFrToIcd9Size() {
			return FESR_FROM_COND_FR_TO_ICD_9_SIZE;
		}
		public int fesrFromCondCauseSize() {
			return FESR_FROM_COND_CAUSE_SIZE;
		}
		public int fesrIpaCodeSize() {
			return FESR_IPA_CODE_SIZE;
		}



}
  
