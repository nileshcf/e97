package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WZonAlmPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WZonAlmPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WZonAlmPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_ZON_ALM_PE_8090M_LENGTH = 196;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWTipAlmPe8090m;
            protected  int beginWIeqAlmPe8090m;
            protected  int beginWNomAlmPe8090m;
            protected  int beginWNcnAlmPe8090m;
            protected  int beginWNo1AlmPe8090m;
            protected  int beginWNc1AlmPe8090m;
            protected  int beginWNo2AlmPe8090m;
            protected  int beginWNc2AlmPe8090m;
            protected  int beginWNreAlmPe8090m;
            protected  int beginWPraAlmPe8090m;
            protected  int beginWSeaAlmPe8090m;
            protected  int beginWCpeAlmPe8090m;
	
	/**
	* Constructor for WZonAlmPe8090mSerialized
	**/
    public WZonAlmPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WZonAlmPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WZonAlmPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WZonAlmPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2408); // serialize this field at offset 2408 by default 
    }
    
	/**
	* sets parent for this WZonAlmPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2408 by default
    }    
	/**
	* initializes the field in WZonAlmPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_ZON_ALM_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWTipAlmPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWIeqAlmPe8090m = getStartOffset() + 2;	// set offset for serialization
  
             beginWNomAlmPe8090m = getStartOffset() + 4;	// set offset for serialization
  
             beginWNcnAlmPe8090m = getStartOffset() + 64;	// set offset for serialization
  
             beginWNo1AlmPe8090m = getStartOffset() + 66;	// set offset for serialization
  
             beginWNc1AlmPe8090m = getStartOffset() + 106;	// set offset for serialization
  
             beginWNo2AlmPe8090m = getStartOffset() + 108;	// set offset for serialization
  
             beginWNc2AlmPe8090m = getStartOffset() + 132;	// set offset for serialization
  
             beginWNreAlmPe8090m = getStartOffset() + 134;	// set offset for serialization
  
             beginWPraAlmPe8090m = getStartOffset() + 154;	// set offset for serialization
  
             beginWSeaAlmPe8090m = getStartOffset() + 174;	// set offset for serialization
  
             beginWCpeAlmPe8090m = getStartOffset() + 194;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWTipAlmPe8090mCounter = -1;
         public boolean isWTipAlmPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTipAlmPe8090mCounter != sharedCounter;
            localWTipAlmPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TIP_ALM_PE_8090M_LEN = 2;
  	/**
	 * serializeWTipAlmPe8090m
	 */
	protected void serializeWTipAlmPe8090m(int wTipAlmPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTipAlmPe8090m,W_TIP_ALM_PE_8090M_LEN)
                  ,beginWTipAlmPe8090m
                  ,W_TIP_ALM_PE_8090M_LEN
                 );
            localWTipAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTipAlmPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTipAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTipAlmPe8090m() {	 
			return (getUnsignedShort(beginWTipAlmPe8090m));
   	}
         int localWIeqAlmPe8090mCounter = -1;
         public boolean isWIeqAlmPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIeqAlmPe8090mCounter != sharedCounter;
            localWIeqAlmPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_IEQ_ALM_PE_8090M_LEN = 2;
  	/**
	 * serializeWIeqAlmPe8090m
	 */
	protected void serializeWIeqAlmPe8090m(int wIeqAlmPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wIeqAlmPe8090m,W_IEQ_ALM_PE_8090M_LEN)
                  ,beginWIeqAlmPe8090m
                  ,W_IEQ_ALM_PE_8090M_LEN
                 );
            localWIeqAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIeqAlmPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIeqAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIeqAlmPe8090m() {	 
			return (getUnsignedShort(beginWIeqAlmPe8090m));
   	}
     int localWNomAlmPe8090mCounter = -1;
     public boolean isWNomAlmPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNomAlmPe8090mCounter != sharedCounter;
         localWNomAlmPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NOM_ALM_PE_8090M_LEN = 60;
	/**
	 * 	serialize this WNomAlmPe8090m
	 */
   protected void serializeWNomAlmPe8090m(char[] wNomAlmPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNomAlmPe8090m,0,getStringValue(),beginWNomAlmPe8090m,W_NOM_ALM_PE_8090M_LEN);
       localWNomAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNomAlmPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWNomAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNomAlmPe8090m() {	 
   		return (substring(getStringValue(),beginWNomAlmPe8090m,beginWNomAlmPe8090m + W_NOM_ALM_PE_8090M_LEN));
   	}
         int localWNcnAlmPe8090mCounter = -1;
         public boolean isWNcnAlmPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNcnAlmPe8090mCounter != sharedCounter;
            localWNcnAlmPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NCN_ALM_PE_8090M_LEN = 2;
  	/**
	 * serializeWNcnAlmPe8090m
	 */
	protected void serializeWNcnAlmPe8090m(int wNcnAlmPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNcnAlmPe8090m,W_NCN_ALM_PE_8090M_LEN)
                  ,beginWNcnAlmPe8090m
                  ,W_NCN_ALM_PE_8090M_LEN
                 );
            localWNcnAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNcnAlmPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNcnAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNcnAlmPe8090m() {	 
			return (getUnsignedShort(beginWNcnAlmPe8090m));
   	}
     int localWNo1AlmPe8090mCounter = -1;
     public boolean isWNo1AlmPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNo1AlmPe8090mCounter != sharedCounter;
         localWNo1AlmPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NO_1_ALM_PE_8090M_LEN = 40;
	/**
	 * 	serialize this WNo1AlmPe8090m
	 */
   protected void serializeWNo1AlmPe8090m(char[] wNo1AlmPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNo1AlmPe8090m,0,getStringValue(),beginWNo1AlmPe8090m,W_NO_1_ALM_PE_8090M_LEN);
       localWNo1AlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNo1AlmPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWNo1AlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNo1AlmPe8090m() {	 
   		return (substring(getStringValue(),beginWNo1AlmPe8090m,beginWNo1AlmPe8090m + W_NO_1_ALM_PE_8090M_LEN));
   	}
         int localWNc1AlmPe8090mCounter = -1;
         public boolean isWNc1AlmPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNc1AlmPe8090mCounter != sharedCounter;
            localWNc1AlmPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NC_1_ALM_PE_8090M_LEN = 2;
  	/**
	 * serializeWNc1AlmPe8090m
	 */
	protected void serializeWNc1AlmPe8090m(int wNc1AlmPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNc1AlmPe8090m,W_NC_1_ALM_PE_8090M_LEN)
                  ,beginWNc1AlmPe8090m
                  ,W_NC_1_ALM_PE_8090M_LEN
                 );
            localWNc1AlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNc1AlmPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNc1AlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNc1AlmPe8090m() {	 
			return (getUnsignedShort(beginWNc1AlmPe8090m));
   	}
     int localWNo2AlmPe8090mCounter = -1;
     public boolean isWNo2AlmPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNo2AlmPe8090mCounter != sharedCounter;
         localWNo2AlmPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NO_2_ALM_PE_8090M_LEN = 24;
	/**
	 * 	serialize this WNo2AlmPe8090m
	 */
   protected void serializeWNo2AlmPe8090m(char[] wNo2AlmPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNo2AlmPe8090m,0,getStringValue(),beginWNo2AlmPe8090m,W_NO_2_ALM_PE_8090M_LEN);
       localWNo2AlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNo2AlmPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
    /**
	 *	refreshWNo2AlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNo2AlmPe8090m() {	 
   		return (substring(getStringValue(),beginWNo2AlmPe8090m,beginWNo2AlmPe8090m + W_NO_2_ALM_PE_8090M_LEN));
   	}
         int localWNc2AlmPe8090mCounter = -1;
         public boolean isWNc2AlmPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNc2AlmPe8090mCounter != sharedCounter;
            localWNc2AlmPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NC_2_ALM_PE_8090M_LEN = 2;
  	/**
	 * serializeWNc2AlmPe8090m
	 */
	protected void serializeWNc2AlmPe8090m(int wNc2AlmPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNc2AlmPe8090m,W_NC_2_ALM_PE_8090M_LEN)
                  ,beginWNc2AlmPe8090m
                  ,W_NC_2_ALM_PE_8090M_LEN
                 );
            localWNc2AlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNc2AlmPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNc2AlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNc2AlmPe8090m() {	 
			return (getUnsignedShort(beginWNc2AlmPe8090m));
   	}
     int localWNreAlmPe8090mCounter = -1;
     public boolean isWNreAlmPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNreAlmPe8090mCounter != sharedCounter;
         localWNreAlmPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NRE_ALM_PE_8090M_LEN = 20;
	/**
	 * 	serialize this WNreAlmPe8090m
	 */
   protected void serializeWNreAlmPe8090m(char[] wNreAlmPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNreAlmPe8090m,0,getStringValue(),beginWNreAlmPe8090m,W_NRE_ALM_PE_8090M_LEN);
       localWNreAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNreAlmPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWNreAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNreAlmPe8090m() {	 
   		return (substring(getStringValue(),beginWNreAlmPe8090m,beginWNreAlmPe8090m + W_NRE_ALM_PE_8090M_LEN));
   	}
     int localWPraAlmPe8090mCounter = -1;
     public boolean isWPraAlmPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPraAlmPe8090mCounter != sharedCounter;
         localWPraAlmPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PRA_ALM_PE_8090M_LEN = 20;
	/**
	 * 	serialize this WPraAlmPe8090m
	 */
   protected void serializeWPraAlmPe8090m(char[] wPraAlmPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPraAlmPe8090m,0,getStringValue(),beginWPraAlmPe8090m,W_PRA_ALM_PE_8090M_LEN);
       localWPraAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPraAlmPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWPraAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPraAlmPe8090m() {	 
   		return (substring(getStringValue(),beginWPraAlmPe8090m,beginWPraAlmPe8090m + W_PRA_ALM_PE_8090M_LEN));
   	}
     int localWSeaAlmPe8090mCounter = -1;
     public boolean isWSeaAlmPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWSeaAlmPe8090mCounter != sharedCounter;
         localWSeaAlmPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_SEA_ALM_PE_8090M_LEN = 20;
	/**
	 * 	serialize this WSeaAlmPe8090m
	 */
   protected void serializeWSeaAlmPe8090m(char[] wSeaAlmPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wSeaAlmPe8090m,0,getStringValue(),beginWSeaAlmPe8090m,W_SEA_ALM_PE_8090M_LEN);
       localWSeaAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWSeaAlmPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWSeaAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWSeaAlmPe8090m() {	 
   		return (substring(getStringValue(),beginWSeaAlmPe8090m,beginWSeaAlmPe8090m + W_SEA_ALM_PE_8090M_LEN));
   	}
         int localWCpeAlmPe8090mCounter = -1;
         public boolean isWCpeAlmPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWCpeAlmPe8090mCounter != sharedCounter;
            localWCpeAlmPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_CPE_ALM_PE_8090M_LEN = 2;
  	/**
	 * serializeWCpeAlmPe8090m
	 */
	protected void serializeWCpeAlmPe8090m(int wCpeAlmPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wCpeAlmPe8090m,W_CPE_ALM_PE_8090M_LEN)
                  ,beginWCpeAlmPe8090m
                  ,W_CPE_ALM_PE_8090M_LEN
                 );
            localWCpeAlmPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWCpeAlmPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWCpeAlmPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWCpeAlmPe8090m() {	 
			return (getUnsignedShort(beginWCpeAlmPe8090m));
   	}




}
  
