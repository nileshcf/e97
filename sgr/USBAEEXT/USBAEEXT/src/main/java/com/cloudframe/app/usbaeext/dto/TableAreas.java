package com.cloudframe.app.usbaeext.dto;

/**
*  The class TableAreas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class TableAreas extends TableAreasSerialized {
   

								private int taAdjIndexMax;

						private char[] taAdjTable = Field.fillLowValue(4100);
			private List<TaAdjTableRedefined> taAdjTableRedefined = new ArrayList<>();
    	

						private char[] taMonthTable = new char[36];
			private List<TaMonthTableRedefined> taMonthTableRedefined = new ArrayList<>();
    	

								private int taMonthIndex;
	
	/**
	* Constructor for TableAreas
	**/
    public TableAreas() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TA_ADJ_TABLE_REDEFINED_SIZE;arrayIndex++) {
						taAdjTableRedefined.add(new TaAdjTableRedefined(this, beginTaAdjTableRedefined + 
						arrayIndex * TaAdjTableRedefined.getTaAdjTableRedefinedFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < TA_MONTH_TABLE_REDEFINED_SIZE;arrayIndex++) {
						taMonthTableRedefined.add(new TaMonthTableRedefined(this, beginTaMonthTableRedefined + 
						arrayIndex * TaMonthTableRedefined.getTaMonthTableRedefinedFieldLength()));
				}
	   	/*  end of offset */
								setTaAdjIndexMax(1);
								setTaMonthTable(("JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC").toCharArray());
								setTaMonthIndex(0);
    }


 

	public int getTaAdjIndexMax() throws CFException {
        if (isTaAdjIndexMaxModified()) { 
           taAdjIndexMax = refreshTaAdjIndexMax();
        }
   		return taAdjIndexMax;
	}
	
	/**
	 * 	Update TaAdjIndexMax with the passed value
	 *  Corresponding COBOL Variable is TA-ADJ-INDEX-MAX
	 *	@param number
	 */
	public void setTaAdjIndexMax(int number) {
			taAdjIndexMax = checkTaAdjIndexMaxMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaAdjIndexMax(taAdjIndexMax);
	}


	public void setTaAdjIndexMax(long number) {
	    number = checkTaAdjIndexMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTaAdjIndexMax((int)number);
	}
	
	/**
	 *	Returns the value of taAdjTable
	 *	@return taAdjTable
	 */
   public char[] getTaAdjTable() throws CFException{
     if (isTaAdjTableModified()) { 
        taAdjTable = refreshTaAdjTable();
     }
   		return taAdjTable;
   }

  
	/**
	*  set variable taAdjTable
	*  Corresponding COBOL Variable is TA-ADJ-TABLE
	*  @param value
	**/
   public void setTaAdjTable(char[] value) {
      taAdjTable = checkTaAdjTableConstraints(value);
      serializeTaAdjTable(taAdjTable);
   } 

     /**
	 * 	Update TaAdjTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaAdjTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaAdjTable,taAdjTable.length);
   	
   }
   
   public void setTaAdjTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaAdjTable,taAdjTable.length);
   	
   }
   
     /**
	 * 	Update TaAdjTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaAdjTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaAdjTable with another Field
	 *	@param value
	 */
   public void setTaAdjTable(Field source) {
       replace(source,0,source.length(),beginTaAdjTable,TA_ADJ_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update TaAdjTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaAdjTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaAdjTable,TA_ADJ_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update TaAdjTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaAdjTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaAdjTable+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of taAdjTableRedefined
	 *  Corresponding COBOL Variable is TA-ADJ-TABLE-REDEFINED
	 *	@return taAdjTableRedefined
	 */
   public List<TaAdjTableRedefined> getTaAdjTableRedefined() {
       return taAdjTableRedefined;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return taAdjTableRedefined
	 */
	public TaAdjTableRedefined getTaAdjTableRedefined(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTaAdjTableRedefined(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TA_ADJ_TABLE_REDEFINED_SIZE) {
             	index = TA_ADJ_TABLE_REDEFINED_SIZE -1; // can't exceed max array size
             	logger.trace("taAdjTableRedefined - Array index exceeded max Size {}, resetting it to max allowed",TA_ADJ_TABLE_REDEFINED_SIZE); 
	    }
		if (index >= taAdjTableRedefined.size()) {
       		for (int fillIndex =  taAdjTableRedefined.size() -1; fillIndex < index;fillIndex++) {
		       taAdjTableRedefined.add(null);
		    }
			taAdjTableRedefined.set(index,
			   	   	new TaAdjTableRedefined(this,beginTaAdjTableRedefined + index * TaAdjTableRedefined.getTaAdjTableRedefinedFieldLength()) 
				                        ); 	
		} 
   	   TaAdjTableRedefined value = taAdjTableRedefined.get(index);
   	   if (value == null) {
   	      taAdjTableRedefined.set(index,
			   	   	new TaAdjTableRedefined(this,beginTaAdjTableRedefined + index * TaAdjTableRedefined.getTaAdjTableRedefinedFieldLength()) 
				                        ); 
		  value = taAdjTableRedefined.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TaAdjTableRedefined at index with the passed value
	 *  Corresponding COBOL Variable is TA-ADJ-TABLE-REDEFINED
	 *  @param index
	 *	@param value
	 */
  public void setTaAdjTableRedefined(int index,char[] value) {
   	getTaAdjTableRedefined(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of taMonthTable
	 *	@return taMonthTable
	 */
   public char[] getTaMonthTable() throws CFException{
     if (isTaMonthTableModified()) { 
        taMonthTable = refreshTaMonthTable();
     }
   		return taMonthTable;
   }

  
	/**
	*  set variable taMonthTable
	*  Corresponding COBOL Variable is TA-MONTH-TABLE
	*  @param value
	**/
   public void setTaMonthTable(char[] value) {
      taMonthTable = checkTaMonthTableConstraints(value);
      serializeTaMonthTable(taMonthTable);
   } 

     /**
	 * 	Update TaMonthTable 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaMonthTable(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaMonthTable,taMonthTable.length);
   	
   }
   
   public void setTaMonthTable(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaMonthTable,taMonthTable.length);
   	
   }
   
     /**
	 * 	Update TaMonthTable 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaMonthTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaMonthTable+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaMonthTable with another Field
	 *	@param value
	 */
   public void setTaMonthTable(Field source) {
       replace(source,0,source.length(),beginTaMonthTable,TA_MONTH_TABLE_LEN);
   	
   }  
   
     /**
	 * 	Update TaMonthTable 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaMonthTable(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaMonthTable,TA_MONTH_TABLE_LEN);
   	
   }
   
     /**
	 * 	Update TaMonthTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaMonthTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaMonthTable+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of taMonthTableRedefined
	 *  Corresponding COBOL Variable is TA-MONTH-TABLE-REDEFINED
	 *	@return taMonthTableRedefined
	 */
   public List<TaMonthTableRedefined> getTaMonthTableRedefined() {
       return taMonthTableRedefined;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return taMonthTableRedefined
	 */
	public TaMonthTableRedefined getTaMonthTableRedefined(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTaMonthTableRedefined(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TA_MONTH_TABLE_REDEFINED_SIZE) {
             	index = TA_MONTH_TABLE_REDEFINED_SIZE -1; // can't exceed max array size
             	logger.trace("taMonthTableRedefined - Array index exceeded max Size {}, resetting it to max allowed",TA_MONTH_TABLE_REDEFINED_SIZE); 
	    }
		if (index >= taMonthTableRedefined.size()) {
       		for (int fillIndex =  taMonthTableRedefined.size() -1; fillIndex < index;fillIndex++) {
		       taMonthTableRedefined.add(null);
		    }
			taMonthTableRedefined.set(index,
			   	   	new TaMonthTableRedefined(this,beginTaMonthTableRedefined + index * TaMonthTableRedefined.getTaMonthTableRedefinedFieldLength()) 
				                        ); 	
		} 
   	   TaMonthTableRedefined value = taMonthTableRedefined.get(index);
   	   if (value == null) {
   	      taMonthTableRedefined.set(index,
			   	   	new TaMonthTableRedefined(this,beginTaMonthTableRedefined + index * TaMonthTableRedefined.getTaMonthTableRedefinedFieldLength()) 
				                        ); 
		  value = taMonthTableRedefined.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TaMonthTableRedefined at index with the passed value
	 *  Corresponding COBOL Variable is TA-MONTH-TABLE-REDEFINED
	 *  @param index
	 *	@param value
	 */
  public void setTaMonthTableRedefined(int index,char[] value) {
   	getTaMonthTableRedefined(index).setString(value);
   }
   
	
	public int getTaMonthIndex() throws CFException {
        if (isTaMonthIndexModified()) { 
           taMonthIndex = refreshTaMonthIndex();
        }
   		return taMonthIndex;
	}
	
	/**
	 * 	Update TaMonthIndex with the passed value
	 *  Corresponding COBOL Variable is TA-MONTH-INDEX
	 *	@param number
	 */
	public void setTaMonthIndex(int number) {
			taMonthIndex = checkTaMonthIndexMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaMonthIndex(taMonthIndex);
	}


	public void setTaMonthIndex(long number) {
	    number = checkTaMonthIndexMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTaMonthIndex((int)number);
	}
	

	
	
	

		public static int getTableAreasFieldLength() {
			return TABLE_AREAS_LENGTH;
		}

}
  
