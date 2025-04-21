package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyLsgPrevSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyLsgPrevSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyLsgPrevSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_LSG_PREV_LENGTH = 33;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsgPrvCustIdNo;
            protected  int beginLsgPrvAcctNo;
            protected  int beginLsgPrvShrGrpCompTyp;
            protected  int beginLsgPrvBlPerFromDt;
            protected  int beginLsgPrvBlPerToDt;
            protected  int beginLsgPrvShrGrpNo;
	
	/**
	* Constructor for KeyLsgPrevSerialized
	**/
    public KeyLsgPrevSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyLsgPrevSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyLsgPrevSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyLsgPrevSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,328); // serialize this field at offset 328 by default 
    }
    
	/**
	* sets parent for this KeyLsgPrevSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 328 by default
    }    
	/**
	* initializes the field in KeyLsgPrevSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_LSG_PREV_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsgPrvCustIdNo = getStartOffset() + 0;	// set offset for serialization
  
             beginLsgPrvAcctNo = getStartOffset() + 4;	// set offset for serialization
  
             beginLsgPrvShrGrpCompTyp = getStartOffset() + 8;	// set offset for serialization
  
             beginLsgPrvBlPerFromDt = getStartOffset() + 9;	// set offset for serialization
  
             beginLsgPrvBlPerToDt = getStartOffset() + 19;	// set offset for serialization
  
             beginLsgPrvShrGrpNo = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsgPrvCustIdNoCounter = -1;
         public boolean isLsgPrvCustIdNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsgPrvCustIdNoCounter != sharedCounter;
            localLsgPrvCustIdNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSG_PRV_CUST_ID_NO_LEN = 4;
  	/**
	 * serializeLsgPrvCustIdNo
	 */
	protected void serializeLsgPrvCustIdNo(int lsgPrvCustIdNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsgPrvCustIdNo,LSG_PRV_CUST_ID_NO_LEN)
                  ,beginLsgPrvCustIdNo
                  ,LSG_PRV_CUST_ID_NO_LEN
                 );
            localLsgPrvCustIdNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsgPrvCustIdNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsgPrvCustIdNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsgPrvCustIdNo() {	 
			return (getInt(beginLsgPrvCustIdNo));
   	}
         int localLsgPrvAcctNoCounter = -1;
         public boolean isLsgPrvAcctNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsgPrvAcctNoCounter != sharedCounter;
            localLsgPrvAcctNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSG_PRV_ACCT_NO_LEN = 4;
  	/**
	 * serializeLsgPrvAcctNo
	 */
	protected void serializeLsgPrvAcctNo(int lsgPrvAcctNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsgPrvAcctNo,LSG_PRV_ACCT_NO_LEN)
                  ,beginLsgPrvAcctNo
                  ,LSG_PRV_ACCT_NO_LEN
                 );
            localLsgPrvAcctNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsgPrvAcctNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsgPrvAcctNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsgPrvAcctNo() {	 
			return (getInt(beginLsgPrvAcctNo));
   	}
     int localLsgPrvShrGrpCompTypCounter = -1;
     public boolean isLsgPrvShrGrpCompTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsgPrvShrGrpCompTypCounter != sharedCounter;
         localLsgPrvShrGrpCompTypCounter = sharedCounter; return hasModified;
     }
	protected static final int LSG_PRV_SHR_GRP_COMP_TYP_LEN = 1;
	/**
	 * 	serialize this LsgPrvShrGrpCompTyp
	 */
   protected void serializeLsgPrvShrGrpCompTyp(char[] lsgPrvShrGrpCompTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsgPrvShrGrpCompTyp,0,getStringValue(),beginLsgPrvShrGrpCompTyp,LSG_PRV_SHR_GRP_COMP_TYP_LEN);
       localLsgPrvShrGrpCompTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsgPrvShrGrpCompTypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsgPrvShrGrpCompTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsgPrvShrGrpCompTyp() {	 
   		return (substring(getStringValue(),beginLsgPrvShrGrpCompTyp,beginLsgPrvShrGrpCompTyp + LSG_PRV_SHR_GRP_COMP_TYP_LEN));
   	}
     int localLsgPrvBlPerFromDtCounter = -1;
     public boolean isLsgPrvBlPerFromDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsgPrvBlPerFromDtCounter != sharedCounter;
         localLsgPrvBlPerFromDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LSG_PRV_BL_PER_FROM_DT_LEN = 10;
	/**
	 * 	serialize this LsgPrvBlPerFromDt
	 */
   protected void serializeLsgPrvBlPerFromDt(char[] lsgPrvBlPerFromDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsgPrvBlPerFromDt,0,getStringValue(),beginLsgPrvBlPerFromDt,LSG_PRV_BL_PER_FROM_DT_LEN);
       localLsgPrvBlPerFromDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsgPrvBlPerFromDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLsgPrvBlPerFromDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsgPrvBlPerFromDt() {	 
   		return (substring(getStringValue(),beginLsgPrvBlPerFromDt,beginLsgPrvBlPerFromDt + LSG_PRV_BL_PER_FROM_DT_LEN));
   	}
     int localLsgPrvBlPerToDtCounter = -1;
     public boolean isLsgPrvBlPerToDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsgPrvBlPerToDtCounter != sharedCounter;
         localLsgPrvBlPerToDtCounter = sharedCounter; return hasModified;
     }
	protected static final int LSG_PRV_BL_PER_TO_DT_LEN = 10;
	/**
	 * 	serialize this LsgPrvBlPerToDt
	 */
   protected void serializeLsgPrvBlPerToDt(char[] lsgPrvBlPerToDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsgPrvBlPerToDt,0,getStringValue(),beginLsgPrvBlPerToDt,LSG_PRV_BL_PER_TO_DT_LEN);
       localLsgPrvBlPerToDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsgPrvBlPerToDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshLsgPrvBlPerToDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsgPrvBlPerToDt() {	 
   		return (substring(getStringValue(),beginLsgPrvBlPerToDt,beginLsgPrvBlPerToDt + LSG_PRV_BL_PER_TO_DT_LEN));
   	}
         int localLsgPrvShrGrpNoCounter = -1;
         public boolean isLsgPrvShrGrpNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsgPrvShrGrpNoCounter != sharedCounter;
            localLsgPrvShrGrpNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int LSG_PRV_SHR_GRP_NO_LEN = 4;
  	/**
	 * serializeLsgPrvShrGrpNo
	 */
	protected void serializeLsgPrvShrGrpNo(int lsgPrvShrGrpNo) {
           replaceValue( //  save the value as string
                   getBinaryString( lsgPrvShrGrpNo,LSG_PRV_SHR_GRP_NO_LEN)
                  ,beginLsgPrvShrGrpNo
                  ,LSG_PRV_SHR_GRP_NO_LEN
                 );
            localLsgPrvShrGrpNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsgPrvShrGrpNoMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshLsgPrvShrGrpNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsgPrvShrGrpNo() {	 
			return (getInt(beginLsgPrvShrGrpNo));
   	}




}
  
