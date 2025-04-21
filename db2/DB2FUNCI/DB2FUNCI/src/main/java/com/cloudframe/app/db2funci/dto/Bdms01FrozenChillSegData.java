package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01FrozenChillSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:56. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Bdms01FrozenChillSegData extends Bdms01FrozenChillSegDataSerialized { 
   

								private int bdms01FrozenChillSegSqlcd;

								private long msdFrozenChilledInd;
				private MsdFrozenChilledIndR msdFrozenChilledIndR = new MsdFrozenChilledIndR();
			private List<MsdFcData> msdFcData = new ArrayList<>();
    	

						private char[] msdDtc = Field.fillLowValue(1);

						private char[] msdDtcCustodyInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01FrozenChillSegData
	**/
    public Bdms01FrozenChillSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01FrozenChillSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01FrozenChillSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdFrozenChilledIndR.setParent(this,getStartOffset() + 4);
				for (int arrayIndex = 0; arrayIndex < MSD_FC_DATA_SIZE;arrayIndex++) {
						msdFcData.add(new MsdFcData(this, beginMsdFcData + 
						arrayIndex * MsdFcData.getMsdFcDataFieldLength()));
				}
    } 

	/**
	 *	Returns the value of bdms01FrozenChillSegSqlcd
	 *	@return bdms01FrozenChillSegSqlcd
	 */
	public int getBdms01FrozenChillSegSqlcd() throws CFException {
       if (isBdms01FrozenChillSegSqlcdModified()) { 
           bdms01FrozenChillSegSqlcd = refreshBdms01FrozenChillSegSqlcd();
        }
   		return bdms01FrozenChillSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01FrozenChillSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-FROZEN-CHILL-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01FrozenChillSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01FrozenChillSegSqlcd = checkBdms01FrozenChillSegSqlcdMaxLimit(number); 
		serializeBdms01FrozenChillSegSqlcd(bdms01FrozenChillSegSqlcd);
	}
	

	public void setBdms01FrozenChillSegSqlcd(long number) {
	    number = checkBdms01FrozenChillSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01FrozenChillSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01FrozenChillSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01FrozenChillSegSqlcd(char[] value) throws CFException {
		 bdms01FrozenChillSegSqlcd = serializeBdms01FrozenChillSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01FrozenChillSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01FrozenChillSegSqlcdString(char[] value) throws CFException {
		 setBdms01FrozenChillSegSqlcd(value);
	}
	/**
	 *	Returns the value of msdFrozenChilledInd
	 *	@return msdFrozenChilledInd
	 */
	public long getMsdFrozenChilledInd() throws CFException {
       if (isMsdFrozenChilledIndModified()) { 
           msdFrozenChilledInd = refreshMsdFrozenChilledInd();
        }
   		return msdFrozenChilledInd;
	}
	

	
	   
	/**
	 * 	Update MsdFrozenChilledInd with the passed value
	 *  Corresponding COBOL Variable is MSD-FROZEN-CHILLED-IND
	 *	@param number
	 */
	public void setMsdFrozenChilledInd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdFrozenChilledInd = checkMsdFrozenChilledIndMaxLimit(number); 
		serializeMsdFrozenChilledInd(msdFrozenChilledInd);
	}
	

	/**
	 * 	Update MsdFrozenChilledInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdFrozenChilledInd(char[] value) throws CFException {
		 msdFrozenChilledInd = serializeMsdFrozenChilledInd(value);
	}
	/**
	 * 	Update MsdFrozenChilledInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdFrozenChilledIndString(char[] value) throws CFException {
		 setMsdFrozenChilledInd(value);
	}
	/**
	 *	Returns the value of msdFrozenChilledIndR
	 *	@return msdFrozenChilledIndR
	 */   
	 public MsdFrozenChilledIndR getMsdFrozenChilledIndR() {
   	return msdFrozenChilledIndR;
   }
   /**
	* 	Update MsdFrozenChilledIndR with the passed value
	*   Corresponding COBOL Variable is MSD-FROZEN-CHILLED-IND-R
	*	@param value
	*/
   public void setMsdFrozenChilledIndR(char[] value) {
      msdFrozenChilledIndR.setString(value); 
   }   
    
     /**
	 * 	Update MsdFrozenChilledIndR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdFrozenChilledIndR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdFrozenChilledIndR.begin,msdFrozenChilledIndR.length());
   }
   
     /**
	 * 	Update MsdFrozenChilledIndR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFrozenChilledIndR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdFrozenChilledIndR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdFrozenChilledIndR with another Field
	 *	@param value
	 */
   public void setMsdFrozenChilledIndR(Field source) {
   	replace(source,0,source.length(),msdFrozenChilledIndR.begin,msdFrozenChilledIndR.length());
   }  
   
     /**
	 * 	Update MsdFrozenChilledIndR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdFrozenChilledIndR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdFrozenChilledIndR.begin,msdFrozenChilledIndR.length());
   }
   
     /**
	 * 	Update MsdFrozenChilledIndR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFrozenChilledIndR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdFrozenChilledIndR.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the  value of msdFcData
	 *  Corresponding COBOL Variable is MSD-FC-DATA
	 *	@return msdFcData
	 */
   public List<MsdFcData> getMsdFcData() {
       return msdFcData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return msdFcData
	 */
	public MsdFcData getMsdFcData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getMsdFcData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= MSD_FC_DATA_SIZE) {
             	index = MSD_FC_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("msdFcData - Array index exceeded max Size {}, resetting it to max allowed",MSD_FC_DATA_SIZE); 
	    }
		if (index >= msdFcData.size()) {
       		for (int fillIndex =  msdFcData.size() -1; fillIndex < index;fillIndex++) {
		       msdFcData.add(null);
		    }
			msdFcData.set(index,
			   	   	new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength()) 
				                        ); 	
		} 
   	   MsdFcData value = msdFcData.get(index);
   	   if (value == null) {
   	      msdFcData.set(index,
			   	   	new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength()) 
				                        ); 
		  value = msdFcData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update MsdFcData at index with the passed value
	 *  Corresponding COBOL Variable is MSD-FC-DATA
	 *  @param index
	 *	@param value
	 */
  public void setMsdFcData(int index,char[] value) {
   	getMsdFcData(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of msdDtc
	 *	@return msdDtc
	 */
   public char[] getMsdDtc() throws CFException{
     if (isMsdDtcModified()) { 
        msdDtc = refreshMsdDtc();
     }
   		return msdDtc;
   }

  
	/**
	*  set variable msdDtc
	*  Corresponding COBOL Variable is MSD-DTC
	*  @param value
	**/
   public void setMsdDtc(char[] value) {
      msdDtc = checkMsdDtcConstraints(value);
      serializeMsdDtc(msdDtc);
   } 

     /**
	 * 	Update MsdDtc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDtc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDtc,msdDtc.length);
   	
   }
   
   public void setMsdDtc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDtc,msdDtc.length);
   	
   }
   
     /**
	 * 	Update MsdDtc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDtc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDtc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDtc with another Field
	 *	@param value
	 */
   public void setMsdDtc(Field source) {
       replace(source,0,source.length(),beginMsdDtc,MSD_DTC_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDtc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDtc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDtc,MSD_DTC_LEN);
   	
   }
   
     /**
	 * 	Update MsdDtc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDtc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDtc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of msdDtcCustodyInd
	 *	@return msdDtcCustodyInd
	 */
   public char[] getMsdDtcCustodyInd() throws CFException{
     if (isMsdDtcCustodyIndModified()) { 
        msdDtcCustodyInd = refreshMsdDtcCustodyInd();
     }
   		return msdDtcCustodyInd;
   }

  
	/**
	*  set variable msdDtcCustodyInd
	*  Corresponding COBOL Variable is MSD-DTC-CUSTODY-IND
	*  @param value
	**/
   public void setMsdDtcCustodyInd(char[] value) {
      msdDtcCustodyInd = checkMsdDtcCustodyIndConstraints(value);
      serializeMsdDtcCustodyInd(msdDtcCustodyInd);
   } 

     /**
	 * 	Update MsdDtcCustodyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdDtcCustodyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdDtcCustodyInd,msdDtcCustodyInd.length);
   	
   }
   
   public void setMsdDtcCustodyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDtcCustodyInd,msdDtcCustodyInd.length);
   	
   }
   
     /**
	 * 	Update MsdDtcCustodyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdDtcCustodyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDtcCustodyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdDtcCustodyInd with another Field
	 *	@param value
	 */
   public void setMsdDtcCustodyInd(Field source) {
       replace(source,0,source.length(),beginMsdDtcCustodyInd,MSD_DTC_CUSTODY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdDtcCustodyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdDtcCustodyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdDtcCustodyInd,MSD_DTC_CUSTODY_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdDtcCustodyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdDtcCustodyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdDtcCustodyInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Bdms01FrozenChillSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01FrozenChillSegSqlcd(0);
                     setMsdFrozenChilledInd(0);
     if (msdFcData.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  MSD_FC_DATA_SIZE;index++) {
              MsdFcData  newElement = new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength());
              newElement.initialize();
               msdFcData.add(newElement);
          }
     } else {
        if (msdFcData.size() < MSD_FC_DATA_SIZE) {
          // prefill it first
          for (int index = msdFcData.size();index <  MSD_FC_DATA_SIZE;index++) {
              MsdFcData  newElement = new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength());
               msdFcData.add(newElement);
          }
        }
        
     	for (int index = 0;index <  MSD_FC_DATA_SIZE;index++) {
     		MsdFcData msdFcDataVar = msdFcData.get(index);
 			if (msdFcDataVar == null) {
                msdFcDataVar = new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength());
                  msdFcData.set(index, msdFcDataVar);
			} 
			msdFcDataVar.initialize();
		}
     }
         setMsdDtc(CONSTANTS.SPACE);
         setMsdDtcCustodyInd(CONSTANTS.SPACE);
   }

		public static int getBdms01FrozenChillSegDataFieldLength() {
			return BDMS_01_FROZEN_CHILL_SEG_DATA_LENGTH;
		}

}
  
