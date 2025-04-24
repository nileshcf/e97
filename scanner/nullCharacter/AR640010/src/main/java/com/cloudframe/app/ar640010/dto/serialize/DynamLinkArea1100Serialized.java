package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamLinkArea1100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DynamLinkArea1100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamLinkArea1100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_LINK_AREA_1100_LENGTH = 2048;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamLength1100;
            protected  int beginDynamSvc99Rc1100;
            protected  int beginDynamSvc99Err1100;
            protected  int beginDynamSvc99Inf1100;
            protected  int beginDynamPackWa1100;
            protected  int beginDynamEndWaAddr1100;
            protected  int beginDynamKeywdAddr1100;
            protected  int beginDynamStrtValue1100;
            protected  int beginDynamStrtVerb1100;
            protected  int beginDynamReqBlock1100;
            protected  int beginDynamDairFail1100;
            protected  int beginDynamIkjeff021100;
            protected  int beginDynamLastTu1100;
            protected  int beginDynamDairfailSa1100;
	
	/**
	* Constructor for DynamLinkArea1100Serialized
	**/
    public DynamLinkArea1100Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DynamLinkArea1100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_LINK_AREA_1100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDynamLength1100 = getStartOffset() + 0;	// set offset for serialization
  
             beginDynamSvc99Rc1100 = getStartOffset() + 4;	// set offset for serialization
  
             beginDynamSvc99Err1100 = getStartOffset() + 8;	// set offset for serialization
  
             beginDynamSvc99Inf1100 = getStartOffset() + 12;	// set offset for serialization
  
             beginDynamPackWa1100 = getStartOffset() + 16;	// set offset for serialization
  
             beginDynamEndWaAddr1100 = getStartOffset() + 24;	// set offset for serialization
  
             beginDynamKeywdAddr1100 = getStartOffset() + 28;	// set offset for serialization
  
             beginDynamStrtValue1100 = getStartOffset() + 32;	// set offset for serialization
  
             beginDynamStrtVerb1100 = getStartOffset() + 36;	// set offset for serialization
  
             beginDynamReqBlock1100 = getStartOffset() + 40;	// set offset for serialization
  
             beginDynamDairFail1100 = getStartOffset() + 44;	// set offset for serialization
  
             beginDynamIkjeff021100 = getStartOffset() + 48;	// set offset for serialization
  
             beginDynamLastTu1100 = getStartOffset() + 52;	// set offset for serialization
  
             beginDynamDairfailSa1100 = getStartOffset() + 56;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
         int localDynamLength1100Counter = -1;
         public boolean isDynamLength1100Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDynamLength1100Counter != sharedCounter;
            localDynamLength1100Counter = sharedCounter; return hasModified; 
         }
   protected static final int DYNAM_LENGTH_1100_LEN = 4;
  	/**
	 * serializeDynamLength1100
	 */
	protected void serializeDynamLength1100(int dynamLength1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamLength1100,DYNAM_LENGTH_1100_LEN)
                  ,beginDynamLength1100
                  ,DYNAM_LENGTH_1100_LEN
                 );
            localDynamLength1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamLength1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamLength1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamLength1100() {	 
			return (getInt(beginDynamLength1100));
   	}
         int localDynamSvc99Rc1100Counter = -1;
         public boolean isDynamSvc99Rc1100Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDynamSvc99Rc1100Counter != sharedCounter;
            localDynamSvc99Rc1100Counter = sharedCounter; return hasModified; 
         }
   protected static final int DYNAM_SVC_99_RC_1100_LEN = 4;
  	/**
	 * serializeDynamSvc99Rc1100
	 */
	protected void serializeDynamSvc99Rc1100(int dynamSvc99Rc1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamSvc99Rc1100,DYNAM_SVC_99_RC_1100_LEN)
                  ,beginDynamSvc99Rc1100
                  ,DYNAM_SVC_99_RC_1100_LEN
                 );
            localDynamSvc99Rc1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamSvc99Rc1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamSvc99Rc1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamSvc99Rc1100() {	 
			return (getInt(beginDynamSvc99Rc1100));
   	}
         int localDynamSvc99Err1100Counter = -1;
         public boolean isDynamSvc99Err1100Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDynamSvc99Err1100Counter != sharedCounter;
            localDynamSvc99Err1100Counter = sharedCounter; return hasModified; 
         }
   protected static final int DYNAM_SVC_99_ERR_1100_LEN = 4;
  	/**
	 * serializeDynamSvc99Err1100
	 */
	protected void serializeDynamSvc99Err1100(int dynamSvc99Err1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamSvc99Err1100,DYNAM_SVC_99_ERR_1100_LEN)
                  ,beginDynamSvc99Err1100
                  ,DYNAM_SVC_99_ERR_1100_LEN
                 );
            localDynamSvc99Err1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamSvc99Err1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamSvc99Err1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamSvc99Err1100() {	 
			return (getInt(beginDynamSvc99Err1100));
   	}
         int localDynamSvc99Inf1100Counter = -1;
         public boolean isDynamSvc99Inf1100Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDynamSvc99Inf1100Counter != sharedCounter;
            localDynamSvc99Inf1100Counter = sharedCounter; return hasModified; 
         }
   protected static final int DYNAM_SVC_99_INF_1100_LEN = 4;
  	/**
	 * serializeDynamSvc99Inf1100
	 */
	protected void serializeDynamSvc99Inf1100(int dynamSvc99Inf1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamSvc99Inf1100,DYNAM_SVC_99_INF_1100_LEN)
                  ,beginDynamSvc99Inf1100
                  ,DYNAM_SVC_99_INF_1100_LEN
                 );
            localDynamSvc99Inf1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamSvc99Inf1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamSvc99Inf1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamSvc99Inf1100() {	 
			return (getInt(beginDynamSvc99Inf1100));
   	}
        int localDynamPackWa1100Counter = -1;
        public boolean isDynamPackWa1100Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDynamPackWa1100Counter != sharedCounter;
           localDynamPackWa1100Counter = sharedCounter; return hasModified; 
        }
	    public boolean dynamPackWa1100IsNumeric() {
	      return decimalIsNumeric(beginDynamPackWa1100,DYNAM_PACK_WA_1100_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DYNAM_PACK_WA_1100_LEN = 8;
  	/**
	 * 	serializeDynamPackWa1100
	 */
	protected void serializeDynamPackWa1100(long dynamPackWa1100) {
		   putDecimal(beginDynamPackWa1100,dynamPackWa1100,DYNAM_PACK_WA_1100_LEN,true);
   }
   

   protected long checkDynamPackWa1100MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshDynamPackWa1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDynamPackWa1100() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDynamPackWa1100,DYNAM_PACK_WA_1100_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dynamPackWa1100", beginDynamPackWa1100,DYNAM_PACK_WA_1100_LEN);
     }
   	}
     int localDynamEndWaAddr1100Counter = -1;
     public boolean isDynamEndWaAddr1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamEndWaAddr1100Counter != sharedCounter;
         localDynamEndWaAddr1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_END_WA_ADDR_1100_LEN = 4;
  	/**
	 * serializeDynamEndWaAddr1100
	 */
	protected void serializeDynamEndWaAddr1100(int dynamEndWaAddr1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamEndWaAddr1100,DYNAM_END_WA_ADDR_1100_LEN)
                  ,beginDynamEndWaAddr1100
                  ,DYNAM_END_WA_ADDR_1100_LEN
                 );
            localDynamEndWaAddr1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamEndWaAddr1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamEndWaAddr1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamEndWaAddr1100() {	 
			return (getInt(beginDynamEndWaAddr1100));
   	}
     int localDynamKeywdAddr1100Counter = -1;
     public boolean isDynamKeywdAddr1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamKeywdAddr1100Counter != sharedCounter;
         localDynamKeywdAddr1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_KEYWD_ADDR_1100_LEN = 4;
  	/**
	 * serializeDynamKeywdAddr1100
	 */
	protected void serializeDynamKeywdAddr1100(int dynamKeywdAddr1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamKeywdAddr1100,DYNAM_KEYWD_ADDR_1100_LEN)
                  ,beginDynamKeywdAddr1100
                  ,DYNAM_KEYWD_ADDR_1100_LEN
                 );
            localDynamKeywdAddr1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamKeywdAddr1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamKeywdAddr1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamKeywdAddr1100() {	 
			return (getInt(beginDynamKeywdAddr1100));
   	}
     int localDynamStrtValue1100Counter = -1;
     public boolean isDynamStrtValue1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamStrtValue1100Counter != sharedCounter;
         localDynamStrtValue1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_STRT_VALUE_1100_LEN = 4;
  	/**
	 * serializeDynamStrtValue1100
	 */
	protected void serializeDynamStrtValue1100(int dynamStrtValue1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamStrtValue1100,DYNAM_STRT_VALUE_1100_LEN)
                  ,beginDynamStrtValue1100
                  ,DYNAM_STRT_VALUE_1100_LEN
                 );
            localDynamStrtValue1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamStrtValue1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamStrtValue1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamStrtValue1100() {	 
			return (getInt(beginDynamStrtValue1100));
   	}
     int localDynamStrtVerb1100Counter = -1;
     public boolean isDynamStrtVerb1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamStrtVerb1100Counter != sharedCounter;
         localDynamStrtVerb1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_STRT_VERB_1100_LEN = 4;
  	/**
	 * serializeDynamStrtVerb1100
	 */
	protected void serializeDynamStrtVerb1100(int dynamStrtVerb1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamStrtVerb1100,DYNAM_STRT_VERB_1100_LEN)
                  ,beginDynamStrtVerb1100
                  ,DYNAM_STRT_VERB_1100_LEN
                 );
            localDynamStrtVerb1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamStrtVerb1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamStrtVerb1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamStrtVerb1100() {	 
			return (getInt(beginDynamStrtVerb1100));
   	}
     int localDynamReqBlock1100Counter = -1;
     public boolean isDynamReqBlock1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamReqBlock1100Counter != sharedCounter;
         localDynamReqBlock1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_REQ_BLOCK_1100_LEN = 4;
  	/**
	 * serializeDynamReqBlock1100
	 */
	protected void serializeDynamReqBlock1100(int dynamReqBlock1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamReqBlock1100,DYNAM_REQ_BLOCK_1100_LEN)
                  ,beginDynamReqBlock1100
                  ,DYNAM_REQ_BLOCK_1100_LEN
                 );
            localDynamReqBlock1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamReqBlock1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamReqBlock1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamReqBlock1100() {	 
			return (getInt(beginDynamReqBlock1100));
   	}
     int localDynamDairFail1100Counter = -1;
     public boolean isDynamDairFail1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamDairFail1100Counter != sharedCounter;
         localDynamDairFail1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_DAIR_FAIL_1100_LEN = 4;
  	/**
	 * serializeDynamDairFail1100
	 */
	protected void serializeDynamDairFail1100(int dynamDairFail1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamDairFail1100,DYNAM_DAIR_FAIL_1100_LEN)
                  ,beginDynamDairFail1100
                  ,DYNAM_DAIR_FAIL_1100_LEN
                 );
            localDynamDairFail1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamDairFail1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamDairFail1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamDairFail1100() {	 
			return (getInt(beginDynamDairFail1100));
   	}
     int localDynamIkjeff021100Counter = -1;
     public boolean isDynamIkjeff021100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamIkjeff021100Counter != sharedCounter;
         localDynamIkjeff021100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_IKJEFF_021100_LEN = 4;
  	/**
	 * serializeDynamIkjeff021100
	 */
	protected void serializeDynamIkjeff021100(int dynamIkjeff021100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamIkjeff021100,DYNAM_IKJEFF_021100_LEN)
                  ,beginDynamIkjeff021100
                  ,DYNAM_IKJEFF_021100_LEN
                 );
            localDynamIkjeff021100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamIkjeff021100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamIkjeff021100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamIkjeff021100() {	 
			return (getInt(beginDynamIkjeff021100));
   	}
     int localDynamLastTu1100Counter = -1;
     public boolean isDynamLastTu1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamLastTu1100Counter != sharedCounter;
         localDynamLastTu1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_LAST_TU_1100_LEN = 4;
  	/**
	 * serializeDynamLastTu1100
	 */
	protected void serializeDynamLastTu1100(int dynamLastTu1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamLastTu1100,DYNAM_LAST_TU_1100_LEN)
                  ,beginDynamLastTu1100
                  ,DYNAM_LAST_TU_1100_LEN
                 );
            localDynamLastTu1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamLastTu1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamLastTu1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamLastTu1100() {	 
			return (getInt(beginDynamLastTu1100));
   	}
     int localDynamDairfailSa1100Counter = -1;
     public boolean isDynamDairfailSa1100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamDairfailSa1100Counter != sharedCounter;
         localDynamDairfailSa1100Counter = sharedCounter; return hasModified; 
     }
   protected static final int DYNAM_DAIRFAIL_SA_1100_LEN = 4;
  	/**
	 * serializeDynamDairfailSa1100
	 */
	protected void serializeDynamDairfailSa1100(int dynamDairfailSa1100) {
           replaceValue( //  save the value as string
                   getBinaryString( dynamDairfailSa1100,DYNAM_DAIRFAIL_SA_1100_LEN)
                  ,beginDynamDairfailSa1100
                  ,DYNAM_DAIRFAIL_SA_1100_LEN
                 );
            localDynamDairfailSa1100Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDynamDairfailSa1100MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDynamDairfailSa1100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDynamDairfailSa1100() {	 
			return (getInt(beginDynamDairfailSa1100));
   	}




}
  
