package com.cloudframe.app.init1.dto.serialize;

/**
*  The class TV20TblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TV20TblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TV20TblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_V_20_TBL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTV20OffrTypId;
            protected  int beginTV20OffrTypCd;
	
	/**
	* Constructor for TV20TblSerialized
	**/
    public TV20TblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TV20TblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TV20TblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TV20TblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TV20TblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TV20TblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_V_20_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTV20OffrTypId = getStartOffset() + 0;	// set offset for serialization
  
             beginTV20OffrTypCd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTV20OffrTypIdCounter = -1;
         public boolean isTV20OffrTypIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTV20OffrTypIdCounter != sharedCounter;
            localTV20OffrTypIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int T_V_20_OFFR_TYP_ID_LEN = 4;
  	/**
	 * serializeTV20OffrTypId
	 */
	protected void serializeTV20OffrTypId(int tV20OffrTypId) {
           replaceValue( //  save the value as string
                   getBinaryString( tV20OffrTypId,T_V_20_OFFR_TYP_ID_LEN)
                  ,beginTV20OffrTypId
                  ,T_V_20_OFFR_TYP_ID_LEN
                 );
            localTV20OffrTypIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkTV20OffrTypIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshTV20OffrTypId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTV20OffrTypId() {	 
			return (getInt(beginTV20OffrTypId));
   	}
     int localTV20OffrTypCdCounter = -1;
     public boolean isTV20OffrTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTV20OffrTypCdCounter != sharedCounter;
         localTV20OffrTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int T_V_20_OFFR_TYP_CD_LEN = 2;
	/**
	 * 	serialize this TV20OffrTypCd
	 */
   protected void serializeTV20OffrTypCd(char[] tV20OffrTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tV20OffrTypCd,0,getStringValue(),beginTV20OffrTypCd,T_V_20_OFFR_TYP_CD_LEN);
       localTV20OffrTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTV20OffrTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTV20OffrTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTV20OffrTypCd() {	 
   		return (substring(getStringValue(),beginTV20OffrTypCd,beginTV20OffrTypCd + T_V_20_OFFR_TYP_CD_LEN));
   	}




}
  
