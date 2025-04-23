package com.cloudframe.app.divide0.dto;

/**
*  The class DaReportTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.divide0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class DaReportTable extends DaReportTableSerialized {
   

						private char[] daFileArea = new char[10];

								private int daSub;

								private int daSubPfx;

								private int daIx;

								private int daSubSave;

								private int daColMax;

								private int daTblMax;

								private int daHoldMax;
			private List<DaTblEntries> daTblEntries = new ArrayList<>();
    	

								private BigDecimal daPcntHold = BigDecimal.ZERO;
	
	/**
	* Constructor for DaReportTable
	**/
    public DaReportTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DA_TBL_ENTRIES_SIZE;arrayIndex++) {
						daTblEntries.add(new DaTblEntries(this, beginDaTblEntries + 
						arrayIndex * DaTblEntries.getDaTblEntriesFieldLength()));
				}
	   	/*  end of offset */
								setDaFileArea(("DA-AREA-->").toCharArray());
								setDaSub(0);
								setDaSubPfx(0);
								setDaIx(0);
								setDaSubSave(0);
								setDaColMax(50);
								setDaTblMax(150);
								setDaHoldMax(0);
    }


 

	/**
	 *	Returns the value of daFileArea
	 *	@return daFileArea
	 */
   public char[] getDaFileArea() throws CFException{
     if (isDaFileAreaModified()) { 
        daFileArea = refreshDaFileArea();
     }
   		return daFileArea;
   }

  
	/**
	*  set variable daFileArea
	*  Corresponding COBOL Variable is DA-FILE-AREA
	*  @param value
	**/
   public void setDaFileArea(char[] value) {
      daFileArea = checkDaFileAreaConstraints(value);
      serializeDaFileArea(daFileArea);
   } 

     /**
	 * 	Update DaFileArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaFileArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDaFileArea,daFileArea.length);
   	
   }
   
   public void setDaFileArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDaFileArea,daFileArea.length);
   	
   }
   
     /**
	 * 	Update DaFileArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaFileArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaFileArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DaFileArea with another Field
	 *	@param value
	 */
   public void setDaFileArea(Field source) {
       replace(source,0,source.length(),beginDaFileArea,DA_FILE_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update DaFileArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaFileArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDaFileArea,DA_FILE_AREA_LEN);
   	
   }
   
     /**
	 * 	Update DaFileArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaFileArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDaFileArea+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of daSub
	 *	@return daSub
	 */
	public int getDaSub() throws CFException {
       if (isDaSubModified()) { 
           daSub = refreshDaSub();
        }
   		return daSub;
	}
	

	
	   
	/**
	 * 	Update DaSub with the passed value
	 *  Corresponding COBOL Variable is DA-SUB
	 *	@param number
	 */
	public void setDaSub(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daSub = checkDaSubMaxLimit(number); 
		serializeDaSub(daSub);
	}
	

	public void setDaSub(long number) {
	    number = checkDaSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaSub((int)number);
	}
	
	/**
	 * 	Update DaSub with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaSub(char[] value) throws CFException {
		 daSub = serializeDaSub(value);
	}
	/**
	 * 	Update DaSub with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaSubString(char[] value) throws CFException {
		 setDaSub(value);
	}
	/**
	 *	Returns the value of daSubPfx
	 *	@return daSubPfx
	 */
	public int getDaSubPfx() throws CFException {
       if (isDaSubPfxModified()) { 
           daSubPfx = refreshDaSubPfx();
        }
   		return daSubPfx;
	}
	

	
	   
	/**
	 * 	Update DaSubPfx with the passed value
	 *  Corresponding COBOL Variable is DA-SUB-PFX
	 *	@param number
	 */
	public void setDaSubPfx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daSubPfx = checkDaSubPfxMaxLimit(number); 
		serializeDaSubPfx(daSubPfx);
	}
	

	public void setDaSubPfx(long number) {
	    number = checkDaSubPfxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaSubPfx((int)number);
	}
	
	/**
	 * 	Update DaSubPfx with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaSubPfx(char[] value) throws CFException {
		 daSubPfx = serializeDaSubPfx(value);
	}
	/**
	 * 	Update DaSubPfx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaSubPfxString(char[] value) throws CFException {
		 setDaSubPfx(value);
	}
	/**
	 *	Returns the value of daIx
	 *	@return daIx
	 */
	public int getDaIx() throws CFException {
       if (isDaIxModified()) { 
           daIx = refreshDaIx();
        }
   		return daIx;
	}
	

	
	   
	/**
	 * 	Update DaIx with the passed value
	 *  Corresponding COBOL Variable is DA-IX
	 *	@param number
	 */
	public void setDaIx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daIx = checkDaIxMaxLimit(number); 
		serializeDaIx(daIx);
	}
	

	public void setDaIx(long number) {
	    number = checkDaIxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaIx((int)number);
	}
	
	/**
	 * 	Update DaIx with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaIx(char[] value) throws CFException {
		 daIx = serializeDaIx(value);
	}
	/**
	 * 	Update DaIx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaIxString(char[] value) throws CFException {
		 setDaIx(value);
	}
	/**
	 *	Returns the value of daSubSave
	 *	@return daSubSave
	 */
	public int getDaSubSave() throws CFException {
       if (isDaSubSaveModified()) { 
           daSubSave = refreshDaSubSave();
        }
   		return daSubSave;
	}
	

	
	   
	/**
	 * 	Update DaSubSave with the passed value
	 *  Corresponding COBOL Variable is DA-SUB-SAVE
	 *	@param number
	 */
	public void setDaSubSave(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daSubSave = checkDaSubSaveMaxLimit(number); 
		serializeDaSubSave(daSubSave);
	}
	

	public void setDaSubSave(long number) {
	    number = checkDaSubSaveMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaSubSave((int)number);
	}
	
	/**
	 * 	Update DaSubSave with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaSubSave(char[] value) throws CFException {
		 daSubSave = serializeDaSubSave(value);
	}
	/**
	 * 	Update DaSubSave with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaSubSaveString(char[] value) throws CFException {
		 setDaSubSave(value);
	}
	/**
	 *	Returns the value of daColMax
	 *	@return daColMax
	 */
	public int getDaColMax() throws CFException {
       if (isDaColMaxModified()) { 
           daColMax = refreshDaColMax();
        }
   		return daColMax;
	}
	

	
	   
	/**
	 * 	Update DaColMax with the passed value
	 *  Corresponding COBOL Variable is DA-COL-MAX
	 *	@param number
	 */
	public void setDaColMax(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daColMax = checkDaColMaxMaxLimit(number); 
		serializeDaColMax(daColMax);
	}
	

	public void setDaColMax(long number) {
	    number = checkDaColMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaColMax((int)number);
	}
	
	/**
	 * 	Update DaColMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaColMax(char[] value) throws CFException {
		 daColMax = serializeDaColMax(value);
	}
	/**
	 * 	Update DaColMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaColMaxString(char[] value) throws CFException {
		 setDaColMax(value);
	}
	/**
	 *	Returns the value of daTblMax
	 *	@return daTblMax
	 */
	public int getDaTblMax() throws CFException {
       if (isDaTblMaxModified()) { 
           daTblMax = refreshDaTblMax();
        }
   		return daTblMax;
	}
	

	
	   
	/**
	 * 	Update DaTblMax with the passed value
	 *  Corresponding COBOL Variable is DA-TBL-MAX
	 *	@param number
	 */
	public void setDaTblMax(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daTblMax = checkDaTblMaxMaxLimit(number); 
		serializeDaTblMax(daTblMax);
	}
	

	public void setDaTblMax(long number) {
	    number = checkDaTblMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaTblMax((int)number);
	}
	
	/**
	 * 	Update DaTblMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaTblMax(char[] value) throws CFException {
		 daTblMax = serializeDaTblMax(value);
	}
	/**
	 * 	Update DaTblMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaTblMaxString(char[] value) throws CFException {
		 setDaTblMax(value);
	}
	/**
	 *	Returns the value of daHoldMax
	 *	@return daHoldMax
	 */
	public int getDaHoldMax() throws CFException {
       if (isDaHoldMaxModified()) { 
           daHoldMax = refreshDaHoldMax();
        }
   		return daHoldMax;
	}
	

	
	   
	/**
	 * 	Update DaHoldMax with the passed value
	 *  Corresponding COBOL Variable is DA-HOLD-MAX
	 *	@param number
	 */
	public void setDaHoldMax(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    daHoldMax = checkDaHoldMaxMaxLimit(number); 
		serializeDaHoldMax(daHoldMax);
	}
	

	public void setDaHoldMax(long number) {
	    number = checkDaHoldMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDaHoldMax((int)number);
	}
	
	/**
	 * 	Update DaHoldMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaHoldMax(char[] value) throws CFException {
		 daHoldMax = serializeDaHoldMax(value);
	}
	/**
	 * 	Update DaHoldMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaHoldMaxString(char[] value) throws CFException {
		 setDaHoldMax(value);
	}
	/**
	 *	Returns the  value of daTblEntries
	 *  Corresponding COBOL Variable is DA-TBL-ENTRIES
	 *	@return daTblEntries
	 */
   public List<DaTblEntries> getDaTblEntries() {
       return daTblEntries;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return daTblEntries
	 */
	public DaTblEntries getDaTblEntries(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDaTblEntries(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DA_TBL_ENTRIES_SIZE) {
             	index = DA_TBL_ENTRIES_SIZE -1; // can't exceed max array size
             	logger.trace("daTblEntries - Array index exceeded max Size {}, resetting it to max allowed",DA_TBL_ENTRIES_SIZE); 
	    }
		if (index >= daTblEntries.size()) {
       		for (int fillIndex =  daTblEntries.size() -1; fillIndex < index;fillIndex++) {
		       daTblEntries.add(null);
		    }
			daTblEntries.set(index,
			   	   	new DaTblEntries(this,beginDaTblEntries + index * DaTblEntries.getDaTblEntriesFieldLength()) 
				                        ); 	
		} 
   	   DaTblEntries value = daTblEntries.get(index);
   	   if (value == null) {
   	      daTblEntries.set(index,
			   	   	new DaTblEntries(this,beginDaTblEntries + index * DaTblEntries.getDaTblEntriesFieldLength()) 
				                        ); 
		  value = daTblEntries.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update DaTblEntries at index with the passed value
	 *  Corresponding COBOL Variable is DA-TBL-ENTRIES
	 *  @param index
	 *	@param value
	 */
  public void setDaTblEntries(int index,char[] value) {
   	getDaTblEntries(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of daPcntHold
	 *	@return daPcntHold
	 */
	public BigDecimal getDaPcntHold() throws CFException {
       if (isDaPcntHoldModified()) { 
           daPcntHold = refreshDaPcntHold();
        }
   		return daPcntHold;
	}
	

	
	   
	/**
	 * 	Update DaPcntHold with the passed number
	 *  Corresponding COBOL Variable is DA-PCNT-HOLD
	 *	@param number
	 */
	public void setDaPcntHold(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       daPcntHold = checkDaPcntHoldMaxLimit(number);
	    serializeDaPcntHold(daPcntHold);
   }
	/**
	 * 	Update DaPcntHold with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaPcntHold(char[] value) throws CFException {
		 daPcntHold = serializeDaPcntHold(value);
	}   

	
	
	

		public static int getDaReportTableFieldLength() {
			return DA_REPORT_TABLE_LENGTH;
		}

}
  
