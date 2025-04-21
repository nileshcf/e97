package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WDatVarPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WDatVarPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WDatVarPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_DAT_VAR_PE_8090M_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWCntPerPe8090m;
            protected  int beginWCntFisPe8090m;
            protected  int beginWCntOblPe8090m;
            protected  int beginWCntRelPe8090m;
            protected  int beginWOcuTitPe8090m;
            protected  int beginWOblTitPe8090m;
            protected  int beginWCntGioPe8090m;
            protected  int beginWIndGioPe8090m;
            protected  int beginWMaxTitPe8090m;
            protected  int beginWPoiNtePe8090m;
            protected  int beginWPoiGuaPe8090m;
            protected  int beginWIdiApe;
	
	/**
	* Constructor for WDatVarPe8090mSerialized
	**/
    public WDatVarPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WDatVarPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WDatVarPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WDatVarPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2384); // serialize this field at offset 2384 by default 
    }
    
	/**
	* sets parent for this WDatVarPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2384 by default
    }    
	/**
	* initializes the field in WDatVarPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_DAT_VAR_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWCntPerPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWCntFisPe8090m = getStartOffset() + 2;	// set offset for serialization
  
             beginWCntOblPe8090m = getStartOffset() + 4;	// set offset for serialization
  
             beginWCntRelPe8090m = getStartOffset() + 6;	// set offset for serialization
  
             beginWOcuTitPe8090m = getStartOffset() + 8;	// set offset for serialization
  
             beginWOblTitPe8090m = getStartOffset() + 10;	// set offset for serialization
  
             beginWCntGioPe8090m = getStartOffset() + 12;	// set offset for serialization
  
             beginWIndGioPe8090m = getStartOffset() + 14;	// set offset for serialization
  
             beginWMaxTitPe8090m = getStartOffset() + 16;	// set offset for serialization
  
             beginWPoiNtePe8090m = getStartOffset() + 18;	// set offset for serialization
  
             beginWPoiGuaPe8090m = getStartOffset() + 20;	// set offset for serialization
  
             beginWIdiApe = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWCntPerPe8090mCounter = -1;
         public boolean isWCntPerPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCntPerPe8090mCounter != sharedCounter;
            localWCntPerPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CNT_PER_PE_8090M_LEN = 2;
  	/**
	 * serializeWCntPerPe8090m
	 */
	protected void serializeWCntPerPe8090m(int wCntPerPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCntPerPe8090m,W_CNT_PER_PE_8090M_LEN)
                  ,beginWCntPerPe8090m
                  ,W_CNT_PER_PE_8090M_LEN
                 );
            localWCntPerPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCntPerPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCntPerPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCntPerPe8090m() {	 
			return (getUnsignedShort(beginWCntPerPe8090m));
   	}
         int localWCntFisPe8090mCounter = -1;
         public boolean isWCntFisPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCntFisPe8090mCounter != sharedCounter;
            localWCntFisPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CNT_FIS_PE_8090M_LEN = 2;
  	/**
	 * serializeWCntFisPe8090m
	 */
	protected void serializeWCntFisPe8090m(int wCntFisPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCntFisPe8090m,W_CNT_FIS_PE_8090M_LEN)
                  ,beginWCntFisPe8090m
                  ,W_CNT_FIS_PE_8090M_LEN
                 );
            localWCntFisPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCntFisPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCntFisPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCntFisPe8090m() {	 
			return (getUnsignedShort(beginWCntFisPe8090m));
   	}
         int localWCntOblPe8090mCounter = -1;
         public boolean isWCntOblPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCntOblPe8090mCounter != sharedCounter;
            localWCntOblPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CNT_OBL_PE_8090M_LEN = 2;
  	/**
	 * serializeWCntOblPe8090m
	 */
	protected void serializeWCntOblPe8090m(int wCntOblPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCntOblPe8090m,W_CNT_OBL_PE_8090M_LEN)
                  ,beginWCntOblPe8090m
                  ,W_CNT_OBL_PE_8090M_LEN
                 );
            localWCntOblPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCntOblPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCntOblPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCntOblPe8090m() {	 
			return (getUnsignedShort(beginWCntOblPe8090m));
   	}
         int localWCntRelPe8090mCounter = -1;
         public boolean isWCntRelPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCntRelPe8090mCounter != sharedCounter;
            localWCntRelPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CNT_REL_PE_8090M_LEN = 2;
  	/**
	 * serializeWCntRelPe8090m
	 */
	protected void serializeWCntRelPe8090m(int wCntRelPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCntRelPe8090m,W_CNT_REL_PE_8090M_LEN)
                  ,beginWCntRelPe8090m
                  ,W_CNT_REL_PE_8090M_LEN
                 );
            localWCntRelPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCntRelPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCntRelPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCntRelPe8090m() {	 
			return (getUnsignedShort(beginWCntRelPe8090m));
   	}
         int localWOcuTitPe8090mCounter = -1;
         public boolean isWOcuTitPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWOcuTitPe8090mCounter != sharedCounter;
            localWOcuTitPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_OCU_TIT_PE_8090M_LEN = 2;
  	/**
	 * serializeWOcuTitPe8090m
	 */
	protected void serializeWOcuTitPe8090m(int wOcuTitPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wOcuTitPe8090m,W_OCU_TIT_PE_8090M_LEN)
                  ,beginWOcuTitPe8090m
                  ,W_OCU_TIT_PE_8090M_LEN
                 );
            localWOcuTitPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWOcuTitPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWOcuTitPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWOcuTitPe8090m() {	 
			return (getUnsignedShort(beginWOcuTitPe8090m));
   	}
         int localWOblTitPe8090mCounter = -1;
         public boolean isWOblTitPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWOblTitPe8090mCounter != sharedCounter;
            localWOblTitPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_OBL_TIT_PE_8090M_LEN = 2;
  	/**
	 * serializeWOblTitPe8090m
	 */
	protected void serializeWOblTitPe8090m(int wOblTitPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wOblTitPe8090m,W_OBL_TIT_PE_8090M_LEN)
                  ,beginWOblTitPe8090m
                  ,W_OBL_TIT_PE_8090M_LEN
                 );
            localWOblTitPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWOblTitPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWOblTitPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWOblTitPe8090m() {	 
			return (getUnsignedShort(beginWOblTitPe8090m));
   	}
         int localWCntGioPe8090mCounter = -1;
         public boolean isWCntGioPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCntGioPe8090mCounter != sharedCounter;
            localWCntGioPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CNT_GIO_PE_8090M_LEN = 2;
  	/**
	 * serializeWCntGioPe8090m
	 */
	protected void serializeWCntGioPe8090m(int wCntGioPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCntGioPe8090m,W_CNT_GIO_PE_8090M_LEN)
                  ,beginWCntGioPe8090m
                  ,W_CNT_GIO_PE_8090M_LEN
                 );
            localWCntGioPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCntGioPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCntGioPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCntGioPe8090m() {	 
			return (getUnsignedShort(beginWCntGioPe8090m));
   	}
         int localWIndGioPe8090mCounter = -1;
         public boolean isWIndGioPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIndGioPe8090mCounter != sharedCounter;
            localWIndGioPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_IND_GIO_PE_8090M_LEN = 2;
  	/**
	 * serializeWIndGioPe8090m
	 */
	protected void serializeWIndGioPe8090m(int wIndGioPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wIndGioPe8090m,W_IND_GIO_PE_8090M_LEN)
                  ,beginWIndGioPe8090m
                  ,W_IND_GIO_PE_8090M_LEN
                 );
            localWIndGioPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIndGioPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIndGioPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIndGioPe8090m() {	 
			return (getUnsignedShort(beginWIndGioPe8090m));
   	}
         int localWMaxTitPe8090mCounter = -1;
         public boolean isWMaxTitPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWMaxTitPe8090mCounter != sharedCounter;
            localWMaxTitPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_MAX_TIT_PE_8090M_LEN = 2;
  	/**
	 * serializeWMaxTitPe8090m
	 */
	protected void serializeWMaxTitPe8090m(int wMaxTitPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wMaxTitPe8090m,W_MAX_TIT_PE_8090M_LEN)
                  ,beginWMaxTitPe8090m
                  ,W_MAX_TIT_PE_8090M_LEN
                 );
            localWMaxTitPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWMaxTitPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWMaxTitPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWMaxTitPe8090m() {	 
			return (getUnsignedShort(beginWMaxTitPe8090m));
   	}
         int localWPoiNtePe8090mCounter = -1;
         public boolean isWPoiNtePe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWPoiNtePe8090mCounter != sharedCounter;
            localWPoiNtePe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_POI_NTE_PE_8090M_LEN = 2;
  	/**
	 * serializeWPoiNtePe8090m
	 */
	protected void serializeWPoiNtePe8090m(int wPoiNtePe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wPoiNtePe8090m,W_POI_NTE_PE_8090M_LEN)
                  ,beginWPoiNtePe8090m
                  ,W_POI_NTE_PE_8090M_LEN
                 );
            localWPoiNtePe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWPoiNtePe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWPoiNtePe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWPoiNtePe8090m() {	 
			return (getUnsignedShort(beginWPoiNtePe8090m));
   	}
         int localWPoiGuaPe8090mCounter = -1;
         public boolean isWPoiGuaPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWPoiGuaPe8090mCounter != sharedCounter;
            localWPoiGuaPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_POI_GUA_PE_8090M_LEN = 2;
  	/**
	 * serializeWPoiGuaPe8090m
	 */
	protected void serializeWPoiGuaPe8090m(int wPoiGuaPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wPoiGuaPe8090m,W_POI_GUA_PE_8090M_LEN)
                  ,beginWPoiGuaPe8090m
                  ,W_POI_GUA_PE_8090M_LEN
                 );
            localWPoiGuaPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWPoiGuaPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWPoiGuaPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWPoiGuaPe8090m() {	 
			return (getUnsignedShort(beginWPoiGuaPe8090m));
   	}
     int localWIdiApeCounter = -1;
     public boolean isWIdiApeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWIdiApeCounter != sharedCounter;
         localWIdiApeCounter = sharedCounter; return hasModified;
     }
	protected static final int W_IDI_APE_LEN = 2;
	/**
	 * 	serialize this WIdiApe
	 */
   protected void serializeWIdiApe(char[] wIdiApe) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wIdiApe,0,getStringValue(),beginWIdiApe,W_IDI_APE_LEN);
       localWIdiApeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWIdiApeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWIdiApe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWIdiApe() {	 
   		return (substring(getStringValue(),beginWIdiApe,beginWIdiApe + W_IDI_APE_LEN));
   	}




}
  
