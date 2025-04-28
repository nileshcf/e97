package com.cloudframe.app.comput1.dto.serialize;

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
	protected static final int WORK_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDiv;
            protected  int beginAllow;
            protected  int beginOosuSharedAllow;
            protected  int beginRlu3aTotDataPromoAllow;
            protected  int beginRlu3aAcctPlanDataAllow;
	
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
             beginDiv = getStartOffset() + 0;	// set offset for serialization
  
             beginAllow = getStartOffset() + 6;	// set offset for serialization
  
             beginOosuSharedAllow = getStartOffset() + 13;	// set offset for serialization
  
             beginRlu3aTotDataPromoAllow = getStartOffset() + 20;	// set offset for serialization
  
             beginRlu3aAcctPlanDataAllow = getStartOffset() + 25;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
        int localDivCounter = -1;
        public boolean isDivModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDivCounter != sharedCounter;
           localDivCounter = sharedCounter; return hasModified; 
        }
	    public boolean divIsNumeric() {
	      return decimalIsNumeric(beginDiv,DIV_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DIV_LEN = 6;
  	/**
	 * 	serializeDiv
	 */
	protected void serializeDiv(long div) {
		   putDecimal(beginDiv,div,DIV_LEN,false);
   }
   

   protected long checkDivMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDiv is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDiv() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDiv,DIV_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("div", beginDiv,DIV_LEN);
     }
   	}
        int localAllowCounter = -1;
        public boolean isAllowModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAllowCounter != sharedCounter;
           localAllowCounter = sharedCounter; return hasModified; 
        }
	    public boolean allowIsNumeric() {
	      return decimalIsNumeric(beginAllow,ALLOW_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] allowString() {
            return getPackedString(beginAllow,ALLOW_LEN);
         }
   protected static final int ALLOW_LEN = 7;
   protected static final int ALLOW_SCALE = 3;
  	/**
	 * 	serializeAllow
	 */
	protected void serializeAllow(BigDecimal allow) {
		   putDecimal(beginAllow,allow,ALLOW_LEN,ALLOW_SCALE,true);
		 localAllowCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAllowMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshAllow is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAllow() throws CFException {	
   	try { 
		 return (getDecimal(beginAllow,ALLOW_LEN,ALLOW_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("allow", beginAllow,ALLOW_LEN);
     }
   	}
        int localOosuSharedAllowCounter = -1;
        public boolean isOosuSharedAllowModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localOosuSharedAllowCounter != sharedCounter;
           localOosuSharedAllowCounter = sharedCounter; return hasModified; 
        }
	    public boolean oosuSharedAllowIsNumeric() {
	      return decimalIsNumeric(beginOosuSharedAllow,OOSU_SHARED_ALLOW_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] oosuSharedAllowString() {
            return getPackedString(beginOosuSharedAllow,OOSU_SHARED_ALLOW_LEN);
         }
   protected static final int OOSU_SHARED_ALLOW_LEN = 7;
   protected static final int OOSU_SHARED_ALLOW_SCALE = 3;
  	/**
	 * 	serializeOosuSharedAllow
	 */
	protected void serializeOosuSharedAllow(BigDecimal oosuSharedAllow) {
		   putDecimal(beginOosuSharedAllow,oosuSharedAllow,OOSU_SHARED_ALLOW_LEN,OOSU_SHARED_ALLOW_SCALE,true);
		 localOosuSharedAllowCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkOosuSharedAllowMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshOosuSharedAllow is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOosuSharedAllow() throws CFException {	
   	try { 
		 return (getDecimal(beginOosuSharedAllow,OOSU_SHARED_ALLOW_LEN,OOSU_SHARED_ALLOW_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("oosuSharedAllow", beginOosuSharedAllow,OOSU_SHARED_ALLOW_LEN);
     }
   	}
        int localRlu3aTotDataPromoAllowCounter = -1;
        public boolean isRlu3aTotDataPromoAllowModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu3aTotDataPromoAllowCounter != sharedCounter;
           localRlu3aTotDataPromoAllowCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu3aTotDataPromoAllowIsNumeric() {
	      return decimalIsNumeric(beginRlu3aTotDataPromoAllow,RLU_3A_TOT_DATA_PROMO_ALLOW_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu3aTotDataPromoAllowString() {
            return getPackedString(beginRlu3aTotDataPromoAllow,RLU_3A_TOT_DATA_PROMO_ALLOW_LEN);
         }
   protected static final int RLU_3A_TOT_DATA_PROMO_ALLOW_LEN = 5;
   protected static final int RLU_3A_TOT_DATA_PROMO_ALLOW_SCALE = 3;
  	/**
	 * 	serializeRlu3aTotDataPromoAllow
	 */
	protected void serializeRlu3aTotDataPromoAllow(BigDecimal rlu3aTotDataPromoAllow) {
		   putDecimal(beginRlu3aTotDataPromoAllow,rlu3aTotDataPromoAllow,RLU_3A_TOT_DATA_PROMO_ALLOW_LEN,RLU_3A_TOT_DATA_PROMO_ALLOW_SCALE,true);
		 localRlu3aTotDataPromoAllowCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu3aTotDataPromoAllowMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,8/*precision*/);
   }
     /**
	 *	refreshRlu3aTotDataPromoAllow is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu3aTotDataPromoAllow() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu3aTotDataPromoAllow,RLU_3A_TOT_DATA_PROMO_ALLOW_LEN,RLU_3A_TOT_DATA_PROMO_ALLOW_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu3aTotDataPromoAllow", beginRlu3aTotDataPromoAllow,RLU_3A_TOT_DATA_PROMO_ALLOW_LEN);
     }
   	}
        int localRlu3aAcctPlanDataAllowCounter = -1;
        public boolean isRlu3aAcctPlanDataAllowModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu3aAcctPlanDataAllowCounter != sharedCounter;
           localRlu3aAcctPlanDataAllowCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu3aAcctPlanDataAllowIsNumeric() {
	      return decimalIsNumeric(beginRlu3aAcctPlanDataAllow,RLU_3A_ACCT_PLAN_DATA_ALLOW_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu3aAcctPlanDataAllowString() {
            return getPackedString(beginRlu3aAcctPlanDataAllow,RLU_3A_ACCT_PLAN_DATA_ALLOW_LEN);
         }
   protected static final int RLU_3A_ACCT_PLAN_DATA_ALLOW_LEN = 6;
   protected static final int RLU_3A_ACCT_PLAN_DATA_ALLOW_SCALE = 3;
  	/**
	 * 	serializeRlu3aAcctPlanDataAllow
	 */
	protected void serializeRlu3aAcctPlanDataAllow(BigDecimal rlu3aAcctPlanDataAllow) {
		   putDecimal(beginRlu3aAcctPlanDataAllow,rlu3aAcctPlanDataAllow,RLU_3A_ACCT_PLAN_DATA_ALLOW_LEN,RLU_3A_ACCT_PLAN_DATA_ALLOW_SCALE,true);
		 localRlu3aAcctPlanDataAllowCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu3aAcctPlanDataAllowMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,3/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu3aAcctPlanDataAllow is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu3aAcctPlanDataAllow() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu3aAcctPlanDataAllow,RLU_3A_ACCT_PLAN_DATA_ALLOW_LEN,RLU_3A_ACCT_PLAN_DATA_ALLOW_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu3aAcctPlanDataAllow", beginRlu3aAcctPlanDataAllow,RLU_3A_ACCT_PLAN_DATA_ALLOW_LEN);
     }
   	}
         int localCGigabyteNumCounter = -1;
         public boolean isCGigabyteNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCGigabyteNumCounter != sharedCounter;
            localCGigabyteNumCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCGigabyteNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCKilobyteNumCounter = -1;
         public boolean isCKilobyteNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCKilobyteNumCounter != sharedCounter;
            localCKilobyteNumCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCKilobyteNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCMegabyteNumCounter = -1;
         public boolean isCMegabyteNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCMegabyteNumCounter != sharedCounter;
            localCMegabyteNumCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCMegabyteNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localICounter = -1;
         public boolean isIModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localICounter != sharedCounter;
            localICounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkIMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }




}
  
