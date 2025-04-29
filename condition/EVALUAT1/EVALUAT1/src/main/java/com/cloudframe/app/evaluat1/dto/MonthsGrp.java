package com.cloudframe.app.evaluat1.dto;

/**
*  The class MonthsGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/


import com.cloudframe.app.evaluat1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class MonthsGrp extends MonthsGrpSerialized {
   

						private char[] months = new char[36];
      private List<char[]> monthsR; 

	
	/**
	* Constructor for MonthsGrp
	**/
    public MonthsGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMonths(("janfebmaraprmayjunjulaugsepoctnovdec").toCharArray());
    }


 

	/**
	 *	Returns the value of months
	 *	@return months
	 */
   public char[] getMonths() throws CFException{
     if (isMonthsModified()) { 
        months = refreshMonths();
     }
   		return months;
   }

  
	/**
	*  set variable months
	*  Corresponding COBOL Variable is WS-MONTHS
	*  @param value
	**/
   public void setMonths(char[] value) {
      months = checkMonthsConstraints(value);
      serializeMonths(months);
   } 

     /**
	 * 	Update Months 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonths(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonths,months.length);
   	
   }
   
   public void setMonths(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonths,months.length);
   	
   }
   
     /**
	 * 	Update Months 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonths(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonths+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Months with another Field
	 *	@param value
	 */
   public void setMonths(Field source) {
       replace(source,0,source.length(),beginMonths,MONTHS_LEN);
   	
   }  
   
     /**
	 * 	Update Months 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonths(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonths,MONTHS_LEN);
   	
   }
   
     /**
	 * 	Update Months 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonths(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonths+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of monthsR
	 *  Corresponding COBOL Variable is WS-MONTHS-R
	 *	@return monthsR
	 */
	public List<char[]> getMonthsR() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < MONTHS_R_SIZE;index++) {
        	list.add( getMonthsR( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return monthsR
	 */
	public char[] getMonthsR(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getMonthsR(), resetting it to 0",index);
		    index = 0;
        } else if (index >= MONTHS_R_SIZE) {
             	index = MONTHS_R_SIZE -1; // can't exceed max array size
             	logger.trace("monthsR - Array index exceeded max Size {}, resetting it to max allowed",MONTHS_R_SIZE); 
	    }
   	      return getCharArray( (beginMonthsR + index*MONTHS_R_LEN) , MONTHS_R_LEN );
    }
    
    
   public int  monthsRFieldLength() {
   	return MONTHS_R_LEN;
   }
   
	

  
  	/**
	 *	Update MonthsR with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-MONTHS-R
	 *  @param index
	 *	@param value
	 */
  public void setMonthsR(int index,char[] value) {
   	setMonthsR(index,value,true);
   }
   
   
   /**
	 *	Update MonthsR with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setMonthsR(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setMonthsR(int,String,boolean), reset it to 0",index);
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
		serializeMonthsR(index,value);		
       }
   }
   

	
	
	

		public static int getMonthsGrpFieldLength() {
			return MONTHS_GRP_LENGTH;
		}

}
  
