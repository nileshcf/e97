package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MonthTableGroup extends MonthTableGroupSerialized {
   

						private char[] monthTable = new char[444];
					private MonthTableRedefined monthTableRedefined = new MonthTableRedefined();
	
	/**
	* Constructor for MonthTableGroup
	**/
    public MonthTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			monthTableRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setMonthTable("  M O N T H   O F   J A N U A R Y  31 M O N T H   O F   F E B R U A R Y 28    M O N T H   O F   M A R C H    31    M O N T H   O F   A P R I L    30      M O N T H   O F   M A Y      31     M O N T H   O F   J U N E     30     M O N T H   O F   J U L Y     31   M O N T H   O F   A U G U S T   31M O N T H   O F   S E P T E M B E R30  M O N T H   O F   O C T O B E R  31 M O N T H   O F   N O V E M B E R 30 M O N T H   O F   D E C E M B E R 31".toCharArray());
    }


 

	/**
	 *	Returns the value of monthTable
	 *	@return monthTable
	 */
   public char[] getMonthTable() throws CFException{
     if (isMonthTableModified()) { 
        monthTable = refreshMonthTable();
     }
   		return monthTable;
   }

  
	/**
	*  set variable monthTable
	*  Corresponding COBOL Variable is MONTH-TABLE
	*  @param value
	**/
   public void setMonthTable(char[] value) {
      monthTable = checkMonthTableConstraints(value);
      serializeMonthTable(monthTable);
   } 

     /**
	 * 	Update MonthTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonthTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMonthTable,monthTable.length);
   	
   }
   
   public void setMonthTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMonthTable,monthTable.length);
   	
   }
   
     /**
	 * 	Update MonthTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonthTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonthTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MonthTable with another Field
	 *	@param value
	 */
   public void setMonthTable(Field source) {
       replace(source,0,source.length(),beginMonthTable,MONTH_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update MonthTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonthTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMonthTable,MONTH_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update MonthTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonthTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMonthTable+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of monthTableRedefined
	 *	@return monthTableRedefined
	 */   
	 public MonthTableRedefined getMonthTableRedefined() {
   	return monthTableRedefined;
   }
   /**
	* 	Update MonthTableRedefined with the passed value
	*   Corresponding COBOL Variable is MONTH-TABLE-REDEFINED
	*	@param value
	*/
   public void setMonthTableRedefined(char[] value) {
      monthTableRedefined.setString(value); 
   }   
    
     /**
	 * 	Update MonthTableRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonthTableRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monthTableRedefined.begin,monthTableRedefined.length());
   }
   
     /**
	 * 	Update MonthTableRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonthTableRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monthTableRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MonthTableRedefined with another Field
	 *	@param value
	 */
   public void setMonthTableRedefined(Field source) {
   	replace(source,0,source.length(),monthTableRedefined.begin,monthTableRedefined.length());
   }  
   
     /**
	 * 	Update MonthTableRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonthTableRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,monthTableRedefined.begin,monthTableRedefined.length());
   }
   
     /**
	 * 	Update MonthTableRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonthTableRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,monthTableRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMonthTableGroupFieldLength() {
			return MONTH_TABLE_GROUP_LENGTH;
		}

}
  
