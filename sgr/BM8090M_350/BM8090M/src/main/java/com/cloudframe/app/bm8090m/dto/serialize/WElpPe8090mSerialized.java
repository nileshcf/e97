package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WElpPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WElpPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WElpPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_ELP_PE_8090M_LENGTH = 228;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWTipPe8090m;
            protected  int beginWIeqPe8090m;
            protected  int beginWNomPe8090m;
            protected  int beginWNcaNomPe8090m;
            protected  int beginWNo1Pe8090m;
            protected  int beginWNcaNo1Pe8090m;
            protected  int beginWNo2Pe8090m;
            protected  int beginWNcaNo2Pe8090m;
            protected  int beginWNsePerPe8090m;
            protected  int beginWIsePe8090m;
            protected  int beginWMasSepPe8090m;
            protected  int beginWTmaSepPe8090m;
            protected  int beginWNmaSepPe8090m;
            protected  int beginWPerGruPe8090m;
            protected  int beginWTpeNrePe8090m;
            protected  int beginWNomNrePe8090m;
            protected  int beginWPraNrePe8090m;
            protected  int beginWSeaNrePe8090m;
            protected  int beginWCpeNomPe8090m;
	
	/**
	* Constructor for WElpPe8090mSerialized
	**/
    public WElpPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WElpPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WElpPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WElpPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,528); // serialize this field at offset 528 by default 
    }
    
	/**
	* sets parent for this WElpPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 528 by default
    }    
	/**
	* initializes the field in WElpPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_ELP_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWTipPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWIeqPe8090m = getStartOffset() + 2;	// set offset for serialization
  
             beginWNomPe8090m = getStartOffset() + 4;	// set offset for serialization
  
             beginWNcaNomPe8090m = getStartOffset() + 66;	// set offset for serialization
  
             beginWNo1Pe8090m = getStartOffset() + 68;	// set offset for serialization
  
             beginWNcaNo1Pe8090m = getStartOffset() + 108;	// set offset for serialization
  
             beginWNo2Pe8090m = getStartOffset() + 110;	// set offset for serialization
  
             beginWNcaNo2Pe8090m = getStartOffset() + 134;	// set offset for serialization
  
             beginWNsePerPe8090m = getStartOffset() + 136;	// set offset for serialization
  
             beginWIsePe8090m = getStartOffset() + 138;	// set offset for serialization
  
             beginWMasSepPe8090m = getStartOffset() + 140;	// set offset for serialization
  
             beginWTmaSepPe8090m = getStartOffset() + 158;	// set offset for serialization
  
             beginWNmaSepPe8090m = getStartOffset() + 160;	// set offset for serialization
  
             beginWPerGruPe8090m = getStartOffset() + 162;	// set offset for serialization
  
             beginWTpeNrePe8090m = getStartOffset() + 164;	// set offset for serialization
  
             beginWNomNrePe8090m = getStartOffset() + 166;	// set offset for serialization
  
             beginWPraNrePe8090m = getStartOffset() + 186;	// set offset for serialization
  
             beginWSeaNrePe8090m = getStartOffset() + 206;	// set offset for serialization
  
             beginWCpeNomPe8090m = getStartOffset() + 226;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWTipPe8090mCounter = -1;
         public boolean isWTipPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTipPe8090mCounter != sharedCounter;
            localWTipPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TIP_PE_8090M_LEN = 2;
  	/**
	 * serializeWTipPe8090m
	 */
	protected void serializeWTipPe8090m(int wTipPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTipPe8090m,W_TIP_PE_8090M_LEN)
                  ,beginWTipPe8090m
                  ,W_TIP_PE_8090M_LEN
                 );
            localWTipPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTipPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTipPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTipPe8090m() {	 
			return (getUnsignedShort(beginWTipPe8090m));
   	}
         int localWIeqPe8090mCounter = -1;
         public boolean isWIeqPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIeqPe8090mCounter != sharedCounter;
            localWIeqPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_IEQ_PE_8090M_LEN = 2;
  	/**
	 * serializeWIeqPe8090m
	 */
	protected void serializeWIeqPe8090m(int wIeqPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wIeqPe8090m,W_IEQ_PE_8090M_LEN)
                  ,beginWIeqPe8090m
                  ,W_IEQ_PE_8090M_LEN
                 );
            localWIeqPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIeqPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIeqPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIeqPe8090m() {	 
			return (getUnsignedShort(beginWIeqPe8090m));
   	}
     int localWNomPe8090mCounter = -1;
     public boolean isWNomPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomPe8090mCounter != sharedCounter;
         localWNomPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NOM_PE_8090M_LEN = 62;
	/**
	 * 	serialize this WNomPe8090m
	 */
   protected void serializeWNomPe8090m(char[] wNomPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNomPe8090m,0,getStringValue(),beginWNomPe8090m,W_NOM_PE_8090M_LEN);
       localWNomPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNomPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 62 ,false, false);
   }
    /**
	 *	refreshWNomPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNomPe8090m() {	 
   		return (substring(getStringValue(),beginWNomPe8090m,beginWNomPe8090m + W_NOM_PE_8090M_LEN));
   	}
         int localWNcaNomPe8090mCounter = -1;
         public boolean isWNcaNomPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNcaNomPe8090mCounter != sharedCounter;
            localWNcaNomPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NCA_NOM_PE_8090M_LEN = 2;
  	/**
	 * serializeWNcaNomPe8090m
	 */
	protected void serializeWNcaNomPe8090m(int wNcaNomPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNcaNomPe8090m,W_NCA_NOM_PE_8090M_LEN)
                  ,beginWNcaNomPe8090m
                  ,W_NCA_NOM_PE_8090M_LEN
                 );
            localWNcaNomPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNcaNomPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNcaNomPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNcaNomPe8090m() {	 
			return (getUnsignedShort(beginWNcaNomPe8090m));
   	}
     int localWNo1Pe8090mCounter = -1;
     public boolean isWNo1Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNo1Pe8090mCounter != sharedCounter;
         localWNo1Pe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NO_1_PE_8090M_LEN = 40;
	/**
	 * 	serialize this WNo1Pe8090m
	 */
   protected void serializeWNo1Pe8090m(char[] wNo1Pe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNo1Pe8090m,0,getStringValue(),beginWNo1Pe8090m,W_NO_1_PE_8090M_LEN);
       localWNo1Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNo1Pe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWNo1Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNo1Pe8090m() {	 
   		return (substring(getStringValue(),beginWNo1Pe8090m,beginWNo1Pe8090m + W_NO_1_PE_8090M_LEN));
   	}
         int localWNcaNo1Pe8090mCounter = -1;
         public boolean isWNcaNo1Pe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNcaNo1Pe8090mCounter != sharedCounter;
            localWNcaNo1Pe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NCA_NO_1_PE_8090M_LEN = 2;
  	/**
	 * serializeWNcaNo1Pe8090m
	 */
	protected void serializeWNcaNo1Pe8090m(int wNcaNo1Pe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNcaNo1Pe8090m,W_NCA_NO_1_PE_8090M_LEN)
                  ,beginWNcaNo1Pe8090m
                  ,W_NCA_NO_1_PE_8090M_LEN
                 );
            localWNcaNo1Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNcaNo1Pe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNcaNo1Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNcaNo1Pe8090m() {	 
			return (getUnsignedShort(beginWNcaNo1Pe8090m));
   	}
     int localWNo2Pe8090mCounter = -1;
     public boolean isWNo2Pe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNo2Pe8090mCounter != sharedCounter;
         localWNo2Pe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NO_2_PE_8090M_LEN = 24;
	/**
	 * 	serialize this WNo2Pe8090m
	 */
   protected void serializeWNo2Pe8090m(char[] wNo2Pe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNo2Pe8090m,0,getStringValue(),beginWNo2Pe8090m,W_NO_2_PE_8090M_LEN);
       localWNo2Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNo2Pe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshWNo2Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNo2Pe8090m() {	 
   		return (substring(getStringValue(),beginWNo2Pe8090m,beginWNo2Pe8090m + W_NO_2_PE_8090M_LEN));
   	}
         int localWNcaNo2Pe8090mCounter = -1;
         public boolean isWNcaNo2Pe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNcaNo2Pe8090mCounter != sharedCounter;
            localWNcaNo2Pe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NCA_NO_2_PE_8090M_LEN = 2;
  	/**
	 * serializeWNcaNo2Pe8090m
	 */
	protected void serializeWNcaNo2Pe8090m(int wNcaNo2Pe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNcaNo2Pe8090m,W_NCA_NO_2_PE_8090M_LEN)
                  ,beginWNcaNo2Pe8090m
                  ,W_NCA_NO_2_PE_8090M_LEN
                 );
            localWNcaNo2Pe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNcaNo2Pe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNcaNo2Pe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNcaNo2Pe8090m() {	 
			return (getUnsignedShort(beginWNcaNo2Pe8090m));
   	}
         int localWNsePerPe8090mCounter = -1;
         public boolean isWNsePerPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNsePerPe8090mCounter != sharedCounter;
            localWNsePerPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NSE_PER_PE_8090M_LEN = 2;
  	/**
	 * serializeWNsePerPe8090m
	 */
	protected void serializeWNsePerPe8090m(int wNsePerPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNsePerPe8090m,W_NSE_PER_PE_8090M_LEN)
                  ,beginWNsePerPe8090m
                  ,W_NSE_PER_PE_8090M_LEN
                 );
            localWNsePerPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNsePerPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNsePerPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNsePerPe8090m() {	 
			return (getUnsignedShort(beginWNsePerPe8090m));
   	}
         int localWIsePe8090mCounter = -1;
         public boolean isWIsePe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIsePe8090mCounter != sharedCounter;
            localWIsePe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_ISE_PE_8090M_LEN = 2;
  	/**
	 * serializeWIsePe8090m
	 */
	protected void serializeWIsePe8090m(int wIsePe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wIsePe8090m,W_ISE_PE_8090M_LEN)
                  ,beginWIsePe8090m
                  ,W_ISE_PE_8090M_LEN
                 );
            localWIsePe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIsePe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIsePe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIsePe8090m() {	 
			return (getUnsignedShort(beginWIsePe8090m));
   	}
     int localWMasSepPe8090mCounter = -1;
     public boolean isWMasSepPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMasSepPe8090mCounter != sharedCounter;
         localWMasSepPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_MAS_SEP_PE_8090M_LEN = 18;
	/**
	 * 	serialize this WMasSepPe8090m
	 */
   protected void serializeWMasSepPe8090m(char[] wMasSepPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wMasSepPe8090m,0,getStringValue(),beginWMasSepPe8090m,W_MAS_SEP_PE_8090M_LEN);
       localWMasSepPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWMasSepPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshWMasSepPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWMasSepPe8090m() {	 
   		return (substring(getStringValue(),beginWMasSepPe8090m,beginWMasSepPe8090m + W_MAS_SEP_PE_8090M_LEN));
   	}
         int localWTmaSepPe8090mCounter = -1;
         public boolean isWTmaSepPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTmaSepPe8090mCounter != sharedCounter;
            localWTmaSepPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TMA_SEP_PE_8090M_LEN = 2;
  	/**
	 * serializeWTmaSepPe8090m
	 */
	protected void serializeWTmaSepPe8090m(int wTmaSepPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTmaSepPe8090m,W_TMA_SEP_PE_8090M_LEN)
                  ,beginWTmaSepPe8090m
                  ,W_TMA_SEP_PE_8090M_LEN
                 );
            localWTmaSepPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTmaSepPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTmaSepPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTmaSepPe8090m() {	 
			return (getUnsignedShort(beginWTmaSepPe8090m));
   	}
         int localWNmaSepPe8090mCounter = -1;
         public boolean isWNmaSepPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNmaSepPe8090mCounter != sharedCounter;
            localWNmaSepPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NMA_SEP_PE_8090M_LEN = 2;
  	/**
	 * serializeWNmaSepPe8090m
	 */
	protected void serializeWNmaSepPe8090m(int wNmaSepPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNmaSepPe8090m,W_NMA_SEP_PE_8090M_LEN)
                  ,beginWNmaSepPe8090m
                  ,W_NMA_SEP_PE_8090M_LEN
                 );
            localWNmaSepPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNmaSepPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNmaSepPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNmaSepPe8090m() {	 
			return (getUnsignedShort(beginWNmaSepPe8090m));
   	}
         int localWPerGruPe8090mCounter = -1;
         public boolean isWPerGruPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWPerGruPe8090mCounter != sharedCounter;
            localWPerGruPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_PER_GRU_PE_8090M_LEN = 2;
  	/**
	 * serializeWPerGruPe8090m
	 */
	protected void serializeWPerGruPe8090m(int wPerGruPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wPerGruPe8090m,W_PER_GRU_PE_8090M_LEN)
                  ,beginWPerGruPe8090m
                  ,W_PER_GRU_PE_8090M_LEN
                 );
            localWPerGruPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWPerGruPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWPerGruPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWPerGruPe8090m() {	 
			return (getUnsignedShort(beginWPerGruPe8090m));
   	}
         int localWTpeNrePe8090mCounter = -1;
         public boolean isWTpeNrePe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTpeNrePe8090mCounter != sharedCounter;
            localWTpeNrePe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TPE_NRE_PE_8090M_LEN = 2;
  	/**
	 * serializeWTpeNrePe8090m
	 */
	protected void serializeWTpeNrePe8090m(int wTpeNrePe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTpeNrePe8090m,W_TPE_NRE_PE_8090M_LEN)
                  ,beginWTpeNrePe8090m
                  ,W_TPE_NRE_PE_8090M_LEN
                 );
            localWTpeNrePe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTpeNrePe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTpeNrePe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTpeNrePe8090m() {	 
			return (getUnsignedShort(beginWTpeNrePe8090m));
   	}
     int localWNomNrePe8090mCounter = -1;
     public boolean isWNomNrePe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomNrePe8090mCounter != sharedCounter;
         localWNomNrePe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NOM_NRE_PE_8090M_LEN = 20;
	/**
	 * 	serialize this WNomNrePe8090m
	 */
   protected void serializeWNomNrePe8090m(char[] wNomNrePe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNomNrePe8090m,0,getStringValue(),beginWNomNrePe8090m,W_NOM_NRE_PE_8090M_LEN);
       localWNomNrePe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNomNrePe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWNomNrePe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNomNrePe8090m() {	 
   		return (substring(getStringValue(),beginWNomNrePe8090m,beginWNomNrePe8090m + W_NOM_NRE_PE_8090M_LEN));
   	}
     int localWPraNrePe8090mCounter = -1;
     public boolean isWPraNrePe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPraNrePe8090mCounter != sharedCounter;
         localWPraNrePe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PRA_NRE_PE_8090M_LEN = 20;
	/**
	 * 	serialize this WPraNrePe8090m
	 */
   protected void serializeWPraNrePe8090m(char[] wPraNrePe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPraNrePe8090m,0,getStringValue(),beginWPraNrePe8090m,W_PRA_NRE_PE_8090M_LEN);
       localWPraNrePe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPraNrePe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWPraNrePe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPraNrePe8090m() {	 
   		return (substring(getStringValue(),beginWPraNrePe8090m,beginWPraNrePe8090m + W_PRA_NRE_PE_8090M_LEN));
   	}
     int localWSeaNrePe8090mCounter = -1;
     public boolean isWSeaNrePe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSeaNrePe8090mCounter != sharedCounter;
         localWSeaNrePe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_SEA_NRE_PE_8090M_LEN = 20;
	/**
	 * 	serialize this WSeaNrePe8090m
	 */
   protected void serializeWSeaNrePe8090m(char[] wSeaNrePe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wSeaNrePe8090m,0,getStringValue(),beginWSeaNrePe8090m,W_SEA_NRE_PE_8090M_LEN);
       localWSeaNrePe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWSeaNrePe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWSeaNrePe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWSeaNrePe8090m() {	 
   		return (substring(getStringValue(),beginWSeaNrePe8090m,beginWSeaNrePe8090m + W_SEA_NRE_PE_8090M_LEN));
   	}
         int localWCpeNomPe8090mCounter = -1;
         public boolean isWCpeNomPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCpeNomPe8090mCounter != sharedCounter;
            localWCpeNomPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CPE_NOM_PE_8090M_LEN = 2;
  	/**
	 * serializeWCpeNomPe8090m
	 */
	protected void serializeWCpeNomPe8090m(int wCpeNomPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCpeNomPe8090m,W_CPE_NOM_PE_8090M_LEN)
                  ,beginWCpeNomPe8090m
                  ,W_CPE_NOM_PE_8090M_LEN
                 );
            localWCpeNomPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCpeNomPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCpeNomPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCpeNomPe8090m() {	 
			return (getUnsignedShort(beginWCpeNomPe8090m));
   	}




}
  
