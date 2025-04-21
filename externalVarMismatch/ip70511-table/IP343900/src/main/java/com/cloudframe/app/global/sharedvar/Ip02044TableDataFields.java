package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044TableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class Ip02044TableDataFields extends Ip02044TableDataFieldsSerialized { 
   

						private char[] ip02044RngEndNum = Field.fillLowValue(19);

								private int ip02044PasFoundCount;
			private List<Ip02044PaEntry> ip02044PaEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip02044TableDataFields
	**/
    public Ip02044TableDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02044TableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044TableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02044RngEndNum
	 *	@return ip02044RngEndNum
	 */
   public char[] getIp02044RngEndNum() throws CFException{
     if (isIp02044RngEndNumModified()) { 
        ip02044RngEndNum = refreshIp02044RngEndNum();
     }
   		return ip02044RngEndNum;
   }

  
	/**
	*  set variable ip02044RngEndNum
	*  Corresponding COBOL Variable is IP02044-RNG-END-NUM
	*  @param value
	**/
   public void setIp02044RngEndNum(char[] value) {
      ip02044RngEndNum = checkIp02044RngEndNumConstraints(value);
      serializeIp02044RngEndNum(ip02044RngEndNum);
   } 

     /**
	 * 	Update Ip02044RngEndNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02044RngEndNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02044RngEndNum,ip02044RngEndNum.length);
   	
   }
   
   public void setIp02044RngEndNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044RngEndNum,ip02044RngEndNum.length);
   	
   }
   
     /**
	 * 	Update Ip02044RngEndNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02044RngEndNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044RngEndNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02044RngEndNum with another Field
	 *	@param value
	 */
   public void setIp02044RngEndNum(Field source) {
       replace(source,0,source.length(),beginIp02044RngEndNum,IP_02044_RNG_END_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02044RngEndNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02044RngEndNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02044RngEndNum,IP_02044_RNG_END_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02044RngEndNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02044RngEndNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02044RngEndNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02044PasFoundCount
	 *	@return ip02044PasFoundCount
	 */
	public int getIp02044PasFoundCount() throws CFException {
        if (isIp02044PasFoundCountModified()) { 
           ip02044PasFoundCount = refreshIp02044PasFoundCount();
        }
   		return ip02044PasFoundCount;
	}
	
	/**
	 * 	Update Ip02044PasFoundCount with the passed value
	 *  Corresponding COBOL Variable is IP02044-PAS-FOUND-COUNT
	 *	@param number
	 */
	public void setIp02044PasFoundCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip02044PasFoundCount = checkIp02044PasFoundCountMaxLimit(number); 
		serializeIp02044PasFoundCount(ip02044PasFoundCount);
	}


	public void setIp02044PasFoundCount(long number) {
	    number = checkIp02044PasFoundCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02044PasFoundCount((int)number);
	}
	
	/**
	 *	Returns the  value of ip02044PaEntry
	 *  Corresponding COBOL Variable is IP02044-PA-ENTRY
	 *	@return ip02044PaEntry
	 */
   public List<Ip02044PaEntry> getIp02044PaEntry() {
       return ip02044PaEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip02044PaEntry
	 */
	public Ip02044PaEntry getIp02044PaEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp02044PaEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_02044_PA_ENTRY_SIZE) {
             	index = IP_02044_PA_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("ip02044PaEntry - Array index exceeded max Size {}, resetting it to max allowed",IP_02044_PA_ENTRY_SIZE); 
	    }
		if (index >= ip02044PaEntry.size()) {
       		for (int fillIndex =  ip02044PaEntry.size() -1; fillIndex < index;fillIndex++) {
		       ip02044PaEntry.add(null);
		    }
			ip02044PaEntry.set(index,
			   	   	new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength()) 
				                        ); 	
		} 
   	   Ip02044PaEntry value = ip02044PaEntry.get(index);
   	   if (value == null) {
   	      ip02044PaEntry.set(index,
			   	   	new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength()) 
				                        ); 
		  value = ip02044PaEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip02044PaEntry at index with the passed value
	 *  Corresponding COBOL Variable is IP02044-PA-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setIp02044PaEntry(int index,char[] value) {
   	getIp02044PaEntry(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip02044TableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02044RngEndNum(CONSTANTS.SPACE_19);
                     setIp02044PasFoundCount(0);
     if (ip02044PaEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02044_PA_ENTRY_SIZE;index++) {
              Ip02044PaEntry  newElement = new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength());
              newElement.initialize();
               ip02044PaEntry.add(newElement);
          }
     } else {
        if (ip02044PaEntry.size() < IP_02044_PA_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip02044PaEntry.size();index <  IP_02044_PA_ENTRY_SIZE;index++) {
              Ip02044PaEntry  newElement = new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength());
               ip02044PaEntry.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02044_PA_ENTRY_SIZE;index++) {
     		Ip02044PaEntry ip02044PaEntryVar = ip02044PaEntry.get(index);
 			if (ip02044PaEntryVar == null) {
                ip02044PaEntryVar = new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength());
                  ip02044PaEntry.set(index, ip02044PaEntryVar);
			} 
			ip02044PaEntryVar.initialize();
		}
     }
   }

		public static int getIp02044TableDataFieldsFieldLength() {
			return IP_02044_TABLE_DATA_FIELDS_LENGTH;
		}

}
  
