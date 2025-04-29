package com.cloudframe.app.init1.dto;

/**
*  The class BillPeriodDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


public class BillPeriodDates extends BillPeriodDatesSerialized { 
   

						private char[] dateBlCycNo = Field.fillLowValue(2);

						private char[] dateCycMthYr = Field.fillLowValue(6);

						private char[] nextCycStartDt = Field.fillLowValue(10);
			private List<BpDates> bpDates = new ArrayList<>();
    	
	
	/**
	* Constructor for BillPeriodDates
	**/
    public BillPeriodDates() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BillPeriodDates. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BillPeriodDates(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dateBlCycNo
	 *	@return dateBlCycNo
	 */
   public char[] getDateBlCycNo() throws CFException{
     if (isDateBlCycNoModified()) { 
        dateBlCycNo = refreshDateBlCycNo();
     }
   		return dateBlCycNo;
   }

  
	/**
	*  set variable dateBlCycNo
	*  Corresponding COBOL Variable is WS-DATE-BL-CYC-NO
	*  @param value
	**/
   public void setDateBlCycNo(char[] value) {
      dateBlCycNo = checkDateBlCycNoConstraints(value);
      serializeDateBlCycNo(dateBlCycNo);
   } 

     /**
	 * 	Update DateBlCycNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateBlCycNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateBlCycNo,dateBlCycNo.length);
   	
   }
   
   public void setDateBlCycNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateBlCycNo,dateBlCycNo.length);
   	
   }
   
     /**
	 * 	Update DateBlCycNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateBlCycNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateBlCycNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateBlCycNo with another Field
	 *	@param value
	 */
   public void setDateBlCycNo(Field source) {
       replace(source,0,source.length(),beginDateBlCycNo,DATE_BL_CYC_NO_LEN);
   	
   }  
   
     /**
	 * 	Update DateBlCycNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateBlCycNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateBlCycNo,DATE_BL_CYC_NO_LEN);
   	
   }
   
     /**
	 * 	Update DateBlCycNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateBlCycNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateBlCycNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dateCycMthYr
	 *	@return dateCycMthYr
	 */
   public char[] getDateCycMthYr() throws CFException{
     if (isDateCycMthYrModified()) { 
        dateCycMthYr = refreshDateCycMthYr();
     }
   		return dateCycMthYr;
   }

  
	/**
	*  set variable dateCycMthYr
	*  Corresponding COBOL Variable is WS-DATE-CYC-MTH-YR
	*  @param value
	**/
   public void setDateCycMthYr(char[] value) {
      dateCycMthYr = checkDateCycMthYrConstraints(value);
      serializeDateCycMthYr(dateCycMthYr);
   } 

     /**
	 * 	Update DateCycMthYr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateCycMthYr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateCycMthYr,dateCycMthYr.length);
   	
   }
   
   public void setDateCycMthYr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateCycMthYr,dateCycMthYr.length);
   	
   }
   
     /**
	 * 	Update DateCycMthYr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateCycMthYr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateCycMthYr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateCycMthYr with another Field
	 *	@param value
	 */
   public void setDateCycMthYr(Field source) {
       replace(source,0,source.length(),beginDateCycMthYr,DATE_CYC_MTH_YR_LEN);
   	
   }  
   
     /**
	 * 	Update DateCycMthYr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateCycMthYr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateCycMthYr,DATE_CYC_MTH_YR_LEN);
   	
   }
   
     /**
	 * 	Update DateCycMthYr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateCycMthYr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateCycMthYr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nextCycStartDt
	 *	@return nextCycStartDt
	 */
   public char[] getNextCycStartDt() throws CFException{
     if (isNextCycStartDtModified()) { 
        nextCycStartDt = refreshNextCycStartDt();
     }
   		return nextCycStartDt;
   }

  
	/**
	*  set variable nextCycStartDt
	*  Corresponding COBOL Variable is WS-NEXT-CYC-START-DT
	*  @param value
	**/
   public void setNextCycStartDt(char[] value) {
      nextCycStartDt = checkNextCycStartDtConstraints(value);
      serializeNextCycStartDt(nextCycStartDt);
   } 

     /**
	 * 	Update NextCycStartDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNextCycStartDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNextCycStartDt,nextCycStartDt.length);
   	
   }
   
   public void setNextCycStartDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNextCycStartDt,nextCycStartDt.length);
   	
   }
   
     /**
	 * 	Update NextCycStartDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNextCycStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextCycStartDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NextCycStartDt with another Field
	 *	@param value
	 */
   public void setNextCycStartDt(Field source) {
       replace(source,0,source.length(),beginNextCycStartDt,NEXT_CYC_START_DT_LEN);
   	
   }  
   
     /**
	 * 	Update NextCycStartDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNextCycStartDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNextCycStartDt,NEXT_CYC_START_DT_LEN);
   	
   }
   
     /**
	 * 	Update NextCycStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNextCycStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextCycStartDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of bpDates
	 *  Corresponding COBOL Variable is WS-BP-DATES
	 *	@return bpDates
	 */
   public List<BpDates> getBpDates() {
       return bpDates;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return bpDates
	 */
	public BpDates getBpDates(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getBpDates(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= BP_DATES_SIZE) {
             	index = BP_DATES_SIZE -1; // can't exceed max array size
             	logger.trace("bpDates - Array index exceeded max Size {}, resetting it to max allowed",BP_DATES_SIZE); 
	    }
		if (index >= bpDates.size()) {
       		for (int fillIndex =  bpDates.size() -1; fillIndex < index;fillIndex++) {
		       bpDates.add(null);
		    }
			bpDates.set(index,
			   	   	new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength()) 
				                        ); 	
		} 
   	   BpDates value = bpDates.get(index);
   	   if (value == null) {
   	      bpDates.set(index,
			   	   	new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength()) 
				                        ); 
		  value = bpDates.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update BpDates at index with the passed value
	 *  Corresponding COBOL Variable is WS-BP-DATES
	 *  @param index
	 *	@param value
	 */
  public void setBpDates(int index,char[] value) {
   	getBpDates(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes BillPeriodDates
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDateBlCycNo(CONSTANTS.SPACE_2);
         setDateCycMthYr(CONSTANTS.SPACE_6);
         setNextCycStartDt(CONSTANTS.SPACE_10);
     if (bpDates.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BP_DATES_SIZE;index++) {
              BpDates  newElement = new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength());
              newElement.initialize();
               bpDates.add(newElement);
          }
     } else {
        if (bpDates.size() < BP_DATES_SIZE) {
          // prefill it first
          for (int index = bpDates.size();index <  BP_DATES_SIZE;index++) {
              BpDates  newElement = new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength());
               bpDates.add(newElement);
          }
        }
        
     	for (int index = 0;index <  BP_DATES_SIZE;index++) {
     		BpDates bpDatesVar = bpDates.get(index);
 			if (bpDatesVar == null) {
                bpDatesVar = new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength());
                  bpDates.set(index, bpDatesVar);
			} 
			bpDatesVar.initialize();
		}
     }
   }

		public static int getBillPeriodDatesFieldLength() {
			return BILL_PERIOD_DATES_LENGTH;
		}

}
  
