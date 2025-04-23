package com.cloudframe.app.move0.dto.serialize;

/**
*  The class Rl7abTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Rl7abTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl7abTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_7AB_TBL_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDpFeatId;
            protected  int beginDpMonthlyAllowAmt;
            protected  int beginDpMonthlyAllowTxt;
            protected  int beginDpMonthlyUnldInd;
            protected  int beginDpAllowOffrId;
            protected  int beginDpAlwPerClassId;
            protected  int beginDpPerUnitChg1a;
            protected  int beginDpPerUnitChgTxt1a;
            protected  int beginDpPerUnitChg1b;
            protected  int beginDpPerUnitChgTxt1b;
            protected  int beginDpFeatUnitDescr;
	
	/**
	* Constructor for Rl7abTblSerialized
	**/
    public Rl7abTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rl7abTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl7abTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rl7abTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,128); // serialize this field at offset 128 by default 
    }
    
	/**
	* sets parent for this Rl7abTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 128 by default
    }    
	/**
	* initializes the field in Rl7abTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_7AB_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDpFeatId = getStartOffset() + 0;	// set offset for serialization
  
             beginDpMonthlyAllowAmt = getStartOffset() + 4;	// set offset for serialization
  
             beginDpMonthlyAllowTxt = getStartOffset() + 9;	// set offset for serialization
  
             beginDpMonthlyUnldInd = getStartOffset() + 49;	// set offset for serialization
  
             beginDpAllowOffrId = getStartOffset() + 50;	// set offset for serialization
  
             beginDpAlwPerClassId = getStartOffset() + 54;	// set offset for serialization
  
             beginDpPerUnitChg1a = getStartOffset() + 56;	// set offset for serialization
  
             beginDpPerUnitChgTxt1a = getStartOffset() + 67;	// set offset for serialization
  
             beginDpPerUnitChg1b = getStartOffset() + 82;	// set offset for serialization
  
             beginDpPerUnitChgTxt1b = getStartOffset() + 93;	// set offset for serialization
  
             beginDpFeatUnitDescr = getStartOffset() + 108;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localDpFeatIdCounter = -1;
         public boolean isDpFeatIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDpFeatIdCounter != sharedCounter;
            localDpFeatIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int DP_FEAT_ID_LEN = 4;
  	/**
	 * serializeDpFeatId
	 */
	protected void serializeDpFeatId(int dpFeatId) {
           replaceValue( //  save the value as string
                   getBinaryString( dpFeatId,DP_FEAT_ID_LEN)
                  ,beginDpFeatId
                  ,DP_FEAT_ID_LEN
                 );
            localDpFeatIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDpFeatIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDpFeatId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDpFeatId() {	 
			return (getInt(beginDpFeatId));
   	}
        int localDpMonthlyAllowAmtCounter = -1;
        public boolean isDpMonthlyAllowAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDpMonthlyAllowAmtCounter != sharedCounter;
           localDpMonthlyAllowAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean dpMonthlyAllowAmtIsNumeric() {
	      return decimalIsNumeric(beginDpMonthlyAllowAmt,DP_MONTHLY_ALLOW_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DP_MONTHLY_ALLOW_AMT_LEN = 5;
  	/**
	 * 	serializeDpMonthlyAllowAmt
	 */
	protected void serializeDpMonthlyAllowAmt(long dpMonthlyAllowAmt) {
		   putDecimal(beginDpMonthlyAllowAmt,dpMonthlyAllowAmt,DP_MONTHLY_ALLOW_AMT_LEN,false);
   }
   

   protected long checkDpMonthlyAllowAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDpMonthlyAllowAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDpMonthlyAllowAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDpMonthlyAllowAmt,DP_MONTHLY_ALLOW_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dpMonthlyAllowAmt", beginDpMonthlyAllowAmt,DP_MONTHLY_ALLOW_AMT_LEN);
     }
   	}
     int localDpMonthlyAllowTxtCounter = -1;
     public boolean isDpMonthlyAllowTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDpMonthlyAllowTxtCounter != sharedCounter;
         localDpMonthlyAllowTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int DP_MONTHLY_ALLOW_TXT_LEN = 40;
	/**
	 * 	serialize this DpMonthlyAllowTxt
	 */
   protected void serializeDpMonthlyAllowTxt(char[] dpMonthlyAllowTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dpMonthlyAllowTxt,0,getStringValue(),beginDpMonthlyAllowTxt,DP_MONTHLY_ALLOW_TXT_LEN);
       localDpMonthlyAllowTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDpMonthlyAllowTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshDpMonthlyAllowTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDpMonthlyAllowTxt() {	 
   		return (substring(getStringValue(),beginDpMonthlyAllowTxt,beginDpMonthlyAllowTxt + DP_MONTHLY_ALLOW_TXT_LEN));
   	}
     int localDpMonthlyUnldIndCounter = -1;
     public boolean isDpMonthlyUnldIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDpMonthlyUnldIndCounter != sharedCounter;
         localDpMonthlyUnldIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DP_MONTHLY_UNLD_IND_LEN = 1;
	/**
	 * 	serialize this DpMonthlyUnldInd
	 */
   protected void serializeDpMonthlyUnldInd(char[] dpMonthlyUnldInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dpMonthlyUnldInd,0,getStringValue(),beginDpMonthlyUnldInd,DP_MONTHLY_UNLD_IND_LEN);
       localDpMonthlyUnldIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDpMonthlyUnldIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDpMonthlyUnldInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDpMonthlyUnldInd() {	 
   		return (substring(getStringValue(),beginDpMonthlyUnldInd,beginDpMonthlyUnldInd + DP_MONTHLY_UNLD_IND_LEN));
   	}
         int localDpAllowOffrIdCounter = -1;
         public boolean isDpAllowOffrIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDpAllowOffrIdCounter != sharedCounter;
            localDpAllowOffrIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int DP_ALLOW_OFFR_ID_LEN = 4;
  	/**
	 * serializeDpAllowOffrId
	 */
	protected void serializeDpAllowOffrId(int dpAllowOffrId) {
           replaceValue( //  save the value as string
                   getBinaryString( dpAllowOffrId,DP_ALLOW_OFFR_ID_LEN)
                  ,beginDpAllowOffrId
                  ,DP_ALLOW_OFFR_ID_LEN
                 );
            localDpAllowOffrIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDpAllowOffrIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDpAllowOffrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDpAllowOffrId() {	 
			return (getInt(beginDpAllowOffrId));
   	}
     int localDpAlwPerClassIdCounter = -1;
     public boolean isDpAlwPerClassIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDpAlwPerClassIdCounter != sharedCounter;
         localDpAlwPerClassIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DP_ALW_PER_CLASS_ID_LEN = 2;
	/**
	 * 	serialize this DpAlwPerClassId
	 */
   protected void serializeDpAlwPerClassId(char[] dpAlwPerClassId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dpAlwPerClassId,0,getStringValue(),beginDpAlwPerClassId,DP_ALW_PER_CLASS_ID_LEN);
       localDpAlwPerClassIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDpAlwPerClassIdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDpAlwPerClassId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDpAlwPerClassId() {	 
   		return (substring(getStringValue(),beginDpAlwPerClassId,beginDpAlwPerClassId + DP_ALW_PER_CLASS_ID_LEN));
   	}
        int localDpPerUnitChg1aCounter = -1;
        public boolean isDpPerUnitChg1aModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDpPerUnitChg1aCounter != sharedCounter;
           localDpPerUnitChg1aCounter = sharedCounter; return hasModified; 
        }
	    public boolean dpPerUnitChg1aIsNumeric() {
	      return decimalIsNumeric(beginDpPerUnitChg1a,DP_PER_UNIT_CHG_1A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dpPerUnitChg1aString() {
            return getPackedString(beginDpPerUnitChg1a,DP_PER_UNIT_CHG_1A_LEN);
         }
   protected static final int DP_PER_UNIT_CHG_1A_LEN = 11;
   protected static final int DP_PER_UNIT_CHG_1A_SCALE = 11;
  	/**
	 * 	serializeDpPerUnitChg1a
	 */
	protected void serializeDpPerUnitChg1a(BigDecimal dpPerUnitChg1a) {
		   putDecimal(beginDpPerUnitChg1a,dpPerUnitChg1a,DP_PER_UNIT_CHG_1A_LEN,DP_PER_UNIT_CHG_1A_SCALE,false);
		 localDpPerUnitChg1aCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDpPerUnitChg1aMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,20/*precision*/);
   }
     /**
	 *	refreshDpPerUnitChg1a is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDpPerUnitChg1a() throws CFException {	
   	try { 
		 return (getDecimal(beginDpPerUnitChg1a,DP_PER_UNIT_CHG_1A_LEN,DP_PER_UNIT_CHG_1A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dpPerUnitChg1a", beginDpPerUnitChg1a,DP_PER_UNIT_CHG_1A_LEN);
     }
   	}
     int localDpPerUnitChgTxt1aCounter = -1;
     public boolean isDpPerUnitChgTxt1aModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDpPerUnitChgTxt1aCounter != sharedCounter;
         localDpPerUnitChgTxt1aCounter = sharedCounter; return hasModified;
     }
	protected static final int DP_PER_UNIT_CHG_TXT_1A_LEN = 15;
	/**
	 * 	serialize this DpPerUnitChgTxt1a
	 */
   protected void serializeDpPerUnitChgTxt1a(char[] dpPerUnitChgTxt1a) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dpPerUnitChgTxt1a,0,getStringValue(),beginDpPerUnitChgTxt1a,DP_PER_UNIT_CHG_TXT_1A_LEN);
       localDpPerUnitChgTxt1aCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDpPerUnitChgTxt1aConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDpPerUnitChgTxt1a is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDpPerUnitChgTxt1a() {	 
   		return (substring(getStringValue(),beginDpPerUnitChgTxt1a,beginDpPerUnitChgTxt1a + DP_PER_UNIT_CHG_TXT_1A_LEN));
   	}
        int localDpPerUnitChg1bCounter = -1;
        public boolean isDpPerUnitChg1bModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDpPerUnitChg1bCounter != sharedCounter;
           localDpPerUnitChg1bCounter = sharedCounter; return hasModified; 
        }
	    public boolean dpPerUnitChg1bIsNumeric() {
	      return decimalIsNumeric(beginDpPerUnitChg1b,DP_PER_UNIT_CHG_1B_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] dpPerUnitChg1bString() {
            return getPackedString(beginDpPerUnitChg1b,DP_PER_UNIT_CHG_1B_LEN);
         }
   protected static final int DP_PER_UNIT_CHG_1B_LEN = 11;
   protected static final int DP_PER_UNIT_CHG_1B_SCALE = 11;
  	/**
	 * 	serializeDpPerUnitChg1b
	 */
	protected void serializeDpPerUnitChg1b(BigDecimal dpPerUnitChg1b) {
		   putDecimal(beginDpPerUnitChg1b,dpPerUnitChg1b,DP_PER_UNIT_CHG_1B_LEN,DP_PER_UNIT_CHG_1B_SCALE,false);
		 localDpPerUnitChg1bCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkDpPerUnitChg1bMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,11/*scale*/,20/*precision*/);
   }
     /**
	 *	refreshDpPerUnitChg1b is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDpPerUnitChg1b() throws CFException {	
   	try { 
		 return (getDecimal(beginDpPerUnitChg1b,DP_PER_UNIT_CHG_1B_LEN,DP_PER_UNIT_CHG_1B_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("dpPerUnitChg1b", beginDpPerUnitChg1b,DP_PER_UNIT_CHG_1B_LEN);
     }
   	}
     int localDpPerUnitChgTxt1bCounter = -1;
     public boolean isDpPerUnitChgTxt1bModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDpPerUnitChgTxt1bCounter != sharedCounter;
         localDpPerUnitChgTxt1bCounter = sharedCounter; return hasModified;
     }
	protected static final int DP_PER_UNIT_CHG_TXT_1B_LEN = 15;
	/**
	 * 	serialize this DpPerUnitChgTxt1b
	 */
   protected void serializeDpPerUnitChgTxt1b(char[] dpPerUnitChgTxt1b) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dpPerUnitChgTxt1b,0,getStringValue(),beginDpPerUnitChgTxt1b,DP_PER_UNIT_CHG_TXT_1B_LEN);
       localDpPerUnitChgTxt1bCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDpPerUnitChgTxt1bConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDpPerUnitChgTxt1b is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDpPerUnitChgTxt1b() {	 
   		return (substring(getStringValue(),beginDpPerUnitChgTxt1b,beginDpPerUnitChgTxt1b + DP_PER_UNIT_CHG_TXT_1B_LEN));
   	}
     int localDpFeatUnitDescrCounter = -1;
     public boolean isDpFeatUnitDescrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDpFeatUnitDescrCounter != sharedCounter;
         localDpFeatUnitDescrCounter = sharedCounter; return hasModified;
     }
	protected static final int DP_FEAT_UNIT_DESCR_LEN = 20;
	/**
	 * 	serialize this DpFeatUnitDescr
	 */
   protected void serializeDpFeatUnitDescr(char[] dpFeatUnitDescr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dpFeatUnitDescr,0,getStringValue(),beginDpFeatUnitDescr,DP_FEAT_UNIT_DESCR_LEN);
       localDpFeatUnitDescrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDpFeatUnitDescrConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDpFeatUnitDescr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDpFeatUnitDescr() {	 
   		return (substring(getStringValue(),beginDpFeatUnitDescr,beginDpFeatUnitDescr + DP_FEAT_UNIT_DESCR_LEN));
   	}




}
  
