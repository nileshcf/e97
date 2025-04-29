package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnSqlcaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnSqlcaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnSqlcaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_SQLCA_LENGTH = 136;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmncaid;
            protected  int beginCmncabc;
            protected  int beginCmncode;
            protected  int beginCmnerrml;
            protected  int beginCmnerrmc;
            protected  int beginCmnerrp;
           protected int beginCmnerrd;
           protected static final int CMNERRD_SIZE = 6;
            protected  int beginCmnwarn;
            protected  int beginCmnext;
	
	/**
	* Constructor for CmnSqlcaSerialized
	**/
    public CmnSqlcaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnSqlcaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnSqlcaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnSqlcaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,603); // serialize this field at offset 603 by default 
    }
    
	/**
	* sets parent for this CmnSqlcaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 603 by default
    }    
	/**
	* initializes the field in CmnSqlcaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_SQLCA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmncaid = getStartOffset() + 0;	// set offset for serialization
  
             beginCmncabc = getStartOffset() + 8;	// set offset for serialization
  
             beginCmncode = getStartOffset() + 12;	// set offset for serialization
  
             beginCmnerrml = getStartOffset() + 16;	// set offset for serialization
  
             beginCmnerrmc = getStartOffset() + 18;	// set offset for serialization
  
             beginCmnerrp = getStartOffset() + 88;	// set offset for serialization
  
	        beginCmnerrd = getStartOffset() + 96; // set offset for serialization
  
             beginCmnwarn = getStartOffset() + 120;	// set offset for serialization
  
             beginCmnext = getStartOffset() + 128;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmncaidCounter = -1;
     public boolean isCmncaidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmncaidCounter != sharedCounter;
         localCmncaidCounter = sharedCounter; return hasModified;
     }
	protected static final int CMNCAID_LEN = 8;
	/**
	 * 	serialize this Cmncaid
	 */
   protected void serializeCmncaid(char[] cmncaid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmncaid,0,getStringValue(),beginCmncaid,CMNCAID_LEN);
       localCmncaidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmncaidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmncaid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmncaid() {	 
   		return (substring(getStringValue(),beginCmncaid,beginCmncaid + CMNCAID_LEN));
   	}
         int localCmncabcCounter = -1;
         public boolean isCmncabcModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmncabcCounter != sharedCounter;
            localCmncabcCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMNCABC_LEN = 4;
  	/**
	 * serializeCmncabc
	 */
	protected void serializeCmncabc(int cmncabc) {
           replaceValue( //  save the value as string
                   getBinaryString( cmncabc,CMNCABC_LEN)
                  ,beginCmncabc
                  ,CMNCABC_LEN
                 );
            localCmncabcCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCmncabcMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCmncabc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmncabc() {	 
			return (getInt(beginCmncabc));
   	}
         int localCmncodeCounter = -1;
         public boolean isCmncodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmncodeCounter != sharedCounter;
            localCmncodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMNCODE_LEN = 4;
  	/**
	 * serializeCmncode
	 */
	protected void serializeCmncode(int cmncode) {
           replaceValue( //  save the value as string
                   getBinaryString( cmncode,CMNCODE_LEN)
                  ,beginCmncode
                  ,CMNCODE_LEN
                 );
            localCmncodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCmncodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshCmncode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCmncode() {	 
			return (getInt(beginCmncode));
   	}
         int localCmnerrmlCounter = -1;
         public boolean isCmnerrmlModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCmnerrmlCounter != sharedCounter;
            localCmnerrmlCounter = sharedCounter; return hasModified; 
         }
   protected static final int CMNERRML_LEN = 2;
  	/**
	 * serializeCmnerrml
	 */
	protected void serializeCmnerrml(short cmnerrml) {
           replaceValue( //  save the value as string
                   getBinaryString( cmnerrml,CMNERRML_LEN)
                  ,beginCmnerrml
                  ,CMNERRML_LEN
                 );
            localCmnerrmlCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCmnerrmlMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCmnerrml is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCmnerrml() {	 
			return (getShort(beginCmnerrml));
   	}
     int localCmnerrmcCounter = -1;
     public boolean isCmnerrmcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnerrmcCounter != sharedCounter;
         localCmnerrmcCounter = sharedCounter; return hasModified;
     }
	protected static final int CMNERRMC_LEN = 70;
	/**
	 * 	serialize this Cmnerrmc
	 */
   protected void serializeCmnerrmc(char[] cmnerrmc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnerrmc,0,getStringValue(),beginCmnerrmc,CMNERRMC_LEN);
       localCmnerrmcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnerrmcConstraints(char[] value) {
   			return super.checkConstraints(value , 70 ,false, false);
   }
    /**
	 *	refreshCmnerrmc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnerrmc() {	 
   		return (substring(getStringValue(),beginCmnerrmc,beginCmnerrmc + CMNERRMC_LEN));
   	}
     int localCmnerrpCounter = -1;
     public boolean isCmnerrpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnerrpCounter != sharedCounter;
         localCmnerrpCounter = sharedCounter; return hasModified;
     }
	protected static final int CMNERRP_LEN = 8;
	/**
	 * 	serialize this Cmnerrp
	 */
   protected void serializeCmnerrp(char[] cmnerrp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnerrp,0,getStringValue(),beginCmnerrp,CMNERRP_LEN);
       localCmnerrpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnerrpConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnerrp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnerrp() {	 
   		return (substring(getStringValue(),beginCmnerrp,beginCmnerrp + CMNERRP_LEN));
   	}

	protected static final int CMNERRD_LEN = 4;
    /**
	 * 	serialize this Cmnerrd as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeCmnerrd(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginCmnerrd + index*CMNERRD_LEN), CMNERRD_LEN);
   }
     int localCmnwarnCounter = -1;
     public boolean isCmnwarnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnwarnCounter != sharedCounter;
         localCmnwarnCounter = sharedCounter; return hasModified;
     }
	protected static final int CMNWARN_LEN = 8;
	/**
	 * 	serialize this Cmnwarn
	 */
   protected void serializeCmnwarn(char[] cmnwarn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnwarn,0,getStringValue(),beginCmnwarn,CMNWARN_LEN);
       localCmnwarnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnwarnConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnwarn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnwarn() {	 
   		return (substring(getStringValue(),beginCmnwarn,beginCmnwarn + CMNWARN_LEN));
   	}
     int localCmnextCounter = -1;
     public boolean isCmnextModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnextCounter != sharedCounter;
         localCmnextCounter = sharedCounter; return hasModified;
     }
	protected static final int CMNEXT_LEN = 8;
	/**
	 * 	serialize this Cmnext
	 */
   protected void serializeCmnext(char[] cmnext) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnext,0,getStringValue(),beginCmnext,CMNEXT_LEN);
       localCmnextCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnextConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnext is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnext() {	 
   		return (substring(getStringValue(),beginCmnext,beginCmnext + CMNEXT_LEN));
   	}

		public int cmnerrdSize() {
			return CMNERRD_SIZE;
		}



}
  
