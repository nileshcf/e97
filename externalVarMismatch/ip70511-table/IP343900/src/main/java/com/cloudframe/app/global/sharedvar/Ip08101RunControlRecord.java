package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08101RunControlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip08101RunControlRecord extends Ip08101RunControlRecordSerialized { 
   

						private char[] ip08101RunOption = Field.fillLowValue(1);

								private long ip08101ProcessDate;
				private Ip08101RptInds ip08101RptInds = new Ip08101RptInds();
      private List<char[]> ip08101RptIndValues; 

				private Ip08101MsgTbl ip08101MsgTbl = new Ip08101MsgTbl();
      private List<char[]> ip08101MsgThreshValues; 


						private char[] ip08101RptUtcSign = Field.fillLowValue(1);

						private char[] ip08101RptUtcOffset = Field.fillLowValue(4);

						private char[] ip08101RptProcessTime = Field.fillLowValue(4);

								private int ip08101MaxNumCycles;

						private char[] ip08101Filler = Field.fillLowValue(29);
	
	/**
	* Constructor for Ip08101RunControlRecord
	**/
    public Ip08101RunControlRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip08101RptInds.setParent(this,getStartOffset() + 9);
	       			ip08101MsgTbl.setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip08101RunOption
	 *	@return ip08101RunOption
	 */
   public char[] getIp08101RunOption() throws CFException{
     if (isIp08101RunOptionModified()) { 
        ip08101RunOption = refreshIp08101RunOption();
     }
   		return ip08101RunOption;
   }

  
	/**
	*  set variable ip08101RunOption
	*  Corresponding COBOL Variable is IP08101-RUN-OPTION
	*  @param value
	**/
   public void setIp08101RunOption(char[] value) {
      ip08101RunOption = checkIp08101RunOptionConstraints(value);
      serializeIp08101RunOption(ip08101RunOption);
   } 

     /**
	 * 	Update Ip08101RunOption 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RunOption(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RunOption,ip08101RunOption.length);
   	
   }
   
   public void setIp08101RunOption(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RunOption,ip08101RunOption.length);
   	
   }
   
     /**
	 * 	Update Ip08101RunOption 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunOption(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RunOption+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RunOption with another Field
	 *	@param value
	 */
   public void setIp08101RunOption(Field source) {
       replace(source,0,source.length(),beginIp08101RunOption,IP_08101_RUN_OPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RunOption 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RunOption(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RunOption,IP_08101_RUN_OPTION_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RunOption 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunOption(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RunOption+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
       if (isIp08101ProcessDateModified()) { 
           ip08101ProcessDate = refreshIp08101ProcessDate();
        }
   		return ip08101ProcessDate;
	}
	

	
	   
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *  Corresponding COBOL Variable is IP08101-PROCESS-DATE
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip08101ProcessDate = checkIp08101ProcessDateMaxLimit(number); 
		serializeIp08101ProcessDate(ip08101ProcessDate);
	}
	

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value) throws CFException {
		 ip08101ProcessDate = serializeIp08101ProcessDate(value);
	}
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value) throws CFException {
		 setIp08101ProcessDate(value);
	}
	/**
	 *	Returns the value of ip08101RptInds
	 *	@return ip08101RptInds
	 */   
	 public Ip08101RptInds getIp08101RptInds() {
   	return ip08101RptInds;
   }
   /**
	* 	Update Ip08101RptInds with the passed value
	*   Corresponding COBOL Variable is IP08101-RPT-INDS
	*	@param value
	*/
   public void setIp08101RptInds(char[] value) {
      ip08101RptInds.setString(value); 
   }   
    
     /**
	 * 	Update Ip08101RptInds 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptInds(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip08101RptInds.begin,ip08101RptInds.length());
   }
   
     /**
	 * 	Update Ip08101RptInds 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptInds(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip08101RptInds.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip08101RptInds with another Field
	 *	@param value
	 */
   public void setIp08101RptInds(Field source) {
   	replace(source,0,source.length(),ip08101RptInds.begin,ip08101RptInds.length());
   }  
   
     /**
	 * 	Update Ip08101RptInds 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptInds(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip08101RptInds.begin,ip08101RptInds.length());
   }
   
     /**
	 * 	Update Ip08101RptInds 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptInds(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip08101RptInds.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of ip08101RptIndValues
	 *  Corresponding COBOL Variable is IP08101-RPT-IND-VALUES
	 *	@return ip08101RptIndValues
	 */
	public List<char[]> getIp08101RptIndValues() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_08101_RPT_IND_VALUES_SIZE;index++) {
        	list.add( getIp08101RptIndValues( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip08101RptIndValues
	 */
	public char[] getIp08101RptIndValues(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp08101RptIndValues(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_08101_RPT_IND_VALUES_SIZE) {
             	index = IP_08101_RPT_IND_VALUES_SIZE -1; // can't exceed max array size
             	logger.trace("ip08101RptIndValues - Array index exceeded max Size {}, resetting it to max allowed",IP_08101_RPT_IND_VALUES_SIZE); 
	    }
   	      return getCharArray( (beginIp08101RptIndValues + index*IP_08101_RPT_IND_VALUES_LEN) , IP_08101_RPT_IND_VALUES_LEN );
    }
    
    
   public int  ip08101RptIndValuesFieldLength() {
   	return IP_08101_RPT_IND_VALUES_LEN;
   }
   
	

  
  	/**
	 *	Update Ip08101RptIndValues with the passed value at a given index
	 *  Corresponding COBOL Variable is IP08101-RPT-IND-VALUES
	 *  @param index
	 *	@param value
	 */
  public void setIp08101RptIndValues(int index,char[] value) {
   	setIp08101RptIndValues(index,value,true);
   }
   
   
   /**
	 *	Update Ip08101RptIndValues with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp08101RptIndValues(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp08101RptIndValues(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp08101RptIndValues(index,value);		
       }
   }
   
	/**
	 *	Returns the value of ip08101MsgTbl
	 *	@return ip08101MsgTbl
	 */   
	 public Ip08101MsgTbl getIp08101MsgTbl() {
   	return ip08101MsgTbl;
   }
   /**
	* 	Update Ip08101MsgTbl with the passed value
	*   Corresponding COBOL Variable is IP08101-MSG-TBL
	*	@param value
	*/
   public void setIp08101MsgTbl(char[] value) {
      ip08101MsgTbl.setString(value); 
   }   
    
     /**
	 * 	Update Ip08101MsgTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp08101MsgTbl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip08101MsgTbl.begin,ip08101MsgTbl.length());
   }
   
     /**
	 * 	Update Ip08101MsgTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101MsgTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip08101MsgTbl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip08101MsgTbl with another Field
	 *	@param value
	 */
   public void setIp08101MsgTbl(Field source) {
   	replace(source,0,source.length(),ip08101MsgTbl.begin,ip08101MsgTbl.length());
   }  
   
     /**
	 * 	Update Ip08101MsgTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp08101MsgTbl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip08101MsgTbl.begin,ip08101MsgTbl.length());
   }
   
     /**
	 * 	Update Ip08101MsgTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101MsgTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip08101MsgTbl.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of ip08101MsgThreshValues
	 *  Corresponding COBOL Variable is IP08101-MSG-THRESH-VALUES
	 *	@return ip08101MsgThreshValues
	 */
	public List<char[]> getIp08101MsgThreshValues() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_08101_MSG_THRESH_VALUES_SIZE;index++) {
        	list.add( getIp08101MsgThreshValues( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip08101MsgThreshValues
	 */
	public char[] getIp08101MsgThreshValues(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp08101MsgThreshValues(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_08101_MSG_THRESH_VALUES_SIZE) {
             	index = IP_08101_MSG_THRESH_VALUES_SIZE -1; // can't exceed max array size
             	logger.trace("ip08101MsgThreshValues - Array index exceeded max Size {}, resetting it to max allowed",IP_08101_MSG_THRESH_VALUES_SIZE); 
	    }
   	      return getCharArray( (beginIp08101MsgThreshValues + index*IP_08101_MSG_THRESH_VALUES_LEN) , IP_08101_MSG_THRESH_VALUES_LEN );
    }
    
    
   public int  ip08101MsgThreshValuesFieldLength() {
   	return IP_08101_MSG_THRESH_VALUES_LEN;
   }
   
	

  
  	/**
	 *	Update Ip08101MsgThreshValues with the passed value at a given index
	 *  Corresponding COBOL Variable is IP08101-MSG-THRESH-VALUES
	 *  @param index
	 *	@param value
	 */
  public void setIp08101MsgThreshValues(int index,char[] value) {
   	setIp08101MsgThreshValues(index,value,true);
   }
   
   
   /**
	 *	Update Ip08101MsgThreshValues with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp08101MsgThreshValues(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp08101MsgThreshValues(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp08101MsgThreshValues(index,value);		
       }
   }
   
	/**
	 *	Returns the value of ip08101RptUtcSign
	 *	@return ip08101RptUtcSign
	 */
   public char[] getIp08101RptUtcSign() throws CFException{
     if (isIp08101RptUtcSignModified()) { 
        ip08101RptUtcSign = refreshIp08101RptUtcSign();
     }
   		return ip08101RptUtcSign;
   }

  
	/**
	*  set variable ip08101RptUtcSign
	*  Corresponding COBOL Variable is IP08101-RPT-UTC-SIGN
	*  @param value
	**/
   public void setIp08101RptUtcSign(char[] value) {
      ip08101RptUtcSign = checkIp08101RptUtcSignConstraints(value);
      serializeIp08101RptUtcSign(ip08101RptUtcSign);
   } 

     /**
	 * 	Update Ip08101RptUtcSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptUtcSign(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RptUtcSign,ip08101RptUtcSign.length);
   	
   }
   
   public void setIp08101RptUtcSign(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptUtcSign,ip08101RptUtcSign.length);
   	
   }
   
     /**
	 * 	Update Ip08101RptUtcSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptUtcSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptUtcSign+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RptUtcSign with another Field
	 *	@param value
	 */
   public void setIp08101RptUtcSign(Field source) {
       replace(source,0,source.length(),beginIp08101RptUtcSign,IP_08101_RPT_UTC_SIGN_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RptUtcSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptUtcSign(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RptUtcSign,IP_08101_RPT_UTC_SIGN_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RptUtcSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptUtcSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptUtcSign+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101RptUtcOffset
	 *	@return ip08101RptUtcOffset
	 */
   public char[] getIp08101RptUtcOffset() throws CFException{
     if (isIp08101RptUtcOffsetModified()) { 
        ip08101RptUtcOffset = refreshIp08101RptUtcOffset();
     }
   		return ip08101RptUtcOffset;
   }

  
	/**
	*  set variable ip08101RptUtcOffset
	*  Corresponding COBOL Variable is IP08101-RPT-UTC-OFFSET
	*  @param value
	**/
   public void setIp08101RptUtcOffset(char[] value) {
      ip08101RptUtcOffset = checkIp08101RptUtcOffsetConstraints(value);
      serializeIp08101RptUtcOffset(ip08101RptUtcOffset);
   } 

     /**
	 * 	Update Ip08101RptUtcOffset 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptUtcOffset(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RptUtcOffset,ip08101RptUtcOffset.length);
   	
   }
   
   public void setIp08101RptUtcOffset(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptUtcOffset,ip08101RptUtcOffset.length);
   	
   }
   
     /**
	 * 	Update Ip08101RptUtcOffset 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptUtcOffset(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptUtcOffset+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RptUtcOffset with another Field
	 *	@param value
	 */
   public void setIp08101RptUtcOffset(Field source) {
       replace(source,0,source.length(),beginIp08101RptUtcOffset,IP_08101_RPT_UTC_OFFSET_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RptUtcOffset 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptUtcOffset(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RptUtcOffset,IP_08101_RPT_UTC_OFFSET_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RptUtcOffset 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptUtcOffset(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptUtcOffset+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101RptProcessTime
	 *	@return ip08101RptProcessTime
	 */
   public char[] getIp08101RptProcessTime() throws CFException{
     if (isIp08101RptProcessTimeModified()) { 
        ip08101RptProcessTime = refreshIp08101RptProcessTime();
     }
   		return ip08101RptProcessTime;
   }

  
	/**
	*  set variable ip08101RptProcessTime
	*  Corresponding COBOL Variable is IP08101-RPT-PROCESS-TIME
	*  @param value
	**/
   public void setIp08101RptProcessTime(char[] value) {
      ip08101RptProcessTime = checkIp08101RptProcessTimeConstraints(value);
      serializeIp08101RptProcessTime(ip08101RptProcessTime);
   } 

     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RptProcessTime,ip08101RptProcessTime.length);
   	
   }
   
   public void setIp08101RptProcessTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptProcessTime,ip08101RptProcessTime.length);
   	
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptProcessTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RptProcessTime with another Field
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source) {
       replace(source,0,source.length(),beginIp08101RptProcessTime,IP_08101_RPT_PROCESS_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RptProcessTime,IP_08101_RPT_PROCESS_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RptProcessTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101MaxNumCycles
	 *	@return ip08101MaxNumCycles
	 */
	public int getIp08101MaxNumCycles() throws CFException {
       if (isIp08101MaxNumCyclesModified()) { 
           ip08101MaxNumCycles = refreshIp08101MaxNumCycles();
        }
   		return ip08101MaxNumCycles;
	}
	

	
	   
	/**
	 * 	Update Ip08101MaxNumCycles with the passed value
	 *  Corresponding COBOL Variable is IP08101-MAX-NUM-CYCLES
	 *	@param number
	 */
	public void setIp08101MaxNumCycles(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip08101MaxNumCycles = checkIp08101MaxNumCyclesMaxLimit(number); 
		serializeIp08101MaxNumCycles(ip08101MaxNumCycles);
	}
	

	public void setIp08101MaxNumCycles(long number) {
	    number = checkIp08101MaxNumCyclesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp08101MaxNumCycles((int)number);
	}
	
	/**
	 * 	Update Ip08101MaxNumCycles with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101MaxNumCycles(char[] value) throws CFException {
		 ip08101MaxNumCycles = serializeIp08101MaxNumCycles(value);
	}
	/**
	 * 	Update Ip08101MaxNumCycles with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101MaxNumCyclesString(char[] value) throws CFException {
		 setIp08101MaxNumCycles(value);
	}
	/**
	 *	Returns the value of ip08101Filler
	 *	@return ip08101Filler
	 */
   public char[] getIp08101Filler() throws CFException{
     if (isIp08101FillerModified()) { 
        ip08101Filler = refreshIp08101Filler();
     }
   		return ip08101Filler;
   }

  
	/**
	*  set variable ip08101Filler
	*  Corresponding COBOL Variable is IP08101-FILLER
	*  @param value
	**/
   public void setIp08101Filler(char[] value) {
      ip08101Filler = checkIp08101FillerConstraints(value);
      serializeIp08101Filler(ip08101Filler);
   } 

     /**
	 * 	Update Ip08101Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101Filler,ip08101Filler.length);
   	
   }
   
   public void setIp08101Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101Filler,ip08101Filler.length);
   	
   }
   
     /**
	 * 	Update Ip08101Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101Filler with another Field
	 *	@param value
	 */
   public void setIp08101Filler(Field source) {
       replace(source,0,source.length(),beginIp08101Filler,IP_08101_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101Filler,IP_08101_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip08101RunControlRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08101RunOption(CONSTANTS.SPACE);
                     setIp08101ProcessDate(0);
          ip08101RptInds.initialize();
     
          ip08101MsgTbl.initialize();
     
         setIp08101RptUtcSign(CONSTANTS.SPACE);
         setIp08101RptUtcOffset(CONSTANTS.SPACE_4);
         setIp08101RptProcessTime(CONSTANTS.SPACE_4);
                     setIp08101MaxNumCycles(0);
         setIp08101Filler(CONSTANTS.SPACE_29);
   }

		public static int getIp08101RunControlRecordFieldLength() {
			return IP_08101_RUN_CONTROL_RECORD_LENGTH;
		}

}
  
